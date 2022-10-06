import java.util.Scanner;
public class StoreTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Book list[] = new Book[499];
        list[0] = new Book("106-564984","Java Programming ",new Person("Digital", "Electronics", "pearson@gamil.com"), 1000, 10);



    }

    static int revenue;

    public static void printList(Book list[]){
        for(int i=0; i< list.length; i++){
            if(list[i]!= null)
                System.out.println(list[i]);
        }

}




}