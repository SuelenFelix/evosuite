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

public class Employee_setPasswordHash_24164509219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29134;

    public Employee_setPasswordHash_24164509219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29205 = new HashMap();
        Set<Object> term29289 =  ((Map) term29205).keySet();
        HashSet term29204 = new HashSet((Collection<? extends Object>) term29289);
        Class<? extends Object> term29291 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term29290 = ((Class) term29291).getDeclaredField((String) "EMPLOYEE");
        ((Field) term29290).setAccessible(true);
        Object enum68 = ((Field) term29290).get((Object) null);
        Float term29225 = new Float(0.9828442F);
        term29134 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term29198 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term29201 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term29210 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term29134, term29134.getClass(), "id", -461771056);
        setField(term29134, term29134.getClass(), "firstName", "mLUZFTfjle");
        setField(term29134, term29134.getClass(), "middleName", "xIeFjkHkOe");
        setField(term29134, term29134.getClass(), "lastName", "SdCKLMIYnX");
        setField(term29134, term29134.getClass(), "email", "OJJtVNPyKZ");
        setField(term29134, term29134.getClass(), "passwordHash", "AKNapTAfmD");
        setIntField(term29134, term29134.getClass(), "positionId", -243422082);
        setBooleanField(term29134, term29134.getClass(), "isArchived", true);
        setIntField(term29198, term29198.getClass(), "nanos", 774000000);
        setLongField(term29198, term29198.getClass(), "fastTime", 1597410965000L);
        setField(term29198, term29198.getClass(), "cdate", null);
        setField(term29134, term29134.getClass(), "createdDate", term29198);
        setIntField(term29201, term29201.getClass(), "nanos", 477000000);
        setLongField(term29201, term29201.getClass(), "fastTime", 1354724525000L);
        setField(term29201, term29201.getClass(), "cdate", null);
        setField(term29134, term29134.getClass(), "lastModifiedDate", term29201);
        setField(term29134, term29134.getClass(), "employeeRoles", term29204);
        setIntField(term29210, term29210.getClass(), "employeeId", 1384592638);
        setIntField(term29210, term29210.getClass(), "projectId", -1002370457);
        setField(term29210, term29210.getClass(), "projectRoleId", enum68);
        setField(term29210, term29210.getClass(), "externalRate", term29225);
        setField(term29134, term29134.getClass(), "employeeProjectRole", term29210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "setPasswordHash", argTypes, term29134, args);
    }

};


