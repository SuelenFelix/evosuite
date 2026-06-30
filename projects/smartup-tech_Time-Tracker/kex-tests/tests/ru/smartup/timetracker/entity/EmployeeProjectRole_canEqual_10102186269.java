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

public class EmployeeProjectRole_canEqual_10102186269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18858;
     Object term18874;

    public EmployeeProjectRole_canEqual_10102186269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18876 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18875 = ((Class) term18876).getDeclaredField((String) "MANAGER");
        ((Field) term18875).setAccessible(true);
        Object enum46 = ((Field) term18875).get((Object) null);
        Float term18872 = new Float(0.40176582F);
        term18858 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term18858, term18858.getClass(), "employeeId", 972867650);
        setIntField(term18858, term18858.getClass(), "projectId", 1655935355);
        setField(term18858, term18858.getClass(), "projectRoleId", enum46);
        setField(term18858, term18858.getClass(), "externalRate", term18872);
        term18874 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18874;
        callMethod(klass, "canEqual", argTypes, term18858, args);
    }

};


