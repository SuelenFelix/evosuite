package org.s1ck.gdl.model.comparables;

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
import static org.s1ck.gdl.model.comparables.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PropertySelector_equals_3411835535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3510;
     Object term3535;

    public PropertySelector_equals_3411835535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3510 = newInstance(Class.forName("org.s1ck.gdl.model.comparables.PropertySelector"));
        setField(term3510, term3510.getClass(), "variable", "fWKJoSoCwE");
        setField(term3510, term3510.getClass(), "propertyName", "wfaXBpWAUH");
        term3535 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.comparables.PropertySelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3535;
        callMethod(klass, "equals", argTypes, term3510, args);
    }

};


