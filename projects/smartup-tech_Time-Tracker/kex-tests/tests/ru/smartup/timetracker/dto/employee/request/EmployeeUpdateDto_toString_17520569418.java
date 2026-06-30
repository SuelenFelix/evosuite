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

public class EmployeeUpdateDto_toString_17520569418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13829;

    public EmployeeUpdateDto_toString_17520569418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13952 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term13951 = ((Class) term13952).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term13951).setAccessible(true);
        Object enum32 =  ((Field) term13951).get((Object) null);
        Class<? extends Object> term14334 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term14333 = ((Class) term14334).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term14333).setAccessible(true);
        Object enum33 =  ((Field) term14333).get((Object) null);
        ArrayList term13891 = new ArrayList();
        ((ArrayList) term13891).add(enum32);
        ((ArrayList) term13891).add(enum32);
        ((ArrayList) term13891).add(enum32);
        ((ArrayList) term13891).add(enum33);
        ((ArrayList) term13891).add(enum32);
        ((ArrayList) term13891).add(enum33);
        ((ArrayList) term13891).add(enum32);
        term13829 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term13829, term13829.getClass(), "firstName", "swZVeJAxjt");
        setField(term13829, term13829.getClass(), "middleName", "xOcJIiQQDu");
        setField(term13829, term13829.getClass(), "lastName", "GVizqqzXpy");
        setField(term13829, term13829.getClass(), "email", "JqXGgAhZPl");
        setField(term13829, term13829.getClass(), "password", "jiKYgYHqIS");
        setIntField(term13829, term13829.getClass(), "positionId", 1622346318);
        setField(term13829, term13829.getClass(), "roles", term13891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13829, args);
    }

};


