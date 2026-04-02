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

public class UpdateTestimonialRequest_setContent_21248603764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;

    public UpdateTestimonialRequest_setContent_21248603764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest"));
        setField(term831, term831.getClass(), "name", "IDCWpPLRkE");
        setField(term831, term831.getClass(), "content", "nyiiPDVjAc");
        setField(term831, term831.getClass(), "image", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setContent", argTypes, term831, args);
    }

};


