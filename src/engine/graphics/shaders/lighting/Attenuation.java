package engine.graphics.shaders.lighting;

/**
 * Created by vesel on 02.11.2015.
 */
public class Attenuation {

    private float mAbsolute, mLinear, mQuadratical;

    public Attenuation(float absolute, float linear, float quadratical) {
        mAbsolute = absolute;
        mLinear = linear;
        mQuadratical = quadratical;
    }

    public float getAbsolute() {
        return mAbsolute;
    }

    public void setAbsolute(float absolute) {
        mAbsolute = absolute;
    }

    public float getLinear() {
        return mLinear;
    }

    public void setLinear(float linear) {
        mLinear = linear;
    }

    public float getQuadratical() {
        return mQuadratical;
    }

    public void setQuadratical(float quadratical) {
        mQuadratical = quadratical;
    }
}