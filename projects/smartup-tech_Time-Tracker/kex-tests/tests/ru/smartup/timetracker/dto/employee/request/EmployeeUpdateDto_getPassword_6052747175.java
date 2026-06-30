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

public class EmployeeUpdateDto_getPassword_6052747175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4503;

    public EmployeeUpdateDto_getPassword_6052747175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4626 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term4625 = ((Class) term4626).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term4625).setAccessible(true);
        Object enum11 =  ((Field) term4625).get((Object) null);
        Class<? extends Object> term4978 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term4977 = ((Class) term4978).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term4977).setAccessible(true);
        Object enum12 =  ((Field) term4977).get((Object) null);
        ArrayList term4565 = new ArrayList();
        ((ArrayList) term4565).add(enum11);
        ((ArrayList) term4565).add(enum12);
        ((ArrayList) term4565).add(enum12);
        term4503 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term4503, term4503.getClass(), "firstName", "hNxWaHcfhY");
        setField(term4503, term4503.getClass(), "middleName", "RkybSrpybU");
        setField(term4503, term4503.getClass(), "lastName", "xOEqzGAmDU");
        setField(term4503, term4503.getClass(), "email", "eZFUvlxvGV");
        setField(term4503, term4503.getClass(), "password", "BYqFIqCKAV");
        setIntField(term4503, term4503.getClass(), "positionId", -1922583790);
        setField(term4503, term4503.getClass(), "roles", term4565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term4503, args);
    }

};


