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

public class UpdateTestimonialRequest_setName_142114679810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078;

    public UpdateTestimonialRequest_setName_142114679810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest"));
        setField(term1078, term1078.getClass(), "name", null);
        setField(term1078, term1078.getClass(), "content", null);
        setField(term1078, term1078.getClass(), "image", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term1078, args);
    }

};


