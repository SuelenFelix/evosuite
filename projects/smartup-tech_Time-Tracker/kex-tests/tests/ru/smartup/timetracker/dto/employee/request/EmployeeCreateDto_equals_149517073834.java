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

public class EmployeeCreateDto_equals_149517073834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29441;

    public EmployeeCreateDto_equals_149517073834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29441 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term29441, term29441.getClass(), "firstName", null);
        setField(term29441, term29441.getClass(), "middleName", null);
        setField(term29441, term29441.getClass(), "lastName", null);
        setField(term29441, term29441.getClass(), "email", null);
        setField(term29441, term29441.getClass(), "password", null);
        setIntField(term29441, term29441.getClass(), "positionId", 0);
        setField(term29441, term29441.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term29441, args);
    }

};


