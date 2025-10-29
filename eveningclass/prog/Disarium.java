public class Disarium
{
    public static void main(String[] args)
    {
        int num=153;
        int temp=num;
        int length=String.valueof(num).length();
        while(temp>0)
        {
            int digit =temp%10;
            sum += Math.pow(digit,length);
            length--;
            temp /=10;

        }
        if(sum==num)
        {
        System.out.println(num +"is a Disarium number.");
        }
        else{
        System.out.println(num +"is not a Disarium number.");
        }

        
    }
}