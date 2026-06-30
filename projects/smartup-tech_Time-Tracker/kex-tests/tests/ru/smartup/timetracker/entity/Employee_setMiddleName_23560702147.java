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

public class Employee_setMiddleName_23560702147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34916;

    public Employee_setMiddleName_23560702147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34916 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34916, term34916.getClass(), "id", 0);
        setField(term34916, term34916.getClass(), "firstName", null);
        setField(term34916, term34916.getClass(), "middleName", null);
        setField(term34916, term34916.getClass(), "lastName", null);
        setField(term34916, term34916.getClass(), "email", null);
        setField(term34916, term34916.getClass(), "passwordHash", null);
        setIntField(term34916, term34916.getClass(), "positionId", 0);
        setBooleanField(term34916, term34916.getClass(), "isArchived", false);
        setField(term34916, term34916.getClass(), "createdDate", null);
        setField(term34916, term34916.getClass(), "lastModifiedDate", null);
        setField(term34916, term34916.getClass(), "employeeRoles", null);
        setField(term34916, term34916.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMiddleName", argTypes, term34916, args);
    }

};


