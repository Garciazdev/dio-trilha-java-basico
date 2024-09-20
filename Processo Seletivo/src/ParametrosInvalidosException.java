public class ParametrosInvalidosException extends Exception {
    
    // Construtor padrão
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos fornecidos.");
    }
    
    // Construtor que aceita uma mensagem personalizada
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}