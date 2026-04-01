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

public class Message_toString_110936796818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28190;

    public Message_toString_110936796818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28287 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term28286 = ((Class) term28287).getDeclaredField((String) "RESEARCH");
        ((Field) term28286).setAccessible(true);
        Object enum90 = ((Field) term28286).get((Object) null);
        Class<? extends Object> term28528 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term28527 = ((Class) term28528).getDeclaredField((String) "OBSTACLE");
        ((Field) term28527).setAccessible(true);
        Object enum91 = ((Field) term28527).get((Object) null);
        term28190 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term28191 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term28195 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term28232 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term28233 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term28235 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term28244 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term28253 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term28254 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term28191, term28191.getClass(), "x", 433248783);
        setIntField(term28191, term28191.getClass(), "y", -507944154);
        setField(term28190, term28190.getClass(), "coordinate", term28191);
        setIntField(term28190, term28190.getClass(), "index", 897010381);
        setField(term28195, term28195.getClass(), "mainType", enum90);
        setField(term28195, term28195.getClass(), "subType", enum91);
        setField(term28190, term28190.getClass(), "type", term28195);
        setField(term28190, term28190.getClass(), "message", "jiKYgYHqIS");
        setIntField(term28233, term28233.getClass(), "imageType", -15712667);
        setField(term28233, term28233.getClass(), "colorModel", null);
        setField(term28235, term28235.getClass(), "sampleModel", null);
        setField(term28235, term28235.getClass(), "dataBuffer", null);
        setIntField(term28235, term28235.getClass(), "minX", 1964967720);
        setIntField(term28235, term28235.getClass(), "minY", 1351900243);
        setIntField(term28235, term28235.getClass(), "width", -330897705);
        setIntField(term28235, term28235.getClass(), "height", 1065595802);
        setIntField(term28235, term28235.getClass(), "sampleModelTranslateX", 21031843);
        setIntField(term28235, term28235.getClass(), "sampleModelTranslateY", -380787857);
        setIntField(term28235, term28235.getClass(), "numBands", 319853052);
        setIntField(term28235, term28235.getClass(), "numDataElements", -1097563716);
        setField(term28244, term28244.getClass(), "sampleModel", null);
        setField(term28244, term28244.getClass(), "dataBuffer", null);
        setIntField(term28244, term28244.getClass(), "minX", 0);
        setIntField(term28244, term28244.getClass(), "minY", 0);
        setIntField(term28244, term28244.getClass(), "width", 0);
        setIntField(term28244, term28244.getClass(), "height", 0);
        setIntField(term28244, term28244.getClass(), "sampleModelTranslateX", 0);
        setIntField(term28244, term28244.getClass(), "sampleModelTranslateY", 0);
        setIntField(term28244, term28244.getClass(), "numBands", 0);
        setIntField(term28244, term28244.getClass(), "numDataElements", 0);
        setField(term28244, term28244.getClass(), "parent", null);
        setField(term28235, term28235.getClass(), "parent", term28244);
        setField(term28233, term28233.getClass(), "raster", term28235);
        setField(term28233, term28233.getClass(), "osis", null);
        setField(term28253, term28253.getClass(), "table", term28254);
        setIntField(term28253, term28253.getClass(), "count", 1);
        setIntField(term28253, term28253.getClass(), "threshold", 8);
        setFloatField(term28253, term28253.getClass(), "loadFactor", 0.75F);
        setIntField(term28253, term28253.getClass(), "modCount", 1);
        setField(term28253, term28253.getClass(), "keySet", null);
        setField(term28253, term28253.getClass(), "entrySet", null);
        setField(term28253, term28253.getClass(), "values", null);
        setField(term28233, term28233.getClass(), "properties", term28253);
        setFloatField(term28233, term28233.getClass(), "accelerationPriority", 0.9985961F);
        setField(term28233, term28233.getClass(), "surfaceManager", null);
        setField(term28232, term28232.getClass(), "img", term28233);
        setField(term28232, term28232.getClass(), "name", "XqgfKFvPSD");
        setIntField(term28232, term28232.getClass(), "index", 1608016787);
        setField(term28190, term28190.getClass(), "icon", term28232);
        setField(term28190, term28190.getClass(), "matchByString", "JiVRgTZvKc");
        setBooleanField(term28190, term28190.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28190, args);
    }

};


