class Minimum{  

  int getSmallest(int[] array){  
    int min = array[0];  
    for (int i = 0; i < array.length; i++){
      if (min > array[i])
        min = array[i];  
      }  
    return min;       
  }  
  

  public static void main(String args[]) {
    Minimum object = new Minimum();  
    int a[] = {1,2,5,6,3,9,8,4,2,1}; 
    System.out.println("Smallest: " + object.getSmallest(a));  
  
  } 
  
}       