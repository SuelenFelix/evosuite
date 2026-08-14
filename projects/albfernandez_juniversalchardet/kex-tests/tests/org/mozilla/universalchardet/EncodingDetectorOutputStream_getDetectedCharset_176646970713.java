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

public class EncodingDetectorOutputStream_getDetectedCharset_176646970713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2273;

    public EncodingDetectorOutputStream_getDetectedCharset_176646970713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2273 = newInstance(Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream"));
        setField(term2273, term2273.getClass(), "out", null);
        setField(term2273, term2273.getClass(), "detector", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.EncodingDetectorOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetectedCharset", argTypes, term2273, args);
    }

};


