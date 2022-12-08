import settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalFinance {

    public static void main(String[] args) {
        init();
        System.out.println(Arrays.toString(Text.getMonths()));
    }

    private static void init() {
        try {
            Text.init();
            GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphics.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/main/resources/fonts/Roboto-Light.ttf")));
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(PersonalFinance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
