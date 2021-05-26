import java.util.HashMap;
import java.util.Map;

class Problem14 {
  //2 arrays given, if common element exist then return true else false
  //input arr1 = ['a','f','e','k']
  //      arr2 = ['g','e','l']
  public static void main(String[] args) {
    int[] arr1 = {'a','f','e','k'};
    int[] arr2 = {'g','p','k'};

    long t1 = System.nanoTime();
    System.out.println(function1(arr1,arr2));
    long t2 = System.nanoTime();

    System.out.println(function2(arr1,arr2));
    long t3 = System.nanoTime();
    System.out.println("Fun1 time " +(t2-t1));
    System.out.println("Fun2 time " +(t3-t2));
    
  }

  //naive or brutforce method = O(n*n)
  static boolean function1(int[] arr1, int[] arr2){
    for(int i = 0; i < arr1.length; i++){
      for(int j = 0; j < arr2.length; j++){
        if(arr1[i] == arr2[j]){
          return true;
        }
      }
    }
    return false;
  }

  //time optimised approach = O(n)
  //space complexity = O(n)
  static boolean function2(int[] arr1, int[] arr2){
    Map map = new HashMap<>();
    //looping thru first array
    for(int i = 0; i < arr1.length; i++){
      if(map.get(arr1[i]) == null){
          map.put(arr1[i], true);
      }
    }
    //looping thru second array to find common element
    for(int j = 0; j < arr2.length; j++){
        if(map.get(arr2[j]) != null){
            return true;
        }
    }
    return false;
  }


}
