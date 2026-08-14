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

public class SampleDataDTO_canEqual_81542656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73636;
     Object term73654;

    public SampleDataDTO_canEqual_81542656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term73649 = new HashMap();
        term73636 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO"));
        setField(term73636, term73636.getClass(), "label", "iiHBhsNFgk");
        setField(term73636, term73636.getClass(), "valuesMap", term73649);
        term73654 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.additional.SampleDataDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term73654;
        callMethod(klass, "canEqual", argTypes, term73636, args);
    }

};


