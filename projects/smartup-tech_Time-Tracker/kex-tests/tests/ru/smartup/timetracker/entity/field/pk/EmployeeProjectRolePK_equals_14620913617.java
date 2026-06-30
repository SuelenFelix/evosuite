package ru.smartup.timetracker.entity.field.pk;

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
import static ru.smartup.timetracker.entity.field.pk.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeProjectRolePK_equals_14620913617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1795;

    public EmployeeProjectRolePK_equals_14620913617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1795 = newInstance(Class.forName("ru.smartup.timetracker.entity.field.pk.EmployeeProjectRolePK"));
        setIntField(term1795, term1795.getClass(), "employeeId", 0);
        setIntField(term1795, term1795.getClass(), "projectId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.pk.EmployeeProjectRolePK");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term1795, args);
    }

};


