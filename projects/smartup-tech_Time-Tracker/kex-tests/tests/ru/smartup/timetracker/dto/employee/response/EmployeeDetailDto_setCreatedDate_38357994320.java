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

public class EmployeeDetailDto_setCreatedDate_38357994320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4357;

    public EmployeeDetailDto_setCreatedDate_38357994320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4357 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        setField(term4357, term4357.getClass(), "position", null);
        setField(term4357, term4357.getClass(), "projectRoles", null);
        setField(term4357, term4357.getClass(), "createdDate", null);
        setField(term4357, term4357.getClass(), "lastModifiedDate", null);
        setIntField(term4357, term4357.getClass(), "id", 0);
        setField(term4357, term4357.getClass(), "firstName", null);
        setField(term4357, term4357.getClass(), "middleName", null);
        setField(term4357, term4357.getClass(), "lastName", null);
        setField(term4357, term4357.getClass(), "email", null);
        setBooleanField(term4357, term4357.getClass(), "isArchived", false);
        setField(term4357, term4357.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedDate", argTypes, term4357, args);
    }

};


