public class secondlargenumofarr
{
public static void main(String[] args) {
    int arr[]={10,20,30,40,50,60,70,80,100};
    int large=-1;
    int secondlarge=-1;
    int length=arr.length;
    for(int i=0;i<length;i++){
        if(arr[i]>large){
            secondlarge=large;
            large=arr[i];

        }
        else if(arr[i]>secondlarge && arr[i]!=large)
        {
            secondlarge=arr[i];

        }
    }
    System.out.println(secondlarge);

}
}