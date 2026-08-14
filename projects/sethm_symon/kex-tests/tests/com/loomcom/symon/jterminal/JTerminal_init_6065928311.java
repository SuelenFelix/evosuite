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

public class JTerminal_init_6065928311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596;

    public JTerminal_init_6065928311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1596 = newInstance(Class.forName("java.awt.Font"));
        Object term1597 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1598 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1599 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1601 = newInstance(Class.forName("java.lang.Object"));
        Object term1602 = newInstance(Class.forName("java.lang.Object"));
        Object term1628 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term1630 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1631 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term1599, term1599.getClass(), "hash", 446500355);
        setField(term1599, term1599.getClass(), "key", term1601);
        setField(term1599, term1599.getClass(), "value", term1602);
        setField(term1599, term1599.getClass(), "next", null);
        setElement(term1598, 4, term1599);
        setField(term1597, term1597.getClass(), "table", term1598);
        setIntField(term1597, term1597.getClass(), "count", 1);
        setIntField(term1597, term1597.getClass(), "threshold", 8);
        setFloatField(term1597, term1597.getClass(), "loadFactor", 0.75F);
        setIntField(term1597, term1597.getClass(), "modCount", 1);
        setField(term1597, term1597.getClass(), "keySet", null);
        setField(term1597, term1597.getClass(), "entrySet", null);
        setField(term1597, term1597.getClass(), "values", null);
        setField(term1596, term1596.getClass(), "fRequestedAttributes", term1597);
        setField(term1596, term1596.getClass(), "name", "hRNSzYYIrc");
        setIntField(term1596, term1596.getClass(), "style", 1114000454);
        setIntField(term1596, term1596.getClass(), "size", -556405712);
        setFloatField(term1596, term1596.getClass(), "pointSize", 0.13906479F);
        setField(term1596, term1596.getClass(), "peer", null);
        setLongField(term1596, term1596.getClass(), "pData", -8400487765614892086L);
        setField(term1596, term1596.getClass(), "font2DHandle", null);
        setField(term1596, term1596.getClass(), "values", null);
        setBooleanField(term1596, term1596.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1596, term1596.getClass(), "createdFont", false);
        setBooleanField(term1596, term1596.getClass(), "nonIdentityTx", true);
        setIntField(term1596, term1596.getClass(), "hash", -1772434990);
        setIntField(term1596, term1596.getClass(), "fontSerializedDataVersion", -1845499264);
        setLongField(term1628, term1628.getClass(), "timestamp", 5270370404989704783L);
        setField(term1628, term1628.getClass(), "referent", null);
        setField(term1630, term1630.getClass(), "lock", term1631);
        setField(term1630, term1630.getClass(), "head", null);
        setLongField(term1630, term1630.getClass(), "queueLength", 7411271909051562686L);
        setField(term1628, term1628.getClass(), "queue", term1630);
        setField(term1628, term1628.getClass(), "next", null);
        setField(term1628, term1628.getClass(), "discovered", null);
        setField(term1596, term1596.getClass(), "flmref", term1628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.loomcom.symon.jterminal.TerminalModel");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1596;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


