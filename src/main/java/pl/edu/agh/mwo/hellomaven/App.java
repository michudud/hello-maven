package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

import java.util.Random;

/**
 * Simple main application.
 */
public class App {

    public static final int textWidth = 120;
    public static final int textHeight = 20;
    public static final int diceSize = 6;

    public static void main(String[] args) {

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(textWidth).height(textHeight);
        builder.element(new PseudoText("Hello World!"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random.
        Random rand = new Random();
        int n = rand.nextInt(diceSize);
        return n + 1;
    }
}
