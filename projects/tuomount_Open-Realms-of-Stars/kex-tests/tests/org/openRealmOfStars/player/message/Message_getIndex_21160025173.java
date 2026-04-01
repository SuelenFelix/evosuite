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

public class Message_getIndex_21160025173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18414;

    public Message_getIndex_21160025173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18511 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term18510 = ((Class) term18511).getDeclaredField((String) "PLANETARY");
        ((Field) term18510).setAccessible(true);
        Object enum58 = ((Field) term18510).get((Object) null);
        Class<? extends Object> term18755 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term18754 = ((Class) term18755).getDeclaredField((String) "WAITING");
        ((Field) term18754).setAccessible(true);
        Object enum59 = ((Field) term18754).get((Object) null);
        term18414 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term18415 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term18419 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term18456 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term18457 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term18459 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term18468 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term18477 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term18478 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term18415, term18415.getClass(), "x", 534834644);
        setIntField(term18415, term18415.getClass(), "y", 1959097203);
        setField(term18414, term18414.getClass(), "coordinate", term18415);
        setIntField(term18414, term18414.getClass(), "index", 477625804);
        setField(term18419, term18419.getClass(), "mainType", enum58);
        setField(term18419, term18419.getClass(), "subType", enum59);
        setField(term18414, term18414.getClass(), "type", term18419);
        setField(term18414, term18414.getClass(), "message", "TEParAifyi");
        setIntField(term18457, term18457.getClass(), "imageType", 252575029);
        setField(term18457, term18457.getClass(), "colorModel", null);
        setField(term18459, term18459.getClass(), "sampleModel", null);
        setField(term18459, term18459.getClass(), "dataBuffer", null);
        setIntField(term18459, term18459.getClass(), "minX", 57189932);
        setIntField(term18459, term18459.getClass(), "minY", 1460722225);
        setIntField(term18459, term18459.getClass(), "width", 1743224434);
        setIntField(term18459, term18459.getClass(), "height", 842904495);
        setIntField(term18459, term18459.getClass(), "sampleModelTranslateX", 1008080511);
        setIntField(term18459, term18459.getClass(), "sampleModelTranslateY", 1935707624);
        setIntField(term18459, term18459.getClass(), "numBands", 1507074215);
        setIntField(term18459, term18459.getClass(), "numDataElements", -282881827);
        setField(term18468, term18468.getClass(), "sampleModel", null);
        setField(term18468, term18468.getClass(), "dataBuffer", null);
        setIntField(term18468, term18468.getClass(), "minX", 0);
        setIntField(term18468, term18468.getClass(), "minY", 0);
        setIntField(term18468, term18468.getClass(), "width", 0);
        setIntField(term18468, term18468.getClass(), "height", 0);
        setIntField(term18468, term18468.getClass(), "sampleModelTranslateX", 0);
        setIntField(term18468, term18468.getClass(), "sampleModelTranslateY", 0);
        setIntField(term18468, term18468.getClass(), "numBands", 0);
        setIntField(term18468, term18468.getClass(), "numDataElements", 0);
        setField(term18468, term18468.getClass(), "parent", null);
        setField(term18459, term18459.getClass(), "parent", term18468);
        setField(term18457, term18457.getClass(), "raster", term18459);
        setField(term18457, term18457.getClass(), "osis", null);
        setField(term18477, term18477.getClass(), "table", term18478);
        setIntField(term18477, term18477.getClass(), "count", 1);
        setIntField(term18477, term18477.getClass(), "threshold", 8);
        setFloatField(term18477, term18477.getClass(), "loadFactor", 0.75F);
        setIntField(term18477, term18477.getClass(), "modCount", 1);
        setField(term18477, term18477.getClass(), "keySet", null);
        setField(term18477, term18477.getClass(), "entrySet", null);
        setField(term18477, term18477.getClass(), "values", null);
        setField(term18457, term18457.getClass(), "properties", term18477);
        setFloatField(term18457, term18457.getClass(), "accelerationPriority", 0.8564069F);
        setField(term18457, term18457.getClass(), "surfaceManager", null);
        setField(term18456, term18456.getClass(), "img", term18457);
        setField(term18456, term18456.getClass(), "name", "dWRymuLBtr");
        setIntField(term18456, term18456.getClass(), "index", -420030135);
        setField(term18414, term18414.getClass(), "icon", term18456);
        setField(term18414, term18414.getClass(), "matchByString", "AijpHYOFuy");
        setBooleanField(term18414, term18414.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term18414, args);
    }

};


