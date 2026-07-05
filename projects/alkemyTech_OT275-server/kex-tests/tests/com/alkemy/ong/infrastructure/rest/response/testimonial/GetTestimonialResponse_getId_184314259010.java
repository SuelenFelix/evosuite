package com.alkemy.ong.infrastructure.rest.response.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.response.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetTestimonialResponse_getId_184314259010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public GetTestimonialResponse_getId_184314259010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term689, term689.getClass(), "id", null);
        setField(term689, term689.getClass(), "name", null);
        setField(term689, term689.getClass(), "content", null);
        setField(term689, term689.getClass(), "imageUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term689, args);
    }

};


