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

public class Tile_getRawTile_152105326026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2118;

    public Tile_getRawTile_152105326026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2118 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term2119 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2121 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2130 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2139 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2148 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2149 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2150 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term2119, term2119.getClass(), "imageType", 40571662);
        setField(term2119, term2119.getClass(), "colorModel", null);
        setField(term2121, term2121.getClass(), "sampleModel", null);
        setField(term2121, term2121.getClass(), "dataBuffer", null);
        setIntField(term2121, term2121.getClass(), "minX", 1863910269);
        setIntField(term2121, term2121.getClass(), "minY", 864645689);
        setIntField(term2121, term2121.getClass(), "width", 279384872);
        setIntField(term2121, term2121.getClass(), "height", 1427305953);
        setIntField(term2121, term2121.getClass(), "sampleModelTranslateX", -781832877);
        setIntField(term2121, term2121.getClass(), "sampleModelTranslateY", 797203987);
        setIntField(term2121, term2121.getClass(), "numBands", 1973060703);
        setIntField(term2121, term2121.getClass(), "numDataElements", -138239905);
        setField(term2130, term2130.getClass(), "sampleModel", null);
        setField(term2130, term2130.getClass(), "dataBuffer", null);
        setIntField(term2130, term2130.getClass(), "minX", 1709474063);
        setIntField(term2130, term2130.getClass(), "minY", 1406617209);
        setIntField(term2130, term2130.getClass(), "width", 1706047059);
        setIntField(term2130, term2130.getClass(), "height", 590451710);
        setIntField(term2130, term2130.getClass(), "sampleModelTranslateX", -1999787419);
        setIntField(term2130, term2130.getClass(), "sampleModelTranslateY", -1224443634);
        setIntField(term2130, term2130.getClass(), "numBands", 1048451946);
        setIntField(term2130, term2130.getClass(), "numDataElements", 5603560);
        setField(term2139, term2139.getClass(), "sampleModel", null);
        setField(term2139, term2139.getClass(), "dataBuffer", null);
        setIntField(term2139, term2139.getClass(), "minX", 0);
        setIntField(term2139, term2139.getClass(), "minY", 0);
        setIntField(term2139, term2139.getClass(), "width", 0);
        setIntField(term2139, term2139.getClass(), "height", 0);
        setIntField(term2139, term2139.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2139, term2139.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2139, term2139.getClass(), "numBands", 0);
        setIntField(term2139, term2139.getClass(), "numDataElements", 0);
        setField(term2139, term2139.getClass(), "parent", null);
        setField(term2130, term2130.getClass(), "parent", term2139);
        setField(term2121, term2121.getClass(), "parent", term2130);
        setField(term2119, term2119.getClass(), "raster", term2121);
        setField(term2119, term2119.getClass(), "osis", null);
        setIntField(term2150, term2150.getClass(), "hash", -275632499);
        setField(term2150, term2150.getClass(), "key", null);
        setField(term2150, term2150.getClass(), "value", null);
        setField(term2150, term2150.getClass(), "next", null);
        setElement(term2149, 3, term2150);
        setField(term2148, term2148.getClass(), "table", term2149);
        setIntField(term2148, term2148.getClass(), "count", 1);
        setIntField(term2148, term2148.getClass(), "threshold", 8);
        setFloatField(term2148, term2148.getClass(), "loadFactor", 0.75F);
        setIntField(term2148, term2148.getClass(), "modCount", 1);
        setField(term2148, term2148.getClass(), "keySet", null);
        setField(term2148, term2148.getClass(), "entrySet", null);
        setField(term2148, term2148.getClass(), "values", null);
        setField(term2119, term2119.getClass(), "properties", term2148);
        setFloatField(term2119, term2119.getClass(), "accelerationPriority", 0.26441735F);
        setField(term2119, term2119.getClass(), "surfaceManager", null);
        setField(term2118, term2118.getClass(), "img", term2119);
        setField(term2118, term2118.getClass(), "name", "KoyGrUJeJW");
        setIntField(term2118, term2118.getClass(), "tileIndex", -1973791064);
        setIntField(term2118, term2118.getClass(), "nextAnimIndex", -2072158633);
        setField(term2118, term2118.getClass(), "tileDescription", "HqBOwkVqjD");
        setIntField(term2118, term2118.getClass(), "zoomLevel", -355469363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawTile", argTypes, term2118, args);
    }

};


