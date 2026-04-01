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

public class BridgeGraph_isCustomImage_21374141292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public BridgeGraph_isCustomImage_21374141292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph"));
        Object term113 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term115 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term124 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term133 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term142 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term143 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term144 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term113, term113.getClass(), "imageType", -655067527);
        setField(term113, term113.getClass(), "colorModel", null);
        setField(term115, term115.getClass(), "sampleModel", null);
        setField(term115, term115.getClass(), "dataBuffer", null);
        setIntField(term115, term115.getClass(), "minX", -6029667);
        setIntField(term115, term115.getClass(), "minY", -2068769794);
        setIntField(term115, term115.getClass(), "width", -117576464);
        setIntField(term115, term115.getClass(), "height", -1007160944);
        setIntField(term115, term115.getClass(), "sampleModelTranslateX", 1135664017);
        setIntField(term115, term115.getClass(), "sampleModelTranslateY", 590364439);
        setIntField(term115, term115.getClass(), "numBands", 865208305);
        setIntField(term115, term115.getClass(), "numDataElements", -1275173084);
        setField(term124, term124.getClass(), "sampleModel", null);
        setField(term124, term124.getClass(), "dataBuffer", null);
        setIntField(term124, term124.getClass(), "minX", -244121226);
        setIntField(term124, term124.getClass(), "minY", -203030934);
        setIntField(term124, term124.getClass(), "width", -1179120542);
        setIntField(term124, term124.getClass(), "height", -73683645);
        setIntField(term124, term124.getClass(), "sampleModelTranslateX", -226514366);
        setIntField(term124, term124.getClass(), "sampleModelTranslateY", 1193880199);
        setIntField(term124, term124.getClass(), "numBands", -1087774327);
        setIntField(term124, term124.getClass(), "numDataElements", -1530420153);
        setField(term133, term133.getClass(), "sampleModel", null);
        setField(term133, term133.getClass(), "dataBuffer", null);
        setIntField(term133, term133.getClass(), "minX", 0);
        setIntField(term133, term133.getClass(), "minY", 0);
        setIntField(term133, term133.getClass(), "width", 0);
        setIntField(term133, term133.getClass(), "height", 0);
        setIntField(term133, term133.getClass(), "sampleModelTranslateX", 0);
        setIntField(term133, term133.getClass(), "sampleModelTranslateY", 0);
        setIntField(term133, term133.getClass(), "numBands", 0);
        setIntField(term133, term133.getClass(), "numDataElements", 0);
        setField(term133, term133.getClass(), "parent", null);
        setField(term124, term124.getClass(), "parent", term133);
        setField(term115, term115.getClass(), "parent", term124);
        setField(term113, term113.getClass(), "raster", term115);
        setField(term113, term113.getClass(), "osis", null);
        setIntField(term144, term144.getClass(), "hash", -1893846662);
        setField(term144, term144.getClass(), "key", null);
        setField(term144, term144.getClass(), "value", null);
        setField(term144, term144.getClass(), "next", null);
        setElement(term143, 9, term144);
        setField(term142, term142.getClass(), "table", term143);
        setIntField(term142, term142.getClass(), "count", 1);
        setIntField(term142, term142.getClass(), "threshold", 8);
        setFloatField(term142, term142.getClass(), "loadFactor", 0.75F);
        setIntField(term142, term142.getClass(), "modCount", 1);
        setField(term142, term142.getClass(), "keySet", null);
        setField(term142, term142.getClass(), "entrySet", null);
        setField(term142, term142.getClass(), "values", null);
        setField(term113, term113.getClass(), "properties", term142);
        setFloatField(term113, term113.getClass(), "accelerationPriority", 0.2707036F);
        setField(term113, term113.getClass(), "surfaceManager", null);
        setField(term112, term112.getClass(), "bridgeImage", term113);
        setIntField(term112, term112.getClass(), "yOffset", -1145578966);
        setField(term112, term112.getClass(), "name", "EGtDIRbSSb");
        setBooleanField(term112, term112.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCustomImage", argTypes, term112, args);
    }

};


