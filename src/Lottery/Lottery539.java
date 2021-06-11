package Lottery;

public class Lottery539 extends Lottery{
    public static void main(String[] args) {
        Lottery539 lottery539 = new Lottery539();
        System.out.println("The Lottery539 number is:\t");
        lottery539.generate();
        }
        @Override
    public void generate() {
        for(int i =1 ; i<=5 ; i++) {
            int s = random.nextInt(39) + 1;
            n.add(s);
        }
            System.out.println(n);
    }
}


