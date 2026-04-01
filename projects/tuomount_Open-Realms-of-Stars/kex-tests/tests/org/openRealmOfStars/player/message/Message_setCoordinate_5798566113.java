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

public class Message_setCoordinate_5798566113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25097;
     Object term25190;

    public Message_setCoordinate_5798566113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25194 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term25193 = ((Class) term25194).getDeclaredField((String) "NEWS");
        ((Field) term25193).setAccessible(true);
        Object enum80 = ((Field) term25193).get((Object) null);
        Class<? extends Object> term25423 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term25422 = ((Class) term25423).getDeclaredField((String) "BAD_EVENT");
        ((Field) term25422).setAccessible(true);
        Object enum81 = ((Field) term25422).get((Object) null);
        term25097 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term25098 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term25102 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term25136 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term25137 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term25139 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term25148 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term25157 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term25158 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term25098, term25098.getClass(), "x", -920797484);
        setIntField(term25098, term25098.getClass(), "y", -1631697577);
        setField(term25097, term25097.getClass(), "coordinate", term25098);
        setIntField(term25097, term25097.getClass(), "index", -1703035419);
        setField(term25102, term25102.getClass(), "mainType", enum80);
        setField(term25102, term25102.getClass(), "subType", enum81);
        setField(term25097, term25097.getClass(), "type", term25102);
        setField(term25097, term25097.getClass(), "message", "KoyGrUJeJW");
        setIntField(term25137, term25137.getClass(), "imageType", 765766290);
        setField(term25137, term25137.getClass(), "colorModel", null);
        setField(term25139, term25139.getClass(), "sampleModel", null);
        setField(term25139, term25139.getClass(), "dataBuffer", null);
        setIntField(term25139, term25139.getClass(), "minX", -1284825282);
        setIntField(term25139, term25139.getClass(), "minY", -1941343035);
        setIntField(term25139, term25139.getClass(), "width", 947897214);
        setIntField(term25139, term25139.getClass(), "height", 1496340209);
        setIntField(term25139, term25139.getClass(), "sampleModelTranslateX", -1748391876);
        setIntField(term25139, term25139.getClass(), "sampleModelTranslateY", 43258317);
        setIntField(term25139, term25139.getClass(), "numBands", 1707220033);
        setIntField(term25139, term25139.getClass(), "numDataElements", -1792504217);
        setField(term25148, term25148.getClass(), "sampleModel", null);
        setField(term25148, term25148.getClass(), "dataBuffer", null);
        setIntField(term25148, term25148.getClass(), "minX", 0);
        setIntField(term25148, term25148.getClass(), "minY", 0);
        setIntField(term25148, term25148.getClass(), "width", 0);
        setIntField(term25148, term25148.getClass(), "height", 0);
        setIntField(term25148, term25148.getClass(), "sampleModelTranslateX", 0);
        setIntField(term25148, term25148.getClass(), "sampleModelTranslateY", 0);
        setIntField(term25148, term25148.getClass(), "numBands", 0);
        setIntField(term25148, term25148.getClass(), "numDataElements", 0);
        setField(term25148, term25148.getClass(), "parent", null);
        setField(term25139, term25139.getClass(), "parent", term25148);
        setField(term25137, term25137.getClass(), "raster", term25139);
        setField(term25137, term25137.getClass(), "osis", null);
        setField(term25157, term25157.getClass(), "table", term25158);
        setIntField(term25157, term25157.getClass(), "count", 1);
        setIntField(term25157, term25157.getClass(), "threshold", 8);
        setFloatField(term25157, term25157.getClass(), "loadFactor", 0.75F);
        setIntField(term25157, term25157.getClass(), "modCount", 1);
        setField(term25157, term25157.getClass(), "keySet", null);
        setField(term25157, term25157.getClass(), "entrySet", null);
        setField(term25157, term25157.getClass(), "values", null);
        setField(term25137, term25137.getClass(), "properties", term25157);
        setFloatField(term25137, term25137.getClass(), "accelerationPriority", 0.6076495F);
        setField(term25137, term25137.getClass(), "surfaceManager", null);
        setField(term25136, term25136.getClass(), "img", term25137);
        setField(term25136, term25136.getClass(), "name", "MAcUBcBckh");
        setIntField(term25136, term25136.getClass(), "index", 499519708);
        setField(term25097, term25097.getClass(), "icon", term25136);
        setField(term25097, term25097.getClass(), "matchByString", "oVgzLbrsFr");
        setBooleanField(term25097, term25097.getClass(), "randomEventPopup", true);
        term25190 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term25190, term25190.getClass(), "x", 1501165033);
        setIntField(term25190, term25190.getClass(), "y", 510162332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term25190;
        callMethod(klass, "setCoordinate", argTypes, term25097, args);
    }

};


