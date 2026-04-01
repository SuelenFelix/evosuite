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

public class Message_setImageInstructions_206870390210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23205;

    public Message_setImageInstructions_206870390210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23312 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term23311 = ((Class) term23312).getDeclaredField((String) "PLANETARY");
        ((Field) term23311).setAccessible(true);
        Object enum74 = ((Field) term23311).get((Object) null);
        Class<? extends Object> term23556 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term23555 = ((Class) term23556).getDeclaredField((String) "STORY");
        ((Field) term23555).setAccessible(true);
        Object enum75 = ((Field) term23555).get((Object) null);
        term23205 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term23206 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term23210 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term23245 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term23246 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term23248 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term23257 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term23266 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term23267 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term23206, term23206.getClass(), "x", -1268314569);
        setIntField(term23206, term23206.getClass(), "y", 877649659);
        setField(term23205, term23205.getClass(), "coordinate", term23206);
        setIntField(term23205, term23205.getClass(), "index", 1774507971);
        setField(term23210, term23210.getClass(), "mainType", enum74);
        setField(term23210, term23210.getClass(), "subType", enum75);
        setField(term23205, term23205.getClass(), "type", term23210);
        setField(term23205, term23205.getClass(), "message", "ytSBIKXogI");
        setIntField(term23246, term23246.getClass(), "imageType", -1420269858);
        setField(term23246, term23246.getClass(), "colorModel", null);
        setField(term23248, term23248.getClass(), "sampleModel", null);
        setField(term23248, term23248.getClass(), "dataBuffer", null);
        setIntField(term23248, term23248.getClass(), "minX", -2119545015);
        setIntField(term23248, term23248.getClass(), "minY", 1272542218);
        setIntField(term23248, term23248.getClass(), "width", 1209799204);
        setIntField(term23248, term23248.getClass(), "height", 1094107751);
        setIntField(term23248, term23248.getClass(), "sampleModelTranslateX", 844222656);
        setIntField(term23248, term23248.getClass(), "sampleModelTranslateY", -18216811);
        setIntField(term23248, term23248.getClass(), "numBands", -1813280137);
        setIntField(term23248, term23248.getClass(), "numDataElements", 719656595);
        setField(term23257, term23257.getClass(), "sampleModel", null);
        setField(term23257, term23257.getClass(), "dataBuffer", null);
        setIntField(term23257, term23257.getClass(), "minX", 0);
        setIntField(term23257, term23257.getClass(), "minY", 0);
        setIntField(term23257, term23257.getClass(), "width", 0);
        setIntField(term23257, term23257.getClass(), "height", 0);
        setIntField(term23257, term23257.getClass(), "sampleModelTranslateX", 0);
        setIntField(term23257, term23257.getClass(), "sampleModelTranslateY", 0);
        setIntField(term23257, term23257.getClass(), "numBands", 0);
        setIntField(term23257, term23257.getClass(), "numDataElements", 0);
        setField(term23257, term23257.getClass(), "parent", null);
        setField(term23248, term23248.getClass(), "parent", term23257);
        setField(term23246, term23246.getClass(), "raster", term23248);
        setField(term23246, term23246.getClass(), "osis", null);
        setField(term23266, term23266.getClass(), "table", term23267);
        setIntField(term23266, term23266.getClass(), "count", 1);
        setIntField(term23266, term23266.getClass(), "threshold", 8);
        setFloatField(term23266, term23266.getClass(), "loadFactor", 0.75F);
        setIntField(term23266, term23266.getClass(), "modCount", 1);
        setField(term23266, term23266.getClass(), "keySet", null);
        setField(term23266, term23266.getClass(), "entrySet", null);
        setField(term23266, term23266.getClass(), "values", null);
        setField(term23246, term23246.getClass(), "properties", term23266);
        setFloatField(term23246, term23246.getClass(), "accelerationPriority", 0.26413453F);
        setField(term23246, term23246.getClass(), "surfaceManager", null);
        setField(term23245, term23245.getClass(), "img", term23246);
        setField(term23245, term23245.getClass(), "name", "ieCtQFdkii");
        setIntField(term23245, term23245.getClass(), "index", -390501023);
        setField(term23205, term23205.getClass(), "icon", term23245);
        setField(term23205, term23205.getClass(), "matchByString", "dEnhdmILtU");
        setBooleanField(term23205, term23205.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "setImageInstructions", argTypes, term23205, args);
    }

};


