package com.projectsample.libapachepoi.playground.additional;

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
import static com.projectsample.libapachepoi.playground.additional.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class SampleDataDTO_hashCode_12446950396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;

    public SampleDataDTO_hashCode_12446950396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term264 = new HashMap();
        term251 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO"));
        setField(term251, term251.getClass(), "label", "MxlszYVzRf");
        setField(term251, term251.getClass(), "valuesMap", term264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term251, args);
    }

};


