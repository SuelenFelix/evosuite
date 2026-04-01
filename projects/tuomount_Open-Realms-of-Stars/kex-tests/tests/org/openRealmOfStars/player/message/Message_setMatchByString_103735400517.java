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

public class Message_setMatchByString_103735400517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27548;

    public Message_setMatchByString_103735400517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27660 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term27659 = ((Class) term27660).getDeclaredField((String) "POPULATION");
        ((Field) term27659).setAccessible(true);
        Object enum88 = ((Field) term27659).get((Object) null);
        Class<? extends Object> term27907 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term27906 = ((Class) term27907).getDeclaredField((String) "FREE_JAIL");
        ((Field) term27906).setAccessible(true);
        Object enum89 = ((Field) term27906).get((Object) null);
        term27548 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term27549 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term27553 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term27593 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term27594 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term27596 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term27605 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term27614 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term27615 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term27549, term27549.getClass(), "x", -726681073);
        setIntField(term27549, term27549.getClass(), "y", -1724487863);
        setField(term27548, term27548.getClass(), "coordinate", term27549);
        setIntField(term27548, term27548.getClass(), "index", 202214133);
        setField(term27553, term27553.getClass(), "mainType", enum88);
        setField(term27553, term27553.getClass(), "subType", enum89);
        setField(term27548, term27548.getClass(), "type", term27553);
        setField(term27548, term27548.getClass(), "message", "jSpAteRute");
        setIntField(term27594, term27594.getClass(), "imageType", 1543091617);
        setField(term27594, term27594.getClass(), "colorModel", null);
        setField(term27596, term27596.getClass(), "sampleModel", null);
        setField(term27596, term27596.getClass(), "dataBuffer", null);
        setIntField(term27596, term27596.getClass(), "minX", -763166094);
        setIntField(term27596, term27596.getClass(), "minY", -222941705);
        setIntField(term27596, term27596.getClass(), "width", 291864719);
        setIntField(term27596, term27596.getClass(), "height", -1549607466);
        setIntField(term27596, term27596.getClass(), "sampleModelTranslateX", 853609788);
        setIntField(term27596, term27596.getClass(), "sampleModelTranslateY", -197820800);
        setIntField(term27596, term27596.getClass(), "numBands", 723812297);
        setIntField(term27596, term27596.getClass(), "numDataElements", 1639448749);
        setField(term27605, term27605.getClass(), "sampleModel", null);
        setField(term27605, term27605.getClass(), "dataBuffer", null);
        setIntField(term27605, term27605.getClass(), "minX", 0);
        setIntField(term27605, term27605.getClass(), "minY", 0);
        setIntField(term27605, term27605.getClass(), "width", 0);
        setIntField(term27605, term27605.getClass(), "height", 0);
        setIntField(term27605, term27605.getClass(), "sampleModelTranslateX", 0);
        setIntField(term27605, term27605.getClass(), "sampleModelTranslateY", 0);
        setIntField(term27605, term27605.getClass(), "numBands", 0);
        setIntField(term27605, term27605.getClass(), "numDataElements", 0);
        setField(term27605, term27605.getClass(), "parent", null);
        setField(term27596, term27596.getClass(), "parent", term27605);
        setField(term27594, term27594.getClass(), "raster", term27596);
        setField(term27594, term27594.getClass(), "osis", null);
        setField(term27614, term27614.getClass(), "table", term27615);
        setIntField(term27614, term27614.getClass(), "count", 1);
        setIntField(term27614, term27614.getClass(), "threshold", 8);
        setFloatField(term27614, term27614.getClass(), "loadFactor", 0.75F);
        setIntField(term27614, term27614.getClass(), "modCount", 1);
        setField(term27614, term27614.getClass(), "keySet", null);
        setField(term27614, term27614.getClass(), "entrySet", null);
        setField(term27614, term27614.getClass(), "values", null);
        setField(term27594, term27594.getClass(), "properties", term27614);
        setFloatField(term27594, term27594.getClass(), "accelerationPriority", 0.8474802F);
        setField(term27594, term27594.getClass(), "surfaceManager", null);
        setField(term27593, term27593.getClass(), "img", term27594);
        setField(term27593, term27593.getClass(), "name", "xOcJIiQQDu");
        setIntField(term27593, term27593.getClass(), "index", -975748721);
        setField(term27548, term27548.getClass(), "icon", term27593);
        setField(term27548, term27548.getClass(), "matchByString", "GVizqqzXpy");
        setBooleanField(term27548, term27548.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "setMatchByString", argTypes, term27548, args);
    }

};


