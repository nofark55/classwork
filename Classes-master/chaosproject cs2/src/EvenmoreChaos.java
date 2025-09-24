public class EvenmoreChaos {

    public int chaos = 0;
    public int evenmorechaos = 5;

    public static void main(String[] args) {
        EvenmoreChaos Orlesschaos = new EvenmoreChaos();
    }
    public void Makechaos(){
        boolean chaos = true;
        System.out.println("boomboomboom!!!!!");
        System.out.println(chaos);
    }
    public EvenmoreChaos() {
        int chaos = 21;
        System.out.println(this.chaos);
        for (evenmorechaos = 0; evenmorechaos < 97; chaos++) {
            this.evenmorechaos += 3;
            System.out.println(evenmorechaos);
            while (evenmorechaos < 42) {
                Makechaos();
                break; // it loogs boom and the other thing so I just break it even though its a while loop.
            }
        }
    }




}