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
import java.lang.Integer;

public class EmployeeShortDto_setId_198091917727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2637;
     Object term2640;

    public EmployeeShortDto_setId_198091917727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2637 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        setIntField(term2637, term2637.getClass(), "id", 0);
        setField(term2637, term2637.getClass(), "firstName", null);
        setField(term2637, term2637.getClass(), "middleName", null);
        setField(term2637, term2637.getClass(), "lastName", null);
        setField(term2637, term2637.getClass(), "email", null);
        setBooleanField(term2637, term2637.getClass(), "isArchived", false);
        setField(term2637, term2637.getClass(), "roles", null);
        term2640 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2640;
        callMethod(klass, "setId", argTypes, term2637, args);
    }

};


