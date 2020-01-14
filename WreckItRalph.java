//RPG Program: Wreck-it-Ralph by Jay Bhagat - November 8th, 2016
public class WreckItRalph
{
    public static void main (String args[])
    {
	new WreckItRalph ();
    }


    public int pts = 0; //Instance variable for the points the user scores.
    public char stop = 'n';
    public String name = ("name");
    char menuChoice = 'i';


    public WreckItRalph ()
    {
	System.out.println (" __    __  ____     ___    __  __  _       ____  ______         ____    ____  _      ____  __ __");
	System.out.println ("|  |__|  ||    \\   /  _]  /  ]|  |/ ]     |    ||      |       |    \\  /    || |    |    \\|  |  |");
	System.out.println ("|  |  |  ||  D  ) /  [_  /  / |  ' / _____ |  | |      | _____ |  D  )|  o  || |    |  o  )  |  |");
	System.out.println ("|  |  |  ||    / |    _]/  /  |    \\|     ||  | |_|  |_||     ||    / |     || |___ |   _/|  _  |");
	System.out.println ("|  `  '  ||    \\ |   [_/   \\_ |     \\_____||  |   |  |  |_____||    \\ |  _  ||     ||  |  |  |  |");
	System.out.println (" \\      / |  .  \\|     \\     ||  .  |      |  |   |  |         |  .  \\|  |  ||     ||  |  |  |  |");
	System.out.println ("  \\_/\\_/  |__|\\_||_____|\\____||__|\\_|     |____|  |__|         |__|\\_||__|__||_____||__|  |__|__|");

	//Main Menu: The user gets to personalize their game by having their name in it and then they can pick which of the three options they want.

	name = IBIO.inputString ("\nWhat is your name? ");
	name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	System.out.println ("Oh, " + name + " is it? Why that's a lovely name!");
	System.out.println ("Well, welcome to the world of games, the arcade!!");
	mainMenu();
    }


    //Methods
    //Play method is the actual part of the game where the user has to answer the questions.
    public void play ()
    {
	System.out.println (" ____  ____     ___  ____   ____  ____     ___      __ __   ___   __ __  ____    _____   ___  _      _____  __ ");
	System.out.println ("|    \\|    \\   /  _]|    \\ /    ||    \\   /  _]    |  |  | /   \\ |  |  ||    \\  / ___/  /  _]| |    |     ||  |");
	System.out.println ("|  o  )  D  ) /  [_ |  o  )  o  ||  D  ) /  [_     |  |  ||     ||  |  ||  D  )(   \\_  /  [_ | |    |   __||  |");
	System.out.println ("|   _/|    / |    _]|   _/|     ||    / |    _]    |  ~  ||  O  ||  |  ||    /  \\__  ||    _]| |___ |  |_  |__|");
	System.out.println ("|  |  |    \\ |   [_ |  |  |  _  ||    \\ |   [_     |___, ||     ||  :  ||    \\  /  \\ ||   [_ |     ||   _]  __ ");
	System.out.println ("|  |  |  .  \\|     ||  |  |  |  ||  .  \\|     |    |     ||     ||     ||  .  \\ \\    ||     ||     ||  |   |  |");
	System.out.println ("|__|  |__|\\_||_____||__|  |__|__||__|\\_||_____|    |____/  \\___/  \\__,_||__|\\_|  \\___||_____||_____||__|   |__|");
	System.out.println ("\nTime for a little fun don't you say?");
	
	while(stop == 'n') //Repeats playing unless the player wants to stop playing
	{
	    //Start of storyline built from instructions method and first task
	    System.out.println ("\nYou are running around Sugar Rush and destroying it. And you see something far, far into the distance...");
	    System.out.println ("It's a hiding spot far away where Felix can never find you, Diet Coke Mountain.");
	    System.out.println ("You decide that that is the best place to go, and begin your hike while destroying your surroundings with Vanellope.");
	    System.out.println ("Wait but what is this... THERE IS A GIANT POND OF MAPLE SYRUP BLOCKING YOUR WAY!");
	    System.out.println ("You notice that there is a locked bridge with a note stuck to its entrance.");
	    System.out.println ("\"Do you know your English, let's see how well you can do against these questions!\"");
	    System.out.println ("You see some questions on the note and you see that there is are some square candies on the bridge, locked inside.");
	    System.out.println ("You've noticed that collecting candy makes you run faster than Felix so you take it upon yourself to collect these candies!");
	    System.out.println ("The number of candies you get depends on the number of questions you answer correctly.");
	    System.out.println (" _   _  _____  _    _ _____ _      _____    ___   _   _______   _____ _____ _   _  _____  _____ _   _   ___   _   _ _____ _____ ");
	    System.out.println ("| | | ||  _  || |  | |  ___| |    /  ___|  / _ \\ | \\ | |  _  \\ /  __ \\  _  | \\ | |/  ___||  _  | \\ | | / _ \\ | \\ | |_   _/  ___|");
	    System.out.println ("| | | || | | || |  | | |__ | |    \\ `--.  / /_\\ \\|  \\| | | | | | /  \\/ | | |  \\| |\\ `--. | | | |  \\| |/ /_\\ \\|  \\| | | | \\ `--. ");
	    System.out.println ("| | | || | | || |/\\| |  __|| |     `--. \\ |  _  || . ` | | | | | |   | | | | . ` | `--. \\| | | | . ` ||  _  || . ` | | |  `--. \\");
	    System.out.println ("\\ \\_/ /\\ \\_/ /\\  /\\  / |___| |____/\\__/ / | | | || |\\  | |/ /  | \\__/\\ \\_/ / |\\  |/\\__/ /\\ \\_/ / |\\  || | | || |\\  | | | /\\__/ /");
	    System.out.println (" \\___/  \\___/  \\/  \\/\\____/\\_____/\\____/  \\_| |_/\\_| \\_/___/    \\____/\\___/\\_| \\_/\\____/  \\___/\\_| \\_/\\_| |_/\\_| \\_/ \\_/ \\____/ ");
	    task1("SUGAR ", 2);
	    task1("RUSH ", 1);
	    task1("FELIX ", 2);
	    totalPnts(); //Tells you how many points you have currently and asks if you want to continue
	    System.out.println ("\nPhew that was hard, but you made it! And that too, with " +pts+ " points worth of candy!");
	    
	    //Building on the storyline and task 2 (riddles)
	    System.out.println ("You and Vanellope start running and destroying again!");
	    System.out.println ("You hear a noise that sounds a lot like ssssss, hm what could that be you think walking over to the source of the noise...");
	    System.out.println ("There you see a jungle full of gummy snakes, all staring at you! You try to run but you see that Mt. Diet Coke is right after this...");
	    System.out.println ("There's no way to escape these snakes so you tackle them head on, but they don't want to fight.");
	    System.out.println ("Through the crowd, emerges a elderly gummy snake who says \"We are not looking for a fight my kind sir, but we can only let you go if you attempt to answer these questions.\"");
	    System.out.println ("The snake goes on, \"The number of questions you answer correctly, will get you these circle candies, and then we will let you pass.\"");
	    System.out.println ("You say what questions and the snake starts to tell you the questions...");
	    System.out.println ("______ _________________ _      _____ _____ "); 
	    System.out.println ("| ___ \\_   _|  _  \\  _  \\ |    |  ___/  ___|");
	    System.out.println ("| |_/ / | | | | | | | | | |    | |__ \\ `--. ");
	    System.out.println ("|    /  | | | | | | | | | |    |  __| `--. \\");
	    System.out.println ("| |\\ \\ _| |_| |/ /| |/ /| |____| |___/\\__/ /");
	    System.out.println ("\\_| \\_|\\___/|___/ |___/ \\_____/\\____/\\____/ ");
	    task2("\nWhat begins with T, ends with T, and has T in it? ", "a teapot");
	    task2("\nWhat can you catch but not throw? ", "a cold");
	    task2("\nIf a green man lives in a green house, a purple man lives in a purple house, a blue man lives in a blue house, a yellow man lives in a yellow house, a black man lives in a black house. Who lives in a White house?", "the president");
	    totalPnts();    
	    System.out.println ("You have finally escaped the wise snake and their tricky riddles, and make it through the jungle, and to Mt. Diet Coke with " + pts + " points.");
	    
	    //Building on the storyline and task 3 (unscarmble)
	    System.out.println ("\n...\n...\n...");
	    System.out.println ("\nJust when you think it's smooth sailing from here on, it's not.");
	    System.out.println ("You come across some bullies that hate Vanellope.");
	    System.out.println ("They start treating here like she isn't wanted and she has done something wrong!");
	    System.out.println ("You desperately want to help but can't bring your body to move forward!");
	    System.out.println ("You suddenly hear a voice, it's your villain-self, telling you that you can't unless you have unscrambled some words. These words will give you more square candies to keep");
	    System.out.println (" _   _ _   _  _____ _____ ______  ___  ___  _________ _      _____ ");
	    System.out.println ("| | | | \\ | |/  ___/  __ \\| ___ \\/ _ \\ |  \\/  || ___ \\ |    |  ___|");
	    System.out.println ("| | | |  \\| |\\ `--.| /  \\/| |_/ / /_\\ \\| .  . || |_/ / |    | |__  ");
	    System.out.println ("| | | | . ` | `--. \\ |    |    /|  _  || |\\/| || ___ \\ |    |  __| ");
	    System.out.println ("| |_| | |\\  |/\\__/ / \\__/\\| |\\ \\| | | || |  | || |_/ / |____| |___ ");
	    System.out.println (" \\___/\\_| \\_/\\____/ \\____/\\_| \\_\\_| |_/\\_|  |_/\\____/\\_____/\\____/ ");
	    task3("\nPEOLLVANE ", "VANELLOPE");
	    task3("\nNLLVIIA ", "VILLAIN");
	    task3("\nPLEH ", "HELP");
	    totalPnts();
	    System.out.println ("\nYour villain-self has now been beaten, and you proceed to help Vanellope with her bullies.");
	    System.out.println ("You both continue your journey to Mt. Diet Coke.");
	    
	    //Building on the storyline and task 4, at the end there is also a part where it asks the user a question to make sure they are paying attention to the story
	    System.out.println ("\n...\n...\n...");
	    System.out.println ("\"RALPH! RALPH!\" someone yells, you hear them and look towards the direction it is coming from.");
	    System.out.println ("Oh no... IT'S FELIX! He's catching up! You and Vanellope decide to hide to trick him.");
	    System.out.println ("You look around and see gumdrop bushes in a corner. You turn and tell Vanellope to hide in the bushes!");
	    System.out.println ("You look at the ground and see that someone has left a locked box, and like the curious person you are you want to know what it has in it");
	    System.out.println ("Looking through the holes, you can some circle candies in it and you instantly want it!");
	    System.out.println ("You look at the screen on the box, it asks for you to answer some questions to get these candies..");
	    System.out.println (" _____               ______  ");
	    System.out.println ("|_   _|              |  ___| ");
	    System.out.println ("  | |     ___  _ __  | |_    ");
	    System.out.println ("  | |    / _ \\| '__| |  _|   ");
	    System.out.println ("  | |   | (_) | |    | |     ");
	    System.out.println ("  \\_/    \\___/|_|    \\_|     ");
	    task4("\nYou are originally from Sugar Rush.", 'f', 'F');
	    task4("\nYou are currently destroying candies because Felix has come to find you.", 't', 'T');
	    task4("\nFelix is the hero from your original game.", 't', 'T');
	    totalPnts();
	    char stalker = IBIO.inputChar ("\nWhoa, these questions had to do with you and Vanellope, do you think someone's been watching you guys...? (y/n) ");
	    if (stalker == 'y' || stalker == 'Y')
		System.out.println ("Yeah, that does seem pretty weird..");
	    else
		System.out.println ("You're probably right, let's just leave it and look at get back to hiding from Felix.");
	    System.out.println ("\nYou can't hear Felix anymore and he seems to have past you.");
	    
	    //Task 4 (Multiple Choice) and story progression
	    System.out.println ("\nYou notice that Mt. Diet Coke isn't that far away so you and Vanellope start running towards it...");
	    System.out.println ("\n...\n...\n...");
	    System.out.println ("You've made it to the foot of Mt. Diet Coke!!! There is another task you must complete to gain the square candies that were growing from a tree.");
	    System.out.println ("___  ___      _ _   _       _        _____ _           _          ");
	    System.out.println ("|  \\/  |     | | | (_)     | |      /  __ \\ |         (_)         ");
	    System.out.println ("| .  . |_   _| | |_ _ _ __ | | ___  | /  \\/ |__   ___  _  ___ ___ ");
	    System.out.println ("| |\\/| | | | | | __| | '_ \\| |/ _ \\ | |   | '_ \\ / _ \\| |/ __/ _ \\");
	    System.out.println ("| |  | | |_| | | |_| | |_) | |  __/ | \\__/\\ | | | (_) | | (_|  __/");
	    System.out.println ("\\_|  |_/\\__,_|_|\\__|_| .__/|_|\\___|  \\____/_| |_|\\___/|_|\\___\\___|");
	    System.out.println ("                     | |                                          ");
	    System.out.println ("                     |_|                                          ");
	    task5("Which game have you abandoned?", "a. Wreck-it Ralph\nb. Felix Fix-it\nc. Fix-it Felix Jr", 'c', 'C');
	    task5("Who is helping you out right now?", "a. Vanellope von Schweetz\nb. Sonic the Hedgehog\nc. King Candy", 'a', 'A');
	    task5("What does \"going turbo\" mean?", "a. Leaving your game\nb. Going crazy\nc. Running really fast", 'a', 'A');
	    totalPnts();
	    System.out.println ("\nWhoa these questions were about you too... that's strange.. whatever you said and you and Vanellope keep moving to the entrance.");
	    
	    //Gives the user an option whether to choose math problems or a random amount of points, tasks 6 & 7
	    System.out.println ("You both finally reached the entrance and you have an option, if you pick to answer some math problems you would get a triangle candy for every question you got right, but you could also take the easy way and get a random amount of points worth of candy.");
	    char MathorRdm = IBIO.inputChar ("Would you like to answer some math problems that are worth triangle candies each or would you like to get a random amount of points from 1-50? (m/r) ");
	    if (MathorRdm == 'm' || MathorRdm == 'M')
	    {
		System.out.println ("___  ___      _   _      ______          _     _                    ");
		System.out.println ("|  \\/  |     | | | |     | ___ \\        | |   | |                   ");
		System.out.println ("| .  . | __ _| |_| |__   | |_/ / __ ___ | |__ | | ___ _ __ ___  ___ ");
		System.out.println ("| |\\/| |/ _` | __| '_ \\  |  __/ '__/ _ \\| '_ \\| |/ _ \\ '_ ` _ \\/ __|");
		System.out.println ("| |  | | (_| | |_| | | | | |  | | | (_) | |_) | |  __/ | | | | \\__ \\");
		System.out.println ("\\_|  |_/\\__,_|\\__|_| |_| \\_|  |_|  \\___/|_.__/|_|\\___|_| |_| |_|___/");
		task6();
	    }
	    else if (MathorRdm == 'r' || MathorRdm == 'R')
	    {
		System.out.println ("______                _                  ______     _       _       ");
		System.out.println ("| ___ \\              | |                 | ___ \\   (_)     | |      ");
		System.out.println ("| |_/ /__ _ _ __   __| | ___  _ __ ___   | |_/ /__  _ _ __ | |_ ___ ");
		System.out.println ("|    // _` | '_ \\ / _` |/ _ \\| '_ ` _ \\  |  __/ _ \\| | '_ \\| __/ __|");
		System.out.println ("| |\\ \\ (_| | | | | (_| | (_) | | | | | | | | | (_) | | | | | |_\\__ \\");
		System.out.println ("\\_| \\_\\__,_|_| |_|\\__,_|\\___/|_| |_| |_| \\_|  \\___/|_|_| |_|\\__|___/");
		task7();
	    }
	    totalPnts();
	    System.out.println ("You finally make it inside the Mountain without being caught by Felix.");
	    System.out.println ("Or so you think...");
	    System.out.println ("\n...\n...\n...");
	    
	    //Task 8, ending of the storyline, decline on the plotline
	    System.out.println ("You and Vanellope enter the Mountain, just to see Felix sitting there waiting for you...");
	    System.out.println ("\"You can't escape from me Ralph.\" he says, but you start getting mad again and this time you are ready to attack Felix..");
	    System.out.println ("You and Felix break out into a fight...");
	    System.out.println ("During the fight Felix reveals that he was watching Ralph all along and this was his plan.. He was the one asking him questions about himself.");
	    System.out.println ("The following question will decide who wins...");
	    System.out.println ("___  ___      _       _     _             ");
	    System.out.println ("|  \\/  |     | |     | |   (_)            ");
	    System.out.println ("| .  . | __ _| |_ ___| |__  _ _ __   __ _ ");
	    System.out.println ("| |\\/| |/ _` | __/ __| '_ \\| | '_ \\ / _` |");
	    System.out.println ("| |  | | (_| | || (__| | | | | | | | (_| |");
	    System.out.println ("\\_|  |_/\\__,_|\\__\\___|_| |_|_|_| |_|\\__, |");
	    System.out.println ("                                     __/ |");
	    System.out.println ("                                    |___/ ");
	    task8();
	    System.out.println ("That is correct! You have " + pts + " points in total now.");
	    //If the user answers the last task correctly, they get to move on and they win
	    System.out.println ("_____.___.________   ____ ___   __      __________    _______ ._._.");
	    System.out.println ("\\__  |   |\\_____  \\ |    |   \\ /  \\    /  \\_____  \\   \\      \\| | |");
	    System.out.println (" /   |   | /   |   \\|    |   / \\   \\/\\/   //   |   \\  /   |   \\ | |");
	    System.out.println (" \\____   |/    |    \\    |  /   \\        //    |    \\/    |    \\|\\|");
	    System.out.println (" / ______|\\_______  /______/     \\__/\\  / \\_______  /\\____|__  /___");
	    System.out.println (" \\/               \\/                  \\/          \\/         \\/\\/\\/");
	    System.out.println ("Part #2 Coming Soon....");
	    mainMenu(); //Takes them back to the main menu
	}
    }

    
    //Task 1: Vowels and Consonants
    public void task1 (String g, int h)
    {
	System.out.println ("\nAnswer the following to get into the bridge and get the candy.");
	int num = 0;
	while (num < 1 || num > 10) //Keep asking the user to enter a number between 1 and 10, until they have done so
	{
	    num = IBIO.inputInt ("Enter a number between 1 and 10: ");
	}
	
	for (int i = num; i > 0 ; i--) //Prints g, a word, however many times the player wants
	{
	    System.out.print (g);
	}
	
	int vowels = IBIO.inputInt ("\nHow many vowels are shown? ");
	int consonants = IBIO.inputInt ("How many consonants are shown? ");
	
	if (vowels == h * num && consonants == 3 * num) //If they are correct, call square into points and points in here or if they are wrong call wrong into points and points into here
	    System.out.println ("\nCongratulations!" + points (square ()));
	else
	    System.out.println ("\nSorry, that isn't correct!" + points (wrong ()));
	
	caught(); //If the user's points are below 0, goes to the caught method
    }

    
    //Task 2: Riddles
    public void task2 (String a, String b)
    {
	System.out.println (a);
	String ans = IBIO.inputString ("Type what the answer of the riddle may be: ");
	
	if (ans.equalsIgnoreCase (b)) //Calles circle, making this question worth more points
	    System.out.println ("\nCongratulations!! YAY!" + points (circle ()));
	else
	    System.out.println ("\nSorry, that isn't correct. The right answer is " + b + "." + points (wrong ()));
	
	caught();
    }

    
    //Task 3: Unscramble
    public void task3 (String d, String c)
    {
	System.out.println (d);
	String unscramb = IBIO.inputString ("Unscramble the letters to make a word related to the theme! Unscrambled word: ");
	
	if (unscramb.equalsIgnoreCase (c)) //If the answer is correct
	    System.out.println ("\nWoah Ralph (" + name + ")! Never thought you would get that!" + points (square()));
	else
	    System.out.println ("\nSorry, that's not right. The answer is " + c + ". But it was a really hard one! :(" + points (wrong()));
	
	caught();
    }

    
    //Task 4: True or False
    public void task4 (String e, char f, char a)
    {
	char TorF = IBIO.inputChar (e + " (t/f): ");
	
	if (TorF == f || TorF == a) //If what they answered is equal to the parameter f (not the letter) or if it's equal to the parameter a (uppercase version of f)
	    System.out.println ("\nGood job!! You are slowly getting further and further fom Felix!" + points (circle()));
	else
	    System.out.println ("\nAwh, sorry that wasn't correct, no candy for you =(" + points (wrong()));
	
	caught();
    }

    
    //Task 5: Multiple Choice
    public void task5 (String a, String b, char c, char d)
    {
	System.out.println ("\n" + a + "\n" + b);
	char multiChoice = IBIO.inputChar ("Pick which letter answers the question best! Answer: ");
	
	if (multiChoice == c || multiChoice == d) //c and d (paramters) are the same letter one is just uppercase and one is lowercase
	    System.out.println ("\nOMG! That's awesome! You have so many points now Ralph(" + name + ")!" + points (square()));
	else
	    System.out.println ("\nI'm sorry :( That wasn't the answer I was looking for." + points (wrong()));
	
	caught();
    }
    
    
    //Task 6: Math Problems
    public void task6 ()
    {
	System.out.println ("Answer the following math problems");
	
	char tryAgain = 'y';
	int lives = 3;
	
	//First Math Problem
	//If they get it wrong they can repeat this 3 times only
	while (tryAgain == 'y' || tryAgain == 'Y' && lives > 0)
	{
	    double BatBall = IBIO.inputDouble ("A bat and a ball cost $1.10 together. The bat costs $1.00 more than the ball. How much does the ball cost?(express answer without \"$\" and with two decimal places) ");
	    
	    if (BatBall == 0.05)
	    {
		System.out.println ("\nGreat job!! You are on fire!" + points (triangle()));
		tryAgain = 'n';
	    }
	    else 
	    {
		System.out.println ("\nThat's not what I was looking for, sorry." + points (wrong()));
		tryAgain = IBIO.inputChar ("\nWould you like to try again? You have " + lives + " more tries(try)(y/n) ");
		lives--;
	    }
	}

	char retry = 'y';
	int tries = 3;
	
	//Second Math Problem
	//If they get this wrong they can repeat this 3 tmes again
	while (retry == 'y' || retry == 'Y' && tries > 0)
	{
	    int lilypad = IBIO.inputInt ("\nIn a lake there is a patch of lilypads that doubles in size everyday. If it takes the lilypad 24 days to cover the entire lake, how many days does it take to cover half of the lake? ");
	    
	    if (lilypad == 23)
	    {
		System.out.println ("\nThat's correct!! That'll show Felix!" + points (triangle()));
		retry = 'n';
	    }
	    else
	    {
		System.out.println ("\nThat's not correct, sorry." + points (wrong()));
		retry = IBIO.inputChar ("\nWould you like to try again? You have " + tries + " more tries(try)(y/n) ");
		tries--;
	    }
	}
	
	caught();
    }
    
    
    //Task 7: Random Points
    public void task7()
    {
	int rdmPoint = (int)(Math.random () * 50 + 1); //Generates a random amount of points from 50 - 1
	pts = pts + rdmPoint;
	
	System.out.println ("\nThe random number of points you got is " + rdmPoint + ". That makes your total " + pts + " worth of candies.");
	System.out.println ("But remember, never take the easy way out of a tough situation, because there is no easy way...");
	
	//Trickes them into losing 50 points after they gain the random amount
	pts = pts - 50;
	System.out.println ("\nTo reward you for taking the easy way you have lost 50 points. You have " + pts + " points worth of candies left now.");
	
	caught();
    }
    
    
    //Task 8: Matching
    public void task8()
    {
	System.out.println ("Match the following with their correct descriptions.");
	System.out.println ("1. Sugar Rush      2. Fix-it Felix Jr.     3. Vanellope von Schweetz       4. Ralph"); //Choices
	//Matching Options
	System.out.println ("a. The racing game involing candy.     b. A character from the racing game involving lots of candy.");
	System.out.println ("c. The game that deals with the repairations and the demolishions of things.   d. A character from the game, he is in charge of destroying the things.");
	
	//Questions
	char ans1 = IBIO.inputChar ("\nWhat letter best describles Number 1: ");
	char ans2 = IBIO.inputChar ("What letter best describles Number 2: ");
	char ans3 = IBIO.inputChar ("What letter best describles Number 3: ");
	char ans4 = IBIO.inputChar ("What letter best describles Number 4: ");
	
	//If they get all of them correct they will get 400 points, and if they even get 1 wrong they lose the whole game because they have less than 0 coins
	if (ans1 == 'a' && ans2 == 'c' && ans3 == 'b' && ans4 == 'd')
	{
	    pts = pts + 400;
	    System.out.println ("Points: " + pts);
	    System.out.println ("You have a lot of candy now, and Felix sees it sticking out of your pocket.");
	    System.out.println ("Unknown to even you, Felix had a soft spot for candy, so as soon as he saw his old candy again he became his normal good guy self.");
	    System.out.println ("This makes you really happy as well and you both decide to live in harmony back in Fix-it Felix Jr.");
	    System.out.println ("Vanellope is amazed to see how people can bond over candy and she decides to offer her bullies some candy after telling an adult (you), and they finally like her.");
	}
	else
	{
	    pts = pts - (pts + 1);
	    System.out.println ("Sorry, but that wasn't quite right. You lost more than all of your points and have lost.");
	    caught();
	}
	
	caught();
    }
    
    
    //The quit method: It quits the program
    public void quit ()
    {
	System.out.println ("\nBye! See you soon! Come to play again!");
	//For a delay so user can read quit method
	for (int i = 0; i < 100000000; i++) {} 
	System.exit(0);
    }


    //The triangle method: It gives the player 200 points
    public int triangle ()
    {
	pts = pts + 200;
	return pts;
    }


    //The square method: It gives the player 50 points
    public int square ()
    {
	pts = pts + 50;
	return pts;
    }


    //The circle method: It gives the player 100 points
    public int circle ()
    {
	pts = pts + 100;
	return pts;
    }


    //The wrong method: It takes away 10 points from the player if they are wrong
    public int wrong ()
    {
	pts = pts - 10;
	return pts;
    }


    //This method tells the player how many points they have in a organized way
    public String points (int e)
    {
	return ("\nPoints: " + e);
    }

    
    //This is the main menu, from here players can choose to quit, play or read the instructions
    public void mainMenu ()
    {
	System.out.println ("\n********************************");
	System.out.println ("**         Main Menu          **");
	System.out.println ("********************************");
	System.out.println ("\nPlay(p)\nInstructions(i)\nQuit(q)");
	
	menuChoice = IBIO.inputChar ("\nEnter one of the options shown above(in the brackets):  ");
	pts = 0;
	
	//Calls the instructions method
	if (menuChoice == 'i' || menuChoice == 'I')
	{
	    instructions();
	}
	else if (menuChoice == 'p' || menuChoice == 'P') //Calls the play method
	{
	    
	    while (stop == 'n')
	    {
		play();
	    }    
	}
	else if (menuChoice == 'q' || menuChoice == 'Q') //Calls the quit method
	{    
	    quit ();
	}
	else
	{
	    int rndm = (int) (Math.random () * 2 + 1); //If they don't type any of the options above, they will get a random choice either quit or play so it is a 50/50 chance of us getting it right
	    
	    if (rndm == 1)
		play ();
	    else
		quit ();
	}
    }

    
    public void instructions () //The instructions method which reads the instructions 
    {
	System.out.println ("\nSeems like you're new to this world... don't worry I'll tell you everything you need to know.");
	System.out.println ("In this world, there are many different games and many different characters.");
	System.out.println ("One of these characters is Wreck-It-Ralph, the villian from the game, \"Fix-It Felix Jr.\", a game about reparing and destroying.");
	System.out.println ("In the game Ralph felt like he was neglected and alone, so he decided to go to another game...");
	System.out.println ("SO HE LEFT HIS GAME!!! This was something no one ever did... No villian ever left their game, it was called 'going turbo'.");
	System.out.println ("He decided to go to Sugar Rush, a racing game about candy, and be good.");
	System.out.println ("Sugar Rush was a great world and Ralph was in love with the candy and not to mention all of those SWEET characters! <3");
	System.out.println ("Ralph had also found himself a friend! Vanellope von Schweetz! She was funny and tiny and great!");
	System.out.println ("But that didn't last long...");
	System.out.println ("It didn't take long for Felix to realize that Ralph had left..");
	System.out.println ("He immediately went to look for Ralph and bring him back.");
	System.out.println ("Finally, a couple hours has passed and Felix had reached Sugar Rush and heard that Ralph was here too.");
	System.out.println ("Word had reached Ralph that Felix was in Sugar Rush and he started to freak out.");
	System.out.println ("Vanellope tried to calm him down but he wouldn't listen, so she decided to help Ralph with whatever he was going to do.");
	System.out.println ("In the meantime, Ralph was mad!! He was furious... He was throwing a tantrum!!");
	System.out.println ("He started breaking and destroying all of the candy in Sugar Rush and Vanellope was right by his side.");
	
	System.out.println (" __     __                _                    _ ");
	System.out.println (" \\ \\   / /               | |                  | |");
	System.out.println ("  \\ \\_/ /__  _   _ _ __  | |_ _   _ _ __ _ __ | |");
	System.out.println ("   \\   / _ \\| | | | '__| | __| | | | '__| '_ \\| |");
	System.out.println ("    | | (_) | |_| | |    | |_| |_| | |  | | | |_|");
	System.out.println ("    |_|\\___/ \\__,_|_|     \\__|\\__,_|_|  |_| |_(_)");
	
	System.out.println ("\n" + name + ", you are going to be Ralph and you need to help him destroy as much candy as he can while not being caught by Felix!");
	System.out.println ("\nYou are going to have to complete tasks to run from Felix, the number of points decide if you have escaped or not!");
	System.out.println ("Answer the questions that pop up on your screen to hide from Felix and destroy all the candy you can find!");
	System.out.println ("Watch out, if you answer wrong, Felix takes away 10 of your points! But if you answer right you get points!");
	System.out.println ("A candy shaped like a square gives you 50 points, a candy shaped like a circle gives you 100, and the candy shaped like a triangle gives you 200.");
	System.out.println ("But, if you have less than 0 points, you get caught by Felix and you lose.");
	menuChoice = IBIO.inputChar ("Are you ready to play?(y/n) "); //Calls the play method
	    
	    if (menuChoice == 'y' || menuChoice == 'Y')
	    {
		while (stop != 'y') //While the user doesn't want to stop, keep playing
		    play();
		quit();
	    }
	    else
		quit();

    }
    
    
    public void totalPnts () //Tells the user their total amount of points and asks if they would like to stop playing
    {
	stop = IBIO.inputChar ("\nYou have " + pts + " points in total now.\nWould you like to stop playing the game? (y/n) ");
	
	if (stop == 'y')
	{
	    quit();
	}
    }
    
    
    public void caught () //If the user has less than 0 points, they will get 'caught' by Felix which means they lose
    {
	if (pts < 0)
	{
	    System.out.println ("Points: " + pts + ". The points you have right now are less than zero, you have been caught!");
	    System.out.println ("\n     )             (                            ");
	    System.out.println ("  ( /(             )\\ )                         ");
	    System.out.println ("  )\\())       (   (()/(             (           ");
	    System.out.println (" ((_)\\  (    ))\\   /(_))  (   (    ))\\       __ ");
	    System.out.println ("__ ((_) )\\  /((_) (_))    )\\  )\\  /((_)  _  / / ");
	    System.out.println ("\\ \\ / /((_)(_))(  | |    ((_)((_)(_))   (_)| |  ");
	    System.out.println (" \\ V // _ \\| || | | |__ / _ \\(_-</ -_)   _ | |  ");
	    System.out.println ("  |_| \\___/ \\_,_| |____|\\___//__/\\___|  (_) \\_\\ ");
	    
	    mainMenu(); //Displays the main menu after so they can pick what to do
	}
    }    
}
