
public class Vector
{
    private int x;
    private int y;
    public Vector(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public void setDirection(Vector v){
        int speedSelf = (int)Math.sqrt(this.x*this.x + this.y*this.y);
        int speedOther = (int)Math.sqrt(v.getX()*v.getX() + v.getY()*v.getY());
        this.x = v.x/speedOther*speedSelf;
        this.y = v.y/speedOther*speedSelf;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setSpeed(int speed){
        int currentSpeed = (int)Math.sqrt(this.x*this.x + this.y*this.y);
        this.x = this.x/currentSpeed*speed;
        this.y = this.y/currentSpeed*speed;
    }
}
