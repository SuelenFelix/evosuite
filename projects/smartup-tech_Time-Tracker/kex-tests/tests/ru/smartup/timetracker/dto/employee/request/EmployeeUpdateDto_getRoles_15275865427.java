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

public class EmployeeUpdateDto_getRoles_15275865427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445;

    public EmployeeUpdateDto_getRoles_15275865427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5565 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term5564 = ((Class) term5565).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term5564).setAccessible(true);
        Object enum13 =  ((Field) term5564).get((Object) null);
        ArrayList term5507 = new ArrayList();
        ((ArrayList) term5507).add(enum13);
        term5445 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term5445, term5445.getClass(), "firstName", "OWDIEULEFu");
        setField(term5445, term5445.getClass(), "middleName", "dWRymuLBtr");
        setField(term5445, term5445.getClass(), "lastName", "AijpHYOFuy");
        setField(term5445, term5445.getClass(), "email", "SbAoxhfrkn");
        setField(term5445, term5445.getClass(), "password", "kuTXqwMtDB");
        setIntField(term5445, term5445.getClass(), "positionId", -1955890973);
        setField(term5445, term5445.getClass(), "roles", term5507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term5445, args);
    }

};


