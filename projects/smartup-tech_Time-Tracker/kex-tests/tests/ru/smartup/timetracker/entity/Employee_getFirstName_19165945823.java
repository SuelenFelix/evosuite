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

public class Employee_getFirstName_19165945823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21304;

    public Employee_getFirstName_19165945823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21375 = new HashMap();
        Set<Object> term21447 =  ((Map) term21375).keySet();
        HashSet term21374 = new HashSet((Collection<? extends Object>) term21447);
        Class<? extends Object> term21449 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term21448 = ((Class) term21449).getDeclaredField((String) "EMPLOYEE");
        ((Field) term21448).setAccessible(true);
        Object enum52 = ((Field) term21448).get((Object) null);
        Float term21395 = new Float(0.6076495F);
        term21304 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term21368 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21371 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21380 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term21304, term21304.getClass(), "id", 304775596);
        setField(term21304, term21304.getClass(), "firstName", "hxCBltsObl");
        setField(term21304, term21304.getClass(), "middleName", "BndsHwAFMv");
        setField(term21304, term21304.getClass(), "lastName", "GzFkzHGYFt");
        setField(term21304, term21304.getClass(), "email", "tShwQLRGNe");
        setField(term21304, term21304.getClass(), "passwordHash", "LvtrsXUliU");
        setIntField(term21304, term21304.getClass(), "positionId", -1347665717);
        setBooleanField(term21304, term21304.getClass(), "isArchived", false);
        setIntField(term21368, term21368.getClass(), "nanos", 281000000);
        setLongField(term21368, term21368.getClass(), "fastTime", 1853953179000L);
        setField(term21368, term21368.getClass(), "cdate", null);
        setField(term21304, term21304.getClass(), "createdDate", term21368);
        setIntField(term21371, term21371.getClass(), "nanos", 628000000);
        setLongField(term21371, term21371.getClass(), "fastTime", 1795925537000L);
        setField(term21371, term21371.getClass(), "cdate", null);
        setField(term21304, term21304.getClass(), "lastModifiedDate", term21371);
        setField(term21304, term21304.getClass(), "employeeRoles", term21374);
        setIntField(term21380, term21380.getClass(), "employeeId", -1888585309);
        setIntField(term21380, term21380.getClass(), "projectId", 683666002);
        setField(term21380, term21380.getClass(), "projectRoleId", enum52);
        setField(term21380, term21380.getClass(), "externalRate", term21395);
        setField(term21304, term21304.getClass(), "employeeProjectRole", term21380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term21304, args);
    }

};


