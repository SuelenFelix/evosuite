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

public class EmployeeCreateDto_equals_149517073815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25290;
     Object term25365;

    public EmployeeCreateDto_equals_149517073815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25417 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term25416 = ((Class) term25417).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term25416).setAccessible(true);
        Object enum58 =  ((Field) term25416).get((Object) null);
        Class<? extends Object> term25778 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term25777 = ((Class) term25778).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term25777).setAccessible(true);
        Object enum59 =  ((Field) term25777).get((Object) null);
        Class<? extends Object> term26130 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term26129 = ((Class) term26130).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term26129).setAccessible(true);
        Object enum60 =  ((Field) term26129).get((Object) null);
        ArrayList term25352 = new ArrayList();
        ((ArrayList) term25352).add(enum58);
        ((ArrayList) term25352).add(enum58);
        ((ArrayList) term25352).add(enum59);
        ((ArrayList) term25352).add(enum60);
        ((ArrayList) term25352).add(enum59);
        ((ArrayList) term25352).add(enum59);
        ((ArrayList) term25352).add(enum58);
        ((ArrayList) term25352).add(enum58);
        ((ArrayList) term25352).add(enum59);
        term25290 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term25290, term25290.getClass(), "firstName", "sQvGcVjdEx");
        setField(term25290, term25290.getClass(), "middleName", "rLHAoqXgPh");
        setField(term25290, term25290.getClass(), "lastName", "zUlRdimJtU");
        setField(term25290, term25290.getClass(), "email", "vwbEQQNQrx");
        setField(term25290, term25290.getClass(), "password", "xtftXXMbem");
        setIntField(term25290, term25290.getClass(), "positionId", 1193880199);
        setField(term25290, term25290.getClass(), "roles", term25352);
        term25365 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25365;
        callMethod(klass, "equals", argTypes, term25290, args);
    }

};


