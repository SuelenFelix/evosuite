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

public class ProceduralRenderer_putPixel_20283097544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;
     Object term1265;
     Object term1267;
     Object term1269;

    public ProceduralRenderer_putPixel_20283097544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1227 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1236 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1245 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1254 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1255 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1256 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1259 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1225, term1225.getClass(), "imageType", 933028652);
        setField(term1225, term1225.getClass(), "colorModel", null);
        setField(term1227, term1227.getClass(), "sampleModel", null);
        setField(term1227, term1227.getClass(), "dataBuffer", null);
        setIntField(term1227, term1227.getClass(), "minX", 287287233);
        setIntField(term1227, term1227.getClass(), "minY", 962840079);
        setIntField(term1227, term1227.getClass(), "width", 1540719661);
        setIntField(term1227, term1227.getClass(), "height", 1265463001);
        setIntField(term1227, term1227.getClass(), "sampleModelTranslateX", 335112684);
        setIntField(term1227, term1227.getClass(), "sampleModelTranslateY", 1551099402);
        setIntField(term1227, term1227.getClass(), "numBands", -2027534003);
        setIntField(term1227, term1227.getClass(), "numDataElements", 1063420942);
        setField(term1236, term1236.getClass(), "sampleModel", null);
        setField(term1236, term1236.getClass(), "dataBuffer", null);
        setIntField(term1236, term1236.getClass(), "minX", 1375330971);
        setIntField(term1236, term1236.getClass(), "minY", -478195677);
        setIntField(term1236, term1236.getClass(), "width", 972867650);
        setIntField(term1236, term1236.getClass(), "height", 1655935355);
        setIntField(term1236, term1236.getClass(), "sampleModelTranslateX", -481533957);
        setIntField(term1236, term1236.getClass(), "sampleModelTranslateY", 1240914516);
        setIntField(term1236, term1236.getClass(), "numBands", -1465035361);
        setIntField(term1236, term1236.getClass(), "numDataElements", 1090617576);
        setField(term1245, term1245.getClass(), "sampleModel", null);
        setField(term1245, term1245.getClass(), "dataBuffer", null);
        setIntField(term1245, term1245.getClass(), "minX", 0);
        setIntField(term1245, term1245.getClass(), "minY", 0);
        setIntField(term1245, term1245.getClass(), "width", 0);
        setIntField(term1245, term1245.getClass(), "height", 0);
        setIntField(term1245, term1245.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1245, term1245.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1245, term1245.getClass(), "numBands", 0);
        setIntField(term1245, term1245.getClass(), "numDataElements", 0);
        setField(term1245, term1245.getClass(), "parent", null);
        setField(term1236, term1236.getClass(), "parent", term1245);
        setField(term1227, term1227.getClass(), "parent", term1236);
        setField(term1225, term1225.getClass(), "raster", term1227);
        setField(term1225, term1225.getClass(), "osis", null);
        setIntField(term1256, term1256.getClass(), "hash", -186957215);
        setField(term1256, term1256.getClass(), "key", "");
        setField(term1256, term1256.getClass(), "value", term1259);
        setField(term1256, term1256.getClass(), "next", null);
        setElement(term1255, 8, term1256);
        setField(term1254, term1254.getClass(), "table", term1255);
        setIntField(term1254, term1254.getClass(), "count", 1);
        setIntField(term1254, term1254.getClass(), "threshold", 8);
        setFloatField(term1254, term1254.getClass(), "loadFactor", 0.75F);
        setIntField(term1254, term1254.getClass(), "modCount", 1);
        setField(term1254, term1254.getClass(), "keySet", null);
        setField(term1254, term1254.getClass(), "entrySet", null);
        setField(term1254, term1254.getClass(), "values", null);
        setField(term1225, term1225.getClass(), "properties", term1254);
        setFloatField(term1225, term1225.getClass(), "accelerationPriority", 0.09123778F);
        setField(term1225, term1225.getClass(), "surfaceManager", null);
        term1265 = new Integer(1442160736);
        term1267 = new Integer(1114000454);
        term1269 = new Integer(-556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1225;
        args[1] = term1265;
        args[2] = term1267;
        args[3] = term1269;
        callMethod(klass, "putPixel", argTypes, null, args);
    }

};


