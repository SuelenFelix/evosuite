package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class UniversalDetector_handleData_5880798397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220922;
     Object term220955;
     Object term220963;
     Object term220965;

    public UniversalDetector_handleData_5880798397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220968 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term220967 = ((Class) term220968).getDeclaredField((String) "PURE_ASCII");
        ((Field) term220967).setAccessible(true);
        Object enum44 = ((Field) term220967).get((Object) null);
        term220922 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term220954 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term220922, term220922.getClass(), "inputState", enum44);
        setBooleanField(term220922, term220922.getClass(), "done", true);
        setBooleanField(term220922, term220922.getClass(), "start", true);
        setBooleanField(term220922, term220922.getClass(), "gotData", true);
        setBooleanField(term220922, term220922.getClass(), "onlyPrintableASCII", true);
        setByteField(term220922, term220922.getClass(), "lastChar", (byte) 96);
        setField(term220922, term220922.getClass(), "detectedCharset", "aJlieCFVtF");
        setField(term220922, term220922.getClass(), "probers", term220954);
        setField(term220922, term220922.getClass(), "escCharsetProber", null);
        setField(term220922, term220922.getClass(), "listener", null);
        term220955 = (byte[]) newByteArray(7);
        setByteElement(term220955, 0, (byte) 70);
        setByteElement(term220955, 1, (byte) 48);
        setByteElement(term220955, 2, (byte) -46);
        setByteElement(term220955, 3, (byte) -128);
        setByteElement(term220955, 4, (byte) 66);
        setByteElement(term220955, 5, (byte) -112);
        setByteElement(term220955, 6, (byte) 81);
        term220963 = new Integer(53410913);
        term220965 = new Integer(-375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term220955;
        args[1] = term220963;
        args[2] = term220965;
        callMethod(klass, "handleData", argTypes, term220922, args);
    }

};


