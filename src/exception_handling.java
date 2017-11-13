class exception_handling {
        public static void main(String args[]) {
            try {
                System.out.print("A");
                throw new NullPointerException ("Hello");
            }
            catch(ArithmeticException e) {
                System.out.print("B");        	
            }
        }
    }