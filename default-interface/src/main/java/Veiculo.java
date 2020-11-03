public abstract class Veiculo implements AccelerateBehavior {
    Motor motor = new Motor("v1");
}

class Gol extends Veiculo {}
class Ka extends Veiculo {}
class Maverick extends Veiculo {
    public String accelerator() {
        return "MaverickAccelerator";
    }
    public String desaccelerator() {
        return "MaverickDescelerator";
    }
}