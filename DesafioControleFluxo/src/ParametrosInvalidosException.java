
public class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;

	protected String error() {
		return "O valor do primeiro parâmetro não pode ser maior que segundo";
	}
}
