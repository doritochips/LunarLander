import java.awt.*;

public class LandingPad extends Item{

    int width = 40;
    int height = 10;

    public LandingPad(){
        // init at 330 100
        this.x = 330;
        this.y = 100;
        this.color = Color.RED;
    }
    public boolean hittest(double mx, double my){
        double offsetx = mx - x;
        double offsety = my - y;
        return offsetx <= 40 && offsetx >= 0 && offsety <= 10 && offsety >= 0;
    }
    public void paint(Graphics2D g2){
        
    }

}
