package de.ricepuffz.testinggame;

import de.ricepuffz.rice2d.Engine;
import de.ricepuffz.rice2d.input.InputManager;
import de.ricepuffz.rice2d.resource.Texture;
import de.ricepuffz.rice2d.scene.Scene;
import de.ricepuffz.rice2d.scene.object.Sprite;
import de.ricepuffz.testinggame.script.CursorfollowScript;

public class Game extends Engine
{
	Scene scene = null;
	
	@Override
	protected void gameInit()
	{
		window.hideCursor();
		
		sceneManager.registerScene(new Scene("scene"));
		sceneManager.loadScene("scene");
		scene = sceneManager.getCurrentScene();
		
		resourceManager.registerTexture(new Texture("crosshair.png"), "crosshair");
		
		Sprite cursor = new Sprite("crosshair");
		scene.addObject(cursor, "cursor");
		cursor.setScale(3F);
		cursor.addScript(CursorfollowScript.class);
		
	}

	@Override
	protected void onTick()
	{
		
	}

	@Override
	protected void onFrame()
	{
		if (inputManager.getPressStart(InputManager.KEY_ESCAPE))
			quit();
	}
	
	
	public static void main(String[] args)
	{
		new Game();
	}
}
