package tr.org.kamp.linux;

import java.awt.Color;

import tr.org.kamp.linux.agarioclone.logic.GameLogic;
import tr.org.kamp.linux.agarioclone.model.Difficulty;

public class AgarioCloneApp {

	public static void main(String[] args) {
			GameLogic gameLogic = new GameLogic("baa", Color.BLUE, Difficulty.EASY);
			gameLogic.startApplication();

	}

}