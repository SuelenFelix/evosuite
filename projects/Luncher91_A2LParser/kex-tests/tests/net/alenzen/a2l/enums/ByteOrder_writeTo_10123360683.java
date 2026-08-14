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

public class ByteOrder_writeTo_10123360683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum26;
     Object term6179;

    public ByteOrder_writeTo_10123360683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6250 = Class.forName((String) "net.alenzen.a2l.enums.ByteOrder");
        Field term6249 = ((Class) term6250).getDeclaredField((String) "LITTLE_ENDIAN");
        ((Field) term6249).setAccessible(true);
        enum26 = ((Field) term6249).get((Object) null);
        term6179 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term6180 = (byte[]) newByteArray(2);
        byte[] term6183 = (byte[]) newByteArray(8);
        setByteElement(term6180, 0, (byte) 121);
        setByteElement(term6180, 1, (byte) -99);
        setField(term6179, term6179.getClass(), "lineBreak", term6180);
        setByteElement(term6183, 0, (byte) -2);
        setByteElement(term6183, 1, (byte) -16);
        setByteElement(term6183, 2, (byte) -112);
        setByteElement(term6183, 3, (byte) -111);
        setByteElement(term6183, 4, (byte) 23);
        setByteElement(term6183, 5, (byte) -15);
        setByteElement(term6183, 6, (byte) 36);
        setByteElement(term6183, 7, (byte) 118);
        setField(term6179, term6179.getClass(), "indentation", term6183);
        setField(term6179, term6179.getClass(), "charset", null);
        setField(term6179, term6179.getClass(), "os", null);
        setIntField(term6179, term6179.getClass(), "indentationDepth", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.enums.ByteOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term6179;
        callMethod(klass, "writeTo", argTypes, enum26, args);
    }

};


