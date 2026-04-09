import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            System.out.println("❌ Bogie list is empty.");
            return false;
        }

        // Ensure array is sorted before searching
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                System.out.println("✅ Bogie ID " + key + " found at position " + mid);
                return true;
            }
            else if (comparison < 0) {
                // Key is greater → search right half
                low = mid + 1;
            }
            else {
                // Key is smaller → search left half
                high = mid - 1;
            }
        }

        // Not found
        System.out.println("❌ Bogie ID " + key + " not found.");
        return false;
    }

    public static void main(String[] args) {

        // Sorted input
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Test Case 1: Found
        binarySearch(bogieIds, "BG309");

        // Test Case 2: Not found
        binarySearch(bogieIds, "BG999");

        // Test Case 3: First element
        binarySearch(bogieIds, "BG101");

        // Test Case 4: Last element
        binarySearch(bogieIds, "BG550");

        // Test Case 5: Single element
        String[] single = {"BG101"};
        binarySearch(single, "BG101");

        // Test Case 6: Empty array
        String[] empty = {};
        binarySearch(empty, "BG101");

        // Test Case 7: Unsorted input (handled internally)
        String[] unsorted = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        binarySearch(unsorted, "BG205");
    }
}
