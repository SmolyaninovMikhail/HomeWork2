import org.json.simple.JSONObject;


public class HomeWork2SQL {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("select * from students where ");

        JSONObject obj = new JSONObject();
        obj.put("name", "Ivanov");
        obj.put("country", "Russia");
        obj.put("city", "Moscow");
        obj.put("age", "null");
        obj.keySet().forEach(keyStr ->
        {
            Object keyvalue = obj.get(keyStr);

            if (keyvalue != "null") {
                sb.append(keyStr + "=" + keyvalue);
                sb.append(" and ");
            }

        });

        sb.replace(sb.length() - 4, sb.length() , "");
        System.out.println(sb.toString());

    }

}


import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации вывести в консоль.

public class HomeWork2BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 3, 1 }; 
        int n = array.length; 

        
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j < (n - i); j++) {
                
                if (array[j - 1] > array[j]) {
                    
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            // выводим промежуточный результат после каждой итерации
            System.out.format("Iteration %d: %s%n", i+1, Arrays.toString(array));
        }
    }
}
