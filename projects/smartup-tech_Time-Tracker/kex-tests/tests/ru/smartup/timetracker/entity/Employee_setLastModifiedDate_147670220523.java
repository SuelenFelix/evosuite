package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class Employee_setLastModifiedDate_147670220523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31099;
     Object term31192;

    public Employee_setLastModifiedDate_147670220523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31170 = new HashMap();
        Set<Object> term31245 =  ((Map) term31170).keySet();
        HashSet term31169 = new HashSet((Collection<? extends Object>) term31245);
        Class<? extends Object> term31247 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term31246 = ((Class) term31247).getDeclaredField((String) "EMPLOYEE");
        ((Field) term31246).setAccessible(true);
        Object enum72 = ((Field) term31246).get((Object) null);
        Float term31190 = new Float(0.6436713F);
        term31099 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term31163 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term31166 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term31175 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term31099, term31099.getClass(), "id", -1504890659);
        setField(term31099, term31099.getClass(), "firstName", "WHcwFgsGFC");
        setField(term31099, term31099.getClass(), "middleName", "HzqpegHiRq");
        setField(term31099, term31099.getClass(), "lastName", "jwsfVjMoJT");
        setField(term31099, term31099.getClass(), "email", "ZfdXfCCFDf");
        setField(term31099, term31099.getClass(), "passwordHash", "MwwjNtdOFT");
        setIntField(term31099, term31099.getClass(), "positionId", 1358829571);
        setBooleanField(term31099, term31099.getClass(), "isArchived", false);
        setIntField(term31163, term31163.getClass(), "nanos", 801000000);
        setLongField(term31163, term31163.getClass(), "fastTime", 1603894986000L);
        setField(term31163, term31163.getClass(), "cdate", null);
        setField(term31099, term31099.getClass(), "createdDate", term31163);
        setIntField(term31166, term31166.getClass(), "nanos", 611000000);
        setLongField(term31166, term31166.getClass(), "fastTime", 1369528467000L);
        setField(term31166, term31166.getClass(), "cdate", null);
        setField(term31099, term31099.getClass(), "lastModifiedDate", term31166);
        setField(term31099, term31099.getClass(), "employeeRoles", term31169);
        setIntField(term31175, term31175.getClass(), "employeeId", 991356662);
        setIntField(term31175, term31175.getClass(), "projectId", -506958186);
        setField(term31175, term31175.getClass(), "projectRoleId", enum72);
        setField(term31175, term31175.getClass(), "externalRate", term31190);
        setField(term31099, term31099.getClass(), "employeeProjectRole", term31175);
        term31192 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term31192, term31192.getClass(), "nanos", 351000000);
        setLongField(term31192, term31192.getClass(), "fastTime", 1510264279000L);
        setField(term31192, term31192.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term31192;
        callMethod(klass, "setLastModifiedDate", argTypes, term31099, args);
    }

};


