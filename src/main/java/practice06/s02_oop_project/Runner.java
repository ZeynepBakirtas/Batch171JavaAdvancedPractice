package practice06.s02_oop_project;

public class Runner {
    public static void main(String[] args) {

        HayvanatBahcesi hb = new HayvanatBahcesi();
        Aslan simba = new Aslan("Simba", 8, "Aslan");
        System.out.println(simba.getAd());

        Aslan mamba = new Aslan("Mamba", 5, "Aslan");
        System.out.println(mamba.getAd());


        hb.hayvanEkle(simba);
        hb.hayvanEkle(mamba);

    }
}
