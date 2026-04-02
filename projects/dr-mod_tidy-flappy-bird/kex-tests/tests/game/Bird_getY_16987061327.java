package game;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Bird_getY_16987061327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8843;

    public Bird_getY_16987061327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8843 = newInstance(Class.forName("game.Bird"));
        Object[] term8850 = (Object[]) newArray("java.awt.image.BufferedImage", 5);
        Object term8851 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8853 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8862 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8871 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8872 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8878 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8880 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8889 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8890 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8896 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8899 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8902 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term8843, term8843.getClass(), "x", -382652403);
        setIntField(term8843, term8843.getClass(), "y", -2126539433);
        setIntField(term8843, term8843.getClass(), "birdHeight", 196952878);
        setIntField(term8843, term8843.getClass(), "birdWidth", 802673242);
        setDoubleField(term8843, term8843.getClass(), "velocity", 0.25937345430928016);
        setIntField(term8843, term8843.getClass(), "count", -1808638031);
        setIntField(term8851, term8851.getClass(), "imageType", -1514240086);
        setField(term8851, term8851.getClass(), "colorModel", null);
        setField(term8853, term8853.getClass(), "sampleModel", null);
        setField(term8853, term8853.getClass(), "dataBuffer", null);
        setIntField(term8853, term8853.getClass(), "minX", 2052244839);
        setIntField(term8853, term8853.getClass(), "minY", -1763480506);
        setIntField(term8853, term8853.getClass(), "width", -1541297110);
        setIntField(term8853, term8853.getClass(), "height", -1581464804);
        setIntField(term8853, term8853.getClass(), "sampleModelTranslateX", -1954937310);
        setIntField(term8853, term8853.getClass(), "sampleModelTranslateY", -460657407);
        setIntField(term8853, term8853.getClass(), "numBands", 941003590);
        setIntField(term8853, term8853.getClass(), "numDataElements", -1825624890);
        setField(term8862, term8862.getClass(), "sampleModel", null);
        setField(term8862, term8862.getClass(), "dataBuffer", null);
        setIntField(term8862, term8862.getClass(), "minX", 413214164);
        setIntField(term8862, term8862.getClass(), "minY", 355911655);
        setIntField(term8862, term8862.getClass(), "width", 1811833766);
        setIntField(term8862, term8862.getClass(), "height", 735987104);
        setIntField(term8862, term8862.getClass(), "sampleModelTranslateX", -1784072578);
        setIntField(term8862, term8862.getClass(), "sampleModelTranslateY", 2011764585);
        setIntField(term8862, term8862.getClass(), "numBands", -860680764);
        setIntField(term8862, term8862.getClass(), "numDataElements", -963198667);
        setField(term8862, term8862.getClass(), "parent", null);
        setField(term8853, term8853.getClass(), "parent", term8862);
        setField(term8851, term8851.getClass(), "raster", term8853);
        setField(term8851, term8851.getClass(), "osis", null);
        setField(term8871, term8871.getClass(), "table", term8872);
        setIntField(term8871, term8871.getClass(), "count", 1);
        setIntField(term8871, term8871.getClass(), "threshold", 8);
        setFloatField(term8871, term8871.getClass(), "loadFactor", 0.75F);
        setIntField(term8871, term8871.getClass(), "modCount", 1);
        setField(term8871, term8871.getClass(), "keySet", null);
        setField(term8871, term8871.getClass(), "entrySet", null);
        setField(term8871, term8871.getClass(), "values", null);
        setField(term8851, term8851.getClass(), "properties", term8871);
        setFloatField(term8851, term8851.getClass(), "accelerationPriority", 0.51832694F);
        setField(term8851, term8851.getClass(), "surfaceManager", null);
        setElement(term8850, 0, term8851);
        setIntField(term8878, term8878.getClass(), "imageType", 1485731037);
        setField(term8878, term8878.getClass(), "colorModel", null);
        setField(term8880, term8880.getClass(), "sampleModel", null);
        setField(term8880, term8880.getClass(), "dataBuffer", null);
        setIntField(term8880, term8880.getClass(), "minX", 0);
        setIntField(term8880, term8880.getClass(), "minY", 0);
        setIntField(term8880, term8880.getClass(), "width", 0);
        setIntField(term8880, term8880.getClass(), "height", 0);
        setIntField(term8880, term8880.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8880, term8880.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8880, term8880.getClass(), "numBands", 0);
        setIntField(term8880, term8880.getClass(), "numDataElements", 0);
        setField(term8880, term8880.getClass(), "parent", null);
        setField(term8878, term8878.getClass(), "raster", term8880);
        setField(term8878, term8878.getClass(), "osis", null);
        setField(term8889, term8889.getClass(), "table", term8890);
        setIntField(term8889, term8889.getClass(), "count", 1);
        setIntField(term8889, term8889.getClass(), "threshold", 8);
        setFloatField(term8889, term8889.getClass(), "loadFactor", 0.75F);
        setIntField(term8889, term8889.getClass(), "modCount", 1);
        setField(term8889, term8889.getClass(), "keySet", null);
        setField(term8889, term8889.getClass(), "entrySet", null);
        setField(term8889, term8889.getClass(), "values", null);
        setField(term8878, term8878.getClass(), "properties", term8889);
        setFloatField(term8878, term8878.getClass(), "accelerationPriority", 0.0F);
        setField(term8878, term8878.getClass(), "surfaceManager", null);
        setElement(term8850, 1, term8878);
        setIntField(term8896, term8896.getClass(), "imageType", 0);
        setField(term8896, term8896.getClass(), "colorModel", null);
        setField(term8896, term8896.getClass(), "raster", null);
        setField(term8896, term8896.getClass(), "osis", null);
        setField(term8896, term8896.getClass(), "properties", null);
        setFloatField(term8896, term8896.getClass(), "accelerationPriority", 0.0F);
        setField(term8896, term8896.getClass(), "surfaceManager", null);
        setElement(term8850, 2, term8896);
        setIntField(term8899, term8899.getClass(), "imageType", 0);
        setField(term8899, term8899.getClass(), "colorModel", null);
        setField(term8899, term8899.getClass(), "raster", null);
        setField(term8899, term8899.getClass(), "osis", null);
        setField(term8899, term8899.getClass(), "properties", null);
        setFloatField(term8899, term8899.getClass(), "accelerationPriority", 0.0F);
        setField(term8899, term8899.getClass(), "surfaceManager", null);
        setElement(term8850, 3, term8899);
        setIntField(term8902, term8902.getClass(), "imageType", 0);
        setField(term8902, term8902.getClass(), "colorModel", null);
        setField(term8902, term8902.getClass(), "raster", null);
        setField(term8902, term8902.getClass(), "osis", null);
        setField(term8902, term8902.getClass(), "properties", null);
        setFloatField(term8902, term8902.getClass(), "accelerationPriority", 0.0F);
        setField(term8902, term8902.getClass(), "surfaceManager", null);
        setElement(term8850, 4, term8902);
        setField(term8843, term8843.getClass(), "images", term8850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term8843, args);
    }

};


