package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class GraphRoutines_scaleTile32to24_3862487082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2524;
     Object term2564;

    public GraphRoutines_scaleTile32to24_3862487082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2524 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2526 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2535 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2544 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2553 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2554 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2555 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2558 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2524, term2524.getClass(), "imageType", 1384592638);
        setField(term2524, term2524.getClass(), "colorModel", null);
        setField(term2526, term2526.getClass(), "sampleModel", null);
        setField(term2526, term2526.getClass(), "dataBuffer", null);
        setIntField(term2526, term2526.getClass(), "minX", -1002370457);
        setIntField(term2526, term2526.getClass(), "minY", -2014576105);
        setIntField(term2526, term2526.getClass(), "width", 1296895584);
        setIntField(term2526, term2526.getClass(), "height", 628918458);
        setIntField(term2526, term2526.getClass(), "sampleModelTranslateX", -1274456137);
        setIntField(term2526, term2526.getClass(), "sampleModelTranslateY", 1041916673);
        setIntField(term2526, term2526.getClass(), "numBands", -601863069);
        setIntField(term2526, term2526.getClass(), "numDataElements", 663292551);
        setField(term2535, term2535.getClass(), "sampleModel", null);
        setField(term2535, term2535.getClass(), "dataBuffer", null);
        setIntField(term2535, term2535.getClass(), "minX", -1885090354);
        setIntField(term2535, term2535.getClass(), "minY", -2066804303);
        setIntField(term2535, term2535.getClass(), "width", -1731761810);
        setIntField(term2535, term2535.getClass(), "height", 197109649);
        setIntField(term2535, term2535.getClass(), "sampleModelTranslateX", -1239406390);
        setIntField(term2535, term2535.getClass(), "sampleModelTranslateY", 1557431527);
        setIntField(term2535, term2535.getClass(), "numBands", -1504890659);
        setIntField(term2535, term2535.getClass(), "numDataElements", 1358829571);
        setField(term2544, term2544.getClass(), "sampleModel", null);
        setField(term2544, term2544.getClass(), "dataBuffer", null);
        setIntField(term2544, term2544.getClass(), "minX", 0);
        setIntField(term2544, term2544.getClass(), "minY", 0);
        setIntField(term2544, term2544.getClass(), "width", 0);
        setIntField(term2544, term2544.getClass(), "height", 0);
        setIntField(term2544, term2544.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2544, term2544.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2544, term2544.getClass(), "numBands", 0);
        setIntField(term2544, term2544.getClass(), "numDataElements", 0);
        setField(term2544, term2544.getClass(), "parent", null);
        setField(term2535, term2535.getClass(), "parent", term2544);
        setField(term2526, term2526.getClass(), "parent", term2535);
        setField(term2524, term2524.getClass(), "raster", term2526);
        setField(term2524, term2524.getClass(), "osis", null);
        setIntField(term2555, term2555.getClass(), "hash", 513416123);
        setField(term2555, term2555.getClass(), "key", "");
        setField(term2555, term2555.getClass(), "value", term2558);
        setField(term2555, term2555.getClass(), "next", null);
        setElement(term2554, 0, term2555);
        setField(term2553, term2553.getClass(), "table", term2554);
        setIntField(term2553, term2553.getClass(), "count", 1);
        setIntField(term2553, term2553.getClass(), "threshold", 8);
        setFloatField(term2553, term2553.getClass(), "loadFactor", 0.75F);
        setIntField(term2553, term2553.getClass(), "modCount", 1);
        setField(term2553, term2553.getClass(), "keySet", null);
        setField(term2553, term2553.getClass(), "entrySet", null);
        setField(term2553, term2553.getClass(), "values", null);
        setField(term2524, term2524.getClass(), "properties", term2553);
        setFloatField(term2524, term2524.getClass(), "accelerationPriority", 0.26413453F);
        setField(term2524, term2524.getClass(), "surfaceManager", null);
        term2564 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2524;
        args[1] = term2564;
        callMethod(klass, "scaleTile32to24", argTypes, null, args);
    }

};


