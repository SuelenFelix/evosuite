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

public class Employee_toString_169254718529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34367;

    public Employee_toString_169254718529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34438 = new HashMap();
        Set<Object> term34510 =  ((Map) term34438).keySet();
        HashSet term34437 = new HashSet((Collection<? extends Object>) term34510);
        Class<? extends Object> term34512 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term34511 = ((Class) term34512).getDeclaredField((String) "EMPLOYEE");
        ((Field) term34511).setAccessible(true);
        Object enum79 = ((Field) term34511).get((Object) null);
        Float term34458 = new Float(0.96323884F);
        term34367 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term34431 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term34434 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term34443 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term34367, term34367.getClass(), "id", -571169753);
        setField(term34367, term34367.getClass(), "firstName", "jXzmYyrnnT");
        setField(term34367, term34367.getClass(), "middleName", "igCAtimmYB");
        setField(term34367, term34367.getClass(), "lastName", "DyiXbeYIaN");
        setField(term34367, term34367.getClass(), "email", "VGizxZnyHX");
        setField(term34367, term34367.getClass(), "passwordHash", "kVEZMHmRtR");
        setIntField(term34367, term34367.getClass(), "positionId", 318591690);
        setBooleanField(term34367, term34367.getClass(), "isArchived", false);
        setIntField(term34431, term34431.getClass(), "nanos", 146000000);
        setLongField(term34431, term34431.getClass(), "fastTime", 1342867076000L);
        setField(term34431, term34431.getClass(), "cdate", null);
        setField(term34367, term34367.getClass(), "createdDate", term34431);
        setIntField(term34434, term34434.getClass(), "nanos", 327000000);
        setLongField(term34434, term34434.getClass(), "fastTime", 1511272814000L);
        setField(term34434, term34434.getClass(), "cdate", null);
        setField(term34367, term34367.getClass(), "lastModifiedDate", term34434);
        setField(term34367, term34367.getClass(), "employeeRoles", term34437);
        setIntField(term34443, term34443.getClass(), "employeeId", -165587447);
        setIntField(term34443, term34443.getClass(), "projectId", -1347358701);
        setField(term34443, term34443.getClass(), "projectRoleId", enum79);
        setField(term34443, term34443.getClass(), "externalRate", term34458);
        setField(term34367, term34367.getClass(), "employeeProjectRole", term34443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term34367, args);
    }

};


