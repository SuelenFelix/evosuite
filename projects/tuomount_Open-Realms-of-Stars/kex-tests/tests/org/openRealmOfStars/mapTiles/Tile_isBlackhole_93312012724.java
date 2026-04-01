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

public class Tile_isBlackhole_93312012724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public Tile_isBlackhole_93312012724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1947 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1949 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1958 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1967 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1976 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1977 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1978 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1947, term1947.getClass(), "imageType", 1454781562);
        setField(term1947, term1947.getClass(), "colorModel", null);
        setField(term1949, term1949.getClass(), "sampleModel", null);
        setField(term1949, term1949.getClass(), "dataBuffer", null);
        setIntField(term1949, term1949.getClass(), "minX", -27944011);
        setIntField(term1949, term1949.getClass(), "minY", -20614472);
        setIntField(term1949, term1949.getClass(), "width", 1126618861);
        setIntField(term1949, term1949.getClass(), "height", 947449400);
        setIntField(term1949, term1949.getClass(), "sampleModelTranslateX", -763799087);
        setIntField(term1949, term1949.getClass(), "sampleModelTranslateY", 1207142014);
        setIntField(term1949, term1949.getClass(), "numBands", -876426634);
        setIntField(term1949, term1949.getClass(), "numDataElements", 213831054);
        setField(term1958, term1958.getClass(), "sampleModel", null);
        setField(term1958, term1958.getClass(), "dataBuffer", null);
        setIntField(term1958, term1958.getClass(), "minX", 330043745);
        setIntField(term1958, term1958.getClass(), "minY", -509349195);
        setIntField(term1958, term1958.getClass(), "width", -1639041228);
        setIntField(term1958, term1958.getClass(), "height", 2027686272);
        setIntField(term1958, term1958.getClass(), "sampleModelTranslateX", -1494356104);
        setIntField(term1958, term1958.getClass(), "sampleModelTranslateY", -695279311);
        setIntField(term1958, term1958.getClass(), "numBands", 114279242);
        setIntField(term1958, term1958.getClass(), "numDataElements", 990883365);
        setField(term1967, term1967.getClass(), "sampleModel", null);
        setField(term1967, term1967.getClass(), "dataBuffer", null);
        setIntField(term1967, term1967.getClass(), "minX", 0);
        setIntField(term1967, term1967.getClass(), "minY", 0);
        setIntField(term1967, term1967.getClass(), "width", 0);
        setIntField(term1967, term1967.getClass(), "height", 0);
        setIntField(term1967, term1967.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1967, term1967.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1967, term1967.getClass(), "numBands", 0);
        setIntField(term1967, term1967.getClass(), "numDataElements", 0);
        setField(term1967, term1967.getClass(), "parent", null);
        setField(term1958, term1958.getClass(), "parent", term1967);
        setField(term1949, term1949.getClass(), "parent", term1958);
        setField(term1947, term1947.getClass(), "raster", term1949);
        setField(term1947, term1947.getClass(), "osis", null);
        setIntField(term1978, term1978.getClass(), "hash", -850320733);
        setField(term1978, term1978.getClass(), "key", null);
        setField(term1978, term1978.getClass(), "value", null);
        setField(term1978, term1978.getClass(), "next", null);
        setElement(term1977, 4, term1978);
        setField(term1976, term1976.getClass(), "table", term1977);
        setIntField(term1976, term1976.getClass(), "count", 1);
        setIntField(term1976, term1976.getClass(), "threshold", 8);
        setFloatField(term1976, term1976.getClass(), "loadFactor", 0.75F);
        setIntField(term1976, term1976.getClass(), "modCount", 1);
        setField(term1976, term1976.getClass(), "keySet", null);
        setField(term1976, term1976.getClass(), "entrySet", null);
        setField(term1976, term1976.getClass(), "values", null);
        setField(term1947, term1947.getClass(), "properties", term1976);
        setFloatField(term1947, term1947.getClass(), "accelerationPriority", 0.97262454F);
        setField(term1947, term1947.getClass(), "surfaceManager", null);
        setField(term1946, term1946.getClass(), "img", term1947);
        setField(term1946, term1946.getClass(), "name", "TJmVBGfTML");
        setIntField(term1946, term1946.getClass(), "tileIndex", 1862841859);
        setIntField(term1946, term1946.getClass(), "nextAnimIndex", -1114668574);
        setField(term1946, term1946.getClass(), "tileDescription", "tPlsykYBqO");
        setIntField(term1946, term1946.getClass(), "zoomLevel", 514511037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlackhole", argTypes, term1946, args);
    }

};


