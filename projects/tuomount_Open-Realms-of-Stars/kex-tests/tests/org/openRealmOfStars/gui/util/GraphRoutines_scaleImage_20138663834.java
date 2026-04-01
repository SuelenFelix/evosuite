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

public class GraphRoutines_scaleImage_20138663834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2608;
     Object term2648;
     Object term2650;

    public GraphRoutines_scaleImage_20138663834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2608 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2610 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2619 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2628 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2637 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2638 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2639 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2642 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2608, term2608.getClass(), "imageType", -426764678);
        setField(term2608, term2608.getClass(), "colorModel", null);
        setField(term2610, term2610.getClass(), "sampleModel", null);
        setField(term2610, term2610.getClass(), "dataBuffer", null);
        setIntField(term2610, term2610.getClass(), "minX", -1222614956);
        setIntField(term2610, term2610.getClass(), "minY", -1870495012);
        setIntField(term2610, term2610.getClass(), "width", -1310015129);
        setIntField(term2610, term2610.getClass(), "height", -2104981311);
        setIntField(term2610, term2610.getClass(), "sampleModelTranslateX", -571169753);
        setIntField(term2610, term2610.getClass(), "sampleModelTranslateY", 318591690);
        setIntField(term2610, term2610.getClass(), "numBands", -165587447);
        setIntField(term2610, term2610.getClass(), "numDataElements", -1347358701);
        setField(term2619, term2619.getClass(), "sampleModel", null);
        setField(term2619, term2619.getClass(), "dataBuffer", null);
        setIntField(term2619, term2619.getClass(), "minX", 806595993);
        setIntField(term2619, term2619.getClass(), "minY", 548228925);
        setIntField(term2619, term2619.getClass(), "width", -749861210);
        setIntField(term2619, term2619.getClass(), "height", 1694224101);
        setIntField(term2619, term2619.getClass(), "sampleModelTranslateX", 937859191);
        setIntField(term2619, term2619.getClass(), "sampleModelTranslateY", -916584829);
        setIntField(term2619, term2619.getClass(), "numBands", -2131181468);
        setIntField(term2619, term2619.getClass(), "numDataElements", 282916351);
        setField(term2628, term2628.getClass(), "sampleModel", null);
        setField(term2628, term2628.getClass(), "dataBuffer", null);
        setIntField(term2628, term2628.getClass(), "minX", 0);
        setIntField(term2628, term2628.getClass(), "minY", 0);
        setIntField(term2628, term2628.getClass(), "width", 0);
        setIntField(term2628, term2628.getClass(), "height", 0);
        setIntField(term2628, term2628.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2628, term2628.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2628, term2628.getClass(), "numBands", 0);
        setIntField(term2628, term2628.getClass(), "numDataElements", 0);
        setField(term2628, term2628.getClass(), "parent", null);
        setField(term2619, term2619.getClass(), "parent", term2628);
        setField(term2610, term2610.getClass(), "parent", term2619);
        setField(term2608, term2608.getClass(), "raster", term2610);
        setField(term2608, term2608.getClass(), "osis", null);
        setIntField(term2639, term2639.getClass(), "hash", 102033401);
        setField(term2639, term2639.getClass(), "key", "");
        setField(term2639, term2639.getClass(), "value", term2642);
        setField(term2639, term2639.getClass(), "next", null);
        setElement(term2638, 8, term2639);
        setField(term2637, term2637.getClass(), "table", term2638);
        setIntField(term2637, term2637.getClass(), "count", 1);
        setIntField(term2637, term2637.getClass(), "threshold", 8);
        setFloatField(term2637, term2637.getClass(), "loadFactor", 0.75F);
        setIntField(term2637, term2637.getClass(), "modCount", 1);
        setField(term2637, term2637.getClass(), "keySet", null);
        setField(term2637, term2637.getClass(), "entrySet", null);
        setField(term2637, term2637.getClass(), "values", null);
        setField(term2608, term2608.getClass(), "properties", term2637);
        setFloatField(term2608, term2608.getClass(), "accelerationPriority", 0.3692338F);
        setField(term2608, term2608.getClass(), "surfaceManager", null);
        term2648 = new Integer(371943306);
        term2650 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2608;
        args[1] = term2648;
        args[2] = term2650;
        callMethod(klass, "scaleImage", argTypes, null, args);
    }

};


