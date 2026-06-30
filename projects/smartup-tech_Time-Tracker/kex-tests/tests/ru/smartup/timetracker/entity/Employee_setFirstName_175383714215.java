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

public class Employee_setFirstName_175383714215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27106;

    public Employee_setFirstName_175383714215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27177 = new HashMap();
        Set<Object> term27261 =  ((Map) term27177).keySet();
        HashSet term27176 = new HashSet((Collection<? extends Object>) term27261);
        Class<? extends Object> term27263 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term27262 = ((Class) term27263).getDeclaredField((String) "EMPLOYEE");
        ((Field) term27262).setAccessible(true);
        Object enum64 = ((Field) term27262).get((Object) null);
        Float term27197 = new Float(0.7031006F);
        term27106 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term27170 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term27173 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term27182 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term27106, term27106.getClass(), "id", 158873461);
        setField(term27106, term27106.getClass(), "firstName", "vjxIhXHxGR");
        setField(term27106, term27106.getClass(), "middleName", "QXzGXbEXMu");
        setField(term27106, term27106.getClass(), "lastName", "qxSDVejjiY");
        setField(term27106, term27106.getClass(), "email", "xBsXSDjXYK");
        setField(term27106, term27106.getClass(), "passwordHash", "sEnIVFtZuQ");
        setIntField(term27106, term27106.getClass(), "positionId", -430151637);
        setBooleanField(term27106, term27106.getClass(), "isArchived", true);
        setIntField(term27170, term27170.getClass(), "nanos", 999000000);
        setLongField(term27170, term27170.getClass(), "fastTime", 1689418010000L);
        setField(term27170, term27170.getClass(), "cdate", null);
        setField(term27106, term27106.getClass(), "createdDate", term27170);
        setIntField(term27173, term27173.getClass(), "nanos", 79000000);
        setLongField(term27173, term27173.getClass(), "fastTime", 1570703521000L);
        setField(term27173, term27173.getClass(), "cdate", null);
        setField(term27106, term27106.getClass(), "lastModifiedDate", term27173);
        setField(term27106, term27106.getClass(), "employeeRoles", term27176);
        setIntField(term27182, term27182.getClass(), "employeeId", -1697741339);
        setIntField(term27182, term27182.getClass(), "projectId", 98922530);
        setField(term27182, term27182.getClass(), "projectRoleId", enum64);
        setField(term27182, term27182.getClass(), "externalRate", term27197);
        setField(term27106, term27106.getClass(), "employeeProjectRole", term27182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setFirstName", argTypes, term27106, args);
    }

};


