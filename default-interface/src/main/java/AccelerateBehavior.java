public interface AccelerateBehavior {

    default String accelerator() {
        return "Accelerator";
    }

    default String desaccelerator() {
        return "Desaccelerator";
    }
}

