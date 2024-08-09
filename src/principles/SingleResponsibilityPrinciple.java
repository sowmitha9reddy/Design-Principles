package principles;
///class Book {
//    private String title;
//    private double price;
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//                                                                                   Before SRP
//    public double calculateDiscountedPrice(double discountPercentage) {
//        return price - (price * discountPercentage / 100);
//    }
//

//    public void printBookDetails() {
//        System.out.println("Title: " + title);
//        System.out.println("Price: " + price);
//    }
//}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
   
}

class BookCalculator {
    
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() - (book.getPrice() * discountPercentage / 100);
    }
   
}

class BookPrinter {
    
    public void printBookDetails(Book book) {                                       //after SRP
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
    }
}




public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
        Book book = new Book("Core Java", 50.0);
       BookCalculator calculator = new BookCalculator();
        BookPrinter printer = new BookPrinter();

        double discountedPrice = calculator.calculateDiscountedPrice(book, 10); 
        printer.printBookDetails(book);
        System.out.println("Price of the book After Discount: " + discountedPrice);
    }
}
