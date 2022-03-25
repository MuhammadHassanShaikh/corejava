class variable
{
    static int a=30;//Static variable
    int b=20;//Instance variable
    public static void main(String[] args)
    {
        int c=10;//Local variable
        variable ref=new variable();
        System.out.println(variable.a);
        System.out.println(ref.b);
        System.out.println(c);    
    }
}
class A
{
    static int a=10;//static variable
    int b=20;//instance variable
    public static void main(String[] args)
    {
        int c=30;//local variable
        A ref=new A();
        System.out.println(A.a);
        System.out.println(ref.b);   
        System.out.println(c);
    }
}

//****************CONTAINER WIDGET PART 2
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('hassan'),
        ),
        body: Center(
          child: Container(
            child: Text(
              'hello',
              style: TextStyle(fontSize: 30),
            ),
            // color: Colors.orange,
            height: 200,
            width: 200,
            alignment: Alignment.center,
            //padding: EdgeInsets.only(top: 20, bottom: 20),
            // padding: EdgeInsets.symmetric(vertical: 20, horizontal: 20),
            // margin: EdgeInsets.all(30),
            // constraints: BoxConstraints(maxHeight: 100, maxWidth: 150),
            // transform: Matrix4.rotationZ(25.0),
            // transform: Matrix4.skewX(3.0)..rotateZ(20.0),
            decoration: BoxDecoration(
              color: Colors.orange,
              // border: Border.all(
              //   color: Colors.black,
              //   width: 3,
              //   style: BorderStyle.solid,
              // )
              border: Border(
                top: BorderSide(color: Colors.black, width: 2),
                bottom: BorderSide(color: Colors.black, width: 4),
                left: BorderSide(color: Colors.black, width: 4),
                right: BorderSide(color: Colors.black, width: 4),
              )
            ),
          ),
        ),
      ),
    ),
  );
}
















# only-programing

                                    // 1 HELO WORLD 
class onlyprogram
{
    public static void main(String[] args)
    {
        System.out.print("Hello world");
    }
}



                                    // 2 ODD and EVEN PROGRAM
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        if(n%2==0)
        {
            System.out.print("Even no");
        }
        else
        {
            System.out.print("Odd no");
        }
    }
}



                                            // 3 ADD TWO NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter two no");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        sum= a + b;
        System.out.print("Addition " + sum);    
    }
}



                                        // 4 NATURAL NO PRINT PROGRAM
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i + " ");
        }
    }
}



                                    // 5 SUM OF FIRST NATURAL NOo
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.print("Enter no of terms");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }   
        System.out.print("ADDITION " +sum); 
    }
}



                                    // 6 PRINT ALL ODD NO 1 TO N
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter no of terms");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i=i+2)
        {
            System.out.print(i + " ");
        }    
    }
}



                                // 7 PRINT ALL EVEN NO 0 TO N
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter no of terms");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=0;i<=n;i=i+2)
        {
            System.out.print(i + " ");
        }    
    }
}



                                // 8 CALCULATE SUM OF ODD OR EVEN NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,i,sum=0;
        System.out.print("Enter Range");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
            for(i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.print("Sum of even no "+ sum)
        }
        else
        {
            for(i=1;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.print("Sum of odd no "+ sum);
        }
    }
}



                                    // 9 HOW TO TAKE INPUT FROM USER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter Value");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        System.out.print(a);    
    }
}



                                    // 10  ADD TWO NO ( WITHOUT USER INPUT )
class A
{
    public static void main(String[] args)
    {
        int a=10,b=20;
        System.out.print("Sum= "+(a+b));    
    }
}


                                    // 11 CHARACTER INPUT  ( FROM USER )
class A
{
    public static void main(String[] args)
    {
        char ch;
        System.out.print("Enter Character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.print(ch);    
    }
}



                                    //  12 CHECK CHARACTER VOWEL OR CONSTANT
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        char ch;
        System.out.print("Enter any Character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Constant");
        }
    }
}



                                        // 13  PRINT ASCII VALUE OF A CHARACTER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        char ch;
        System.out.print("Enter any Character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        int a = ch;
        System.out.print("ASCII VALUE " +ch+ "is" +a);
    }
}



                                    // 14  PRINT A TO Z ALPHABATE
class A
{
    public static void main(String[] args)
    {
        for(char i='A'; i<=Z; i++)
        {
            System.out.print(i+" ");
        }    
    }
}



                                    // 15  FIND GREATEST NO BETWEEN TWO NO
impoty java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter two no");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        if(a>b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }
}



                                    // 16  CALCULATE POWER OF A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,p,result=1;
        System.out.print("Enter No");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.print("Enter Power");
        p=r.nextInt();
        for()
        {
            result=n*result;
        }
        System.out.print("Power "+result);
    }
}



                                        //  17  FIND GREATEST OF THREE NO
class A
{
    public static void main(String[] args)
    {
        int a=10,b=20,30;
        if(a>b)
        {
            if(a>c)
            {
                System.out.print(a);
            }
            else
            {
                System.out.print(c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.print(b);
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}



                                        //  18  TOTAL AND AVG MARKS OF FIVE SUBJECS
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        System.out.print("Enter marks of five subjects");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();   
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();
        int sum=a+b+c+d+e;
        System.out.print("Total Marks "+ sum);
        double avg=sum/5.0;
        System.out,print("Avarage Marks "+ avg);
    }
}



                                        //  19  FIND FACTORIAL OF A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,fact=1;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial "+ fact);
    }
}



                                        //  20  COUNT DIGITS IN A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,count=0;
        System.out.print("Enter any no");
        Scanne r=new Scanner(System.in);
        n=r.nextInt();
        while(n>=0)
        {
            n=n/10;
            count++;
        }
        System.out.print("No of digits "+ count);
    }
}



                                        //  21  CHECK VOTING ELIGIBLITY
import java.util.Scanne;
class A
{
    public static void main(String[] args)
    {
        int age;
        System.out.print("Enter your age");
        Scanne r=new Scanne(System.in);
        age=r.nextInt();
        if(age>=18)
        {
            System.out.print("Eligible for vote");
        }
        else
        {
            System.out.print("Not Eligible for vote");
        }
    }
}



                                        //  22  PRINT MULTIPLICATION TABLE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter any no");
        Scanner r=new Scanne(System.in);
        num=r.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(num+"*"+i+"="+num*i);
        }
    }
}



                                        //  23  TAX CALCULATION PROGRAM
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int sal; double tax;
        System.out.print("Enter any salary");
        Scanner r=new Scanner(System.in);
        sal=r.nextInt();
        if(sal<=10000)
        {
            System.out.print(sal +"No Tax");
        }
        else if(sal>10000 && sal<=100000)
        {
            tax=sal*0.10;
            System.out.print(sal+" "+tax);
        }
        else
        {
            tax=sal*0.20;
            System.out.print(sal+" "+tax);
        }
    }
}



                                        //  24  MAKE CALCULATOR PROGRAM
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n1,n2,ch;
        System.out.print("Enter Two No");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.print("Select Operation");
        ch=r.nextInt();
        if(ch==1)
        {
            cal=n1+n2;
            System.out.print("Addition "+cal);
        }
        else if(ch==2)
        {
            cal=n1-n2;
            System.out.print("Subtraction "+cal);
        }
        else if(ch==3)
        {
            cal=n1*n2;
            System.out.print("Multiplication "+cal);
        }
        else if(ch==4)
        {
            cal=n1/n2;
            System.out.print("Division "+cal);
        }
        else
        {
            cal=n1%n2;
            System.out.print("Remainder "+cal);
        }
    }
}



                                        //  25  AREA OF RACTANGLE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int l,b,area;
        System.out.print("Enter value for Sides");
        Scanner r=new Scanner(System.in);
        l=r.nextInt();
        b=r.nextInt();
        area=l*b;
        System.out.print("Area of Ractangle " +area);    
    }
}



                                        //  26  CALCULATE AREA OF CIRCLE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        final double PI=3.14;
        int r;
        System.out.print("Enter Radius of Circle");
        Scanner obj=new Scanner(System.in);\
        r=obj.nextInt();
        area=PI*r*r;
        System.out.print("Area of Circle "+ area);
    }
}



                                //  27  CALCULATE AREA OF SQUARE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int side,area;
        System.out.print("Enter side Square");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();
        area=side*side;
        System.out.print("Area of Square "+area);
    }
}



                                        //  28  CALCULATE AREA OF TRAINGLE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a,b,c,sp; double area;
        System.out.print("Enter value for sides of Traingle");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt((sp-a)*(sp-b)*(sp-c));
        System.out.print("Area of Traingle "+ area);
    }
}



                                        //  29  SWAP TWO NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        a,b,temp;
        System.out.print("Enter two no");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.print("Before Swaping "+ a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.print("After Swapping "+ a+" "+b);
    }
}



                                        //  30  SWAP TWO NO ( WITHOUT USING THIRD VARIABLE )
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter any Two no");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.print("Before Swaping "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After Swapping "+a+" "+b);
    }
}



                                //  31  CONVERT CHARACTE UPPERCASE TO LOWER CASE AND VICE - VERSA
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        char ch,ch2;
        System.out.print("Enter any Character");
        Scanner r=new Scanner(System.in);
        ch=r.next.charAt(0);
        if(ch>='A' && ch<='Z')
            {
                ch2=Character.toLowerCase(ch);
                System.out.print("Lower Case " +ch2);
            }
            else
            {
                ch2=Character.toUpperCase(ch);
                System.out.print("Upper Case " +ch2);
            }
    }
}



                                        //  32  CHECK NO IS POSITIVE OR NEGATIVE
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n>0)
        {
            System.out.print("+ ve");
        }
        else if(n<0)
        {
            System.out.print("- ve");
        }
        else
        {
            System.out.Radius("Neither Positive or Negative");
        }
    }
}


                                        //  33  LEAP YEAR PROGRAM
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int y;
        System.out.print("Enter any Year");
        Scanner r=new Scanner(System.in);
        y=r.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.print("Leap Year")
        }
        else
        {
            System.out.print("Not Leap Year");
        }
    }
}



                                        //  34  CHECK NO IS DIVISIBLE BY 5 
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%5==0)
        {
            System.out.print("Divisible by 5");

        }
        else
        {
            System.out.print("Not Divisible by 5");
        }
    }
}



                                    //  35  ENTER CODE OF DAY AND PRINT NAME
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter code of day");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        switch (n)
        {
            case 0: System.out.print("Sunday");
            break;
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thrusday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Satarday");
            break;
            default:System.out.print("Invalid code");
            break;
        }
    }
}



                                        //  36  FIND FACTOR OF A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n% i==0)
            {
                System.out.print(i+"<")
            }
        }
    }
}



                                        //  37  INPUT MONTH NO & PRINT NO OF DAYS
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter Month no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n==1)
        {
            System.out.print("Jan = 31 Days");
        }
        else if(n==2)
        {
            System.out.print("Fab = 28 Days");
        }
        else if(n==3)
        {
            System.out.print("March  = 31 ");
        }
        if(n==4)
        {
            System.out.print("April = 30 Days");
        }
        if(n==5)
        {
            System.out.print("May = 31 Days");
        }
        if(n==6)
        {
            System.out.print("Jun = 30 Days");
        }
        if(n==7)
        {
            System.out.print("July = 31 Days");
        }
        if(n==8)
        {
            System.out.print("Aug = 31 Days");
        }
        if(n==9)
        {
            System.out.print("Sep = 30 Days");
        }
        if(n==10)
        {
            System.out.print("Oct = 31 Days");
        }
        if(n==11)
        {
            System.out.print("Nov = 30 Days");
        }
        if(n==12)
        {
            System.out.print("Dec = 31 Days");
        }
        else
        {
            System.out.print("Invalid Month No");
        }
    }
}



                                            //  38  REVERSE A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,r;
        System.out.print("Enter any no");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }    
    }
}



                                        //  39  FIND SUM OF DIGITS
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,r,sum=0;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum*r;
            n=n/10;
        }
        System.out.print("Sum of digits "+sum); 
    }
}



                                        //  40  NO IS PALINDROME OR NOT 
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,s=0,c,r;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.print("Palindrome no");
        }
        else
        {
            System.out.print("Not Palindrome no");
        }
    }
}



                                        //  41  CHECK NO IS ARMSTRONG OR NOT
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,arm=0,rem,c;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.print("Armstrong no");
        }
        else
        {
            System.out.print("Not Armstrong no");
        }
    }
}



                                    //  42  FIND SQUARE ROOT OF A NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        double m=Math.sqrt(n);
        System.out.print("SQuare root of "+n+" is "+m);
    }
}



                                    //  43  CHECK NO IS PRIME OR NOT
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,count=0;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        System.out.print("Prime no");
        else
        System.out.print("Not prime no");
    }
}



                                        //  44  CHECK WEATHER A NO IS PERFECT OR NOT 
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.print("Perfect no");
        }
        else
        {
            System.out.print("Not perfect no");
        }
    }
}



                                        //  45  PRINT ALL PRIME NO BETWEEN TWO NO
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int n1,n2,i,j;
        System.out.print("Enter two no");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        for(i=n1; i<=n2; i++)
        {
            for(j=2; j<=i; j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j+" ");
        }    
    }
}

+92223408132



                                        //  46 PRINT ARRAY ELEMENTS    
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[3];
        a[0]=10;    
        a[2]=20;
        a[2]=30;
        for(int b : a)
        {
            System.out.print(b+" ");
        }
    }
}



                                        //  47  PRINT ARRAY ELEMENT USING ARRAY CLASS
import java.util.Arrays;
class A
{
    public static void main(String[] args)
    {
        String a[]={"Learn","Coding","Keypoints","Education"};
        System.out.println("toString() "+ Arrays.toString(a));
        System.out.println("asList() "+Arrays.aslist(a));
        int arr[][]{{10,20},{30,40}};
        System.out.println("deeptoString () "+Arrays.deepToString(arr));
    }
}



                                            //  48  FIND LENGHT OF ARRAY
import.java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[3];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array elements");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }   
        System.out.print("Array Elements");
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a[i]+" ");
        } 
        System.out.print("\n Array Lenght "+ a.lenght);
    }
}



                                            //  49  PRINT ARRAY ELEMENTS IN REVERSE ORDER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System..out.print("Enter Elements in array");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements");
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n Array REVERSE Element");
        for(int i=a.lenght-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}



                                                //  50  COPY ALL ELEMENTS OF ONE ARRAY TO ANOTHER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value in first array");
        for(int i=0; i<5;i++)
        {
            a[i]=r.nextInt();
        }    
        System.out.print("First array Element");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n Second array Element");
        for(i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}



                                        //  51  ADD ARRAY ELEMENT & SUM OF ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in array");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Element");
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.print("\n Addition of Array Element "+sum);
    }
}



                                                //  52  SEARCH AN ELEMENT IN ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int n,count=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Element in array");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Element");
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("Enter Search an Element");
        n=r.nextInt();
        for(int i=0; i<a.lenght; i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        System.out.print("Item Found" +count+ "Times");
        else
        System.out.print("Item Not Found");
    }
}



                                                //  53  FIND AVG OF AN ARRAY ELEMENTS
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int sum=0; double avg;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array elements");
        for(int i=0; i<5; i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<5; i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.print("\n Addition "+sum+"\n average "+avg);
    }
}



                                                //  54  ARRANGE ARRAY ELEMENTS IN ASCENDING ORDER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int temp;
        System.out.print("Enter elements in array");
        for(int i=0; i<5; i++)
        {
            a[i]=r.nextInt();
        }   
        for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[i]=temp;
                }
            }
        } 
        for(int i=0; i<5; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}



                                                    //  55   ARRANGE ARRAY ELEMENTS IN DESCENDING ORDER
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int temp;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value in array");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }   
        for(int i=0; i<a.lenght; i++)
        {
            for(int j=i+1; j<a.lenght; j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j]
                    a[j]=temp;
                }
            }
        } 
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a[i]);
        }
    }
}



                                                    //  56  ARRAY METHODS SORT() ,EQUAL() ,COPY()
import java.util.Scanner;
import java.util.Arrays;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter data in array");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }
        int a2[]=Arrays.copyOf(a,6);
        a2[5]=100;
        System.out.print("Data in array2 ");
        for(int i=0; i<a.lenght; i++)
        {
            System.out.print(a2[i]+" ");
        }
    }
}



                                                //  57  ARRAY COMPARISION== VS EQUALS()
import java.util.Arrays;
class A
{
    public static void main(String[] args)
    {
        int a[]={10,20,3,40,50}; 
        int b[]={10,20,30,40,50};
        if(Arrays.equals(a,b))
        {
            System.out.print("Both are Equal");
        }  
        else{
            System.out.print("Both are not equal");
        }
    }
}



                                                 //  58  FIND BIGGEST ELEMENT IN ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int max;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array Elements");
        for(int i=0; i<5; i++)
        {
            a[i]=r.nextInt();
        } 
        max=a[0];
        for(int i=1; i<5; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("Maximum Element "+max);
    }
}



                                                //  59  FIND SMALLEST ELEMENT IN ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; int min;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array Element");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }    
        min=a[0];
        for(int i=1; i<a.lenght; i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print("Smallest Element "+min);
    }
}



                                                //  60  INSERT ELEMENT IN ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array size");
        size=r.nextInt();
        int a[]=new int[size+1];
        System.out.print("Enter array elements");
        for(int i=0; i<a.lenght; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter array Location");
        loc=r.nextInt();
        System.out.print("Enter new item");
        item=r.nextInt();
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for(i=0;i<a.lenght;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}



                                                //  61  DELETE ARRAY ELEMENT
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
            int size.loc,i;
            Scanner r=new Scanner(System.in);
            System.out.print("Enter Array Size");
            size=r.nextInt();
            int a[]=new int[size];
            System.out.print("Enter array Elements");
            for(i=0;i<size;i++)
            {
                a[i]=r.nextInt();
            }
            System.out.print("Enter array location");
            loc=r.nextInt();
            for(i=loc;i<size-1;i++)
            {
                a[i]=a[i+1];
            }
            size--;
            for(i=0;i<size;i++)
            {
                System.out.print(a[i]+" ");
            }
    }
}


                                                        //  62  STAR PATTERN PROGRAM
class A
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}



                                                        //  63  STAR PATTERN LOGIC PROGRAM
class A
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {   
                System.out.print("*");
            }
            System.out.print("\n");
        }    
    }
}



                                                        //   63  PART (2)  STAR PATTERN LOGIC PROGRAM
class A
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }    
    }
}



                                                        //  64  PRINT STAR PATTERN
class A
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=3;i++)
        {
            for(j=3;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}



                                                            //  65  PRINT NO PATTERN
class A
{
    public static void main(String[] args)
    {
        int i,j,count=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }   
    }
}



                                                            //  66  CHARACTER PATTERN PROGRAM
class A
{
    public static void main(String[] args)
    {
        char i,j;
        for(i=65;i<=67;i++)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }    
    }
}



                                                            //  66 PART(2)  CHARACTER PATTERN PROGRAM
class A
{
    public static void main(String[] args)
    {
        char i,j,count=65;
        for(i=65;i<=69;i++)
        {
            for(i=65;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }    
    }
}



                                                            //  67  DIAMOND PATTERN PROGRAM
class A
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");

            for(i=5;i>=i;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }    
    }
}



                                                                //  68  PRINT HALF DIAMOND PATTERN
class A
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print();
        }    

        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.print();
        }    
    }
}




                                                            //  69  PRINT FABONACCI SERIES
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int term,a=0,b=1,c;
        System.out.print("Enter Term");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {   
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;
        }    
    }
}



                                                            //  70  PRINT TRIBONACCI SERIES
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a=0,b=1;c=2,d,term;
        System.out.print("Enter Term");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.Remainder(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }    
    }
}



                                                            //  71  PRINT MATRIX USING 2D ARRAY
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array Element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Matrix: \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(a[i][j]+" ");
            }
        }
        System.out.print("\n");
 
    }
}



                                                        //  72  ADDITION OF TWO MATRIX
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter first matrix data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][i]=r.nextInt();
            }
        }    
        System.out.print("Enter Second matrix data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][i]=r.nextInt();
            }
        }
        System.out.print("Firts Matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][i]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Second Matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][i]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Sum of two Matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][i]+" ");
            }
            System.out.print("\n");
        }
    }
}



                                                        //  73  PRINT TRANSOSE MATRIX
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Data \n");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Array Matrix \n");   
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }  

        System.out.print("Transpose Matrix \n");   
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(a[j][j]+" ");
            }
            System.out.print("\n");
        }    
    }
}



                                                //  74  PRINT MIRROR MATRIX
import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array data");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                a[i][j]=r.nextInt();
            }
        }

        System.out.print("Array Matrix: \n");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }

        System.out.print("Mirror Matrix: \n");
        for(int i=0;i<=1;i++)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}



                                                               //  75  STATIC VS NON STATIC METHOD
class A
{
    public static void main(String[] args)
    {
        int a=10;
        static int b=20;
        public static void main(String[] args)
        {
            A r=new A();
            r.Disp();
            A.Show;

        }   
        static void Show()
        {
            System.out.print(a+" "+b);
        } 
        void Disp()
        {
            System.out.print(a+" "+b);
        }
    }
}



                                                                //  75  PART(2) STATIC VS NON STATIC METHOD
class A
{
    public static void main(String[] args)
    {
        int a=10;
        static int b=20;
        public static void main(String[] args)
        {
            A r=new A();
            r.Disp();
            A.Show;

        }   
        static void Show()
        {
            System.out.print("Show() "+b);
        } 
        void Disp()
        {
            System.out.print("Disp() "+a+" "+b);
        }
    }
}



                                                                //  76  HOW TO USE METHOD IN JAVA
import java.util.Scanner;
class A
{
    int n1,n2;
    public static void main(String[] args)
    {
        Fun ref=new Fun();
        ref.input();
        ref.process();
        ref.output();
    }
    void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter two no: ");
        n1=r.nextInt();
        n2=r.nextInt();
    }
    void process()
    {
        add=n1+n2;
        sub=n1-n2;
        multi=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void output()
    {
        System.out.println("add of two no"+add);
        System.out.println("sub of two no"+sub);
        System.out.println("multi of two no"+multi);
        System.out.println("div of two no"+div);
        System.out.println("rem of two no"+rem);
    }
}



                                                                //  77  FIND FACTORIAL USING RECURSION
import java.util.Scanner;
class A
{
    public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter any no");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        A obj=new A();
        int result =obj.fact(n);
        System.out.print("Factorial of given no"+result);
        int fact(int n)
        {
            if(n==1)
            return 1;
            else
            return  n*fact(n-1);
        }
        int fact(int n)
        {
            if(n==1)
            return 1;
            else
            return  n*fact(n-1);
        }    
        int fact(int n)
        {
            if(n==1)
            return 1;
            else
            return  n*fact(n-1);
        }
    }
}



                                                                    //  78 COMPARE TWO STRING
class A
{
    public static void main(String[] args)
    {
        String a="Loin";
        String b="Tiger";
        if(a==b)
        {
            System.out.print("True");
        }
        else()
        {
            subjects.out.print("False");
        }

    }
}



                                                                    //  78  PART 2 COMPARE TWO STRING
class A
{
    public static void main(String[] args)
    {
        String a="Loin";
        String b=new String"Tiger";
        if(a==b)
        {
            System.out.print("True");
        }
        else()
        {
            subjects.out.print("False");
        }

    }
}



                                                                    //  78  PART 3 COMPARE TWO STRING
class A
{
    public static void main(String[] args)
    {
        String a="Loin";
        String b=new String("Tiger");
        if(a.equals(b))
        {
            System.out.print("True");
        }
        else()
        {
            subjects.out.print("False");
        }

    }
}



                                                                    //  78  PART 4 COMPARE TWO STRING
class A
{
    public static void main(String[] args)
    {
        String a=new String("Loin");
        String b=new String("Tiger"); //or"Loin"
        if(a.equals(b))
        {
            System.out.print("True");
        }
        else()
        {
            subjects.out.print("False");
        }

    }
}



                                                                    //  79  STRING METHOD IN JAVA
class A
{
    public static void main(String[] args)
    {
        String a="abc";
        String b="xyz";
        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());    
        System.out.println(b.concat(a));
        System.out.println(b.lenght());
        String c="      Hassan      ";
        String d="";//"learn";
        System.out.println(c.trim());//or only c no trim write
        System.out.println(d.isEmpty());
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('k'));
        System.out.println(b.equals(a));
        System.out.println(d.replace('r','e'));// 'r','e' kam jab karaiga jab string d main learn likha hoga abhi wo comment main hai
    }
}



                                                                  //  80 PART 1  REVERSE A STRING WITH STRING BUFFER & STRING BUILDER CLASS IN JAVA
class A
{
    public static void main(String[] args)
    {
        StringBuffer r=new StringBuffer("Leran Coding");
        System.out.println(r.revese());
        
        StringBuilder r=new StringBuilder("Java Coding");
        System.out.println(ref.reverse());
    }
}



                                                                 //  80 PART 2  REVERSE A STRING WITH STRING BUFFER & STRING BUILDER CLASS IN JAVA
class A
{
    public static void main(String[] args)
    {
        int l,i;
        String r="Learn Coding";
        String r2="a";
        l=r.lenght();
        for(i=l-1;i>=0;i--)
        {
            r=r2+r.charAt(i);
        }
        System.out.println(r2);
    }
}



                                                                 //  81  CONSTRUCTOR OVERLOADING IN JAVA
class A
{
        int a; double b; String c;
        A()
        {
            a=100; b=45.32; c="Hassan";
        }
        A(int x)
        {
            a=x;
        }
        A(double y, String z)
        {
            b=y; c=z;
        }
}
class B
{
    public static void main(String[] args)
    {
        A r=new A();
        A r2=new A(10);
        A r3=new A(23.89,"Ankush");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);    
    }
}



                                                                  //  81 PART 2 CONSTRUCTOR OVERLOADING
class A
{
    int a; double c; String c;
    private A()
    {
        a=1050; b=4.32; c="Hassan";
    }
    A(int x)
    {
        a=x;
    }
    A(double y, String z)
    {
        b=y; c=z;
    }
    public static void main(String[] args)
    {
        A r=new A();
        A r2=new A(10);
        A r3=new A(23.89,"Ankush");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);    
    }
}



                                                                    // PART 1  82  ABSTRACT CLASS
abstract class animal
{
    public abstract void sound();
}
class Dog extend animal
{
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class Loin extend animal
{
    public void sound()
    {
        System.out.println("Loin is Roar");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        Loin l=new Loin();
        d.sound(); l.sound();    
    }
}



                                                                    // PART 2  82  ABSTRACT CLASS
abstract class animal
{
    animal()
    {
        System.out.println("All animal");
    }
    public abstract void sound();
}
class Dog extend animal
{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class Loin extend animal
{
    Loin()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Loin is Roar");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        Loin l=new Loin();
        d.sound(); l.sound();    
    }
}



                                                                    // 83  WHY INTERFACE VARIABLES ARE PUBLIC STATIC AND FINAL NI JAVA
interface  customreRaj
{
    int amt=5;
    void purchase();//public + abstract
}
class sellarSanju implements customreRaj
{
    @override
    public void purchase()
    {
        //amt=5 final
        System.out.println("Raj need "+amt+" kg rice");
    }
}
class check
{
    public static void main(String[] args)
    {
        customreRaj c=new sellarSanju();
        c.purchase();
        System.out.println(customreRaj.amt);//static    
    }
}



                                                                    //  84  INTERFACE METHOD IN JAVA
interface Client
{
    void webdesign();
    void webdevelop();
}
abstract class RajTech implements Client
{
    @override
    public void webdesign()
    {
        System.out.println("Green, TopMenu, Three dot button");
    }
}
class RahulTech extend RajTech
{
    @override
    public void webdevelop()
    {
        System.out.println("HTML, CSS,JAVASCRIPT");
    }
}
class check
{
    public static void main(String[] args)
    {
        RahulTech r=new RahulTech();
        r.webdesign();
        r.webdevelop();    
    }
}



                                                                    //  85  EXTENDING INTERFACES
interface Gill
{
    void add
}
interface Raj extends Gill
{
    void sub();
}
class Ankit implements Raj
{
    @override
    public void add
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addition "+c);
    }
    @override
    public void sub
    {
        int a=10,b=20,c;
        c=a-b;
        System.out.println("Subtraction "+c);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Raj r=new Ankit();
        r.add(); r.sub();    
    }
}



                                                                    //  86  THROW AND THROWS
class A
{
    void div(int a,int b) throws AirthmeticException
    {
        if(b==0)
        {
            throw new AirthmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)
    {
        test t=new test();
        try
        {
            t.div(20,0); 
        }
        catch(Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}



                                                                    //  87  TRY-CATCH VS THROWS
class A
{
    public static void wait() throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args)throws InterruptedException
    {
        try
        {
            wait();
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("main method ended");
    }
}



//  88  USER DEFINED EXCEPTION
class InvalidAgeException extends Exception
{
    InvalidAgeException
    {
        System.out.println(msg);
    }
}
class Test
{
    public static void main(String[] args)
    {
        try
        {
            vote(20);
        }
        catch(Exception e)
        {
            System.out.println(e)
        } 
    }
    public static void main(String[] args) throws InvalidAgeException
    {
        if(age<18)
        {
            throws new InvalidAgeException("Not Eligible for Voting");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }
}



//  89  DISPLAY THE FILE INFORMATION
import java.io.File;
class A
{
    public static void main(String[] args)
    {
        File f=new File("C:\\User\\lenovo\\Desktop\\LC.txt");
        if(f.exists())
        {
            System.out.println("File Name "+f.getName());
            System.out.println("File Location "+f.getAbsolutePath());
            System.out.println("File Writeable "+f.canwrite());
            System.out.println("File Readable "+f.canRead());
            System.out.println("File Size "+f.lenght());
            System.out.println("File Removed "+f.delete());
        }
        else
        {
            System.out.println("File doesn't Exists");
        } 
    }
}



                                                                    //  90  WRITE INTO A FILE
import java.io.*;
class A
{   
    public static void main(String[] args)
    {
        try
        {
            FileWriter f=new FileWriter("C:\\User\\lenove\\Desktop\\LC.txt");
            try
            {
                System.out.println("Java programing is the best language...!");
            }
            finally
            {
                f.close();
            }
            System.out.println("Sucessfully data write in file");
        }    
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}



                                                                    //  91 PART 1  READ A TEXT FROM FILE
import java.io.*;
class A
{
    public static void main(String[] args)
    {
        try
        {
            FileReader r=new FileReader("C:\\Users\\lenovo\\Deskto\\LC.txt");
            try
            {
                int i;
                while((i=r.read()!=-1))
                {
                    System.out.println((char)i);
                }
            }
            finally
            {
                r.close();
            }
        }    
        catch(IOException e)
        {
            System.out.println("Exception Handled...!");
        }
    }
}



                                                                    //  91 PART 2 READ A TEXT FROM FILE
import java.io.*;
class A
{
    public static void main(String[] args) 
    {
        FileReader r=new FileReader("C:\\Users\\lenoo\\Desktop\\LC.txt");
        int i;
        while((i=r.read())!=-1)
        {
            System.out.println((char)i);
        }    
        r.close();
    }
}



                                                                    //  92  TO RENAME A FILE
import java.io.File;
class A
{
    public static void main(String[] args)
    {
        File f=new File("C:\\Users\\lenove\\Desktop\\Hassan.txt");
        File f=new File("C:\\Users\\lenove\\Desktop\\Rafay.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("File doesn't exist");
        }
    }
}



                                                                    //  93  PART 1  COPY CONTENT FROM ONE FILE TO ANOTHER FILE
import java.io.FileInputStream;// OR import java.io.*;
class A
{
    public static void main(String[] args)
    {
        FileInputStream r=new FileInputStream("C:\\Users\\lenovo\\Desktop\\Hassan.txt");
        FileInputStream r=new FileInputStream("C:\\Users\\lenovo\\Desktop\\Rafay.txt");
        int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }  
        System.out.println("Data Copied Succesfully");
    }
}

    
    
    
 /***************************************************************DART*************************************************************************/
void main() {
  var obj = B();
  obj.display();
}

abstract class A {
  int x = 10;
  void display();

  void disp() {
    print(x);
  }
}

class B extends A {
  void display() {
    print('abstract class');
    print(x);
  }
}

    
    
    
    
    
    
    
    
****************************************************************************FLUTTER DART****************************************************************
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('hassan'),
        ),
        body: Center(child: Text('hello')),
        // floatingActionButton: FloatingActionButton(child: Icon(Icons.add), onPressed: (){},),
        bottomNavigationBar: BottomNavigationBar(items: [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: 'Home'),
          BottomNavigationBarItem(icon: Icon(Icons.add_chart), label: 'Chart')
        ],),
        backgroundColor: Colors.grey,
        drawer: Drawer(child: Text('text')),
      ),
    ),
  );
}
    
    
import 'package:flutter/material.dart';

void main()
{
  runApp
  (
    MaterialApp
    (
      debugShowCheckedModeBanner: false,
      home: Scaffold
      (
        appBar: AppBar
        (
          title: Text('hassan'),
        ),
        body: Center(child: Text('hello')),
        floatingActionButton: FloatingActionButton(child: Icon(Icons.add), 
        onPressed: (){},),
        bottomNavigationBar: BottomNavigationBar(items: [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: 'home'),
          BottomNavigationBarItem(icon: Icon(Icons.add_a_photo), label: 'Photo'),
        ]),
        backgroundColor: Colors.blueGrey,
        drawer: Drawer(child: Text('drawer')),
      ),
    ),
  );
}




//****************CONTAINER WIDGET PART 2
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('hassan'),
        ),
        body: Center(
          child: Container(
            child: Text(
              'hello',
              style: TextStyle(fontSize: 30),
            ),
            // color: Colors.orange,
            height: 200,
            width: 200,
            alignment: Alignment.center,
            //padding: EdgeInsets.only(top: 20, bottom: 20),
            // padding: EdgeInsets.symmetric(vertical: 20, horizontal: 20),
            // margin: EdgeInsets.all(30),
            // constraints: BoxConstraints(maxHeight: 100, maxWidth: 150),
            // transform: Matrix4.rotationZ(25.0),
            // transform: Matrix4.skewX(3.0)..rotateZ(20.0),
            decoration: BoxDecoration(
              color: Colors.orange,
              // border: Border.all(
              //   color: Colors.black,
              //   width: 3,
              //   style: BorderStyle.solid,
              // )
              border: Border(
                top: BorderSide(color: Colors.black, width: 2),
                bottom: BorderSide(color: Colors.black, width: 4),
                left: BorderSide(color: Colors.black, width: 4),
                right: BorderSide(color: Colors.black, width: 4),
              )
            ),
          ),
        ),
      ),
    ),
  );
}



//****************CONTAINER WIDGET PART 1
// import 'package:flutter/material.dart';

// void main() {
//   runApp(
//     MaterialApp(
//       home: Scaffold(
//         appBar: AppBar(
//           title: Text('hassan'),
//         ),
//         body: Center(
//           child: Container(
//             child: Text(
//               'hello',
//               style: TextStyle(fontSize: 30),
//             ),
//             color: Colors.orange,
//             // height: 200,
//             // width: 200,
//             alignment: Alignment.center,
//             //padding: EdgeInsets.only(top: 20, bottom: 20),
//             // padding: EdgeInsets.symmetric(vertical: 20, horizontal: 20),
//             // margin: EdgeInsets.all(30),
//             constraints: BoxConstraints(maxHeight: 100, maxWidth: 150),
//             // transform: Matrix4.rotationZ(25.0),
//             transform: Matrix4.skewX(3.0)..rotateZ(20.0),
//           ),
//         ),
//       ),
//     ),
//   );
// }

    
    
 //****************CONTAINER WIDGET PART 2
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('hassan'),
        ),
        body: Center(
          child: Container(
            child: Text(
              'hello',
              style: TextStyle(fontSize: 30),
            ),
            // color: Colors.orange,
            height: 200,
            width: 200,
            alignment: Alignment.center,
            //padding: EdgeInsets.only(top: 20, bottom: 20),
            // padding: EdgeInsets.symmetric(vertical: 20, horizontal: 20),
            // margin: EdgeInsets.all(30),
            // constraints: BoxConstraints(maxHeight: 100, maxWidth: 150),
            // transform: Matrix4.rotationZ(25.0),
            // transform: Matrix4.skewX(3.0)..rotateZ(20.0),
            decoration: BoxDecoration(
              color: Colors.orange,
              border: Border.all(
                color: Colors.black,
                width: 3,
                style: BorderStyle.solid,
              ),
              // borderRadius: BorderRadius.all(Radius.circular(30.0)),
                //  borderRadius: BorderRadius.only(
                //    topLeft: Radius.circular(25),
                //    bottomLeft: Radius.circular(25),
                //  ),
              // border: Border(
              //   top: BorderSide(color: Colors.black, width: 2),
              //   bottom: BorderSide(color: Colors.black, width: 4),
              //   left: BorderSide(color: Colors.black, width: 4),
              //   right: BorderSide(color: Colors.black, width: 4),
              // )
                  // boxShadow: [
                  //   BoxShadow(blurRadius: 50.0, color: Colors.grey,
                  //   spreadRadius: 20.0,
                  //   offset: Offset(5.0, 5.0)
                  //   )
                  // ]
                  // shape: BoxShape.circle,
                  gradient: LinearGradient
                  (begin: Alignment.centerRight, end: Alignment.centerLeft,
                  colors: [Colors.yellow, Colors.green, Colors.pink] 
                  )
            ),
          ),
        ),
      ),
    ),
  );
}

    
//****************************************************************************SCAFFOLD***********************************    
import 'package:flutter/material.dart';

void main() {
  runApp(
    MyApp3(),
  );
}

class MyApp3 extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return MyApp3State();
  }
}

class MyApp3State extends State<MyApp3> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
          appBar: AppBar(
            title: Text('Hassan'),
          ),
          body: Center(child: Text('Hello')),
          floatingActionButton: FloatingActionButton(
            child: Icon(Icons.add),
            onPressed: () {},
          ),
          bottomNavigationBar: BottomNavigationBar(
            items: [
              BottomNavigationBarItem(icon: Icon(Icons.home), label: 'home'),
              BottomNavigationBarItem(icon: Icon(Icons.add_chart), label: 'chart'),
            ],
          ),
          backgroundColor: Colors.grey,
          drawer: Drawer(
            child: Text('Hassan'),
          )),
    );
  }
}

    
/*******************************************************************CARD*****************************************************************************/
    import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(
      appBar: AppBar(
        title: Text('hassan'),
      )
      body: Container(
        width: 200,
        height: 200,
        child: Card(
          color: Colors.blue,
          shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(50.0)),
          elevation: 25.0,
          margin: EdgeInsets.all(25),
          shadowColor: Colors.red,
        ),
      ),
    )
  ),);
}

    
//*****************************************************************CARD************************************/
    // import 'package:flutter/material.dart';

// void main() {
//   runApp(MaterialApp(
//     debugShowCheckedModeBanner: false,
//     home: Scaffold(
//       appBar: AppBar(
//         title: Text('hassan'),
//       )
//       body: Container(
//         width: 200,
//         height: 200,
//         child: Card(
//           color: Colors.blue,
//           shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(50.0)),
//           elevation: 25.0,
//           margin: EdgeInsets.all(25),
//           shadowColor: Colors.red,
//         ),
//       ),
//     )
//   ),);
// }

********************************************************APPBAR*****************************************************************
    import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          actions: [Icon(Icons.more_vert)],
        ),
        body: Center(
        child: Container(
          child: Text('hassan'),
          color: Colors.orange,
          padding: EdgeInsets.all(25),
        ),          
        ),
      ),
    ),
  );
}
