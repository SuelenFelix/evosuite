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

public class EmployeeUpdateDto_canEqual_193881468816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11752;
     Object term11824;

    public EmployeeUpdateDto_canEqual_193881468816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11876 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term11875 = ((Class) term11876).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term11875).setAccessible(true);
        Object enum27 =  ((Field) term11875).get((Object) null);
        Class<? extends Object> term12258 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term12257 = ((Class) term12258).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term12257).setAccessible(true);
        Object enum28 =  ((Field) term12257).get((Object) null);
        ArrayList term11814 = new ArrayList();
        ((ArrayList) term11814).add(enum27);
        ((ArrayList) term11814).add(enum28);
        term11752 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term11752, term11752.getClass(), "firstName", "idgaQsnJpQ");
        setField(term11752, term11752.getClass(), "middleName", "VgZnGoIFwQ");
        setField(term11752, term11752.getClass(), "lastName", "jUbSRrkrYZ");
        setField(term11752, term11752.getClass(), "email", "bWWfajKbEX");
        setField(term11752, term11752.getClass(), "password", "cAPeiZHKGJ");
        setIntField(term11752, term11752.getClass(), "positionId", -1685132342);
        setField(term11752, term11752.getClass(), "roles", term11814);
        term11824 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11824;
        callMethod(klass, "canEqual", argTypes, term11752, args);
    }

};


