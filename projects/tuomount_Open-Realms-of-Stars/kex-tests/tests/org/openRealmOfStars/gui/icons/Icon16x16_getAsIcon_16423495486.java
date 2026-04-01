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

public class Icon16x16_getAsIcon_16423495486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;

    public Icon16x16_getAsIcon_16423495486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term574 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term576 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term585 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term594 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term603 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term604 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term605 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term574, term574.getClass(), "imageType", -25637976);
        setField(term574, term574.getClass(), "colorModel", null);
        setField(term576, term576.getClass(), "sampleModel", null);
        setField(term576, term576.getClass(), "dataBuffer", null);
        setIntField(term576, term576.getClass(), "minX", 1555897383);
        setIntField(term576, term576.getClass(), "minY", 202001407);
        setIntField(term576, term576.getClass(), "width", 158873461);
        setIntField(term576, term576.getClass(), "height", -430151637);
        setIntField(term576, term576.getClass(), "sampleModelTranslateX", -1697741339);
        setIntField(term576, term576.getClass(), "sampleModelTranslateY", 98922530);
        setIntField(term576, term576.getClass(), "numBands", -1388471422);
        setIntField(term576, term576.getClass(), "numDataElements", -1498296052);
        setField(term585, term585.getClass(), "sampleModel", null);
        setField(term585, term585.getClass(), "dataBuffer", null);
        setIntField(term585, term585.getClass(), "minX", 2098647989);
        setIntField(term585, term585.getClass(), "minY", 1598895173);
        setIntField(term585, term585.getClass(), "width", 1830648570);
        setIntField(term585, term585.getClass(), "height", -227365013);
        setIntField(term585, term585.getClass(), "sampleModelTranslateX", 11724947);
        setIntField(term585, term585.getClass(), "sampleModelTranslateY", 1953277050);
        setIntField(term585, term585.getClass(), "numBands", 1283079251);
        setIntField(term585, term585.getClass(), "numDataElements", -523949691);
        setField(term594, term594.getClass(), "sampleModel", null);
        setField(term594, term594.getClass(), "dataBuffer", null);
        setIntField(term594, term594.getClass(), "minX", 0);
        setIntField(term594, term594.getClass(), "minY", 0);
        setIntField(term594, term594.getClass(), "width", 0);
        setIntField(term594, term594.getClass(), "height", 0);
        setIntField(term594, term594.getClass(), "sampleModelTranslateX", 0);
        setIntField(term594, term594.getClass(), "sampleModelTranslateY", 0);
        setIntField(term594, term594.getClass(), "numBands", 0);
        setIntField(term594, term594.getClass(), "numDataElements", 0);
        setField(term594, term594.getClass(), "parent", null);
        setField(term585, term585.getClass(), "parent", term594);
        setField(term576, term576.getClass(), "parent", term585);
        setField(term574, term574.getClass(), "raster", term576);
        setField(term574, term574.getClass(), "osis", null);
        setIntField(term605, term605.getClass(), "hash", 976986331);
        setField(term605, term605.getClass(), "key", null);
        setField(term605, term605.getClass(), "value", null);
        setField(term605, term605.getClass(), "next", null);
        setElement(term604, 2, term605);
        setField(term603, term603.getClass(), "table", term604);
        setIntField(term603, term603.getClass(), "count", 1);
        setIntField(term603, term603.getClass(), "threshold", 8);
        setFloatField(term603, term603.getClass(), "loadFactor", 0.75F);
        setIntField(term603, term603.getClass(), "modCount", 1);
        setField(term603, term603.getClass(), "keySet", null);
        setField(term603, term603.getClass(), "entrySet", null);
        setField(term603, term603.getClass(), "values", null);
        setField(term574, term574.getClass(), "properties", term603);
        setFloatField(term574, term574.getClass(), "accelerationPriority", 0.5254275F);
        setField(term574, term574.getClass(), "surfaceManager", null);
        setField(term573, term573.getClass(), "img", term574);
        setField(term573, term573.getClass(), "name", "pCTimMblYc");
        setIntField(term573, term573.getClass(), "index", 229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAsIcon", argTypes, term573, args);
    }

};


