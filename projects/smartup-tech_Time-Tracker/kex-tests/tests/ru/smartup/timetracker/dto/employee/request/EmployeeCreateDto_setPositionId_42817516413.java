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
import java.lang.Integer;

public class EmployeeCreateDto_setPositionId_42817516413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23186;
     Object term23258;

    public EmployeeCreateDto_setPositionId_42817516413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23311 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term23310 = ((Class) term23311).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term23310).setAccessible(true);
        Object enum53 =  ((Field) term23310).get((Object) null);
        Class<? extends Object> term23672 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term23671 = ((Class) term23672).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term23671).setAccessible(true);
        Object enum54 =  ((Field) term23671).get((Object) null);
        ArrayList term23248 = new ArrayList();
        ((ArrayList) term23248).add(enum53);
        ((ArrayList) term23248).add(enum54);
        term23186 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term23186, term23186.getClass(), "firstName", "VeDtgDzGAN");
        setField(term23186, term23186.getClass(), "middleName", "aWYOWZFyaX");
        setField(term23186, term23186.getClass(), "lastName", "BRIVNtfUWU");
        setField(term23186, term23186.getClass(), "email", "DbiCVtPPCT");
        setField(term23186, term23186.getClass(), "password", "WzFopsaDuG");
        setIntField(term23186, term23186.getClass(), "positionId", -1179120542);
        setField(term23186, term23186.getClass(), "roles", term23248);
        term23258 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23258;
        callMethod(klass, "setPositionId", argTypes, term23186, args);
    }

};


