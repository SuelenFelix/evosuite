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

public class Message_getMatchByString_40308599516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26936;

    public Message_getMatchByString_40308599516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27034 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term27033 = ((Class) term27034).getDeclaredField((String) "RESEARCH");
        ((Field) term27033).setAccessible(true);
        Object enum86 = ((Field) term27033).get((Object) null);
        Class<? extends Object> term27275 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term27274 = ((Class) term27275).getDeclaredField((String) "ESPIONAGE");
        ((Field) term27274).setAccessible(true);
        Object enum87 = ((Field) term27274).get((Object) null);
        term26936 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term26937 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term26941 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term26979 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term26980 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term26982 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term26991 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term27000 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term27001 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term26937, term26937.getClass(), "x", 1887772522);
        setIntField(term26937, term26937.getClass(), "y", 354196060);
        setField(term26936, term26936.getClass(), "coordinate", term26937);
        setIntField(term26936, term26936.getClass(), "index", 1365087144);
        setField(term26941, term26941.getClass(), "mainType", enum86);
        setField(term26941, term26941.getClass(), "subType", enum87);
        setField(term26936, term26936.getClass(), "type", term26941);
        setField(term26936, term26936.getClass(), "message", "LvJFtLBaxj");
        setIntField(term26980, term26980.getClass(), "imageType", -1537255112);
        setField(term26980, term26980.getClass(), "colorModel", null);
        setField(term26982, term26982.getClass(), "sampleModel", null);
        setField(term26982, term26982.getClass(), "dataBuffer", null);
        setIntField(term26982, term26982.getClass(), "minX", 934477462);
        setIntField(term26982, term26982.getClass(), "minY", 4900410);
        setIntField(term26982, term26982.getClass(), "width", -1252345779);
        setIntField(term26982, term26982.getClass(), "height", -2063365430);
        setIntField(term26982, term26982.getClass(), "sampleModelTranslateX", 812570053);
        setIntField(term26982, term26982.getClass(), "sampleModelTranslateY", -1488938905);
        setIntField(term26982, term26982.getClass(), "numBands", 1916544127);
        setIntField(term26982, term26982.getClass(), "numDataElements", -1133405894);
        setField(term26991, term26991.getClass(), "sampleModel", null);
        setField(term26991, term26991.getClass(), "dataBuffer", null);
        setIntField(term26991, term26991.getClass(), "minX", 0);
        setIntField(term26991, term26991.getClass(), "minY", 0);
        setIntField(term26991, term26991.getClass(), "width", 0);
        setIntField(term26991, term26991.getClass(), "height", 0);
        setIntField(term26991, term26991.getClass(), "sampleModelTranslateX", 0);
        setIntField(term26991, term26991.getClass(), "sampleModelTranslateY", 0);
        setIntField(term26991, term26991.getClass(), "numBands", 0);
        setIntField(term26991, term26991.getClass(), "numDataElements", 0);
        setField(term26991, term26991.getClass(), "parent", null);
        setField(term26982, term26982.getClass(), "parent", term26991);
        setField(term26980, term26980.getClass(), "raster", term26982);
        setField(term26980, term26980.getClass(), "osis", null);
        setField(term27000, term27000.getClass(), "table", term27001);
        setIntField(term27000, term27000.getClass(), "count", 1);
        setIntField(term27000, term27000.getClass(), "threshold", 8);
        setFloatField(term27000, term27000.getClass(), "loadFactor", 0.75F);
        setIntField(term27000, term27000.getClass(), "modCount", 1);
        setField(term27000, term27000.getClass(), "keySet", null);
        setField(term27000, term27000.getClass(), "entrySet", null);
        setField(term27000, term27000.getClass(), "values", null);
        setField(term26980, term26980.getClass(), "properties", term27000);
        setFloatField(term26980, term26980.getClass(), "accelerationPriority", 0.24413109F);
        setField(term26980, term26980.getClass(), "surfaceManager", null);
        setField(term26979, term26979.getClass(), "img", term26980);
        setField(term26979, term26979.getClass(), "name", "TimdotUuNC");
        setIntField(term26979, term26979.getClass(), "index", 243280944);
        setField(term26936, term26936.getClass(), "icon", term26979);
        setField(term26936, term26936.getClass(), "matchByString", "PkWMRdJcBb");
        setBooleanField(term26936, term26936.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchByString", argTypes, term26936, args);
    }

};


