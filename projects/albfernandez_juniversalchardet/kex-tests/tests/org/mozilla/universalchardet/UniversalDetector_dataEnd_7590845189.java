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

public class UniversalDetector_dataEnd_7590845189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221313;

    public UniversalDetector_dataEnd_7590845189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221347 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term221346 = ((Class) term221347).getDeclaredField((String) "PURE_ASCII");
        ((Field) term221346).setAccessible(true);
        Object enum45 = ((Field) term221346).get((Object) null);
        term221313 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term221345 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term221313, term221313.getClass(), "inputState", enum45);
        setBooleanField(term221313, term221313.getClass(), "done", false);
        setBooleanField(term221313, term221313.getClass(), "start", true);
        setBooleanField(term221313, term221313.getClass(), "gotData", true);
        setBooleanField(term221313, term221313.getClass(), "onlyPrintableASCII", true);
        setByteField(term221313, term221313.getClass(), "lastChar", (byte) 33);
        setField(term221313, term221313.getClass(), "detectedCharset", "ZiaGIbnzTs");
        setField(term221313, term221313.getClass(), "probers", term221345);
        setField(term221313, term221313.getClass(), "escCharsetProber", null);
        setField(term221313, term221313.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dataEnd", argTypes, term221313, args);
    }

};


