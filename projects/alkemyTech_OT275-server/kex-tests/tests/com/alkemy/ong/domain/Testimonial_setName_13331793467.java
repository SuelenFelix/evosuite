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

public class Testimonial_setName_13331793467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16238;

    public Testimonial_setName_13331793467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16239 = new Long(2990264647913003810L);
        term16238 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term16238, term16238.getClass(), "id", term16239);
        setField(term16238, term16238.getClass(), "name", "vZpMxQNHKu");
        setField(term16238, term16238.getClass(), "content", "QLMSDWYwBC");
        setField(term16238, term16238.getClass(), "imageUrl", "feyxNWUenU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Testimonial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qvqwmSUIiP";
        callMethod(klass, "setName", argTypes, term16238, args);
    }

};


