import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Sample bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Additional test cases

        // Unsorted input
        String[] test1 = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(test1);
        System.out.println("Unsorted Input Sorted: " + Arrays.toString(test1));

        // Already sorted
        String[] test2 = {"AC Chair", "First Class", "General"};
        Arrays.sort(test2);
        System.out.println("Already Sorted: " + Arrays.toString(test2));

        // Duplicate values
        String[] test3 = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(test3);
        System.out.println("Duplicates Handled: " + Arrays.toString(test3));

        // Single element
        String[] test4 = {"Sleeper"};
        Arrays.sort(test4);
        System.out.println("Single Element: " + Arrays.toString(test4));
    }
}
