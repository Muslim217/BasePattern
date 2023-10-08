package Builder;

public class Fighter {
    String name;
    int age;
    String nickname;
    String weight;

    private Fighter(FighterBuilder fighterbuilder) {
        this.name = fighterbuilder.name;
        this.age = fighterbuilder.age;
        this.nickname = fighterbuilder.nickname;
        this.weight = fighterbuilder.weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    static class FighterBuilder {
        private String name;
        private int age;
        private String nickname;
        private String weight;

        public FighterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FighterBuilder age(int age) {
            this.age = age;
            return this;
        }

        public FighterBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public FighterBuilder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public Fighter build() {
            return new Fighter(this);
        }


    }


}
