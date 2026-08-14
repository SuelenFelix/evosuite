package net.alenzen.a2l.enums;

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
import static net.alenzen.a2l.enums.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Monotony_writeTo_15514387893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term42;

    public Monotony_writeTo_15514387893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term165 = Class.forName((String) "net.alenzen.a2l.enums.Monotony");
        Field term164 = ((Class) term165).getDeclaredField((String) "STRICT_DECREASE");
        ((Field) term164).setAccessible(true);
        enum0 = ((Field) term164).get((Object) null);
        term42 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term43 = (byte[]) newByteArray(5);
        byte[] term49 = (byte[]) newByteArray(4);
        setByteElement(term43, 0, (byte) 47);
        setByteElement(term43, 1, (byte) 48);
        setByteElement(term43, 2, (byte) 89);
        setByteElement(term43, 3, (byte) 75);
        setByteElement(term43, 4, (byte) 18);
        setField(term42, term42.getClass(), "lineBreak", term43);
        setByteElement(term49, 0, (byte) -58);
        setByteElement(term49, 1, (byte) -29);
        setByteElement(term49, 2, (byte) -54);
        setByteElement(term49, 3, (byte) -10);
        setField(term42, term42.getClass(), "indentation", term49);
        setField(term42, term42.getClass(), "charset", null);
        setField(term42, term42.getClass(), "os", null);
        setIntField(term42, term42.getClass(), "indentationDepth", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.enums.Monotony");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term42;
        callMethod(klass, "writeTo", argTypes, enum0, args);
    }

};


