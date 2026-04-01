package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GuiStatics_getTextHeight_20649083654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6248;

    public GuiStatics_getTextHeight_20649083654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6248 = newInstance(Class.forName("java.awt.Font"));
        Object term6249 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term6250 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6251 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6253 = newInstance(Class.forName("java.lang.Object"));
        Object term6254 = newInstance(Class.forName("java.lang.Object"));
        Object term6280 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term6282 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6283 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term6251, term6251.getClass(), "hash", 20290668);
        setField(term6251, term6251.getClass(), "key", term6253);
        setField(term6251, term6251.getClass(), "value", term6254);
        setField(term6251, term6251.getClass(), "next", null);
        setElement(term6250, 2, term6251);
        setField(term6249, term6249.getClass(), "table", term6250);
        setIntField(term6249, term6249.getClass(), "count", 1);
        setIntField(term6249, term6249.getClass(), "threshold", 8);
        setFloatField(term6249, term6249.getClass(), "loadFactor", 0.75F);
        setIntField(term6249, term6249.getClass(), "modCount", 1);
        setField(term6249, term6249.getClass(), "keySet", null);
        setField(term6249, term6249.getClass(), "entrySet", null);
        setField(term6249, term6249.getClass(), "values", null);
        setField(term6248, term6248.getClass(), "fRequestedAttributes", term6249);
        setField(term6248, term6248.getClass(), "name", "dEnhdmILtU");
        setIntField(term6248, term6248.getClass(), "style", -1697741155);
        setIntField(term6248, term6248.getClass(), "size", 1295839803);
        setFloatField(term6248, term6248.getClass(), "pointSize", 0.9985961F);
        setField(term6248, term6248.getClass(), "peer", null);
        setLongField(term6248, term6248.getClass(), "pData", -316468845751588286L);
        setField(term6248, term6248.getClass(), "font2DHandle", null);
        setField(term6248, term6248.getClass(), "values", null);
        setBooleanField(term6248, term6248.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term6248, term6248.getClass(), "createdFont", true);
        setBooleanField(term6248, term6248.getClass(), "nonIdentityTx", true);
        setIntField(term6248, term6248.getClass(), "hash", -1891015523);
        setIntField(term6248, term6248.getClass(), "fontSerializedDataVersion", -1560631747);
        setLongField(term6280, term6280.getClass(), "timestamp", 5127676408959197577L);
        setField(term6280, term6280.getClass(), "referent", null);
        setField(term6282, term6282.getClass(), "lock", term6283);
        setField(term6282, term6282.getClass(), "head", null);
        setLongField(term6282, term6282.getClass(), "queueLength", -6573104506744284592L);
        setField(term6280, term6280.getClass(), "queue", term6282);
        setField(term6280, term6280.getClass(), "next", null);
        setField(term6280, term6280.getClass(), "discovered", null);
        setField(term6248, term6248.getClass(), "flmref", term6280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiStatics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Font");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term6248;
        args[1] = "hoicvmsovO";
        callMethod(klass, "getTextHeight", argTypes, null, args);
    }

};


