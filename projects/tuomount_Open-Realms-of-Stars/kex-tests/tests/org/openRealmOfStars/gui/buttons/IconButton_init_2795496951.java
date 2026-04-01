package org.openRealmOfStars.gui.buttons;

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
import static org.openRealmOfStars.gui.buttons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class IconButton_init_2795496951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term189;
     Object term229;

    public IconButton_init_2795496951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term151 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term160 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term169 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term178 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term179 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term180 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term183 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term149, term149.getClass(), "imageType", -1145578966);
        setField(term149, term149.getClass(), "colorModel", null);
        setField(term151, term151.getClass(), "sampleModel", null);
        setField(term151, term151.getClass(), "dataBuffer", null);
        setIntField(term151, term151.getClass(), "minX", 679763016);
        setIntField(term151, term151.getClass(), "minY", 1962444399);
        setIntField(term151, term151.getClass(), "width", 767834723);
        setIntField(term151, term151.getClass(), "height", -602026508);
        setIntField(term151, term151.getClass(), "sampleModelTranslateX", -157887805);
        setIntField(term151, term151.getClass(), "sampleModelTranslateY", 1876565163);
        setIntField(term151, term151.getClass(), "numBands", -817164822);
        setIntField(term151, term151.getClass(), "numDataElements", -1016503459);
        setField(term160, term160.getClass(), "sampleModel", null);
        setField(term160, term160.getClass(), "dataBuffer", null);
        setIntField(term160, term160.getClass(), "minX", -1968847291);
        setIntField(term160, term160.getClass(), "minY", 579005622);
        setIntField(term160, term160.getClass(), "width", -14890619);
        setIntField(term160, term160.getClass(), "height", 1632125673);
        setIntField(term160, term160.getClass(), "sampleModelTranslateX", 454281060);
        setIntField(term160, term160.getClass(), "sampleModelTranslateY", -1786399638);
        setIntField(term160, term160.getClass(), "numBands", 2055867847);
        setIntField(term160, term160.getClass(), "numDataElements", -1048298087);
        setField(term169, term169.getClass(), "sampleModel", null);
        setField(term169, term169.getClass(), "dataBuffer", null);
        setIntField(term169, term169.getClass(), "minX", 0);
        setIntField(term169, term169.getClass(), "minY", 0);
        setIntField(term169, term169.getClass(), "width", 0);
        setIntField(term169, term169.getClass(), "height", 0);
        setIntField(term169, term169.getClass(), "sampleModelTranslateX", 0);
        setIntField(term169, term169.getClass(), "sampleModelTranslateY", 0);
        setIntField(term169, term169.getClass(), "numBands", 0);
        setIntField(term169, term169.getClass(), "numDataElements", 0);
        setField(term169, term169.getClass(), "parent", null);
        setField(term160, term160.getClass(), "parent", term169);
        setField(term151, term151.getClass(), "parent", term160);
        setField(term149, term149.getClass(), "raster", term151);
        setField(term149, term149.getClass(), "osis", null);
        setIntField(term180, term180.getClass(), "hash", -1757842437);
        setField(term180, term180.getClass(), "key", "");
        setField(term180, term180.getClass(), "value", term183);
        setField(term180, term180.getClass(), "next", null);
        setElement(term179, 3, term180);
        setField(term178, term178.getClass(), "table", term179);
        setIntField(term178, term178.getClass(), "count", 1);
        setIntField(term178, term178.getClass(), "threshold", 8);
        setFloatField(term178, term178.getClass(), "loadFactor", 0.75F);
        setIntField(term178, term178.getClass(), "modCount", 1);
        setField(term178, term178.getClass(), "keySet", null);
        setField(term178, term178.getClass(), "entrySet", null);
        setField(term178, term178.getClass(), "values", null);
        setField(term149, term149.getClass(), "properties", term178);
        setFloatField(term149, term149.getClass(), "accelerationPriority", 0.3455959F);
        setField(term149, term149.getClass(), "surfaceManager", null);
        term189 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term191 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term200 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term209 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term218 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term219 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term220 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term189, term189.getClass(), "imageType", 458147407);
        setField(term189, term189.getClass(), "colorModel", null);
        setField(term191, term191.getClass(), "sampleModel", null);
        setField(term191, term191.getClass(), "dataBuffer", null);
        setIntField(term191, term191.getClass(), "minX", -184153539);
        setIntField(term191, term191.getClass(), "minY", 493620644);
        setIntField(term191, term191.getClass(), "width", 1328271830);
        setIntField(term191, term191.getClass(), "height", 1596070772);
        setIntField(term191, term191.getClass(), "sampleModelTranslateX", 97029295);
        setIntField(term191, term191.getClass(), "sampleModelTranslateY", -1371869594);
        setIntField(term191, term191.getClass(), "numBands", -2095575670);
        setIntField(term191, term191.getClass(), "numDataElements", 1225272962);
        setField(term200, term200.getClass(), "sampleModel", null);
        setField(term200, term200.getClass(), "dataBuffer", null);
        setIntField(term200, term200.getClass(), "minX", 1324040357);
        setIntField(term200, term200.getClass(), "minY", -1588772968);
        setIntField(term200, term200.getClass(), "width", -93135961);
        setIntField(term200, term200.getClass(), "height", -112921587);
        setIntField(term200, term200.getClass(), "sampleModelTranslateX", 933028652);
        setIntField(term200, term200.getClass(), "sampleModelTranslateY", 287287233);
        setIntField(term200, term200.getClass(), "numBands", 962840079);
        setIntField(term200, term200.getClass(), "numDataElements", 1540719661);
        setField(term209, term209.getClass(), "sampleModel", null);
        setField(term209, term209.getClass(), "dataBuffer", null);
        setIntField(term209, term209.getClass(), "minX", 0);
        setIntField(term209, term209.getClass(), "minY", 0);
        setIntField(term209, term209.getClass(), "width", 0);
        setIntField(term209, term209.getClass(), "height", 0);
        setIntField(term209, term209.getClass(), "sampleModelTranslateX", 0);
        setIntField(term209, term209.getClass(), "sampleModelTranslateY", 0);
        setIntField(term209, term209.getClass(), "numBands", 0);
        setIntField(term209, term209.getClass(), "numDataElements", 0);
        setField(term209, term209.getClass(), "parent", null);
        setField(term200, term200.getClass(), "parent", term209);
        setField(term191, term191.getClass(), "parent", term200);
        setField(term189, term189.getClass(), "raster", term191);
        setField(term189, term189.getClass(), "osis", null);
        setIntField(term220, term220.getClass(), "hash", 1755263599);
        setField(term220, term220.getClass(), "key", "");
        setField(term220, term220.getClass(), "value", term223);
        setField(term220, term220.getClass(), "next", null);
        setElement(term219, 1, term220);
        setField(term218, term218.getClass(), "table", term219);
        setIntField(term218, term218.getClass(), "count", 1);
        setIntField(term218, term218.getClass(), "threshold", 8);
        setFloatField(term218, term218.getClass(), "loadFactor", 0.75F);
        setIntField(term218, term218.getClass(), "modCount", 1);
        setField(term218, term218.getClass(), "keySet", null);
        setField(term218, term218.getClass(), "entrySet", null);
        setField(term218, term218.getClass(), "values", null);
        setField(term189, term189.getClass(), "properties", term218);
        setFloatField(term189, term189.getClass(), "accelerationPriority", 0.09123778F);
        setField(term189, term189.getClass(), "surfaceManager", null);
        term229 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.awt.image.BufferedImage");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.awt.Component");
        Object[] args = new Object[5];
        args[0] = term149;
        args[1] = term189;
        args[2] = term229;
        args[3] = "MjGYSRKTNF";
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


