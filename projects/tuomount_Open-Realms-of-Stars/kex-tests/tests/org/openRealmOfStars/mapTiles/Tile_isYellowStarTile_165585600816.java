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

public class Tile_isYellowStarTile_165585600816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;

    public Tile_isYellowStarTile_165585600816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1259 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1261 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1270 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1279 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1288 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1289 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1290 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1259, term1259.getClass(), "imageType", -1972436591);
        setField(term1259, term1259.getClass(), "colorModel", null);
        setField(term1261, term1261.getClass(), "sampleModel", null);
        setField(term1261, term1261.getClass(), "dataBuffer", null);
        setIntField(term1261, term1261.getClass(), "minX", 68922753);
        setIntField(term1261, term1261.getClass(), "minY", -220791533);
        setIntField(term1261, term1261.getClass(), "width", 1741500243);
        setIntField(term1261, term1261.getClass(), "height", -2070466617);
        setIntField(term1261, term1261.getClass(), "sampleModelTranslateX", -1127721881);
        setIntField(term1261, term1261.getClass(), "sampleModelTranslateY", 1074848808);
        setIntField(term1261, term1261.getClass(), "numBands", -146054762);
        setIntField(term1261, term1261.getClass(), "numDataElements", 798043553);
        setField(term1270, term1270.getClass(), "sampleModel", null);
        setField(term1270, term1270.getClass(), "dataBuffer", null);
        setIntField(term1270, term1270.getClass(), "minX", 533197381);
        setIntField(term1270, term1270.getClass(), "minY", 1048271679);
        setIntField(term1270, term1270.getClass(), "width", -1529797673);
        setIntField(term1270, term1270.getClass(), "height", -868676396);
        setIntField(term1270, term1270.getClass(), "sampleModelTranslateX", 1922684808);
        setIntField(term1270, term1270.getClass(), "sampleModelTranslateY", -2005784375);
        setIntField(term1270, term1270.getClass(), "numBands", -288604325);
        setIntField(term1270, term1270.getClass(), "numDataElements", -1268314569);
        setField(term1279, term1279.getClass(), "sampleModel", null);
        setField(term1279, term1279.getClass(), "dataBuffer", null);
        setIntField(term1279, term1279.getClass(), "minX", 0);
        setIntField(term1279, term1279.getClass(), "minY", 0);
        setIntField(term1279, term1279.getClass(), "width", 0);
        setIntField(term1279, term1279.getClass(), "height", 0);
        setIntField(term1279, term1279.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1279, term1279.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1279, term1279.getClass(), "numBands", 0);
        setIntField(term1279, term1279.getClass(), "numDataElements", 0);
        setField(term1279, term1279.getClass(), "parent", null);
        setField(term1270, term1270.getClass(), "parent", term1279);
        setField(term1261, term1261.getClass(), "parent", term1270);
        setField(term1259, term1259.getClass(), "raster", term1261);
        setField(term1259, term1259.getClass(), "osis", null);
        setIntField(term1290, term1290.getClass(), "hash", -695597510);
        setField(term1290, term1290.getClass(), "key", null);
        setField(term1290, term1290.getClass(), "value", null);
        setField(term1290, term1290.getClass(), "next", null);
        setElement(term1289, 10, term1290);
        setField(term1288, term1288.getClass(), "table", term1289);
        setIntField(term1288, term1288.getClass(), "count", 1);
        setIntField(term1288, term1288.getClass(), "threshold", 8);
        setFloatField(term1288, term1288.getClass(), "loadFactor", 0.75F);
        setIntField(term1288, term1288.getClass(), "modCount", 1);
        setField(term1288, term1288.getClass(), "keySet", null);
        setField(term1288, term1288.getClass(), "entrySet", null);
        setField(term1288, term1288.getClass(), "values", null);
        setField(term1259, term1259.getClass(), "properties", term1288);
        setFloatField(term1259, term1259.getClass(), "accelerationPriority", 0.13906479F);
        setField(term1259, term1259.getClass(), "surfaceManager", null);
        setField(term1258, term1258.getClass(), "img", term1259);
        setField(term1258, term1258.getClass(), "name", "hxCBltsObl");
        setIntField(term1258, term1258.getClass(), "tileIndex", -1332748804);
        setIntField(term1258, term1258.getClass(), "nextAnimIndex", 1774507971);
        setField(term1258, term1258.getClass(), "tileDescription", "BndsHwAFMv");
        setIntField(term1258, term1258.getClass(), "zoomLevel", -1420269858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isYellowStarTile", argTypes, term1258, args);
    }

};


