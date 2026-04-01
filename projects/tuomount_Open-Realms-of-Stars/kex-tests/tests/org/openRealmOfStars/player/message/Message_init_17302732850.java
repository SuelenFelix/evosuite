package org.openRealmOfStars.player.message;

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
import static org.openRealmOfStars.player.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Message_init_17302732850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17100;
     Object term17145;

    public Message_init_17302732850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17198 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term17197 = ((Class) term17198).getDeclaredField((String) "NEWS");
        ((Field) term17197).setAccessible(true);
        Object enum54 = ((Field) term17197).get((Object) null);
        Class<? extends Object> term17427 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term17426 = ((Class) term17427).getDeclaredField((String) "STARPORT_DESTRUCTION");
        ((Field) term17426).setAccessible(true);
        Object enum55 = ((Field) term17426).get((Object) null);
        term17100 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term17100, term17100.getClass(), "mainType", enum54);
        setField(term17100, term17100.getClass(), "subType", enum55);
        term17145 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term17146 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term17148 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term17157 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term17166 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term17175 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term17176 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term17177 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term17146, term17146.getClass(), "imageType", -571169753);
        setField(term17146, term17146.getClass(), "colorModel", null);
        setField(term17148, term17148.getClass(), "sampleModel", null);
        setField(term17148, term17148.getClass(), "dataBuffer", null);
        setIntField(term17148, term17148.getClass(), "minX", 318591690);
        setIntField(term17148, term17148.getClass(), "minY", -165587447);
        setIntField(term17148, term17148.getClass(), "width", -1347358701);
        setIntField(term17148, term17148.getClass(), "height", 806595993);
        setIntField(term17148, term17148.getClass(), "sampleModelTranslateX", 548228925);
        setIntField(term17148, term17148.getClass(), "sampleModelTranslateY", -749861210);
        setIntField(term17148, term17148.getClass(), "numBands", 1694224101);
        setIntField(term17148, term17148.getClass(), "numDataElements", 937859191);
        setField(term17157, term17157.getClass(), "sampleModel", null);
        setField(term17157, term17157.getClass(), "dataBuffer", null);
        setIntField(term17157, term17157.getClass(), "minX", -916584829);
        setIntField(term17157, term17157.getClass(), "minY", -2131181468);
        setIntField(term17157, term17157.getClass(), "width", 282916351);
        setIntField(term17157, term17157.getClass(), "height", 880977281);
        setIntField(term17157, term17157.getClass(), "sampleModelTranslateX", 371943306);
        setIntField(term17157, term17157.getClass(), "sampleModelTranslateY", 982388293);
        setIntField(term17157, term17157.getClass(), "numBands", -159494544);
        setIntField(term17157, term17157.getClass(), "numDataElements", -75206835);
        setField(term17166, term17166.getClass(), "sampleModel", null);
        setField(term17166, term17166.getClass(), "dataBuffer", null);
        setIntField(term17166, term17166.getClass(), "minX", 0);
        setIntField(term17166, term17166.getClass(), "minY", 0);
        setIntField(term17166, term17166.getClass(), "width", 0);
        setIntField(term17166, term17166.getClass(), "height", 0);
        setIntField(term17166, term17166.getClass(), "sampleModelTranslateX", 0);
        setIntField(term17166, term17166.getClass(), "sampleModelTranslateY", 0);
        setIntField(term17166, term17166.getClass(), "numBands", 0);
        setIntField(term17166, term17166.getClass(), "numDataElements", 0);
        setField(term17166, term17166.getClass(), "parent", null);
        setField(term17157, term17157.getClass(), "parent", term17166);
        setField(term17148, term17148.getClass(), "parent", term17157);
        setField(term17146, term17146.getClass(), "raster", term17148);
        setField(term17146, term17146.getClass(), "osis", null);
        setIntField(term17177, term17177.getClass(), "hash", 1217572167);
        setField(term17177, term17177.getClass(), "key", null);
        setField(term17177, term17177.getClass(), "value", null);
        setField(term17177, term17177.getClass(), "next", null);
        setElement(term17176, 9, term17177);
        setField(term17175, term17175.getClass(), "table", term17176);
        setIntField(term17175, term17175.getClass(), "count", 1);
        setIntField(term17175, term17175.getClass(), "threshold", 8);
        setFloatField(term17175, term17175.getClass(), "loadFactor", 0.75F);
        setIntField(term17175, term17175.getClass(), "modCount", 1);
        setField(term17175, term17175.getClass(), "keySet", null);
        setField(term17175, term17175.getClass(), "entrySet", null);
        setField(term17175, term17175.getClass(), "values", null);
        setField(term17146, term17146.getClass(), "properties", term17175);
        setFloatField(term17146, term17146.getClass(), "accelerationPriority", 0.09123778F);
        setField(term17146, term17146.getClass(), "surfaceManager", null);
        setField(term17145, term17145.getClass(), "img", term17146);
        setField(term17145, term17145.getClass(), "name", "BYqFIqCKAV");
        setIntField(term17145, term17145.getClass(), "index", -1747406163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[3];
        args[0] = term17100;
        args[1] = "xOEqzGAmDU";
        args[2] = term17145;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


