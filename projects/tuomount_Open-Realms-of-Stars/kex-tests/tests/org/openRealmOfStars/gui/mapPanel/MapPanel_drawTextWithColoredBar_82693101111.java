package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MapPanel_drawTextWithColoredBar_82693101111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51214;
     Object term51251;
     Object term51260;
     Object term51262;
     Object term51264;
     Object term51266;
     Object term51268;
     Object term51270;

    public MapPanel_drawTextWithColoredBar_82693101111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51214 = newInstance(Class.forName("java.awt.Font"));
        Object term51215 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term51216 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51217 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51219 = newInstance(Class.forName("java.lang.Object"));
        Object term51220 = newInstance(Class.forName("java.lang.Object"));
        Object term51246 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term51248 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51249 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term51217, term51217.getClass(), "hash", 1482772304);
        setField(term51217, term51217.getClass(), "key", term51219);
        setField(term51217, term51217.getClass(), "value", term51220);
        setField(term51217, term51217.getClass(), "next", null);
        setElement(term51216, 2, term51217);
        setField(term51215, term51215.getClass(), "table", term51216);
        setIntField(term51215, term51215.getClass(), "count", 1);
        setIntField(term51215, term51215.getClass(), "threshold", 8);
        setFloatField(term51215, term51215.getClass(), "loadFactor", 0.75F);
        setIntField(term51215, term51215.getClass(), "modCount", 1);
        setField(term51215, term51215.getClass(), "keySet", null);
        setField(term51215, term51215.getClass(), "entrySet", null);
        setField(term51215, term51215.getClass(), "values", null);
        setField(term51214, term51214.getClass(), "fRequestedAttributes", term51215);
        setField(term51214, term51214.getClass(), "name", "YsUtbngnRO");
        setIntField(term51214, term51214.getClass(), "style", 948347134);
        setIntField(term51214, term51214.getClass(), "size", -1552842218);
        setFloatField(term51214, term51214.getClass(), "pointSize", 0.5879052F);
        setField(term51214, term51214.getClass(), "peer", null);
        setLongField(term51214, term51214.getClass(), "pData", -4325723315152823407L);
        setField(term51214, term51214.getClass(), "font2DHandle", null);
        setField(term51214, term51214.getClass(), "values", null);
        setBooleanField(term51214, term51214.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term51214, term51214.getClass(), "createdFont", false);
        setBooleanField(term51214, term51214.getClass(), "nonIdentityTx", false);
        setIntField(term51214, term51214.getClass(), "hash", -157220068);
        setIntField(term51214, term51214.getClass(), "fontSerializedDataVersion", 141434141);
        setLongField(term51246, term51246.getClass(), "timestamp", 2535595959091595249L);
        setField(term51246, term51246.getClass(), "referent", null);
        setField(term51248, term51248.getClass(), "lock", term51249);
        setField(term51248, term51248.getClass(), "head", null);
        setLongField(term51248, term51248.getClass(), "queueLength", -5476826692763582090L);
        setField(term51246, term51246.getClass(), "queue", term51248);
        setField(term51246, term51246.getClass(), "next", null);
        setField(term51246, term51246.getClass(), "discovered", null);
        setField(term51214, term51214.getClass(), "flmref", term51246);
        term51251 = newInstance(Class.forName("java.awt.Color"));
        float[] term51253 = (float[]) newFloatArray(0);
        float[] term51254 = (float[]) newFloatArray(4);
        setIntField(term51251, term51251.getClass(), "value", -505635206);
        setField(term51251, term51251.getClass(), "frgbvalue", term51253);
        setFloatElement(term51254, 0, 0.6482086F);
        setFloatElement(term51254, 1, 0.4588288F);
        setFloatElement(term51254, 2, 0.31543463F);
        setFloatElement(term51254, 3, 0.90836F);
        setField(term51251, term51251.getClass(), "fvalue", term51254);
        setFloatField(term51251, term51251.getClass(), "falpha", 0.020103633F);
        setField(term51251, term51251.getClass(), "cs", null);
        term51260 = new Integer(932246615);
        term51262 = new Integer(261281668);
        term51264 = new Integer(1712273163);
        term51266 = new Integer(234306621);
        term51268 = new Integer(1025525602);
        term51270 = new Integer(1669406334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.MapPanel");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.awt.Font");
        argTypes[3] = Class.forName("java.awt.Color");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = "OGQsfjmReM";
        args[2] = term51214;
        args[3] = term51251;
        args[4] = term51260;
        args[5] = term51262;
        args[6] = term51264;
        args[7] = term51266;
        args[8] = term51268;
        args[9] = term51270;
        callMethod(klass, "drawTextWithColoredBar", argTypes, null, args);
    }

};


