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

public class EmployeeShortDto_getFirstName_3702822402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public EmployeeShortDto_getFirstName_3702822402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term145 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term146 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term94, term94.getClass(), "id", 1162663216);
        setField(term94, term94.getClass(), "firstName", "jJCZpVmanW");
        setField(term94, term94.getClass(), "middleName", "EGtDIRbSSb");
        setField(term94, term94.getClass(), "lastName", "SzjVpOQTyS");
        setField(term94, term94.getClass(), "email", "MjGYSRKTNF");
        setBooleanField(term94, term94.getClass(), "isArchived", false);
        setField(term145, term145.getClass(), "elements", term146);
        setField(term94, term94.getClass(), "roles", term145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term94, args);
    }

};


