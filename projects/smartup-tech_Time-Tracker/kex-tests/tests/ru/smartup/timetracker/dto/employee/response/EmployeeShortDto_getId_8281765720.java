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

public class EmployeeShortDto_getId_8281765720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2616;

    public EmployeeShortDto_getId_8281765720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2616 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        setIntField(term2616, term2616.getClass(), "id", 0);
        setField(term2616, term2616.getClass(), "firstName", null);
        setField(term2616, term2616.getClass(), "middleName", null);
        setField(term2616, term2616.getClass(), "lastName", null);
        setField(term2616, term2616.getClass(), "email", null);
        setBooleanField(term2616, term2616.getClass(), "isArchived", false);
        setField(term2616, term2616.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2616, args);
    }

};


