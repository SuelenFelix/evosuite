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
import java.lang.Integer;

public class Employee_setId_30595764514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26623;
     Object term26715;

    public Employee_setId_30595764514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26694 = new HashMap();
        Set<Object> term26767 =  ((Map) term26694).keySet();
        HashSet term26693 = new HashSet((Collection<? extends Object>) term26767);
        Class<? extends Object> term26769 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term26768 = ((Class) term26769).getDeclaredField((String) "MANAGER");
        ((Field) term26768).setAccessible(true);
        Object enum63 = ((Field) term26768).get((Object) null);
        Float term26713 = new Float(0.20144695F);
        term26623 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term26687 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term26690 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term26699 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term26623, term26623.getClass(), "id", 344323424);
        setField(term26623, term26623.getClass(), "firstName", "XPKmummaqg");
        setField(term26623, term26623.getClass(), "middleName", "BKLfkLiZTH");
        setField(term26623, term26623.getClass(), "lastName", "SPpkrGcPRr");
        setField(term26623, term26623.getClass(), "email", "sEccwbJKYE");
        setField(term26623, term26623.getClass(), "passwordHash", "AWRooQKkdW");
        setIntField(term26623, term26623.getClass(), "positionId", 9726679);
        setBooleanField(term26623, term26623.getClass(), "isArchived", true);
        setIntField(term26687, term26687.getClass(), "nanos", 273000000);
        setLongField(term26687, term26687.getClass(), "fastTime", 1285650698000L);
        setField(term26687, term26687.getClass(), "cdate", null);
        setField(term26623, term26623.getClass(), "createdDate", term26687);
        setIntField(term26690, term26690.getClass(), "nanos", 575000000);
        setLongField(term26690, term26690.getClass(), "fastTime", 1643970313000L);
        setField(term26690, term26690.getClass(), "cdate", null);
        setField(term26623, term26623.getClass(), "lastModifiedDate", term26690);
        setField(term26623, term26623.getClass(), "employeeRoles", term26693);
        setIntField(term26699, term26699.getClass(), "employeeId", -25637976);
        setIntField(term26699, term26699.getClass(), "projectId", 1555897383);
        setField(term26699, term26699.getClass(), "projectRoleId", enum63);
        setField(term26699, term26699.getClass(), "externalRate", term26713);
        setField(term26623, term26623.getClass(), "employeeProjectRole", term26699);
        term26715 = new Integer(202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26715;
        callMethod(klass, "setId", argTypes, term26623, args);
    }

};


