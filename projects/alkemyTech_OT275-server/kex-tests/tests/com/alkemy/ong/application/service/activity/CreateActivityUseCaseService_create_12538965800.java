package com.alkemy.ong.application.service.activity;

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
import static com.alkemy.ong.application.service.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateActivityUseCaseService_create_12538965800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term73;

    public CreateActivityUseCaseService_create_12538965800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("com.alkemy.ong.application.service.activity.CreateActivityUseCaseService"));
        setField(term72, term72.getClass(), "activityRepository", null);
        Long term74 = new Long(6375119433582206027L);
        term73 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term73, term73.getClass(), "id", term74);
        setField(term73, term73.getClass(), "content", "xxtlPwDYFs");
        setField(term73, term73.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term73, term73.getClass(), "name", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.activity.CreateActivityUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term73;
        callMethod(klass, "create", argTypes, term72, args);
    }

};


