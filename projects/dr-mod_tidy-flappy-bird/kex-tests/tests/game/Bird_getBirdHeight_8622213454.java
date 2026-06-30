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

public class Bird_getBirdHeight_8622213454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8735;

    public Bird_getBirdHeight_8622213454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8735 = newInstance(Class.forName("game.Bird"));
        Object[] term8742 = (Object[]) newArray("java.awt.image.BufferedImage", 1);
        Object term8743 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8745 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8754 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8763 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8764 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term8735, term8735.getClass(), "x", -1062304878);
        setIntField(term8735, term8735.getClass(), "y", -1377876610);
        setIntField(term8735, term8735.getClass(), "birdHeight", -1456184732);
        setIntField(term8735, term8735.getClass(), "birdWidth", 1689228897);
        setDoubleField(term8735, term8735.getClass(), "velocity", 0.8878841294187743);
        setIntField(term8735, term8735.getClass(), "count", 892205855);
        setIntField(term8743, term8743.getClass(), "imageType", 1955560079);
        setField(term8743, term8743.getClass(), "colorModel", null);
        setField(term8745, term8745.getClass(), "sampleModel", null);
        setField(term8745, term8745.getClass(), "dataBuffer", null);
        setIntField(term8745, term8745.getClass(), "minX", -1330529019);
        setIntField(term8745, term8745.getClass(), "minY", 237134844);
        setIntField(term8745, term8745.getClass(), "width", 2076413861);
        setIntField(term8745, term8745.getClass(), "height", 66817373);
        setIntField(term8745, term8745.getClass(), "sampleModelTranslateX", 1459628013);
        setIntField(term8745, term8745.getClass(), "sampleModelTranslateY", -1641507499);
        setIntField(term8745, term8745.getClass(), "numBands", -33436796);
        setIntField(term8745, term8745.getClass(), "numDataElements", -1527326823);
        setField(term8754, term8754.getClass(), "sampleModel", null);
        setField(term8754, term8754.getClass(), "dataBuffer", null);
        setIntField(term8754, term8754.getClass(), "minX", 469871899);
        setIntField(term8754, term8754.getClass(), "minY", -1348703436);
        setIntField(term8754, term8754.getClass(), "width", -2027012650);
        setIntField(term8754, term8754.getClass(), "height", 1343432022);
        setIntField(term8754, term8754.getClass(), "sampleModelTranslateX", -1767079160);
        setIntField(term8754, term8754.getClass(), "sampleModelTranslateY", -201010601);
        setIntField(term8754, term8754.getClass(), "numBands", 2060027076);
        setIntField(term8754, term8754.getClass(), "numDataElements", 2084868811);
        setField(term8754, term8754.getClass(), "parent", null);
        setField(term8745, term8745.getClass(), "parent", term8754);
        setField(term8743, term8743.getClass(), "raster", term8745);
        setField(term8743, term8743.getClass(), "osis", null);
        setField(term8763, term8763.getClass(), "table", term8764);
        setIntField(term8763, term8763.getClass(), "count", 1);
        setIntField(term8763, term8763.getClass(), "threshold", 8);
        setFloatField(term8763, term8763.getClass(), "loadFactor", 0.75F);
        setIntField(term8763, term8763.getClass(), "modCount", 1);
        setField(term8763, term8763.getClass(), "keySet", null);
        setField(term8763, term8763.getClass(), "entrySet", null);
        setField(term8763, term8763.getClass(), "values", null);
        setField(term8743, term8743.getClass(), "properties", term8763);
        setFloatField(term8743, term8743.getClass(), "accelerationPriority", 0.8474802F);
        setField(term8743, term8743.getClass(), "surfaceManager", null);
        setElement(term8742, 0, term8743);
        setField(term8735, term8735.getClass(), "images", term8742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirdHeight", argTypes, term8735, args);
    }

};


