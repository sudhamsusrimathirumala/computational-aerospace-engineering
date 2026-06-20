public class ProjectileSim {
    private double velocity = 0.0; // m/s
    private double velocity_x = 0.0;
    private double velocity_y = 0.0;
    private double angle = 0.0; // degrees

    private double x = 0.0; // m
    private double y = 0.0; // m
    private double t = 0.0;
    private double dt = 0.0;

    private double g = 9.8; // m/s^2

    public ProjectileSim(double velocity, double angle, double dt){
        this.velocity = velocity;
        this.angle = angle;
        velocity_x = velocity*Math.cos(Math.toRadians(angle));
        velocity_y = velocity*Math.sin(Math.toRadians(angle));
        this.dt = dt;
    }

    public void runSim() {
        while(y >= 0) {
            System.out.printf("t=%.1f  x=%.2f  y=%.2f%n",t, x, y);
            t += dt;
            x = velocity_x * t;
            y = velocity_y * t - 0.5 * g * Math.pow(t, 2);
        }
    }
}
