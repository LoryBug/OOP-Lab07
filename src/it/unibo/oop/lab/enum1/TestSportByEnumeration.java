package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
    	
    	final SportSocialNetworkUserImpl<User> lleoni =
    			new SportSocialNetworkUserImpl<> ("Lorenzo", "Leoni", "lleoni", 20);
    	final SportSocialNetworkUserImpl<User> vtassi =
    			new SportSocialNetworkUserImpl<> ("Viola", "Tassinari", "vtassi", 18);
    	final SportSocialNetworkUserImpl<User> ppino =
    			new SportSocialNetworkUserImpl<> ("Poni", "Pino", "ppino", 63);
    	
    	
    	lleoni.addSport(Sport.BASKET);
    	lleoni.addSport(Sport.MOTOGP);
    	lleoni.addSport(Sport.SOCCER);
    	System.out.println();
    	System.out.println();
    	
    	vtassi.addSport(Sport.VOLLEY);
    	vtassi.addSport(Sport.TENNIS);
    	System.out.println();
    	System.out.println();
    	
    	ppino.addSport(Sport.F1);
    	ppino.addSport(Sport.BIKE);
    	System.out.println();
    	System.out.println();
    	
    	
    	
    }
}
