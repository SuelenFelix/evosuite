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

public class UniversalDetector_isDone_49089959717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222630;

    public UniversalDetector_isDone_49089959717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222630 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222630, term222630.getClass(), "inputState", null);
        setBooleanField(term222630, term222630.getClass(), "done", false);
        setBooleanField(term222630, term222630.getClass(), "start", false);
        setBooleanField(term222630, term222630.getClass(), "gotData", false);
        setBooleanField(term222630, term222630.getClass(), "onlyPrintableASCII", false);
        setByteField(term222630, term222630.getClass(), "lastChar", (byte) 0);
        setField(term222630, term222630.getClass(), "detectedCharset", null);
        setField(term222630, term222630.getClass(), "probers", null);
        setField(term222630, term222630.getClass(), "escCharsetProber", null);
        setField(term222630, term222630.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDone", argTypes, term222630, args);
    }

};


