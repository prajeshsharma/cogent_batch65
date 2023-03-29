package inheritance;

public abstract class Instrument {
    void play() {
        System.out.println("is playing");
    }
}

class Piano extends Instrument {

    @Override
    void play() {
        System.out.println("tan tan tan tan");
    }
}

class Flute extends Instrument {

    @Override
    void play() {
        System.out.println("toot toot toot toot");
    }
}

class Guitar extends Instrument {

    @Override
    void play() {
        System.out.println("tin tin tin tin");
    }
}