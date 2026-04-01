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
import java.lang.Integer;

public class Tile_draw_8287445994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150;
     Object term216;
     Object term218;

    public Tile_draw_8287445994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term151 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term153 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term162 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term171 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term180 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term181 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term182 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term151, term151.getClass(), "imageType", -157887805);
        setField(term151, term151.getClass(), "colorModel", null);
        setField(term153, term153.getClass(), "sampleModel", null);
        setField(term153, term153.getClass(), "dataBuffer", null);
        setIntField(term153, term153.getClass(), "minX", 1876565163);
        setIntField(term153, term153.getClass(), "minY", -817164822);
        setIntField(term153, term153.getClass(), "width", -1016503459);
        setIntField(term153, term153.getClass(), "height", -1968847291);
        setIntField(term153, term153.getClass(), "sampleModelTranslateX", 579005622);
        setIntField(term153, term153.getClass(), "sampleModelTranslateY", -14890619);
        setIntField(term153, term153.getClass(), "numBands", 1632125673);
        setIntField(term153, term153.getClass(), "numDataElements", 454281060);
        setField(term162, term162.getClass(), "sampleModel", null);
        setField(term162, term162.getClass(), "dataBuffer", null);
        setIntField(term162, term162.getClass(), "minX", -1786399638);
        setIntField(term162, term162.getClass(), "minY", 2055867847);
        setIntField(term162, term162.getClass(), "width", -1048298087);
        setIntField(term162, term162.getClass(), "height", 292681826);
        setIntField(term162, term162.getClass(), "sampleModelTranslateX", 458147407);
        setIntField(term162, term162.getClass(), "sampleModelTranslateY", -184153539);
        setIntField(term162, term162.getClass(), "numBands", 493620644);
        setIntField(term162, term162.getClass(), "numDataElements", 1328271830);
        setField(term171, term171.getClass(), "sampleModel", null);
        setField(term171, term171.getClass(), "dataBuffer", null);
        setIntField(term171, term171.getClass(), "minX", 0);
        setIntField(term171, term171.getClass(), "minY", 0);
        setIntField(term171, term171.getClass(), "width", 0);
        setIntField(term171, term171.getClass(), "height", 0);
        setIntField(term171, term171.getClass(), "sampleModelTranslateX", 0);
        setIntField(term171, term171.getClass(), "sampleModelTranslateY", 0);
        setIntField(term171, term171.getClass(), "numBands", 0);
        setIntField(term171, term171.getClass(), "numDataElements", 0);
        setField(term171, term171.getClass(), "parent", null);
        setField(term162, term162.getClass(), "parent", term171);
        setField(term153, term153.getClass(), "parent", term162);
        setField(term151, term151.getClass(), "raster", term153);
        setField(term151, term151.getClass(), "osis", null);
        setIntField(term182, term182.getClass(), "hash", -1893846662);
        setField(term182, term182.getClass(), "key", null);
        setField(term182, term182.getClass(), "value", null);
        setField(term182, term182.getClass(), "next", null);
        setElement(term181, 9, term182);
        setField(term180, term180.getClass(), "table", term181);
        setIntField(term180, term180.getClass(), "count", 1);
        setIntField(term180, term180.getClass(), "threshold", 8);
        setFloatField(term180, term180.getClass(), "loadFactor", 0.75F);
        setIntField(term180, term180.getClass(), "modCount", 1);
        setField(term180, term180.getClass(), "keySet", null);
        setField(term180, term180.getClass(), "entrySet", null);
        setField(term180, term180.getClass(), "values", null);
        setField(term151, term151.getClass(), "properties", term180);
        setFloatField(term151, term151.getClass(), "accelerationPriority", 0.3455959F);
        setField(term151, term151.getClass(), "surfaceManager", null);
        setField(term150, term150.getClass(), "img", term151);
        setField(term150, term150.getClass(), "name", "EGtDIRbSSb");
        setIntField(term150, term150.getClass(), "tileIndex", 97029295);
        setIntField(term150, term150.getClass(), "nextAnimIndex", -1371869594);
        setField(term150, term150.getClass(), "tileDescription", "SzjVpOQTyS");
        setIntField(term150, term150.getClass(), "zoomLevel", -2095575670);
        term216 = new Integer(1225272962);
        term218 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term216;
        args[2] = term218;
        callMethod(klass, "draw", argTypes, term150, args);
    }

};


