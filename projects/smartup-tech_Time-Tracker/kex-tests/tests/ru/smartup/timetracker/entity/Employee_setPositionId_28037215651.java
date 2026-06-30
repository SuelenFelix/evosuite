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
import java.lang.Integer;

public class Employee_setPositionId_28037215651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34932;
     Object term34936;

    public Employee_setPositionId_28037215651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34932 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34932, term34932.getClass(), "id", 0);
        setField(term34932, term34932.getClass(), "firstName", null);
        setField(term34932, term34932.getClass(), "middleName", null);
        setField(term34932, term34932.getClass(), "lastName", null);
        setField(term34932, term34932.getClass(), "email", null);
        setField(term34932, term34932.getClass(), "passwordHash", null);
        setIntField(term34932, term34932.getClass(), "positionId", 0);
        setBooleanField(term34932, term34932.getClass(), "isArchived", false);
        setField(term34932, term34932.getClass(), "createdDate", null);
        setField(term34932, term34932.getClass(), "lastModifiedDate", null);
        setField(term34932, term34932.getClass(), "employeeRoles", null);
        setField(term34932, term34932.getClass(), "employeeProjectRole", null);
        term34936 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term34936;
        callMethod(klass, "setPositionId", argTypes, term34932, args);
    }

};


