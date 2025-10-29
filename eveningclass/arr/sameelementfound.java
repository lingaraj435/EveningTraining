public class sameelementfound {
    public static void main (String []args)
    {
        int arr[]={10,20,30,40,50,20,30};
        int key=20;
        int count=0;
        int length=arr.length;
        for(int i=0;i<length;i++){
            if(key==arr[i]){
                count++;
            }

        }
        System.out.println("my value" +key+ "occurs" + count+ "time appears");
    }
    
}
