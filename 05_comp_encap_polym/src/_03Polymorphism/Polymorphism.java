package _03Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack the Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids run around in a Maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperials vs Jedis";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetabel");
    }
}

public class Polymorphism {
    /**
     * Polymorphism allows actions to act differently based on the object that the action is being
     * performed on
     *
     * plot method does different stuff as each movie has plot overrided
     * If no override - then it'll back up to the super plot() method
     */
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(
                "Movie #: " + i + " Name: " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n"
            );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        // random number between 1 and 5 since random() 0 <= x < 1
        System.out.println("Random number " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}
