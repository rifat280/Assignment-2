public class Book {
    String title;
    String author;

    double price;
    int numberOfPages;

    String publication;
    String edition;

    public Book(String title, String author, double price, int numberOfPages, String publication, String edition){
        this.title = title;
        this.author = author;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.publication = publication;
        this.edition = edition;
    }

    void showInfo(){
        System.out.println("Title: " +this.title);
        System.out.println("Author: " +this.author);
        System.out.println("Price: " +this.price);
        System.out.println("Number Of Pages: " +this.numberOfPages);
        System.out.println("Publication: " +this.publication);
        System.out.println("Edition: " +this.edition);
    }

}
