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

public class TestimonialEntity_getCreateTimestamp_31043371826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3415;

    public TestimonialEntity_getCreateTimestamp_31043371826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3415 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        setField(term3415, term3415.getClass(), "testimonialId", null);
        setField(term3415, term3415.getClass(), "name", null);
        setField(term3415, term3415.getClass(), "imageUrl", null);
        setField(term3415, term3415.getClass(), "content", null);
        setField(term3415, term3415.getClass(), "createTimestamp", null);
        setBooleanField(term3415, term3415.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term3415, args);
    }

};


