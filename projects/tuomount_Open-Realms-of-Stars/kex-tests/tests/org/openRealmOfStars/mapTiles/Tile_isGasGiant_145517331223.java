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

public class Tile_isGasGiant_145517331223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860;

    public Tile_isGasGiant_145517331223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1860 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1861 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1863 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1872 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1881 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1890 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1891 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1892 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1861, term1861.getClass(), "imageType", 723812297);
        setField(term1861, term1861.getClass(), "colorModel", null);
        setField(term1863, term1863.getClass(), "sampleModel", null);
        setField(term1863, term1863.getClass(), "dataBuffer", null);
        setIntField(term1863, term1863.getClass(), "minX", 1639448749);
        setIntField(term1863, term1863.getClass(), "minY", 873659088);
        setIntField(term1863, term1863.getClass(), "width", -975748721);
        setIntField(term1863, term1863.getClass(), "height", 433248783);
        setIntField(term1863, term1863.getClass(), "sampleModelTranslateX", -507944154);
        setIntField(term1863, term1863.getClass(), "sampleModelTranslateY", -1736183862);
        setIntField(term1863, term1863.getClass(), "numBands", 897010381);
        setIntField(term1863, term1863.getClass(), "numDataElements", -15712667);
        setField(term1872, term1872.getClass(), "sampleModel", null);
        setField(term1872, term1872.getClass(), "dataBuffer", null);
        setIntField(term1872, term1872.getClass(), "minX", 1964967720);
        setIntField(term1872, term1872.getClass(), "minY", 1351900243);
        setIntField(term1872, term1872.getClass(), "width", -330897705);
        setIntField(term1872, term1872.getClass(), "height", 1065595802);
        setIntField(term1872, term1872.getClass(), "sampleModelTranslateX", 21031843);
        setIntField(term1872, term1872.getClass(), "sampleModelTranslateY", -380787857);
        setIntField(term1872, term1872.getClass(), "numBands", 319853052);
        setIntField(term1872, term1872.getClass(), "numDataElements", -1097563716);
        setField(term1881, term1881.getClass(), "sampleModel", null);
        setField(term1881, term1881.getClass(), "dataBuffer", null);
        setIntField(term1881, term1881.getClass(), "minX", 0);
        setIntField(term1881, term1881.getClass(), "minY", 0);
        setIntField(term1881, term1881.getClass(), "width", 0);
        setIntField(term1881, term1881.getClass(), "height", 0);
        setIntField(term1881, term1881.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1881, term1881.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1881, term1881.getClass(), "numBands", 0);
        setIntField(term1881, term1881.getClass(), "numDataElements", 0);
        setField(term1881, term1881.getClass(), "parent", null);
        setField(term1872, term1872.getClass(), "parent", term1881);
        setField(term1863, term1863.getClass(), "parent", term1872);
        setField(term1861, term1861.getClass(), "raster", term1863);
        setField(term1861, term1861.getClass(), "osis", null);
        setIntField(term1892, term1892.getClass(), "hash", -1965999012);
        setField(term1892, term1892.getClass(), "key", null);
        setField(term1892, term1892.getClass(), "value", null);
        setField(term1892, term1892.getClass(), "next", null);
        setElement(term1891, 3, term1892);
        setField(term1890, term1890.getClass(), "table", term1891);
        setIntField(term1890, term1890.getClass(), "count", 1);
        setIntField(term1890, term1890.getClass(), "threshold", 8);
        setFloatField(term1890, term1890.getClass(), "loadFactor", 0.75F);
        setIntField(term1890, term1890.getClass(), "modCount", 1);
        setField(term1890, term1890.getClass(), "keySet", null);
        setField(term1890, term1890.getClass(), "entrySet", null);
        setField(term1890, term1890.getClass(), "values", null);
        setField(term1861, term1861.getClass(), "properties", term1890);
        setFloatField(term1861, term1861.getClass(), "accelerationPriority", 0.51832694F);
        setField(term1861, term1861.getClass(), "surfaceManager", null);
        setField(term1860, term1860.getClass(), "img", term1861);
        setField(term1860, term1860.getClass(), "name", "fhkbdRViHi");
        setIntField(term1860, term1860.getClass(), "tileIndex", 1608016787);
        setIntField(term1860, term1860.getClass(), "nextAnimIndex", -516303035);
        setField(term1860, term1860.getClass(), "tileDescription", "uWHnvSvaPl");
        setIntField(term1860, term1860.getClass(), "zoomLevel", -2143043890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGasGiant", argTypes, term1860, args);
    }

};


