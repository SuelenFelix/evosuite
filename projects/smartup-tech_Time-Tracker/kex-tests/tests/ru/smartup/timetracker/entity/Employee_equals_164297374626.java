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

public class Employee_equals_164297374626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32918;
     Object term33010;

    public Employee_equals_164297374626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term32989 = new HashMap();
        Set<Object> term33061 =  ((Map) term32989).keySet();
        HashSet term32988 = new HashSet((Collection<? extends Object>) term33061);
        Class<? extends Object> term33063 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term33062 = ((Class) term33063).getDeclaredField((String) "MANAGER");
        ((Field) term33062).setAccessible(true);
        Object enum76 = ((Field) term33062).get((Object) null);
        Float term33008 = new Float(0.45691717F);
        term32918 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term32982 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term32985 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term32994 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term32918, term32918.getClass(), "id", -1410220680);
        setField(term32918, term32918.getClass(), "firstName", "DbiCVtPPCT");
        setField(term32918, term32918.getClass(), "middleName", "WzFopsaDuG");
        setField(term32918, term32918.getClass(), "lastName", "PapWxkhEWe");
        setField(term32918, term32918.getClass(), "email", "smnHEqRFRx");
        setField(term32918, term32918.getClass(), "passwordHash", "XYtryyobou");
        setIntField(term32918, term32918.getClass(), "positionId", 389427431);
        setBooleanField(term32918, term32918.getClass(), "isArchived", false);
        setIntField(term32982, term32982.getClass(), "nanos", 670000000);
        setLongField(term32982, term32982.getClass(), "fastTime", 1714964502000L);
        setField(term32982, term32982.getClass(), "cdate", null);
        setField(term32918, term32918.getClass(), "createdDate", term32982);
        setIntField(term32985, term32985.getClass(), "nanos", 357000000);
        setLongField(term32985, term32985.getClass(), "fastTime", 1830742277000L);
        setField(term32985, term32985.getClass(), "cdate", null);
        setField(term32918, term32918.getClass(), "lastModifiedDate", term32985);
        setField(term32918, term32918.getClass(), "employeeRoles", term32988);
        setIntField(term32994, term32994.getClass(), "employeeId", -1945706126);
        setIntField(term32994, term32994.getClass(), "projectId", 1152356969);
        setField(term32994, term32994.getClass(), "projectRoleId", enum76);
        setField(term32994, term32994.getClass(), "externalRate", term33008);
        setField(term32918, term32918.getClass(), "employeeProjectRole", term32994);
        term33010 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33010;
        callMethod(klass, "equals", argTypes, term32918, args);
    }

};


