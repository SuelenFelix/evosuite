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

public class MessageList_addFirstMessage_185618801510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10239;

    public MessageList_addFirstMessage_185618801510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10335 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term10334 = ((Class) term10335).getDeclaredField((String) "RESEARCH");
        ((Field) term10334).setAccessible(true);
        Object enum28 = ((Field) term10334).get((Object) null);
        Class<? extends Object> term10576 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term10575 = ((Class) term10576).getDeclaredField((String) "CULTURE");
        ((Field) term10575).setAccessible(true);
        Object enum29 = ((Field) term10575).get((Object) null);
        term10239 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term10240 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term10244 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term10280 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term10281 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term10283 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term10292 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term10301 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term10302 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term10240, term10240.getClass(), "x", -2066804303);
        setIntField(term10240, term10240.getClass(), "y", -1731761810);
        setField(term10239, term10239.getClass(), "coordinate", term10240);
        setIntField(term10239, term10239.getClass(), "index", -1239406390);
        setField(term10244, term10244.getClass(), "mainType", enum28);
        setField(term10244, term10244.getClass(), "subType", enum29);
        setField(term10239, term10239.getClass(), "type", term10244);
        setField(term10239, term10239.getClass(), "message", "oVcInYnLWB");
        setIntField(term10281, term10281.getClass(), "imageType", 1557431527);
        setField(term10281, term10281.getClass(), "colorModel", null);
        setField(term10283, term10283.getClass(), "sampleModel", null);
        setField(term10283, term10283.getClass(), "dataBuffer", null);
        setIntField(term10283, term10283.getClass(), "minX", -1504890659);
        setIntField(term10283, term10283.getClass(), "minY", 1358829571);
        setIntField(term10283, term10283.getClass(), "width", 991356662);
        setIntField(term10283, term10283.getClass(), "height", -506958186);
        setIntField(term10283, term10283.getClass(), "sampleModelTranslateX", -507387516);
        setIntField(term10283, term10283.getClass(), "sampleModelTranslateY", -1970452551);
        setIntField(term10283, term10283.getClass(), "numBands", -1896376975);
        setIntField(term10283, term10283.getClass(), "numDataElements", 729658803);
        setField(term10292, term10292.getClass(), "sampleModel", null);
        setField(term10292, term10292.getClass(), "dataBuffer", null);
        setIntField(term10292, term10292.getClass(), "minX", 0);
        setIntField(term10292, term10292.getClass(), "minY", 0);
        setIntField(term10292, term10292.getClass(), "width", 0);
        setIntField(term10292, term10292.getClass(), "height", 0);
        setIntField(term10292, term10292.getClass(), "sampleModelTranslateX", 0);
        setIntField(term10292, term10292.getClass(), "sampleModelTranslateY", 0);
        setIntField(term10292, term10292.getClass(), "numBands", 0);
        setIntField(term10292, term10292.getClass(), "numDataElements", 0);
        setField(term10292, term10292.getClass(), "parent", null);
        setField(term10283, term10283.getClass(), "parent", term10292);
        setField(term10281, term10281.getClass(), "raster", term10283);
        setField(term10281, term10281.getClass(), "osis", null);
        setField(term10301, term10301.getClass(), "table", term10302);
        setIntField(term10301, term10301.getClass(), "count", 1);
        setIntField(term10301, term10301.getClass(), "threshold", 8);
        setFloatField(term10301, term10301.getClass(), "loadFactor", 0.75F);
        setIntField(term10301, term10301.getClass(), "modCount", 1);
        setField(term10301, term10301.getClass(), "keySet", null);
        setField(term10301, term10301.getClass(), "entrySet", null);
        setField(term10301, term10301.getClass(), "values", null);
        setField(term10281, term10281.getClass(), "properties", term10301);
        setFloatField(term10281, term10281.getClass(), "accelerationPriority", 0.2707036F);
        setField(term10281, term10281.getClass(), "surfaceManager", null);
        setField(term10280, term10280.getClass(), "img", term10281);
        setField(term10280, term10280.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term10280, term10280.getClass(), "index", 1687361082);
        setField(term10239, term10239.getClass(), "icon", term10280);
        setField(term10239, term10239.getClass(), "matchByString", "tbcdzjIfER");
        setBooleanField(term10239, term10239.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.Message");
        Object[] args = new Object[1];
        args[0] = term10239;
        callMethod(klass, "addFirstMessage", argTypes, null, args);
    }

};


