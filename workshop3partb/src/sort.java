import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import  java.util.stream.Collectors;


public class sort {
    public static void main(String [ ] args) {

        List<String> topNames2017 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );


        for (int i = 0; i < topNames2017.size(); i++) {
            topNames2017.set(i, capitalize(topNames2017.get(i)));
        }


        topNames2017.sort((m1, m2) -> {
            return m1.compareTo(m2);
        });


        for (int i = 0; i < topNames2017.size(); i++) {
            System.out.println(topNames2017.get(i));
        }
        List<String> topNames20172 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        for (int i = 0; i < topNames20172.size(); i++) {
            topNames20172.set(i, capitalize(topNames20172.get(i)));
        }

        topNames20172.sort(String::compareTo);


        for (int i = 0; i < topNames20172.size(); i++) {
            System.out.println(topNames20172.get(i));
        }
        List<String> topNames20173 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        for (int i = 0; i < topNames20173.size(); i++) {
            topNames20173.set(i, capitalize(topNames20173.get(i)));
        }
        List result = topNames20173.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }


    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }


}
