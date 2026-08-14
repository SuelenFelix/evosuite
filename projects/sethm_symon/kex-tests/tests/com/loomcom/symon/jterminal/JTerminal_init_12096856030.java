package com.loomcom.symon.jterminal;

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
import static com.loomcom.symon.jterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JTerminal_init_12096856030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;

    public JTerminal_init_12096856030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1549 = newInstance(Class.forName("java.awt.Font"));
        Object term1550 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1551 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1552 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1554 = newInstance(Class.forName("java.lang.Object"));
        Object term1555 = newInstance(Class.forName("java.lang.Object"));
        Object term1581 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term1583 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1584 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term1552, term1552.getClass(), "hash", 1609140331);
        setField(term1552, term1552.getClass(), "key", term1554);
        setField(term1552, term1552.getClass(), "value", term1555);
        setField(term1552, term1552.getClass(), "next", null);
        setElement(term1551, 7, term1552);
        setField(term1550, term1550.getClass(), "table", term1551);
        setIntField(term1550, term1550.getClass(), "count", 1);
        setIntField(term1550, term1550.getClass(), "threshold", 8);
        setFloatField(term1550, term1550.getClass(), "loadFactor", 0.75F);
        setIntField(term1550, term1550.getClass(), "modCount", 1);
        setField(term1550, term1550.getClass(), "keySet", null);
        setField(term1550, term1550.getClass(), "entrySet", null);
        setField(term1550, term1550.getClass(), "values", null);
        setField(term1549, term1549.getClass(), "fRequestedAttributes", term1550);
        setField(term1549, term1549.getClass(), "name", "MjGYSRKTNF");
        setIntField(term1549, term1549.getClass(), "style", 972867650);
        setIntField(term1549, term1549.getClass(), "size", 1655935355);
        setFloatField(term1549, term1549.getClass(), "pointSize", 0.3692338F);
        setField(term1549, term1549.getClass(), "peer", null);
        setLongField(term1549, term1549.getClass(), "pData", 2442117782898005296L);
        setField(term1549, term1549.getClass(), "font2DHandle", null);
        setField(term1549, term1549.getClass(), "values", null);
        setBooleanField(term1549, term1549.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1549, term1549.getClass(), "createdFont", false);
        setBooleanField(term1549, term1549.getClass(), "nonIdentityTx", true);
        setIntField(term1549, term1549.getClass(), "hash", -481533957);
        setIntField(term1549, term1549.getClass(), "fontSerializedDataVersion", 1240914516);
        setLongField(term1581, term1581.getClass(), "timestamp", 6375119433582206027L);
        setField(term1581, term1581.getClass(), "referent", null);
        setField(term1583, term1583.getClass(), "lock", term1584);
        setField(term1583, term1583.getClass(), "head", null);
        setLongField(term1583, term1583.getClass(), "queueLength", -8257434502486459194L);
        setField(term1581, term1581.getClass(), "queue", term1583);
        setField(term1581, term1581.getClass(), "next", null);
        setField(term1581, term1581.getClass(), "discovered", null);
        setField(term1549, term1549.getClass(), "flmref", term1581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = term1549;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


