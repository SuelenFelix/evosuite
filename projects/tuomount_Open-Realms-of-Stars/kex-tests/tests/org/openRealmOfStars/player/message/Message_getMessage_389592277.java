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

public class Message_getMessage_389592277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21379;

    public Message_getMessage_389592277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21479 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term21478 = ((Class) term21479).getDeclaredField((String) "CONSTRUCTION");
        ((Field) term21478).setAccessible(true);
        Object enum68 = ((Field) term21478).get((Object) null);
        Class<? extends Object> term21732 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term21731 = ((Class) term21732).getDeclaredField((String) "PROMISE");
        ((Field) term21731).setAccessible(true);
        Object enum69 = ((Field) term21731).get((Object) null);
        term21379 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term21380 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term21384 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term21424 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term21425 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term21427 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term21436 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term21445 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term21446 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term21380, term21380.getClass(), "x", -49052672);
        setIntField(term21380, term21380.getClass(), "y", 339372704);
        setField(term21379, term21379.getClass(), "coordinate", term21380);
        setIntField(term21379, term21379.getClass(), "index", 803925431);
        setField(term21384, term21384.getClass(), "mainType", enum68);
        setField(term21384, term21384.getClass(), "subType", enum69);
        setField(term21379, term21379.getClass(), "type", term21384);
        setField(term21379, term21379.getClass(), "message", "GzFkzHGYFt");
        setIntField(term21425, term21425.getClass(), "imageType", 76929641);
        setField(term21425, term21425.getClass(), "colorModel", null);
        setField(term21427, term21427.getClass(), "sampleModel", null);
        setField(term21427, term21427.getClass(), "dataBuffer", null);
        setIntField(term21427, term21427.getClass(), "minX", -2003192918);
        setIntField(term21427, term21427.getClass(), "minY", -1362856620);
        setIntField(term21427, term21427.getClass(), "width", -1835839814);
        setIntField(term21427, term21427.getClass(), "height", -1404350380);
        setIntField(term21427, term21427.getClass(), "sampleModelTranslateX", -2013924238);
        setIntField(term21427, term21427.getClass(), "sampleModelTranslateY", 579006268);
        setIntField(term21427, term21427.getClass(), "numBands", -1694747156);
        setIntField(term21427, term21427.getClass(), "numDataElements", 1466373988);
        setField(term21436, term21436.getClass(), "sampleModel", null);
        setField(term21436, term21436.getClass(), "dataBuffer", null);
        setIntField(term21436, term21436.getClass(), "minX", 0);
        setIntField(term21436, term21436.getClass(), "minY", 0);
        setIntField(term21436, term21436.getClass(), "width", 0);
        setIntField(term21436, term21436.getClass(), "height", 0);
        setIntField(term21436, term21436.getClass(), "sampleModelTranslateX", 0);
        setIntField(term21436, term21436.getClass(), "sampleModelTranslateY", 0);
        setIntField(term21436, term21436.getClass(), "numBands", 0);
        setIntField(term21436, term21436.getClass(), "numDataElements", 0);
        setField(term21436, term21436.getClass(), "parent", null);
        setField(term21427, term21427.getClass(), "parent", term21436);
        setField(term21425, term21425.getClass(), "raster", term21427);
        setField(term21425, term21425.getClass(), "osis", null);
        setField(term21445, term21445.getClass(), "table", term21446);
        setIntField(term21445, term21445.getClass(), "count", 1);
        setIntField(term21445, term21445.getClass(), "threshold", 8);
        setFloatField(term21445, term21445.getClass(), "loadFactor", 0.75F);
        setIntField(term21445, term21445.getClass(), "modCount", 1);
        setField(term21445, term21445.getClass(), "keySet", null);
        setField(term21445, term21445.getClass(), "entrySet", null);
        setField(term21445, term21445.getClass(), "values", null);
        setField(term21425, term21425.getClass(), "properties", term21445);
        setFloatField(term21425, term21425.getClass(), "accelerationPriority", 0.6880585F);
        setField(term21425, term21425.getClass(), "surfaceManager", null);
        setField(term21424, term21424.getClass(), "img", term21425);
        setField(term21424, term21424.getClass(), "name", "LvtrsXUliU");
        setIntField(term21424, term21424.getClass(), "index", 1843268026);
        setField(term21379, term21379.getClass(), "icon", term21424);
        setField(term21379, term21379.getClass(), "matchByString", "xLbjWUgOIL");
        setBooleanField(term21379, term21379.getClass(), "randomEventPopup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term21379, args);
    }

};


