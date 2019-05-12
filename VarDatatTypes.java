import java.util.*;
class VarDatatTypes  {
    public static void main(String[] args)  {

       /* int n1,n2,product;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        n1=sc.nextInt();

        System.out.println("Enter n2");
        n2=sc.nextInt();

        product = n1*n2;

        System.out.println("Product is " + product);*/

        int base, height, area;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter height : ");
        height = scan.nextInt();

        System.out.println("Enter base : ");
        base = scan.nextInt();

        area = (base*height)/2;

        System.out.println("Area of the Triangle is " + area);

    }
}
