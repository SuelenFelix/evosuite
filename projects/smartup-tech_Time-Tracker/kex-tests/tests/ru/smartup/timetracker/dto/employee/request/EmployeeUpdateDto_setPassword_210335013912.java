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

public class EmployeeUpdateDto_setPassword_210335013912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8676;

    public EmployeeUpdateDto_setPassword_210335013912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8808 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term8807 = ((Class) term8808).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term8807).setAccessible(true);
        Object enum20 =  ((Field) term8807).get((Object) null);
        ArrayList term8738 = new ArrayList();
        ((ArrayList) term8738).add(enum20);
        term8676 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term8676, term8676.getClass(), "firstName", "nHXjMycHlU");
        setField(term8676, term8676.getClass(), "middleName", "ieCtQFdkii");
        setField(term8676, term8676.getClass(), "lastName", "dEnhdmILtU");
        setField(term8676, term8676.getClass(), "email", "hoicvmsovO");
        setField(term8676, term8676.getClass(), "password", "eqJfYWRaEL");
        setIntField(term8676, term8676.getClass(), "positionId", -522618178);
        setField(term8676, term8676.getClass(), "roles", term8738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setPassword", argTypes, term8676, args);
    }

};


