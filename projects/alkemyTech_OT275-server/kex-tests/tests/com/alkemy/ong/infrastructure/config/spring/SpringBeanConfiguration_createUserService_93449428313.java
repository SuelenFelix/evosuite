package com.alkemy.ong.infrastructure.config.spring;

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
import static com.alkemy.ong.infrastructure.config.spring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpringBeanConfiguration_createUserService_93449428313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1459;

    public SpringBeanConfiguration_createUserService_93449428313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1459 = newInstance(Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.repository.UserRepository");
        argTypes[1] = Class.forName("com.alkemy.ong.application.repository.IRoleRepository");
        argTypes[2] = Class.forName("com.alkemy.ong.application.repository.IOrganizationRepository");
        argTypes[3] = Class.forName("com.alkemy.ong.application.util.mail.IMailSender");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "createUserService", argTypes, term1459, args);
    }

};


