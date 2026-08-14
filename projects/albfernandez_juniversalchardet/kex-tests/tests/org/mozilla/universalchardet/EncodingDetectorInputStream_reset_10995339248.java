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

public class EncodingDetectorInputStream_reset_10995339248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388943;

    public EncodingDetectorInputStream_reset_10995339248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term388978 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term388977 = ((Class) term388978).getDeclaredField((String) "PURE_ASCII");
        ((Field) term388977).setAccessible(true);
        Object enum86 = ((Field) term388977).get((Object) null);
        term388943 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term388944 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term388976 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term388943, term388943.getClass(), "in", null);
        setField(term388944, term388944.getClass(), "inputState", enum86);
        setBooleanField(term388944, term388944.getClass(), "done", true);
        setBooleanField(term388944, term388944.getClass(), "start", true);
        setBooleanField(term388944, term388944.getClass(), "gotData", false);
        setBooleanField(term388944, term388944.getClass(), "onlyPrintableASCII", true);
        setByteField(term388944, term388944.getClass(), "lastChar", (byte) 93);
        setField(term388944, term388944.getClass(), "detectedCharset", "tShwQLRGNe");
        setField(term388944, term388944.getClass(), "probers", term388976);
        setField(term388944, term388944.getClass(), "escCharsetProber", null);
        setField(term388944, term388944.getClass(), "listener", null);
        setField(term388943, term388943.getClass(), "detector", term388944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term388943, args);
    }

};


