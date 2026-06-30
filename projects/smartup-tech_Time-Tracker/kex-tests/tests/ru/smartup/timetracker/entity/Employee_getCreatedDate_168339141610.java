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

public class Employee_getCreatedDate_168339141610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24691;

    public Employee_getCreatedDate_168339141610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24762 = new HashMap();
        Set<Object> term24834 =  ((Map) term24762).keySet();
        HashSet term24761 = new HashSet((Collection<? extends Object>) term24834);
        Class<? extends Object> term24836 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term24835 = ((Class) term24836).getDeclaredField((String) "EMPLOYEE");
        ((Field) term24835).setAccessible(true);
        Object enum59 = ((Field) term24835).get((Object) null);
        Float term24782 = new Float(0.97262454F);
        term24691 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term24755 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term24758 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term24767 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term24691, term24691.getClass(), "id", 1107176718);
        setField(term24691, term24691.getClass(), "firstName", "OWKQODBLzb");
        setField(term24691, term24691.getClass(), "middleName", "wGmYcqUkgE");
        setField(term24691, term24691.getClass(), "lastName", "idgaQsnJpQ");
        setField(term24691, term24691.getClass(), "email", "VgZnGoIFwQ");
        setField(term24691, term24691.getClass(), "passwordHash", "jUbSRrkrYZ");
        setIntField(term24691, term24691.getClass(), "positionId", 480137250);
        setBooleanField(term24691, term24691.getClass(), "isArchived", false);
        setIntField(term24755, term24755.getClass(), "nanos", 937000000);
        setLongField(term24755, term24755.getClass(), "fastTime", 1276494597000L);
        setField(term24755, term24755.getClass(), "cdate", null);
        setField(term24691, term24691.getClass(), "createdDate", term24755);
        setIntField(term24758, term24758.getClass(), "nanos", 793000000);
        setLongField(term24758, term24758.getClass(), "fastTime", 1278166775000L);
        setField(term24758, term24758.getClass(), "cdate", null);
        setField(term24691, term24691.getClass(), "lastModifiedDate", term24758);
        setField(term24691, term24691.getClass(), "employeeRoles", term24761);
        setIntField(term24767, term24767.getClass(), "employeeId", -341152642);
        setIntField(term24767, term24767.getClass(), "projectId", -2015854073);
        setField(term24767, term24767.getClass(), "projectRoleId", enum59);
        setField(term24767, term24767.getClass(), "externalRate", term24782);
        setField(term24691, term24691.getClass(), "employeeProjectRole", term24767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term24691, args);
    }

};


