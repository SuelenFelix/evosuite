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
import java.lang.Boolean;

public class Message_setRandomEventPop_107254153721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30026;
     Object term30133;

    public Message_setRandomEventPop_107254153721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30136 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term30135 = ((Class) term30136).getDeclaredField((String) "CONSTRUCTION");
        ((Field) term30135).setAccessible(true);
        Object enum96 = ((Field) term30135).get((Object) null);
        Class<? extends Object> term30389 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term30388 = ((Class) term30389).getDeclaredField((String) "FOUND_GAS_GIANT");
        ((Field) term30388).setAccessible(true);
        Object enum97 = ((Field) term30388).get((Object) null);
        term30026 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term30027 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term30031 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term30079 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term30080 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term30082 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term30091 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term30100 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term30101 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term30027, term30027.getClass(), "x", -1539747985);
        setIntField(term30027, term30027.getClass(), "y", -1982489643);
        setField(term30026, term30026.getClass(), "coordinate", term30027);
        setIntField(term30026, term30026.getClass(), "index", 1237549886);
        setField(term30031, term30031.getClass(), "mainType", enum96);
        setField(term30031, term30031.getClass(), "subType", enum97);
        setField(term30026, term30026.getClass(), "type", term30031);
        setField(term30026, term30026.getClass(), "message", "xBsXSDjXYK");
        setIntField(term30080, term30080.getClass(), "imageType", -1945635750);
        setField(term30080, term30080.getClass(), "colorModel", null);
        setField(term30082, term30082.getClass(), "sampleModel", null);
        setField(term30082, term30082.getClass(), "dataBuffer", null);
        setIntField(term30082, term30082.getClass(), "minX", -1622760744);
        setIntField(term30082, term30082.getClass(), "minY", 2068435279);
        setIntField(term30082, term30082.getClass(), "width", -1556527718);
        setIntField(term30082, term30082.getClass(), "height", 895255351);
        setIntField(term30082, term30082.getClass(), "sampleModelTranslateX", -1317044799);
        setIntField(term30082, term30082.getClass(), "sampleModelTranslateY", -1428063820);
        setIntField(term30082, term30082.getClass(), "numBands", -1271375703);
        setIntField(term30082, term30082.getClass(), "numDataElements", 1136208236);
        setField(term30091, term30091.getClass(), "sampleModel", null);
        setField(term30091, term30091.getClass(), "dataBuffer", null);
        setIntField(term30091, term30091.getClass(), "minX", 0);
        setIntField(term30091, term30091.getClass(), "minY", 0);
        setIntField(term30091, term30091.getClass(), "width", 0);
        setIntField(term30091, term30091.getClass(), "height", 0);
        setIntField(term30091, term30091.getClass(), "sampleModelTranslateX", 0);
        setIntField(term30091, term30091.getClass(), "sampleModelTranslateY", 0);
        setIntField(term30091, term30091.getClass(), "numBands", 0);
        setIntField(term30091, term30091.getClass(), "numDataElements", 0);
        setField(term30091, term30091.getClass(), "parent", null);
        setField(term30082, term30082.getClass(), "parent", term30091);
        setField(term30080, term30080.getClass(), "raster", term30082);
        setField(term30080, term30080.getClass(), "osis", null);
        setField(term30100, term30100.getClass(), "table", term30101);
        setIntField(term30100, term30100.getClass(), "count", 1);
        setIntField(term30100, term30100.getClass(), "threshold", 8);
        setFloatField(term30100, term30100.getClass(), "loadFactor", 0.75F);
        setIntField(term30100, term30100.getClass(), "modCount", 1);
        setField(term30100, term30100.getClass(), "keySet", null);
        setField(term30100, term30100.getClass(), "entrySet", null);
        setField(term30100, term30100.getClass(), "values", null);
        setField(term30080, term30080.getClass(), "properties", term30100);
        setFloatField(term30080, term30080.getClass(), "accelerationPriority", 0.76550204F);
        setField(term30080, term30080.getClass(), "surfaceManager", null);
        setField(term30079, term30079.getClass(), "img", term30080);
        setField(term30079, term30079.getClass(), "name", "ZVecLZMLHF");
        setIntField(term30079, term30079.getClass(), "index", -995822131);
        setField(term30026, term30026.getClass(), "icon", term30079);
        setField(term30026, term30026.getClass(), "matchByString", "fztQhjqwdP");
        setBooleanField(term30026, term30026.getClass(), "randomEventPopup", false);
        term30133 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30133;
        callMethod(klass, "setRandomEventPop", argTypes, term30026, args);
    }

};


