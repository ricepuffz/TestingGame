package de.ricepuffz.testinggame.script;

import de.ricepuffz.rice2d.References;
import de.ricepuffz.rice2d.Script;
import de.ricepuffz.rice2d.input.InputManager;
import de.ricepuffz.rice2d.scene.SceneObject;

public class CursorfollowScript extends Script
{
	InputManager inputManager = References.inputManager;
	
	
	public CursorfollowScript(SceneObject executor)
	{
		super(executor);
	}

	
	@Override
	public void init()
	{
		
	}

	@Override
	public void onFrame()
	{
		double[] cursorPos = inputManager.getCursorPosFromMiddle();
		executor.setPos((float) cursorPos[0], (float) cursorPos[1]);
	}

	@Override
	public void onTick()
	{
		
	}
}
