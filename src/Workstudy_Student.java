public class Workstudy_Student extends Student {

    // attribute
    private double hoursWorked;

    public Workstudy_Student(String name, double hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    // addingHours method
    public double addHoursWorked(double addedHoursWorked) {
        this.hoursWorked += addedHoursWorked;
        return this.hoursWorked;
    }

    // toString
    public String toString(){
        String out = super.toString();
        out += ". Is a work-study student and has earned " + "$" + (7.25 * hoursWorked);
        return out;
    }
}
