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

public class Message_copy_128193646819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28798;

    public Message_copy_128193646819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28895 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term28894 = ((Class) term28895).getDeclaredField((String) "LEADER");
        ((Field) term28894).setAccessible(true);
        Object enum92 = ((Field) term28894).get((Object) null);
        Class<? extends Object> term29130 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term29129 = ((Class) term29130).getDeclaredField((String) "TRADE_STOP");
        ((Field) term29129).setAccessible(true);
        Object enum93 = ((Field) term29129).get((Object) null);
        term28798 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term28799 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term28803 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term28840 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term28841 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term28843 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term28852 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term28861 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term28862 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term28799, term28799.getClass(), "x", -516303035);
        setIntField(term28799, term28799.getClass(), "y", -2143043890);
        setField(term28798, term28798.getClass(), "coordinate", term28799);
        setIntField(term28798, term28798.getClass(), "index", 1454781562);
        setField(term28803, term28803.getClass(), "mainType", enum92);
        setField(term28803, term28803.getClass(), "subType", enum93);
        setField(term28798, term28798.getClass(), "type", term28803);
        setField(term28798, term28798.getClass(), "message", "XPKmummaqg");
        setIntField(term28841, term28841.getClass(), "imageType", -27944011);
        setField(term28841, term28841.getClass(), "colorModel", null);
        setField(term28843, term28843.getClass(), "sampleModel", null);
        setField(term28843, term28843.getClass(), "dataBuffer", null);
        setIntField(term28843, term28843.getClass(), "minX", -20614472);
        setIntField(term28843, term28843.getClass(), "minY", 1126618861);
        setIntField(term28843, term28843.getClass(), "width", 947449400);
        setIntField(term28843, term28843.getClass(), "height", -763799087);
        setIntField(term28843, term28843.getClass(), "sampleModelTranslateX", 1207142014);
        setIntField(term28843, term28843.getClass(), "sampleModelTranslateY", -876426634);
        setIntField(term28843, term28843.getClass(), "numBands", 213831054);
        setIntField(term28843, term28843.getClass(), "numDataElements", 330043745);
        setField(term28852, term28852.getClass(), "sampleModel", null);
        setField(term28852, term28852.getClass(), "dataBuffer", null);
        setIntField(term28852, term28852.getClass(), "minX", 0);
        setIntField(term28852, term28852.getClass(), "minY", 0);
        setIntField(term28852, term28852.getClass(), "width", 0);
        setIntField(term28852, term28852.getClass(), "height", 0);
        setIntField(term28852, term28852.getClass(), "sampleModelTranslateX", 0);
        setIntField(term28852, term28852.getClass(), "sampleModelTranslateY", 0);
        setIntField(term28852, term28852.getClass(), "numBands", 0);
        setIntField(term28852, term28852.getClass(), "numDataElements", 0);
        setField(term28852, term28852.getClass(), "parent", null);
        setField(term28843, term28843.getClass(), "parent", term28852);
        setField(term28841, term28841.getClass(), "raster", term28843);
        setField(term28841, term28841.getClass(), "osis", null);
        setField(term28861, term28861.getClass(), "table", term28862);
        setIntField(term28861, term28861.getClass(), "count", 1);
        setIntField(term28861, term28861.getClass(), "threshold", 8);
        setFloatField(term28861, term28861.getClass(), "loadFactor", 0.75F);
        setIntField(term28861, term28861.getClass(), "modCount", 1);
        setField(term28861, term28861.getClass(), "keySet", null);
        setField(term28861, term28861.getClass(), "entrySet", null);
        setField(term28861, term28861.getClass(), "values", null);
        setField(term28841, term28841.getClass(), "properties", term28861);
        setFloatField(term28841, term28841.getClass(), "accelerationPriority", 0.51832694F);
        setField(term28841, term28841.getClass(), "surfaceManager", null);
        setField(term28840, term28840.getClass(), "img", term28841);
        setField(term28840, term28840.getClass(), "name", "SPpkrGcPRr");
        setIntField(term28840, term28840.getClass(), "index", -1639041228);
        setField(term28798, term28798.getClass(), "icon", term28840);
        setField(term28798, term28798.getClass(), "matchByString", "sEccwbJKYE");
        setBooleanField(term28798, term28798.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term28798, args);
    }

};


