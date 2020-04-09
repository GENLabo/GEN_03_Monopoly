public class Main {

    public static void main(String[] args){
        Die die = new Die();

        for(int i = 0; i < 10; ++i){
            die.roll();
            System.out.println(die.getFaceValue());
        }

    }

}
