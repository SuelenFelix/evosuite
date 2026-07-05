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
import java.lang.Long;

public class GetTestimonialResponse_getName_2754540191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;

    public GetTestimonialResponse_getName_2754540191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71 = new Long(6375119433582206027L);
        term70 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term70, term70.getClass(), "id", term71);
        setField(term70, term70.getClass(), "name", "xxtlPwDYFs");
        setField(term70, term70.getClass(), "content", "jJCZpVmanW");
        setField(term70, term70.getClass(), "imageUrl", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term70, args);
    }

};


