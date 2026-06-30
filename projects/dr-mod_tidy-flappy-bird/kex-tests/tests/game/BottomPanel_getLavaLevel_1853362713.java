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

public class BottomPanel_getLavaLevel_1853362713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9204;

    public BottomPanel_getLavaLevel_1853362713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9204 = newInstance(Class.forName("game.BottomPanel"));
        Object term9205 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9207 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9216 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9225 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9234 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9235 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term9236 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        int[] term9243 = (int[]) newIntArray(6);
        setIntField(term9205, term9205.getClass(), "imageType", 1703093401);
        setField(term9205, term9205.getClass(), "colorModel", null);
        setField(term9207, term9207.getClass(), "sampleModel", null);
        setField(term9207, term9207.getClass(), "dataBuffer", null);
        setIntField(term9207, term9207.getClass(), "minX", 47607734);
        setIntField(term9207, term9207.getClass(), "minY", 1717232691);
        setIntField(term9207, term9207.getClass(), "width", -938127737);
        setIntField(term9207, term9207.getClass(), "height", -1408678076);
        setIntField(term9207, term9207.getClass(), "sampleModelTranslateX", 1201413899);
        setIntField(term9207, term9207.getClass(), "sampleModelTranslateY", -376722373);
        setIntField(term9207, term9207.getClass(), "numBands", 1180687854);
        setIntField(term9207, term9207.getClass(), "numDataElements", 328631288);
        setField(term9216, term9216.getClass(), "sampleModel", null);
        setField(term9216, term9216.getClass(), "dataBuffer", null);
        setIntField(term9216, term9216.getClass(), "minX", -1631415805);
        setIntField(term9216, term9216.getClass(), "minY", 1073400519);
        setIntField(term9216, term9216.getClass(), "width", -2025555268);
        setIntField(term9216, term9216.getClass(), "height", -746950289);
        setIntField(term9216, term9216.getClass(), "sampleModelTranslateX", -137577510);
        setIntField(term9216, term9216.getClass(), "sampleModelTranslateY", 719185716);
        setIntField(term9216, term9216.getClass(), "numBands", 1624820010);
        setIntField(term9216, term9216.getClass(), "numDataElements", -831921156);
        setField(term9225, term9225.getClass(), "sampleModel", null);
        setField(term9225, term9225.getClass(), "dataBuffer", null);
        setIntField(term9225, term9225.getClass(), "minX", 0);
        setIntField(term9225, term9225.getClass(), "minY", 0);
        setIntField(term9225, term9225.getClass(), "width", 0);
        setIntField(term9225, term9225.getClass(), "height", 0);
        setIntField(term9225, term9225.getClass(), "sampleModelTranslateX", 0);
        setIntField(term9225, term9225.getClass(), "sampleModelTranslateY", 0);
        setIntField(term9225, term9225.getClass(), "numBands", 0);
        setIntField(term9225, term9225.getClass(), "numDataElements", 0);
        setField(term9225, term9225.getClass(), "parent", null);
        setField(term9216, term9216.getClass(), "parent", term9225);
        setField(term9207, term9207.getClass(), "parent", term9216);
        setField(term9205, term9205.getClass(), "raster", term9207);
        setField(term9205, term9205.getClass(), "osis", null);
        setIntField(term9236, term9236.getClass(), "hash", 1343719229);
        setField(term9236, term9236.getClass(), "key", null);
        setField(term9236, term9236.getClass(), "value", null);
        setField(term9236, term9236.getClass(), "next", null);
        setElement(term9235, 6, term9236);
        setField(term9234, term9234.getClass(), "table", term9235);
        setIntField(term9234, term9234.getClass(), "count", 1);
        setIntField(term9234, term9234.getClass(), "threshold", 8);
        setFloatField(term9234, term9234.getClass(), "loadFactor", 0.75F);
        setIntField(term9234, term9234.getClass(), "modCount", 1);
        setField(term9234, term9234.getClass(), "keySet", null);
        setField(term9234, term9234.getClass(), "entrySet", null);
        setField(term9234, term9234.getClass(), "values", null);
        setField(term9205, term9205.getClass(), "properties", term9234);
        setFloatField(term9205, term9205.getClass(), "accelerationPriority", 0.7031006F);
        setField(term9205, term9205.getClass(), "surfaceManager", null);
        setField(term9204, term9204.getClass(), "image", term9205);
        setIntElement(term9243, 0, 1773193728);
        setIntElement(term9243, 1, -1341357647);
        setIntElement(term9243, 2, 138447019);
        setIntElement(term9243, 3, 114915275);
        setIntElement(term9243, 4, 338519695);
        setIntElement(term9243, 5, 2025566580);
        setField(term9204, term9204.getClass(), "x", term9243);
        setIntField(term9204, term9204.getClass(), "y", -1231122778);
        setIntField(term9204, term9204.getClass(), "imageWidth", 1923558221);
        setIntField(term9204, term9204.getClass(), "lavaLevel", 1762934060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.BottomPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLavaLevel", argTypes, term9204, args);
    }

};


