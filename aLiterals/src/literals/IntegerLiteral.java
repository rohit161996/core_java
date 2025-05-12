package literals;

class IntegerLiteral{
    public static void main(String []s){
        
    	int a = 104;//Decimal Integer Literal
        int b = 0150;//Octal Integer Literal
        int c = 0x68;//Hexa Integer Literal
        
        //int c=0X68;//allowed
        int d = 0b1101000;//Binary Integer Literal
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);  

        System.out.println(5_47_24_168); 
        System.out.println(5_______47_24_168); //allowed
        //System.out.println(_5_47_24_168_); //error

        System.out.println(0x5a2); //1442
        System.out.println(0534); //348
        System.out.println(0b10110101); //181
    }
}
