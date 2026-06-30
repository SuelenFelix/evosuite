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

public class Employee_getLastName_139875199636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34870;

    public Employee_getLastName_139875199636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34870 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34870, term34870.getClass(), "id", 0);
        setField(term34870, term34870.getClass(), "firstName", null);
        setField(term34870, term34870.getClass(), "middleName", null);
        setField(term34870, term34870.getClass(), "lastName", null);
        setField(term34870, term34870.getClass(), "email", null);
        setField(term34870, term34870.getClass(), "passwordHash", null);
        setIntField(term34870, term34870.getClass(), "positionId", 0);
        setBooleanField(term34870, term34870.getClass(), "isArchived", false);
        setField(term34870, term34870.getClass(), "createdDate", null);
        setField(term34870, term34870.getClass(), "lastModifiedDate", null);
        setField(term34870, term34870.getClass(), "employeeRoles", null);
        setField(term34870, term34870.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term34870, args);
    }

};


