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

public class GuiFonts_getScaledFallback_32251336015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2419;

    public GuiFonts_getScaledFallback_32251336015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2419 = newInstance(Class.forName("java.awt.Font"));
        Object term2420 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2421 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2422 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2424 = newInstance(Class.forName("java.lang.Object"));
        Object term2425 = newInstance(Class.forName("java.lang.Object"));
        Object term2451 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term2453 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2454 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term2422, term2422.getClass(), "hash", 2038639216);
        setField(term2422, term2422.getClass(), "key", term2424);
        setField(term2422, term2422.getClass(), "value", term2425);
        setField(term2422, term2422.getClass(), "next", null);
        setElement(term2421, 9, term2422);
        setField(term2420, term2420.getClass(), "table", term2421);
        setIntField(term2420, term2420.getClass(), "count", 1);
        setIntField(term2420, term2420.getClass(), "threshold", 8);
        setFloatField(term2420, term2420.getClass(), "loadFactor", 0.75F);
        setIntField(term2420, term2420.getClass(), "modCount", 1);
        setField(term2420, term2420.getClass(), "keySet", null);
        setField(term2420, term2420.getClass(), "entrySet", null);
        setField(term2420, term2420.getClass(), "values", null);
        setField(term2419, term2419.getClass(), "fRequestedAttributes", term2420);
        setField(term2419, term2419.getClass(), "name", "MjGYSRKTNF");
        setIntField(term2419, term2419.getClass(), "style", -2063457669);
        setIntField(term2419, term2419.getClass(), "size", -1222006000);
        setFloatField(term2419, term2419.getClass(), "pointSize", 0.40176582F);
        setField(term2419, term2419.getClass(), "peer", null);
        setLongField(term2419, term2419.getClass(), "pData", -2813493605142626659L);
        setField(term2419, term2419.getClass(), "font2DHandle", null);
        setField(term2419, term2419.getClass(), "values", null);
        setBooleanField(term2419, term2419.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term2419, term2419.getClass(), "createdFont", true);
        setBooleanField(term2419, term2419.getClass(), "nonIdentityTx", false);
        setIntField(term2419, term2419.getClass(), "hash", 2095798786);
        setIntField(term2419, term2419.getClass(), "fontSerializedDataVersion", -1565502840);
        setLongField(term2451, term2451.getClass(), "timestamp", -8885298608300233488L);
        setField(term2451, term2451.getClass(), "referent", null);
        setField(term2453, term2453.getClass(), "lock", term2454);
        setField(term2453, term2453.getClass(), "head", null);
        setLongField(term2453, term2453.getClass(), "queueLength", -4325723315152823407L);
        setField(term2451, term2451.getClass(), "queue", term2453);
        setField(term2451, term2451.getClass(), "next", null);
        setField(term2451, term2451.getClass(), "discovered", null);
        setField(term2419, term2419.getClass(), "flmref", term2451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiFonts");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = term2419;
        callMethod(klass, "getScaledFallback", argTypes, null, args);
    }

};


