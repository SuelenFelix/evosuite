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

public class PropertySelector_hashCode_7898702287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3557;

    public PropertySelector_hashCode_7898702287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3557 = newInstance(Class.forName("org.s1ck.gdl.model.comparables.PropertySelector"));
        setField(term3557, term3557.getClass(), "variable", "VMeAzAHwZj");
        setField(term3557, term3557.getClass(), "propertyName", "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.comparables.PropertySelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3557, args);
    }

};


