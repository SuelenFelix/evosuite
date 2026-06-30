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

public class Employee_hashCode_209166042128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33882;

    public Employee_hashCode_209166042128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33953 = new HashMap();
        Set<Object> term34025 =  ((Map) term33953).keySet();
        HashSet term33952 = new HashSet((Collection<? extends Object>) term34025);
        Class<? extends Object> term34027 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term34026 = ((Class) term34027).getDeclaredField((String) "EMPLOYEE");
        ((Field) term34026).setAccessible(true);
        Object enum78 = ((Field) term34026).get((Object) null);
        Float term33973 = new Float(0.8598297F);
        term33882 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term33946 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33949 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33958 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term33882, term33882.getClass(), "id", -1222614956);
        setField(term33882, term33882.getClass(), "firstName", "vwbEQQNQrx");
        setField(term33882, term33882.getClass(), "middleName", "xtftXXMbem");
        setField(term33882, term33882.getClass(), "lastName", "cudZvLMQon");
        setField(term33882, term33882.getClass(), "email", "lihXWlGDxk");
        setField(term33882, term33882.getClass(), "passwordHash", "JmcmxoGhIK");
        setIntField(term33882, term33882.getClass(), "positionId", -1870495012);
        setBooleanField(term33882, term33882.getClass(), "isArchived", false);
        setIntField(term33946, term33946.getClass(), "nanos", 717000000);
        setLongField(term33946, term33946.getClass(), "fastTime", 1309121542000L);
        setField(term33946, term33946.getClass(), "cdate", null);
        setField(term33882, term33882.getClass(), "createdDate", term33946);
        setIntField(term33949, term33949.getClass(), "nanos", 249000000);
        setLongField(term33949, term33949.getClass(), "fastTime", 1695459581000L);
        setField(term33949, term33949.getClass(), "cdate", null);
        setField(term33882, term33882.getClass(), "lastModifiedDate", term33949);
        setField(term33882, term33882.getClass(), "employeeRoles", term33952);
        setIntField(term33958, term33958.getClass(), "employeeId", -1310015129);
        setIntField(term33958, term33958.getClass(), "projectId", -2104981311);
        setField(term33958, term33958.getClass(), "projectRoleId", enum78);
        setField(term33958, term33958.getClass(), "externalRate", term33973);
        setField(term33882, term33882.getClass(), "employeeProjectRole", term33958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term33882, args);
    }

};


