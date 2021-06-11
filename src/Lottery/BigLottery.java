package Lottery;

public class BigLottery  extends Lottery{
    public static void main(String[] args) {
        Lottery bigLottery = new BigLottery();
        System.out.println("The BigLottery number is:\t");
        bigLottery.generate();

    }


    @Override
    public void generate() {
        while (n.size() < 6) {
            int s = random.nextInt(42) + 1;
            n.add(s);
        }
        System.out.println(n);
    }
}