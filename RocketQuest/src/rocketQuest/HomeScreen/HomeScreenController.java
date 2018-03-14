package rocketQuest.HomeScreen;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rocketQuest.Main;


public class HomeScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private ImageView imgNewGame;
	
	@FXML
	private ImageView imgContinue;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgLogo;
	
	
	String[] testFrames = {"file:src/images/TEST1.png", "file:src/images/TEST2", "file:src/images/TEST3", "file:src/images/TEST4", 
						   "file:src/images/TEST5", "file:src/images/TEST6", "file:src/images/TEST7", "file:src/images/TEST8"};
	
	public HomeScreenController()
	{
		
	}
	
	AnimationTimer stopwatch = new AnimationTimer() 
	{
	
		private static final long STOPPED = -1 ;
		private long startTime = STOPPED ;
		private int tickerTime = 0;
		
		@Override
		public void handle(long timestamp) 
		{
			if (startTime == STOPPED) 
			{
				startTime = timestamp ;
			}
			
			int elapsedseconds = (int) ((timestamp - startTime) /1000000000);
			
			if(elapsedseconds == tickerTime + 1)
			{
				tickerTime++;
				
				imgBackground.setImage(new Image(testFrames[elapsedseconds]));
				
				if(elapsedseconds == 8)
				{
					stopwatch.stop();
					stopwatch.start();
				}
			}
			
			
			       
		}
	
		@Override
		public void stop() 
		{
			startTime = STOPPED ;
			super.stop();
			startTime = -1;
		}
	};
	
	@FXML
	private void initialize()
	{
		//stopwatch.start();
	}
	
	//changes the screen to the new game screen
	@FXML
	private void handleNewGame()
	{
		
	}
	
	//changes the screen to the workshop screen
	@FXML
	private void handleContinue()
	{
		
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































