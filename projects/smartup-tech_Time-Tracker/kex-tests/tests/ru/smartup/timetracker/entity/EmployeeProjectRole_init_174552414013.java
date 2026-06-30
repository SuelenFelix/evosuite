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

public class EmployeeProjectRole_init_174552414013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19925;
     Object term19927;
     Object enum49;
     Object term19941;

    public EmployeeProjectRole_init_174552414013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19925 = new Integer(-1547384488);
        term19927 = new Integer(1442160736);
        Class<? extends Object> term19944 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term19943 = ((Class) term19944).getDeclaredField((String) "EMPLOYEE");
        ((Field) term19943).setAccessible(true);
        enum49 = ((Field) term19943).get((Object) null);
        term19941 = new Float(0.7944024F);
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
        args[0] = term19925;
        args[1] = term19927;
        args[2] = enum49;
        args[3] = term19941;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


