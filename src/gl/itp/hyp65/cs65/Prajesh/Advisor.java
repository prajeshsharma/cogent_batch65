package gl.itp.hyp65.cs65.Prajesh;

public class Advisor {
    private final String[] advisor = {"Stop and smell the flowers", "The Moving finger writes and having writ moves on",
            "Don't be paranoid", "You're not that special", "shun the shunners"};

    public void getAdvice() {
        System.out.println("Advise: " + advisor[(int) (5 * Math.random())]);
    }


}
