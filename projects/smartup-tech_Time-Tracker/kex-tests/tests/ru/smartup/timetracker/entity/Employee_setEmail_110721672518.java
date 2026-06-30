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

public class Employee_setEmail_110721672518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28627;

    public Employee_setEmail_110721672518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28698 = new HashMap();
        Set<Object> term28782 =  ((Map) term28698).keySet();
        HashSet term28697 = new HashSet((Collection<? extends Object>) term28782);
        Class<? extends Object> term28784 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term28783 = ((Class) term28784).getDeclaredField((String) "EMPLOYEE");
        ((Field) term28783).setAccessible(true);
        Object enum67 = ((Field) term28783).get((Object) null);
        Float term28718 = new Float(0.7254646F);
        term28627 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term28691 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term28694 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term28703 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term28627, term28627.getClass(), "id", 1283079251);
        setField(term28627, term28627.getClass(), "firstName", "hCWPJQKpdc");
        setField(term28627, term28627.getClass(), "middleName", "WzMEhMXkKx");
        setField(term28627, term28627.getClass(), "lastName", "XOiDvlDhdc");
        setField(term28627, term28627.getClass(), "email", "AdxvLJhNLe");
        setField(term28627, term28627.getClass(), "passwordHash", "lHfTrWKMPk");
        setIntField(term28627, term28627.getClass(), "positionId", -523949691);
        setBooleanField(term28627, term28627.getClass(), "isArchived", true);
        setIntField(term28691, term28691.getClass(), "nanos", 992000000);
        setLongField(term28691, term28691.getClass(), "fastTime", 1825598044000L);
        setField(term28691, term28691.getClass(), "cdate", null);
        setField(term28627, term28627.getClass(), "createdDate", term28691);
        setIntField(term28694, term28694.getClass(), "nanos", 700000000);
        setLongField(term28694, term28694.getClass(), "fastTime", 1465771999000L);
        setField(term28694, term28694.getClass(), "cdate", null);
        setField(term28627, term28627.getClass(), "lastModifiedDate", term28694);
        setField(term28627, term28627.getClass(), "employeeRoles", term28697);
        setIntField(term28703, term28703.getClass(), "employeeId", 1398204340);
        setIntField(term28703, term28703.getClass(), "projectId", 229204365);
        setField(term28703, term28703.getClass(), "projectRoleId", enum67);
        setField(term28703, term28703.getClass(), "externalRate", term28718);
        setField(term28627, term28627.getClass(), "employeeProjectRole", term28703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setEmail", argTypes, term28627, args);
    }

};


