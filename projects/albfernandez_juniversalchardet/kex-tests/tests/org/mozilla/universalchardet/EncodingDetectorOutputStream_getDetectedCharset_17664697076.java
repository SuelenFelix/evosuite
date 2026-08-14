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

public class EncodingDetectorOutputStream_getDetectedCharset_17664697076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896;

    public EncodingDetectorOutputStream_getDetectedCharset_17664697076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1931 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term1930 = ((Class) term1931).getDeclaredField((String) "PURE_ASCII");
        ((Field) term1930).setAccessible(true);
        Object enum5 = ((Field) term1930).get((Object) null);
        term1896 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term1897 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term1929 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term1896, term1896.getClass(), "out", null);
        setField(term1897, term1897.getClass(), "inputState", enum5);
        setBooleanField(term1897, term1897.getClass(), "done", false);
        setBooleanField(term1897, term1897.getClass(), "start", true);
        setBooleanField(term1897, term1897.getClass(), "gotData", true);
        setBooleanField(term1897, term1897.getClass(), "onlyPrintableASCII", true);
        setByteField(term1897, term1897.getClass(), "lastChar", (byte) -71);
        setField(term1897, term1897.getClass(), "detectedCharset", "EGtDIRbSSb");
        setField(term1897, term1897.getClass(), "probers", term1929);
        setField(term1897, term1897.getClass(), "escCharsetProber", null);
        setField(term1897, term1897.getClass(), "listener", null);
        setField(term1896, term1896.getClass(), "detector", term1897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetectedCharset", argTypes, term1896, args);
    }

};


