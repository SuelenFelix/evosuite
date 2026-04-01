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

public class Tile_isBlueStarTile_82823025415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1172;

    public Tile_isBlueStarTile_82823025415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1172 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1173 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1175 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1184 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1193 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1202 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1203 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1204 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1173, term1173.getClass(), "imageType", -1835839814);
        setField(term1173, term1173.getClass(), "colorModel", null);
        setField(term1175, term1175.getClass(), "sampleModel", null);
        setField(term1175, term1175.getClass(), "dataBuffer", null);
        setIntField(term1175, term1175.getClass(), "minX", -1404350380);
        setIntField(term1175, term1175.getClass(), "minY", -2013924238);
        setIntField(term1175, term1175.getClass(), "width", 579006268);
        setIntField(term1175, term1175.getClass(), "height", -1694747156);
        setIntField(term1175, term1175.getClass(), "sampleModelTranslateX", 1466373988);
        setIntField(term1175, term1175.getClass(), "sampleModelTranslateY", -358526505);
        setIntField(term1175, term1175.getClass(), "numBands", 1843268026);
        setIntField(term1175, term1175.getClass(), "numDataElements", 954660603);
        setField(term1184, term1184.getClass(), "sampleModel", null);
        setField(term1184, term1184.getClass(), "dataBuffer", null);
        setIntField(term1184, term1184.getClass(), "minX", -1351605385);
        setIntField(term1184, term1184.getClass(), "minY", 278355793);
        setIntField(term1184, term1184.getClass(), "width", -310648604);
        setIntField(term1184, term1184.getClass(), "height", -648200466);
        setIntField(term1184, term1184.getClass(), "sampleModelTranslateX", 2007134147);
        setIntField(term1184, term1184.getClass(), "sampleModelTranslateY", 993388358);
        setIntField(term1184, term1184.getClass(), "numBands", -765191335);
        setIntField(term1184, term1184.getClass(), "numDataElements", -1697741155);
        setField(term1193, term1193.getClass(), "sampleModel", null);
        setField(term1193, term1193.getClass(), "dataBuffer", null);
        setIntField(term1193, term1193.getClass(), "minX", 0);
        setIntField(term1193, term1193.getClass(), "minY", 0);
        setIntField(term1193, term1193.getClass(), "width", 0);
        setIntField(term1193, term1193.getClass(), "height", 0);
        setIntField(term1193, term1193.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1193, term1193.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1193, term1193.getClass(), "numBands", 0);
        setIntField(term1193, term1193.getClass(), "numDataElements", 0);
        setField(term1193, term1193.getClass(), "parent", null);
        setField(term1184, term1184.getClass(), "parent", term1193);
        setField(term1175, term1175.getClass(), "parent", term1184);
        setField(term1173, term1173.getClass(), "raster", term1175);
        setField(term1173, term1173.getClass(), "osis", null);
        setIntField(term1204, term1204.getClass(), "hash", -611664531);
        setField(term1204, term1204.getClass(), "key", null);
        setField(term1204, term1204.getClass(), "value", null);
        setField(term1204, term1204.getClass(), "next", null);
        setElement(term1203, 8, term1204);
        setField(term1202, term1202.getClass(), "table", term1203);
        setIntField(term1202, term1202.getClass(), "count", 1);
        setIntField(term1202, term1202.getClass(), "threshold", 8);
        setFloatField(term1202, term1202.getClass(), "loadFactor", 0.75F);
        setIntField(term1202, term1202.getClass(), "modCount", 1);
        setField(term1202, term1202.getClass(), "keySet", null);
        setField(term1202, term1202.getClass(), "entrySet", null);
        setField(term1202, term1202.getClass(), "values", null);
        setField(term1173, term1173.getClass(), "properties", term1202);
        setFloatField(term1173, term1173.getClass(), "accelerationPriority", 0.3692338F);
        setField(term1173, term1173.getClass(), "surfaceManager", null);
        setField(term1172, term1172.getClass(), "img", term1173);
        setField(term1172, term1172.getClass(), "name", "wSQxaModmm");
        setIntField(term1172, term1172.getClass(), "tileIndex", -1891015523);
        setIntField(term1172, term1172.getClass(), "nextAnimIndex", -1560631747);
        setField(term1172, term1172.getClass(), "tileDescription", "UlajhuVLaP");
        setIntField(term1172, term1172.getClass(), "zoomLevel", 1215150180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlueStarTile", argTypes, term1172, args);
    }

};


