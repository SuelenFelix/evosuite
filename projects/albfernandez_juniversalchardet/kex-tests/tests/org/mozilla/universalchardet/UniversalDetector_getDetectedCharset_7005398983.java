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

public class UniversalDetector_getDetectedCharset_7005398983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219455;

    public UniversalDetector_getDetectedCharset_7005398983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219489 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term219488 = ((Class) term219489).getDeclaredField((String) "PURE_ASCII");
        ((Field) term219488).setAccessible(true);
        Object enum40 = ((Field) term219488).get((Object) null);
        term219455 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term219487 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term219455, term219455.getClass(), "inputState", enum40);
        setBooleanField(term219455, term219455.getClass(), "done", false);
        setBooleanField(term219455, term219455.getClass(), "start", true);
        setBooleanField(term219455, term219455.getClass(), "gotData", true);
        setBooleanField(term219455, term219455.getClass(), "onlyPrintableASCII", true);
        setByteField(term219455, term219455.getClass(), "lastChar", (byte) 66);
        setField(term219455, term219455.getClass(), "detectedCharset", "uuaPigETmJ");
        setField(term219455, term219455.getClass(), "probers", term219487);
        setField(term219455, term219455.getClass(), "escCharsetProber", null);
        setField(term219455, term219455.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetectedCharset", argTypes, term219455, args);
    }

};


