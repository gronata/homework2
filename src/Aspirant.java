public class Aspirant extends Student {
    private String dissertationName;

    public Aspirant(String firstName, String lastName, double averageMark, String group, String namedissertation) {
        super(firstName, lastName, averageMark, group);
        this.dissertationName = dissertationName;
    }


    @Override
    public double getScholarship(double averageMark) {
        double grant = averageMark == 5 ? 200 : 180;
        return grant;


    }
}
