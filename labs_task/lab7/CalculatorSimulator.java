// Custom exception for invalid country
class CountryNotValidException extends Exception {
    
    public CountryNotValidException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Country not valid: " + getMessage();
    }

    CountryNotValidException() {
        super("Country Not Valid Exception");
    }
}


// Custom exception for invalid employee name
class EmployeeNameInvalidException extends Exception {
    
    public EmployeeNameInvalidException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Employee name not valid: " + getMessage();
    }

    EmployeeNameInvalidException() {
        super("Employee Name Invalid Exception");
    }
}


// Custom exception for tax not eligible
class TaxNotEligibleException extends Exception {
    
    public TaxNotEligibleException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Not eligible for Tax calculation: " + getMessage();
    }

    TaxNotEligibleException() {
        super("Tax Not Eligible Exception");
    }
}


// Class for calculating tax based on employee details by throwing custom exceptions
class TaxCalculator {

    public static double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        // Implementation for tax calculation
        double taxAmount = 0.0;
        if(!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }
        if(empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        if(empSal > 100000 && isIndian) {
            taxAmount = empSal * (8.0/100);
        } else if(empSal > 50000 && isIndian) {
            taxAmount = empSal * (6.0/100);
        } else if(empSal > 30000 && isIndian) {
            taxAmount = empSal * (5.0/100);
        } else if(empSal > 10000 && isIndian) {
            taxAmount = empSal * (4.0/100);
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
        return taxAmount;
    }
}

// Main class to simulate the calculator
public class CalculatorSimulator {

    public static void main (String[] args) {

        double taxAmount;

        try {

            // // Test case 1
            // taxAmount = TaxCalculator.calculateTax("Ron", false, 34000);
            // System.out.println("Tax amount is " + taxAmount);

            // // Test case 2
            // taxAmount = TaxCalculator.calculateTax("Tim", true, 1000);
            // System.out.println("Tax amount is " + taxAmount);

            // // Test case 3
            // taxAmount = TaxCalculator.calculateTax("Jack", true, 55000);
            // System.out.println("Tax amount is " + taxAmount);

            // Test case 4
            taxAmount = TaxCalculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + taxAmount);

        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }
    }
}