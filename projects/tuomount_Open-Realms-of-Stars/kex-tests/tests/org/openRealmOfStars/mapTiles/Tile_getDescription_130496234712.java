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

public class Tile_getDescription_130496234712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public Tile_getDescription_130496234712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term892 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term893 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term895 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term904 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term913 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term922 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term923 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term924 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term893, term893.getClass(), "imageType", -209654048);
        setField(term893, term893.getClass(), "colorModel", null);
        setField(term895, term895.getClass(), "sampleModel", null);
        setField(term895, term895.getClass(), "dataBuffer", null);
        setIntField(term895, term895.getClass(), "minX", 477625804);
        setIntField(term895, term895.getClass(), "minY", 252575029);
        setIntField(term895, term895.getClass(), "width", 57189932);
        setIntField(term895, term895.getClass(), "height", 1460722225);
        setIntField(term895, term895.getClass(), "sampleModelTranslateX", 1743224434);
        setIntField(term895, term895.getClass(), "sampleModelTranslateY", 842904495);
        setIntField(term895, term895.getClass(), "numBands", 1008080511);
        setIntField(term895, term895.getClass(), "numDataElements", 1935707624);
        setField(term904, term904.getClass(), "sampleModel", null);
        setField(term904, term904.getClass(), "dataBuffer", null);
        setIntField(term904, term904.getClass(), "minX", 1507074215);
        setIntField(term904, term904.getClass(), "minY", -282881827);
        setIntField(term904, term904.getClass(), "width", -1183353915);
        setIntField(term904, term904.getClass(), "height", -420030135);
        setIntField(term904, term904.getClass(), "sampleModelTranslateX", 267763294);
        setIntField(term904, term904.getClass(), "sampleModelTranslateY", -1497710478);
        setIntField(term904, term904.getClass(), "numBands", 49950830);
        setIntField(term904, term904.getClass(), "numDataElements", -525257914);
        setField(term913, term913.getClass(), "sampleModel", null);
        setField(term913, term913.getClass(), "dataBuffer", null);
        setIntField(term913, term913.getClass(), "minX", 0);
        setIntField(term913, term913.getClass(), "minY", 0);
        setIntField(term913, term913.getClass(), "width", 0);
        setIntField(term913, term913.getClass(), "height", 0);
        setIntField(term913, term913.getClass(), "sampleModelTranslateX", 0);
        setIntField(term913, term913.getClass(), "sampleModelTranslateY", 0);
        setIntField(term913, term913.getClass(), "numBands", 0);
        setIntField(term913, term913.getClass(), "numDataElements", 0);
        setField(term913, term913.getClass(), "parent", null);
        setField(term904, term904.getClass(), "parent", term913);
        setField(term895, term895.getClass(), "parent", term904);
        setField(term893, term893.getClass(), "raster", term895);
        setField(term893, term893.getClass(), "osis", null);
        setIntField(term924, term924.getClass(), "hash", 1718827582);
        setField(term924, term924.getClass(), "key", null);
        setField(term924, term924.getClass(), "value", null);
        setField(term924, term924.getClass(), "next", null);
        setElement(term923, 10, term924);
        setField(term922, term922.getClass(), "table", term923);
        setIntField(term922, term922.getClass(), "count", 1);
        setIntField(term922, term922.getClass(), "threshold", 8);
        setFloatField(term922, term922.getClass(), "loadFactor", 0.75F);
        setIntField(term922, term922.getClass(), "modCount", 1);
        setField(term922, term922.getClass(), "keySet", null);
        setField(term922, term922.getClass(), "entrySet", null);
        setField(term922, term922.getClass(), "values", null);
        setField(term893, term893.getClass(), "properties", term922);
        setFloatField(term893, term893.getClass(), "accelerationPriority", 0.8783184F);
        setField(term893, term893.getClass(), "surfaceManager", null);
        setField(term892, term892.getClass(), "img", term893);
        setField(term892, term892.getClass(), "name", "OWDIEULEFu");
        setIntField(term892, term892.getClass(), "tileIndex", 34470066);
        setIntField(term892, term892.getClass(), "nextAnimIndex", 2058711405);
        setField(term892, term892.getClass(), "tileDescription", "dWRymuLBtr");
        setIntField(term892, term892.getClass(), "zoomLevel", 1743683601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term892, args);
    }

};


