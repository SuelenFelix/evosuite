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

public class Tile_isAscensionPortal_199626383522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;

    public Tile_isAscensionPortal_199626383522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1774 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term1775 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term1777 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term1786 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1795 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1804 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1805 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1806 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term1775, term1775.getClass(), "imageType", -1537255112);
        setField(term1775, term1775.getClass(), "colorModel", null);
        setField(term1777, term1777.getClass(), "sampleModel", null);
        setField(term1777, term1777.getClass(), "dataBuffer", null);
        setIntField(term1777, term1777.getClass(), "minX", 934477462);
        setIntField(term1777, term1777.getClass(), "minY", 4900410);
        setIntField(term1777, term1777.getClass(), "width", -1252345779);
        setIntField(term1777, term1777.getClass(), "height", -2063365430);
        setIntField(term1777, term1777.getClass(), "sampleModelTranslateX", 812570053);
        setIntField(term1777, term1777.getClass(), "sampleModelTranslateY", -1488938905);
        setIntField(term1777, term1777.getClass(), "numBands", 1916544127);
        setIntField(term1777, term1777.getClass(), "numDataElements", -1133405894);
        setField(term1786, term1786.getClass(), "sampleModel", null);
        setField(term1786, term1786.getClass(), "dataBuffer", null);
        setIntField(term1786, term1786.getClass(), "minX", 1289741214);
        setIntField(term1786, term1786.getClass(), "minY", 243280944);
        setIntField(term1786, term1786.getClass(), "width", -726681073);
        setIntField(term1786, term1786.getClass(), "height", -1724487863);
        setIntField(term1786, term1786.getClass(), "sampleModelTranslateX", -128490829);
        setIntField(term1786, term1786.getClass(), "sampleModelTranslateY", 202214133);
        setIntField(term1786, term1786.getClass(), "numBands", 1543091617);
        setIntField(term1786, term1786.getClass(), "numDataElements", -763166094);
        setField(term1795, term1795.getClass(), "sampleModel", null);
        setField(term1795, term1795.getClass(), "dataBuffer", null);
        setIntField(term1795, term1795.getClass(), "minX", 0);
        setIntField(term1795, term1795.getClass(), "minY", 0);
        setIntField(term1795, term1795.getClass(), "width", 0);
        setIntField(term1795, term1795.getClass(), "height", 0);
        setIntField(term1795, term1795.getClass(), "sampleModelTranslateX", 0);
        setIntField(term1795, term1795.getClass(), "sampleModelTranslateY", 0);
        setIntField(term1795, term1795.getClass(), "numBands", 0);
        setIntField(term1795, term1795.getClass(), "numDataElements", 0);
        setField(term1795, term1795.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "parent", term1795);
        setField(term1777, term1777.getClass(), "parent", term1786);
        setField(term1775, term1775.getClass(), "raster", term1777);
        setField(term1775, term1775.getClass(), "osis", null);
        setIntField(term1806, term1806.getClass(), "hash", 1738724457);
        setField(term1806, term1806.getClass(), "key", null);
        setField(term1806, term1806.getClass(), "value", null);
        setField(term1806, term1806.getClass(), "next", null);
        setElement(term1805, 8, term1806);
        setField(term1804, term1804.getClass(), "table", term1805);
        setIntField(term1804, term1804.getClass(), "count", 1);
        setIntField(term1804, term1804.getClass(), "threshold", 8);
        setFloatField(term1804, term1804.getClass(), "loadFactor", 0.75F);
        setIntField(term1804, term1804.getClass(), "modCount", 1);
        setField(term1804, term1804.getClass(), "keySet", null);
        setField(term1804, term1804.getClass(), "entrySet", null);
        setField(term1804, term1804.getClass(), "values", null);
        setField(term1775, term1775.getClass(), "properties", term1804);
        setFloatField(term1775, term1775.getClass(), "accelerationPriority", 0.9985961F);
        setField(term1775, term1775.getClass(), "surfaceManager", null);
        setField(term1774, term1774.getClass(), "img", term1775);
        setField(term1774, term1774.getClass(), "name", "dEnhdmILtU");
        setIntField(term1774, term1774.getClass(), "tileIndex", 291864719);
        setIntField(term1774, term1774.getClass(), "nextAnimIndex", -1549607466);
        setField(term1774, term1774.getClass(), "tileDescription", "hoicvmsovO");
        setIntField(term1774, term1774.getClass(), "zoomLevel", 853609788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAscensionPortal", argTypes, term1774, args);
    }

};


