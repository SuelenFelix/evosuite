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

public class Message_getX_205053329514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25696;

    public Message_getX_205053329514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25798 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term25797 = ((Class) term25798).getDeclaredField((String) "CONSTRUCTION");
        ((Field) term25797).setAccessible(true);
        Object enum82 = ((Field) term25797).get((Object) null);
        Class<? extends Object> term26051 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term26050 = ((Class) term26051).getDeclaredField((String) "BAD_EVENT");
        ((Field) term26050).setAccessible(true);
        Object enum83 = ((Field) term26050).get((Object) null);
        term25696 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term25697 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term25701 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term25743 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term25744 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term25746 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term25755 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term25764 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term25765 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term25697, term25697.getClass(), "x", 200252898);
        setIntField(term25697, term25697.getClass(), "y", -1831826725);
        setField(term25696, term25696.getClass(), "coordinate", term25697);
        setIntField(term25696, term25696.getClass(), "index", -1577069773);
        setField(term25701, term25701.getClass(), "mainType", enum82);
        setField(term25701, term25701.getClass(), "subType", enum83);
        setField(term25696, term25696.getClass(), "type", term25701);
        setField(term25696, term25696.getClass(), "message", "vQVyKLdtaz");
        setIntField(term25744, term25744.getClass(), "imageType", -266625190);
        setField(term25744, term25744.getClass(), "colorModel", null);
        setField(term25746, term25746.getClass(), "sampleModel", null);
        setField(term25746, term25746.getClass(), "dataBuffer", null);
        setIntField(term25746, term25746.getClass(), "minX", 489201218);
        setIntField(term25746, term25746.getClass(), "minY", 464181937);
        setIntField(term25746, term25746.getClass(), "width", -1455526612);
        setIntField(term25746, term25746.getClass(), "height", -941356098);
        setIntField(term25746, term25746.getClass(), "sampleModelTranslateX", -201517446);
        setIntField(term25746, term25746.getClass(), "sampleModelTranslateY", -97742366);
        setIntField(term25746, term25746.getClass(), "numBands", 1638851942);
        setIntField(term25746, term25746.getClass(), "numDataElements", 1374790203);
        setField(term25755, term25755.getClass(), "sampleModel", null);
        setField(term25755, term25755.getClass(), "dataBuffer", null);
        setIntField(term25755, term25755.getClass(), "minX", 0);
        setIntField(term25755, term25755.getClass(), "minY", 0);
        setIntField(term25755, term25755.getClass(), "width", 0);
        setIntField(term25755, term25755.getClass(), "height", 0);
        setIntField(term25755, term25755.getClass(), "sampleModelTranslateX", 0);
        setIntField(term25755, term25755.getClass(), "sampleModelTranslateY", 0);
        setIntField(term25755, term25755.getClass(), "numBands", 0);
        setIntField(term25755, term25755.getClass(), "numDataElements", 0);
        setField(term25755, term25755.getClass(), "parent", null);
        setField(term25746, term25746.getClass(), "parent", term25755);
        setField(term25744, term25744.getClass(), "raster", term25746);
        setField(term25744, term25744.getClass(), "osis", null);
        setField(term25764, term25764.getClass(), "table", term25765);
        setIntField(term25764, term25764.getClass(), "count", 1);
        setIntField(term25764, term25764.getClass(), "threshold", 8);
        setFloatField(term25764, term25764.getClass(), "loadFactor", 0.75F);
        setIntField(term25764, term25764.getClass(), "modCount", 1);
        setField(term25764, term25764.getClass(), "keySet", null);
        setField(term25764, term25764.getClass(), "entrySet", null);
        setField(term25764, term25764.getClass(), "values", null);
        setField(term25744, term25744.getClass(), "properties", term25764);
        setFloatField(term25744, term25744.getClass(), "accelerationPriority", 0.6608425F);
        setField(term25744, term25744.getClass(), "surfaceManager", null);
        setField(term25743, term25743.getClass(), "img", term25744);
        setField(term25743, term25743.getClass(), "name", "wGmYcqUkgE");
        setIntField(term25743, term25743.getClass(), "index", -423900705);
        setField(term25696, term25696.getClass(), "icon", term25743);
        setField(term25696, term25696.getClass(), "matchByString", "idgaQsnJpQ");
        setBooleanField(term25696, term25696.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term25696, args);
    }

};


