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

public class Tile_isSpaceAnomaly_166152750319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;

    public Tile_isSpaceAnomaly_166152750319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1517 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1519 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1528 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1537 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1546 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1547 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1548 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1517, term1517.getClass(), "imageType", 1988605357);
        setField(term1517, term1517.getClass(), "colorModel", null);
        setField(term1519, term1519.getClass(), "sampleModel", null);
        setField(term1519, term1519.getClass(), "dataBuffer", null);
        setIntField(term1519, term1519.getClass(), "minX", 808203320);
        setIntField(term1519, term1519.getClass(), "minY", -544382127);
        setIntField(term1519, term1519.getClass(), "width", -1830198043);
        setIntField(term1519, term1519.getClass(), "height", -439048495);
        setIntField(term1519, term1519.getClass(), "sampleModelTranslateX", -1849105286);
        setIntField(term1519, term1519.getClass(), "sampleModelTranslateY", 1334483645);
        setIntField(term1519, term1519.getClass(), "numBands", 917513193);
        setIntField(term1519, term1519.getClass(), "numDataElements", 787278105);
        setField(term1528, term1528.getClass(), "sampleModel", null);
        setField(term1528, term1528.getClass(), "dataBuffer", null);
        setIntField(term1528, term1528.getClass(), "minX", -2063843486);
        setIntField(term1528, term1528.getClass(), "minY", 833762980);
        setIntField(term1528, term1528.getClass(), "width", 320711637);
        setIntField(term1528, term1528.getClass(), "height", 1241164745);
        setIntField(term1528, term1528.getClass(), "sampleModelTranslateX", 1723148410);
        setIntField(term1528, term1528.getClass(), "sampleModelTranslateY", -920797484);
        setIntField(term1528, term1528.getClass(), "numBands", -1631697577);
        setIntField(term1528, term1528.getClass(), "numDataElements", 765731371);
        setField(term1537, term1537.getClass(), "sampleModel", null);
        setField(term1537, term1537.getClass(), "dataBuffer", null);
        setIntField(term1537, term1537.getClass(), "minX", 0);
        setIntField(term1537, term1537.getClass(), "minY", 0);
        setIntField(term1537, term1537.getClass(), "width", 0);
        setIntField(term1537, term1537.getClass(), "height", 0);
        setIntField(term1537, term1537.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1537, term1537.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1537, term1537.getClass(), "numBands", 0);
        setIntField(term1537, term1537.getClass(), "numDataElements", 0);
        setField(term1537, term1537.getClass(), "parent", null);
        setField(term1528, term1528.getClass(), "parent", term1537);
        setField(term1519, term1519.getClass(), "parent", term1528);
        setField(term1517, term1517.getClass(), "raster", term1519);
        setField(term1517, term1517.getClass(), "osis", null);
        setIntField(term1548, term1548.getClass(), "hash", -1902882447);
        setField(term1548, term1548.getClass(), "key", null);
        setField(term1548, term1548.getClass(), "value", null);
        setField(term1548, term1548.getClass(), "next", null);
        setElement(term1547, 9, term1548);
        setField(term1546, term1546.getClass(), "table", term1547);
        setIntField(term1546, term1546.getClass(), "count", 1);
        setIntField(term1546, term1546.getClass(), "threshold", 8);
        setFloatField(term1546, term1546.getClass(), "loadFactor", 0.75F);
        setIntField(term1546, term1546.getClass(), "modCount", 1);
        setField(term1546, term1546.getClass(), "keySet", null);
        setField(term1546, term1546.getClass(), "entrySet", null);
        setField(term1546, term1546.getClass(), "values", null);
        setField(term1517, term1517.getClass(), "properties", term1546);
        setFloatField(term1517, term1517.getClass(), "accelerationPriority", 0.37773192F);
        setField(term1517, term1517.getClass(), "surfaceManager", null);
        setField(term1516, term1516.getClass(), "img", term1517);
        setField(term1516, term1516.getClass(), "name", "UoYtihxVaS");
        setIntField(term1516, term1516.getClass(), "tileIndex", 765766290);
        setIntField(term1516, term1516.getClass(), "nextAnimIndex", -1284825282);
        setField(term1516, term1516.getClass(), "tileDescription", "JDswTTCZHV");
        setIntField(term1516, term1516.getClass(), "zoomLevel", -1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSpaceAnomaly", argTypes, term1516, args);
    }

};


