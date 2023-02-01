package exceptions.books;

public class TitleException extends Exception {
	private String titolo;
	public TitleException(String titolo) {
		super("Titolo non valido!");
		this.titolo = titolo;
	}
	public String getTitle() {
		return this.titolo;
	}
	
}
