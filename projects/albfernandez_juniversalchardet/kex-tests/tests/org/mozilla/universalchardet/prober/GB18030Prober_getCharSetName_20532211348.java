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

public class GB18030Prober_getCharSetName_20532211348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145844;

    public GB18030Prober_getCharSetName_20532211348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145844 = newInstance(Class.forName("org.mozilla.universalchardet.prober.GB18030Prober"));
        setField(term145844, term145844.getClass(), "codingSM", null);
        setField(term145844, term145844.getClass(), "state", null);
        setField(term145844, term145844.getClass(), "distributionAnalyzer", null);
        setField(term145844, term145844.getClass(), "lastChar", null);
        setBooleanField(term145844, term145844.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.GB18030Prober");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term145844, args);
    }

};


