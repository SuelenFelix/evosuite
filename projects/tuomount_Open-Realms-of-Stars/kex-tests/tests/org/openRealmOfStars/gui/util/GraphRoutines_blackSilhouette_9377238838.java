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

public class GraphRoutines_blackSilhouette_9377238838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2776;

    public GraphRoutines_blackSilhouette_9377238838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2776 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2778 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2787 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2796 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2805 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2806 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2807 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2810 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2776, term2776.getClass(), "imageType", 1050765721);
        setField(term2776, term2776.getClass(), "colorModel", null);
        setField(term2778, term2778.getClass(), "sampleModel", null);
        setField(term2778, term2778.getClass(), "dataBuffer", null);
        setIntField(term2778, term2778.getClass(), "minX", 474518942);
        setIntField(term2778, term2778.getClass(), "minY", -1656687479);
        setIntField(term2778, term2778.getClass(), "width", -249614216);
        setIntField(term2778, term2778.getClass(), "height", 1870727665);
        setIntField(term2778, term2778.getClass(), "sampleModelTranslateX", -519881101);
        setIntField(term2778, term2778.getClass(), "sampleModelTranslateY", -680920524);
        setIntField(term2778, term2778.getClass(), "numBands", -916335264);
        setIntField(term2778, term2778.getClass(), "numDataElements", -919416536);
        setField(term2787, term2787.getClass(), "sampleModel", null);
        setField(term2787, term2787.getClass(), "dataBuffer", null);
        setIntField(term2787, term2787.getClass(), "minX", -43417861);
        setIntField(term2787, term2787.getClass(), "minY", -1533843432);
        setIntField(term2787, term2787.getClass(), "width", -123338791);
        setIntField(term2787, term2787.getClass(), "height", -1467089634);
        setIntField(term2787, term2787.getClass(), "sampleModelTranslateX", 413548937);
        setIntField(term2787, term2787.getClass(), "sampleModelTranslateY", 1901317214);
        setIntField(term2787, term2787.getClass(), "numBands", 1166710220);
        setIntField(term2787, term2787.getClass(), "numDataElements", -1070592289);
        setField(term2796, term2796.getClass(), "sampleModel", null);
        setField(term2796, term2796.getClass(), "dataBuffer", null);
        setIntField(term2796, term2796.getClass(), "minX", 0);
        setIntField(term2796, term2796.getClass(), "minY", 0);
        setIntField(term2796, term2796.getClass(), "width", 0);
        setIntField(term2796, term2796.getClass(), "height", 0);
        setIntField(term2796, term2796.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2796, term2796.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2796, term2796.getClass(), "numBands", 0);
        setIntField(term2796, term2796.getClass(), "numDataElements", 0);
        setField(term2796, term2796.getClass(), "parent", null);
        setField(term2787, term2787.getClass(), "parent", term2796);
        setField(term2778, term2778.getClass(), "parent", term2787);
        setField(term2776, term2776.getClass(), "raster", term2778);
        setField(term2776, term2776.getClass(), "osis", null);
        setIntField(term2807, term2807.getClass(), "hash", -1590431898);
        setField(term2807, term2807.getClass(), "key", "");
        setField(term2807, term2807.getClass(), "value", term2810);
        setField(term2807, term2807.getClass(), "next", null);
        setElement(term2806, 2, term2807);
        setField(term2805, term2805.getClass(), "table", term2806);
        setIntField(term2805, term2805.getClass(), "count", 1);
        setIntField(term2805, term2805.getClass(), "threshold", 8);
        setFloatField(term2805, term2805.getClass(), "loadFactor", 0.75F);
        setIntField(term2805, term2805.getClass(), "modCount", 1);
        setField(term2805, term2805.getClass(), "keySet", null);
        setField(term2805, term2805.getClass(), "entrySet", null);
        setField(term2805, term2805.getClass(), "values", null);
        setField(term2776, term2776.getClass(), "properties", term2805);
        setFloatField(term2776, term2776.getClass(), "accelerationPriority", 0.37773192F);
        setField(term2776, term2776.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term2776;
        callMethod(klass, "blackSilhouette", argTypes, null, args);
    }

};


