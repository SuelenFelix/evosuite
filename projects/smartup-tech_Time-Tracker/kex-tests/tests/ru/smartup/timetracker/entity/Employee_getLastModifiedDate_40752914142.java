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

public class Employee_getLastModifiedDate_40752914142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34894;

    public Employee_getLastModifiedDate_40752914142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34894 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34894, term34894.getClass(), "id", 0);
        setField(term34894, term34894.getClass(), "firstName", null);
        setField(term34894, term34894.getClass(), "middleName", null);
        setField(term34894, term34894.getClass(), "lastName", null);
        setField(term34894, term34894.getClass(), "email", null);
        setField(term34894, term34894.getClass(), "passwordHash", null);
        setIntField(term34894, term34894.getClass(), "positionId", 0);
        setBooleanField(term34894, term34894.getClass(), "isArchived", false);
        setField(term34894, term34894.getClass(), "createdDate", null);
        setField(term34894, term34894.getClass(), "lastModifiedDate", null);
        setField(term34894, term34894.getClass(), "employeeRoles", null);
        setField(term34894, term34894.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term34894, args);
    }

};


