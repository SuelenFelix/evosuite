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

public class EncodingDetectorInputStream_getDetectedCharset_44365837410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389677;

    public EncodingDetectorInputStream_getDetectedCharset_44365837410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term389712 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term389711 = ((Class) term389712).getDeclaredField((String) "PURE_ASCII");
        ((Field) term389711).setAccessible(true);
        Object enum88 = ((Field) term389711).get((Object) null);
        term389677 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term389678 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term389710 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term389677, term389677.getClass(), "in", null);
        setField(term389678, term389678.getClass(), "inputState", enum88);
        setBooleanField(term389678, term389678.getClass(), "done", false);
        setBooleanField(term389678, term389678.getClass(), "start", true);
        setBooleanField(term389678, term389678.getClass(), "gotData", false);
        setBooleanField(term389678, term389678.getClass(), "onlyPrintableASCII", true);
        setByteField(term389678, term389678.getClass(), "lastChar", (byte) -4);
        setField(term389678, term389678.getClass(), "detectedCharset", "xLbjWUgOIL");
        setField(term389678, term389678.getClass(), "probers", term389710);
        setField(term389678, term389678.getClass(), "escCharsetProber", null);
        setField(term389678, term389678.getClass(), "listener", null);
        setField(term389677, term389677.getClass(), "detector", term389678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetectedCharset", argTypes, term389677, args);
    }

};


