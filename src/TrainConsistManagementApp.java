public class TrainConsistManagementApp {

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("🚫 Cannot perform search: No bogies available in the train.");
        }

        // Linear Search (can also plug Binary Search if needed)
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                System.out.println("✅ Bogie ID " + key + " found at position " + i);
                return true;
            }
        }

        System.out.println("❌ Bogie ID " + key + " not found.");
        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Empty array (should throw exception)
        try {
            String[] empty = {};
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        }

        // Test Case 2: Valid search allowed
        String[] bogies1 = {"BG101", "BG205"};
        searchBogie(bogies1, "BG101");

        // Test Case 3: Found after validation
        String[] bogies2 = {"BG101", "BG205", "BG309"};
        searchBogie(bogies2, "BG205");

        // Test Case 4: Not found after validation
        searchBogie(bogies2, "BG999");

        // Test Case 5: Single element
        String[] single = {"BG101"};
        searchBogie(single, "BG101");
    }
}
