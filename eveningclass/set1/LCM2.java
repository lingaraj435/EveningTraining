public class LCM2
{
public static void main(String[]args)
{
int a=30;
int b=40;
int max;
int LCM;
if(a>b)
max=a;
else
max=b;
while(true)
{
if(max%a==0 && max%b==0)
{
LCM=max;
break;
}
max++;
}
System.out.println(LCM);
}
}