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

public class EmployeeCreateDto_setMiddleName_8780401328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29427;

    public EmployeeCreateDto_setMiddleName_8780401328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29427 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term29427, term29427.getClass(), "firstName", null);
        setField(term29427, term29427.getClass(), "middleName", null);
        setField(term29427, term29427.getClass(), "lastName", null);
        setField(term29427, term29427.getClass(), "email", null);
        setField(term29427, term29427.getClass(), "password", null);
        setIntField(term29427, term29427.getClass(), "positionId", 0);
        setField(term29427, term29427.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMiddleName", argTypes, term29427, args);
    }

};


