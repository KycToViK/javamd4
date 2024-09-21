import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> month = new ArrayList<>();

    HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();

    month.add(1);
    month.add(7);

    stateHolidays.put("january", month);

    month = new ArrayList<>();
    month.add(23);

    stateHolidays.put("february", month);

        month = new ArrayList<>();
        month.add(8);

        stateHolidays.put("march", month);

        month = new ArrayList<>();
        month.add(1);
        month.add(9);

        stateHolidays.put("may", month);

        month = new ArrayList<>();
        month.add(12);

        stateHolidays.put("june", month);

        month = new ArrayList<>();
        month.add(4);

        stateHolidays.put("november", month);

        System.out.println(stateHolidays);


    }
}