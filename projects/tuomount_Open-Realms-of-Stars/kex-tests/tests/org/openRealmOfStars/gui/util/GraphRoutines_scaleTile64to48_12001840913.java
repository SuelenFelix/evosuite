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

public class GraphRoutines_scaleTile64to48_12001840913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566;
     Object term2606;

    public GraphRoutines_scaleTile64to48_12001840913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2566 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2568 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2577 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2586 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2595 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2596 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2597 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2600 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2566, term2566.getClass(), "imageType", -506958186);
        setField(term2566, term2566.getClass(), "colorModel", null);
        setField(term2568, term2568.getClass(), "sampleModel", null);
        setField(term2568, term2568.getClass(), "dataBuffer", null);
        setIntField(term2568, term2568.getClass(), "minX", -507387516);
        setIntField(term2568, term2568.getClass(), "minY", -1970452551);
        setIntField(term2568, term2568.getClass(), "width", -1896376975);
        setIntField(term2568, term2568.getClass(), "height", 729658803);
        setIntField(term2568, term2568.getClass(), "sampleModelTranslateX", 114754804);
        setIntField(term2568, term2568.getClass(), "sampleModelTranslateY", 1687361082);
        setIntField(term2568, term2568.getClass(), "numBands", 584893196);
        setIntField(term2568, term2568.getClass(), "numDataElements", 497269071);
        setField(term2577, term2577.getClass(), "sampleModel", null);
        setField(term2577, term2577.getClass(), "dataBuffer", null);
        setIntField(term2577, term2577.getClass(), "minX", -1899301124);
        setIntField(term2577, term2577.getClass(), "minY", -1882480155);
        setIntField(term2577, term2577.getClass(), "width", -1410220680);
        setIntField(term2577, term2577.getClass(), "height", 389427431);
        setIntField(term2577, term2577.getClass(), "sampleModelTranslateX", -1945706126);
        setIntField(term2577, term2577.getClass(), "sampleModelTranslateY", 1152356969);
        setIntField(term2577, term2577.getClass(), "numBands", -1667990367);
        setIntField(term2577, term2577.getClass(), "numDataElements", -1214628358);
        setField(term2586, term2586.getClass(), "sampleModel", null);
        setField(term2586, term2586.getClass(), "dataBuffer", null);
        setIntField(term2586, term2586.getClass(), "minX", 0);
        setIntField(term2586, term2586.getClass(), "minY", 0);
        setIntField(term2586, term2586.getClass(), "width", 0);
        setIntField(term2586, term2586.getClass(), "height", 0);
        setIntField(term2586, term2586.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2586, term2586.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2586, term2586.getClass(), "numBands", 0);
        setIntField(term2586, term2586.getClass(), "numDataElements", 0);
        setField(term2586, term2586.getClass(), "parent", null);
        setField(term2577, term2577.getClass(), "parent", term2586);
        setField(term2568, term2568.getClass(), "parent", term2577);
        setField(term2566, term2566.getClass(), "raster", term2568);
        setField(term2566, term2566.getClass(), "osis", null);
        setIntField(term2597, term2597.getClass(), "hash", -1771471902);
        setField(term2597, term2597.getClass(), "key", "");
        setField(term2597, term2597.getClass(), "value", term2600);
        setField(term2597, term2597.getClass(), "next", null);
        setElement(term2596, 0, term2597);
        setField(term2595, term2595.getClass(), "table", term2596);
        setIntField(term2595, term2595.getClass(), "count", 1);
        setIntField(term2595, term2595.getClass(), "threshold", 8);
        setFloatField(term2595, term2595.getClass(), "loadFactor", 0.75F);
        setIntField(term2595, term2595.getClass(), "modCount", 1);
        setField(term2595, term2595.getClass(), "keySet", null);
        setField(term2595, term2595.getClass(), "entrySet", null);
        setField(term2595, term2595.getClass(), "values", null);
        setField(term2566, term2566.getClass(), "properties", term2595);
        setFloatField(term2566, term2566.getClass(), "accelerationPriority", 0.7944024F);
        setField(term2566, term2566.getClass(), "surfaceManager", null);
        term2606 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2566;
        args[1] = term2606;
        callMethod(klass, "scaleTile64to48", argTypes, null, args);
    }

};


