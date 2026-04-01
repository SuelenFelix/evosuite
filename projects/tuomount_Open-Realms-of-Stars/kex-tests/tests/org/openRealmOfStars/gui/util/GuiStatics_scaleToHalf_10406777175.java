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

public class GuiStatics_scaleToHalf_10406777175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6317;

    public GuiStatics_scaleToHalf_10406777175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6317 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term6319 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term6328 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term6337 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term6346 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term6347 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6348 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6351 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term6317, term6317.getClass(), "imageType", -1422859977);
        setField(term6317, term6317.getClass(), "colorModel", null);
        setField(term6319, term6319.getClass(), "sampleModel", null);
        setField(term6319, term6319.getClass(), "dataBuffer", null);
        setIntField(term6319, term6319.getClass(), "minX", -1972436591);
        setIntField(term6319, term6319.getClass(), "minY", 68922753);
        setIntField(term6319, term6319.getClass(), "width", -220791533);
        setIntField(term6319, term6319.getClass(), "height", 1741500243);
        setIntField(term6319, term6319.getClass(), "sampleModelTranslateX", -2070466617);
        setIntField(term6319, term6319.getClass(), "sampleModelTranslateY", -1127721881);
        setIntField(term6319, term6319.getClass(), "numBands", 1074848808);
        setIntField(term6319, term6319.getClass(), "numDataElements", -146054762);
        setField(term6328, term6328.getClass(), "sampleModel", null);
        setField(term6328, term6328.getClass(), "dataBuffer", null);
        setIntField(term6328, term6328.getClass(), "minX", 798043553);
        setIntField(term6328, term6328.getClass(), "minY", 533197381);
        setIntField(term6328, term6328.getClass(), "width", 1048271679);
        setIntField(term6328, term6328.getClass(), "height", -1529797673);
        setIntField(term6328, term6328.getClass(), "sampleModelTranslateX", -868676396);
        setIntField(term6328, term6328.getClass(), "sampleModelTranslateY", 1922684808);
        setIntField(term6328, term6328.getClass(), "numBands", -2005784375);
        setIntField(term6328, term6328.getClass(), "numDataElements", -288604325);
        setField(term6337, term6337.getClass(), "sampleModel", null);
        setField(term6337, term6337.getClass(), "dataBuffer", null);
        setIntField(term6337, term6337.getClass(), "minX", 0);
        setIntField(term6337, term6337.getClass(), "minY", 0);
        setIntField(term6337, term6337.getClass(), "width", 0);
        setIntField(term6337, term6337.getClass(), "height", 0);
        setIntField(term6337, term6337.getClass(), "sampleModelTranslateX", 0);
        setIntField(term6337, term6337.getClass(), "sampleModelTranslateY", 0);
        setIntField(term6337, term6337.getClass(), "numBands", 0);
        setIntField(term6337, term6337.getClass(), "numDataElements", 0);
        setField(term6337, term6337.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "parent", term6337);
        setField(term6319, term6319.getClass(), "parent", term6328);
        setField(term6317, term6317.getClass(), "raster", term6319);
        setField(term6317, term6317.getClass(), "osis", null);
        setIntField(term6348, term6348.getClass(), "hash", -1965999012);
        setField(term6348, term6348.getClass(), "key", "");
        setField(term6348, term6348.getClass(), "value", term6351);
        setField(term6348, term6348.getClass(), "next", null);
        setElement(term6347, 3, term6348);
        setField(term6346, term6346.getClass(), "table", term6347);
        setIntField(term6346, term6346.getClass(), "count", 1);
        setIntField(term6346, term6346.getClass(), "threshold", 8);
        setFloatField(term6346, term6346.getClass(), "loadFactor", 0.75F);
        setIntField(term6346, term6346.getClass(), "modCount", 1);
        setField(term6346, term6346.getClass(), "keySet", null);
        setField(term6346, term6346.getClass(), "entrySet", null);
        setField(term6346, term6346.getClass(), "values", null);
        setField(term6317, term6317.getClass(), "properties", term6346);
        setFloatField(term6317, term6317.getClass(), "accelerationPriority", 0.51832694F);
        setField(term6317, term6317.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiStatics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term6317;
        callMethod(klass, "scaleToHalf", argTypes, null, args);
    }

};


