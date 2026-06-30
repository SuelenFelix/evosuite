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

public class SampleDataDTO_toString_17554547297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public SampleDataDTO_toString_17554547297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term292 = new HashMap();
        term279 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO"));
        setField(term279, term279.getClass(), "label", "LQFpaHEwXR");
        setField(term279, term279.getClass(), "valuesMap", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term279, args);
    }

};


