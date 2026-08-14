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

public class UniversalDetector_handleData_58807983922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222660;
     Object term222666;
     Object term222668;

    public UniversalDetector_handleData_58807983922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222660 = newInstance(Class.forName("org.mozilla.universalchardet.UniversalDetector"));
        setField(term222660, term222660.getClass(), "inputState", null);
        setBooleanField(term222660, term222660.getClass(), "done", false);
        setBooleanField(term222660, term222660.getClass(), "start", false);
        setBooleanField(term222660, term222660.getClass(), "gotData", false);
        setBooleanField(term222660, term222660.getClass(), "onlyPrintableASCII", false);
        setByteField(term222660, term222660.getClass(), "lastChar", (byte) 0);
        setField(term222660, term222660.getClass(), "detectedCharset", null);
        setField(term222660, term222660.getClass(), "probers", null);
        setField(term222660, term222660.getClass(), "escCharsetProber", null);
        setField(term222660, term222660.getClass(), "listener", null);
        term222666 = new Integer(0);
        term222668 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UniversalDetector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term222666;
        args[2] = term222668;
        callMethod(klass, "handleData", argTypes, term222660, args);
    }

};


