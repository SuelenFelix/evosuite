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
import java.lang.Float;

public class Employee_init_3787356781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20402;
     Object term20404;
     Object enum50;
     Object term20453;

    public Employee_init_3787356781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20402 = new Integer(-344842608);
        term20404 = new Integer(941650513);
        Class<? extends Object> term20486 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term20485 = ((Class) term20486).getDeclaredField((String) "MANAGER");
        ((Field) term20485).setAccessible(true);
        enum50 = ((Field) term20485).get((Object) null);
        term20453 = new Float(0.3692338F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        argTypes[6] = Class.forName("java.lang.Float");
        Object[] args = new Object[7];
        args[0] = term20402;
        args[1] = term20404;
        args[2] = "Ghbwtircqb";
        args[3] = "xrwlQZdwCp";
        args[4] = "IDCWpPLRkE";
        args[5] = enum50;
        args[6] = term20453;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


