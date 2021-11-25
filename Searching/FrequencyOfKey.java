class FrequencyOfKey{    
      int findFrequency(int[] arr, int key){
        int count = 0;    
        for(int i=0;i<arr.length;i++)    
          if(arr[i] == key)   
            count += 1;    
                   
              
      return count;    
      }   


      public static void main(String args[]){ 
          FrequencyOfKey object = new FrequencyOfKey();   
          int[] array= {1,1,1,1,1,2,3,4,5,6};    
          int key = 1;
          int count = object.findFrequency(array, key);
          System.out.println("count = " + count);
        
        }    
}    
