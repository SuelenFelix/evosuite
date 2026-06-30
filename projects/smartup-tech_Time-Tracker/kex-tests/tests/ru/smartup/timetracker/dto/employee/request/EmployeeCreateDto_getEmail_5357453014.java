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
import java.util.ArrayList;

public class EmployeeCreateDto_getEmail_5357453014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16551;

    public EmployeeCreateDto_getEmail_5357453014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16613 = new ArrayList();
        term16551 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term16551, term16551.getClass(), "firstName", "eVpkWxjuki");
        setField(term16551, term16551.getClass(), "middleName", "SJiQaLvSKv");
        setField(term16551, term16551.getClass(), "lastName", "OEXDRUKcFl");
        setField(term16551, term16551.getClass(), "email", "RYdKCNNMBR");
        setField(term16551, term16551.getClass(), "password", "yGtHPyvYiQ");
        setIntField(term16551, term16551.getClass(), "positionId", -2068769794);
        setField(term16551, term16551.getClass(), "roles", term16613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term16551, args);
    }

};


