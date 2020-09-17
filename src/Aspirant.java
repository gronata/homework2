public class Aspirant extends Student {
    private String namedissertation;

    public Aspirant(String firstName, String lastName, double averageMark, String group, String namedissertation) {
        super(firstName, lastName, averageMark, group);
        this.namedissertation = namedissertation;
    }


    @Override
    public double getScholarship(double averageMark) {
        double grant = averageMark == 5 ? 200 : 180;
        return grant;


    }
}
