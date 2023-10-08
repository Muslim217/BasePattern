package Builder;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter.FighterBuilder()
                .name("Muslim")
                .age(22).nickname("zorro")
                .weight("77").build();


    }
}
