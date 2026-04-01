package org.openRealmOfStars.gui.graphs;

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
import static org.openRealmOfStars.gui.graphs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BridgeGraph_getName_1053146014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;

    public BridgeGraph_getName_1053146014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238 = newInstance(Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph"));
        Object term239 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term241 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term250 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term259 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term268 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term269 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term270 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term239, term239.getClass(), "imageType", 493620644);
        setField(term239, term239.getClass(), "colorModel", null);
        setField(term241, term241.getClass(), "sampleModel", null);
        setField(term241, term241.getClass(), "dataBuffer", null);
        setIntField(term241, term241.getClass(), "minX", 1328271830);
        setIntField(term241, term241.getClass(), "minY", 1596070772);
        setIntField(term241, term241.getClass(), "width", 97029295);
        setIntField(term241, term241.getClass(), "height", -1371869594);
        setIntField(term241, term241.getClass(), "sampleModelTranslateX", -2095575670);
        setIntField(term241, term241.getClass(), "sampleModelTranslateY", 1225272962);
        setIntField(term241, term241.getClass(), "numBands", 1324040357);
        setIntField(term241, term241.getClass(), "numDataElements", -1588772968);
        setField(term250, term250.getClass(), "sampleModel", null);
        setField(term250, term250.getClass(), "dataBuffer", null);
        setIntField(term250, term250.getClass(), "minX", -93135961);
        setIntField(term250, term250.getClass(), "minY", -112921587);
        setIntField(term250, term250.getClass(), "width", 933028652);
        setIntField(term250, term250.getClass(), "height", 287287233);
        setIntField(term250, term250.getClass(), "sampleModelTranslateX", 962840079);
        setIntField(term250, term250.getClass(), "sampleModelTranslateY", 1540719661);
        setIntField(term250, term250.getClass(), "numBands", 1265463001);
        setIntField(term250, term250.getClass(), "numDataElements", 335112684);
        setField(term259, term259.getClass(), "sampleModel", null);
        setField(term259, term259.getClass(), "dataBuffer", null);
        setIntField(term259, term259.getClass(), "minX", 0);
        setIntField(term259, term259.getClass(), "minY", 0);
        setIntField(term259, term259.getClass(), "width", 0);
        setIntField(term259, term259.getClass(), "height", 0);
        setIntField(term259, term259.getClass(), "sampleModelTranslateX", 0);
        setIntField(term259, term259.getClass(), "sampleModelTranslateY", 0);
        setIntField(term259, term259.getClass(), "numBands", 0);
        setIntField(term259, term259.getClass(), "numDataElements", 0);
        setField(term259, term259.getClass(), "parent", null);
        setField(term250, term250.getClass(), "parent", term259);
        setField(term241, term241.getClass(), "parent", term250);
        setField(term239, term239.getClass(), "raster", term241);
        setField(term239, term239.getClass(), "osis", null);
        setIntField(term270, term270.getClass(), "hash", 1581343183);
        setField(term270, term270.getClass(), "key", null);
        setField(term270, term270.getClass(), "value", null);
        setField(term270, term270.getClass(), "next", null);
        setElement(term269, 2, term270);
        setField(term268, term268.getClass(), "table", term269);
        setIntField(term268, term268.getClass(), "count", 1);
        setIntField(term268, term268.getClass(), "threshold", 8);
        setFloatField(term268, term268.getClass(), "loadFactor", 0.75F);
        setIntField(term268, term268.getClass(), "modCount", 1);
        setField(term268, term268.getClass(), "keySet", null);
        setField(term268, term268.getClass(), "entrySet", null);
        setField(term268, term268.getClass(), "values", null);
        setField(term239, term239.getClass(), "properties", term268);
        setFloatField(term239, term239.getClass(), "accelerationPriority", 0.09123778F);
        setField(term239, term239.getClass(), "surfaceManager", null);
        setField(term238, term238.getClass(), "bridgeImage", term239);
        setIntField(term238, term238.getClass(), "yOffset", -2027534003);
        setField(term238, term238.getClass(), "name", "RMFIsYGgne");
        setBooleanField(term238, term238.getClass(), "customImage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term238, args);
    }

};


