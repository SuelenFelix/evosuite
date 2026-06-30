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

public class Employee_setEmployeeRoles_13023599924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31587;
     Object term31680;

    public Employee_setEmployeeRoles_13023599924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31658 = new HashMap();
        Set<Object> term31736 =  ((Map) term31658).keySet();
        HashSet term31657 = new HashSet((Collection<? extends Object>) term31736);
        Class<? extends Object> term31738 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term31737 = ((Class) term31738).getDeclaredField((String) "EMPLOYEE");
        ((Field) term31737).setAccessible(true);
        Object enum73 = ((Field) term31737).get((Object) null);
        Float term31678 = new Float(0.89057696F);
        term31587 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term31651 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term31654 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term31663 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term31587, term31587.getClass(), "id", -507387516);
        setField(term31587, term31587.getClass(), "firstName", "VYkqXKVlAJ");
        setField(term31587, term31587.getClass(), "middleName", "XkIoWJRNwN");
        setField(term31587, term31587.getClass(), "lastName", "aNWLJdrZMq");
        setField(term31587, term31587.getClass(), "email", "HHmNoYxIGj");
        setField(term31587, term31587.getClass(), "passwordHash", "PtirvZmsGt");
        setIntField(term31587, term31587.getClass(), "positionId", -1970452551);
        setBooleanField(term31587, term31587.getClass(), "isArchived", false);
        setIntField(term31651, term31651.getClass(), "nanos", 58000000);
        setLongField(term31651, term31651.getClass(), "fastTime", 1335378452000L);
        setField(term31651, term31651.getClass(), "cdate", null);
        setField(term31587, term31587.getClass(), "createdDate", term31651);
        setIntField(term31654, term31654.getClass(), "nanos", 678000000);
        setLongField(term31654, term31654.getClass(), "fastTime", 1616822668000L);
        setField(term31654, term31654.getClass(), "cdate", null);
        setField(term31587, term31587.getClass(), "lastModifiedDate", term31654);
        setField(term31587, term31587.getClass(), "employeeRoles", term31657);
        setIntField(term31663, term31663.getClass(), "employeeId", -1896376975);
        setIntField(term31663, term31663.getClass(), "projectId", 729658803);
        setField(term31663, term31663.getClass(), "projectRoleId", enum73);
        setField(term31663, term31663.getClass(), "externalRate", term31678);
        setField(term31587, term31587.getClass(), "employeeProjectRole", term31663);
        HashMap term31681 = new HashMap();
        Set<Object> term32078 =  ((Map) term31681).keySet();
        term31680 = new HashSet((Collection<? extends Object>) term32078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term31680;
        callMethod(klass, "setEmployeeRoles", argTypes, term31587, args);
    }

};


