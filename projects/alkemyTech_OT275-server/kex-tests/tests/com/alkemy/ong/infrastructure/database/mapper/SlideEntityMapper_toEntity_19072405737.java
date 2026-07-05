package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SlideEntityMapper_toEntity_19072405737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764;

    public SlideEntityMapper_toEntity_19072405737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toEntity", argTypes, term764, args);
    }

};


