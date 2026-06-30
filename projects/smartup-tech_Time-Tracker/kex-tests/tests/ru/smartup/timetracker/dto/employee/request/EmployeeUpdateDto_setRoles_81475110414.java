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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class EmployeeUpdateDto_setRoles_81475110414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10057;
     Object term10126;

    public EmployeeUpdateDto_setRoles_81475110414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10180 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term10179 = ((Class) term10180).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term10179).setAccessible(true);
        Object enum23 =  ((Field) term10179).get((Object) null);
        ArrayList term10119 = new ArrayList();
        ((ArrayList) term10119).add(enum23);
        term10057 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term10057, term10057.getClass(), "firstName", "whBvTVIIlC");
        setField(term10057, term10057.getClass(), "middleName", "IgRJUzaCwW");
        setField(term10057, term10057.getClass(), "lastName", "JUmudUmaaV");
        setField(term10057, term10057.getClass(), "email", "KoyGrUJeJW");
        setField(term10057, term10057.getClass(), "password", "HqBOwkVqjD");
        setIntField(term10057, term10057.getClass(), "positionId", 1585847225);
        setField(term10057, term10057.getClass(), "roles", term10119);
        term10126 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10126;
        callMethod(klass, "setRoles", argTypes, term10057, args);
    }

};


