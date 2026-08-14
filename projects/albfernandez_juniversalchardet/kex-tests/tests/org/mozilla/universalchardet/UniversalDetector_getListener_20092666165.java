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

public class UniversalDetector_getListener_20092666165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220185;

    public UniversalDetector_getListener_20092666165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220219 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term220218 = ((Class) term220219).getDeclaredField((String) "PURE_ASCII");
        ((Field) term220218).setAccessible(true);
        Object enum42 = ((Field) term220218).get((Object) null);
        term220185 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term220217 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term220185, term220185.getClass(), "inputState", enum42);
        setBooleanField(term220185, term220185.getClass(), "done", true);
        setBooleanField(term220185, term220185.getClass(), "start", true);
        setBooleanField(term220185, term220185.getClass(), "gotData", false);
        setBooleanField(term220185, term220185.getClass(), "onlyPrintableASCII", true);
        setByteField(term220185, term220185.getClass(), "lastChar", (byte) -5);
        setField(term220185, term220185.getClass(), "detectedCharset", "LQFpaHEwXR");
        setField(term220185, term220185.getClass(), "probers", term220217);
        setField(term220185, term220185.getClass(), "escCharsetProber", null);
        setField(term220185, term220185.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListener", argTypes, term220185, args);
    }

};


