

public class majroty {
    public static void main(String args[]){
        int arr[]={4,4,3,4,7,3,4,4,7,4,4,7,4,4};
        int n=arr.length;
        int canditate=arr[0],count=1;
     for(int i=0;i<n;i++)   {
        if(arr[i]==canditate){
            count++;
        }
        else{
            count--;
        }
        if(canditate==0){
            canditate=arr[i];
            count=1;
        }
     }
     count=0;
     for(int var:arr){
        if(var==canditate){
            count++;
        }
     }
     if(count>n/2){
        System.out.println(canditate);
     }
     else{
        System.out.println("no");
     }

    }
}
