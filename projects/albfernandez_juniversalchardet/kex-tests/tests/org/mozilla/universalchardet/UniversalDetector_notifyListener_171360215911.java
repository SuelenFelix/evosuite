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

public class UniversalDetector_notifyListener_171360215911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222043;

    public UniversalDetector_notifyListener_171360215911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222089 = Class.forName((String) "org.mozilla.universalchardet.UniversalDetector$InputState");
        Field term222088 = ((Class) term222089).getDeclaredField((String) "PURE_ASCII");
        ((Field) term222088).setAccessible(true);
        Object enum47 = ((Field) term222088).get((Object) null);
        term222043 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        Object[] term222075 = (Object[]) newArray("org.mozilla.universalchardet.prober.CharsetProber", 3);
        setField(term222043, term222043.getClass(), "inputState", enum47);
        setBooleanField(term222043, term222043.getClass(), "done", false);
        setBooleanField(term222043, term222043.getClass(), "start", true);
        setBooleanField(term222043, term222043.getClass(), "gotData", true);
        setBooleanField(term222043, term222043.getClass(), "onlyPrintableASCII", true);
        setByteField(term222043, term222043.getClass(), "lastChar", (byte) -84);
        setField(term222043, term222043.getClass(), "detectedCharset", "HyxfbSQYBe");
        setField(term222043, term222043.getClass(), "probers", term222075);
        setField(term222043, term222043.getClass(), "escCharsetProber", null);
        setField(term222043, term222043.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "notifyListener", argTypes, term222043, args);
    }

};


