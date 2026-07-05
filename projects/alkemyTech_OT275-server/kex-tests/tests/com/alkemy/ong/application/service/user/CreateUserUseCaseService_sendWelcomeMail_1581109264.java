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

public class CreateUserUseCaseService_sendWelcomeMail_1581109264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;

    public CreateUserUseCaseService_sendWelcomeMail_1581109264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = newInstance(Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService"));
        setField(term918, term918.getClass(), "userRepository", null);
        setField(term918, term918.getClass(), "roleRepository", null);
        setField(term918, term918.getClass(), "organizationRepository", null);
        setField(term918, term918.getClass(), "mailSender", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "sendWelcomeMail", argTypes, term918, args);
    }

};


