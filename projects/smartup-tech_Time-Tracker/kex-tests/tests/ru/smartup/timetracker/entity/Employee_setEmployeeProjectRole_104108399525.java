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

public class Employee_setEmployeeProjectRole_104108399525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32079;
     Object term32172;

    public Employee_setEmployeeProjectRole_104108399525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term32150 = new HashMap();
        Set<Object> term32238 =  ((Map) term32150).keySet();
        HashSet term32149 = new HashSet((Collection<? extends Object>) term32238);
        Class<? extends Object> term32240 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term32239 = ((Class) term32240).getDeclaredField((String) "EMPLOYEE");
        ((Field) term32239).setAccessible(true);
        Object enum74 = ((Field) term32239).get((Object) null);
        Float term32170 = new Float(0.7332741F);
        term32079 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term32143 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term32146 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term32155 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term32079, term32079.getClass(), "id", 114754804);
        setField(term32079, term32079.getClass(), "firstName", "HWkpTmtlrc");
        setField(term32079, term32079.getClass(), "middleName", "hMmaoREuCK");
        setField(term32079, term32079.getClass(), "lastName", "VeDtgDzGAN");
        setField(term32079, term32079.getClass(), "email", "aWYOWZFyaX");
        setField(term32079, term32079.getClass(), "passwordHash", "BRIVNtfUWU");
        setIntField(term32079, term32079.getClass(), "positionId", 1687361082);
        setBooleanField(term32079, term32079.getClass(), "isArchived", false);
        setIntField(term32143, term32143.getClass(), "nanos", 821000000);
        setLongField(term32143, term32143.getClass(), "fastTime", 1319530954000L);
        setField(term32143, term32143.getClass(), "cdate", null);
        setField(term32079, term32079.getClass(), "createdDate", term32143);
        setIntField(term32146, term32146.getClass(), "nanos", 283000000);
        setLongField(term32146, term32146.getClass(), "fastTime", 1431644615000L);
        setField(term32146, term32146.getClass(), "cdate", null);
        setField(term32079, term32079.getClass(), "lastModifiedDate", term32146);
        setField(term32079, term32079.getClass(), "employeeRoles", term32149);
        setIntField(term32155, term32155.getClass(), "employeeId", 584893196);
        setIntField(term32155, term32155.getClass(), "projectId", 497269071);
        setField(term32155, term32155.getClass(), "projectRoleId", enum74);
        setField(term32155, term32155.getClass(), "externalRate", term32170);
        setField(term32079, term32079.getClass(), "employeeProjectRole", term32155);
        Class<? extends Object> term32581 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term32580 = ((Class) term32581).getDeclaredField((String) "MANAGER");
        ((Field) term32580).setAccessible(true);
        Object enum75 = ((Field) term32580).get((Object) null);
        Float term32186 = new Float(0.15826964F);
        term32172 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term32172, term32172.getClass(), "employeeId", -1899301124);
        setIntField(term32172, term32172.getClass(), "projectId", -1882480155);
        setField(term32172, term32172.getClass(), "projectRoleId", enum75);
        setField(term32172, term32172.getClass(), "externalRate", term32186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Object[] args = new Object[1];
        args[0] = term32172;
        callMethod(klass, "setEmployeeProjectRole", argTypes, term32079, args);
    }

};


