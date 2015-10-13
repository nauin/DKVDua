package org.tego.android.dkvdua.gamescreen;

import org.tego.android.dkvdua.gameobject.Level;
import org.tego.android.dkvdua.gameworld.GameRenderer;
import org.tego.android.dkvdua.gameworld.GameWorld;
import org.tego.android.dkvdua.helper.InputHandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

/**
 * Kelas yang digunakan untuk mengatur penggambaran layar dari permainan
 * 
 * @author blackshadow
 *
 */
public class LayarPermainan implements Screen {
	private static final String TAG = LayarPermainan.class.getSimpleName();

	private GameWorld world;
	private GameRenderer renderer;

	public LayarPermainan() {
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 192;
		// float gameHeight = screenHeight / (screenWidth / gameWidth);
		// float gameHeight = (screenHeight / screenWidth) * gameWidth;
		float gameHeight = 272;

		world = new GameWorld(gameWidth, gameHeight);
		Gdx.input.setInputProcessor(new InputHandler(world, screenWidth
				/ gameWidth, screenHeight / gameHeight));
		renderer = new GameRenderer(world, (int) gameWidth, (int) gameHeight);

		Gdx.app.log(TAG, "Lebar Layar HP : " + screenWidth
				+ " \nTinggi Layar HP : " + screenHeight);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#render(float)
	 */
	@Override
	public void render(float delta) {
		world.update(delta);
		renderer.render(delta);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#show()
	 */
	@Override
	public void show() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#hide()
	 */
	@Override
	public void hide() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#pause()
	 */
	@Override
	public void pause() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#resume()
	 */
	@Override
	public void resume() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.Screen#dispose()
	 */
	@Override
	public void dispose() {

	}
}
