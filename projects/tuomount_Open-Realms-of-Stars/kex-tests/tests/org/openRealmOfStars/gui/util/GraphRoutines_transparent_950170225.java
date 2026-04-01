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

public class GraphRoutines_transparent_950170225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652;
     Object term2692;

    public GraphRoutines_transparent_950170225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2652 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2654 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2663 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2672 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2681 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2682 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2683 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2686 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2652, term2652.getClass(), "imageType", -159494544);
        setField(term2652, term2652.getClass(), "colorModel", null);
        setField(term2654, term2654.getClass(), "sampleModel", null);
        setField(term2654, term2654.getClass(), "dataBuffer", null);
        setIntField(term2654, term2654.getClass(), "minX", -75206835);
        setIntField(term2654, term2654.getClass(), "minY", -1618206977);
        setIntField(term2654, term2654.getClass(), "width", -1747406163);
        setIntField(term2654, term2654.getClass(), "height", 388157121);
        setIntField(term2654, term2654.getClass(), "sampleModelTranslateX", 1684998508);
        setIntField(term2654, term2654.getClass(), "sampleModelTranslateY", -1476644457);
        setIntField(term2654, term2654.getClass(), "numBands", 1270666529);
        setIntField(term2654, term2654.getClass(), "numDataElements", -1146679443);
        setField(term2663, term2663.getClass(), "sampleModel", null);
        setField(term2663, term2663.getClass(), "dataBuffer", null);
        setIntField(term2663, term2663.getClass(), "minX", -860131894);
        setIntField(term2663, term2663.getClass(), "minY", -1022990421);
        setIntField(term2663, term2663.getClass(), "width", 1045547089);
        setIntField(term2663, term2663.getClass(), "height", -1122880881);
        setIntField(term2663, term2663.getClass(), "sampleModelTranslateX", -542712742);
        setIntField(term2663, term2663.getClass(), "sampleModelTranslateY", -1254072822);
        setIntField(term2663, term2663.getClass(), "numBands", -1111249833);
        setIntField(term2663, term2663.getClass(), "numDataElements", -1692331299);
        setField(term2672, term2672.getClass(), "sampleModel", null);
        setField(term2672, term2672.getClass(), "dataBuffer", null);
        setIntField(term2672, term2672.getClass(), "minX", 0);
        setIntField(term2672, term2672.getClass(), "minY", 0);
        setIntField(term2672, term2672.getClass(), "width", 0);
        setIntField(term2672, term2672.getClass(), "height", 0);
        setIntField(term2672, term2672.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2672, term2672.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2672, term2672.getClass(), "numBands", 0);
        setIntField(term2672, term2672.getClass(), "numDataElements", 0);
        setField(term2672, term2672.getClass(), "parent", null);
        setField(term2663, term2663.getClass(), "parent", term2672);
        setField(term2654, term2654.getClass(), "parent", term2663);
        setField(term2652, term2652.getClass(), "raster", term2654);
        setField(term2652, term2652.getClass(), "osis", null);
        setIntField(term2683, term2683.getClass(), "hash", 1708453609);
        setField(term2683, term2683.getClass(), "key", "");
        setField(term2683, term2683.getClass(), "value", term2686);
        setField(term2683, term2683.getClass(), "next", null);
        setElement(term2682, 5, term2683);
        setField(term2681, term2681.getClass(), "table", term2682);
        setIntField(term2681, term2681.getClass(), "count", 1);
        setIntField(term2681, term2681.getClass(), "threshold", 8);
        setFloatField(term2681, term2681.getClass(), "loadFactor", 0.75F);
        setIntField(term2681, term2681.getClass(), "modCount", 1);
        setField(term2681, term2681.getClass(), "keySet", null);
        setField(term2681, term2681.getClass(), "entrySet", null);
        setField(term2681, term2681.getClass(), "values", null);
        setField(term2652, term2652.getClass(), "properties", term2681);
        setFloatField(term2652, term2652.getClass(), "accelerationPriority", 0.13906479F);
        setField(term2652, term2652.getClass(), "surfaceManager", null);
        term2692 = new Integer(1320570890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2652;
        args[1] = term2692;
        callMethod(klass, "transparent", argTypes, null, args);
    }

};


