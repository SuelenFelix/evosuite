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

public class Employee_hashCode_209166042159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34968;

    public Employee_hashCode_209166042159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34968 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term34968, term34968.getClass(), "id", 0);
        setField(term34968, term34968.getClass(), "firstName", null);
        setField(term34968, term34968.getClass(), "middleName", null);
        setField(term34968, term34968.getClass(), "lastName", null);
        setField(term34968, term34968.getClass(), "email", null);
        setField(term34968, term34968.getClass(), "passwordHash", null);
        setIntField(term34968, term34968.getClass(), "positionId", 0);
        setBooleanField(term34968, term34968.getClass(), "isArchived", false);
        setField(term34968, term34968.getClass(), "createdDate", null);
        setField(term34968, term34968.getClass(), "lastModifiedDate", null);
        setField(term34968, term34968.getClass(), "employeeRoles", null);
        setField(term34968, term34968.getClass(), "employeeProjectRole", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term34968, args);
    }

};


