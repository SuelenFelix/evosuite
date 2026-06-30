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

public class SpringBeanConfiguration_createContactUseCase_165245753971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;

    public SpringBeanConfiguration_createContactUseCase_165245753971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516 = newInstance(Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.alkemy.ong.application.repository.IContactRepository");
        argTypes[1] = Class.forName("com.alkemy.ong.application.repository.IOrganizationRepository");
        argTypes[2] = Class.forName("com.alkemy.ong.application.util.mail.IMailSender");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createContactUseCase", argTypes, term1516, args);
    }

};


