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

public class EmployeeProjectRole_canEqual_101021862623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20315;

    public EmployeeProjectRole_canEqual_101021862623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20315 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term20315, term20315.getClass(), "employeeId", 0);
        setIntField(term20315, term20315.getClass(), "projectId", 0);
        setField(term20315, term20315.getClass(), "projectRoleId", null);
        setField(term20315, term20315.getClass(), "externalRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term20315, args);
    }

};


