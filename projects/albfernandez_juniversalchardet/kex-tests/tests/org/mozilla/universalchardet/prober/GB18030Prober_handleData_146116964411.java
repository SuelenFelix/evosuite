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

public class GB18030Prober_handleData_146116964411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145850;
     Object term145852;
     Object term145854;

    public GB18030Prober_handleData_146116964411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145850 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        setField(term145850, term145850.getClass(), "codingSM", null);
        setField(term145850, term145850.getClass(), "state", null);
        setField(term145850, term145850.getClass(), "distributionAnalyzer", null);
        setField(term145850, term145850.getClass(), "lastChar", null);
        setBooleanField(term145850, term145850.getClass(), "active", false);
        term145852 = new Integer(0);
        term145854 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.GB18030Prober");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term145852;
        args[2] = term145854;
        callMethod(klass, "handleData", argTypes, term145850, args);
    }

};


