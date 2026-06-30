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

public class EmployeeCreateDto_setLastName_3978743610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21322;

    public EmployeeCreateDto_setLastName_3978743610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21457 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term21456 = ((Class) term21457).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term21456).setAccessible(true);
        Object enum49 =  ((Field) term21456).get((Object) null);
        Class<? extends Object> term21809 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term21808 = ((Class) term21809).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term21808).setAccessible(true);
        Object enum50 =  ((Field) term21808).get((Object) null);
        ArrayList term21384 = new ArrayList();
        ((ArrayList) term21384).add(enum49);
        ((ArrayList) term21384).add(enum50);
        term21322 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term21322, term21322.getClass(), "firstName", "mvrkADEgpp");
        setField(term21322, term21322.getClass(), "middleName", "pXOkjyeIRb");
        setField(term21322, term21322.getClass(), "lastName", "GgZWSjxjyE");
        setField(term21322, term21322.getClass(), "email", "EeBVbzjcCI");
        setField(term21322, term21322.getClass(), "password", "UfQtPRyWRC");
        setIntField(term21322, term21322.getClass(), "positionId", -1275173084);
        setField(term21322, term21322.getClass(), "roles", term21384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        callMethod(klass, "setLastName", argTypes, term21322, args);
    }

};


