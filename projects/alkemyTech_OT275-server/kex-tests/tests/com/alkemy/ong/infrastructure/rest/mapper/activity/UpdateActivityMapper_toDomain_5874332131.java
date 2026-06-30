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

public class UpdateActivityMapper_toDomain_5874332131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term142;

    public UpdateActivityMapper_toDomain_5874332131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper"));
        term142 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest"));
        setField(term142, term142.getClass(), "content", "SzjVpOQTyS");
        setField(term142, term142.getClass(), "imageUrl", "MjGYSRKTNF");
        setField(term142, term142.getClass(), "name", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term142;
        callMethod(klass, "toDomain", argTypes, term141, args);
    }

};


