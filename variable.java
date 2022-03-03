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
