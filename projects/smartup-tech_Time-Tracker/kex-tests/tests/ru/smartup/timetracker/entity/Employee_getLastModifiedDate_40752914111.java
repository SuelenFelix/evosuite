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

public class Employee_getLastModifiedDate_40752914111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25176;

    public Employee_getLastModifiedDate_40752914111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25247 = new HashMap();
        Set<Object> term25319 =  ((Map) term25247).keySet();
        HashSet term25246 = new HashSet((Collection<? extends Object>) term25319);
        Class<? extends Object> term25321 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term25320 = ((Class) term25321).getDeclaredField((String) "EMPLOYEE");
        ((Field) term25320).setAccessible(true);
        Object enum60 = ((Field) term25320).get((Object) null);
        Float term25267 = new Float(0.76550204F);
        term25176 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term25240 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term25243 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term25252 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term25176, term25176.getClass(), "id", 538259104);
        setField(term25176, term25176.getClass(), "firstName", "bWWfajKbEX");
        setField(term25176, term25176.getClass(), "middleName", "cAPeiZHKGJ");
        setField(term25176, term25176.getClass(), "lastName", "LvJFtLBaxj");
        setField(term25176, term25176.getClass(), "email", "PHvxnGHptP");
        setField(term25176, term25176.getClass(), "passwordHash", "TimdotUuNC");
        setIntField(term25176, term25176.getClass(), "positionId", 96566506);
        setBooleanField(term25176, term25176.getClass(), "isArchived", false);
        setIntField(term25240, term25240.getClass(), "nanos", 768000000);
        setLongField(term25240, term25240.getClass(), "fastTime", 1272765521000L);
        setField(term25240, term25240.getClass(), "cdate", null);
        setField(term25176, term25176.getClass(), "createdDate", term25240);
        setIntField(term25243, term25243.getClass(), "nanos", 295000000);
        setLongField(term25243, term25243.getClass(), "fastTime", 1597341597000L);
        setField(term25243, term25243.getClass(), "cdate", null);
        setField(term25176, term25176.getClass(), "lastModifiedDate", term25243);
        setField(term25176, term25176.getClass(), "employeeRoles", term25246);
        setIntField(term25252, term25252.getClass(), "employeeId", -343325701);
        setIntField(term25252, term25252.getClass(), "projectId", 107945604);
        setField(term25252, term25252.getClass(), "projectRoleId", enum60);
        setField(term25252, term25252.getClass(), "externalRate", term25267);
        setField(term25176, term25176.getClass(), "employeeProjectRole", term25252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term25176, args);
    }

};


