public class Sort{
  public static String name(){
    return "10.Wong.Wilson";
  }
  
  public static void swap(int[] data, int a, int b){
    int c = data[a];
    data[a] = data[b];
    data[b] = c;
  }
  
  public static void selectionSort(int[] data){
    int end = data.length;
    for(int start = 0; start < end; start + 1){
      
