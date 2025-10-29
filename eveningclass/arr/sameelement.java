public class sameelement {
    public static void main (String []args)
    {
        int arr1[]={10,20,30,40,50};
        int arr2[]={60,70,30,90,100};
        int length1=arr1.length;
        int length2=arr2.length;
        boolean found=false;
        for(int i=0;i<length1;i++)
        {
            for(int j=0;j<length2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                break;
            }
        }
        if(found)
        {
            System.out.println("Same element found");
        }
        else
        {
            System.out.println("No same element found");
        }
    }

    
}
