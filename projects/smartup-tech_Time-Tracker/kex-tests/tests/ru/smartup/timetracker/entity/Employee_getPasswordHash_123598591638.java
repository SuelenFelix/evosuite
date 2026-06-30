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

public class Employee_getPasswordHash_123598591638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34878;

    public Employee_getPasswordHash_123598591638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34878 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34878, term34878.getClass(), "id", 0);
        setField(term34878, term34878.getClass(), "firstName", null);
        setField(term34878, term34878.getClass(), "middleName", null);
        setField(term34878, term34878.getClass(), "lastName", null);
        setField(term34878, term34878.getClass(), "email", null);
        setField(term34878, term34878.getClass(), "passwordHash", null);
        setIntField(term34878, term34878.getClass(), "positionId", 0);
        setBooleanField(term34878, term34878.getClass(), "isArchived", false);
        setField(term34878, term34878.getClass(), "createdDate", null);
        setField(term34878, term34878.getClass(), "lastModifiedDate", null);
        setField(term34878, term34878.getClass(), "employeeRoles", null);
        setField(term34878, term34878.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordHash", argTypes, term34878, args);
    }

};


