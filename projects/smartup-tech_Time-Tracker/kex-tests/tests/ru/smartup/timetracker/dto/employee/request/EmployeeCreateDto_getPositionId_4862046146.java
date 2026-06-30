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

public class EmployeeCreateDto_getPositionId_4862046146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17138;

    public EmployeeCreateDto_getPositionId_4862046146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17258 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term17257 = ((Class) term17258).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term17257).setAccessible(true);
        Object enum39 =  ((Field) term17257).get((Object) null);
        ArrayList term17200 = new ArrayList();
        ((ArrayList) term17200).add(enum39);
        ((ArrayList) term17200).add(enum39);
        term17138 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term17138, term17138.getClass(), "firstName", "dpNsDgfPso");
        setField(term17138, term17138.getClass(), "middleName", "hCWPJQKpdc");
        setField(term17138, term17138.getClass(), "lastName", "WzMEhMXkKx");
        setField(term17138, term17138.getClass(), "email", "XOiDvlDhdc");
        setField(term17138, term17138.getClass(), "password", "AdxvLJhNLe");
        setIntField(term17138, term17138.getClass(), "positionId", -1007160944);
        setField(term17138, term17138.getClass(), "roles", term17200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPositionId", argTypes, term17138, args);
    }

};


