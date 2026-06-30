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

public class UpdateTestimonialRequest_getName_2987297707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public UpdateTestimonialRequest_getName_2987297707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest"));
        setField(term1075, term1075.getClass(), "name", null);
        setField(term1075, term1075.getClass(), "content", null);
        setField(term1075, term1075.getClass(), "image", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1075, args);
    }

};


