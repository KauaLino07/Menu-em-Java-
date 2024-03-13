public abstract class Ponto {
   private  float x;
   private  float y;
    
    // X - BASE
    //Y - ALTURA
   
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public abstract String toString();
}
