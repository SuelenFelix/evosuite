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

public class EncodingDetectorInputStream_close_8689932292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386715;

    public EncodingDetectorInputStream_close_8689932292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term386750 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term386749 = ((Class) term386750).getDeclaredField((String) "PURE_ASCII");
        ((Field) term386749).setAccessible(true);
        Object enum80 = ((Field) term386749).get((Object) null);
        term386715 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term386716 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term386748 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term386715, term386715.getClass(), "in", null);
        setField(term386716, term386716.getClass(), "inputState", enum80);
        setBooleanField(term386716, term386716.getClass(), "done", false);
        setBooleanField(term386716, term386716.getClass(), "start", true);
        setBooleanField(term386716, term386716.getClass(), "gotData", false);
        setBooleanField(term386716, term386716.getClass(), "onlyPrintableASCII", true);
        setByteField(term386716, term386716.getClass(), "lastChar", (byte) -119);
        setField(term386716, term386716.getClass(), "detectedCharset", "wSQxaModmm");
        setField(term386716, term386716.getClass(), "probers", term386748);
        setField(term386716, term386716.getClass(), "escCharsetProber", null);
        setField(term386716, term386716.getClass(), "listener", null);
        setField(term386715, term386715.getClass(), "detector", term386716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term386715, args);
    }

};


