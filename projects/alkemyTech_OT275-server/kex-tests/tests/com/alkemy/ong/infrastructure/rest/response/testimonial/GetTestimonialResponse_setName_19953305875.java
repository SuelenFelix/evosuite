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

public class GetTestimonialResponse_setName_19953305875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public GetTestimonialResponse_setName_19953305875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term349 = new Long(4872422362414183754L);
        term348 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term348, term348.getClass(), "id", term349);
        setField(term348, term348.getClass(), "name", "aJlieCFVtF");
        setField(term348, term348.getClass(), "content", "ZiaGIbnzTs");
        setField(term348, term348.getClass(), "imageUrl", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setName", argTypes, term348, args);
    }

};


