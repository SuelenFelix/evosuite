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
import java.lang.Integer;

public class EncodingDetectorInputStream_mark_10788475163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387081;
     Object term387115;

    public EncodingDetectorInputStream_mark_10788475163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term387118 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term387117 = ((Class) term387118).getDeclaredField((String) "PURE_ASCII");
        ((Field) term387117).setAccessible(true);
        Object enum81 = ((Field) term387117).get((Object) null);
        term387081 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream"));
        Object term387082 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term387114 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term387081, term387081.getClass(), "in", null);
        setField(term387082, term387082.getClass(), "inputState", enum81);
        setBooleanField(term387082, term387082.getClass(), "done", true);
        setBooleanField(term387082, term387082.getClass(), "start", true);
        setBooleanField(term387082, term387082.getClass(), "gotData", true);
        setBooleanField(term387082, term387082.getClass(), "onlyPrintableASCII", true);
        setByteField(term387082, term387082.getClass(), "lastChar", (byte) 120);
        setField(term387082, term387082.getClass(), "detectedCharset", "UlajhuVLaP");
        setField(term387082, term387082.getClass(), "probers", term387114);
        setField(term387082, term387082.getClass(), "escCharsetProber", null);
        setField(term387082, term387082.getClass(), "listener", null);
        setField(term387081, term387081.getClass(), "detector", term387082);
        term387115 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term387115;
        callMethod(klass, "mark", argTypes, term387081, args);
    }

};


