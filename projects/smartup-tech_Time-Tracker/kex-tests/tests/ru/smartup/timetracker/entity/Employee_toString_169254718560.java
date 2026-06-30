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

public class Employee_toString_169254718560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34972;

    public Employee_toString_169254718560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34972 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34972, term34972.getClass(), "id", 0);
        setField(term34972, term34972.getClass(), "firstName", null);
        setField(term34972, term34972.getClass(), "middleName", null);
        setField(term34972, term34972.getClass(), "lastName", null);
        setField(term34972, term34972.getClass(), "email", null);
        setField(term34972, term34972.getClass(), "passwordHash", null);
        setIntField(term34972, term34972.getClass(), "positionId", 0);
        setBooleanField(term34972, term34972.getClass(), "isArchived", false);
        setField(term34972, term34972.getClass(), "createdDate", null);
        setField(term34972, term34972.getClass(), "lastModifiedDate", null);
        setField(term34972, term34972.getClass(), "employeeRoles", null);
        setField(term34972, term34972.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term34972, args);
    }

};


