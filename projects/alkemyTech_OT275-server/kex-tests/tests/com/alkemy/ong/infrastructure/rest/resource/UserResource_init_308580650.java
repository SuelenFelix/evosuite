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
import java.lang.Object;

public class UserResource_init_308580650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public UserResource_init_308580650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.ListUserMapper"));
        Object term29 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper"));
        setField(term28, term28.getClass(), "getUserMapper", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.UserResource");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.user.usecase.IDeleteUserUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.user.usecase.IListUserUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.ListUserMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.application.service.user.usecase.IUpdateUserUseCase");
        argTypes[4] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.UpdateUserMapper");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term28;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


