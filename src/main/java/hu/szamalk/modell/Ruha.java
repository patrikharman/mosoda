package hu.szamalk.modell;

public class Ruha {
    private String tulajdonosNev;
    private boolean tisztaE;



    public Ruha(String tulajdonosNev, boolean tiszta) {
        this.tulajdonosNev = tulajdonosNev;
        this.tisztaE = tiszta;
    }

    public String getTulajdonosNev() {
        return tulajdonosNev;
    }


    public boolean isTiszta() {
        return tisztaE;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulajdonosNev='" + tulajdonosNev + '\'' +
                ", tiszta=" + tisztaE +
                '}';
    }


}
