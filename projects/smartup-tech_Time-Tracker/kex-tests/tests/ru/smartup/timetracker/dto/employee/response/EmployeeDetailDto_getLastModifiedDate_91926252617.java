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

public class EmployeeDetailDto_getLastModifiedDate_91926252617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4348;

    public EmployeeDetailDto_getLastModifiedDate_91926252617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4348 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        setField(term4348, term4348.getClass(), "position", null);
        setField(term4348, term4348.getClass(), "projectRoles", null);
        setField(term4348, term4348.getClass(), "createdDate", null);
        setField(term4348, term4348.getClass(), "lastModifiedDate", null);
        setIntField(term4348, term4348.getClass(), "id", 0);
        setField(term4348, term4348.getClass(), "firstName", null);
        setField(term4348, term4348.getClass(), "middleName", null);
        setField(term4348, term4348.getClass(), "lastName", null);
        setField(term4348, term4348.getClass(), "email", null);
        setBooleanField(term4348, term4348.getClass(), "isArchived", false);
        setField(term4348, term4348.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term4348, args);
    }

};


