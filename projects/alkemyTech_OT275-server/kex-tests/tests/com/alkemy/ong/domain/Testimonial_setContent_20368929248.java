package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Testimonial_setContent_20368929248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16329;

    public Testimonial_setContent_20368929248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16330 = new Long(-2195794659127490022L);
        term16329 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term16329, term16329.getClass(), "id", term16330);
        setField(term16329, term16329.getClass(), "name", "eNOEXYoAtV");
        setField(term16329, term16329.getClass(), "content", "SNqwfZGLFh");
        setField(term16329, term16329.getClass(), "imageUrl", "sMqpXbgEga");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Testimonial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nYJlDpoMcL";
        callMethod(klass, "setContent", argTypes, term16329, args);
    }

};


