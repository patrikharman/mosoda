package hu.szamalk.modell;



public class Mosoda {
    private Ruha[] ruhak;


    public Mosoda() {
        this.ruhak = new Ruha[5];
    }


    public void beveszRuha(Ruha ruha) {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] == null) {
                ruhak[i] = ruha;
                System.out.println(ruha.getTulajdonosNev() + " ruháját sikeresen bevettük.");
                return;
            }
        }

        System.out.println("A mosoda tele van, nem lehet több ruhát befogadni.");
    }

    public Ruha kiadRuha(String nev) {
        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] != null && ruhak[i].getTulajdonosNev().equals(nev)) {
                Ruha kiadottRuha = ruhak[i];

                for (int j = i; j < ruhak.length - 1; j++) {
                    ruhak[j] = ruhak[j + 1];
                }

                ruhak[ruhak.length - 1] = null;
                System.out.println(kiadottRuha.getTulajdonosNev() + " ruhája sikeresen kiadva.");
                return kiadottRuha;
            }
        }
        System.out.println("Nincs " + nev + " nevű ruha a mosodában.");
        return null;
    }


    public void kiirRuhaLista() {
        boolean vanRuha = false;
        for (Ruha ruha : ruhak) {
            if (ruha != null) {
                System.out.println(ruha);
                vanRuha = true;
            }
        }
        if (!vanRuha) {
            System.out.println("A mosoda üres.");
        }
    }





}
