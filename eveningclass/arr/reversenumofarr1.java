public class reversenumofarr1 {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        int length=arr1.length;
        int[] arr2=new int[length];
        int j=0;
        for(int i=length-1;i>=0;i--)
        {
            arr2[j]=arr1[i];
            j++;
        }
        for(int i=0;i<length;i++) 
        {
            System.out.println(arr2[i]);
        }
            
        }
        
       }
    

