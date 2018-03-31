package example20180331;

public class Book {
	String title, author;
	public void setInfo(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author) {
		this.setInfo(title, author);
	}
	public static void main(String[] args) {
		Book ab1 = new Book("Great Java", "Bob");
		System.out.println("title : " + ab1.title);
		System.out.println("author : " + ab1.author);
	}

}
