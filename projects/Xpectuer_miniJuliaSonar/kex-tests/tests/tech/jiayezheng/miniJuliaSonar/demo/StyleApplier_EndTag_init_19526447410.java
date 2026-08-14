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

public class StyleApplier_EndTag_init_19526447410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11125;
     Object term11159;

    public StyleApplier_EndTag_init_19526447410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11125 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term11126 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11127 = (byte[]) newByteArray(16);
        setField(term11125, term11125.getClass(), "tags", null);
        setField(term11126, term11126.getClass(), "value", term11127);
        setByteField(term11126, term11126.getClass(), "coder", (byte) -119);
        setIntField(term11126, term11126.getClass(), "count", 53410913);
        setField(term11125, term11125.getClass(), "buffer", term11126);
        setField(term11125, term11125.getClass(), "source", "tRxZafjqIx");
        setIntField(term11125, term11125.getClass(), "sourceOffset", -375014958);
        Class<? extends Object> term11312 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term11311 = ((Class) term11312).getDeclaredField((String) "COMMENT");
        ((Field) term11311).setAccessible(true);
        Object enum31 = ((Field) term11311).get((Object) null);
        ArrayList term11209 = new ArrayList();
        ((ArrayList) term11209).add("kGMQdqJYyB");
        ((ArrayList) term11209).add("XJJNClzHRf");
        ((ArrayList) term11209).add("HDaezxQfQR");
        ((ArrayList) term11209).add("iikZEapDlu");
        ((ArrayList) term11209).add("nhoHrZfnIN");
        ((ArrayList) term11209).add("ZkMALXpEAZ");
        term11159 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term11159, term11159.getClass(), "type", enum31);
        setIntField(term11159, term11159.getClass(), "start", 1107176718);
        setIntField(term11159, term11159.getClass(), "end", 480137250);
        setField(term11159, term11159.getClass(), "message", "DhjNLmRMCu");
        setField(term11159, term11159.getClass(), "url", "PgPzMSEjjX");
        setField(term11159, term11159.getClass(), "id", "wzsPSPcRdj");
        setField(term11159, term11159.getClass(), "highlight", term11209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = term11125;
        args[1] = term11159;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


