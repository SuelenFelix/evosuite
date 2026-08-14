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

public class UniversalDetector_setListener_14106434564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219820;

    public UniversalDetector_setListener_14106434564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219854 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term219853 = ((Class) term219854).getDeclaredField((String) "PURE_ASCII");
        ((Field) term219853).setAccessible(true);
        Object enum41 = ((Field) term219853).get((Object) null);
        term219820 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term219852 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term219820, term219820.getClass(), "inputState", enum41);
        setBooleanField(term219820, term219820.getClass(), "done", true);
        setBooleanField(term219820, term219820.getClass(), "start", true);
        setBooleanField(term219820, term219820.getClass(), "gotData", true);
        setBooleanField(term219820, term219820.getClass(), "onlyPrintableASCII", true);
        setByteField(term219820, term219820.getClass(), "lastChar", (byte) 123);
        setField(term219820, term219820.getClass(), "detectedCharset", "MxlszYVzRf");
        setField(term219820, term219820.getClass(), "probers", term219852);
        setField(term219820, term219820.getClass(), "escCharsetProber", null);
        setField(term219820, term219820.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.CharsetListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setListener", argTypes, term219820, args);
    }

};


