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

public class Message_setType_3362402796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20252;
     Object term20350;

    public Message_setType_3362402796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20377 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term20376 = ((Class) term20377).getDeclaredField((String) "POPULATION");
        ((Field) term20376).setAccessible(true);
        Object enum64 = ((Field) term20376).get((Object) null);
        Class<? extends Object> term20624 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term20623 = ((Class) term20624).getDeclaredField((String) "OBSTACLE");
        ((Field) term20623).setAccessible(true);
        Object enum65 = ((Field) term20623).get((Object) null);
        term20252 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term20253 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term20257 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term20296 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term20297 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term20299 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term20308 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term20317 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term20318 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term20253, term20253.getClass(), "x", -1533843432);
        setIntField(term20253, term20253.getClass(), "y", -123338791);
        setField(term20252, term20252.getClass(), "coordinate", term20253);
        setIntField(term20252, term20252.getClass(), "index", 413548937);
        setField(term20257, term20257.getClass(), "mainType", enum64);
        setField(term20257, term20257.getClass(), "subType", enum65);
        setField(term20252, term20252.getClass(), "type", term20257);
        setField(term20252, term20252.getClass(), "message", "UlajhuVLaP");
        setIntField(term20297, term20297.getClass(), "imageType", 1901317214);
        setField(term20297, term20297.getClass(), "colorModel", null);
        setField(term20299, term20299.getClass(), "sampleModel", null);
        setField(term20299, term20299.getClass(), "dataBuffer", null);
        setIntField(term20299, term20299.getClass(), "minX", 1166710220);
        setIntField(term20299, term20299.getClass(), "minY", -1070592289);
        setIntField(term20299, term20299.getClass(), "width", -1464172784);
        setIntField(term20299, term20299.getClass(), "height", 32185364);
        setIntField(term20299, term20299.getClass(), "sampleModelTranslateX", 1768204942);
        setIntField(term20299, term20299.getClass(), "sampleModelTranslateY", 1252951645);
        setIntField(term20299, term20299.getClass(), "numBands", 574481092);
        setIntField(term20299, term20299.getClass(), "numDataElements", -310528004);
        setField(term20308, term20308.getClass(), "sampleModel", null);
        setField(term20308, term20308.getClass(), "dataBuffer", null);
        setIntField(term20308, term20308.getClass(), "minX", 0);
        setIntField(term20308, term20308.getClass(), "minY", 0);
        setIntField(term20308, term20308.getClass(), "width", 0);
        setIntField(term20308, term20308.getClass(), "height", 0);
        setIntField(term20308, term20308.getClass(), "sampleModelTranslateX", 0);
        setIntField(term20308, term20308.getClass(), "sampleModelTranslateY", 0);
        setIntField(term20308, term20308.getClass(), "numBands", 0);
        setIntField(term20308, term20308.getClass(), "numDataElements", 0);
        setField(term20308, term20308.getClass(), "parent", null);
        setField(term20299, term20299.getClass(), "parent", term20308);
        setField(term20297, term20297.getClass(), "raster", term20299);
        setField(term20297, term20297.getClass(), "osis", null);
        setField(term20317, term20317.getClass(), "table", term20318);
        setIntField(term20317, term20317.getClass(), "count", 1);
        setIntField(term20317, term20317.getClass(), "threshold", 8);
        setFloatField(term20317, term20317.getClass(), "loadFactor", 0.75F);
        setIntField(term20317, term20317.getClass(), "modCount", 1);
        setField(term20317, term20317.getClass(), "keySet", null);
        setField(term20317, term20317.getClass(), "entrySet", null);
        setField(term20317, term20317.getClass(), "values", null);
        setField(term20297, term20297.getClass(), "properties", term20317);
        setFloatField(term20297, term20297.getClass(), "accelerationPriority", 0.2857073F);
        setField(term20297, term20297.getClass(), "surfaceManager", null);
        setField(term20296, term20296.getClass(), "img", term20297);
        setField(term20296, term20296.getClass(), "name", "hxCBltsObl");
        setIntField(term20296, term20296.getClass(), "index", -1015274146);
        setField(term20252, term20252.getClass(), "icon", term20296);
        setField(term20252, term20252.getClass(), "matchByString", "BndsHwAFMv");
        setBooleanField(term20252, term20252.getClass(), "randomEventPopup", false);
        Class<? extends Object> term20895 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term20894 = ((Class) term20895).getDeclaredField((String) "RESEARCH");
        ((Field) term20894).setAccessible(true);
        Object enum66 = ((Field) term20894).get((Object) null);
        Class<? extends Object> term21136 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term21135 = ((Class) term21136).getDeclaredField((String) "ENCOUNTER");
        ((Field) term21135).setAccessible(true);
        Object enum67 = ((Field) term21135).get((Object) null);
        term20350 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term20350, term20350.getClass(), "mainType", enum66);
        setField(term20350, term20350.getClass(), "subType", enum67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term20350;
        callMethod(klass, "setType", argTypes, term20252, args);
    }

};


