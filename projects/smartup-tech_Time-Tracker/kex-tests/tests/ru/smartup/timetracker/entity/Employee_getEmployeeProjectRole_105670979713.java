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

public class Employee_getEmployeeProjectRole_105670979713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26142;

    public Employee_getEmployeeProjectRole_105670979713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26213 = new HashMap();
        Set<Object> term26284 =  ((Map) term26213).keySet();
        HashSet term26212 = new HashSet((Collection<? extends Object>) term26284);
        Class<? extends Object> term26286 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term26285 = ((Class) term26286).getDeclaredField((String) "MANAGER");
        ((Field) term26285).setAccessible(true);
        Object enum62 = ((Field) term26285).get((Object) null);
        Float term26232 = new Float(0.13745493F);
        term26142 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term26206 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term26209 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term26218 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term26142, term26142.getClass(), "id", -2063457669);
        setField(term26142, term26142.getClass(), "firstName", "JqXGgAhZPl");
        setField(term26142, term26142.getClass(), "middleName", "jiKYgYHqIS");
        setField(term26142, term26142.getClass(), "lastName", "DfISiziTgG");
        setField(term26142, term26142.getClass(), "email", "XqgfKFvPSD");
        setField(term26142, term26142.getClass(), "passwordHash", "JiVRgTZvKc");
        setIntField(term26142, term26142.getClass(), "positionId", -1222006000);
        setBooleanField(term26142, term26142.getClass(), "isArchived", false);
        setIntField(term26206, term26206.getClass(), "nanos", 294000000);
        setLongField(term26206, term26206.getClass(), "fastTime", 1263733356000L);
        setField(term26206, term26206.getClass(), "cdate", null);
        setField(term26142, term26142.getClass(), "createdDate", term26206);
        setIntField(term26209, term26209.getClass(), "nanos", 70000000);
        setLongField(term26209, term26209.getClass(), "fastTime", 1490945490000L);
        setField(term26209, term26209.getClass(), "cdate", null);
        setField(term26142, term26142.getClass(), "lastModifiedDate", term26209);
        setField(term26142, term26142.getClass(), "employeeRoles", term26212);
        setIntField(term26218, term26218.getClass(), "employeeId", 2095798786);
        setIntField(term26218, term26218.getClass(), "projectId", -1565502840);
        setField(term26218, term26218.getClass(), "projectRoleId", enum62);
        setField(term26218, term26218.getClass(), "externalRate", term26232);
        setField(term26142, term26142.getClass(), "employeeProjectRole", term26218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeProjectRole", argTypes, term26142, args);
    }

};


