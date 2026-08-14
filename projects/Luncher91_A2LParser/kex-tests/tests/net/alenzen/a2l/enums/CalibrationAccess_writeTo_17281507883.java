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

public class CalibrationAccess_writeTo_17281507883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum10;
     Object term2351;

    public CalibrationAccess_writeTo_17281507883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2442 = Class.forName((String) "net.alenzen.a2l.enums.CalibrationAccess");
        Field term2441 = ((Class) term2442).getDeclaredField((String) "CALIBRATION");
        ((Field) term2441).setAccessible(true);
        enum10 = ((Field) term2441).get((Object) null);
        term2351 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term2352 = (byte[]) newByteArray(0);
        byte[] term2353 = (byte[]) newByteArray(9);
        setField(term2351, term2351.getClass(), "lineBreak", term2352);
        setByteElement(term2353, 0, (byte) 79);
        setByteElement(term2353, 1, (byte) -119);
        setByteElement(term2353, 2, (byte) -66);
        setByteElement(term2353, 3, (byte) 83);
        setByteElement(term2353, 4, (byte) 74);
        setByteElement(term2353, 5, (byte) -71);
        setByteElement(term2353, 6, (byte) 49);
        setByteElement(term2353, 7, (byte) -54);
        setByteElement(term2353, 8, (byte) 67);
        setField(term2351, term2351.getClass(), "indentation", term2353);
        setField(term2351, term2351.getClass(), "charset", null);
        setField(term2351, term2351.getClass(), "os", null);
        setIntField(term2351, term2351.getClass(), "indentationDepth", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.enums.CalibrationAccess");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term2351;
        callMethod(klass, "writeTo", argTypes, enum10, args);
    }

};


