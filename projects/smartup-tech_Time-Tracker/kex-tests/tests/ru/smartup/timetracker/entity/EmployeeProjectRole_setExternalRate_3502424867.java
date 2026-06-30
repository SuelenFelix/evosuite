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

public class EmployeeProjectRole_setExternalRate_3502424867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18143;
     Object term18159;

    public EmployeeProjectRole_setExternalRate_3502424867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18162 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18161 = ((Class) term18162).getDeclaredField((String) "MANAGER");
        ((Field) term18161).setAccessible(true);
        Object enum44 = ((Field) term18161).get((Object) null);
        Float term18157 = new Float(0.5254275F);
        term18143 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term18143, term18143.getClass(), "employeeId", -2027534003);
        setIntField(term18143, term18143.getClass(), "projectId", 1063420942);
        setField(term18143, term18143.getClass(), "projectRoleId", enum44);
        setField(term18143, term18143.getClass(), "externalRate", term18157);
        term18159 = new Float(0.2857073F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = term18159;
        callMethod(klass, "setExternalRate", argTypes, term18143, args);
    }

};


