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
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class EncodingDetectorOutputStream_write_4793760575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1528;
     Object term1562;

    public EncodingDetectorOutputStream_write_4793760575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1565 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term1564 = ((Class) term1565).getDeclaredField((String) "PURE_ASCII");
        ((Field) term1564).setAccessible(true);
        Object enum4 = ((Field) term1564).get((Object) null);
        term1528 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term1529 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term1561 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term1528, term1528.getClass(), "out", null);
        setField(term1529, term1529.getClass(), "inputState", enum4);
        setBooleanField(term1529, term1529.getClass(), "done", false);
        setBooleanField(term1529, term1529.getClass(), "start", true);
        setBooleanField(term1529, term1529.getClass(), "gotData", true);
        setBooleanField(term1529, term1529.getClass(), "onlyPrintableASCII", true);
        setByteField(term1529, term1529.getClass(), "lastChar", (byte) 74);
        setField(term1529, term1529.getClass(), "detectedCharset", "jJCZpVmanW");
        setField(term1529, term1529.getClass(), "probers", term1561);
        setField(term1529, term1529.getClass(), "escCharsetProber", null);
        setField(term1529, term1529.getClass(), "listener", null);
        setField(term1528, term1528.getClass(), "detector", term1529);
        term1562 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1562;
        callMethod(klass, "write", argTypes, term1528, args);
    }

};


