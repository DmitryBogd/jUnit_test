import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Vector2DTest {
    private final  double EPS = 1e-9;
    private  Vector2D v1;

    @Before
    public void createVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
         // assertion
        //1e-9 =0.0000...0001
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroYandZeroX(){
        Assert.assertEquals(0, v1.getY(), EPS);
        Assert.assertEquals(0, v1.getX(), EPS);
    }
}
