package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateSlideMapper_toDomain_12639688414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;

    public UpdateSlideMapper_toDomain_12639688414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term928 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.UpdateSlideMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.UpdateSlideMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.UpdateSlideRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "toDomain", argTypes, term928, args);
    }

};


