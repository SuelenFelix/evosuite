package org.openRealmOfStars.gui.icons;

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
import static org.openRealmOfStars.gui.icons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Icon16x16_getIcon_17379755835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public Icon16x16_getIcon_17379755835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term512 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term514 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term523 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term532 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term541 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term542 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term543 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term512, term512.getClass(), "imageType", -375014958);
        setField(term512, term512.getClass(), "colorModel", null);
        setField(term514, term514.getClass(), "sampleModel", null);
        setField(term514, term514.getClass(), "dataBuffer", null);
        setIntField(term514, term514.getClass(), "minX", 1107176718);
        setIntField(term514, term514.getClass(), "minY", 480137250);
        setIntField(term514, term514.getClass(), "width", -341152642);
        setIntField(term514, term514.getClass(), "height", -2015854073);
        setIntField(term514, term514.getClass(), "sampleModelTranslateX", 538259104);
        setIntField(term514, term514.getClass(), "sampleModelTranslateY", 96566506);
        setIntField(term514, term514.getClass(), "numBands", -343325701);
        setIntField(term514, term514.getClass(), "numDataElements", 107945604);
        setField(term523, term523.getClass(), "sampleModel", null);
        setField(term523, term523.getClass(), "dataBuffer", null);
        setIntField(term523, term523.getClass(), "minX", -1963464809);
        setIntField(term523, term523.getClass(), "minY", 71190297);
        setIntField(term523, term523.getClass(), "width", 1202361360);
        setIntField(term523, term523.getClass(), "height", -2015048153);
        setIntField(term523, term523.getClass(), "sampleModelTranslateX", -2063457669);
        setIntField(term523, term523.getClass(), "sampleModelTranslateY", -1222006000);
        setIntField(term523, term523.getClass(), "numBands", 2095798786);
        setIntField(term523, term523.getClass(), "numDataElements", -1565502840);
        setField(term532, term532.getClass(), "sampleModel", null);
        setField(term532, term532.getClass(), "dataBuffer", null);
        setIntField(term532, term532.getClass(), "minX", 0);
        setIntField(term532, term532.getClass(), "minY", 0);
        setIntField(term532, term532.getClass(), "width", 0);
        setIntField(term532, term532.getClass(), "height", 0);
        setIntField(term532, term532.getClass(), "sampleModelTranslateX", 0);
        setIntField(term532, term532.getClass(), "sampleModelTranslateY", 0);
        setIntField(term532, term532.getClass(), "numBands", 0);
        setIntField(term532, term532.getClass(), "numDataElements", 0);
        setField(term532, term532.getClass(), "parent", null);
        setField(term523, term523.getClass(), "parent", term532);
        setField(term514, term514.getClass(), "parent", term523);
        setField(term512, term512.getClass(), "raster", term514);
        setField(term512, term512.getClass(), "osis", null);
        setIntField(term543, term543.getClass(), "hash", 1010456057);
        setField(term543, term543.getClass(), "key", null);
        setField(term543, term543.getClass(), "value", null);
        setField(term543, term543.getClass(), "next", null);
        setElement(term542, 6, term543);
        setField(term541, term541.getClass(), "table", term542);
        setIntField(term541, term541.getClass(), "count", 1);
        setIntField(term541, term541.getClass(), "threshold", 8);
        setFloatField(term541, term541.getClass(), "loadFactor", 0.75F);
        setIntField(term541, term541.getClass(), "modCount", 1);
        setField(term541, term541.getClass(), "keySet", null);
        setField(term541, term541.getClass(), "entrySet", null);
        setField(term541, term541.getClass(), "values", null);
        setField(term512, term512.getClass(), "properties", term541);
        setFloatField(term512, term512.getClass(), "accelerationPriority", 0.5446086F);
        setField(term512, term512.getClass(), "surfaceManager", null);
        setField(term511, term511.getClass(), "img", term512);
        setField(term511, term511.getClass(), "name", "tbcdzjIfER");
        setIntField(term511, term511.getClass(), "index", 9726679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term511, args);
    }

};


