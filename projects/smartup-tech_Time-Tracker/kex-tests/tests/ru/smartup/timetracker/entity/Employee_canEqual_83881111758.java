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

public class Employee_canEqual_83881111758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34964;

    public Employee_canEqual_83881111758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34964 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34964, term34964.getClass(), "id", 0);
        setField(term34964, term34964.getClass(), "firstName", null);
        setField(term34964, term34964.getClass(), "middleName", null);
        setField(term34964, term34964.getClass(), "lastName", null);
        setField(term34964, term34964.getClass(), "email", null);
        setField(term34964, term34964.getClass(), "passwordHash", null);
        setIntField(term34964, term34964.getClass(), "positionId", 0);
        setBooleanField(term34964, term34964.getClass(), "isArchived", false);
        setField(term34964, term34964.getClass(), "createdDate", null);
        setField(term34964, term34964.getClass(), "lastModifiedDate", null);
        setField(term34964, term34964.getClass(), "employeeRoles", null);
        setField(term34964, term34964.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term34964, args);
    }

};


