package com.alkemy.ong.infrastructure.rest.response.activity;

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
import static com.alkemy.ong.infrastructure.rest.response.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateActivityResponse_getId_214149848110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public UpdateActivityResponse_getId_214149848110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.UpdateActivityResponse"));
        setField(term621, term621.getClass(), "id", null);
        setField(term621, term621.getClass(), "content", null);
        setField(term621, term621.getClass(), "imageUrl", null);
        setField(term621, term621.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.UpdateActivityResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term621, args);
    }

};


