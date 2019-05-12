import java.util.*;
class Ifelse {
    public static void main(String[] args) {


        int n1=0,n2=1, i=1, num=5, r;

        do{
            System.out.println( + n1 );
            r=n1+n2;
            n1=n2;
            n2=r;
            
            i++;
        }while(i<=num);

      /*  for (i=0;i<=num;i++)
        {
            System.out.println( + n1 );
            r=n1+n2;
            n1=n2;
            n2=r;
            
        }
        

      /* int num = 3, count, total=0;

       for(count=1;count<=num;count++){
           total=total+count;
       }
       System.out.println("total is" +total);

        int n1,n2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n1");
        n1 = sc.nextInt();

        System.out.println("Enter n2");
        n2 = sc.nextInt();

        System.out.println("Enter thye operator (+, -, *, /, %)");
        char ch = sc.next().charAt(0);

        sc.close();

        switch(ch)
        {
            case '+':
            System.out.println(+ n1+n2);
            break;

            case '-':
            System.out.println(+ n1-n2);
            break;

            case '*':
            System.out.println(+ n1*n2);
            break;

            case '/':
            System.out.println(+ n1/n2);
            break;

            case '%':
            System.out.println(+ n1%n2);
            break;

            default :
            System.out.println("Invalid Input");
        }

        int a=11;

        if(a % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        int a=11, b=33, c=5;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is big");
            }
            else{
                System.out.println("c is big");
            }
        }*/



    }
}