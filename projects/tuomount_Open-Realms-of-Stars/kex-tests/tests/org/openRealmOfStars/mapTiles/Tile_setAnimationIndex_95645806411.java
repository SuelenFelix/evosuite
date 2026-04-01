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

public class Tile_setAnimationIndex_95645806411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804;
     Object term870;

    public Tile_setAnimationIndex_95645806411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term804 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term805 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term807 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term816 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term825 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term834 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term835 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term836 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term805, term805.getClass(), "imageType", 982388293);
        setField(term805, term805.getClass(), "colorModel", null);
        setField(term807, term807.getClass(), "sampleModel", null);
        setField(term807, term807.getClass(), "dataBuffer", null);
        setIntField(term807, term807.getClass(), "minX", -159494544);
        setIntField(term807, term807.getClass(), "minY", -75206835);
        setIntField(term807, term807.getClass(), "width", -1618206977);
        setIntField(term807, term807.getClass(), "height", -1747406163);
        setIntField(term807, term807.getClass(), "sampleModelTranslateX", 388157121);
        setIntField(term807, term807.getClass(), "sampleModelTranslateY", 1684998508);
        setIntField(term807, term807.getClass(), "numBands", -1476644457);
        setIntField(term807, term807.getClass(), "numDataElements", 1270666529);
        setField(term816, term816.getClass(), "sampleModel", null);
        setField(term816, term816.getClass(), "dataBuffer", null);
        setIntField(term816, term816.getClass(), "minX", -1146679443);
        setIntField(term816, term816.getClass(), "minY", -860131894);
        setIntField(term816, term816.getClass(), "width", -1022990421);
        setIntField(term816, term816.getClass(), "height", 1045547089);
        setIntField(term816, term816.getClass(), "sampleModelTranslateX", -1122880881);
        setIntField(term816, term816.getClass(), "sampleModelTranslateY", -542712742);
        setIntField(term816, term816.getClass(), "numBands", -1254072822);
        setIntField(term816, term816.getClass(), "numDataElements", -1111249833);
        setField(term825, term825.getClass(), "sampleModel", null);
        setField(term825, term825.getClass(), "dataBuffer", null);
        setIntField(term825, term825.getClass(), "minX", 0);
        setIntField(term825, term825.getClass(), "minY", 0);
        setIntField(term825, term825.getClass(), "width", 0);
        setIntField(term825, term825.getClass(), "height", 0);
        setIntField(term825, term825.getClass(), "sampleModelTranslateX", 0);
        setIntField(term825, term825.getClass(), "sampleModelTranslateY", 0);
        setIntField(term825, term825.getClass(), "numBands", 0);
        setIntField(term825, term825.getClass(), "numDataElements", 0);
        setField(term825, term825.getClass(), "parent", null);
        setField(term816, term816.getClass(), "parent", term825);
        setField(term807, term807.getClass(), "parent", term816);
        setField(term805, term805.getClass(), "raster", term807);
        setField(term805, term805.getClass(), "osis", null);
        setIntField(term836, term836.getClass(), "hash", 857376663);
        setField(term836, term836.getClass(), "key", null);
        setField(term836, term836.getClass(), "value", null);
        setField(term836, term836.getClass(), "next", null);
        setElement(term835, 0, term836);
        setField(term834, term834.getClass(), "table", term835);
        setIntField(term834, term834.getClass(), "count", 1);
        setIntField(term834, term834.getClass(), "threshold", 8);
        setFloatField(term834, term834.getClass(), "loadFactor", 0.75F);
        setIntField(term834, term834.getClass(), "modCount", 1);
        setField(term834, term834.getClass(), "keySet", null);
        setField(term834, term834.getClass(), "entrySet", null);
        setField(term834, term834.getClass(), "values", null);
        setField(term805, term805.getClass(), "properties", term834);
        setFloatField(term805, term805.getClass(), "accelerationPriority", 0.40176582F);
        setField(term805, term805.getClass(), "surfaceManager", null);
        setField(term804, term804.getClass(), "img", term805);
        setField(term804, term804.getClass(), "name", "OclPbYPkcH");
        setIntField(term804, term804.getClass(), "tileIndex", 479531250);
        setIntField(term804, term804.getClass(), "nextAnimIndex", 1320570890);
        setField(term804, term804.getClass(), "tileDescription", "IoAlmYsBwc");
        setIntField(term804, term804.getClass(), "zoomLevel", -130649791);
        term870 = new Integer(534834644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term870;
        callMethod(klass, "setAnimationIndex", argTypes, term804, args);
    }

};


