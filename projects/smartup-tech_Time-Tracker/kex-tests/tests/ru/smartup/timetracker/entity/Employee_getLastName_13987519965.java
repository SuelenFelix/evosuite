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

public class Employee_getLastName_13987519965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22274;

    public Employee_getLastName_13987519965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22345 = new HashMap();
        Set<Object> term22416 =  ((Map) term22345).keySet();
        HashSet term22344 = new HashSet((Collection<? extends Object>) term22416);
        Class<? extends Object> term22418 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term22417 = ((Class) term22418).getDeclaredField((String) "MANAGER");
        ((Field) term22417).setAccessible(true);
        Object enum54 = ((Field) term22417).get((Object) null);
        Float term22364 = new Float(0.37773192F);
        term22274 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term22338 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22341 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22350 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term22274, term22274.getClass(), "id", 339854490);
        setField(term22274, term22274.getClass(), "firstName", "JDswTTCZHV");
        setField(term22274, term22274.getClass(), "middleName", "onpbIeEKoi");
        setField(term22274, term22274.getClass(), "lastName", "YRHGsAkhxb");
        setField(term22274, term22274.getClass(), "email", "ffYhPOzlUs");
        setField(term22274, term22274.getClass(), "passwordHash", "MLqYREekMl");
        setIntField(term22274, term22274.getClass(), "positionId", -615654495);
        setBooleanField(term22274, term22274.getClass(), "isArchived", false);
        setIntField(term22338, term22338.getClass(), "nanos", 832000000);
        setLongField(term22338, term22338.getClass(), "fastTime", 1628684516000L);
        setField(term22338, term22338.getClass(), "cdate", null);
        setField(term22274, term22274.getClass(), "createdDate", term22338);
        setIntField(term22341, term22341.getClass(), "nanos", 243000000);
        setLongField(term22341, term22341.getClass(), "fastTime", 1393189235000L);
        setField(term22341, term22341.getClass(), "cdate", null);
        setField(term22274, term22274.getClass(), "lastModifiedDate", term22341);
        setField(term22274, term22274.getClass(), "employeeRoles", term22344);
        setIntField(term22350, term22350.getClass(), "employeeId", -1476117762);
        setIntField(term22350, term22350.getClass(), "projectId", -341962980);
        setField(term22350, term22350.getClass(), "projectRoleId", enum54);
        setField(term22350, term22350.getClass(), "externalRate", term22364);
        setField(term22274, term22274.getClass(), "employeeProjectRole", term22350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term22274, args);
    }

};


