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

public class GraphRoutines_greyTransparent_11853944676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;
     Object term2734;

    public GraphRoutines_greyTransparent_11853944676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2694 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2696 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2705 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2714 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2723 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2724 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2725 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2728 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2694, term2694.getClass(), "imageType", -130649791);
        setField(term2694, term2694.getClass(), "colorModel", null);
        setField(term2696, term2696.getClass(), "sampleModel", null);
        setField(term2696, term2696.getClass(), "dataBuffer", null);
        setIntField(term2696, term2696.getClass(), "minX", 534834644);
        setIntField(term2696, term2696.getClass(), "minY", 1959097203);
        setIntField(term2696, term2696.getClass(), "width", -209654048);
        setIntField(term2696, term2696.getClass(), "height", 477625804);
        setIntField(term2696, term2696.getClass(), "sampleModelTranslateX", 252575029);
        setIntField(term2696, term2696.getClass(), "sampleModelTranslateY", 57189932);
        setIntField(term2696, term2696.getClass(), "numBands", 1460722225);
        setIntField(term2696, term2696.getClass(), "numDataElements", 1743224434);
        setField(term2705, term2705.getClass(), "sampleModel", null);
        setField(term2705, term2705.getClass(), "dataBuffer", null);
        setIntField(term2705, term2705.getClass(), "minX", 842904495);
        setIntField(term2705, term2705.getClass(), "minY", 1008080511);
        setIntField(term2705, term2705.getClass(), "width", 1935707624);
        setIntField(term2705, term2705.getClass(), "height", 1507074215);
        setIntField(term2705, term2705.getClass(), "sampleModelTranslateX", -282881827);
        setIntField(term2705, term2705.getClass(), "sampleModelTranslateY", -1183353915);
        setIntField(term2705, term2705.getClass(), "numBands", -420030135);
        setIntField(term2705, term2705.getClass(), "numDataElements", 267763294);
        setField(term2714, term2714.getClass(), "sampleModel", null);
        setField(term2714, term2714.getClass(), "dataBuffer", null);
        setIntField(term2714, term2714.getClass(), "minX", 0);
        setIntField(term2714, term2714.getClass(), "minY", 0);
        setIntField(term2714, term2714.getClass(), "width", 0);
        setIntField(term2714, term2714.getClass(), "height", 0);
        setIntField(term2714, term2714.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2714, term2714.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2714, term2714.getClass(), "numBands", 0);
        setIntField(term2714, term2714.getClass(), "numDataElements", 0);
        setField(term2714, term2714.getClass(), "parent", null);
        setField(term2705, term2705.getClass(), "parent", term2714);
        setField(term2696, term2696.getClass(), "parent", term2705);
        setField(term2694, term2694.getClass(), "raster", term2696);
        setField(term2694, term2694.getClass(), "osis", null);
        setIntField(term2725, term2725.getClass(), "hash", -1520517694);
        setField(term2725, term2725.getClass(), "key", "");
        setField(term2725, term2725.getClass(), "value", term2728);
        setField(term2725, term2725.getClass(), "next", null);
        setElement(term2724, 10, term2725);
        setField(term2723, term2723.getClass(), "table", term2724);
        setIntField(term2723, term2723.getClass(), "count", 1);
        setIntField(term2723, term2723.getClass(), "threshold", 8);
        setFloatField(term2723, term2723.getClass(), "loadFactor", 0.75F);
        setIntField(term2723, term2723.getClass(), "modCount", 1);
        setField(term2723, term2723.getClass(), "keySet", null);
        setField(term2723, term2723.getClass(), "entrySet", null);
        setField(term2723, term2723.getClass(), "values", null);
        setField(term2694, term2694.getClass(), "properties", term2723);
        setFloatField(term2694, term2694.getClass(), "accelerationPriority", 0.6076495F);
        setField(term2694, term2694.getClass(), "surfaceManager", null);
        term2734 = new Integer(49950830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2694;
        args[1] = term2734;
        callMethod(klass, "greyTransparent", argTypes, null, args);
    }

};


