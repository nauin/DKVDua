package org.tego.android.dkvdua.gameobject;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * @author Mats Svensson
 */
public class BalokPemuat extends Actor {

	protected Animation animation;
	protected TextureRegion reg;
	protected float stateTime;

	public BalokPemuat(Animation animation) {
		this.animation = animation;
		reg = animation.getKeyFrame(0);
	}

	@Override
	public void act(float delta) {
		stateTime += delta;
		reg = animation.getKeyFrame(stateTime);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(reg, getX(), getY());
	}
}
