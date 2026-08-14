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

public class UniversalDetector_reset_205123510010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221678;

    public UniversalDetector_reset_205123510010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221712 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term221711 = ((Class) term221712).getDeclaredField((String) "PURE_ASCII");
        ((Field) term221711).setAccessible(true);
        Object enum46 = ((Field) term221711).get((Object) null);
        term221678 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term221710 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term221678, term221678.getClass(), "inputState", enum46);
        setBooleanField(term221678, term221678.getClass(), "done", true);
        setBooleanField(term221678, term221678.getClass(), "start", true);
        setBooleanField(term221678, term221678.getClass(), "gotData", true);
        setBooleanField(term221678, term221678.getClass(), "onlyPrintableASCII", true);
        setByteField(term221678, term221678.getClass(), "lastChar", (byte) -74);
        setField(term221678, term221678.getClass(), "detectedCharset", "tbcdzjIfER");
        setField(term221678, term221678.getClass(), "probers", term221710);
        setField(term221678, term221678.getClass(), "escCharsetProber", null);
        setField(term221678, term221678.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term221678, args);
    }

};


