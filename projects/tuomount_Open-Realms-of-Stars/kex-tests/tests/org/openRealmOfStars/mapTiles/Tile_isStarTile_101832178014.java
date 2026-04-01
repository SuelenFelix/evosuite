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

public class Tile_isStarTile_101832178014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;

    public Tile_isStarTile_101832178014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1086 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1087 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1089 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1098 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1107 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1116 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1117 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1118 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1087, term1087.getClass(), "imageType", -1533843432);
        setField(term1087, term1087.getClass(), "colorModel", null);
        setField(term1089, term1089.getClass(), "sampleModel", null);
        setField(term1089, term1089.getClass(), "dataBuffer", null);
        setIntField(term1089, term1089.getClass(), "minX", -123338791);
        setIntField(term1089, term1089.getClass(), "minY", -1467089634);
        setIntField(term1089, term1089.getClass(), "width", 413548937);
        setIntField(term1089, term1089.getClass(), "height", 1901317214);
        setIntField(term1089, term1089.getClass(), "sampleModelTranslateX", 1166710220);
        setIntField(term1089, term1089.getClass(), "sampleModelTranslateY", -1070592289);
        setIntField(term1089, term1089.getClass(), "numBands", -1464172784);
        setIntField(term1089, term1089.getClass(), "numDataElements", 32185364);
        setField(term1098, term1098.getClass(), "sampleModel", null);
        setField(term1098, term1098.getClass(), "dataBuffer", null);
        setIntField(term1098, term1098.getClass(), "minX", 1768204942);
        setIntField(term1098, term1098.getClass(), "minY", 1252951645);
        setIntField(term1098, term1098.getClass(), "width", 574481092);
        setIntField(term1098, term1098.getClass(), "height", -310528004);
        setIntField(term1098, term1098.getClass(), "sampleModelTranslateX", -634976996);
        setIntField(term1098, term1098.getClass(), "sampleModelTranslateY", -1015274146);
        setIntField(term1098, term1098.getClass(), "numBands", -49052672);
        setIntField(term1098, term1098.getClass(), "numDataElements", 339372704);
        setField(term1107, term1107.getClass(), "sampleModel", null);
        setField(term1107, term1107.getClass(), "dataBuffer", null);
        setIntField(term1107, term1107.getClass(), "minX", 0);
        setIntField(term1107, term1107.getClass(), "minY", 0);
        setIntField(term1107, term1107.getClass(), "width", 0);
        setIntField(term1107, term1107.getClass(), "height", 0);
        setIntField(term1107, term1107.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1107, term1107.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1107, term1107.getClass(), "numBands", 0);
        setIntField(term1107, term1107.getClass(), "numDataElements", 0);
        setField(term1107, term1107.getClass(), "parent", null);
        setField(term1098, term1098.getClass(), "parent", term1107);
        setField(term1089, term1089.getClass(), "parent", term1098);
        setField(term1087, term1087.getClass(), "raster", term1089);
        setField(term1087, term1087.getClass(), "osis", null);
        setIntField(term1118, term1118.getClass(), "hash", -1290839528);
        setField(term1118, term1118.getClass(), "key", null);
        setField(term1118, term1118.getClass(), "value", null);
        setField(term1118, term1118.getClass(), "next", null);
        setElement(term1117, 2, term1118);
        setField(term1116, term1116.getClass(), "table", term1117);
        setIntField(term1116, term1116.getClass(), "count", 1);
        setIntField(term1116, term1116.getClass(), "threshold", 8);
        setFloatField(term1116, term1116.getClass(), "loadFactor", 0.75F);
        setIntField(term1116, term1116.getClass(), "modCount", 1);
        setField(term1116, term1116.getClass(), "keySet", null);
        setField(term1116, term1116.getClass(), "entrySet", null);
        setField(term1116, term1116.getClass(), "values", null);
        setField(term1087, term1087.getClass(), "properties", term1116);
        setFloatField(term1087, term1087.getClass(), "accelerationPriority", 0.7944024F);
        setField(term1087, term1087.getClass(), "surfaceManager", null);
        setField(term1086, term1086.getClass(), "img", term1087);
        setField(term1086, term1086.getClass(), "name", "IDCWpPLRkE");
        setIntField(term1086, term1086.getClass(), "tileIndex", 803925431);
        setIntField(term1086, term1086.getClass(), "nextAnimIndex", 76929641);
        setField(term1086, term1086.getClass(), "tileDescription", "nyiiPDVjAc");
        setIntField(term1086, term1086.getClass(), "zoomLevel", -2003192918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarTile", argTypes, term1086, args);
    }

};


