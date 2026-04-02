package com.alkemy.ong.infrastructure.rest.mapper.activity;

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
import static com.alkemy.ong.infrastructure.rest.mapper.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UpdateActivityMapper_toResponse_17993404742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term210;

    public UpdateActivityMapper_toResponse_17993404742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper"));
        Long term211 = new Long(6375119433582206027L);
        term210 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term210, term210.getClass(), "id", term211);
        setField(term210, term210.getClass(), "content", "RMFIsYGgne");
        setField(term210, term210.getClass(), "imageUrl", "NRdvgJlhkX");
        setField(term210, term210.getClass(), "name", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term210;
        callMethod(klass, "toResponse", argTypes, term209, args);
    }

};


