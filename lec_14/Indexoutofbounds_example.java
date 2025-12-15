package lec_14;
public class Indexoutofbounds_example {
    public static void main(String[] args){
       System.out.print("Hello\n");
       try{
        int arr[]={1,2,3};
        System.out.print(arr[5]+"\n");

       }catch(Exception e){// try catch kabhi ek saath nhi chalta try run hoga exception detect hoga fir catch us exception ko accept karke print karega yni try ke baad hi catch chlega and multiple catch bhi laga skte hai 
        System.out.print(e+"\n");
       }
       System.out.print("Byeeee!!!");
    }
}
