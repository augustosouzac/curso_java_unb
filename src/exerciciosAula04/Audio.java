package exerciciosAula04;

public class Audio implements FormatoAudio {

	@Override
	public String abrir(String arquivo) {

		return arquivo;
	}

	@Override
	public String reproduzir() {
		return "Reproduzindo...";

	}

	@Override
	public String pausar() {
		return "Pausando...";

	}

	@Override
	public String parar() {
		return "Parando...";

	}

}
