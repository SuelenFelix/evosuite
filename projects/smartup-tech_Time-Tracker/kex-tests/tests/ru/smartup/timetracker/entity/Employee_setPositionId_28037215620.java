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
import java.lang.Integer;

public class Employee_setPositionId_28037215620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29641;
     Object term29734;

    public Employee_setPositionId_28037215620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29712 = new HashMap();
        Set<Object> term29786 =  ((Map) term29712).keySet();
        HashSet term29711 = new HashSet((Collection<? extends Object>) term29786);
        Class<? extends Object> term29788 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term29787 = ((Class) term29788).getDeclaredField((String) "EMPLOYEE");
        ((Field) term29787).setAccessible(true);
        Object enum69 = ((Field) term29787).get((Object) null);
        Float term29732 = new Float(0.9472605F);
        term29641 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term29705 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term29708 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term29717 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term29641, term29641.getClass(), "id", -2014576105);
        setField(term29641, term29641.getClass(), "firstName", "EYtfuJaxiM");
        setField(term29641, term29641.getClass(), "middleName", "gCWtLVKVVe");
        setField(term29641, term29641.getClass(), "lastName", "fWKJoSoCwE");
        setField(term29641, term29641.getClass(), "email", "wfaXBpWAUH");
        setField(term29641, term29641.getClass(), "passwordHash", "VMeAzAHwZj");
        setIntField(term29641, term29641.getClass(), "positionId", 1296895584);
        setBooleanField(term29641, term29641.getClass(), "isArchived", true);
        setIntField(term29705, term29705.getClass(), "nanos", 422000000);
        setLongField(term29705, term29705.getClass(), "fastTime", 1415415253000L);
        setField(term29705, term29705.getClass(), "cdate", null);
        setField(term29641, term29641.getClass(), "createdDate", term29705);
        setIntField(term29708, term29708.getClass(), "nanos", 69000000);
        setLongField(term29708, term29708.getClass(), "fastTime", 1359775857000L);
        setField(term29708, term29708.getClass(), "cdate", null);
        setField(term29641, term29641.getClass(), "lastModifiedDate", term29708);
        setField(term29641, term29641.getClass(), "employeeRoles", term29711);
        setIntField(term29717, term29717.getClass(), "employeeId", 628918458);
        setIntField(term29717, term29717.getClass(), "projectId", -1274456137);
        setField(term29717, term29717.getClass(), "projectRoleId", enum69);
        setField(term29717, term29717.getClass(), "externalRate", term29732);
        setField(term29641, term29641.getClass(), "employeeProjectRole", term29717);
        term29734 = new Integer(1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29734;
        callMethod(klass, "setPositionId", argTypes, term29641, args);
    }

};


