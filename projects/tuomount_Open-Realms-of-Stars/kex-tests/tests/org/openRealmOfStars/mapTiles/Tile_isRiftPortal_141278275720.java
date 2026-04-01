package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tile_isRiftPortal_141278275720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;

    public Tile_isRiftPortal_141278275720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1602 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1603 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1605 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1614 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1623 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1632 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1633 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1634 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1603, term1603.getClass(), "imageType", 1496340209);
        setField(term1603, term1603.getClass(), "colorModel", null);
        setField(term1605, term1605.getClass(), "sampleModel", null);
        setField(term1605, term1605.getClass(), "dataBuffer", null);
        setIntField(term1605, term1605.getClass(), "minX", -1748391876);
        setIntField(term1605, term1605.getClass(), "minY", 43258317);
        setIntField(term1605, term1605.getClass(), "width", 1707220033);
        setIntField(term1605, term1605.getClass(), "height", -1792504217);
        setIntField(term1605, term1605.getClass(), "sampleModelTranslateX", 1824538861);
        setIntField(term1605, term1605.getClass(), "sampleModelTranslateY", 499519708);
        setIntField(term1605, term1605.getClass(), "numBands", 1501165033);
        setIntField(term1605, term1605.getClass(), "numDataElements", 510162332);
        setField(term1614, term1614.getClass(), "sampleModel", null);
        setField(term1614, term1614.getClass(), "dataBuffer", null);
        setIntField(term1614, term1614.getClass(), "minX", 888506903);
        setIntField(term1614, term1614.getClass(), "minY", 200252898);
        setIntField(term1614, term1614.getClass(), "width", -1831826725);
        setIntField(term1614, term1614.getClass(), "height", 752152965);
        setIntField(term1614, term1614.getClass(), "sampleModelTranslateX", -1577069773);
        setIntField(term1614, term1614.getClass(), "sampleModelTranslateY", -266625190);
        setIntField(term1614, term1614.getClass(), "numBands", 489201218);
        setIntField(term1614, term1614.getClass(), "numDataElements", 464181937);
        setField(term1623, term1623.getClass(), "sampleModel", null);
        setField(term1623, term1623.getClass(), "dataBuffer", null);
        setIntField(term1623, term1623.getClass(), "minX", 0);
        setIntField(term1623, term1623.getClass(), "minY", 0);
        setIntField(term1623, term1623.getClass(), "width", 0);
        setIntField(term1623, term1623.getClass(), "height", 0);
        setIntField(term1623, term1623.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1623, term1623.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1623, term1623.getClass(), "numBands", 0);
        setIntField(term1623, term1623.getClass(), "numDataElements", 0);
        setField(term1623, term1623.getClass(), "parent", null);
        setField(term1614, term1614.getClass(), "parent", term1623);
        setField(term1605, term1605.getClass(), "parent", term1614);
        setField(term1603, term1603.getClass(), "raster", term1605);
        setField(term1603, term1603.getClass(), "osis", null);
        setIntField(term1634, term1634.getClass(), "hash", -702046323);
        setField(term1634, term1634.getClass(), "key", null);
        setField(term1634, term1634.getClass(), "value", null);
        setField(term1634, term1634.getClass(), "next", null);
        setElement(term1633, 2, term1634);
        setField(term1632, term1632.getClass(), "table", term1633);
        setIntField(term1632, term1632.getClass(), "count", 1);
        setIntField(term1632, term1632.getClass(), "threshold", 8);
        setFloatField(term1632, term1632.getClass(), "loadFactor", 0.75F);
        setIntField(term1632, term1632.getClass(), "modCount", 1);
        setField(term1632, term1632.getClass(), "keySet", null);
        setField(term1632, term1632.getClass(), "entrySet", null);
        setField(term1632, term1632.getClass(), "values", null);
        setField(term1603, term1603.getClass(), "properties", term1632);
        setFloatField(term1603, term1603.getClass(), "accelerationPriority", 0.24413109F);
        setField(term1603, term1603.getClass(), "surfaceManager", null);
        setField(term1602, term1602.getClass(), "img", term1603);
        setField(term1602, term1602.getClass(), "name", "YRHGsAkhxb");
        setIntField(term1602, term1602.getClass(), "tileIndex", -941356098);
        setIntField(term1602, term1602.getClass(), "nextAnimIndex", -201517446);
        setField(term1602, term1602.getClass(), "tileDescription", "ffYhPOzlUs");
        setIntField(term1602, term1602.getClass(), "zoomLevel", -97742366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRiftPortal", argTypes, term1602, args);
    }

};


