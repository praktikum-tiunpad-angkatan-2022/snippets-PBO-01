public class Ship {
    // Variable
    private int crew;

    // Constructor: Method yang dilakukan saat instansiasi class menjadi object
    public Ship() {
        this.crew = 24;
    }

    // Setter method: Method untuk assign variable dalam class
    public void setCrew(int crew) {
        this.crew = crew;
    }

    // Getter method: Method untuk mengambil nilai variable suatu class
    public int getCrew() {
        return this.crew;
    }
}
