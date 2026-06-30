package com.alkemy.ong.infrastructure.rest.mapper.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.mapper.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateTestimonialMapper_toDomain_9490260851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term201;

    public UpdateTestimonialMapper_toDomain_9490260851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.UpdateTestimonialMapper"));
        term201 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest"));
        setField(term201, term201.getClass(), "name", "HyxfbSQYBe");
        setField(term201, term201.getClass(), "content", "pCTimMblYc");
        setField(term201, term201.getClass(), "image", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.UpdateTestimonialMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.UpdateTestimonialRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term201;
        callMethod(klass, "toDomain", argTypes, term200, args);
    }

};


