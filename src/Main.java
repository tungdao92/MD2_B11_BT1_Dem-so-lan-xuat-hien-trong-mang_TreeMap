import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();
        String [] arr = input.toLowerCase().split(" ");
        for (int i = 0; i <arr.length; i++) {
            if (treeMap.containsKey(arr[i])){
//                int value = treeMap.get(arr[i]);
//                treeMap.remove(arr[i]);
//                treeMap.put(arr[i], value +1 );
                treeMap.put(arr[i], treeMap.get(arr[i] + 1) );
            }else {
                treeMap.put(arr[i],1 );
            }
        }
        System.out.println("So lan xuat hien trong chuoi la : " + treeMap);


    }
}
