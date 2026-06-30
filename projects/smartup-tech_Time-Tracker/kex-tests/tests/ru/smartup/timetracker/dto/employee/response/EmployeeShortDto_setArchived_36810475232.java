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
import java.lang.Boolean;

public class EmployeeShortDto_setArchived_36810475232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2654;
     Object term2657;

    public EmployeeShortDto_setArchived_36810475232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2654 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        setIntField(term2654, term2654.getClass(), "id", 0);
        setField(term2654, term2654.getClass(), "firstName", null);
        setField(term2654, term2654.getClass(), "middleName", null);
        setField(term2654, term2654.getClass(), "lastName", null);
        setField(term2654, term2654.getClass(), "email", null);
        setBooleanField(term2654, term2654.getClass(), "isArchived", false);
        setField(term2654, term2654.getClass(), "roles", null);
        term2657 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2657;
        callMethod(klass, "setArchived", argTypes, term2654, args);
    }

};


