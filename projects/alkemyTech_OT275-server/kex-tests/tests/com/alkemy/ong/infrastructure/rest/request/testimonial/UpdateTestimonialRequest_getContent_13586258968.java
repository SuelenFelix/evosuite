package com.alkemy.ong.infrastructure.rest.request.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.request.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateTestimonialRequest_getContent_13586258968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;

    public UpdateTestimonialRequest_getContent_13586258968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1076 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest"));
        setField(term1076, term1076.getClass(), "name", null);
        setField(term1076, term1076.getClass(), "content", null);
        setField(term1076, term1076.getClass(), "image", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term1076, args);
    }

};


