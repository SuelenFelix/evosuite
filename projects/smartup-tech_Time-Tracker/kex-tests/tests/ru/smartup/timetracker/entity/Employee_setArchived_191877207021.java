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
import java.lang.Boolean;

public class Employee_setArchived_191877207021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30128;
     Object term30220;

    public Employee_setArchived_191877207021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30199 = new HashMap();
        Set<Object> term30272 =  ((Map) term30199).keySet();
        HashSet term30198 = new HashSet((Collection<? extends Object>) term30272);
        Class<? extends Object> term30274 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term30273 = ((Class) term30274).getDeclaredField((String) "MANAGER");
        ((Field) term30273).setAccessible(true);
        Object enum70 = ((Field) term30273).get((Object) null);
        Float term30218 = new Float(0.27797186F);
        term30128 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term30192 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30195 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30204 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term30128, term30128.getClass(), "id", -601863069);
        setField(term30128, term30128.getClass(), "firstName", "PznxWXsZME");
        setField(term30128, term30128.getClass(), "middleName", "ZzIujlwVsw");
        setField(term30128, term30128.getClass(), "lastName", "LWyEaeIyAo");
        setField(term30128, term30128.getClass(), "email", "yVMkkQhvmN");
        setField(term30128, term30128.getClass(), "passwordHash", "mvrkADEgpp");
        setIntField(term30128, term30128.getClass(), "positionId", 663292551);
        setBooleanField(term30128, term30128.getClass(), "isArchived", false);
        setIntField(term30192, term30192.getClass(), "nanos", 309000000);
        setLongField(term30192, term30192.getClass(), "fastTime", 1589735951000L);
        setField(term30192, term30192.getClass(), "cdate", null);
        setField(term30128, term30128.getClass(), "createdDate", term30192);
        setIntField(term30195, term30195.getClass(), "nanos", 982000000);
        setLongField(term30195, term30195.getClass(), "fastTime", 1291269567000L);
        setField(term30195, term30195.getClass(), "cdate", null);
        setField(term30128, term30128.getClass(), "lastModifiedDate", term30195);
        setField(term30128, term30128.getClass(), "employeeRoles", term30198);
        setIntField(term30204, term30204.getClass(), "employeeId", -1885090354);
        setIntField(term30204, term30204.getClass(), "projectId", -2066804303);
        setField(term30204, term30204.getClass(), "projectRoleId", enum70);
        setField(term30204, term30204.getClass(), "externalRate", term30218);
        setField(term30128, term30128.getClass(), "employeeProjectRole", term30204);
        term30220 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30220;
        callMethod(klass, "setArchived", argTypes, term30128, args);
    }

};


