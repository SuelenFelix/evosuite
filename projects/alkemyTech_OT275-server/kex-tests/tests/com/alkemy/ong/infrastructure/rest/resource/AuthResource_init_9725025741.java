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

public class AuthResource_init_9725025741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public AuthResource_init_9725025741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.AuthResource");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.user.usecase.ICreateUserUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.user.usecase.ILoginUserUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.RegisterUserMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.AuthenticationMapper");
        argTypes[4] = Class.forName("com.alkemy.ong.application.service.user.usecase.IGetUserUseCase");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserDetailsMapper");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


