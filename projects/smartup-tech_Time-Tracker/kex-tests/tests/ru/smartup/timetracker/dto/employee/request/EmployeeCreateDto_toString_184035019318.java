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

public class EmployeeCreateDto_toString_184035019318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28931;

    public EmployeeCreateDto_toString_184035019318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29051 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term29050 = ((Class) term29051).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term29050).setAccessible(true);
        Object enum67 =  ((Field) term29050).get((Object) null);
        ArrayList term28993 = new ArrayList();
        ((ArrayList) term28993).add(enum67);
        ((ArrayList) term28993).add(enum67);
        term28931 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term28931, term28931.getClass(), "firstName", "YpJbIgJWWv");
        setField(term28931, term28931.getClass(), "middleName", "JppkknKVOw");
        setField(term28931, term28931.getClass(), "lastName", "iljANwuEjk");
        setField(term28931, term28931.getClass(), "email", "kNqaJKIATy");
        setField(term28931, term28931.getClass(), "password", "vKQukfbJUd");
        setIntField(term28931, term28931.getClass(), "positionId", -469968304);
        setField(term28931, term28931.getClass(), "roles", term28993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28931, args);
    }

};


