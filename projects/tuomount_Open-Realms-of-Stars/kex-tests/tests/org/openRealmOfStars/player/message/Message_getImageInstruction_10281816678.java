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

public class Message_getImageInstruction_10281816678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21999;

    public Message_getImageInstruction_10281816678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22089 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term22088 = ((Class) term22089).getDeclaredField((String) "STORY");
        ((Field) term22088).setAccessible(true);
        Object enum70 = ((Field) term22088).get((Object) null);
        Class<? extends Object> term22321 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term22320 = ((Class) term22321).getDeclaredField((String) "SHIP");
        ((Field) term22320).setAccessible(true);
        Object enum71 = ((Field) term22320).get((Object) null);
        term21999 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term22000 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term22004 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term22034 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term22035 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term22037 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term22046 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term22055 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term22056 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term22000, term22000.getClass(), "x", 954660603);
        setIntField(term22000, term22000.getClass(), "y", -1351605385);
        setField(term21999, term21999.getClass(), "coordinate", term22000);
        setIntField(term21999, term21999.getClass(), "index", -310648604);
        setField(term22004, term22004.getClass(), "mainType", enum70);
        setField(term22004, term22004.getClass(), "subType", enum71);
        setField(term21999, term21999.getClass(), "type", term22004);
        setField(term21999, term21999.getClass(), "message", "jDtqGUpnZN");
        setIntField(term22035, term22035.getClass(), "imageType", -648200466);
        setField(term22035, term22035.getClass(), "colorModel", null);
        setField(term22037, term22037.getClass(), "sampleModel", null);
        setField(term22037, term22037.getClass(), "dataBuffer", null);
        setIntField(term22037, term22037.getClass(), "minX", 2007134147);
        setIntField(term22037, term22037.getClass(), "minY", 993388358);
        setIntField(term22037, term22037.getClass(), "width", -765191335);
        setIntField(term22037, term22037.getClass(), "height", -1697741155);
        setIntField(term22037, term22037.getClass(), "sampleModelTranslateX", 1295839803);
        setIntField(term22037, term22037.getClass(), "sampleModelTranslateY", -1891015523);
        setIntField(term22037, term22037.getClass(), "numBands", -1560631747);
        setIntField(term22037, term22037.getClass(), "numDataElements", 1215150180);
        setField(term22046, term22046.getClass(), "sampleModel", null);
        setField(term22046, term22046.getClass(), "dataBuffer", null);
        setIntField(term22046, term22046.getClass(), "minX", 0);
        setIntField(term22046, term22046.getClass(), "minY", 0);
        setIntField(term22046, term22046.getClass(), "width", 0);
        setIntField(term22046, term22046.getClass(), "height", 0);
        setIntField(term22046, term22046.getClass(), "sampleModelTranslateX", 0);
        setIntField(term22046, term22046.getClass(), "sampleModelTranslateY", 0);
        setIntField(term22046, term22046.getClass(), "numBands", 0);
        setIntField(term22046, term22046.getClass(), "numDataElements", 0);
        setField(term22046, term22046.getClass(), "parent", null);
        setField(term22037, term22037.getClass(), "parent", term22046);
        setField(term22035, term22035.getClass(), "raster", term22037);
        setField(term22035, term22035.getClass(), "osis", null);
        setField(term22055, term22055.getClass(), "table", term22056);
        setIntField(term22055, term22055.getClass(), "count", 1);
        setIntField(term22055, term22055.getClass(), "threshold", 8);
        setFloatField(term22055, term22055.getClass(), "loadFactor", 0.75F);
        setIntField(term22055, term22055.getClass(), "modCount", 1);
        setField(term22055, term22055.getClass(), "keySet", null);
        setField(term22055, term22055.getClass(), "entrySet", null);
        setField(term22055, term22055.getClass(), "values", null);
        setField(term22035, term22035.getClass(), "properties", term22055);
        setFloatField(term22035, term22035.getClass(), "accelerationPriority", 0.40176582F);
        setField(term22035, term22035.getClass(), "surfaceManager", null);
        setField(term22034, term22034.getClass(), "img", term22035);
        setField(term22034, term22034.getClass(), "name", "UiUYnPrcCi");
        setIntField(term22034, term22034.getClass(), "index", -1972436591);
        setField(term21999, term21999.getClass(), "icon", term22034);
        setField(term21999, term21999.getClass(), "matchByString", "UoYtihxVaS");
        setBooleanField(term21999, term21999.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageInstruction", argTypes, term21999, args);
    }

};


