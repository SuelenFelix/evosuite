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

public class GraphRoutines_whiteSilhouette_3905139839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2816;

    public GraphRoutines_whiteSilhouette_3905139839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2816 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2818 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2827 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2836 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2845 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2846 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2847 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2850 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2816, term2816.getClass(), "imageType", 32185364);
        setField(term2816, term2816.getClass(), "colorModel", null);
        setField(term2818, term2818.getClass(), "sampleModel", null);
        setField(term2818, term2818.getClass(), "dataBuffer", null);
        setIntField(term2818, term2818.getClass(), "minX", 1768204942);
        setIntField(term2818, term2818.getClass(), "minY", 1252951645);
        setIntField(term2818, term2818.getClass(), "width", 574481092);
        setIntField(term2818, term2818.getClass(), "height", -310528004);
        setIntField(term2818, term2818.getClass(), "sampleModelTranslateX", -634976996);
        setIntField(term2818, term2818.getClass(), "sampleModelTranslateY", -1015274146);
        setIntField(term2818, term2818.getClass(), "numBands", -49052672);
        setIntField(term2818, term2818.getClass(), "numDataElements", 339372704);
        setField(term2827, term2827.getClass(), "sampleModel", null);
        setField(term2827, term2827.getClass(), "dataBuffer", null);
        setIntField(term2827, term2827.getClass(), "minX", -851097944);
        setIntField(term2827, term2827.getClass(), "minY", 803925431);
        setIntField(term2827, term2827.getClass(), "width", 76929641);
        setIntField(term2827, term2827.getClass(), "height", -2003192918);
        setIntField(term2827, term2827.getClass(), "sampleModelTranslateX", -1362856620);
        setIntField(term2827, term2827.getClass(), "sampleModelTranslateY", -1835839814);
        setIntField(term2827, term2827.getClass(), "numBands", -1404350380);
        setIntField(term2827, term2827.getClass(), "numDataElements", -2013924238);
        setField(term2836, term2836.getClass(), "sampleModel", null);
        setField(term2836, term2836.getClass(), "dataBuffer", null);
        setIntField(term2836, term2836.getClass(), "minX", 0);
        setIntField(term2836, term2836.getClass(), "minY", 0);
        setIntField(term2836, term2836.getClass(), "width", 0);
        setIntField(term2836, term2836.getClass(), "height", 0);
        setIntField(term2836, term2836.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2836, term2836.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2836, term2836.getClass(), "numBands", 0);
        setIntField(term2836, term2836.getClass(), "numDataElements", 0);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2827, term2827.getClass(), "parent", term2836);
        setField(term2818, term2818.getClass(), "parent", term2827);
        setField(term2816, term2816.getClass(), "raster", term2818);
        setField(term2816, term2816.getClass(), "osis", null);
        setIntField(term2847, term2847.getClass(), "hash", 1010456057);
        setField(term2847, term2847.getClass(), "key", "");
        setField(term2847, term2847.getClass(), "value", term2850);
        setField(term2847, term2847.getClass(), "next", null);
        setElement(term2846, 6, term2847);
        setField(term2845, term2845.getClass(), "table", term2846);
        setIntField(term2845, term2845.getClass(), "count", 1);
        setIntField(term2845, term2845.getClass(), "threshold", 8);
        setFloatField(term2845, term2845.getClass(), "loadFactor", 0.75F);
        setIntField(term2845, term2845.getClass(), "modCount", 1);
        setField(term2845, term2845.getClass(), "keySet", null);
        setField(term2845, term2845.getClass(), "entrySet", null);
        setField(term2845, term2845.getClass(), "values", null);
        setField(term2816, term2816.getClass(), "properties", term2845);
        setFloatField(term2816, term2816.getClass(), "accelerationPriority", 0.24413109F);
        setField(term2816, term2816.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term2816;
        callMethod(klass, "whiteSilhouette", argTypes, null, args);
    }

};


