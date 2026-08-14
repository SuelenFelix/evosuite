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
import java.lang.Integer;

public class UniversalDetector_detectCharsetFromBOM_140775066123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222670;
     Object term222676;

    public UniversalDetector_detectCharsetFromBOM_140775066123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222670 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222670, term222670.getClass(), "inputState", null);
        setBooleanField(term222670, term222670.getClass(), "done", false);
        setBooleanField(term222670, term222670.getClass(), "start", false);
        setBooleanField(term222670, term222670.getClass(), "gotData", false);
        setBooleanField(term222670, term222670.getClass(), "onlyPrintableASCII", false);
        setByteField(term222670, term222670.getClass(), "lastChar", (byte) 0);
        setField(term222670, term222670.getClass(), "detectedCharset", null);
        setField(term222670, term222670.getClass(), "probers", null);
        setField(term222670, term222670.getClass(), "escCharsetProber", null);
        setField(term222670, term222670.getClass(), "listener", null);
        term222676 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term222676;
        callMethod(klass, "detectCharsetFromBOM", argTypes, term222670, args);
    }

};


