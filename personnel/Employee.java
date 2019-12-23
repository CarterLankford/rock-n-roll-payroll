package personnel;
    /**
     * This abstract class will act as a base for all employee types, and 
     * 
     */
public abstract class Employee{
    private String name;
    private String phoneNumber;
    private int id;
    //TODO: Will uncomment the below when DateTime has been added to this project. 
    // private DateTime scheduledStartTime;
    // private DateTime scheduledLeaveTime;
    // private DateTime clockInTime;
    // private DateTime clockOutTime;
    private int missedDaysCount = 0;
    private String departmentName;
    
    private Employee() {

    }

    protected Employee(String name, String phoneNumber){

    }

    protected float calculatePay() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getId() {
        return 0;
    }

    // public DateTime getscheduledStartTime() {
    //     return this.scheduledStartTime;
    // }

    // public DateTime getscheduledLeaveTime () {
    //     return this.scheduledLeaveTime;
    // }

    // public DateTime getclockInTime () {
    //     return this.clockInTime;
    // }

    // public DateTime getclockOutTime () {
    //     return this.clockOutTime;
    // }

    public int getMissedDaysCount() {
        return this.missedDaysCount;
    }    

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber (String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    // public void setScheduledStartTime (DateTime scheduledStartTime) {
    //     this.scheduledStartTime = scheduledStartTime;
    // }

    // public void setScheduledLeaveTime (DateTime scheduledLeaveTime) {
    //     this.scheduledLeaveTime = scheduledLeaveTime;
    // }

    // public void setClockInTime (DateTime clockInTime) {
    //     this.clockInTime = clockInTime;
    // }

    // public void setClockOutTime (DateTime clockOutTime) {
    //     this.clockOutTime = clockOutTime;
    // }

    public void setMissedDaysCount (int missedDaysCount) {
        this.missedDaysCount = missedDaysCount;
    }

    public void setDepartmentName (String departmentName) {
        this.departmentName = departmentName;
    }
}