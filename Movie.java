3. Similarly, add a constructor to the Movie class already created to add and display.

package constructors;

public class Movie {
	
	    String actor;
	    String actress;
	    String movieName;
	    long budget;
	    
	    Movie(String actor ,String actress, String movieName,long budget){
	    	this.actor=actor;
	    	this.actress=actress;
	        this.movieName= movieName;
	        this.budget=budget;
	    }
	    public void display(){
	    	System.out.println("Actor: "+this.actor);
	    	System.out.println("Actress: "+this.actress);
	        System.out.println("movie Name: "+this.movieName);
	        System.out.println("Budget: "+this.budget);
	    }

	    public static void main(String[] args) {
	        Movie sc[]=new Movie[3];
	        sc[0]=new Movie("Vijay","Samantha","Theri",500000000);
	        sc[1]=new Movie("Ajith","Trisha","Kireedam",40000000);
	        sc[2]=new Movie("Rajini","Radhika Apte","Kabali",100000000);

	        for (Movie t:sc){
	            t.display();
	            System.out.println();
	        }
	    }
	}
