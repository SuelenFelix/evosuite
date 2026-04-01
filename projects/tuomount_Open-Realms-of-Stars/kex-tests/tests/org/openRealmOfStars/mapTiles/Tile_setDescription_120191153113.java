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

public class Tile_setDescription_120191153113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;

    public Tile_setDescription_120191153113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        Object term979 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term981 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term990 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term999 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term1008 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1009 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1010 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term979, term979.getClass(), "imageType", 1593461795);
        setField(term979, term979.getClass(), "colorModel", null);
        setField(term981, term981.getClass(), "sampleModel", null);
        setField(term981, term981.getClass(), "dataBuffer", null);
        setIntField(term981, term981.getClass(), "minX", 515182546);
        setIntField(term981, term981.getClass(), "minY", -936895502);
        setIntField(term981, term981.getClass(), "width", -129547140);
        setIntField(term981, term981.getClass(), "height", 199287428);
        setIntField(term981, term981.getClass(), "sampleModelTranslateX", -1195339592);
        setIntField(term981, term981.getClass(), "sampleModelTranslateY", -376422566);
        setIntField(term981, term981.getClass(), "numBands", 306847454);
        setIntField(term981, term981.getClass(), "numDataElements", 1745276158);
        setField(term990, term990.getClass(), "sampleModel", null);
        setField(term990, term990.getClass(), "dataBuffer", null);
        setIntField(term990, term990.getClass(), "minX", 2009020256);
        setIntField(term990, term990.getClass(), "minY", 2049577015);
        setIntField(term990, term990.getClass(), "width", 1236004505);
        setIntField(term990, term990.getClass(), "height", 1050765721);
        setIntField(term990, term990.getClass(), "sampleModelTranslateX", 474518942);
        setIntField(term990, term990.getClass(), "sampleModelTranslateY", -1656687479);
        setIntField(term990, term990.getClass(), "numBands", -249614216);
        setIntField(term990, term990.getClass(), "numDataElements", 1870727665);
        setField(term999, term999.getClass(), "sampleModel", null);
        setField(term999, term999.getClass(), "dataBuffer", null);
        setIntField(term999, term999.getClass(), "minX", 0);
        setIntField(term999, term999.getClass(), "minY", 0);
        setIntField(term999, term999.getClass(), "width", 0);
        setIntField(term999, term999.getClass(), "height", 0);
        setIntField(term999, term999.getClass(), "sampleModelTranslateX", 0);
        setIntField(term999, term999.getClass(), "sampleModelTranslateY", 0);
        setIntField(term999, term999.getClass(), "numBands", 0);
        setIntField(term999, term999.getClass(), "numDataElements", 0);
        setField(term999, term999.getClass(), "parent", null);
        setField(term990, term990.getClass(), "parent", term999);
        setField(term981, term981.getClass(), "parent", term990);
        setField(term979, term979.getClass(), "raster", term981);
        setField(term979, term979.getClass(), "osis", null);
        setIntField(term1010, term1010.getClass(), "hash", 2123749466);
        setField(term1010, term1010.getClass(), "key", null);
        setField(term1010, term1010.getClass(), "value", null);
        setField(term1010, term1010.getClass(), "next", null);
        setElement(term1009, 3, term1010);
        setField(term1008, term1008.getClass(), "table", term1009);
        setIntField(term1008, term1008.getClass(), "count", 1);
        setIntField(term1008, term1008.getClass(), "threshold", 8);
        setFloatField(term1008, term1008.getClass(), "loadFactor", 0.75F);
        setIntField(term1008, term1008.getClass(), "modCount", 1);
        setField(term1008, term1008.getClass(), "keySet", null);
        setField(term1008, term1008.getClass(), "entrySet", null);
        setField(term1008, term1008.getClass(), "values", null);
        setField(term979, term979.getClass(), "properties", term1008);
        setFloatField(term979, term979.getClass(), "accelerationPriority", 0.26413453F);
        setField(term979, term979.getClass(), "surfaceManager", null);
        setField(term978, term978.getClass(), "img", term979);
        setField(term978, term978.getClass(), "name", "SbAoxhfrkn");
        setIntField(term978, term978.getClass(), "tileIndex", -680920524);
        setIntField(term978, term978.getClass(), "nextAnimIndex", -916335264);
        setField(term978, term978.getClass(), "tileDescription", "kuTXqwMtDB");
        setIntField(term978, term978.getClass(), "zoomLevel", -919416536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setDescription", argTypes, term978, args);
    }

};


