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

public class Employee_setCreatedDate_12815344222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30611;
     Object term30704;

    public Employee_setCreatedDate_12815344222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30682 = new HashMap();
        Set<Object> term30757 =  ((Map) term30682).keySet();
        HashSet term30681 = new HashSet((Collection<? extends Object>) term30757);
        Class<? extends Object> term30759 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term30758 = ((Class) term30759).getDeclaredField((String) "EMPLOYEE");
        ((Field) term30758).setAccessible(true);
        Object enum71 = ((Field) term30758).get((Object) null);
        Float term30702 = new Float(0.7467328F);
        term30611 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term30675 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30678 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30687 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term30611, term30611.getClass(), "id", -1731761810);
        setField(term30611, term30611.getClass(), "firstName", "pXOkjyeIRb");
        setField(term30611, term30611.getClass(), "middleName", "GgZWSjxjyE");
        setField(term30611, term30611.getClass(), "lastName", "EeBVbzjcCI");
        setField(term30611, term30611.getClass(), "email", "UfQtPRyWRC");
        setField(term30611, term30611.getClass(), "passwordHash", "FPvxVzzSvD");
        setIntField(term30611, term30611.getClass(), "positionId", 197109649);
        setBooleanField(term30611, term30611.getClass(), "isArchived", false);
        setIntField(term30675, term30675.getClass(), "nanos", 539000000);
        setLongField(term30675, term30675.getClass(), "fastTime", 1491170940000L);
        setField(term30675, term30675.getClass(), "cdate", null);
        setField(term30611, term30611.getClass(), "createdDate", term30675);
        setIntField(term30678, term30678.getClass(), "nanos", 310000000);
        setLongField(term30678, term30678.getClass(), "fastTime", 1461986081000L);
        setField(term30678, term30678.getClass(), "cdate", null);
        setField(term30611, term30611.getClass(), "lastModifiedDate", term30678);
        setField(term30611, term30611.getClass(), "employeeRoles", term30681);
        setIntField(term30687, term30687.getClass(), "employeeId", -1239406390);
        setIntField(term30687, term30687.getClass(), "projectId", 1557431527);
        setField(term30687, term30687.getClass(), "projectRoleId", enum71);
        setField(term30687, term30687.getClass(), "externalRate", term30702);
        setField(term30611, term30611.getClass(), "employeeProjectRole", term30687);
        term30704 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term30704, term30704.getClass(), "nanos", 805000000);
        setLongField(term30704, term30704.getClass(), "fastTime", 1818957725000L);
        setField(term30704, term30704.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term30704;
        callMethod(klass, "setCreatedDate", argTypes, term30611, args);
    }

};


