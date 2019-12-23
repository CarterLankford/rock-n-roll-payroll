package personnel;
/**
 * Place holder for future descriptions
 */
public class HourlyEmployee extends Employee implements StoreOperators {
    public static final int MINIMUMHOURS = 30;
    public static final int MAXIMUMHOURS = 48;
    private float hourlyRate;
    private float hoursWorked;

    private HourlyEmployee() {
        //This constructure will make sure no blank objects are able to be created. 
    }

    public HourlyEmployee(String employeeName, String phoneNumber, float hourlyRate) {
        //TODO:add logic
    }

    public float getHourlyRate() {
        return this.hourlyRate;
    }

    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private void endOfWeek() {
        //TODO:add logic
    }

    // @Override
    public boolean singHappyBirthday() {
        //TODO:add logic
        //TODO: when interfaces are part of this branch make sure this overrides
        return false;
    }
}