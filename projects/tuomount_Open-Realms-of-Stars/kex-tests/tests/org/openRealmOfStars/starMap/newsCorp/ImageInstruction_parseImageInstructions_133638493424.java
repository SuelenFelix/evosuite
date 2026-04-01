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

public class ImageInstruction_parseImageInstructions_133638493424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717130;

    public ImageInstruction_parseImageInstructions_133638493424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717130 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term717132 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term717141 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717150 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term717159 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term717160 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term717161 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term717164 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term717130, term717130.getClass(), "imageType", -323535726);
        setField(term717130, term717130.getClass(), "colorModel", null);
        setField(term717132, term717132.getClass(), "sampleModel", null);
        setField(term717132, term717132.getClass(), "dataBuffer", null);
        setIntField(term717132, term717132.getClass(), "minX", -1576331582);
        setIntField(term717132, term717132.getClass(), "minY", -1989107035);
        setIntField(term717132, term717132.getClass(), "width", -857276891);
        setIntField(term717132, term717132.getClass(), "height", 2117099734);
        setIntField(term717132, term717132.getClass(), "sampleModelTranslateX", 2079685831);
        setIntField(term717132, term717132.getClass(), "sampleModelTranslateY", 24665460);
        setIntField(term717132, term717132.getClass(), "numBands", -1907688379);
        setIntField(term717132, term717132.getClass(), "numDataElements", -185256197);
        setField(term717141, term717141.getClass(), "sampleModel", null);
        setField(term717141, term717141.getClass(), "dataBuffer", null);
        setIntField(term717141, term717141.getClass(), "minX", -2130092461);
        setIntField(term717141, term717141.getClass(), "minY", -110195062);
        setIntField(term717141, term717141.getClass(), "width", -1377355787);
        setIntField(term717141, term717141.getClass(), "height", -1565928992);
        setIntField(term717141, term717141.getClass(), "sampleModelTranslateX", -705479387);
        setIntField(term717141, term717141.getClass(), "sampleModelTranslateY", -627102852);
        setIntField(term717141, term717141.getClass(), "numBands", -380898091);
        setIntField(term717141, term717141.getClass(), "numDataElements", -1849870684);
        setField(term717150, term717150.getClass(), "sampleModel", null);
        setField(term717150, term717150.getClass(), "dataBuffer", null);
        setIntField(term717150, term717150.getClass(), "minX", 0);
        setIntField(term717150, term717150.getClass(), "minY", 0);
        setIntField(term717150, term717150.getClass(), "width", 0);
        setIntField(term717150, term717150.getClass(), "height", 0);
        setIntField(term717150, term717150.getClass(), "sampleModelTranslateX", 0);
        setIntField(term717150, term717150.getClass(), "sampleModelTranslateY", 0);
        setIntField(term717150, term717150.getClass(), "numBands", 0);
        setIntField(term717150, term717150.getClass(), "numDataElements", 0);
        setField(term717150, term717150.getClass(), "parent", null);
        setField(term717141, term717141.getClass(), "parent", term717150);
        setField(term717132, term717132.getClass(), "parent", term717141);
        setField(term717130, term717130.getClass(), "raster", term717132);
        setField(term717130, term717130.getClass(), "osis", null);
        setIntField(term717161, term717161.getClass(), "hash", -310586533);
        setField(term717161, term717161.getClass(), "key", "");
        setField(term717161, term717161.getClass(), "value", term717164);
        setField(term717161, term717161.getClass(), "next", null);
        setElement(term717160, 9, term717161);
        setField(term717159, term717159.getClass(), "table", term717160);
        setIntField(term717159, term717159.getClass(), "count", 1);
        setIntField(term717159, term717159.getClass(), "threshold", 8);
        setFloatField(term717159, term717159.getClass(), "loadFactor", 0.75F);
        setIntField(term717159, term717159.getClass(), "modCount", 1);
        setField(term717159, term717159.getClass(), "keySet", null);
        setField(term717159, term717159.getClass(), "entrySet", null);
        setField(term717159, term717159.getClass(), "values", null);
        setField(term717130, term717130.getClass(), "properties", term717159);
        setFloatField(term717130, term717130.getClass(), "accelerationPriority", 0.51208574F);
        setField(term717130, term717130.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term717130;
        args[1] = "naHoEpCXaH";
        callMethod(klass, "parseImageInstructions", argTypes, null, args);
    }

};


