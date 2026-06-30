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

public class Employee_getEmployeeRoles_17986732312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25661;

    public Employee_getEmployeeRoles_17986732312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25732 = new HashMap();
        Set<Object> term25803 =  ((Map) term25732).keySet();
        HashSet term25731 = new HashSet((Collection<? extends Object>) term25803);
        Class<? extends Object> term25805 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term25804 = ((Class) term25805).getDeclaredField((String) "MANAGER");
        ((Field) term25804).setAccessible(true);
        Object enum61 = ((Field) term25804).get((Object) null);
        Float term25751 = new Float(0.26441735F);
        term25661 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term25725 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term25728 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term25737 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term25661, term25661.getClass(), "id", -1963464809);
        setField(term25661, term25661.getClass(), "firstName", "PkWMRdJcBb");
        setField(term25661, term25661.getClass(), "middleName", "jSpAteRute");
        setField(term25661, term25661.getClass(), "lastName", "swZVeJAxjt");
        setField(term25661, term25661.getClass(), "email", "xOcJIiQQDu");
        setField(term25661, term25661.getClass(), "passwordHash", "GVizqqzXpy");
        setIntField(term25661, term25661.getClass(), "positionId", 71190297);
        setBooleanField(term25661, term25661.getClass(), "isArchived", false);
        setIntField(term25725, term25725.getClass(), "nanos", 263000000);
        setLongField(term25725, term25725.getClass(), "fastTime", 1713880355000L);
        setField(term25725, term25725.getClass(), "cdate", null);
        setField(term25661, term25661.getClass(), "createdDate", term25725);
        setIntField(term25728, term25728.getClass(), "nanos", 651000000);
        setLongField(term25728, term25728.getClass(), "fastTime", 1663402967000L);
        setField(term25728, term25728.getClass(), "cdate", null);
        setField(term25661, term25661.getClass(), "lastModifiedDate", term25728);
        setField(term25661, term25661.getClass(), "employeeRoles", term25731);
        setIntField(term25737, term25737.getClass(), "employeeId", 1202361360);
        setIntField(term25737, term25737.getClass(), "projectId", -2015048153);
        setField(term25737, term25737.getClass(), "projectRoleId", enum61);
        setField(term25737, term25737.getClass(), "externalRate", term25751);
        setField(term25661, term25661.getClass(), "employeeProjectRole", term25737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeRoles", argTypes, term25661, args);
    }

};


