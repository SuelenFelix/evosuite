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

public class CreateTestimonialMapper_toDomain_558643811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term270;

    public CreateTestimonialMapper_toDomain_558643811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.CreateTestimonialMapper"));
        term270 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.CreateTestimonialRequest"));
        setField(term270, term270.getClass(), "name", "RkybSrpybU");
        setField(term270, term270.getClass(), "content", "xOEqzGAmDU");
        setField(term270, term270.getClass(), "image", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.CreateTestimonialMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.testimonial.CreateTestimonialRequest");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "toDomain", argTypes, term269, args);
    }

};


