package com.alkemy.ong.application.service.user;

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
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateUserUseCaseService_init_19409208362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CreateUserUseCaseService_init_19409208362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.alkemy.ong.application.repository.IUserRepository");
        argTypes[1] = Class.forName("com.alkemy.ong.application.repository.IRoleRepository");
        argTypes[2] = Class.forName("com.alkemy.ong.application.repository.IOrganizationRepository");
        argTypes[3] = Class.forName("com.alkemy.ong.application.util.mail.IMailSender");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


