package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SemVer_compareTo_21083140111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3359;
     Object term3363;

    public SemVer_compareTo_21083140111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3359 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.SemVer"));
        setIntField(term3359, term3359.getClass(), "major", 568599855);
        setIntField(term3359, term3359.getClass(), "minor", 1162663216);
        setIntField(term3359, term3359.getClass(), "revision", 1484323161);
        term3363 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.SemVer"));
        setIntField(term3363, term3363.getClass(), "major", 391863371);
        setIntField(term3363, term3363.getClass(), "minor", -1922583790);
        setIntField(term3363, term3363.getClass(), "revision", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.SemVer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.common.SemVer");
        Object[] args = new Object[1];
        args[0] = term3363;
        callMethod(klass, "compareTo", argTypes, term3359, args);
    }

};


