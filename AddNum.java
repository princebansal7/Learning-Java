
// Taking Command line arguments

class AddNum {
    public static void main(String []args){

        // parseInt()  => converts numeric string to int & belongs to Wrapper class Integer
        //  & are Static methods that's why gets called using Class name 
        // parseShort()  => converts numeric string to short & belongs to Wrapper class Short
        //  & are Static methods that's why gets called using Class name
        // parseByte()  => converts numeric string to byte & belongs to Wrapper class Byte
        //  & are Static methods that's why gets called using Class name
        // parseFloat() => converts numeric string to float & belongs to Wrapper class Float
        //  & are Static methods that's why gets called using Class name
        // parseDouble() => converts numeric string to double & belongs to Wrapper class Double
        //  & are Static methods that's why gets called using Class name

        // genetates NumberFormatException in case of wrong argument

        // parseCharater => Does not Exists


        // Array index cross => ArrayIndexOutOfBound Exception

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum  = x+y;
        
        // concatenates because, String + _ => concate
        // concatenates because, - + String => concate
        // concatenates because, String + String => concate

        System.out.println("Sum is "+x+y);
        System.out.println( x+y +" Sum is"); 

        System.out.println("Sum is "+(x+y)); 
        System.out.println("Sum is "+ sum);
        
        System.out.println("Multiplication is "+ x*y); // x*y have high priority => gets solved first then, concatenates
    }
}

// At Runtime if Java doesn't resolve the error or something it's called Exception