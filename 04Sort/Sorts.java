public class Sorts{

  public static String name(){
    return "10.Wong.Wilson";
  }
  
  public static void swap(int[] data, int a, int b){
    int c = data[a];
    data[a] = data[b];
    data[b] = c;
  }
  
  public static void selectionSort(int[] data){
    int var = 0;
    for(int start = 0; start < data.length; start ++){
      var = data[start];
      for(int i = data.indexOf(start); i < data.length; i++){
        if(var < data[i]){
          
      }
    }
  }
  
  public static void insertionSort(int[] data){
    int var = 0;
    for(int start = 1; start < data.length; start ++){
      var = data[start];
      
    }
  }
  
  public static void bubbleSort(int[] data){
    
  }
  
  

}

