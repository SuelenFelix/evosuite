package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class Console_init_18285117600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7059;
     Object term7061;
     Object term7063;
     Object term7100;

    public Console_init_18285117600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7059 = new Integer(96566506);
        term7061 = new Integer(-343325701);
        term7063 = newInstance(Class.forName("java.awt.Font"));
        Object term7064 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term7065 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term7066 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7068 = newInstance(Class.forName("java.lang.Object"));
        Object term7069 = newInstance(Class.forName("java.lang.Object"));
        Object term7095 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term7097 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7098 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term7066, term7066.getClass(), "hash", 200724352);
        setField(term7066, term7066.getClass(), "key", term7068);
        setField(term7066, term7066.getClass(), "value", term7069);
        setField(term7066, term7066.getClass(), "next", null);
        setElement(term7065, 4, term7066);
        setField(term7064, term7064.getClass(), "table", term7065);
        setIntField(term7064, term7064.getClass(), "count", 1);
        setIntField(term7064, term7064.getClass(), "threshold", 8);
        setFloatField(term7064, term7064.getClass(), "loadFactor", 0.75F);
        setIntField(term7064, term7064.getClass(), "modCount", 1);
        setField(term7064, term7064.getClass(), "keySet", null);
        setField(term7064, term7064.getClass(), "entrySet", null);
        setField(term7064, term7064.getClass(), "values", null);
        setField(term7063, term7063.getClass(), "fRequestedAttributes", term7064);
        setField(term7063, term7063.getClass(), "name", "oVcInYnLWB");
        setIntField(term7063, term7063.getClass(), "style", 1202361360);
        setIntField(term7063, term7063.getClass(), "size", -2015048153);
        setFloatField(term7063, term7063.getClass(), "pointSize", 0.95272815F);
        setField(term7063, term7063.getClass(), "peer", null);
        setLongField(term7063, term7063.getClass(), "pData", 2442117782898005296L);
        setField(term7063, term7063.getClass(), "font2DHandle", null);
        setField(term7063, term7063.getClass(), "values", null);
        setBooleanField(term7063, term7063.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term7063, term7063.getClass(), "createdFont", false);
        setBooleanField(term7063, term7063.getClass(), "nonIdentityTx", false);
        setIntField(term7063, term7063.getClass(), "hash", -2063457669);
        setIntField(term7063, term7063.getClass(), "fontSerializedDataVersion", -1222006000);
        setLongField(term7095, term7095.getClass(), "timestamp", 6375119433582206027L);
        setField(term7095, term7095.getClass(), "referent", null);
        setField(term7097, term7097.getClass(), "lock", term7098);
        setField(term7097, term7097.getClass(), "head", null);
        setLongField(term7097, term7097.getClass(), "queueLength", -8257434502486459194L);
        setField(term7095, term7095.getClass(), "queue", term7097);
        setField(term7095, term7095.getClass(), "next", null);
        setField(term7095, term7095.getClass(), "discovered", null);
        setField(term7063, term7063.getClass(), "flmref", term7095);
        term7100 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.awt.Font");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term7059;
        args[1] = term7061;
        args[2] = term7063;
        args[3] = term7100;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


