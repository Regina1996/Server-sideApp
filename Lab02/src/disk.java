import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class disk {
    private static List<composition> company; // disc

    public static void main(String[] args) {
        company = new ArrayList<>(); // disc
        fillCompany(company);

        // сортировка по длине трека
        Comparator<composition> compositionComparator = (o1, o2) -> Integer.compare(o2.getTime(), o1.getTime()) * (-1);

        // сортировка по типу самолета
        /*Comparator<Airline> airlineComparator1 = new Comparator<Airline>() {
            @Override
            public int compare(Airline o1, Airline o2) {
                //return (o2.getType()).compareTo(o1.getType());
                if ((o2.getType() == AirlineType.CARGO) && (o1.getType() == AirlineType.PASSENGER)) {
                    return -1;
                } else if ((o1.getType() == AirlineType.CARGO) && (o2.getType() == AirlineType.PASSENGER)) {
                    return 1;
                } else if ((o1.getType() == AirlineType.CARGO) && (o2.getType() == AirlineType.CARGO)) {
                    return 0;
                } else {
                    return 0;
                }
            }
        };*/

        Collections.shuffle(company);
        for (composition al : company) {
            System.out.println(al);
        }
        Collections.sort(company, compositionComparator);
        System.out.println();
        for (composition al : company) {
            System.out.println(al);
        }

        /*Collections.sort(company, airlineComparator1);
        System.out.println();
        for (Airline al : company) {
            System.out.println(al);
        }*/


    }




    private void fillCompany(int time){
        for (composition composition:company){
            if(composition.getTime() >= time)
                System.out.println(time);
        }
}

        }




