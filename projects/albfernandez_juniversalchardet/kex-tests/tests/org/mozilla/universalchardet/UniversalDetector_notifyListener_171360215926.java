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

public class UniversalDetector_notifyListener_171360215926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222690;

    public UniversalDetector_notifyListener_171360215926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222690 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222690, term222690.getClass(), "inputState", null);
        setBooleanField(term222690, term222690.getClass(), "done", false);
        setBooleanField(term222690, term222690.getClass(), "start", false);
        setBooleanField(term222690, term222690.getClass(), "gotData", false);
        setBooleanField(term222690, term222690.getClass(), "onlyPrintableASCII", false);
        setByteField(term222690, term222690.getClass(), "lastChar", (byte) 0);
        setField(term222690, term222690.getClass(), "detectedCharset", null);
        setField(term222690, term222690.getClass(), "probers", null);
        setField(term222690, term222690.getClass(), "escCharsetProber", null);
        setField(term222690, term222690.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "notifyListener", argTypes, term222690, args);
    }

};


