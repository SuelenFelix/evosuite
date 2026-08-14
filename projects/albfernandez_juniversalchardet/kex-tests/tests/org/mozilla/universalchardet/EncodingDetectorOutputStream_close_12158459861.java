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

public class EncodingDetectorOutputStream_close_12158459861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EncodingDetectorOutputStream_close_12158459861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term74 = ((Class) term75).getDeclaredField((String) "PURE_ASCII");
        ((Field) term74).setAccessible(true);
        Object enum0 = ((Field) term74).get((Object) null);
        term1 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term2 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term34 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term1, term1.getClass(), "out", null);
        setField(term2, term2.getClass(), "inputState", enum0);
        setBooleanField(term2, term2.getClass(), "done", false);
        setBooleanField(term2, term2.getClass(), "start", true);
        setBooleanField(term2, term2.getClass(), "gotData", false);
        setBooleanField(term2, term2.getClass(), "onlyPrintableASCII", true);
        setByteField(term2, term2.getClass(), "lastChar", (byte) 47);
        setField(term2, term2.getClass(), "detectedCharset", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "probers", term34);
        setField(term2, term2.getClass(), "escCharsetProber", null);
        setField(term2, term2.getClass(), "listener", null);
        setField(term1, term1.getClass(), "detector", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term1, args);
    }

};


