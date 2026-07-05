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

public class Testimonial_getId_11809913492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15891;

    public Testimonial_getId_11809913492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15892 = new Long(-3565554762799701668L);
        term15891 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term15891, term15891.getClass(), "id", term15892);
        setField(term15891, term15891.getClass(), "name", "tKlyiBloWu");
        setField(term15891, term15891.getClass(), "content", "uIgRFcwqLd");
        setField(term15891, term15891.getClass(), "imageUrl", "AvdsiEyCve");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Testimonial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15891, args);
    }

};


