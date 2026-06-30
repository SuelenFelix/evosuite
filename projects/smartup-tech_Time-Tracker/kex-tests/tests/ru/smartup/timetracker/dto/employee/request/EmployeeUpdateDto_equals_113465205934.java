package ru.smartup.timetracker.dto.employee.request;

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
import static ru.smartup.timetracker.dto.employee.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeUpdateDto_equals_113465205934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14745;

    public EmployeeUpdateDto_equals_113465205934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14745 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term14745, term14745.getClass(), "firstName", null);
        setField(term14745, term14745.getClass(), "middleName", null);
        setField(term14745, term14745.getClass(), "lastName", null);
        setField(term14745, term14745.getClass(), "email", null);
        setField(term14745, term14745.getClass(), "password", null);
        setIntField(term14745, term14745.getClass(), "positionId", 0);
        setField(term14745, term14745.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term14745, args);
    }

};


