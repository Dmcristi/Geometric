Write a superclass called Shape, which contains:

 - two fields 

     -color:String 

     -filled:boolean.

 - two constructors: 

    -a no-arg (no-argument) constructor that initializes the color to "green" and filled to true

    -a constructor that initializes the color and filled to the given values.

 - getters and setters for all the fields.

 - Override the toString() method to return a String similar to "A Shape with color of xxx and filled/not filled".

- Write a test class (ShapeTest) to test all the methods defined in Shape.



Write two subclasses of Shape called Circle and Rectangle as it follows:

 - Circle class contains:

    -a field called radius:double.

    - three constructors as shown:

        - a no-arg constructor initializes the radius to 1.0.

        - a constructor that initializes only the radius field

        - a constructor that initializes the radius, color and filled fields.

 - getters and setters for all the fields.

 - methods getArea():double and getPerimeter():double.

 - override the toString() method inherited, to return "A Circle with radius=xxx, which is a subclass of yyy", 

    where yyy is the output of the toString() method from the superclass.

 -Rectangle class contains:

    -two fields:

        -width:double 

        -length:double

    -three constructors as shown. 

        -a no-arg constructor which initializes the width and length to 1.0.

        -a constructor that initializes the width and lenght fields.

        -a constructor that initializes the width, length, color and filled fields.

    -getters and setters for all the fields.

    -methods getArea():double and getPerimeter():double.

    -override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.



Write a class called Square, as a subclass of Rectangle.

Square has no instance variable, but inherits the instance variables width and length from its superclass Rectangle.

    -Provide the constructors with the following signatures:

        -Square()

        -Square(side:double)

        -Square(side:double, color:String, filled:boolean)

    -implement the methods: 

        -getSide():double

        -setSide(side:double):void

    -override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.

    -do you need to override the getArea() and getPerimeter() methods? 

If you override the methods please leave comments in the methods why you chose to override them,

otherwise leave a comment in class why they shouldn't be overriden.

    -override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.
