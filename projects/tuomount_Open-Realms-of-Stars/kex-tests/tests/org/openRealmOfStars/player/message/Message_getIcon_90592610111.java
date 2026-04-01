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

public class Message_getIcon_90592610111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23827;

    public Message_getIcon_90592610111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23925 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term23924 = ((Class) term23925).getDeclaredField((String) "POPULATION");
        ((Field) term23924).setAccessible(true);
        Object enum76 = ((Field) term23924).get((Object) null);
        Class<? extends Object> term24172 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term24171 = ((Class) term24172).getDeclaredField((String) "MONSTER");
        ((Field) term24171).setAccessible(true);
        Object enum77 = ((Field) term24171).get((Object) null);
        term23827 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term23828 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term23832 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term23870 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term23871 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term23873 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term23882 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term23891 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term23892 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term23828, term23828.getClass(), "x", -1667482829);
        setIntField(term23828, term23828.getClass(), "y", 1116576792);
        setField(term23827, term23827.getClass(), "coordinate", term23828);
        setIntField(term23827, term23827.getClass(), "index", -938508470);
        setField(term23832, term23832.getClass(), "mainType", enum76);
        setField(term23832, term23832.getClass(), "subType", enum77);
        setField(term23827, term23827.getClass(), "type", term23832);
        setField(term23827, term23827.getClass(), "message", "eqJfYWRaEL");
        setIntField(term23871, term23871.getClass(), "imageType", 1242676024);
        setField(term23871, term23871.getClass(), "colorModel", null);
        setField(term23873, term23873.getClass(), "sampleModel", null);
        setField(term23873, term23873.getClass(), "dataBuffer", null);
        setIntField(term23873, term23873.getClass(), "minX", -1865023308);
        setIntField(term23873, term23873.getClass(), "minY", 1698510819);
        setIntField(term23873, term23873.getClass(), "width", -1553893255);
        setIntField(term23873, term23873.getClass(), "height", 1303442927);
        setIntField(term23873, term23873.getClass(), "sampleModelTranslateX", 794568325);
        setIntField(term23873, term23873.getClass(), "sampleModelTranslateY", -434468428);
        setIntField(term23873, term23873.getClass(), "numBands", 1559605714);
        setIntField(term23873, term23873.getClass(), "numDataElements", 1146601902);
        setField(term23882, term23882.getClass(), "sampleModel", null);
        setField(term23882, term23882.getClass(), "dataBuffer", null);
        setIntField(term23882, term23882.getClass(), "minX", 0);
        setIntField(term23882, term23882.getClass(), "minY", 0);
        setIntField(term23882, term23882.getClass(), "width", 0);
        setIntField(term23882, term23882.getClass(), "height", 0);
        setIntField(term23882, term23882.getClass(), "sampleModelTranslateX", 0);
        setIntField(term23882, term23882.getClass(), "sampleModelTranslateY", 0);
        setIntField(term23882, term23882.getClass(), "numBands", 0);
        setIntField(term23882, term23882.getClass(), "numDataElements", 0);
        setField(term23882, term23882.getClass(), "parent", null);
        setField(term23873, term23873.getClass(), "parent", term23882);
        setField(term23871, term23871.getClass(), "raster", term23873);
        setField(term23871, term23871.getClass(), "osis", null);
        setField(term23891, term23891.getClass(), "table", term23892);
        setIntField(term23891, term23891.getClass(), "count", 1);
        setIntField(term23891, term23891.getClass(), "threshold", 8);
        setFloatField(term23891, term23891.getClass(), "loadFactor", 0.75F);
        setIntField(term23891, term23891.getClass(), "modCount", 1);
        setField(term23891, term23891.getClass(), "keySet", null);
        setField(term23891, term23891.getClass(), "entrySet", null);
        setField(term23891, term23891.getClass(), "values", null);
        setField(term23871, term23871.getClass(), "properties", term23891);
        setFloatField(term23871, term23871.getClass(), "accelerationPriority", 0.7944024F);
        setField(term23871, term23871.getClass(), "surfaceManager", null);
        setField(term23870, term23870.getClass(), "img", term23871);
        setField(term23870, term23870.getClass(), "name", "uWHnvSvaPl");
        setIntField(term23870, term23870.getClass(), "index", -1629418973);
        setField(term23827, term23827.getClass(), "icon", term23870);
        setField(term23827, term23827.getClass(), "matchByString", "kBdSllIBVz");
        setBooleanField(term23827, term23827.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term23827, args);
    }

};


