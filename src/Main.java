import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] booksList =new Book[3];
        for(int i=0;i<booksList.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter book information:");
            String name=scanner.nextLine();
            String author=scanner.nextLine();
            int price=scanner.nextInt();
            int quantity=scanner.nextInt();
            booksList[i]=new Book(name,price,quantity,author);
        }
        for(Book i:booksList){
            System.out.println(i);
        }
        System.out.println(totalPrice(booksList));

    }
    public static double totalPrice(Book[] booksArray){
        double total=0;
        for(int i=0;i<booksArray.length;i++){
            total+=booksArray[i].getPrice()* booksArray[i].getQuantity();
        }
        return total;
    }
}

