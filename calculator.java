/**
 * The "calc" class performs basic arithmetic operations and calculates the area of a triangle and
 * rectangle.
 */
class calculator{
    public static void main(String[] args)
    {
        calculator cal = new  calculator();
        double n1=20,n2=10,result;
        String op="+";
        switch(op)
        {
            case"+":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"-":result=n1-n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"*":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"/":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
        }
         
    }
}

 