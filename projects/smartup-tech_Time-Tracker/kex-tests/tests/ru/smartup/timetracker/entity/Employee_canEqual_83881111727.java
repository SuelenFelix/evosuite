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

public class Employee_canEqual_83881111727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33400;
     Object term33492;

    public Employee_canEqual_83881111727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33471 = new HashMap();
        Set<Object> term33543 =  ((Map) term33471).keySet();
        HashSet term33470 = new HashSet((Collection<? extends Object>) term33543);
        Class<? extends Object> term33545 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term33544 = ((Class) term33545).getDeclaredField((String) "MANAGER");
        ((Field) term33544).setAccessible(true);
        Object enum77 = ((Field) term33544).get((Object) null);
        Float term33490 = new Float(0.17877543F);
        term33400 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term33464 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33467 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33476 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term33400, term33400.getClass(), "id", -1667990367);
        setField(term33400, term33400.getClass(), "firstName", "OYbzXylRWW");
        setField(term33400, term33400.getClass(), "middleName", "DSNsTGYXDF");
        setField(term33400, term33400.getClass(), "lastName", "sQvGcVjdEx");
        setField(term33400, term33400.getClass(), "email", "rLHAoqXgPh");
        setField(term33400, term33400.getClass(), "passwordHash", "zUlRdimJtU");
        setIntField(term33400, term33400.getClass(), "positionId", -1214628358);
        setBooleanField(term33400, term33400.getClass(), "isArchived", true);
        setIntField(term33464, term33464.getClass(), "nanos", 278000000);
        setLongField(term33464, term33464.getClass(), "fastTime", 1618583905000L);
        setField(term33464, term33464.getClass(), "cdate", null);
        setField(term33400, term33400.getClass(), "createdDate", term33464);
        setIntField(term33467, term33467.getClass(), "nanos", 305000000);
        setLongField(term33467, term33467.getClass(), "fastTime", 1584125791000L);
        setField(term33467, term33467.getClass(), "cdate", null);
        setField(term33400, term33400.getClass(), "lastModifiedDate", term33467);
        setField(term33400, term33400.getClass(), "employeeRoles", term33470);
        setIntField(term33476, term33476.getClass(), "employeeId", 1102721075);
        setIntField(term33476, term33476.getClass(), "projectId", -426764678);
        setField(term33476, term33476.getClass(), "projectRoleId", enum77);
        setField(term33476, term33476.getClass(), "externalRate", term33490);
        setField(term33400, term33400.getClass(), "employeeProjectRole", term33476);
        term33492 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33492;
        callMethod(klass, "canEqual", argTypes, term33400, args);
    }

};


