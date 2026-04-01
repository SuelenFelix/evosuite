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
import java.lang.Integer;

public class GraphRoutines_drawTiling_4418180001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;
     Object term2516;
     Object term2518;
     Object term2520;
     Object term2522;

    public GraphRoutines_drawTiling_4418180001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2476 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2478 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2487 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2496 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2505 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2506 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2507 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2510 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2476, term2476.getClass(), "imageType", 9726679);
        setField(term2476, term2476.getClass(), "colorModel", null);
        setField(term2478, term2478.getClass(), "sampleModel", null);
        setField(term2478, term2478.getClass(), "dataBuffer", null);
        setIntField(term2478, term2478.getClass(), "minX", -25637976);
        setIntField(term2478, term2478.getClass(), "minY", 1555897383);
        setIntField(term2478, term2478.getClass(), "width", 202001407);
        setIntField(term2478, term2478.getClass(), "height", 158873461);
        setIntField(term2478, term2478.getClass(), "sampleModelTranslateX", -430151637);
        setIntField(term2478, term2478.getClass(), "sampleModelTranslateY", -1697741339);
        setIntField(term2478, term2478.getClass(), "numBands", 98922530);
        setIntField(term2478, term2478.getClass(), "numDataElements", -1388471422);
        setField(term2487, term2487.getClass(), "sampleModel", null);
        setField(term2487, term2487.getClass(), "dataBuffer", null);
        setIntField(term2487, term2487.getClass(), "minX", -1498296052);
        setIntField(term2487, term2487.getClass(), "minY", 2098647989);
        setIntField(term2487, term2487.getClass(), "width", 1598895173);
        setIntField(term2487, term2487.getClass(), "height", 1830648570);
        setIntField(term2487, term2487.getClass(), "sampleModelTranslateX", -227365013);
        setIntField(term2487, term2487.getClass(), "sampleModelTranslateY", 11724947);
        setIntField(term2487, term2487.getClass(), "numBands", 1953277050);
        setIntField(term2487, term2487.getClass(), "numDataElements", 1283079251);
        setField(term2496, term2496.getClass(), "sampleModel", null);
        setField(term2496, term2496.getClass(), "dataBuffer", null);
        setIntField(term2496, term2496.getClass(), "minX", 0);
        setIntField(term2496, term2496.getClass(), "minY", 0);
        setIntField(term2496, term2496.getClass(), "width", 0);
        setIntField(term2496, term2496.getClass(), "height", 0);
        setIntField(term2496, term2496.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2496, term2496.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2496, term2496.getClass(), "numBands", 0);
        setIntField(term2496, term2496.getClass(), "numDataElements", 0);
        setField(term2496, term2496.getClass(), "parent", null);
        setField(term2487, term2487.getClass(), "parent", term2496);
        setField(term2478, term2478.getClass(), "parent", term2487);
        setField(term2476, term2476.getClass(), "raster", term2478);
        setField(term2476, term2476.getClass(), "osis", null);
        setIntField(term2507, term2507.getClass(), "hash", 1581343183);
        setField(term2507, term2507.getClass(), "key", "");
        setField(term2507, term2507.getClass(), "value", term2510);
        setField(term2507, term2507.getClass(), "next", null);
        setElement(term2506, 2, term2507);
        setField(term2505, term2505.getClass(), "table", term2506);
        setIntField(term2505, term2505.getClass(), "count", 1);
        setIntField(term2505, term2505.getClass(), "threshold", 8);
        setFloatField(term2505, term2505.getClass(), "loadFactor", 0.75F);
        setIntField(term2505, term2505.getClass(), "modCount", 1);
        setField(term2505, term2505.getClass(), "keySet", null);
        setField(term2505, term2505.getClass(), "entrySet", null);
        setField(term2505, term2505.getClass(), "values", null);
        setField(term2476, term2476.getClass(), "properties", term2505);
        setFloatField(term2476, term2476.getClass(), "accelerationPriority", 0.8783184F);
        setField(term2476, term2476.getClass(), "surfaceManager", null);
        term2516 = new Integer(1398204340);
        term2518 = new Integer(229204365);
        term2520 = new Integer(-461771056);
        term2522 = new Integer(-243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.image.BufferedImage");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term2476;
        args[2] = term2516;
        args[3] = term2518;
        args[4] = term2520;
        args[5] = term2522;
        callMethod(klass, "drawTiling", argTypes, null, args);
    }

};


