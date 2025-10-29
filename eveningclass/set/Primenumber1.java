public class Primenumber1 
{
public static void main(String[]args)
{
int n=30;
int i;
int j;
for(i=1; i<n; i++)
{
int flag=0;
for(j=2;j<i;j++ )
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0){
Sysytem.out.println(i);
}
}
}
}