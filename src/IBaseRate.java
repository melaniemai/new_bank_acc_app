public interface IBaseRate {

    // Method returning base rate
    default double getBaseRate() {
        return 2.5;
    }
}
