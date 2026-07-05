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

public class ListTestimonialResponse_getTestimonials_18057667557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term987;

    public ListTestimonialResponse_getTestimonials_18057667557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term987 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.ListTestimonialResponse"));
        setField(term987, term987.getClass(), "testimonials", null);
        setIntField(term987, term987.getClass(), "page", 0);
        setIntField(term987, term987.getClass(), "size", 0);
        setIntField(term987, term987.getClass(), "totalPages", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.ListTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestimonials", argTypes, term987, args);
    }

};


