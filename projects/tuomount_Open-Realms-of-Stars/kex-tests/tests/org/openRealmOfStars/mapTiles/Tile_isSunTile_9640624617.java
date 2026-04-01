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

public class Tile_isSunTile_9640624617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1344;

    public Tile_isSunTile_9640624617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1344 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1345 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1347 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1356 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1365 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1374 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1375 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1376 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1345, term1345.getClass(), "imageType", 1272542218);
        setField(term1345, term1345.getClass(), "colorModel", null);
        setField(term1347, term1347.getClass(), "sampleModel", null);
        setField(term1347, term1347.getClass(), "dataBuffer", null);
        setIntField(term1347, term1347.getClass(), "minX", 1209799204);
        setIntField(term1347, term1347.getClass(), "minY", 1094107751);
        setIntField(term1347, term1347.getClass(), "width", 844222656);
        setIntField(term1347, term1347.getClass(), "height", -18216811);
        setIntField(term1347, term1347.getClass(), "sampleModelTranslateX", -1813280137);
        setIntField(term1347, term1347.getClass(), "sampleModelTranslateY", 719656595);
        setIntField(term1347, term1347.getClass(), "numBands", -1516995753);
        setIntField(term1347, term1347.getClass(), "numDataElements", -390501023);
        setField(term1356, term1356.getClass(), "sampleModel", null);
        setField(term1356, term1356.getClass(), "dataBuffer", null);
        setIntField(term1356, term1356.getClass(), "minX", -1667482829);
        setIntField(term1356, term1356.getClass(), "minY", 1116576792);
        setIntField(term1356, term1356.getClass(), "width", -942194446);
        setIntField(term1356, term1356.getClass(), "height", -938508470);
        setIntField(term1356, term1356.getClass(), "sampleModelTranslateX", 1242676024);
        setIntField(term1356, term1356.getClass(), "sampleModelTranslateY", -1865023308);
        setIntField(term1356, term1356.getClass(), "numBands", 1698510819);
        setIntField(term1356, term1356.getClass(), "numDataElements", -1553893255);
        setField(term1365, term1365.getClass(), "sampleModel", null);
        setField(term1365, term1365.getClass(), "dataBuffer", null);
        setIntField(term1365, term1365.getClass(), "minX", 0);
        setIntField(term1365, term1365.getClass(), "minY", 0);
        setIntField(term1365, term1365.getClass(), "width", 0);
        setIntField(term1365, term1365.getClass(), "height", 0);
        setIntField(term1365, term1365.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1365, term1365.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1365, term1365.getClass(), "numBands", 0);
        setIntField(term1365, term1365.getClass(), "numDataElements", 0);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "parent", term1365);
        setField(term1347, term1347.getClass(), "parent", term1356);
        setField(term1345, term1345.getClass(), "raster", term1347);
        setField(term1345, term1345.getClass(), "osis", null);
        setIntField(term1376, term1376.getClass(), "hash", -1055931226);
        setField(term1376, term1376.getClass(), "key", null);
        setField(term1376, term1376.getClass(), "value", null);
        setField(term1376, term1376.getClass(), "next", null);
        setElement(term1375, 4, term1376);
        setField(term1374, term1374.getClass(), "table", term1375);
        setIntField(term1374, term1374.getClass(), "count", 1);
        setIntField(term1374, term1374.getClass(), "threshold", 8);
        setFloatField(term1374, term1374.getClass(), "loadFactor", 0.75F);
        setIntField(term1374, term1374.getClass(), "modCount", 1);
        setField(term1374, term1374.getClass(), "keySet", null);
        setField(term1374, term1374.getClass(), "entrySet", null);
        setField(term1374, term1374.getClass(), "values", null);
        setField(term1345, term1345.getClass(), "properties", term1374);
        setFloatField(term1345, term1345.getClass(), "accelerationPriority", 0.6076495F);
        setField(term1345, term1345.getClass(), "surfaceManager", null);
        setField(term1344, term1344.getClass(), "img", term1345);
        setField(term1344, term1344.getClass(), "name", "tShwQLRGNe");
        setIntField(term1344, term1344.getClass(), "tileIndex", 794568325);
        setIntField(term1344, term1344.getClass(), "nextAnimIndex", -434468428);
        setField(term1344, term1344.getClass(), "tileDescription", "LvtrsXUliU");
        setIntField(term1344, term1344.getClass(), "zoomLevel", 1559605714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSunTile", argTypes, term1344, args);
    }

};


