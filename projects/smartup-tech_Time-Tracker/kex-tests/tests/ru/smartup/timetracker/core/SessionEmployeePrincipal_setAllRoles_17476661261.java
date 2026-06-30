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
     Object term900;
     Object term932;
     Object term941;

    public SessionEmployeePrincipal_setAllRoles_17476661261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term915 = new HashMap();
        Set<Object> term963 =  ((Map) term915).keySet();
        HashSet term914 = new HashSet((Collection<? extends Object>) term963);
        HashMap term927 = new HashMap();
        term900 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term900, term900.getClass(), "id", -2038273078);
        setField(term900, term900.getClass(), "email", "jJCZpVmanW");
        setField(term900, term900.getClass(), "employeeRoles", term914);
        setField(term900, term900.getClass(), "projectIdsByProjectRoles", term927);
        Class<? extends Object> term1020 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1019 = ((Class) term1020).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1019).setAccessible(true);
        Object enum0 = ((Field) term1019).get((Object) null);
        Object term935 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeRole"));
        setIntField(term935, term935.getClass(), "employeeId", 1227103734);
        setField(term935, term935.getClass(), "roleId", enum0);
        term932 = new LinkedList();
        ((LinkedList) term932).add(term935);
        Class<? extends Object> term1395 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1394 = ((Class) term1395).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1394).setAccessible(true);
        Object enum1 = ((Field) term1394).get((Object) null);
        Float term950 = new Float(0.13238746F);
        Object term944 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term944, term944.getClass(), "employeeId", -1339778481);
        setIntField(term944, term944.getClass(), "projectId", 1725571209);
        setField(term944, term944.getClass(), "projectRoleId", enum1);
        setField(term944, term944.getClass(), "externalRate", term950);
        term941 = new LinkedList();
        ((LinkedList) term941).add(term944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term932;
        args[1] = term941;
        callMethod(klass, "setAllRoles", argTypes, term900, args);
    }

};


