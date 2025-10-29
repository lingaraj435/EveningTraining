public class searchelement {
    public static void main(String []args)

    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int key=30;
        int flag=0;
        for(int i=0;i<length;i++){
            if(key==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    
}
