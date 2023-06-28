package aula3oo;

//Classe abstrata que define a abstração de um veículo
abstract class Veiculo {
 protected String marca;
 protected String modelo;
 
 public abstract void acelerar();
 public abstract void frear();
}

//Classe concreta que herda a abstração de Veiculo
class Carro extends Veiculo {
 public Carro(String marca, String modelo) {
     this.marca = marca;
     this.modelo = modelo;
 }
 
 public void acelerar() {
     System.out.println("O carro acelerou.");
 }
 
 public void frear() {
     System.out.println("O carro freou.");
 }
}

//Exemplo de uso da abstração
public class ExemploAbstracao {
 public static void main(String[] args) {
     Carro carro = new Carro("Toyota", "Corolla");
     carro.acelerar();
     carro.frear();
 }
}
