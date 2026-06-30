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

public class Employee_getPasswordHash_12359859167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23236;

    public Employee_getPasswordHash_12359859167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23307 = new HashMap();
        Set<Object> term23379 =  ((Map) term23307).keySet();
        HashSet term23306 = new HashSet((Collection<? extends Object>) term23379);
        Class<? extends Object> term23381 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term23380 = ((Class) term23381).getDeclaredField((String) "EMPLOYEE");
        ((Field) term23380).setAccessible(true);
        Object enum56 = ((Field) term23380).get((Object) null);
        Float term23327 = new Float(0.8474802F);
        term23236 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term23300 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term23303 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term23312 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term23236, term23236.getClass(), "id", 691577392);
        setField(term23236, term23236.getClass(), "firstName", "eqJfYWRaEL");
        setField(term23236, term23236.getClass(), "middleName", "fhkbdRViHi");
        setField(term23236, term23236.getClass(), "lastName", "uWHnvSvaPl");
        setField(term23236, term23236.getClass(), "email", "kBdSllIBVz");
        setField(term23236, term23236.getClass(), "passwordHash", "TJmVBGfTML");
        setIntField(term23236, term23236.getClass(), "positionId", -893623680);
        setBooleanField(term23236, term23236.getClass(), "isArchived", false);
        setIntField(term23300, term23300.getClass(), "nanos", 289000000);
        setLongField(term23300, term23300.getClass(), "fastTime", 1465997919000L);
        setField(term23300, term23300.getClass(), "cdate", null);
        setField(term23236, term23236.getClass(), "createdDate", term23300);
        setIntField(term23303, term23303.getClass(), "nanos", 65000000);
        setLongField(term23303, term23303.getClass(), "fastTime", 1535827649000L);
        setField(term23303, term23303.getClass(), "cdate", null);
        setField(term23236, term23236.getClass(), "lastModifiedDate", term23303);
        setField(term23236, term23236.getClass(), "employeeRoles", term23306);
        setIntField(term23312, term23312.getClass(), "employeeId", -1963434938);
        setIntField(term23312, term23312.getClass(), "projectId", 906181092);
        setField(term23312, term23312.getClass(), "projectRoleId", enum56);
        setField(term23312, term23312.getClass(), "externalRate", term23327);
        setField(term23236, term23236.getClass(), "employeeProjectRole", term23312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordHash", argTypes, term23236, args);
    }

};


