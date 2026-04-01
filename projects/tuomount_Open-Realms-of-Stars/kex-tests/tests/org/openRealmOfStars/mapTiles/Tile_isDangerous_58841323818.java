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

public class Tile_isDangerous_58841323818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430;

    public Tile_isDangerous_58841323818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1430 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1431 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1433 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1442 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1451 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1460 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1461 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1462 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1431, term1431.getClass(), "imageType", -1938881385);
        setField(term1431, term1431.getClass(), "colorModel", null);
        setField(term1433, term1433.getClass(), "sampleModel", null);
        setField(term1433, term1433.getClass(), "dataBuffer", null);
        setIntField(term1433, term1433.getClass(), "minX", -1629418973);
        setIntField(term1433, term1433.getClass(), "minY", -100825168);
        setIntField(term1433, term1433.getClass(), "width", 768407648);
        setIntField(term1433, term1433.getClass(), "height", -350454594);
        setIntField(term1433, term1433.getClass(), "sampleModelTranslateX", -1148142995);
        setIntField(term1433, term1433.getClass(), "sampleModelTranslateY", -233024044);
        setIntField(term1433, term1433.getClass(), "numBands", 1820784228);
        setIntField(term1433, term1433.getClass(), "numDataElements", 1390820006);
        setField(term1442, term1442.getClass(), "sampleModel", null);
        setField(term1442, term1442.getClass(), "dataBuffer", null);
        setIntField(term1442, term1442.getClass(), "minX", -828982065);
        setIntField(term1442, term1442.getClass(), "minY", 1221443226);
        setIntField(term1442, term1442.getClass(), "width", 908108726);
        setIntField(term1442, term1442.getClass(), "height", 1023209512);
        setIntField(term1442, term1442.getClass(), "sampleModelTranslateX", 1084849225);
        setIntField(term1442, term1442.getClass(), "sampleModelTranslateY", -1702055571);
        setIntField(term1442, term1442.getClass(), "numBands", -944542900);
        setIntField(term1442, term1442.getClass(), "numDataElements", 2063762142);
        setField(term1451, term1451.getClass(), "sampleModel", null);
        setField(term1451, term1451.getClass(), "dataBuffer", null);
        setIntField(term1451, term1451.getClass(), "minX", 0);
        setIntField(term1451, term1451.getClass(), "minY", 0);
        setIntField(term1451, term1451.getClass(), "width", 0);
        setIntField(term1451, term1451.getClass(), "height", 0);
        setIntField(term1451, term1451.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1451, term1451.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1451, term1451.getClass(), "numBands", 0);
        setIntField(term1451, term1451.getClass(), "numDataElements", 0);
        setField(term1451, term1451.getClass(), "parent", null);
        setField(term1442, term1442.getClass(), "parent", term1451);
        setField(term1433, term1433.getClass(), "parent", term1442);
        setField(term1431, term1431.getClass(), "raster", term1433);
        setField(term1431, term1431.getClass(), "osis", null);
        setIntField(term1462, term1462.getClass(), "hash", -879157019);
        setField(term1462, term1462.getClass(), "key", null);
        setField(term1462, term1462.getClass(), "value", null);
        setField(term1462, term1462.getClass(), "next", null);
        setElement(term1461, 9, term1462);
        setField(term1460, term1460.getClass(), "table", term1461);
        setIntField(term1460, term1460.getClass(), "count", 1);
        setIntField(term1460, term1460.getClass(), "threshold", 8);
        setFloatField(term1460, term1460.getClass(), "loadFactor", 0.75F);
        setIntField(term1460, term1460.getClass(), "modCount", 1);
        setField(term1460, term1460.getClass(), "keySet", null);
        setField(term1460, term1460.getClass(), "entrySet", null);
        setField(term1460, term1460.getClass(), "values", null);
        setField(term1431, term1431.getClass(), "properties", term1460);
        setFloatField(term1431, term1431.getClass(), "accelerationPriority", 0.6608425F);
        setField(term1431, term1431.getClass(), "surfaceManager", null);
        setField(term1430, term1430.getClass(), "img", term1431);
        setField(term1430, term1430.getClass(), "name", "jDtqGUpnZN");
        setIntField(term1430, term1430.getClass(), "tileIndex", 2143282300);
        setIntField(term1430, term1430.getClass(), "nextAnimIndex", 1137624258);
        setField(term1430, term1430.getClass(), "tileDescription", "nGKItKLYNC");
        setIntField(term1430, term1430.getClass(), "zoomLevel", 977862393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDangerous", argTypes, term1430, args);
    }

};


