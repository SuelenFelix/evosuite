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

public class UTF8Prober_handleData_15085388669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386100;
     Object term386103;
     Object term386105;

    public UTF8Prober_handleData_15085388669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386100 = newInstance(Class.forName("org.mozilla.universalchardet.prober.UTF8Prober"));
        setField(term386100, term386100.getClass(), "codingSM", null);
        setField(term386100, term386100.getClass(), "state", null);
        setIntField(term386100, term386100.getClass(), "numOfMBChar", 0);
        setBooleanField(term386100, term386100.getClass(), "active", false);
        term386103 = new Integer(0);
        term386105 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.UTF8Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term386103;
        args[2] = term386105;
        callMethod(klass, "handleData", argTypes, term386100, args);
    }

};


