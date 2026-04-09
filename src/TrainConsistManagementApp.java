// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Abstract Goods Bogie
abstract class GoodsBogie {
    protected String cargo;

    public abstract String getShape();

    public void assignCargo(String cargoType) {
        try {
            System.out.println("\nAttempting to assign cargo: " + cargoType + " to " + getShape() + " bogie");

            // Safety validation
            if (getShape().equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo! Petroleum cannot be assigned to Rectangular bogie.");
            }

            // If safe
            this.cargo = cargoType;
            System.out.println("✅ Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            // Handle unsafe assignment
            System.out.println("❌ ERROR: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("🔍 Cargo assignment attempt completed for " + getShape() + " bogie.");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

// Rectangular Bogie
class RectangularBogie extends GoodsBogie {
    @Override
    public String getShape() {
        return "Rectangular";
    }
}

// Cylindrical Bogie
class CylindricalBogie extends GoodsBogie {
    @Override
    public String getShape() {
        return "Cylindrical";
    }
}

// Main Application
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        GoodsBogie rectangular = new RectangularBogie();
        GoodsBogie cylindrical = new CylindricalBogie();

        // Test Case 1: Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Test Case 2: Unsafe assignment (handled)
        rectangular.assignCargo("Petroleum");

        // Test Case 3: Another safe assignment (program continues)
        rectangular.assignCargo("Grain");

        // Verifying cargo storage
        System.out.println("\nFinal Cargo Status:");
        System.out.println("Rectangular Bogie Cargo: " + rectangular.getCargo());
        System.out.println("Cylindrical Bogie Cargo: " + cylindrical.getCargo());
    }
}