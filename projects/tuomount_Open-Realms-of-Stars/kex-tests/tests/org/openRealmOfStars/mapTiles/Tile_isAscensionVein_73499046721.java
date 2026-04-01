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

public class Tile_isAscensionVein_73499046721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1688;

    public Tile_isAscensionVein_73499046721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1688 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1689 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1691 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1700 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1709 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1718 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1719 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1720 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1689, term1689.getClass(), "imageType", 1374790203);
        setField(term1689, term1689.getClass(), "colorModel", null);
        setField(term1691, term1691.getClass(), "sampleModel", null);
        setField(term1691, term1691.getClass(), "dataBuffer", null);
        setIntField(term1691, term1691.getClass(), "minX", 1160010161);
        setIntField(term1691, term1691.getClass(), "minY", -423900705);
        setIntField(term1691, term1691.getClass(), "width", -525570815);
        setIntField(term1691, term1691.getClass(), "height", 754055848);
        setIntField(term1691, term1691.getClass(), "sampleModelTranslateX", -19246901);
        setIntField(term1691, term1691.getClass(), "sampleModelTranslateY", -370828664);
        setIntField(term1691, term1691.getClass(), "numBands", 1168633950);
        setIntField(term1691, term1691.getClass(), "numDataElements", 1607082164);
        setField(term1700, term1700.getClass(), "sampleModel", null);
        setField(term1700, term1700.getClass(), "dataBuffer", null);
        setIntField(term1700, term1700.getClass(), "minX", 1890399366);
        setIntField(term1700, term1700.getClass(), "minY", -1867239125);
        setIntField(term1700, term1700.getClass(), "width", 952869601);
        setIntField(term1700, term1700.getClass(), "height", 91958879);
        setIntField(term1700, term1700.getClass(), "sampleModelTranslateX", -645429025);
        setIntField(term1700, term1700.getClass(), "sampleModelTranslateY", -688213483);
        setIntField(term1700, term1700.getClass(), "numBands", 644154104);
        setIntField(term1700, term1700.getClass(), "numDataElements", 76650923);
        setField(term1709, term1709.getClass(), "sampleModel", null);
        setField(term1709, term1709.getClass(), "dataBuffer", null);
        setIntField(term1709, term1709.getClass(), "minX", 0);
        setIntField(term1709, term1709.getClass(), "minY", 0);
        setIntField(term1709, term1709.getClass(), "width", 0);
        setIntField(term1709, term1709.getClass(), "height", 0);
        setIntField(term1709, term1709.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1709, term1709.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1709, term1709.getClass(), "numBands", 0);
        setIntField(term1709, term1709.getClass(), "numDataElements", 0);
        setField(term1709, term1709.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "parent", term1709);
        setField(term1691, term1691.getClass(), "parent", term1700);
        setField(term1689, term1689.getClass(), "raster", term1691);
        setField(term1689, term1689.getClass(), "osis", null);
        setIntField(term1720, term1720.getClass(), "hash", 1287692351);
        setField(term1720, term1720.getClass(), "key", null);
        setField(term1720, term1720.getClass(), "value", null);
        setField(term1720, term1720.getClass(), "next", null);
        setElement(term1719, 0, term1720);
        setField(term1718, term1718.getClass(), "table", term1719);
        setIntField(term1718, term1718.getClass(), "count", 1);
        setIntField(term1718, term1718.getClass(), "threshold", 8);
        setFloatField(term1718, term1718.getClass(), "loadFactor", 0.75F);
        setIntField(term1718, term1718.getClass(), "modCount", 1);
        setField(term1718, term1718.getClass(), "keySet", null);
        setField(term1718, term1718.getClass(), "entrySet", null);
        setField(term1718, term1718.getClass(), "values", null);
        setField(term1689, term1689.getClass(), "properties", term1718);
        setFloatField(term1689, term1689.getClass(), "accelerationPriority", 0.8474802F);
        setField(term1689, term1689.getClass(), "surfaceManager", null);
        setField(term1688, term1688.getClass(), "img", term1689);
        setField(term1688, term1688.getClass(), "name", "ytSBIKXogI");
        setIntField(term1688, term1688.getClass(), "tileIndex", 1887772522);
        setIntField(term1688, term1688.getClass(), "nextAnimIndex", 354196060);
        setField(term1688, term1688.getClass(), "tileDescription", "nHXjMycHlU");
        setIntField(term1688, term1688.getClass(), "zoomLevel", -1840305774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAscensionVein", argTypes, term1688, args);
    }

};


