package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetSlideResponse_setPosition_19167573329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678;
     Object term707;

    public GetSlideResponse_setPosition_19167573329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term679 = new Long(6967924379644551255L);
        Integer term705 = new Integer(1585847225);
        term678 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse"));
        setField(term678, term678.getClass(), "id", term679);
        setField(term678, term678.getClass(), "imageUrl", "IoAlmYsBwc");
        setField(term678, term678.getClass(), "text", "TEParAifyi");
        setField(term678, term678.getClass(), "position", term705);
        term707 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term707;
        callMethod(klass, "setPosition", argTypes, term678, args);
    }

};


