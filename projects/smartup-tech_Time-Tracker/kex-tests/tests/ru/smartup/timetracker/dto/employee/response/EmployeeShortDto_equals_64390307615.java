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
import java.lang.Object;

public class EmployeeShortDto_equals_64390307615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242;
     Object term2295;

    public EmployeeShortDto_equals_64390307615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2242 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term2293 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2294 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2242, term2242.getClass(), "id", 597278769);
        setField(term2242, term2242.getClass(), "firstName", "ieCtQFdkii");
        setField(term2242, term2242.getClass(), "middleName", "dEnhdmILtU");
        setField(term2242, term2242.getClass(), "lastName", "hoicvmsovO");
        setField(term2242, term2242.getClass(), "email", "eqJfYWRaEL");
        setBooleanField(term2242, term2242.getClass(), "isArchived", false);
        setField(term2293, term2293.getClass(), "elements", term2294);
        setField(term2242, term2242.getClass(), "roles", term2293);
        term2295 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2295;
        callMethod(klass, "equals", argTypes, term2242, args);
    }

};


