package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageInstruction_paintCaptainImage_184644644322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716984;

    public ImageInstruction_paintCaptainImage_184644644322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716984 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term716986 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term716995 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717004 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717013 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term717014 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term717015 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term717018 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term716984, term716984.getClass(), "imageType", 1710050300);
        setField(term716984, term716984.getClass(), "colorModel", null);
        setField(term716986, term716986.getClass(), "sampleModel", null);
        setField(term716986, term716986.getClass(), "dataBuffer", null);
        setIntField(term716986, term716986.getClass(), "minX", 1467232017);
        setIntField(term716986, term716986.getClass(), "minY", -3531973);
        setIntField(term716986, term716986.getClass(), "width", 2016586909);
        setIntField(term716986, term716986.getClass(), "height", 607926043);
        setIntField(term716986, term716986.getClass(), "sampleModelTranslateX", 206027425);
        setIntField(term716986, term716986.getClass(), "sampleModelTranslateY", -459471927);
        setIntField(term716986, term716986.getClass(), "numBands", 1046077624);
        setIntField(term716986, term716986.getClass(), "numDataElements", -2054453219);
        setField(term716995, term716995.getClass(), "sampleModel", null);
        setField(term716995, term716995.getClass(), "dataBuffer", null);
        setIntField(term716995, term716995.getClass(), "minX", 1424375130);
        setIntField(term716995, term716995.getClass(), "minY", 670877035);
        setIntField(term716995, term716995.getClass(), "width", 303556117);
        setIntField(term716995, term716995.getClass(), "height", -2096518900);
        setIntField(term716995, term716995.getClass(), "sampleModelTranslateX", 605863601);
        setIntField(term716995, term716995.getClass(), "sampleModelTranslateY", 291684799);
        setIntField(term716995, term716995.getClass(), "numBands", 133487758);
        setIntField(term716995, term716995.getClass(), "numDataElements", -1203288548);
        setField(term717004, term717004.getClass(), "sampleModel", null);
        setField(term717004, term717004.getClass(), "dataBuffer", null);
        setIntField(term717004, term717004.getClass(), "minX", 0);
        setIntField(term717004, term717004.getClass(), "minY", 0);
        setIntField(term717004, term717004.getClass(), "width", 0);
        setIntField(term717004, term717004.getClass(), "height", 0);
        setIntField(term717004, term717004.getClass(), "sampleModelTranslateX", 0);
        setIntField(term717004, term717004.getClass(), "sampleModelTranslateY", 0);
        setIntField(term717004, term717004.getClass(), "numBands", 0);
        setIntField(term717004, term717004.getClass(), "numDataElements", 0);
        setField(term717004, term717004.getClass(), "parent", null);
        setField(term716995, term716995.getClass(), "parent", term717004);
        setField(term716986, term716986.getClass(), "parent", term716995);
        setField(term716984, term716984.getClass(), "raster", term716986);
        setField(term716984, term716984.getClass(), "osis", null);
        setIntField(term717015, term717015.getClass(), "hash", -1633351572);
        setField(term717015, term717015.getClass(), "key", "");
        setField(term717015, term717015.getClass(), "value", term717018);
        setField(term717015, term717015.getClass(), "next", null);
        setElement(term717014, 7, term717015);
        setField(term717013, term717013.getClass(), "table", term717014);
        setIntField(term717013, term717013.getClass(), "count", 1);
        setIntField(term717013, term717013.getClass(), "threshold", 8);
        setFloatField(term717013, term717013.getClass(), "loadFactor", 0.75F);
        setIntField(term717013, term717013.getClass(), "modCount", 1);
        setField(term717013, term717013.getClass(), "keySet", null);
        setField(term717013, term717013.getClass(), "entrySet", null);
        setField(term717013, term717013.getClass(), "values", null);
        setField(term716984, term716984.getClass(), "properties", term717013);
        setFloatField(term716984, term716984.getClass(), "accelerationPriority", 0.022591352F);
        setField(term716984, term716984.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term716984;
        args[1] = "PmfghxSpxx";
        args[2] = "WtKxVUsaLg";
        callMethod(klass, "paintCaptainImage", argTypes, null, args);
    }

};


