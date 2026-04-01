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

public class IconButton_init_886708810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term53;
     Object term105;

    public IconButton_init_886708810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term2 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term4 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term13 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term22 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term31 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term32 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term33 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term2, term2.getClass(), "imageType", 568599855);
        setField(term2, term2.getClass(), "colorModel", null);
        setField(term4, term4.getClass(), "sampleModel", null);
        setField(term4, term4.getClass(), "dataBuffer", null);
        setIntField(term4, term4.getClass(), "minX", 1162663216);
        setIntField(term4, term4.getClass(), "minY", 1484323161);
        setIntField(term4, term4.getClass(), "width", 391863371);
        setIntField(term4, term4.getClass(), "height", -1922583790);
        setIntField(term4, term4.getClass(), "sampleModelTranslateX", -616727354);
        setIntField(term4, term4.getClass(), "sampleModelTranslateY", -1955890973);
        setIntField(term4, term4.getClass(), "numBands", -2038273078);
        setIntField(term4, term4.getClass(), "numDataElements", 1227103734);
        setField(term13, term13.getClass(), "sampleModel", null);
        setField(term13, term13.getClass(), "dataBuffer", null);
        setIntField(term13, term13.getClass(), "minX", -1339778481);
        setIntField(term13, term13.getClass(), "minY", 1725571209);
        setIntField(term13, term13.getClass(), "width", -522618178);
        setIntField(term13, term13.getClass(), "height", 1134449235);
        setIntField(term13, term13.getClass(), "sampleModelTranslateX", -883034806);
        setIntField(term13, term13.getClass(), "sampleModelTranslateY", 1585847225);
        setIntField(term13, term13.getClass(), "numBands", 597278769);
        setIntField(term13, term13.getClass(), "numDataElements", -1685132342);
        setField(term22, term22.getClass(), "sampleModel", null);
        setField(term22, term22.getClass(), "dataBuffer", null);
        setIntField(term22, term22.getClass(), "minX", 0);
        setIntField(term22, term22.getClass(), "minY", 0);
        setIntField(term22, term22.getClass(), "width", 0);
        setIntField(term22, term22.getClass(), "height", 0);
        setIntField(term22, term22.getClass(), "sampleModelTranslateX", 0);
        setIntField(term22, term22.getClass(), "sampleModelTranslateY", 0);
        setIntField(term22, term22.getClass(), "numBands", 0);
        setIntField(term22, term22.getClass(), "numDataElements", 0);
        setField(term22, term22.getClass(), "parent", null);
        setField(term13, term13.getClass(), "parent", term22);
        setField(term4, term4.getClass(), "parent", term13);
        setField(term2, term2.getClass(), "raster", term4);
        setField(term2, term2.getClass(), "osis", null);
        setIntField(term33, term33.getClass(), "hash", 1804259474);
        setField(term33, term33.getClass(), "key", null);
        setField(term33, term33.getClass(), "value", null);
        setField(term33, term33.getClass(), "next", null);
        setElement(term32, 6, term33);
        setField(term31, term31.getClass(), "table", term32);
        setIntField(term31, term31.getClass(), "count", 1);
        setIntField(term31, term31.getClass(), "threshold", 8);
        setFloatField(term31, term31.getClass(), "loadFactor", 0.75F);
        setIntField(term31, term31.getClass(), "modCount", 1);
        setField(term31, term31.getClass(), "keySet", null);
        setField(term31, term31.getClass(), "entrySet", null);
        setField(term31, term31.getClass(), "values", null);
        setField(term2, term2.getClass(), "properties", term31);
        setFloatField(term2, term2.getClass(), "accelerationPriority", 0.13238746F);
        setField(term2, term2.getClass(), "surfaceManager", null);
        setField(term1, term1.getClass(), "img", term2);
        setField(term1, term1.getClass(), "name", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "index", 1622346318);
        term53 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term54 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term56 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term65 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term74 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term83 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term84 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term85 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term54, term54.getClass(), "imageType", 1048535127);
        setField(term54, term54.getClass(), "colorModel", null);
        setField(term56, term56.getClass(), "sampleModel", null);
        setField(term56, term56.getClass(), "dataBuffer", null);
        setIntField(term56, term56.getClass(), "minX", -655067527);
        setIntField(term56, term56.getClass(), "minY", -6029667);
        setIntField(term56, term56.getClass(), "width", -2068769794);
        setIntField(term56, term56.getClass(), "height", -117576464);
        setIntField(term56, term56.getClass(), "sampleModelTranslateX", -1007160944);
        setIntField(term56, term56.getClass(), "sampleModelTranslateY", 1135664017);
        setIntField(term56, term56.getClass(), "numBands", 590364439);
        setIntField(term56, term56.getClass(), "numDataElements", 865208305);
        setField(term65, term65.getClass(), "sampleModel", null);
        setField(term65, term65.getClass(), "dataBuffer", null);
        setIntField(term65, term65.getClass(), "minX", -1275173084);
        setIntField(term65, term65.getClass(), "minY", -244121226);
        setIntField(term65, term65.getClass(), "width", -203030934);
        setIntField(term65, term65.getClass(), "height", -1179120542);
        setIntField(term65, term65.getClass(), "sampleModelTranslateX", -73683645);
        setIntField(term65, term65.getClass(), "sampleModelTranslateY", -226514366);
        setIntField(term65, term65.getClass(), "numBands", 1193880199);
        setIntField(term65, term65.getClass(), "numDataElements", -1087774327);
        setField(term74, term74.getClass(), "sampleModel", null);
        setField(term74, term74.getClass(), "dataBuffer", null);
        setIntField(term74, term74.getClass(), "minX", 0);
        setIntField(term74, term74.getClass(), "minY", 0);
        setIntField(term74, term74.getClass(), "width", 0);
        setIntField(term74, term74.getClass(), "height", 0);
        setIntField(term74, term74.getClass(), "sampleModelTranslateX", 0);
        setIntField(term74, term74.getClass(), "sampleModelTranslateY", 0);
        setIntField(term74, term74.getClass(), "numBands", 0);
        setIntField(term74, term74.getClass(), "numDataElements", 0);
        setField(term74, term74.getClass(), "parent", null);
        setField(term65, term65.getClass(), "parent", term74);
        setField(term56, term56.getClass(), "parent", term65);
        setField(term54, term54.getClass(), "raster", term56);
        setField(term54, term54.getClass(), "osis", null);
        setIntField(term85, term85.getClass(), "hash", 1033560433);
        setField(term85, term85.getClass(), "key", null);
        setField(term85, term85.getClass(), "value", null);
        setField(term85, term85.getClass(), "next", null);
        setElement(term84, 4, term85);
        setField(term83, term83.getClass(), "table", term84);
        setIntField(term83, term83.getClass(), "count", 1);
        setIntField(term83, term83.getClass(), "threshold", 8);
        setFloatField(term83, term83.getClass(), "loadFactor", 0.75F);
        setIntField(term83, term83.getClass(), "modCount", 1);
        setField(term83, term83.getClass(), "keySet", null);
        setField(term83, term83.getClass(), "entrySet", null);
        setField(term83, term83.getClass(), "values", null);
        setField(term54, term54.getClass(), "properties", term83);
        setFloatField(term54, term54.getClass(), "accelerationPriority", 0.2707036F);
        setField(term54, term54.getClass(), "surfaceManager", null);
        setField(term53, term53.getClass(), "img", term54);
        setField(term53, term53.getClass(), "name", "xxtlPwDYFs");
        setIntField(term53, term53.getClass(), "index", -469968304);
        term105 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        argTypes[1] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.awt.Component");
        Object[] args = new Object[5];
        args[0] = term1;
        args[1] = term53;
        args[2] = term105;
        args[3] = "jJCZpVmanW";
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


