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

public class Employee_isArchived_2275086929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24206;

    public Employee_isArchived_2275086929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24277 = new HashMap();
        Set<Object> term24349 =  ((Map) term24277).keySet();
        HashSet term24276 = new HashSet((Collection<? extends Object>) term24349);
        Class<? extends Object> term24351 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term24350 = ((Class) term24351).getDeclaredField((String) "EMPLOYEE");
        ((Field) term24350).setAccessible(true);
        Object enum58 = ((Field) term24350).get((Object) null);
        Float term24297 = new Float(0.51832694F);
        term24206 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term24270 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term24273 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term24282 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term24206, term24206.getClass(), "id", 1474524152);
        setField(term24206, term24206.getClass(), "firstName", "KoyGrUJeJW");
        setField(term24206, term24206.getClass(), "middleName", "HqBOwkVqjD");
        setField(term24206, term24206.getClass(), "lastName", "MAcUBcBckh");
        setField(term24206, term24206.getClass(), "email", "oVgzLbrsFr");
        setField(term24206, term24206.getClass(), "passwordHash", "vQVyKLdtaz");
        setIntField(term24206, term24206.getClass(), "positionId", 568954359);
        setBooleanField(term24206, term24206.getClass(), "isArchived", true);
        setIntField(term24270, term24270.getClass(), "nanos", 432000000);
        setLongField(term24270, term24270.getClass(), "fastTime", 1332860905000L);
        setField(term24270, term24270.getClass(), "cdate", null);
        setField(term24206, term24206.getClass(), "createdDate", term24270);
        setIntField(term24273, term24273.getClass(), "nanos", 116000000);
        setLongField(term24273, term24273.getClass(), "fastTime", 1597223167000L);
        setField(term24273, term24273.getClass(), "cdate", null);
        setField(term24206, term24206.getClass(), "lastModifiedDate", term24273);
        setField(term24206, term24206.getClass(), "employeeRoles", term24276);
        setIntField(term24282, term24282.getClass(), "employeeId", 53410913);
        setIntField(term24282, term24282.getClass(), "projectId", -375014958);
        setField(term24282, term24282.getClass(), "projectRoleId", enum58);
        setField(term24282, term24282.getClass(), "externalRate", term24297);
        setField(term24206, term24206.getClass(), "employeeProjectRole", term24282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term24206, args);
    }

};


