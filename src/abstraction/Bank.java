package abstraction;

public abstract class Bank {
    abstract float getRateOfInterest();
}

class SbiBank extends Bank {
    float rateOfInterest = 2.75f;
    @Override
    float getRateOfInterest() {
        return rateOfInterest;
    }
}

class HdcfBank extends Bank {
    float rateOfInterest = 7f;
    @Override
    float getRateOfInterest() {
        return rateOfInterest;
    }
}
