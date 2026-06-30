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

public class Employee_setLastName_18759044417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28120;

    public Employee_setLastName_18759044417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28191 = new HashMap();
        Set<Object> term28275 =  ((Map) term28191).keySet();
        HashSet term28190 = new HashSet((Collection<? extends Object>) term28275);
        Class<? extends Object> term28277 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term28276 = ((Class) term28277).getDeclaredField((String) "EMPLOYEE");
        ((Field) term28276).setAccessible(true);
        Object enum66 = ((Field) term28276).get((Object) null);
        Float term28211 = new Float(0.95272815F);
        term28120 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term28184 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term28187 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term28196 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term28120, term28120.getClass(), "id", 1830648570);
        setField(term28120, term28120.getClass(), "firstName", "MvRIxilFMJ");
        setField(term28120, term28120.getClass(), "middleName", "iNwOJRBEjp");
        setField(term28120, term28120.getClass(), "lastName", "XylxrMBraH");
        setField(term28120, term28120.getClass(), "email", "pORebkoRdD");
        setField(term28120, term28120.getClass(), "passwordHash", "mXGCWJDOqA");
        setIntField(term28120, term28120.getClass(), "positionId", -227365013);
        setBooleanField(term28120, term28120.getClass(), "isArchived", false);
        setIntField(term28184, term28184.getClass(), "nanos", 896000000);
        setLongField(term28184, term28184.getClass(), "fastTime", 1450854459000L);
        setField(term28184, term28184.getClass(), "cdate", null);
        setField(term28120, term28120.getClass(), "createdDate", term28184);
        setIntField(term28187, term28187.getClass(), "nanos", 847000000);
        setLongField(term28187, term28187.getClass(), "fastTime", 1467772254000L);
        setField(term28187, term28187.getClass(), "cdate", null);
        setField(term28120, term28120.getClass(), "lastModifiedDate", term28187);
        setField(term28120, term28120.getClass(), "employeeRoles", term28190);
        setIntField(term28196, term28196.getClass(), "employeeId", 11724947);
        setIntField(term28196, term28196.getClass(), "projectId", 1953277050);
        setField(term28196, term28196.getClass(), "projectRoleId", enum66);
        setField(term28196, term28196.getClass(), "externalRate", term28211);
        setField(term28120, term28120.getClass(), "employeeProjectRole", term28196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "setLastName", argTypes, term28120, args);
    }

};


