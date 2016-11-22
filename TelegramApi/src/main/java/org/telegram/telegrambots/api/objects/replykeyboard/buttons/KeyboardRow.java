package org.telegram.telegrambots.api.objects.replykeyboard.buttons;

import java.util.ArrayList;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Row for ReplyKeyBoardMarkup
 * @date 10 of April of 2016
 */
public class KeyboardRow extends ArrayList<KeyboardButton> {
	private static final long serialVersionUID = 1L;

	public boolean add(String text) {
        return super.add(new KeyboardButton().setText(text));
    }

    public void add(int index, String text) {
        super.add(index, new KeyboardButton().setText(text));
    }

    public boolean contains(String text) {
        return super.contains(new KeyboardButton().setText(text));
    }

    public int lastIndexOf(String text) {
        return super.lastIndexOf(new KeyboardButton().setText(text));
    }

    public int indexOf(String text) {
        return super.indexOf(new KeyboardButton().setText(text));
    }

    public KeyboardButton set(int index, String text) {
        return super.set(index, new KeyboardButton().setText(text));
    }

    public boolean remove(String text) {
        return super.remove(new KeyboardButton().setText(text));
    }
}
