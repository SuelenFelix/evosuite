package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class MessagePanel_init_400644990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65616;
     Object term65709;
     Object term65711;
     Object term65713;

    public MessagePanel_init_400644990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65852 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term65851 = ((Class) term65852).getDeclaredField((String) "LEADER");
        ((Field) term65851).setAccessible(true);
        Object enum138 = ((Field) term65851).get((Object) null);
        Class<? extends Object> term66582 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term66581 = ((Class) term66582).getDeclaredField((String) "EVASION");
        ((Field) term66581).setAccessible(true);
        Object enum139 = ((Field) term66581).get((Object) null);
        term65616 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term65617 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term65621 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term65655 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term65656 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term65658 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term65667 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term65676 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term65677 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term65617, term65617.getClass(), "x", -147381920);
        setIntField(term65617, term65617.getClass(), "y", -7568006);
        setField(term65616, term65616.getClass(), "coordinate", term65617);
        setIntField(term65616, term65616.getClass(), "index", -715290594);
        setField(term65621, term65621.getClass(), "mainType", enum138);
        setField(term65621, term65621.getClass(), "subType", enum139);
        setField(term65616, term65616.getClass(), "type", term65621);
        setField(term65616, term65616.getClass(), "message", "dTxnMmHoVm");
        setIntField(term65656, term65656.getClass(), "imageType", -860371306);
        setField(term65656, term65656.getClass(), "colorModel", null);
        setField(term65658, term65658.getClass(), "sampleModel", null);
        setField(term65658, term65658.getClass(), "dataBuffer", null);
        setIntField(term65658, term65658.getClass(), "minX", -125626789);
        setIntField(term65658, term65658.getClass(), "minY", -309827965);
        setIntField(term65658, term65658.getClass(), "width", -1534471014);
        setIntField(term65658, term65658.getClass(), "height", -468720148);
        setIntField(term65658, term65658.getClass(), "sampleModelTranslateX", 164755425);
        setIntField(term65658, term65658.getClass(), "sampleModelTranslateY", 205469595);
        setIntField(term65658, term65658.getClass(), "numBands", -638606539);
        setIntField(term65658, term65658.getClass(), "numDataElements", -172607907);
        setField(term65667, term65667.getClass(), "sampleModel", null);
        setField(term65667, term65667.getClass(), "dataBuffer", null);
        setIntField(term65667, term65667.getClass(), "minX", 0);
        setIntField(term65667, term65667.getClass(), "minY", 0);
        setIntField(term65667, term65667.getClass(), "width", 0);
        setIntField(term65667, term65667.getClass(), "height", 0);
        setIntField(term65667, term65667.getClass(), "sampleModelTranslateX", 0);
        setIntField(term65667, term65667.getClass(), "sampleModelTranslateY", 0);
        setIntField(term65667, term65667.getClass(), "numBands", 0);
        setIntField(term65667, term65667.getClass(), "numDataElements", 0);
        setField(term65667, term65667.getClass(), "parent", null);
        setField(term65658, term65658.getClass(), "parent", term65667);
        setField(term65656, term65656.getClass(), "raster", term65658);
        setField(term65656, term65656.getClass(), "osis", null);
        setField(term65676, term65676.getClass(), "table", term65677);
        setIntField(term65676, term65676.getClass(), "count", 1);
        setIntField(term65676, term65676.getClass(), "threshold", 8);
        setFloatField(term65676, term65676.getClass(), "loadFactor", 0.75F);
        setIntField(term65676, term65676.getClass(), "modCount", 1);
        setField(term65676, term65676.getClass(), "keySet", null);
        setField(term65676, term65676.getClass(), "entrySet", null);
        setField(term65676, term65676.getClass(), "values", null);
        setField(term65656, term65656.getClass(), "properties", term65676);
        setFloatField(term65656, term65656.getClass(), "accelerationPriority", 0.791937F);
        setField(term65656, term65656.getClass(), "surfaceManager", null);
        setField(term65655, term65655.getClass(), "img", term65656);
        setField(term65655, term65655.getClass(), "name", "MxUSQqhNse");
        setIntField(term65655, term65655.getClass(), "index", -51407538);
        setField(term65616, term65616.getClass(), "icon", term65655);
        setField(term65616, term65616.getClass(), "matchByString", "skwxdosvQV");
        setBooleanField(term65616, term65616.getClass(), "randomEventPopup", true);
        term65709 = new Integer(-465783748);
        term65711 = new Integer(1780832439);
        term65713 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.MessagePanel");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.message.Message");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[8];
        args[0] = "JGdxVjQzts";
        args[1] = "jEdjRikQtN";
        args[2] = "fSNUaokVWs";
        args[3] = term65616;
        args[4] = term65709;
        args[5] = term65711;
        args[6] = term65713;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


