public class TrainConsistManagementApp
{

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Traverse array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("✅ Bogie ID " + searchKey + " found at position " + i);
                return true; // Early termination
            }
        }

        // If not found
        System.out.println("❌ Bogie ID " + searchKey + " not found.");
        return false;
    }

    public static void main(String[] args) {

        // Sample bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Test Case 1: Found in middle
        searchBogie(bogieIds, "BG309");

        // Test Case 2: Not found
        searchBogie(bogieIds, "BG999");

        // Test Case 3: First element match
        searchBogie(bogieIds, "BG101");

        // Test Case 4: Last element match
        searchBogie(bogieIds, "BG550");

        // Test Case 5: Single element array
        String[] single = {"BG101"};
        searchBogie(single, "BG101");
    }
}
