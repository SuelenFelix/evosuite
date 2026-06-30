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
import java.lang.Integer;

public class Pipe_rotateImage_10069619449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8499;
     Object term8539;

    public Pipe_rotateImage_10069619449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8499 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8501 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8510 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8519 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8528 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8529 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8530 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8533 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8499, term8499.getClass(), "imageType", 263859424);
        setField(term8499, term8499.getClass(), "colorModel", null);
        setField(term8501, term8501.getClass(), "sampleModel", null);
        setField(term8501, term8501.getClass(), "dataBuffer", null);
        setIntField(term8501, term8501.getClass(), "minX", 1436978289);
        setIntField(term8501, term8501.getClass(), "minY", 696225243);
        setIntField(term8501, term8501.getClass(), "width", -1421649118);
        setIntField(term8501, term8501.getClass(), "height", -511248284);
        setIntField(term8501, term8501.getClass(), "sampleModelTranslateX", 788630042);
        setIntField(term8501, term8501.getClass(), "sampleModelTranslateY", 1430066560);
        setIntField(term8501, term8501.getClass(), "numBands", 836734074);
        setIntField(term8501, term8501.getClass(), "numDataElements", -1747711865);
        setField(term8510, term8510.getClass(), "sampleModel", null);
        setField(term8510, term8510.getClass(), "dataBuffer", null);
        setIntField(term8510, term8510.getClass(), "minX", 682812715);
        setIntField(term8510, term8510.getClass(), "minY", -1092883950);
        setIntField(term8510, term8510.getClass(), "width", 950385621);
        setIntField(term8510, term8510.getClass(), "height", -232352320);
        setIntField(term8510, term8510.getClass(), "sampleModelTranslateX", -232333014);
        setIntField(term8510, term8510.getClass(), "sampleModelTranslateY", -139694079);
        setIntField(term8510, term8510.getClass(), "numBands", -1602072035);
        setIntField(term8510, term8510.getClass(), "numDataElements", 1902624392);
        setField(term8519, term8519.getClass(), "sampleModel", null);
        setField(term8519, term8519.getClass(), "dataBuffer", null);
        setIntField(term8519, term8519.getClass(), "minX", 0);
        setIntField(term8519, term8519.getClass(), "minY", 0);
        setIntField(term8519, term8519.getClass(), "width", 0);
        setIntField(term8519, term8519.getClass(), "height", 0);
        setIntField(term8519, term8519.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8519, term8519.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8519, term8519.getClass(), "numBands", 0);
        setIntField(term8519, term8519.getClass(), "numDataElements", 0);
        setField(term8519, term8519.getClass(), "parent", null);
        setField(term8510, term8510.getClass(), "parent", term8519);
        setField(term8501, term8501.getClass(), "parent", term8510);
        setField(term8499, term8499.getClass(), "raster", term8501);
        setField(term8499, term8499.getClass(), "osis", null);
        setIntField(term8530, term8530.getClass(), "hash", -1067885393);
        setField(term8530, term8530.getClass(), "key", "");
        setField(term8530, term8530.getClass(), "value", term8533);
        setField(term8530, term8530.getClass(), "next", null);
        setElement(term8529, 10, term8530);
        setField(term8528, term8528.getClass(), "table", term8529);
        setIntField(term8528, term8528.getClass(), "count", 1);
        setIntField(term8528, term8528.getClass(), "threshold", 8);
        setFloatField(term8528, term8528.getClass(), "loadFactor", 0.75F);
        setIntField(term8528, term8528.getClass(), "modCount", 1);
        setField(term8528, term8528.getClass(), "keySet", null);
        setField(term8528, term8528.getClass(), "entrySet", null);
        setField(term8528, term8528.getClass(), "values", null);
        setField(term8499, term8499.getClass(), "properties", term8528);
        setFloatField(term8499, term8499.getClass(), "accelerationPriority", 0.6608425F);
        setField(term8499, term8499.getClass(), "surfaceManager", null);
        term8539 = new Integer(434914590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8499;
        args[1] = term8539;
        callMethod(klass, "rotateImage", argTypes, null, args);
    }

};


