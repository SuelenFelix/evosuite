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

public class EmployeeProjectRole_setProjectRoleId_3038688266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17785;
     Object enum43;

    public EmployeeProjectRole_setProjectRoleId_3038688266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17803 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term17802 = ((Class) term17803).getDeclaredField((String) "EMPLOYEE");
        ((Field) term17802).setAccessible(true);
        enum43 = ((Field) term17802).get((Object) null);
        Float term17800 = new Float(0.5446086F);
        term17785 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term17785, term17785.getClass(), "employeeId", 335112684);
        setIntField(term17785, term17785.getClass(), "projectId", 1551099402);
        setField(term17785, term17785.getClass(), "projectRoleId", enum43);
        setField(term17785, term17785.getClass(), "externalRate", term17800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum43;
        callMethod(klass, "setProjectRoleId", argTypes, term17785, args);
    }

};


