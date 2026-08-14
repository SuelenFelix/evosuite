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

public class EncodingDetectorOutputStream_write_4793768014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;
     Object term1187;

    public EncodingDetectorOutputStream_write_4793768014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1193 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term1192 = ((Class) term1193).getDeclaredField((String) "PURE_ASCII");
        ((Field) term1192).setAccessible(true);
        Object enum3 = ((Field) term1192).get((Object) null);
        term1153 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        Object term1154 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term1186 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term1153, term1153.getClass(), "out", null);
        setField(term1154, term1154.getClass(), "inputState", enum3);
        setBooleanField(term1154, term1154.getClass(), "done", true);
        setBooleanField(term1154, term1154.getClass(), "start", true);
        setBooleanField(term1154, term1154.getClass(), "gotData", true);
        setBooleanField(term1154, term1154.getClass(), "onlyPrintableASCII", true);
        setByteField(term1154, term1154.getClass(), "lastChar", (byte) -10);
        setField(term1154, term1154.getClass(), "detectedCharset", "xxtlPwDYFs");
        setField(term1154, term1154.getClass(), "probers", term1186);
        setField(term1154, term1154.getClass(), "escCharsetProber", null);
        setField(term1154, term1154.getClass(), "listener", null);
        setField(term1153, term1153.getClass(), "detector", term1154);
        term1187 = (byte[]) newByteArray(4);
        setByteElement(term1187, 0, (byte) 79);
        setByteElement(term1187, 1, (byte) -119);
        setByteElement(term1187, 2, (byte) -66);
        setByteElement(term1187, 3, (byte) 83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1187;
        callMethod(klass, "write", argTypes, term1153, args);
    }

};


