package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ActivityResource_init_10727391050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term52;

    public ActivityResource_init_10727391050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper"));
        term52 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.CreateActivityMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.ActivityResource");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.activity.usecase.IUpdateActivityUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.UpdateActivityMapper");
        argTypes[2] = Class.forName("com.alkemy.ong.application.service.activity.usecase.ICreateActivityUseCase");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.activity.CreateActivityMapper");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term51;
        args[2] = null;
        args[3] = term52;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


