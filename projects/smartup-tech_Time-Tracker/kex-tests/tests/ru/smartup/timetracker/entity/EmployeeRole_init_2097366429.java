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
import java.lang.String;
import java.lang.Object;

public class EmployeeRole_init_2097366429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40297;
     Object enum94;

    public EmployeeRole_init_2097366429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40297 = new Integer(371943306);
        Class<? extends Object> term40314 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term40313 = ((Class) term40314).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term40313).setAccessible(true);
        enum94 = ((Field) term40313).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeRole");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Object[] args = new Object[2];
        args[0] = term40297;
        args[1] = enum94;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


