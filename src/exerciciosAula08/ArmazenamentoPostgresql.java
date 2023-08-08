package exercicios.designPartterns;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exercicios.exercicio7.Armazenamento;
import exercicios.exercicio7.Nodo;
import exercicios.exercicio7.Operacao;


// Implementação do armazenamento em banco de dados H2
public class ArmazenamentoPostgresql implements Armazenamento {
    private Connection connection;

    public ArmazenamentoPostgresql() {
        try {
            // Carrega o driver JDBC do H2 e cria a conexão com o banco de dados
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/curso_java", "postgres", "postgres");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarExpressao(String id, String expressao) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO public.expressoes (id, expressao) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, expressao);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarOperacao(String id, Nodo operacao) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO public.operacoes (id, operacao) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setBytes(2, converterObjectParaByte(operacao));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salvarResultado(String id, int resultado) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO public.resultados (id, resultado) VALUES (?, ?)")) {
            preparedStatement.setString(1, id);
            preparedStatement.setInt(2, resultado);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String recuperarExpressao(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT expressao FROM public.expressoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return   resultSet.getString("expressao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Operacao recuperarOperacao(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT operacao FROM public.operacoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  (Operacao) converterByteParaObject((byte[]) resultSet.getObject("operacao")); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int recuperarResultado(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT resultado FROM public.resultados WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return   resultSet.getInt("resultado"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<String> listarExpressoes() {
    	List<String> expressoes = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM public. expressoes")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
            	expressoes.add(resultSet.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return expressoes;
    	
    }
    
    private static byte[] converterObjectParaByte(Object object) {
        try {
               ByteArrayOutputStream bao = new ByteArrayOutputStream();
               ObjectOutputStream ous;
               ous = new ObjectOutputStream(bao);
               ous.writeObject(object);
               return bao.toByteArray();
        } catch (IOException e) {
               e.printStackTrace();
        }

        return null;
   }
    private static Object converterByteParaObject(byte[] objectAsByte) {
    	   try {
    	          ByteArrayInputStream bao = new ByteArrayInputStream(objectAsByte);
    	          ObjectInputStream ous;
    	          ous = new ObjectInputStream(bao);
    	          return  ous.readObject();
    	   } catch (IOException e) {
    	          e.printStackTrace();
    	   } catch (ClassNotFoundException e) {
    	          e.printStackTrace();
    	   }

    	   return null;
    	}
    
}
