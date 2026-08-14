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

public class Deposit_writeTo_12794700683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum22;
     Object term5376;

    public Deposit_writeTo_12794700683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5409 = Class.forName((String) "net.alenzen.a2l.enums.Deposit");
        Field term5408 = ((Class) term5409).getDeclaredField((String) "ABSOLUTE");
        ((Field) term5408).setAccessible(true);
        enum22 = ((Field) term5408).get((Object) null);
        term5376 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term5377 = (byte[]) newByteArray(0);
        byte[] term5378 = (byte[]) newByteArray(2);
        setField(term5376, term5376.getClass(), "lineBreak", term5377);
        setByteElement(term5378, 0, (byte) 78);
        setByteElement(term5378, 1, (byte) 87);
        setField(term5376, term5376.getClass(), "indentation", term5378);
        setField(term5376, term5376.getClass(), "charset", null);
        setField(term5376, term5376.getClass(), "os", null);
        setIntField(term5376, term5376.getClass(), "indentationDepth", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.enums.Deposit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term5376;
        callMethod(klass, "writeTo", argTypes, enum22, args);
    }

};


