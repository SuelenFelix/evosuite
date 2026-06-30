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

public class EmployeeUpdateDto_equals_113465205915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10540;
     Object term10615;

    public EmployeeUpdateDto_equals_113465205915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10667 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term10666 = ((Class) term10667).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term10666).setAccessible(true);
        Object enum24 =  ((Field) term10666).get((Object) null);
        Class<? extends Object> term11049 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term11048 = ((Class) term11049).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term11048).setAccessible(true);
        Object enum25 =  ((Field) term11048).get((Object) null);
        Class<? extends Object> term11401 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term11400 = ((Class) term11401).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term11400).setAccessible(true);
        Object enum26 =  ((Field) term11400).get((Object) null);
        ArrayList term10602 = new ArrayList();
        ((ArrayList) term10602).add(enum24);
        ((ArrayList) term10602).add(enum25);
        ((ArrayList) term10602).add(enum26);
        term10540 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term10540, term10540.getClass(), "firstName", "MAcUBcBckh");
        setField(term10540, term10540.getClass(), "middleName", "oVgzLbrsFr");
        setField(term10540, term10540.getClass(), "lastName", "vQVyKLdtaz");
        setField(term10540, term10540.getClass(), "email", "OWKQODBLzb");
        setField(term10540, term10540.getClass(), "password", "wGmYcqUkgE");
        setIntField(term10540, term10540.getClass(), "positionId", 597278769);
        setField(term10540, term10540.getClass(), "roles", term10602);
        term10615 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10615;
        callMethod(klass, "equals", argTypes, term10540, args);
    }

};


