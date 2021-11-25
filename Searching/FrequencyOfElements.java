import java.util.*;
class FrequencyOfElements{    
    boolean checkForDuplication(int[] arr){
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < arr.length; i++)
        list.add(arr[i]);
      HashSet<Integer> setValues = new HashSet<Integer>(list);
      if(setValues.size()< arr.length)
        return false;

      return true;
      }

    public static void main(String args[]){ 
      FrequencyOfElements object = new FrequencyOfElements();   
      int[] array= {10,20,30,50,70,90};    
      boolean bool = object.checkForDuplication(array);
      if (bool)
        System.out.println("All the elements in the array are distinct");
      else
        System.out.println("Array has duplicate elements"); 
    }    
        
}    
