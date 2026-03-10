import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

     
    public static Map<Character, String[]> createPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

     
    public static void printBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }
            System.out.println();
        }
    }

     
    public static void main(String[] args) {

        Map<Character, String[]> patterns = createPatterns();

        printBanner("OOPS", patterns);
    }
}