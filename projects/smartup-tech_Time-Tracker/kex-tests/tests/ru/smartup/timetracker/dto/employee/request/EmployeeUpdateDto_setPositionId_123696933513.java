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

public class EmployeeUpdateDto_setPositionId_123696933513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9199;
     Object term9271;

    public EmployeeUpdateDto_setPositionId_123696933513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9324 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term9323 = ((Class) term9324).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term9323).setAccessible(true);
        Object enum21 =  ((Field) term9323).get((Object) null);
        Class<? extends Object> term9706 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term9705 = ((Class) term9706).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term9705).setAccessible(true);
        Object enum22 =  ((Field) term9705).get((Object) null);
        ArrayList term9261 = new ArrayList();
        ((ArrayList) term9261).add(enum21);
        ((ArrayList) term9261).add(enum22);
        ((ArrayList) term9261).add(enum21);
        ((ArrayList) term9261).add(enum21);
        ((ArrayList) term9261).add(enum21);
        ((ArrayList) term9261).add(enum22);
        term9199 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term9199, term9199.getClass(), "firstName", "uWHnvSvaPl");
        setField(term9199, term9199.getClass(), "middleName", "kBdSllIBVz");
        setField(term9199, term9199.getClass(), "lastName", "TJmVBGfTML");
        setField(term9199, term9199.getClass(), "email", "tPlsykYBqO");
        setField(term9199, term9199.getClass(), "password", "bLPjGVBhlX");
        setIntField(term9199, term9199.getClass(), "positionId", 1134449235);
        setField(term9199, term9199.getClass(), "roles", term9261);
        term9271 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9271;
        callMethod(klass, "setPositionId", argTypes, term9199, args);
    }

};


