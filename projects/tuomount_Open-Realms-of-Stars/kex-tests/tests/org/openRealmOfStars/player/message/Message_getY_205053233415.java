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
import java.lang.Object;
import java.lang.String;

public class Message_getY_205053233415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26324;

    public Message_getY_205053233415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26422 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term26421 = ((Class) term26422).getDeclaredField((String) "POPULATION");
        ((Field) term26421).setAccessible(true);
        Object enum84 = ((Field) term26421).get((Object) null);
        Class<? extends Object> term26669 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term26668 = ((Class) term26669).getDeclaredField((String) "PROMISE");
        ((Field) term26668).setAccessible(true);
        Object enum85 = ((Field) term26668).get((Object) null);
        term26324 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term26325 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term26329 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term26367 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term26368 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term26370 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term26379 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term26388 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term26389 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term26325, term26325.getClass(), "x", -525570815);
        setIntField(term26325, term26325.getClass(), "y", 754055848);
        setField(term26324, term26324.getClass(), "coordinate", term26325);
        setIntField(term26324, term26324.getClass(), "index", -370828664);
        setField(term26329, term26329.getClass(), "mainType", enum84);
        setField(term26329, term26329.getClass(), "subType", enum85);
        setField(term26324, term26324.getClass(), "type", term26329);
        setField(term26324, term26324.getClass(), "message", "VgZnGoIFwQ");
        setIntField(term26368, term26368.getClass(), "imageType", 1168633950);
        setField(term26368, term26368.getClass(), "colorModel", null);
        setField(term26370, term26370.getClass(), "sampleModel", null);
        setField(term26370, term26370.getClass(), "dataBuffer", null);
        setIntField(term26370, term26370.getClass(), "minX", 1607082164);
        setIntField(term26370, term26370.getClass(), "minY", 1890399366);
        setIntField(term26370, term26370.getClass(), "width", -1867239125);
        setIntField(term26370, term26370.getClass(), "height", 952869601);
        setIntField(term26370, term26370.getClass(), "sampleModelTranslateX", 91958879);
        setIntField(term26370, term26370.getClass(), "sampleModelTranslateY", -645429025);
        setIntField(term26370, term26370.getClass(), "numBands", -688213483);
        setIntField(term26370, term26370.getClass(), "numDataElements", 644154104);
        setField(term26379, term26379.getClass(), "sampleModel", null);
        setField(term26379, term26379.getClass(), "dataBuffer", null);
        setIntField(term26379, term26379.getClass(), "minX", 0);
        setIntField(term26379, term26379.getClass(), "minY", 0);
        setIntField(term26379, term26379.getClass(), "width", 0);
        setIntField(term26379, term26379.getClass(), "height", 0);
        setIntField(term26379, term26379.getClass(), "sampleModelTranslateX", 0);
        setIntField(term26379, term26379.getClass(), "sampleModelTranslateY", 0);
        setIntField(term26379, term26379.getClass(), "numBands", 0);
        setIntField(term26379, term26379.getClass(), "numDataElements", 0);
        setField(term26379, term26379.getClass(), "parent", null);
        setField(term26370, term26370.getClass(), "parent", term26379);
        setField(term26368, term26368.getClass(), "raster", term26370);
        setField(term26368, term26368.getClass(), "osis", null);
        setField(term26388, term26388.getClass(), "table", term26389);
        setIntField(term26388, term26388.getClass(), "count", 1);
        setIntField(term26388, term26388.getClass(), "threshold", 8);
        setFloatField(term26388, term26388.getClass(), "loadFactor", 0.75F);
        setIntField(term26388, term26388.getClass(), "modCount", 1);
        setField(term26388, term26388.getClass(), "keySet", null);
        setField(term26388, term26388.getClass(), "entrySet", null);
        setField(term26388, term26388.getClass(), "values", null);
        setField(term26368, term26368.getClass(), "properties", term26388);
        setFloatField(term26368, term26368.getClass(), "accelerationPriority", 0.37773192F);
        setField(term26368, term26368.getClass(), "surfaceManager", null);
        setField(term26367, term26367.getClass(), "img", term26368);
        setField(term26367, term26367.getClass(), "name", "bWWfajKbEX");
        setIntField(term26367, term26367.getClass(), "index", 1003743923);
        setField(term26324, term26324.getClass(), "icon", term26367);
        setField(term26324, term26324.getClass(), "matchByString", "cAPeiZHKGJ");
        setBooleanField(term26324, term26324.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term26324, args);
    }

};


