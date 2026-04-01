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

public class Message_setMessage_8504402519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22579;

    public Message_setMessage_8504402519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22687 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term22686 = ((Class) term22687).getDeclaredField((String) "STORY");
        ((Field) term22686).setAccessible(true);
        Object enum72 = ((Field) term22686).get((Object) null);
        Class<? extends Object> term22919 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term22918 = ((Class) term22919).getDeclaredField((String) "GOOD_EVENT");
        ((Field) term22918).setAccessible(true);
        Object enum73 = ((Field) term22918).get((Object) null);
        term22579 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term22580 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term22584 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term22620 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term22621 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term22623 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term22632 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term22641 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term22642 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term22580, term22580.getClass(), "x", 68922753);
        setIntField(term22580, term22580.getClass(), "y", -220791533);
        setField(term22579, term22579.getClass(), "coordinate", term22580);
        setIntField(term22579, term22579.getClass(), "index", -2070466617);
        setField(term22584, term22584.getClass(), "mainType", enum72);
        setField(term22584, term22584.getClass(), "subType", enum73);
        setField(term22579, term22579.getClass(), "type", term22584);
        setField(term22579, term22579.getClass(), "message", "JDswTTCZHV");
        setIntField(term22621, term22621.getClass(), "imageType", -1127721881);
        setField(term22621, term22621.getClass(), "colorModel", null);
        setField(term22623, term22623.getClass(), "sampleModel", null);
        setField(term22623, term22623.getClass(), "dataBuffer", null);
        setIntField(term22623, term22623.getClass(), "minX", 1074848808);
        setIntField(term22623, term22623.getClass(), "minY", -146054762);
        setIntField(term22623, term22623.getClass(), "width", 798043553);
        setIntField(term22623, term22623.getClass(), "height", 533197381);
        setIntField(term22623, term22623.getClass(), "sampleModelTranslateX", 1048271679);
        setIntField(term22623, term22623.getClass(), "sampleModelTranslateY", -1529797673);
        setIntField(term22623, term22623.getClass(), "numBands", -868676396);
        setIntField(term22623, term22623.getClass(), "numDataElements", 1922684808);
        setField(term22632, term22632.getClass(), "sampleModel", null);
        setField(term22632, term22632.getClass(), "dataBuffer", null);
        setIntField(term22632, term22632.getClass(), "minX", 0);
        setIntField(term22632, term22632.getClass(), "minY", 0);
        setIntField(term22632, term22632.getClass(), "width", 0);
        setIntField(term22632, term22632.getClass(), "height", 0);
        setIntField(term22632, term22632.getClass(), "sampleModelTranslateX", 0);
        setIntField(term22632, term22632.getClass(), "sampleModelTranslateY", 0);
        setIntField(term22632, term22632.getClass(), "numBands", 0);
        setIntField(term22632, term22632.getClass(), "numDataElements", 0);
        setField(term22632, term22632.getClass(), "parent", null);
        setField(term22623, term22623.getClass(), "parent", term22632);
        setField(term22621, term22621.getClass(), "raster", term22623);
        setField(term22621, term22621.getClass(), "osis", null);
        setField(term22641, term22641.getClass(), "table", term22642);
        setIntField(term22641, term22641.getClass(), "count", 1);
        setIntField(term22641, term22641.getClass(), "threshold", 8);
        setFloatField(term22641, term22641.getClass(), "loadFactor", 0.75F);
        setIntField(term22641, term22641.getClass(), "modCount", 1);
        setField(term22641, term22641.getClass(), "keySet", null);
        setField(term22641, term22641.getClass(), "entrySet", null);
        setField(term22641, term22641.getClass(), "values", null);
        setField(term22621, term22621.getClass(), "properties", term22641);
        setFloatField(term22621, term22621.getClass(), "accelerationPriority", 0.8783184F);
        setField(term22621, term22621.getClass(), "surfaceManager", null);
        setField(term22620, term22620.getClass(), "img", term22621);
        setField(term22620, term22620.getClass(), "name", "YRHGsAkhxb");
        setIntField(term22620, term22620.getClass(), "index", -288604325);
        setField(term22579, term22579.getClass(), "icon", term22620);
        setField(term22579, term22579.getClass(), "matchByString", "ffYhPOzlUs");
        setBooleanField(term22579, term22579.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        callMethod(klass, "setMessage", argTypes, term22579, args);
    }

};


