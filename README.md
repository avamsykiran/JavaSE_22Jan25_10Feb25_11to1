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
        Inheretence
        Polymorphisim
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

            Variabels of class-type are called Object.
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

            Constructors

                is a special member function that gets invoked immidiately after the allocation of an object.

                (+) the constructor must have the sme name as that of the class
                (+) the construcotrs do not return any value (even not void).

                Default Constructor         is a constructor with no-args.
                Paramatrized Constructor    is a constructor with args. 
                Copy Constructor            is a constructor with args, where one the args is an object of the owner class.

                If a class is not defiend with any constructors, a default constructor is automatically attached to it by
                the compiler.

        Inheretence

            is about creating a new class from an existing class.
            the existing class is called the super-class, and teh new class is called the sub-class.
            the fields and method of the super class are inhereted to the sub-class.

            the keyword 'extends' is used to derive a sub-class from a super-class.

            Simple Inhertence               One sub-class is dereived from one super-class
                                            
                                            Employee (empId,fullName,basicPay)  
                                                |
                                                | <------ ContractEmployee (empId,fullName,basicPay,contractDuration)  

            Hirarchial Inheretence          Two or more sub-classes are dereived from one super-class

                                            Employee (empId,fullName,basicPay)  
                                                |
                                                | <------ ContractEmployee (empId,fullName,basicPay,contractDuration)  
                                                | <------ Manager (empId,fullName,basicPay,hra)  

            Multi-Level Inheretence         A sub-class si derived from a super-class, and another sub-class is
                                            derived from that sub-class and son on...
            
                                            Employee (empId,fullName,basicPay)  
                                                |                                                
                                                | <------ Manager (empId,fullName,basicPay,hra)  
                                                            |
                                                            | <------ Director (empId,fullName,basicPay,hra,share)  

            Hybrid Inheretence              is a combination of multi-level and hirarchial./
            
                                            Employee (empId,fullName,basicPay)  
                                                |                                                
                                                | <------ ContractEmployee (empId,fullName,basicPay,contractDuration)  
                                                | <------ Manager (empId,fullName,basicPay,hra)  
                                                            |
                                                            | <------ Director (empId,fullName,basicPay,hra,share)  

            Multiple Inheretence            A sub-class is derived from two or more super-classes.
                                            Java does not support multiple inheretence on classes.
    

            Constructor Phenomenon

                A super-class constructor is invoekd when an object of a super-class is allocated.
                A super-class constructor followed by sub-class constructors are invoekd when an object of a sub-class is allocated.

                Employee 
                    | <- Manager 
                           | <- Director 

                Employee emp = new Employee();  //Employee constructor is invoked
                
                Manager mgr = new Manager(); //Employee constructor, followed by Manager constructor are invoked

                Director d = new Director(); //Employee constructor, followed by Manager constructor, 
                                             //followed by Director constructor are invoked

            A few keywords

                'this'          represents the current object for a method.

                                class Employee {
                                    //.....
                                    public String getFullName() {
                                        return this.fullName;
                                    }
                                    //....
                                }

                                Employee emp1 = new Employee(101,"Vamsy Kiran",55000);
                                Employee emp2 = new Employee(102,"Sagar",55000);
                                Employee emp3 = new Employee(103,"Pavan",55000);

                                System.out.println(emp1.getFullName());// emp1 is the current object for getFullNAme
                                System.out.println(emp2.getFullName());// emp2 is the current object for getFullNAme
                                System.out.println(emp3.getFullName());// emp3 is the current object for getFullNAme

                'this'          can also be used to invoke one construcotr from another construcotr.

                                public class Employee {

                                    private int empId;
                                    private String fullName;
                                    private double basicPay;
                                    
                                    public Employee() {
                                        System.out.println("An employee object got crweated");        
                                    }
                                    
                                    public Employee(int empId, String fullName, double basicPay) {
                                        this();
                                        this.empId = empId;
                                        this.fullName = fullName;
                                        this.basicPay = basicPay;
                                    }

                                    public Employee(Employee e) {
                                        this(e.empId,e.fullName,e.basicPay);
                                    }
                                
                                }

                'super'         is used to invoke a super class construcotr from a sub-class constructor.
                                if super keyword is not used in a sub-class constructor, the compiler will include it automatically.

            Object References and casting

                A super class reference can refer to a sub-class object.

                Employee 
                    | <- ContractEmployee 
                    | <- Manager 
                            | <- Director 

                Employee emp1 = new Employee();
                Employee emp2 = new ContractEmployee();
                Employee emp3 = new Manager();
                Employee emp4 = new Director();
            
                ContractEmployee cemp = (ContractEmployee) emp2;
                Manager mgr = (Manager) emp3;

                ContractEmployee cemp2 = (ContractEmployee) emp3; //this will raise ClassCastException

            Default Super Class

                java.lang.Object    is a built-in class which is the default super class for any java class either directly or indirectly.
                                    if a class is not extending any other class, it is made to extend java.lang.Object at the compile time.
                                    if a class is extending another class, that super class extends java.lang.Object.

                                    java.lang.Object
                                                |<- Employee 
                                                        | <- ContractEmployee 
                                                        | <- Manager 
                                                            | <- Director 

                                    Three important methods, must be always overriden in all the java classes
                                        int hashcode()
                                        boolean equals(Object)
                                        String toString()

        Polymorphisim

            is the ability to have more than one method with the same name.

            Overloading
                two or more methods of the same class or of a hirarchy of classes, have the saem name but differ in
                parameters types or parameter count or parameter order, then those methods are said to be overloaded.

                class Animal {
                    public void eat(Apple apple){
                        while(apple.exists()){
                            byteAndChewAndSwallow(apple);
                        }
                    }

                    public void eat(IceCream iceCream){
                        while(iceCream.exists()){
                            lickAndSwallow(iceCream);
                        }
                    }
                }

                class Cow extends Animal {
                    public void eat(Grass grass){
                        while(grass.exists()){
                            chewAndSwallow(grass);
                        }
                    }
                }

                class Tiger extends Animal {
                    public void eat(Meat meat){
                        while(meat.exists()){
                            tearAndChewAndSwallow(meat);
                        }
                    }
                }

            Overriding

                two or more methods from a super and a sub class, have the same name and same parameters list, then they are said to overridden

                class Human extends Animal {
                    @Override
                    public void eat(Apple apple){
                        wash(apple);
                        Pieces[] pieces = cut(apple);
                        for(Piece p : pieces) {
                            chewAndSwallow(p);
                        }
                    }   
                }