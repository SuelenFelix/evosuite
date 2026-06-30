package ru.smartup.timetracker.dto.employee.response;

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
import static ru.smartup.timetracker.dto.employee.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDetailDto_equals_214026016522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4363;

    public EmployeeDetailDto_equals_214026016522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4363 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        setField(term4363, term4363.getClass(), "position", null);
        setField(term4363, term4363.getClass(), "projectRoles", null);
        setField(term4363, term4363.getClass(), "createdDate", null);
        setField(term4363, term4363.getClass(), "lastModifiedDate", null);
        setIntField(term4363, term4363.getClass(), "id", 0);
        setField(term4363, term4363.getClass(), "firstName", null);
        setField(term4363, term4363.getClass(), "middleName", null);
        setField(term4363, term4363.getClass(), "lastName", null);
        setField(term4363, term4363.getClass(), "email", null);
        setBooleanField(term4363, term4363.getClass(), "isArchived", false);
        setField(term4363, term4363.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term4363, args);
    }

};


