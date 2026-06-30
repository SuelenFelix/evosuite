package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class EmployeeInProjectDto_equals_89798682313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9344;
     Object term9396;

    public EmployeeInProjectDto_equals_89798682313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9428 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9427 = ((Class) term9428).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9427).setAccessible(true);
        Object enum22 = ((Field) term9427).get((Object) null);
        Float term9394 = new Float(0.97262454F);
        term9344 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term9344, term9344.getClass(), "id", -1530420153);
        setField(term9344, term9344.getClass(), "firstName", "eqJfYWRaEL");
        setField(term9344, term9344.getClass(), "middleName", "fhkbdRViHi");
        setField(term9344, term9344.getClass(), "lastName", "uWHnvSvaPl");
        setField(term9344, term9344.getClass(), "projectRoleId", enum22);
        setField(term9344, term9344.getClass(), "externalRate", term9394);
        term9396 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9396;
        callMethod(klass, "equals", argTypes, term9344, args);
    }

};


