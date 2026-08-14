package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Float;

public class SessionEmployeePrincipal_setAllRoles_17476661261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;
     Object term1306;
     Object term1315;

    public SessionEmployeePrincipal_setAllRoles_17476661261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1289 = new HashMap();
        Set<Object> term1337 =  ((Map) term1289).keySet();
        HashSet term1288 = new HashSet((Collection<? extends Object>) term1337);
        HashMap term1301 = new HashMap();
        term1274 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1274, term1274.getClass(), "id", -2038273078);
        setField(term1274, term1274.getClass(), "email", "jJCZpVmanW");
        setField(term1274, term1274.getClass(), "employeeRoles", term1288);
        setField(term1274, term1274.getClass(), "projectIdsByProjectRoles", term1301);
        Class<? extends Object> term1394 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1393 = ((Class) term1394).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1393).setAccessible(true);
        Object enum0 = ((Field) term1393).get((Object) null);
        Object term1309 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeRole"));
        setIntField(term1309, term1309.getClass(), "employeeId", 1227103734);
        setField(term1309, term1309.getClass(), "roleId", enum0);
        term1306 = new LinkedList();
        ((LinkedList) term1306).add(term1309);
        Class<? extends Object> term1769 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1768 = ((Class) term1769).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1768).setAccessible(true);
        Object enum1 = ((Field) term1768).get((Object) null);
        Float term1324 = new Float(0.13238746F);
        Object term1318 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term1318, term1318.getClass(), "employeeId", -1339778481);
        setIntField(term1318, term1318.getClass(), "projectId", 1725571209);
        setField(term1318, term1318.getClass(), "projectRoleId", enum1);
        setField(term1318, term1318.getClass(), "externalRate", term1324);
        term1315 = new LinkedList();
        ((LinkedList) term1315).add(term1318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1306;
        args[1] = term1315;
        callMethod(klass, "setAllRoles", argTypes, term1274, args);
    }

};


