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

public class EncodingDetectorOutputStream_flush_14522090662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;

    public EncodingDetectorOutputStream_flush_14522090662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term441 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term440 = ((Class) term441).getDeclaredField((String) "PURE_ASCII");
        ((Field) term440).setAccessible(true);
        Object enum1 = ((Field) term440).get((Object) null);
        term406 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term407 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term439 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term406, term406.getClass(), "out", null);
        setField(term407, term407.getClass(), "inputState", enum1);
        setBooleanField(term407, term407.getClass(), "done", false);
        setBooleanField(term407, term407.getClass(), "start", true);
        setBooleanField(term407, term407.getClass(), "gotData", false);
        setBooleanField(term407, term407.getClass(), "onlyPrintableASCII", true);
        setByteField(term407, term407.getClass(), "lastChar", (byte) 48);
        setField(term407, term407.getClass(), "detectedCharset", "sjlJAEtRrb");
        setField(term407, term407.getClass(), "probers", term439);
        setField(term407, term407.getClass(), "escCharsetProber", null);
        setField(term407, term407.getClass(), "listener", null);
        setField(term406, term406.getClass(), "detector", term407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term406, args);
    }

};


