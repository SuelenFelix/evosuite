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

public class Message_getType_9173163115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19636;

    public Message_getType_9173163115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19735 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term19734 = ((Class) term19735).getDeclaredField((String) "POPULATION");
        ((Field) term19734).setAccessible(true);
        Object enum62 = ((Field) term19734).get((Object) null);
        Class<? extends Object> term19982 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term19981 = ((Class) term19982).getDeclaredField((String) "OBSTACLE");
        ((Field) term19981).setAccessible(true);
        Object enum63 = ((Field) term19981).get((Object) null);
        term19636 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term19637 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term19641 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term19680 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term19681 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term19683 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term19692 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term19701 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term19702 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term19637, term19637.getClass(), "x", 306847454);
        setIntField(term19637, term19637.getClass(), "y", 1745276158);
        setField(term19636, term19636.getClass(), "coordinate", term19637);
        setIntField(term19636, term19636.getClass(), "index", 2049577015);
        setField(term19641, term19641.getClass(), "mainType", enum62);
        setField(term19641, term19641.getClass(), "subType", enum63);
        setField(term19636, term19636.getClass(), "type", term19641);
        setField(term19636, term19636.getClass(), "message", "IDCWpPLRkE");
        setIntField(term19681, term19681.getClass(), "imageType", 1236004505);
        setField(term19681, term19681.getClass(), "colorModel", null);
        setField(term19683, term19683.getClass(), "sampleModel", null);
        setField(term19683, term19683.getClass(), "dataBuffer", null);
        setIntField(term19683, term19683.getClass(), "minX", 1050765721);
        setIntField(term19683, term19683.getClass(), "minY", 474518942);
        setIntField(term19683, term19683.getClass(), "width", -1656687479);
        setIntField(term19683, term19683.getClass(), "height", -249614216);
        setIntField(term19683, term19683.getClass(), "sampleModelTranslateX", 1870727665);
        setIntField(term19683, term19683.getClass(), "sampleModelTranslateY", -519881101);
        setIntField(term19683, term19683.getClass(), "numBands", -680920524);
        setIntField(term19683, term19683.getClass(), "numDataElements", -916335264);
        setField(term19692, term19692.getClass(), "sampleModel", null);
        setField(term19692, term19692.getClass(), "dataBuffer", null);
        setIntField(term19692, term19692.getClass(), "minX", 0);
        setIntField(term19692, term19692.getClass(), "minY", 0);
        setIntField(term19692, term19692.getClass(), "width", 0);
        setIntField(term19692, term19692.getClass(), "height", 0);
        setIntField(term19692, term19692.getClass(), "sampleModelTranslateX", 0);
        setIntField(term19692, term19692.getClass(), "sampleModelTranslateY", 0);
        setIntField(term19692, term19692.getClass(), "numBands", 0);
        setIntField(term19692, term19692.getClass(), "numDataElements", 0);
        setField(term19692, term19692.getClass(), "parent", null);
        setField(term19683, term19683.getClass(), "parent", term19692);
        setField(term19681, term19681.getClass(), "raster", term19683);
        setField(term19681, term19681.getClass(), "osis", null);
        setField(term19701, term19701.getClass(), "table", term19702);
        setIntField(term19701, term19701.getClass(), "count", 1);
        setIntField(term19701, term19701.getClass(), "threshold", 8);
        setFloatField(term19701, term19701.getClass(), "loadFactor", 0.75F);
        setIntField(term19701, term19701.getClass(), "modCount", 1);
        setField(term19701, term19701.getClass(), "keySet", null);
        setField(term19701, term19701.getClass(), "entrySet", null);
        setField(term19701, term19701.getClass(), "values", null);
        setField(term19681, term19681.getClass(), "properties", term19701);
        setFloatField(term19681, term19681.getClass(), "accelerationPriority", 0.5254275F);
        setField(term19681, term19681.getClass(), "surfaceManager", null);
        setField(term19680, term19680.getClass(), "img", term19681);
        setField(term19680, term19680.getClass(), "name", "aKnKipADSo");
        setIntField(term19680, term19680.getClass(), "index", -43417861);
        setField(term19636, term19636.getClass(), "icon", term19680);
        setField(term19636, term19636.getClass(), "matchByString", "wSQxaModmm");
        setBooleanField(term19636, term19636.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term19636, args);
    }

};


