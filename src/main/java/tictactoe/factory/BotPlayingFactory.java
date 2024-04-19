package tictactoe.factory;

import tictactoe.model.BotDifficultyLevel;
import tictactoe.strateggies.botPlayingStrategies.BotPlayingStrategy;
import tictactoe.strateggies.botPlayingStrategies.EasyPlayingBot;
import tictactoe.strateggies.botPlayingStrategies.HardPlayingBot;
import tictactoe.strateggies.botPlayingStrategies.MediumPlayingBot;

public class BotPlayingFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyPlayingBot();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumPlayingBot();
        }else{
            return new HardPlayingBot();
        }
    }
}
