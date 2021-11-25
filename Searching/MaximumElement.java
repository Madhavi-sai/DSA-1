class MaximumElement{  

  int getLargest(int[] array){  
    int max = array[0];  
    for (int i = 0; i < array.length; i++){
      if (max < array[i])
        max = array[i];  
      }  
    return max;       
  }  
  

  public static void main(String args[]) {
    MaximumElement object = new MaximumElement();  
    int a[] = {1,2,5,6,3,9,8,4,2,1}; 
    System.out.println("Largest: " + object.getLargest(a));  
  
  } 
  
}       