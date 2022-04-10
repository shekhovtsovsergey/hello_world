package Java2;

import java.awt.*;

public class Background {


    //Переменные обьекта фон
    public GameCanvas canvas;
    public int r;
    public int g;
    public int b;


    //Конструктор обьекта фон
    public Background(GameCanvas canvas) {
        this.canvas=canvas;   //говорим что это та-же канва
        canvas.setBackground(new Color(r,g,b));  // устанавливаем этой конве цвет
    }


    //Метод получает обьект и меняет цвета
    public void setColor(GameCanvas canvas) {

        if (r == 255) {
            r = 50;
        } else if (r >= 0) {
            r = r + 1;
        } else {
            r = 50;
        }


        if (g == 255) {
            g = 130;
        } else if (g >= 0) {
            g = g + 1;
        } else {
            g = 130;
        }

        if (b == 255) {
            b = 200;
        } else if (b >= 0) {
            b = b + 1;
        } else {
            b = 200;
        }
        canvas.setBackground(new Color(r,g,b));
    }




}
