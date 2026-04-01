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

public class MessageList_addUpcomingMessage_34634748911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10843;

    public MessageList_addUpcomingMessage_34634748911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10936 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term10935 = ((Class) term10936).getDeclaredField((String) "NEWS");
        ((Field) term10935).setAccessible(true);
        Object enum30 = ((Field) term10935).get((Object) null);
        Class<? extends Object> term11165 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term11164 = ((Class) term11165).getDeclaredField((String) "POP_GROW");
        ((Field) term11164).setAccessible(true);
        Object enum31 = ((Field) term11164).get((Object) null);
        term10843 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term10844 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term10848 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term10881 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term10882 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term10884 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term10893 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term10902 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term10903 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term10844, term10844.getClass(), "x", 584893196);
        setIntField(term10844, term10844.getClass(), "y", 497269071);
        setField(term10843, term10843.getClass(), "coordinate", term10844);
        setIntField(term10843, term10843.getClass(), "index", -1882480155);
        setField(term10848, term10848.getClass(), "mainType", enum30);
        setField(term10848, term10848.getClass(), "subType", enum31);
        setField(term10843, term10843.getClass(), "type", term10848);
        setField(term10843, term10843.getClass(), "message", "HyxfbSQYBe");
        setIntField(term10882, term10882.getClass(), "imageType", -1410220680);
        setField(term10882, term10882.getClass(), "colorModel", null);
        setField(term10884, term10884.getClass(), "sampleModel", null);
        setField(term10884, term10884.getClass(), "dataBuffer", null);
        setIntField(term10884, term10884.getClass(), "minX", 389427431);
        setIntField(term10884, term10884.getClass(), "minY", -1945706126);
        setIntField(term10884, term10884.getClass(), "width", 1152356969);
        setIntField(term10884, term10884.getClass(), "height", -1667990367);
        setIntField(term10884, term10884.getClass(), "sampleModelTranslateX", -1214628358);
        setIntField(term10884, term10884.getClass(), "sampleModelTranslateY", 1102721075);
        setIntField(term10884, term10884.getClass(), "numBands", -426764678);
        setIntField(term10884, term10884.getClass(), "numDataElements", -1222614956);
        setField(term10893, term10893.getClass(), "sampleModel", null);
        setField(term10893, term10893.getClass(), "dataBuffer", null);
        setIntField(term10893, term10893.getClass(), "minX", 0);
        setIntField(term10893, term10893.getClass(), "minY", 0);
        setIntField(term10893, term10893.getClass(), "width", 0);
        setIntField(term10893, term10893.getClass(), "height", 0);
        setIntField(term10893, term10893.getClass(), "sampleModelTranslateX", 0);
        setIntField(term10893, term10893.getClass(), "sampleModelTranslateY", 0);
        setIntField(term10893, term10893.getClass(), "numBands", 0);
        setIntField(term10893, term10893.getClass(), "numDataElements", 0);
        setField(term10893, term10893.getClass(), "parent", null);
        setField(term10884, term10884.getClass(), "parent", term10893);
        setField(term10882, term10882.getClass(), "raster", term10884);
        setField(term10882, term10882.getClass(), "osis", null);
        setField(term10902, term10902.getClass(), "table", term10903);
        setIntField(term10902, term10902.getClass(), "count", 1);
        setIntField(term10902, term10902.getClass(), "threshold", 8);
        setFloatField(term10902, term10902.getClass(), "loadFactor", 0.75F);
        setIntField(term10902, term10902.getClass(), "modCount", 1);
        setField(term10902, term10902.getClass(), "keySet", null);
        setField(term10902, term10902.getClass(), "entrySet", null);
        setField(term10902, term10902.getClass(), "values", null);
        setField(term10882, term10882.getClass(), "properties", term10902);
        setFloatField(term10882, term10882.getClass(), "accelerationPriority", 0.3455959F);
        setField(term10882, term10882.getClass(), "surfaceManager", null);
        setField(term10881, term10881.getClass(), "img", term10882);
        setField(term10881, term10881.getClass(), "name", "hNxWaHcfhY");
        setIntField(term10881, term10881.getClass(), "index", -1310015129);
        setField(term10843, term10843.getClass(), "icon", term10881);
        setField(term10843, term10843.getClass(), "matchByString", "RkybSrpybU");
        setBooleanField(term10843, term10843.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.Message");
        Object[] args = new Object[1];
        args[0] = term10843;
        callMethod(klass, "addUpcomingMessage", argTypes, null, args);
    }

};


