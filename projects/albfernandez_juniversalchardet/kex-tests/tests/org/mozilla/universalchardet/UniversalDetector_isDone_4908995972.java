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

public class UniversalDetector_isDone_4908995972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219090;

    public UniversalDetector_isDone_4908995972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219124 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term219123 = ((Class) term219124).getDeclaredField((String) "PURE_ASCII");
        ((Field) term219123).setAccessible(true);
        Object enum39 = ((Field) term219123).get((Object) null);
        term219090 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term219122 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term219090, term219090.getClass(), "inputState", enum39);
        setBooleanField(term219090, term219090.getClass(), "done", true);
        setBooleanField(term219090, term219090.getClass(), "start", true);
        setBooleanField(term219090, term219090.getClass(), "gotData", true);
        setBooleanField(term219090, term219090.getClass(), "onlyPrintableASCII", true);
        setByteField(term219090, term219090.getClass(), "lastChar", (byte) 35);
        setField(term219090, term219090.getClass(), "detectedCharset", "NRdvgJlhkX");
        setField(term219090, term219090.getClass(), "probers", term219122);
        setField(term219090, term219090.getClass(), "escCharsetProber", null);
        setField(term219090, term219090.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDone", argTypes, term219090, args);
    }

};


