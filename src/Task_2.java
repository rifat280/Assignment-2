public class Task_2 {
    public static void main(String[] args){
        Book book1 = new Book("JAVA for Beginners 3rd edition","By Prof. David",299,537,"Easy Coding Publications","3rd");
        book1.showInfo();

        Book book2 = new Book("Omega Point 12th edition","By Humayun Ahmed",128,122,"Shomoy Prokashoni","12th");
        book2.showInfo();

        Book book3 = new Book("Digital Fortress 5th edition","By Dan Brown",520,356,"St. Martin Press","5th");
        book3.showInfo();

        System.out.println("Memory Address of Book 1 :" +book1.hashCode());
        System.out.println("Memory Address of Book 2 :" +book2.hashCode());
        System.out.println("Memory Address of Book 3 :" +book3.hashCode());

        book1 = book3;

        book1.edition = "1";

        book1.showInfo();

        System.out.println("Memory Address of Book 1 :" +book1.hashCode());
        System.out.println("Memory Address of Book 2 :" +book2.hashCode());
        System.out.println("Memory Address of Book 3 :" +book3.hashCode());

    }
}
