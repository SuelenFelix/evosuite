package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TestimonialEntity_setSoftDeleted_130002724521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3403;
     Object term3405;

    public TestimonialEntity_setSoftDeleted_130002724521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3403 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        setField(term3403, term3403.getClass(), "testimonialId", null);
        setField(term3403, term3403.getClass(), "name", null);
        setField(term3403, term3403.getClass(), "imageUrl", null);
        setField(term3403, term3403.getClass(), "content", null);
        setField(term3403, term3403.getClass(), "createTimestamp", null);
        setBooleanField(term3403, term3403.getClass(), "softDeleted", false);
        term3405 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3405;
        callMethod(klass, "setSoftDeleted", argTypes, term3403, args);
    }

};


