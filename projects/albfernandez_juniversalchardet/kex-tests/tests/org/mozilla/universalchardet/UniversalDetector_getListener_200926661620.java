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

public class UniversalDetector_getListener_200926661620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222648;

    public UniversalDetector_getListener_200926661620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222648 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222648, term222648.getClass(), "inputState", null);
        setBooleanField(term222648, term222648.getClass(), "done", false);
        setBooleanField(term222648, term222648.getClass(), "start", false);
        setBooleanField(term222648, term222648.getClass(), "gotData", false);
        setBooleanField(term222648, term222648.getClass(), "onlyPrintableASCII", false);
        setByteField(term222648, term222648.getClass(), "lastChar", (byte) 0);
        setField(term222648, term222648.getClass(), "detectedCharset", null);
        setField(term222648, term222648.getClass(), "probers", null);
        setField(term222648, term222648.getClass(), "escCharsetProber", null);
        setField(term222648, term222648.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListener", argTypes, term222648, args);
    }

};


