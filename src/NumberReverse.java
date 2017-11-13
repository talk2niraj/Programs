public class NumberReverse {
 
    public int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
     
    public int recursivReverseNumber(int number){
        if (number < 10) {
        	return number;
        }
        int val = recursivReverseNumber(number/10);
        System.out.println(val);
        return val;
    }
    
    
    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.recursivReverseNumber(17868));
    }
}