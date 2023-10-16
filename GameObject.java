import java.util.ArrayList;

public abstract class GameObject
{
    private ArrayList<GameObject> children;

    public abstract boolean collides(GameObject obj);

    public abstract void setVelocityAmount(int velocity);

    public abstract void setDirection(Vector v);

    public abstract void setVelocity(Vector v);

    public void setChildrenVelocity(Vector v){
        children.forEach((child) -> {
                child.setVelocity(v);
            });
    }

    public void setChildrenDirection(Vector v){
        children.forEach((child) -> {
                child.setDirection(v);
            });
    }

    public void setChildrenVelocityAmount(int velocity){
        children.forEach((child) -> {
                child.setVelocityAmount(velocity);
            });
    }

}
