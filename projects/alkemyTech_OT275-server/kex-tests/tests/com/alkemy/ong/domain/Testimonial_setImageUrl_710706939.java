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

public class Testimonial_setImageUrl_710706939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16420;

    public Testimonial_setImageUrl_710706939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16421 = new Long(6142089107139955834L);
        term16420 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term16420, term16420.getClass(), "id", term16421);
        setField(term16420, term16420.getClass(), "name", "SQnbnBmbcf");
        setField(term16420, term16420.getClass(), "content", "jaNVteZrZi");
        setField(term16420, term16420.getClass(), "imageUrl", "bMRkDiPUGu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Testimonial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xjKxECGyLT";
        callMethod(klass, "setImageUrl", argTypes, term16420, args);
    }

};


