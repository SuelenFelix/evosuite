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

public class CreateTestimonialRequest_getContent_15128124118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;

    public CreateTestimonialRequest_getContent_15128124118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.CreateTestimonialRequest"));
        setField(term536, term536.getClass(), "name", null);
        setField(term536, term536.getClass(), "content", null);
        setField(term536, term536.getClass(), "image", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.CreateTestimonialRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term536, args);
    }

};


