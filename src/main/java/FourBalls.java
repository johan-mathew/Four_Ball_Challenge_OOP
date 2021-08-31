import processing.core.PApplet;

public class FourBalls extends PApplet{
    public static final int HEIGHT = 640;
    public static final int WIDTH = 480;

    class Ball {
        private int x = 0;
        private final int radius = 10;
        private final int no_of_lines = 5;
        PApplet current_window;
        public Ball( PApplet current_window){
            this.current_window = current_window;
        }
        public void drawCircle(int step){
            x += step;
            current_window.ellipse(x,(step * HEIGHT/ no_of_lines),radius,radius);
        }
    }

    Ball balls[] = { new Ball(this),new Ball(this),new Ball(this),new Ball(this)};
    public static void main(String[] args){
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
    }

    @Override
    public void draw(){
        for(int i = 1; i < 5; i++)
            balls[i-1].drawCircle(i);
    }
}