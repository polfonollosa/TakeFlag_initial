package takeTheFlag;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Random;

import jconsole.JConsole;

public class TakeTheFlag {
	
	public static void main(String[] args)
    {
		
		/* CONSTANTS */
		// the following values do not change during the execution of the program
		// that's why they are declared final and their names are written uppercase (CONSTANTS)
		
        final int W = 79; // width of the window. Rows in [0, W-1]
        final int H = 32; // height of the window. Columns in [0, H-1] 
        
        // positions available to agents
        final int FIRST_ROW_AGENTS = 1;// first row available to agents
        final int FIRST_COL_AGENTS = 1; // first column available to agents
        final int LAST_ROW_AGENTS = H - 5;  // last row available to agents
        final int LAST_COL_AGENTS = W - 2 ; // last column available to agents
        
        // positions of walls and force fields
        final int ROW_BOTTOM_WALL = H - 4; // row where bottom wall is placed
        final int ROW_TOP_WALL = 0; // row where top wall is placed
        final int COL_LEFT_WALL = 0; // column where left wall is placed
        final int COL_RIGHT_WALL = W - 1; // column where right wall is placed
        final int COL_FORCE_FIELD = (W-2)/2+1; // column where vertical force field is placed
        final int ROW_FORCE_FIELD = (H-3-2)/2+1; // row where horizontal force field is places
        
        // position of HOME. Only top-left corner
        final int HOME_X = 4;
        final int HOME_Y = 3;
        
        // player initial position
        final int PLAYER_INITIAL_X = W/4;
        final int PLAYER_INITIAL_Y = (H-3)/4;
        
        // "avatars" (how agents are represented on screen)
        final char PLAYER = 'Q';
        final char FLAG = 'f';
        final char KEEPER = 'K';
        final char BOUNCER = 'o';
        
        // positions of "HUD"
        final int HUD_UP = H-3;
        final int HUD_MID = H-2;
        final int HUD_DOWN = H-1;
        
        // demultiplying factor
        final int DEMULTIPLIER = 10;  // the higher the slower the autonomous agents move

        /* VARIABLES */
        
        int frame; // number of the current frame
        
        int playerX, playerY; // current position of player
        int flagX, flagY; // current position of the flag (if any)
        int keeperX, keeperY; // current position of the keeper
        int bouncerX, bouncerY; // current position of the the bouncer
        
        int deltaX=1, deltaY=1;  // bouncer's deltas
        
        boolean carriesFlag = false; // when true the player is "carrying" the flag
        boolean chaserActive = false; // when true the chaser is chasing the player
        boolean playerKilled = false; // true when chaser and player have collided
        boolean bouncerActive = false; // true when bouncer has started moving
        
        int flagsDelivered = 0; // number of flags the player has delivered 
        int radiationDoses = 0; // number of times the player has taken damage due to collisions
                                // with force fields (each collision is a dose of radiation)
        int bouncerCollisions = 0; // times the player has collided against the bouncer
        
        Random alea = new Random();
        
        KeyEvent keyInfo; 
        
        JConsole console = new JConsole(W,H);
        console.setCursorVisible(false);

        // INTRODUCTION
        Introduction(console);
        
        // place walls (borders)
        PlaceHorizontalWall(ROW_BOTTOM_WALL, W, Color.YELLOW, console);
        PlaceHorizontalWall(ROW_TOP_WALL, W, Color.YELLOW, console);
        PlaceVerticalWall(COL_LEFT_WALL, LAST_ROW_AGENTS+2, Color.YELLOW, console);
        PlaceVerticalWall(COL_RIGHT_WALL, LAST_ROW_AGENTS+2, Color.YELLOW, console);
        // place force fields
        PlaceVerticalWall(COL_FORCE_FIELD, LAST_ROW_AGENTS+2, Color.CYAN, console);
        PlaceHorizontalWall(ROW_FORCE_FIELD, W, Color.CYAN, console);

        // place HOME
        PlaceHome (HOME_X, HOME_Y, console);
        
        // SET initial positions for player, flag, keeper and bouncer;
        playerX = PLAYER_INITIAL_X;
        playerY = PLAYER_INITIAL_Y;
        
        flagX = alea.nextInt(COL_FORCE_FIELD+2, LAST_COL_AGENTS);  // always in the right side (no +1 because we need to position the keeper behind the flag)
        flagY = alea.nextInt(FIRST_ROW_AGENTS+1, LAST_ROW_AGENTS);  // avoid xtreme positions...
        
        // place keeper just off the right of the flag
        keeperX  = flagX+1;
        keeperY = flagY;
       
        // place bouncer just off the left of the flag
        bouncerX = flagX-1;
        bouncerY = flagY;

        // show player, flag, keeper and bouncer in their initial positions
        // see how avatars are used. Colours are hard-coded; could've done better... 
        console.setCursorPosition(playerX, playerY);
        console.setForegroundColor(Color.WHITE);
        console.print(PLAYER);
        console.setCursorPosition(flagX, flagY);
        console.setForegroundColor(Color.RED); 
        console.print(FLAG); 
        console.setCursorPosition(keeperX, keeperY);
        console.setForegroundColor(Color.YELLOW);
        console.print(KEEPER);
        console.setCursorPosition(bouncerX, bouncerY);
        console.setForegroundColor(Color.WHITE);
        console.print(BOUNCER);
        
        console.resetColor();

        //initialize frame counting
        frame = 0;

        //main loop
        while (/* COMPLETE */)
        {
        	// always paint/repaint force fields and home  
        	PlaceVerticalWall(COL_FORCE_FIELD, LAST_ROW_AGENTS+2, Color.CYAN, console);
        	PlaceHorizontalWall(ROW_FORCE_FIELD, W, Color.CYAN, console);
        	PlaceHome(HOME_X, HOME_Y, console);
        	// same for flag and bouncer if player has not it and keeper is active
        	// since moving keeper may delete them 
        	if (!carriesFlag && chaserActive) {
        		console.setCursorPosition(flagX, flagY);
                console.setForegroundColor(Color.RED); 
                console.print(FLAG);
                console.setCursorPosition(bouncerX, bouncerY);
                console.setForegroundColor(Color.WHITE); 
                console.print(BOUNCER);
        	}
        	
        	frame++;
            // move autonomous entities...
            if (frame%DEMULTIPLIER==0)
            {
				/* COMPLETE */
            } // end of movement of autonomous entities

            // process key, if there's a key to process...
            // read a key
            if (console.keyAvailable())
            {
            	/* COMPLETE. Next comments outline tasks to do */
            	
            	// read a key...
                // ...and remove the rest (empty the buffer)
            	
            	// Temporarily hide player;
            	
                //process keyInfo
            	
                // check stuff, like player has taken the flag or reached home position
            	// or collided against a force field. Act accordingly...
            	// by the way, a function to check if the player has reached home is 
            	// provided. 
                
                // show player again
                
            } // if keyAvailble... ends here
            // processing keys ends here

            // check other stuff like whether the keeper has got the 
            // player or the bouncer has hit the player
            /* COMPLETE */
 
            // write status in HUD
            /* COMPLETE */
           
         
            // add a delay
            try {Thread.sleep(50);} catch(Exception e) {}
            

        } // main loop ends here
        // main loops ends when ...
        // needless to say how important it is to state the goal of the iteration 
        // (or the termination reason) at this point. Then just negate it and alas! 
        // you have the conditions governing the while.
        
        // Say whatever you need to say when game has already reached an end
        console.clear();
        console.setCursorPosition(10, H/2);
        if (flagsDelivered==3) {
        	console.setForegroundColor(Color.GREEN);
        	console.print("Congratulations. You rescued three flags!!!");
        }
        else if (radiationDoses==11) {
        	console.setForegroundColor(Color.MAGENTA);
        	console.print("Ouch! An excess of radiation has killed you");
        }
        else if (bouncerCollisions==3)  {
        	console.setForegroundColor(Color.RED);
        	console.print("Oh Sh*t! the BOUNCER hit you three times!");
        }
        else {
        	console.setForegroundColor(Color.RED);
        	console.print("Oooh!!! The KEEPER dit its job and got you. ");
        }
       

        console.resetColor();
        console.setCursorPosition(0, console.getRows() - 1);
        console.print("Press the space bar to exit");
        keyInfo = console.readKey(true);
        while (keyInfo.getKeyCode()!=KeyEvent.VK_SPACE)
        {
            keyInfo = console.readKey(true);
        }
        System.exit(0);
       
    } // main ends here

    static void Introduction (JConsole console)
    {
        console.setForegroundColor(Color.CYAN);
        console.println("*********************************************");
        console.println("             TAKE THE FLAG");
        console.println("*********************************************");

        console.setForegroundColor(Color.WHITE);
        console.println("\n");
        console.print("Welcome to ");
        console.setForegroundColor(Color.YELLOW);;
        console.print("TAKE THE FLAG ");
        console.setForegroundColor(Color.WHITE);
        console.println("the best action game ever.");
        console.println();
        console.setForegroundColor(Color.YELLOW);;
        console.print("TAKE THE FLAG ");
        console.setForegroundColor(Color.WHITE);
        console.println("is a single-player keyboard-based game.");
        console.println();
        console.println("Your goal is to retrieve three RED FLAGS and bring them back home");
        console.println("while avoiding both the KEEPER of the flag and the BOUNCER");
        console.println();
        console.println("The KEEPER will start chasing you when you hit the vertical FORCE FIELD, ");
        console.println("and the BOUNCER will get activated when you take the flag");
        console.println();
        console.println("When you get the flag and are carrying it, your colour will change");
        console.println("from white to red. Then you have to go home (H) and deposit the flag there");
        console.println();
        console.println("You win, and the game ends, when you have successfuly retrieved ");
        console.println("three red flags. ");
        console.println();
        console.println("You die, and the game ends, when the KEEPER gets you or after");
        console.println("three \"encounters\" with the BOUNCER");
        console.println("The game also ends when you have taken an overdose of radiation");
        console.println("You take radiation every time you hit a FORCE FIELD.");
        console.println();
        console.println("Use the arrow keys to move your avatar ");
        console.println("GOOD LUCK !!! ");

        console.setCursorPosition(0, console.getRows() - 1);
        console.setForegroundColor(Color.GREEN);
        console.print("There you go. Press any key to start...");
        console.readKey(true);
        console.clear();
    }

    static void PlaceHorizontalWall(int row, int length, Color color, JConsole console)
    {
        console.setCursorPosition(0, row);
        console.setForegroundColor(color);
        for (int i = 0; i < length; i++)
        {
            console.print("=");
        }
        console.resetColor();
    }

    static void PlaceVerticalWall(int col, int length, Color color, JConsole console)
    {
        console.setForegroundColor(color);
        for (int i=0; i<length; i++)
        {
            console.setCursorPosition(col, i);
            console.print("|");
        }
        console.resetColor();
    }
    
    static void PlaceHome (int col, int row, JConsole console) {
    	console.setForegroundColor(Color.GREEN);;
    	console.setCursorPosition(col, row);
    	console.print("HH");
    	console.setCursorPosition(col, row+1);
    	console.print("HH");
    	console.resetColor();
    }
    
    static boolean atHome (int playerX, int playerY, int homeX, int homeY) {
    	return (playerX==homeX || playerX==homeX+1) && (playerY==homeY || playerY==homeY+1);
    }
    
    static void beep () {
    	java.awt.Toolkit.getDefaultToolkit().beep();
    }
    
}
