package exceptions.books;

public class Book {

	private String title;
	private String author;
	private String editor;
	private int pages;
	
	public Book(String title, String author, String editor, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
