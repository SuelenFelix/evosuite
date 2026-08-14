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

public class EncodingDetectorInputStream_available_9064806621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386349;

    public EncodingDetectorInputStream_available_9064806621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term386384 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term386383 = ((Class) term386384).getDeclaredField((String) "PURE_ASCII");
        ((Field) term386383).setAccessible(true);
        Object enum79 = ((Field) term386383).get((Object) null);
        term386349 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term386350 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term386382 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term386349, term386349.getClass(), "in", null);
        setField(term386350, term386350.getClass(), "inputState", enum79);
        setBooleanField(term386350, term386350.getClass(), "done", true);
        setBooleanField(term386350, term386350.getClass(), "start", true);
        setBooleanField(term386350, term386350.getClass(), "gotData", true);
        setBooleanField(term386350, term386350.getClass(), "onlyPrintableASCII", true);
        setByteField(term386350, term386350.getClass(), "lastChar", (byte) -98);
        setField(term386350, term386350.getClass(), "detectedCharset", "aKnKipADSo");
        setField(term386350, term386350.getClass(), "probers", term386382);
        setField(term386350, term386350.getClass(), "escCharsetProber", null);
        setField(term386350, term386350.getClass(), "listener", null);
        setField(term386349, term386349.getClass(), "detector", term386350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "available", argTypes, term386349, args);
    }

};


