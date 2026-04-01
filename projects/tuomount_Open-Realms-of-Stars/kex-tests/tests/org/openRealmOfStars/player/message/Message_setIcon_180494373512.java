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

public class Message_setIcon_180494373512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24439;
     Object term24532;

    public Message_setIcon_180494373512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24585 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term24584 = ((Class) term24585).getDeclaredField((String) "LEADER");
        ((Field) term24584).setAccessible(true);
        Object enum78 = ((Field) term24584).get((Object) null);
        Class<? extends Object> term24820 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term24819 = ((Class) term24820).getDeclaredField((String) "CREDITS");
        ((Field) term24819).setAccessible(true);
        Object enum79 = ((Field) term24819).get((Object) null);
        term24439 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term24440 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term24444 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term24478 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term24479 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term24481 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term24490 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term24499 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term24500 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term24440, term24440.getClass(), "x", -100825168);
        setIntField(term24440, term24440.getClass(), "y", 768407648);
        setField(term24439, term24439.getClass(), "coordinate", term24440);
        setIntField(term24439, term24439.getClass(), "index", -1148142995);
        setField(term24444, term24444.getClass(), "mainType", enum78);
        setField(term24444, term24444.getClass(), "subType", enum79);
        setField(term24439, term24439.getClass(), "type", term24444);
        setField(term24439, term24439.getClass(), "message", "TJmVBGfTML");
        setIntField(term24479, term24479.getClass(), "imageType", -233024044);
        setField(term24479, term24479.getClass(), "colorModel", null);
        setField(term24481, term24481.getClass(), "sampleModel", null);
        setField(term24481, term24481.getClass(), "dataBuffer", null);
        setIntField(term24481, term24481.getClass(), "minX", 1820784228);
        setIntField(term24481, term24481.getClass(), "minY", 1390820006);
        setIntField(term24481, term24481.getClass(), "width", -828982065);
        setIntField(term24481, term24481.getClass(), "height", 1221443226);
        setIntField(term24481, term24481.getClass(), "sampleModelTranslateX", 908108726);
        setIntField(term24481, term24481.getClass(), "sampleModelTranslateY", 1023209512);
        setIntField(term24481, term24481.getClass(), "numBands", 1084849225);
        setIntField(term24481, term24481.getClass(), "numDataElements", -1702055571);
        setField(term24490, term24490.getClass(), "sampleModel", null);
        setField(term24490, term24490.getClass(), "dataBuffer", null);
        setIntField(term24490, term24490.getClass(), "minX", 0);
        setIntField(term24490, term24490.getClass(), "minY", 0);
        setIntField(term24490, term24490.getClass(), "width", 0);
        setIntField(term24490, term24490.getClass(), "height", 0);
        setIntField(term24490, term24490.getClass(), "sampleModelTranslateX", 0);
        setIntField(term24490, term24490.getClass(), "sampleModelTranslateY", 0);
        setIntField(term24490, term24490.getClass(), "numBands", 0);
        setIntField(term24490, term24490.getClass(), "numDataElements", 0);
        setField(term24490, term24490.getClass(), "parent", null);
        setField(term24481, term24481.getClass(), "parent", term24490);
        setField(term24479, term24479.getClass(), "raster", term24481);
        setField(term24479, term24479.getClass(), "osis", null);
        setField(term24499, term24499.getClass(), "table", term24500);
        setIntField(term24499, term24499.getClass(), "count", 1);
        setIntField(term24499, term24499.getClass(), "threshold", 8);
        setFloatField(term24499, term24499.getClass(), "loadFactor", 0.75F);
        setIntField(term24499, term24499.getClass(), "modCount", 1);
        setField(term24499, term24499.getClass(), "keySet", null);
        setField(term24499, term24499.getClass(), "entrySet", null);
        setField(term24499, term24499.getClass(), "values", null);
        setField(term24479, term24479.getClass(), "properties", term24499);
        setFloatField(term24479, term24479.getClass(), "accelerationPriority", 0.3692338F);
        setField(term24479, term24479.getClass(), "surfaceManager", null);
        setField(term24478, term24478.getClass(), "img", term24479);
        setField(term24478, term24478.getClass(), "name", "bLPjGVBhlX");
        setIntField(term24478, term24478.getClass(), "index", 2063762142);
        setField(term24439, term24439.getClass(), "icon", term24478);
        setField(term24439, term24439.getClass(), "matchByString", "whBvTVIIlC");
        setBooleanField(term24439, term24439.getClass(), "randomEventPopup", true);
        term24532 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term24533 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term24535 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term24544 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term24553 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term24562 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term24563 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term24564 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term24533, term24533.getClass(), "imageType", 1658391716);
        setField(term24533, term24533.getClass(), "colorModel", null);
        setField(term24535, term24535.getClass(), "sampleModel", null);
        setField(term24535, term24535.getClass(), "dataBuffer", null);
        setIntField(term24535, term24535.getClass(), "minX", 2143282300);
        setIntField(term24535, term24535.getClass(), "minY", 1137624258);
        setIntField(term24535, term24535.getClass(), "width", 977862393);
        setIntField(term24535, term24535.getClass(), "height", 301401782);
        setIntField(term24535, term24535.getClass(), "sampleModelTranslateX", 1988605357);
        setIntField(term24535, term24535.getClass(), "sampleModelTranslateY", 808203320);
        setIntField(term24535, term24535.getClass(), "numBands", -544382127);
        setIntField(term24535, term24535.getClass(), "numDataElements", -1830198043);
        setField(term24544, term24544.getClass(), "sampleModel", null);
        setField(term24544, term24544.getClass(), "dataBuffer", null);
        setIntField(term24544, term24544.getClass(), "minX", -439048495);
        setIntField(term24544, term24544.getClass(), "minY", -1849105286);
        setIntField(term24544, term24544.getClass(), "width", 1334483645);
        setIntField(term24544, term24544.getClass(), "height", 917513193);
        setIntField(term24544, term24544.getClass(), "sampleModelTranslateX", 787278105);
        setIntField(term24544, term24544.getClass(), "sampleModelTranslateY", -2063843486);
        setIntField(term24544, term24544.getClass(), "numBands", 833762980);
        setIntField(term24544, term24544.getClass(), "numDataElements", 320711637);
        setField(term24553, term24553.getClass(), "sampleModel", null);
        setField(term24553, term24553.getClass(), "dataBuffer", null);
        setIntField(term24553, term24553.getClass(), "minX", 0);
        setIntField(term24553, term24553.getClass(), "minY", 0);
        setIntField(term24553, term24553.getClass(), "width", 0);
        setIntField(term24553, term24553.getClass(), "height", 0);
        setIntField(term24553, term24553.getClass(), "sampleModelTranslateX", 0);
        setIntField(term24553, term24553.getClass(), "sampleModelTranslateY", 0);
        setIntField(term24553, term24553.getClass(), "numBands", 0);
        setIntField(term24553, term24553.getClass(), "numDataElements", 0);
        setField(term24553, term24553.getClass(), "parent", null);
        setField(term24544, term24544.getClass(), "parent", term24553);
        setField(term24535, term24535.getClass(), "parent", term24544);
        setField(term24533, term24533.getClass(), "raster", term24535);
        setField(term24533, term24533.getClass(), "osis", null);
        setIntField(term24564, term24564.getClass(), "hash", 2031595005);
        setField(term24564, term24564.getClass(), "key", null);
        setField(term24564, term24564.getClass(), "value", null);
        setField(term24564, term24564.getClass(), "next", null);
        setElement(term24563, 0, term24564);
        setField(term24562, term24562.getClass(), "table", term24563);
        setIntField(term24562, term24562.getClass(), "count", 1);
        setIntField(term24562, term24562.getClass(), "threshold", 8);
        setFloatField(term24562, term24562.getClass(), "loadFactor", 0.75F);
        setIntField(term24562, term24562.getClass(), "modCount", 1);
        setField(term24562, term24562.getClass(), "keySet", null);
        setField(term24562, term24562.getClass(), "entrySet", null);
        setField(term24562, term24562.getClass(), "values", null);
        setField(term24533, term24533.getClass(), "properties", term24562);
        setFloatField(term24533, term24533.getClass(), "accelerationPriority", 0.13906479F);
        setField(term24533, term24533.getClass(), "surfaceManager", null);
        setField(term24532, term24532.getClass(), "img", term24533);
        setField(term24532, term24532.getClass(), "name", "JUmudUmaaV");
        setIntField(term24532, term24532.getClass(), "index", 1723148410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = term24532;
        callMethod(klass, "setIcon", argTypes, term24439, args);
    }

};


