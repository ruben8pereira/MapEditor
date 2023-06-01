package org.academiadecodigo.thefellowshift.mapeditor;

import org.academiadecodigo.thefellowshift.mapeditor.graphics.Grid;
import org.academiadecodigo.thefellowshift.mapeditor.graphics.Painter;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(15, 15);
        Painter cursor = new Painter(0, 0, grid);
        MyKeyboardHandler keyboardHandler = new MyKeyboardHandler(cursor, grid);
        KeyboardManager.initKeyEvents(keyboardHandler);
    }
}