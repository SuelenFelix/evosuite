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

public class SpringBeanConfiguration_getOrganizationUseCase_20077722636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1452;

    public SpringBeanConfiguration_getOrganizationUseCase_20077722636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1452 = newInstance(Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.config.spring.SpringBeanConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.application.repository.IOrganizationRepository");
        argTypes[1] = Class.forName("com.alkemy.ong.application.repository.ISlideRepository");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getOrganizationUseCase", argTypes, term1452, args);
    }

};


