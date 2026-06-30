package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EmployeeProjectRole_init_174552414027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20324;
     Object term20326;

    public EmployeeProjectRole_init_174552414027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20324 = new Integer(0);
        term20326 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        argTypes[3] = Class.forName("java.lang.Float");
        Object[] args = new Object[4];
        args[0] = term20324;
        args[1] = term20326;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


