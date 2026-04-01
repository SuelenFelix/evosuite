package org.openRealmOfStars.utilities.FileIo;

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
import static org.openRealmOfStars.utilities.FileIo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IOUtilities_saveScreenshot_18370203334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;

    public IOUtilities_saveScreenshot_18370203334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term510 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term519 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term528 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term537 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term538 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term539 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term542 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term508, term508.getClass(), "imageType", 1162663216);
        setField(term508, term508.getClass(), "colorModel", null);
        setField(term510, term510.getClass(), "sampleModel", null);
        setField(term510, term510.getClass(), "dataBuffer", null);
        setIntField(term510, term510.getClass(), "minX", 1484323161);
        setIntField(term510, term510.getClass(), "minY", 391863371);
        setIntField(term510, term510.getClass(), "width", -1922583790);
        setIntField(term510, term510.getClass(), "height", -616727354);
        setIntField(term510, term510.getClass(), "sampleModelTranslateX", -1955890973);
        setIntField(term510, term510.getClass(), "sampleModelTranslateY", -2038273078);
        setIntField(term510, term510.getClass(), "numBands", 1227103734);
        setIntField(term510, term510.getClass(), "numDataElements", -1339778481);
        setField(term519, term519.getClass(), "sampleModel", null);
        setField(term519, term519.getClass(), "dataBuffer", null);
        setIntField(term519, term519.getClass(), "minX", 1725571209);
        setIntField(term519, term519.getClass(), "minY", -522618178);
        setIntField(term519, term519.getClass(), "width", 1134449235);
        setIntField(term519, term519.getClass(), "height", -883034806);
        setIntField(term519, term519.getClass(), "sampleModelTranslateX", 1585847225);
        setIntField(term519, term519.getClass(), "sampleModelTranslateY", 597278769);
        setIntField(term519, term519.getClass(), "numBands", -1685132342);
        setIntField(term519, term519.getClass(), "numDataElements", -1456670397);
        setField(term528, term528.getClass(), "sampleModel", null);
        setField(term528, term528.getClass(), "dataBuffer", null);
        setIntField(term528, term528.getClass(), "minX", 0);
        setIntField(term528, term528.getClass(), "minY", 0);
        setIntField(term528, term528.getClass(), "width", 0);
        setIntField(term528, term528.getClass(), "height", 0);
        setIntField(term528, term528.getClass(), "sampleModelTranslateX", 0);
        setIntField(term528, term528.getClass(), "sampleModelTranslateY", 0);
        setIntField(term528, term528.getClass(), "numBands", 0);
        setIntField(term528, term528.getClass(), "numDataElements", 0);
        setField(term528, term528.getClass(), "parent", null);
        setField(term519, term519.getClass(), "parent", term528);
        setField(term510, term510.getClass(), "parent", term519);
        setField(term508, term508.getClass(), "raster", term510);
        setField(term508, term508.getClass(), "osis", null);
        setIntField(term539, term539.getClass(), "hash", 513416123);
        setField(term539, term539.getClass(), "key", "");
        setField(term539, term539.getClass(), "value", term542);
        setField(term539, term539.getClass(), "next", null);
        setElement(term538, 0, term539);
        setField(term537, term537.getClass(), "table", term538);
        setIntField(term537, term537.getClass(), "count", 1);
        setIntField(term537, term537.getClass(), "threshold", 8);
        setFloatField(term537, term537.getClass(), "loadFactor", 0.75F);
        setIntField(term537, term537.getClass(), "modCount", 1);
        setField(term537, term537.getClass(), "keySet", null);
        setField(term537, term537.getClass(), "entrySet", null);
        setField(term537, term537.getClass(), "values", null);
        setField(term508, term508.getClass(), "properties", term537);
        setFloatField(term508, term508.getClass(), "accelerationPriority", 0.13238746F);
        setField(term508, term508.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.IOUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term508;
        callMethod(klass, "saveScreenshot", argTypes, null, args);
    }

};


