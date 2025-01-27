Java SE
-------------------------

    Objectives
    ------------------
        1.  Introduction to Java
        2.  OOP
        3.  Exceptions
        4.  Collections and Generics
        5.  Lambda Expressions and Streams API
        6.  Date/Time API
        7.  I/O and File I/O (NIO.2)
        9.  Multi-Threading - Concurrency, Parallelism, 
        10. The JDBC API
        11. Localization
 
    Introduction to Java
    --------------------------

        History and Language Evolution - SE/ME/EE - JDK | JRE | JVM - 1.1,1.2--1.5--1.8--11--17--19--21
        
        Features - Simple, Robust, Distributed, Multi-Threaded, Platform Independent, Secure and Arch., Neutral
        
        Characteristics - 
            Case Sensitive, ';' for statement termination, {} for a code-block, compiler based language, 
            High Lanaguage, Partially but strictly Object Oriented

        Tokens and Naming Conventions

            a token is an indivisable part of the code.

            Human Language / Natural Language = {Voccabulary , Grammer }

            Computer Prog.. Language = { Tokens, Syntax }

            Itendifiers
                is a name given to any resource like variable, constants, object, class, method ....etc.,

                Rules
                    1. can not start with a number
                    2. can not match with a keyword
                    3. can not contain spaces or any other special chars except an underscore (_)
                    4. can be alpha-numeric

                Java Naming Conventions
                    1. Names of varaibles and methods in jave shall start and continue in lowercase and follow inital-caps from
                        the second word onwards. (camelCase)

                        width
                        roomWidth
                        roomWidthInCentimeters

                        display()
                        displayData()

                    2. Names of user defined data types like classes, enums., interfaces ..etc., must follow init-caps.

                        String
                        NullPointerException
                        ArrayIndexOutOfBoundsException

                    4. Names of constants must be all capitals and use '_' to seperate words.

                        PI
                        MIN_VAL
                        MAX_VAL

            Keywords
                is a reserved word for a specific task. In java all keywords are expected to be lower in case.

            Operators
                is mostly a symbol or a simple word that represent an opeeration.

                Binary
                    Arithmetic      +   -   *   /   %
                    Assignemnt      =   +=  -=  *=  /=  %=
                    Relational      ==  <   >   <=  >=  !=
                    Logical         &&  ||  !

                Unary
                                    - (unary minus)     a = -9;     b = -a;
                                    -- (decriment)
                                    ++ (incriment)

                Ternary             cond ? true_exp : false_exp;
                                    int g = a>b ? a : b;

                Bitwise             &   |   ~   ^   <<  >>
                
                Misc                . (period operator / membership operator)
                                    [ ]
                                    ( )
                                    { }
                                    ;
                                    imstamce of

            Comments
                    
                    is used to decribe a resource a pice of code. 
                    comments are ignored by the compiler

                    End-Of-Line     //End of lien comments goes

                    Block-Level     /*
                                        Block Level Comment
                                    */

            Literals

                    is any hard-coded value in our code.

                    class App {
                        public static void main(String arg[]){
                            int radius = 90;
                            double c = 2 * 3.14 * radius;
                        }
                    }

                    Identifiers     App, main, arg, String, radius, c, 
                    Keywords        class, public, static, void, int, double
                    Operators       {   }   (   )   [   ]   =   ;   *   .
                    Comments
                    Literals        90  2   3.14

                    Java Supports
                        Decimal Number System Integer Literals
                            a combiantion any digits from 0 to 9 , we can use '_' to seperate place values
                            
                            11  20  40  90  17  1024  1_024     11_09_345

                        Octal Number System Integer Literals
                            a combiantion any digits from 0 to 7 and shall be prefixed with 0
                            00  01  07  017

                        HexaDecimal Number System Integer Literals
                            a combiantion any digits from 0 to 9,A,B,C,D,E,F and shall be prefixed with 0x
                            0x0     0x17    oxA4

                        Floating Point Literals     3.14

                        Character Literals          '9' '@' 'A'

                        String Literals             "Hello this is a string literal"

                        Boolean Literals            true, false

                        Reference Type Lierals      null

        Data Types

            Primitive Data Types
                Numeric
                    NonFractional
                        byte
                        short
                        int
                        long
                    Fractional
                        float
                        double
                Non Numeric
                        char
                        boolean
                        void

            User Defined Data Types
        
                classes
                interfaces
                enums
                annotations

        Control Structures

            Decision Making / Branching Control Strucutres
                if(cond) {

                }

                if(cond){

                }else{

                }

                if(cond){

                }else if(cond2){

                }else{

                }

                swtich(expr){
                    case val1: break;
                    case val2: break;
                    case val3: break;
                    default:
                }

            Iterative Control Structures / Loops

                do{

                }while(cond);

                while(cond) {

                }

                for(init;cond;inc/dec){

                }

                for(var : collectionOrArray){

                }

                String names[] = new String[] {"Vamsy","Alka","Shreya","Sonu"};

                for(int i=0;i<names.length;i++){
                    System.out.println(names[i]);
                }
                
                for(String name:names){
                    System.out.println(name);
                }
            
            Non Conditional Control Structures

                continue            is used to skip an iteration and continue with the next iteration

                    //to print number of factors of only even elements of this array
                    int nums = new int[] {1,2,3,4,5,6,7,8,9};

                    for(int n:nums){
                        if(n%2!=0){
                            continue;
                        }
                        int factorsCount=2;
                        for(int i=2;i<n/2;i++){
                            if(n%i==0){
                                factorsCount++;
                            }
                        })
                        System.out.println(n +" has "+factorsCount+" factors");
                    }

                break               is used to break or stop the entire loop

                    //search for a name "Alka" in an array of names
                    String names[] = new String[] {"Vamsy","Alka","Shreya","Sonu"};

                    for(String name:names){
                        if("Alka".equals(name)){
                            System.out.println("It's found");
                            break; //once found so need to continue searchign , hence stop the loop
                        }
                    }

                return              is used to return the control from a fucntion to its caller function.

    Object Oriented Programming Concepts (Oop's)
    --------------------------------------------------

        OOP fills the gap between the programming world and the real world.

        Class & Object
        Encapsulation
        Polymorphisim
        Inheretence
        Abstraction

        Class & Object

            A class is a user defiend data type. 
            It has the properties of an domain object as variables called fields.
            It has the behaviours of an domain object as functions called method.

            class HumanBeing {
                
                //fields
                String name;
                double height;
                double weight;

                //methods
                void printDetails(){
                    //...
                }
            }

            Varaibles of class-type are called Object.
            Every object is dynamically allocated using 'new' keyword.
            Every object is a reference type.

            HumanBeing h1,h2; //decalred the objects, but they are not yet allocated in the memory

            h1 = new HumanBeing(); //memory is allocated to h1
            h2 = new HumanBeing(); //memory is allocated to h2

            HumanBeing h3 = new HumanBeing(); //both decalration and allocation are happenoing in the same statement.
            
        Encapsulation

            is the process of providing indirect access or access restriction on fields or methods of a class.

            Encapsulation in java is achinved through access specifiers and setter-getter methods.

            Access Specfiers 
                Default         no-keyword  fields or methods are accessable only by the owner class 
                                            and any other class of the same package

                Private         private     fields or methods are accessable only by the owner class 

                Protected       protected   fields or methods are accessable only by the owner class 
                                            and the sub-classes of the owner class

                Public          public      fields or methods are accessable anywhee through out the application.

            Setters & Getters

                Setter is a public method that can write value into a field
                Getter is a public method that can read value of a field

                These setters and getters will allow us to control the visibility of a field as
                    Wrtie-only Fields       field is made private and only setter is defined
                    Read-only Fields        field is made private and only getter is defined
                    Read-Write Fields       field is made private and both setter and getter are defined

                class Student {

                    private String name;
                    private double mathScore;
                    private double computersScore;
                    private double totalScore;

                    public void setName(String name){
                        this.name=name;
                    }

                    public String getName(){
                        return this.name;
                    }

                    public void setMathScore(double mathScore){
                        this.mathScore=mathScore;
                        this.totalScroe = this.mathScore+this.computerScore;
                    }

                    public double getMathScore(){
                        return this.mathScore;
                    }

                    public void setComputerScore(double computerScore){
                        this.computerScore=computerScore;
                        this.totalScore = this.mathScore+this.computerScore;
                    }

                    public double getMathScore(){
                        return this.computerScore;
                    }

                    public double getTotalScore(){
                        return this.totalScore;
                    }
                }

    