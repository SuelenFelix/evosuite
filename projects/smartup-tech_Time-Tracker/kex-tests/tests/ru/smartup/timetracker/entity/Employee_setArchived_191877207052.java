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
import java.lang.Boolean;

public class Employee_setArchived_191877207052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34938;
     Object term34942;

    public Employee_setArchived_191877207052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34938 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34938, term34938.getClass(), "id", 0);
        setField(term34938, term34938.getClass(), "firstName", null);
        setField(term34938, term34938.getClass(), "middleName", null);
        setField(term34938, term34938.getClass(), "lastName", null);
        setField(term34938, term34938.getClass(), "email", null);
        setField(term34938, term34938.getClass(), "passwordHash", null);
        setIntField(term34938, term34938.getClass(), "positionId", 0);
        setBooleanField(term34938, term34938.getClass(), "isArchived", false);
        setField(term34938, term34938.getClass(), "createdDate", null);
        setField(term34938, term34938.getClass(), "lastModifiedDate", null);
        setField(term34938, term34938.getClass(), "employeeRoles", null);
        setField(term34938, term34938.getClass(), "employeeProjectRole", null);
        term34942 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term34942;
        callMethod(klass, "setArchived", argTypes, term34938, args);
    }

};


