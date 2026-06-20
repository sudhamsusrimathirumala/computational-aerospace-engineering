public class Main {
    public static void main(String[] args) {
        System.out.println("Computational Aerospace Engineering");
        
        ProjectileSim sim = new ProjectileSim(10,45,0.1);
        sim.runSim();
    }
}