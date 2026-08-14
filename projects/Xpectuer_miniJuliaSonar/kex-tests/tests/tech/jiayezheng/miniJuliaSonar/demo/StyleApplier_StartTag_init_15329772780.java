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
     Object term5730;
     Object term5768;

    public StyleApplier_StartTag_init_15329772780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5730 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term5731 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5732 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5735 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5736 = (byte[]) newByteArray(16);
        setField(term5732, term5732.getClass(), "comparator", null);
        setField(term5732, term5732.getClass(), "root", null);
        setIntField(term5732, term5732.getClass(), "size", 0);
        setIntField(term5732, term5732.getClass(), "modCount", 0);
        setField(term5732, term5732.getClass(), "entrySet", null);
        setField(term5732, term5732.getClass(), "navigableKeySet", null);
        setField(term5732, term5732.getClass(), "descendingMap", null);
        setField(term5732, term5732.getClass(), "keySet", null);
        setField(term5732, term5732.getClass(), "values", null);
        setField(term5731, term5731.getClass(), "m", term5732);
        setField(term5730, term5730.getClass(), "tags", term5731);
        setField(term5735, term5735.getClass(), "value", term5736);
        setByteField(term5735, term5735.getClass(), "coder", (byte) 47);
        setIntField(term5735, term5735.getClass(), "count", -478195677);
        setField(term5730, term5730.getClass(), "buffer", term5735);
        setField(term5730, term5730.getClass(), "source", "VgZnGoIFwQ");
        setIntField(term5730, term5730.getClass(), "sourceOffset", 972867650);
        Class<? extends Object> term5863 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term5862 = ((Class) term5863).getDeclaredField((String) "DECORATOR");
        ((Field) term5862).setAccessible(true);
        Object enum19 = ((Field) term5862).get((Object) null);
        ArrayList term5820 = new ArrayList();
        ((ArrayList) term5820).add("LvJFtLBaxj");
        term5768 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term5768, term5768.getClass(), "type", enum19);
        setIntField(term5768, term5768.getClass(), "start", 1655935355);
        setIntField(term5768, term5768.getClass(), "end", -481533957);
        setField(term5768, term5768.getClass(), "message", "jUbSRrkrYZ");
        setField(term5768, term5768.getClass(), "url", "bWWfajKbEX");
        setField(term5768, term5768.getClass(), "id", "cAPeiZHKGJ");
        setField(term5768, term5768.getClass(), "highlight", term5820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$StartTag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = term5730;
        args[1] = term5768;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


