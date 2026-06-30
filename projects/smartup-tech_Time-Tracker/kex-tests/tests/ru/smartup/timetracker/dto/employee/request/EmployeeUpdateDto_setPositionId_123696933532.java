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
import java.lang.Integer;

public class EmployeeUpdateDto_setPositionId_123696933532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14739;
     Object term14741;

    public EmployeeUpdateDto_setPositionId_123696933532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14739 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term14739, term14739.getClass(), "firstName", null);
        setField(term14739, term14739.getClass(), "middleName", null);
        setField(term14739, term14739.getClass(), "lastName", null);
        setField(term14739, term14739.getClass(), "email", null);
        setField(term14739, term14739.getClass(), "password", null);
        setIntField(term14739, term14739.getClass(), "positionId", 0);
        setField(term14739, term14739.getClass(), "roles", null);
        term14741 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14741;
        callMethod(klass, "setPositionId", argTypes, term14739, args);
    }

};


