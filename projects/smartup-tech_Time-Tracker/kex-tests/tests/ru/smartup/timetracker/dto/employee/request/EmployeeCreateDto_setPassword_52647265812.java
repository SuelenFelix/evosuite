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

public class EmployeeCreateDto_setPassword_52647265812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22308;

    public EmployeeCreateDto_setPassword_52647265812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22443 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term22442 = ((Class) term22443).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term22442).setAccessible(true);
        Object enum51 =  ((Field) term22442).get((Object) null);
        Class<? extends Object> term22825 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term22824 = ((Class) term22825).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term22824).setAccessible(true);
        Object enum52 =  ((Field) term22824).get((Object) null);
        ArrayList term22370 = new ArrayList();
        ((ArrayList) term22370).add(enum51);
        ((ArrayList) term22370).add(enum52);
        term22308 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term22308, term22308.getClass(), "firstName", "XkIoWJRNwN");
        setField(term22308, term22308.getClass(), "middleName", "aNWLJdrZMq");
        setField(term22308, term22308.getClass(), "lastName", "HHmNoYxIGj");
        setField(term22308, term22308.getClass(), "email", "PtirvZmsGt");
        setField(term22308, term22308.getClass(), "password", "HWkpTmtlrc");
        setIntField(term22308, term22308.getClass(), "positionId", -203030934);
        setField(term22308, term22308.getClass(), "roles", term22370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        callMethod(klass, "setPassword", argTypes, term22308, args);
    }

};


