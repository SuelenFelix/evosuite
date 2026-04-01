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

public class MessageList_addNewMessage_6463779199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9627;

    public MessageList_addNewMessage_6463779199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9725 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term9724 = ((Class) term9725).getDeclaredField((String) "FLEET");
        ((Field) term9724).setAccessible(true);
        Object enum26 = ((Field) term9724).get((Object) null);
        Class<? extends Object> term9957 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term9956 = ((Class) term9957).getDeclaredField((String) "ASSIMILATION");
        ((Field) term9956).setAccessible(true);
        Object enum27 = ((Field) term9956).get((Object) null);
        term9627 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term9628 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term9632 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term9670 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term9671 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9673 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9682 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9691 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9692 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term9628, term9628.getClass(), "x", -523949691);
        setIntField(term9628, term9628.getClass(), "y", 1398204340);
        setField(term9627, term9627.getClass(), "coordinate", term9628);
        setIntField(term9627, term9627.getClass(), "index", -461771056);
        setField(term9632, term9632.getClass(), "mainType", enum26);
        setField(term9632, term9632.getClass(), "subType", enum27);
        setField(term9627, term9627.getClass(), "type", term9632);
        setField(term9627, term9627.getClass(), "message", "NRdvgJlhkX");
        setIntField(term9671, term9671.getClass(), "imageType", -243422082);
        setField(term9671, term9671.getClass(), "colorModel", null);
        setField(term9673, term9673.getClass(), "sampleModel", null);
        setField(term9673, term9673.getClass(), "dataBuffer", null);
        setIntField(term9673, term9673.getClass(), "minX", 1384592638);
        setIntField(term9673, term9673.getClass(), "minY", -1002370457);
        setIntField(term9673, term9673.getClass(), "width", -2014576105);
        setIntField(term9673, term9673.getClass(), "height", 1296895584);
        setIntField(term9673, term9673.getClass(), "sampleModelTranslateX", 628918458);
        setIntField(term9673, term9673.getClass(), "sampleModelTranslateY", -1274456137);
        setIntField(term9673, term9673.getClass(), "numBands", 1041916673);
        setIntField(term9673, term9673.getClass(), "numDataElements", -601863069);
        setField(term9682, term9682.getClass(), "sampleModel", null);
        setField(term9682, term9682.getClass(), "dataBuffer", null);
        setIntField(term9682, term9682.getClass(), "minX", 0);
        setIntField(term9682, term9682.getClass(), "minY", 0);
        setIntField(term9682, term9682.getClass(), "width", 0);
        setIntField(term9682, term9682.getClass(), "height", 0);
        setIntField(term9682, term9682.getClass(), "sampleModelTranslateX", 0);
        setIntField(term9682, term9682.getClass(), "sampleModelTranslateY", 0);
        setIntField(term9682, term9682.getClass(), "numBands", 0);
        setIntField(term9682, term9682.getClass(), "numDataElements", 0);
        setField(term9682, term9682.getClass(), "parent", null);
        setField(term9673, term9673.getClass(), "parent", term9682);
        setField(term9671, term9671.getClass(), "raster", term9673);
        setField(term9671, term9671.getClass(), "osis", null);
        setField(term9691, term9691.getClass(), "table", term9692);
        setIntField(term9691, term9691.getClass(), "count", 1);
        setIntField(term9691, term9691.getClass(), "threshold", 8);
        setFloatField(term9691, term9691.getClass(), "loadFactor", 0.75F);
        setIntField(term9691, term9691.getClass(), "modCount", 1);
        setField(term9691, term9691.getClass(), "keySet", null);
        setField(term9691, term9691.getClass(), "entrySet", null);
        setField(term9691, term9691.getClass(), "values", null);
        setField(term9671, term9671.getClass(), "properties", term9691);
        setFloatField(term9671, term9671.getClass(), "accelerationPriority", 0.13238746F);
        setField(term9671, term9671.getClass(), "surfaceManager", null);
        setField(term9670, term9670.getClass(), "img", term9671);
        setField(term9670, term9670.getClass(), "name", "MxlszYVzRf");
        setIntField(term9670, term9670.getClass(), "index", -1885090354);
        setField(term9627, term9627.getClass(), "icon", term9670);
        setField(term9627, term9627.getClass(), "matchByString", "LQFpaHEwXR");
        setBooleanField(term9627, term9627.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.Message");
        Object[] args = new Object[1];
        args[0] = term9627;
        callMethod(klass, "addNewMessage", argTypes, null, args);
    }

};


