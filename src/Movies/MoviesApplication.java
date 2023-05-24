package Movies;

import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {


    public Movie[] movieList = findAll();
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Hello, welcome to movie app!");
        System.out.println("What would you like to do?");

        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 = view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - add new movie");

        System.out.println("Enter your choice");

        int choice =in.getInt(0,5);



    }


    private void doChoice(int choice){
        switch (choice){
            case 1:
                for(Movie pMovie : movieList){
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory);
                }
                break;
            case 2:
                for(Movie pMovie : movieList){
                    if(pMovie.getCategory().equals("animated")){

                    }
                }
                break;
            case 3:
                for(Movie pMovie : movieList){
                    if(pMovie.getCategory().equals("drama")){

                    }
                }
                break;
            case 4:
                for(Movie pMovie : movieList){
                    if(pMovie.getCategory().equals("horror")){

                    }
                }
                break;
            case 5:
                for(Movie pMovie : movieList){
                    if(pMovie.getCategory().equals("scifi")){

                    }
                }
                break;
            case 6:
                Input in = new Input();
                System.out.println("Enter Title");
                String name = in.getString();
                System.out.println("Enter category");
                String category = in.getString();
                Movie nMovie = new Movie(name, category);
                movieList = addMovie(movieList, nMovie);

        }
    }
}
