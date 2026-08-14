package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Latin1Prober_handleData_100008005411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323616;
     Object term323619;
     Object term323621;

    public Latin1Prober_handleData_100008005411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323616 = newInstance(Class.forName("org.mozilla.universalchardet.prober.Latin1Prober"));
        setField(term323616, term323616.getClass(), "state", null);
        setByteField(term323616, term323616.getClass(), "lastCharClass", (byte) 0);
        setField(term323616, term323616.getClass(), "freqCounter", null);
        setBooleanField(term323616, term323616.getClass(), "active", false);
        term323619 = new Integer(0);
        term323621 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.Latin1Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term323619;
        args[2] = term323621;
        callMethod(klass, "handleData", argTypes, term323616, args);
    }

};


