package org.example;
import java.util.List;

public class Streamz {
    public int getResult(List<Integer> values) {
        int result =0;
        for (int value : values) {
            if (value > 3 && value % 2 == 0) {
              result += value;
              break;
            }

        }

     return result * 2;
    }


}
