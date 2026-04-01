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

public class Tile_getIndex_125201347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;

    public Tile_getIndex_125201347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term459 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term461 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term470 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term479 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term488 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term489 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term490 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term459, term459.getClass(), "imageType", 96566506);
        setField(term459, term459.getClass(), "colorModel", null);
        setField(term461, term461.getClass(), "sampleModel", null);
        setField(term461, term461.getClass(), "dataBuffer", null);
        setIntField(term461, term461.getClass(), "minX", -343325701);
        setIntField(term461, term461.getClass(), "minY", 107945604);
        setIntField(term461, term461.getClass(), "width", -1963464809);
        setIntField(term461, term461.getClass(), "height", 71190297);
        setIntField(term461, term461.getClass(), "sampleModelTranslateX", 1202361360);
        setIntField(term461, term461.getClass(), "sampleModelTranslateY", -2015048153);
        setIntField(term461, term461.getClass(), "numBands", -2063457669);
        setIntField(term461, term461.getClass(), "numDataElements", -1222006000);
        setField(term470, term470.getClass(), "sampleModel", null);
        setField(term470, term470.getClass(), "dataBuffer", null);
        setIntField(term470, term470.getClass(), "minX", 2095798786);
        setIntField(term470, term470.getClass(), "minY", -1565502840);
        setIntField(term470, term470.getClass(), "width", 344323424);
        setIntField(term470, term470.getClass(), "height", 9726679);
        setIntField(term470, term470.getClass(), "sampleModelTranslateX", -25637976);
        setIntField(term470, term470.getClass(), "sampleModelTranslateY", 1555897383);
        setIntField(term470, term470.getClass(), "numBands", 202001407);
        setIntField(term470, term470.getClass(), "numDataElements", 158873461);
        setField(term479, term479.getClass(), "sampleModel", null);
        setField(term479, term479.getClass(), "dataBuffer", null);
        setIntField(term479, term479.getClass(), "minX", 0);
        setIntField(term479, term479.getClass(), "minY", 0);
        setIntField(term479, term479.getClass(), "width", 0);
        setIntField(term479, term479.getClass(), "height", 0);
        setIntField(term479, term479.getClass(), "sampleModelTranslateX", 0);
        setIntField(term479, term479.getClass(), "sampleModelTranslateY", 0);
        setIntField(term479, term479.getClass(), "numBands", 0);
        setIntField(term479, term479.getClass(), "numDataElements", 0);
        setField(term479, term479.getClass(), "parent", null);
        setField(term470, term470.getClass(), "parent", term479);
        setField(term461, term461.getClass(), "parent", term470);
        setField(term459, term459.getClass(), "raster", term461);
        setField(term459, term459.getClass(), "osis", null);
        setIntField(term490, term490.getClass(), "hash", -1117847647);
        setField(term490, term490.getClass(), "key", null);
        setField(term490, term490.getClass(), "value", null);
        setField(term490, term490.getClass(), "next", null);
        setElement(term489, 9, term490);
        setField(term488, term488.getClass(), "table", term489);
        setIntField(term488, term488.getClass(), "count", 1);
        setIntField(term488, term488.getClass(), "threshold", 8);
        setFloatField(term488, term488.getClass(), "loadFactor", 0.75F);
        setIntField(term488, term488.getClass(), "modCount", 1);
        setField(term488, term488.getClass(), "keySet", null);
        setField(term488, term488.getClass(), "entrySet", null);
        setField(term488, term488.getClass(), "values", null);
        setField(term459, term459.getClass(), "properties", term488);
        setFloatField(term459, term459.getClass(), "accelerationPriority", 0.5446086F);
        setField(term459, term459.getClass(), "surfaceManager", null);
        setField(term458, term458.getClass(), "img", term459);
        setField(term458, term458.getClass(), "name", "aJlieCFVtF");
        setIntField(term458, term458.getClass(), "tileIndex", -1697741339);
        setIntField(term458, term458.getClass(), "nextAnimIndex", 98922530);
        setField(term458, term458.getClass(), "tileDescription", "ZiaGIbnzTs");
        setIntField(term458, term458.getClass(), "zoomLevel", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term458, args);
    }

};


