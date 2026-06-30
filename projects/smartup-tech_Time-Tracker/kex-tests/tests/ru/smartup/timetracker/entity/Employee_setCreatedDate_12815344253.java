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

public class Employee_setCreatedDate_12815344253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34944;

    public Employee_setCreatedDate_12815344253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34944 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34944, term34944.getClass(), "id", 0);
        setField(term34944, term34944.getClass(), "firstName", null);
        setField(term34944, term34944.getClass(), "middleName", null);
        setField(term34944, term34944.getClass(), "lastName", null);
        setField(term34944, term34944.getClass(), "email", null);
        setField(term34944, term34944.getClass(), "passwordHash", null);
        setIntField(term34944, term34944.getClass(), "positionId", 0);
        setBooleanField(term34944, term34944.getClass(), "isArchived", false);
        setField(term34944, term34944.getClass(), "createdDate", null);
        setField(term34944, term34944.getClass(), "lastModifiedDate", null);
        setField(term34944, term34944.getClass(), "employeeRoles", null);
        setField(term34944, term34944.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedDate", argTypes, term34944, args);
    }

};


