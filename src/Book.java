public abstract class Book {
    protected String title;
    protected String author;
    protected String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public abstract void getInfo();

    public abstract void search(String keyword);

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
class FictionBook extends Book {

    public FictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: Fiction");
    }

    @Override
    public void search(String keyword) {
        if (title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
}
class NonFictionBook extends Book {

    public NonFictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: Non-fiction");
    }

    @Override
    public void search(String keyword) {
        if (title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
}
class ScienceBook extends NonFictionBook {

    public ScienceBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Subject: Science");
    }

    @Override
    public void search(String keyword) {
        if (title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
}
class BookMain {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", "HarperCollins");
        fictionBook.getInfo();
        fictionBook.search("Tolkien");

        System.out.println();

        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "HarperCollins");
        nonFictionBook.getInfo();
        nonFictionBook.search("History");

        System.out.println();

        ScienceBook scienceBook = new ScienceBook("A Brief History of Time", "Stephen Hawking", "Bantam Books");
        scienceBook.getInfo();
        scienceBook.search("Science");
    }
}
