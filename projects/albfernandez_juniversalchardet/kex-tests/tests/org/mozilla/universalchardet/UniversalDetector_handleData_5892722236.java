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

public class UniversalDetector_handleData_5892722236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220550;
     Object term220583;

    public UniversalDetector_handleData_5892722236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220588 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term220587 = ((Class) term220588).getDeclaredField((String) "PURE_ASCII");
        ((Field) term220587).setAccessible(true);
        Object enum43 = ((Field) term220587).get((Object) null);
        term220550 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term220582 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term220550, term220550.getClass(), "inputState", enum43);
        setBooleanField(term220550, term220550.getClass(), "done", false);
        setBooleanField(term220550, term220550.getClass(), "start", true);
        setBooleanField(term220550, term220550.getClass(), "gotData", false);
        setBooleanField(term220550, term220550.getClass(), "onlyPrintableASCII", true);
        setByteField(term220550, term220550.getClass(), "lastChar", (byte) 84);
        setField(term220550, term220550.getClass(), "detectedCharset", "oVcInYnLWB");
        setField(term220550, term220550.getClass(), "probers", term220582);
        setField(term220550, term220550.getClass(), "escCharsetProber", null);
        setField(term220550, term220550.getClass(), "listener", null);
        term220583 = (byte[]) newByteArray(3);
        setByteElement(term220583, 0, (byte) -97);
        setByteElement(term220583, 1, (byte) -24);
        setByteElement(term220583, 2, (byte) 88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term220583;
        callMethod(klass, "handleData", argTypes, term220550, args);
    }

};


