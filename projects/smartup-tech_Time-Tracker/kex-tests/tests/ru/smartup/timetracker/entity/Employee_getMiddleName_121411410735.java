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

public class Employee_getMiddleName_121411410735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34866;

    public Employee_getMiddleName_121411410735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34866 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34866, term34866.getClass(), "id", 0);
        setField(term34866, term34866.getClass(), "firstName", null);
        setField(term34866, term34866.getClass(), "middleName", null);
        setField(term34866, term34866.getClass(), "lastName", null);
        setField(term34866, term34866.getClass(), "email", null);
        setField(term34866, term34866.getClass(), "passwordHash", null);
        setIntField(term34866, term34866.getClass(), "positionId", 0);
        setBooleanField(term34866, term34866.getClass(), "isArchived", false);
        setField(term34866, term34866.getClass(), "createdDate", null);
        setField(term34866, term34866.getClass(), "lastModifiedDate", null);
        setField(term34866, term34866.getClass(), "employeeRoles", null);
        setField(term34866, term34866.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term34866, args);
    }

};


