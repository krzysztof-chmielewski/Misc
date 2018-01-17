package some;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LeaderboardResult> rows = Arrays.asList(
                new LeaderboardResult("Liverpool F.C.", 1, 0, 1, 2, 0),
                new LeaderboardResult("Manchester United F.C.", 0, 1, 1, 2, 2));

        System.out.println(rows);


    }
}
