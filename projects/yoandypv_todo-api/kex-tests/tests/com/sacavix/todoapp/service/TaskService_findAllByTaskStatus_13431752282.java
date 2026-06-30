package com.sacavix.todoapp.service;

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
import static com.sacavix.todoapp.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TaskService_findAllByTaskStatus_13431752282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public TaskService_findAllByTaskStatus_13431752282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term703 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term702 = ((Class) term703).getDeclaredField((String) "ON_TIME");
        ((Field) term702).setAccessible(true);
        enum0 = ((Field) term702).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sacavix.todoapp.persistence.entity.TaskStatus");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "findAllByTaskStatus", argTypes, null, args);
    }

};


