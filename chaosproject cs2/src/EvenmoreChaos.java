public class EvenmoreChaos {

    public int chaos = 0;
    public int evenmorechaos = 5;

    public static void main(String[] args) {
        EvenmoreChaos Orlesschaos = new EvenmoreChaos();
    }
    public void Makechaos(){
        boolean chaos = true;
        System.out.println("boomboomboom!!!!!");
        System.out.println(chaos); //what will this print?
    }
    public EvenmoreChaos() {
        int chaos = 21;
        System.out.println(this.chaos); //what wil this print?
        for (evenmorechaos = 0; evenmorechaos < 97; chaos++) {
            this.evenmorechaos += 3; //what is the result of this?
            System.out.println(evenmorechaos);
            while (evenmorechaos < 42) {
                Makechaos();
                System.out.println(chaos); //what will this print?
                break; // it loogs boom and the other thing so I just break it even though its a while loop.
            }
        }
    }




}
