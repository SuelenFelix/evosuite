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

public class UniversalDetector_detectCharset_119615340728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222702;

    public UniversalDetector_detectCharset_119615340728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222702 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222702, term222702.getClass(), "inputState", null);
        setBooleanField(term222702, term222702.getClass(), "done", false);
        setBooleanField(term222702, term222702.getClass(), "start", false);
        setBooleanField(term222702, term222702.getClass(), "gotData", false);
        setBooleanField(term222702, term222702.getClass(), "onlyPrintableASCII", false);
        setByteField(term222702, term222702.getClass(), "lastChar", (byte) 0);
        setField(term222702, term222702.getClass(), "detectedCharset", null);
        setField(term222702, term222702.getClass(), "probers", null);
        setField(term222702, term222702.getClass(), "escCharsetProber", null);
        setField(term222702, term222702.getClass(), "listener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.file.Path");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "detectCharset", argTypes, term222702, args);
    }

};


