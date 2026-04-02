package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class StyleApplier_StartTag_init_15329772780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5724;
     Object term5762;

    public StyleApplier_StartTag_init_15329772780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5724 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term5725 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5726 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5729 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5730 = (byte[]) newByteArray(16);
        setField(term5726, term5726.getClass(), "comparator", null);
        setField(term5726, term5726.getClass(), "root", null);
        setIntField(term5726, term5726.getClass(), "size", 0);
        setIntField(term5726, term5726.getClass(), "modCount", 0);
        setField(term5726, term5726.getClass(), "entrySet", null);
        setField(term5726, term5726.getClass(), "navigableKeySet", null);
        setField(term5726, term5726.getClass(), "descendingMap", null);
        setField(term5726, term5726.getClass(), "keySet", null);
        setField(term5726, term5726.getClass(), "values", null);
        setField(term5725, term5725.getClass(), "m", term5726);
        setField(term5724, term5724.getClass(), "tags", term5725);
        setField(term5729, term5729.getClass(), "value", term5730);
        setByteField(term5729, term5729.getClass(), "coder", (byte) 47);
        setIntField(term5729, term5729.getClass(), "count", -478195677);
        setField(term5724, term5724.getClass(), "buffer", term5729);
        setField(term5724, term5724.getClass(), "source", "VgZnGoIFwQ");
        setIntField(term5724, term5724.getClass(), "sourceOffset", 972867650);
        Class<? extends Object> term5857 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term5856 = ((Class) term5857).getDeclaredField((String) "DECORATOR");
        ((Field) term5856).setAccessible(true);
        Object enum19 = ((Field) term5856).get((Object) null);
        ArrayList term5814 = new ArrayList();
        ((ArrayList) term5814).add("LvJFtLBaxj");
        term5762 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term5762, term5762.getClass(), "type", enum19);
        setIntField(term5762, term5762.getClass(), "start", 1655935355);
        setIntField(term5762, term5762.getClass(), "end", -481533957);
        setField(term5762, term5762.getClass(), "message", "jUbSRrkrYZ");
        setField(term5762, term5762.getClass(), "url", "bWWfajKbEX");
        setField(term5762, term5762.getClass(), "id", "cAPeiZHKGJ");
        setField(term5762, term5762.getClass(), "highlight", term5814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$StartTag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = term5724;
        args[1] = term5762;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


