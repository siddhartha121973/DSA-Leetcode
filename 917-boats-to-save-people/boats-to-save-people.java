import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            // Pair the lightest with the heaviest if possible
            if (people[i] + people[j] <= limit) {
                i++;
            }

            // The heaviest person always boards
            j--;
            boats++;
        }

        return boats;
    }
}