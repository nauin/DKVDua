package org.tego.android.dkvdua.helper;

import java.util.ArrayList;
import java.util.List;

import org.tego.android.dkvdua.gameobject.Level;
import org.tego.android.dkvdua.gameworld.GameWorld;
import org.tego.android.dkvdua.ui.Tombol;
import org.tego.android.dkvdua.utilitas.AssetLoader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

/**
 * Kelas yang digunakan untuk menganani inputan/masukan pada aplikasi permainan
 * 
 * @author blackshadow
 *
 */
public class InputHandler implements InputProcessor {
	private static final String TAG = InputHandler.class.getSimpleName();
	
	private GameWorld myWorld;
	private float scaleFactorX;
	private float scaleFactorY;
	private List<Tombol> tombolMenu;
	private Tombol tombolMulai;
	private Tombol tombolPengaturan;
	private Tombol tombolKeluar;
	private List<Tombol> tombolKontrol;
	private Tombol tombolKontrolKiri;
	private Tombol tombolKontrolKanan;
	private Tombol tombolKontrolAtas;
	private Tombol tombolKontrolBawah;
	private Tombol tombolTembak;
	private Level level;

	/**
	 * Konstruktor dari kelas
	 * 
	 * @param myWorld
	 *            Dunia/Layar utama permainan
	 * @param scaleFactorX
	 *            Faktor skala X dari layar
	 * @param scaleFactorY
	 *            Faktor skala Y dari layar
	 */
	public InputHandler(GameWorld myWorld, float scaleFactorX,
			float scaleFactorY) {
		this.myWorld = myWorld;
		this.scaleFactorX = scaleFactorX;
		this.scaleFactorY = scaleFactorY;

		tombolMenu = new ArrayList<Tombol>();
		tombolMulai = new Tombol((Gdx.graphics.getWidth() / 4) - 25,
				(Gdx.graphics.getHeight() / 4) - 25,
				(Gdx.graphics.getWidth() / 4), (Gdx.graphics.getHeight() / 4),
				AssetLoader.dkvduaMatchButtonNormal,
				AssetLoader.dkvduaMatchButtonClick);
		tombolPengaturan = new Tombol((Gdx.graphics.getWidth() / 4) - 25,
				(Gdx.graphics.getHeight() / 4) - 35,
				(Gdx.graphics.getWidth() / 4), (Gdx.graphics.getHeight() / 4),
				AssetLoader.dkvduaMatchButtonNormal,
				AssetLoader.dkvduaMatchButtonClick);
		tombolKeluar = new Tombol((Gdx.graphics.getWidth() / 4) - 25,
				(Gdx.graphics.getHeight() / 4) - 45,
				(Gdx.graphics.getWidth() / 4), (Gdx.graphics.getHeight() / 4),
				AssetLoader.dkvduaMatchButtonNormal,
				AssetLoader.dkvduaMatchButtonClick);
		tombolMenu.add(tombolMulai);
		tombolMenu.add(tombolPengaturan);
		tombolMenu.add(tombolKeluar);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#keyDown(int)
	 */
	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#keyUp(int)
	 */
	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#keyTyped(char)
	 */
	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#touchDown(int, int, int, int)
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#touchUp(int, int, int, int)
	 */
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#touchDragged(int, int, int)
	 */
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#mouseMoved(int, int)
	 */
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.badlogic.gdx.InputProcessor#scrolled(int)
	 */
	@Override
	public boolean scrolled(int amount) {
		return false;
	}

	/**
	 * Method yang digunakan untuk mengambil semua tombol menu, untuk menangani
	 * event dari tombol
	 * 
	 * @return
	 */
	public List<Tombol> getTombolMenu() {
		return tombolMenu;
	}
	
	public List<Tombol> getTombolKontrol() {
		return tombolKontrol;
	}
}
