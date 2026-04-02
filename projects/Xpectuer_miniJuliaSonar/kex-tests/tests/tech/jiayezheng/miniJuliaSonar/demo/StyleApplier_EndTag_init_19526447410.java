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
     Object term11119;
     Object term11153;

    public StyleApplier_EndTag_init_19526447410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11119 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term11120 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11121 = (byte[]) newByteArray(16);
        setField(term11119, term11119.getClass(), "tags", null);
        setField(term11120, term11120.getClass(), "value", term11121);
        setByteField(term11120, term11120.getClass(), "coder", (byte) -119);
        setIntField(term11120, term11120.getClass(), "count", 53410913);
        setField(term11119, term11119.getClass(), "buffer", term11120);
        setField(term11119, term11119.getClass(), "source", "tRxZafjqIx");
        setIntField(term11119, term11119.getClass(), "sourceOffset", -375014958);
        Class<? extends Object> term11306 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term11305 = ((Class) term11306).getDeclaredField((String) "COMMENT");
        ((Field) term11305).setAccessible(true);
        Object enum31 = ((Field) term11305).get((Object) null);
        ArrayList term11203 = new ArrayList();
        ((ArrayList) term11203).add("kGMQdqJYyB");
        ((ArrayList) term11203).add("XJJNClzHRf");
        ((ArrayList) term11203).add("HDaezxQfQR");
        ((ArrayList) term11203).add("iikZEapDlu");
        ((ArrayList) term11203).add("nhoHrZfnIN");
        ((ArrayList) term11203).add("ZkMALXpEAZ");
        term11153 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term11153, term11153.getClass(), "type", enum31);
        setIntField(term11153, term11153.getClass(), "start", 1107176718);
        setIntField(term11153, term11153.getClass(), "end", 480137250);
        setField(term11153, term11153.getClass(), "message", "DhjNLmRMCu");
        setField(term11153, term11153.getClass(), "url", "PgPzMSEjjX");
        setField(term11153, term11153.getClass(), "id", "wzsPSPcRdj");
        setField(term11153, term11153.getClass(), "highlight", term11203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = term11119;
        args[1] = term11153;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


