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

public class Employee_setId_30595764545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34906;
     Object term34910;

    public Employee_setId_30595764545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34906 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34906, term34906.getClass(), "id", 0);
        setField(term34906, term34906.getClass(), "firstName", null);
        setField(term34906, term34906.getClass(), "middleName", null);
        setField(term34906, term34906.getClass(), "lastName", null);
        setField(term34906, term34906.getClass(), "email", null);
        setField(term34906, term34906.getClass(), "passwordHash", null);
        setIntField(term34906, term34906.getClass(), "positionId", 0);
        setBooleanField(term34906, term34906.getClass(), "isArchived", false);
        setField(term34906, term34906.getClass(), "createdDate", null);
        setField(term34906, term34906.getClass(), "lastModifiedDate", null);
        setField(term34906, term34906.getClass(), "employeeRoles", null);
        setField(term34906, term34906.getClass(), "employeeProjectRole", null);
        term34910 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term34910;
        callMethod(klass, "setId", argTypes, term34906, args);
    }

};


