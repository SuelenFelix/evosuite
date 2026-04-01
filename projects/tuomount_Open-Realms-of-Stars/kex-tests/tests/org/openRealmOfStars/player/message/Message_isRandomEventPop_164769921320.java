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

public class Message_isRandomEventPop_164769921320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29406;

    public Message_isRandomEventPop_164769921320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29506 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term29505 = ((Class) term29506).getDeclaredField((String) "FLEET");
        ((Field) term29505).setAccessible(true);
        Object enum94 = ((Field) term29505).get((Object) null);
        Class<? extends Object> term29738 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term29737 = ((Class) term29738).getDeclaredField((String) "BUILT_BUILDING");
        ((Field) term29737).setAccessible(true);
        Object enum95 = ((Field) term29737).get((Object) null);
        term29406 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term29407 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term29411 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term29451 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term29452 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term29454 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term29463 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term29472 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term29473 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term29407, term29407.getClass(), "x", 2027686272);
        setIntField(term29407, term29407.getClass(), "y", -1494356104);
        setField(term29406, term29406.getClass(), "coordinate", term29407);
        setIntField(term29406, term29406.getClass(), "index", 114279242);
        setField(term29411, term29411.getClass(), "mainType", enum94);
        setField(term29411, term29411.getClass(), "subType", enum95);
        setField(term29406, term29406.getClass(), "type", term29411);
        setField(term29406, term29406.getClass(), "message", "AWRooQKkdW");
        setIntField(term29452, term29452.getClass(), "imageType", 990883365);
        setField(term29452, term29452.getClass(), "colorModel", null);
        setField(term29454, term29454.getClass(), "sampleModel", null);
        setField(term29454, term29454.getClass(), "dataBuffer", null);
        setIntField(term29454, term29454.getClass(), "minX", 633598642);
        setIntField(term29454, term29454.getClass(), "minY", 1862841859);
        setIntField(term29454, term29454.getClass(), "width", -1114668574);
        setIntField(term29454, term29454.getClass(), "height", 514511037);
        setIntField(term29454, term29454.getClass(), "sampleModelTranslateX", 1713573821);
        setIntField(term29454, term29454.getClass(), "sampleModelTranslateY", 1956590498);
        setIntField(term29454, term29454.getClass(), "numBands", 1467356494);
        setIntField(term29454, term29454.getClass(), "numDataElements", -26316536);
        setField(term29463, term29463.getClass(), "sampleModel", null);
        setField(term29463, term29463.getClass(), "dataBuffer", null);
        setIntField(term29463, term29463.getClass(), "minX", 0);
        setIntField(term29463, term29463.getClass(), "minY", 0);
        setIntField(term29463, term29463.getClass(), "width", 0);
        setIntField(term29463, term29463.getClass(), "height", 0);
        setIntField(term29463, term29463.getClass(), "sampleModelTranslateX", 0);
        setIntField(term29463, term29463.getClass(), "sampleModelTranslateY", 0);
        setIntField(term29463, term29463.getClass(), "numBands", 0);
        setIntField(term29463, term29463.getClass(), "numDataElements", 0);
        setField(term29463, term29463.getClass(), "parent", null);
        setField(term29454, term29454.getClass(), "parent", term29463);
        setField(term29452, term29452.getClass(), "raster", term29454);
        setField(term29452, term29452.getClass(), "osis", null);
        setField(term29472, term29472.getClass(), "table", term29473);
        setIntField(term29472, term29472.getClass(), "count", 1);
        setIntField(term29472, term29472.getClass(), "threshold", 8);
        setFloatField(term29472, term29472.getClass(), "loadFactor", 0.75F);
        setIntField(term29472, term29472.getClass(), "modCount", 1);
        setField(term29472, term29472.getClass(), "keySet", null);
        setField(term29472, term29472.getClass(), "entrySet", null);
        setField(term29472, term29472.getClass(), "values", null);
        setField(term29452, term29452.getClass(), "properties", term29472);
        setFloatField(term29452, term29452.getClass(), "accelerationPriority", 0.97262454F);
        setField(term29452, term29452.getClass(), "surfaceManager", null);
        setField(term29451, term29451.getClass(), "img", term29452);
        setField(term29451, term29451.getClass(), "name", "QXzGXbEXMu");
        setIntField(term29451, term29451.getClass(), "index", 1692937831);
        setField(term29406, term29406.getClass(), "icon", term29451);
        setField(term29406, term29406.getClass(), "matchByString", "qxSDVejjiY");
        setBooleanField(term29406, term29406.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRandomEventPop", argTypes, term29406, args);
    }

};


