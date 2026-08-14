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

public class EncodingDetectorInputStream_read_9361469277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388564;
     Object term388598;

    public EncodingDetectorInputStream_read_9361469277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term388606 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term388605 = ((Class) term388606).getDeclaredField((String) "PURE_ASCII");
        ((Field) term388605).setAccessible(true);
        Object enum85 = ((Field) term388605).get((Object) null);
        term388564 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term388565 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term388597 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term388564, term388564.getClass(), "in", null);
        setField(term388565, term388565.getClass(), "inputState", enum85);
        setBooleanField(term388565, term388565.getClass(), "done", false);
        setBooleanField(term388565, term388565.getClass(), "start", true);
        setBooleanField(term388565, term388565.getClass(), "gotData", false);
        setBooleanField(term388565, term388565.getClass(), "onlyPrintableASCII", true);
        setByteField(term388565, term388565.getClass(), "lastChar", (byte) -119);
        setField(term388565, term388565.getClass(), "detectedCharset", "GzFkzHGYFt");
        setField(term388565, term388565.getClass(), "probers", term388597);
        setField(term388565, term388565.getClass(), "escCharsetProber", null);
        setField(term388565, term388565.getClass(), "listener", null);
        setField(term388564, term388564.getClass(), "detector", term388565);
        term388598 = (byte[]) newByteArray(6);
        setByteElement(term388598, 0, (byte) 94);
        setByteElement(term388598, 1, (byte) -52);
        setByteElement(term388598, 2, (byte) -33);
        setByteElement(term388598, 3, (byte) 16);
        setByteElement(term388598, 4, (byte) 20);
        setByteElement(term388598, 5, (byte) -114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term388598;
        callMethod(klass, "read", argTypes, term388564, args);
    }

};


