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

public class Tile_toString_101915468325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2032;

    public Tile_toString_101915468325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2032 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term2033 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2035 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2044 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2053 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2062 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2063 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2064 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term2033, term2033.getClass(), "imageType", 1956590498);
        setField(term2033, term2033.getClass(), "colorModel", null);
        setField(term2035, term2035.getClass(), "sampleModel", null);
        setField(term2035, term2035.getClass(), "dataBuffer", null);
        setIntField(term2035, term2035.getClass(), "minX", 1467356494);
        setIntField(term2035, term2035.getClass(), "minY", -26316536);
        setIntField(term2035, term2035.getClass(), "width", 1716165145);
        setIntField(term2035, term2035.getClass(), "height", 1692937831);
        setIntField(term2035, term2035.getClass(), "sampleModelTranslateX", -1539747985);
        setIntField(term2035, term2035.getClass(), "sampleModelTranslateY", -1982489643);
        setIntField(term2035, term2035.getClass(), "numBands", 550892835);
        setIntField(term2035, term2035.getClass(), "numDataElements", 1237549886);
        setField(term2044, term2044.getClass(), "sampleModel", null);
        setField(term2044, term2044.getClass(), "dataBuffer", null);
        setIntField(term2044, term2044.getClass(), "minX", -1945635750);
        setIntField(term2044, term2044.getClass(), "minY", -1622760744);
        setIntField(term2044, term2044.getClass(), "width", 2068435279);
        setIntField(term2044, term2044.getClass(), "height", -1556527718);
        setIntField(term2044, term2044.getClass(), "sampleModelTranslateX", 895255351);
        setIntField(term2044, term2044.getClass(), "sampleModelTranslateY", -1317044799);
        setIntField(term2044, term2044.getClass(), "numBands", -1428063820);
        setIntField(term2044, term2044.getClass(), "numDataElements", -1271375703);
        setField(term2053, term2053.getClass(), "sampleModel", null);
        setField(term2053, term2053.getClass(), "dataBuffer", null);
        setIntField(term2053, term2053.getClass(), "minX", 0);
        setIntField(term2053, term2053.getClass(), "minY", 0);
        setIntField(term2053, term2053.getClass(), "width", 0);
        setIntField(term2053, term2053.getClass(), "height", 0);
        setIntField(term2053, term2053.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2053, term2053.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2053, term2053.getClass(), "numBands", 0);
        setIntField(term2053, term2053.getClass(), "numDataElements", 0);
        setField(term2053, term2053.getClass(), "parent", null);
        setField(term2044, term2044.getClass(), "parent", term2053);
        setField(term2035, term2035.getClass(), "parent", term2044);
        setField(term2033, term2033.getClass(), "raster", term2035);
        setField(term2033, term2033.getClass(), "osis", null);
        setIntField(term2064, term2064.getClass(), "hash", 1680105093);
        setField(term2064, term2064.getClass(), "key", null);
        setField(term2064, term2064.getClass(), "value", null);
        setField(term2064, term2064.getClass(), "next", null);
        setElement(term2063, 7, term2064);
        setField(term2062, term2062.getClass(), "table", term2063);
        setIntField(term2062, term2062.getClass(), "count", 1);
        setIntField(term2062, term2062.getClass(), "threshold", 8);
        setFloatField(term2062, term2062.getClass(), "loadFactor", 0.75F);
        setIntField(term2062, term2062.getClass(), "modCount", 1);
        setField(term2062, term2062.getClass(), "keySet", null);
        setField(term2062, term2062.getClass(), "entrySet", null);
        setField(term2062, term2062.getClass(), "values", null);
        setField(term2033, term2033.getClass(), "properties", term2062);
        setFloatField(term2033, term2033.getClass(), "accelerationPriority", 0.76550204F);
        setField(term2033, term2033.getClass(), "surfaceManager", null);
        setField(term2032, term2032.getClass(), "img", term2033);
        setField(term2032, term2032.getClass(), "name", "whBvTVIIlC");
        setIntField(term2032, term2032.getClass(), "tileIndex", -1220630391);
        setIntField(term2032, term2032.getClass(), "nextAnimIndex", -995822131);
        setField(term2032, term2032.getClass(), "tileDescription", "IgRJUzaCwW");
        setIntField(term2032, term2032.getClass(), "zoomLevel", -687282231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2032, args);
    }

};


