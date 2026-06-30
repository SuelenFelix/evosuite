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

public class GetTestimonialResponse_setId_14131008324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term316;

    public GetTestimonialResponse_setId_14131008324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278 = new Long(5270370404989704783L);
        term277 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term277, term277.getClass(), "id", term278);
        setField(term277, term277.getClass(), "name", "MxlszYVzRf");
        setField(term277, term277.getClass(), "content", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "imageUrl", "oVcInYnLWB");
        term316 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term316;
        callMethod(klass, "setId", argTypes, term277, args);
    }

};


