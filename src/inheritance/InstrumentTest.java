package inheritance;

public class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        for (int i = 0; i < instruments.length; i++)
            switch ((int) (Math.random() * 3 + 1)) {
                case 1:   // piano
                    instruments[i] = new Piano();
                    break;
                case 2:   // flute
                    instruments[i] = new Flute();
                    break;
                case 3:   //guitar
                    instruments[i] = new Guitar();
                    break;
            }
        for (Instrument instrument : instruments) {
            if (instrument instanceof Piano) System.out.print("Piano is playing ");
            else if (instrument instanceof Flute) System.out.print("Flute is playing ");
            else if (instrument instanceof Guitar) System.out.print("Guitar is playing ");
            instrument.play();
        }

    }
}
