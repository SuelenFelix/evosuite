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
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class EmployeeProjectRole_equals_2060559978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18499;
     Object term18516;

    public EmployeeProjectRole_equals_2060559978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18518 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18517 = ((Class) term18518).getDeclaredField((String) "EMPLOYEE");
        ((Field) term18517).setAccessible(true);
        Object enum45 = ((Field) term18517).get((Object) null);
        Float term18514 = new Float(0.6880585F);
        term18499 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term18499, term18499.getClass(), "employeeId", 1375330971);
        setIntField(term18499, term18499.getClass(), "projectId", -478195677);
        setField(term18499, term18499.getClass(), "projectRoleId", enum45);
        setField(term18499, term18499.getClass(), "externalRate", term18514);
        term18516 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18516;
        callMethod(klass, "equals", argTypes, term18499, args);
    }

};


