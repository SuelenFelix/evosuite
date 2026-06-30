package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Bird_rotateImage_10198893478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8905;
     Object term8940;
     Object term8980;

    public Bird_rotateImage_10198893478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8905 = newInstance(Class.forName("game.Bird"));
        Object[] term8912 = (Object[]) newArray("java.awt.image.BufferedImage", 1);
        Object term8913 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8915 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8924 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8933 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8934 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term8905, term8905.getClass(), "x", 1782600602);
        setIntField(term8905, term8905.getClass(), "y", -185892708);
        setIntField(term8905, term8905.getClass(), "birdHeight", -203163250);
        setIntField(term8905, term8905.getClass(), "birdWidth", 498473526);
        setDoubleField(term8905, term8905.getClass(), "velocity", 0.5873228247510078);
        setIntField(term8905, term8905.getClass(), "count", 1186917020);
        setIntField(term8913, term8913.getClass(), "imageType", 1670041824);
        setField(term8913, term8913.getClass(), "colorModel", null);
        setField(term8915, term8915.getClass(), "sampleModel", null);
        setField(term8915, term8915.getClass(), "dataBuffer", null);
        setIntField(term8915, term8915.getClass(), "minX", 2140388634);
        setIntField(term8915, term8915.getClass(), "minY", 21095258);
        setIntField(term8915, term8915.getClass(), "width", -1793997256);
        setIntField(term8915, term8915.getClass(), "height", -1271598018);
        setIntField(term8915, term8915.getClass(), "sampleModelTranslateX", 157967613);
        setIntField(term8915, term8915.getClass(), "sampleModelTranslateY", 811839399);
        setIntField(term8915, term8915.getClass(), "numBands", 593962063);
        setIntField(term8915, term8915.getClass(), "numDataElements", -1485826786);
        setField(term8924, term8924.getClass(), "sampleModel", null);
        setField(term8924, term8924.getClass(), "dataBuffer", null);
        setIntField(term8924, term8924.getClass(), "minX", -1549952664);
        setIntField(term8924, term8924.getClass(), "minY", 148394188);
        setIntField(term8924, term8924.getClass(), "width", 504525721);
        setIntField(term8924, term8924.getClass(), "height", 1835568392);
        setIntField(term8924, term8924.getClass(), "sampleModelTranslateX", 457470807);
        setIntField(term8924, term8924.getClass(), "sampleModelTranslateY", -994742871);
        setIntField(term8924, term8924.getClass(), "numBands", -222412326);
        setIntField(term8924, term8924.getClass(), "numDataElements", -299497261);
        setField(term8924, term8924.getClass(), "parent", null);
        setField(term8915, term8915.getClass(), "parent", term8924);
        setField(term8913, term8913.getClass(), "raster", term8915);
        setField(term8913, term8913.getClass(), "osis", null);
        setField(term8933, term8933.getClass(), "table", term8934);
        setIntField(term8933, term8933.getClass(), "count", 1);
        setIntField(term8933, term8933.getClass(), "threshold", 8);
        setFloatField(term8933, term8933.getClass(), "loadFactor", 0.75F);
        setIntField(term8933, term8933.getClass(), "modCount", 1);
        setField(term8933, term8933.getClass(), "keySet", null);
        setField(term8933, term8933.getClass(), "entrySet", null);
        setField(term8933, term8933.getClass(), "values", null);
        setField(term8913, term8913.getClass(), "properties", term8933);
        setFloatField(term8913, term8913.getClass(), "accelerationPriority", 0.97262454F);
        setField(term8913, term8913.getClass(), "surfaceManager", null);
        setElement(term8912, 0, term8913);
        setField(term8905, term8905.getClass(), "images", term8912);
        term8940 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8942 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8951 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8960 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8969 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8970 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8971 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term8974 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8940, term8940.getClass(), "imageType", 153009426);
        setField(term8940, term8940.getClass(), "colorModel", null);
        setField(term8942, term8942.getClass(), "sampleModel", null);
        setField(term8942, term8942.getClass(), "dataBuffer", null);
        setIntField(term8942, term8942.getClass(), "minX", 185751892);
        setIntField(term8942, term8942.getClass(), "minY", 1068256001);
        setIntField(term8942, term8942.getClass(), "width", 1139078354);
        setIntField(term8942, term8942.getClass(), "height", -691164974);
        setIntField(term8942, term8942.getClass(), "sampleModelTranslateX", -761675396);
        setIntField(term8942, term8942.getClass(), "sampleModelTranslateY", -1954860951);
        setIntField(term8942, term8942.getClass(), "numBands", -2078879114);
        setIntField(term8942, term8942.getClass(), "numDataElements", -1186882318);
        setField(term8951, term8951.getClass(), "sampleModel", null);
        setField(term8951, term8951.getClass(), "dataBuffer", null);
        setIntField(term8951, term8951.getClass(), "minX", 1077647088);
        setIntField(term8951, term8951.getClass(), "minY", -705176810);
        setIntField(term8951, term8951.getClass(), "width", -1584779593);
        setIntField(term8951, term8951.getClass(), "height", 303007547);
        setIntField(term8951, term8951.getClass(), "sampleModelTranslateX", 1498738343);
        setIntField(term8951, term8951.getClass(), "sampleModelTranslateY", -1635571857);
        setIntField(term8951, term8951.getClass(), "numBands", 1407309162);
        setIntField(term8951, term8951.getClass(), "numDataElements", -534033672);
        setField(term8960, term8960.getClass(), "sampleModel", null);
        setField(term8960, term8960.getClass(), "dataBuffer", null);
        setIntField(term8960, term8960.getClass(), "minX", 0);
        setIntField(term8960, term8960.getClass(), "minY", 0);
        setIntField(term8960, term8960.getClass(), "width", 0);
        setIntField(term8960, term8960.getClass(), "height", 0);
        setIntField(term8960, term8960.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8960, term8960.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8960, term8960.getClass(), "numBands", 0);
        setIntField(term8960, term8960.getClass(), "numDataElements", 0);
        setField(term8960, term8960.getClass(), "parent", null);
        setField(term8951, term8951.getClass(), "parent", term8960);
        setField(term8942, term8942.getClass(), "parent", term8951);
        setField(term8940, term8940.getClass(), "raster", term8942);
        setField(term8940, term8940.getClass(), "osis", null);
        setIntField(term8971, term8971.getClass(), "hash", -434412043);
        setField(term8971, term8971.getClass(), "key", "");
        setField(term8971, term8971.getClass(), "value", term8974);
        setField(term8971, term8971.getClass(), "next", null);
        setElement(term8970, 3, term8971);
        setField(term8969, term8969.getClass(), "table", term8970);
        setIntField(term8969, term8969.getClass(), "count", 1);
        setIntField(term8969, term8969.getClass(), "threshold", 8);
        setFloatField(term8969, term8969.getClass(), "loadFactor", 0.75F);
        setIntField(term8969, term8969.getClass(), "modCount", 1);
        setField(term8969, term8969.getClass(), "keySet", null);
        setField(term8969, term8969.getClass(), "entrySet", null);
        setField(term8969, term8969.getClass(), "values", null);
        setField(term8940, term8940.getClass(), "properties", term8969);
        setFloatField(term8940, term8940.getClass(), "accelerationPriority", 0.76550204F);
        setField(term8940, term8940.getClass(), "surfaceManager", null);
        term8980 = new Integer(-1264595049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8940;
        args[1] = term8980;
        callMethod(klass, "rotateImage", argTypes, term8905, args);
    }

};


