class Exception_demo{
    public static void main(String[] args) {
    
    
    
        //Arithmatic exception
    try{
    int a = 30,b=0;
    int c = a/b; //cannot divide by zero
    System.out.println("Result = "+c);
    } catch(ArithmeticException e) {
    System.out.println("can't divide a number by zero");
    }
    
    
    // ArrayIndexOutOfBound exception
    try{
    int a[] = new int[5];
    a[6]=9; //accessing 7th element in an array of size 5
    }
    catch(ArrayIndexOutOfBoundsException A){
    System.out.println("Array index is out of bound");
    }
    
    
    //Nullpointer exception
    try{
    String a = null;
    System.out.println(a.charAt(0));
    }
    catch(NullPointerException n){
    System.out.println("NullPointerException...");
    }
    
    
    //NumberFormat exception
    try{
    int num = Integer.parseInt("akki");
    System.out.println(num);
    }
    catch(NumberFormatException p){
    System.out.println("Number format exception");
    }
    }
    