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

public class UpdateActivityResponse_getContent_47411588211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public UpdateActivityResponse_getContent_47411588211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.UpdateActivityResponse"));
        setField(term622, term622.getClass(), "id", null);
        setField(term622, term622.getClass(), "content", null);
        setField(term622, term622.getClass(), "imageUrl", null);
        setField(term622, term622.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.UpdateActivityResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term622, args);
    }

};


