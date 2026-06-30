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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Float;

public class TrackUnit_getEmployee_114784992415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77161;

    public TrackUnit_getEmployee_114784992415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77341 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term77340 = ((Class) term77341).getDeclaredField((String) "CREATED");
        ((Field) term77340).setAccessible(true);
        Object enum173 = ((Field) term77340).get((Object) null);
        HashMap term77283 = new HashMap();
        Set<Object> term77768 =  ((Map) term77283).keySet();
        HashSet term77282 = new HashSet((Collection<? extends Object>) term77768);
        Class<? extends Object> term77770 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term77769 = ((Class) term77770).getDeclaredField((String) "EMPLOYEE");
        ((Field) term77769).setAccessible(true);
        Object enum174 = ((Field) term77769).get((Object) null);
        Float term77294 = new Float(0.22651339F);
        term77161 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term77163 = newInstance(Class.forName("java.sql.Date"));
        Object term77205 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77208 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77212 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term77276 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77279 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77288 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term77296 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term77311 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77314 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77317 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term77334 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term77337 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term77161, term77161.getClass(), "id", 41775768178052008L);
        setLongField(term77163, term77163.getClass(), "fastTime", 1349069753960L);
        setField(term77163, term77163.getClass(), "cdate", null);
        setField(term77161, term77161.getClass(), "workDay", term77163);
        setField(term77161, term77161.getClass(), "status", enum173);
        setFloatField(term77161, term77161.getClass(), "hours", 0.7031006F);
        setField(term77161, term77161.getClass(), "comment", "fIZsWucfXz");
        setField(term77161, term77161.getClass(), "rejectReason", "IApvtmfhnq");
        setFloatField(term77161, term77161.getClass(), "rate", 0.9431611F);
        setBooleanField(term77161, term77161.getClass(), "billable", false);
        setLongField(term77161, term77161.getClass(), "taskId", 6682528376118987775L);
        setIntField(term77161, term77161.getClass(), "employeeId", 754055848);
        setIntField(term77205, term77205.getClass(), "nanos", 511000000);
        setLongField(term77205, term77205.getClass(), "fastTime", 1692555277000L);
        setField(term77205, term77205.getClass(), "cdate", null);
        setField(term77161, term77161.getClass(), "createdDate", term77205);
        setIntField(term77208, term77208.getClass(), "nanos", 631000000);
        setLongField(term77208, term77208.getClass(), "fastTime", 1424554373000L);
        setField(term77208, term77208.getClass(), "cdate", null);
        setField(term77161, term77161.getClass(), "lastModifiedDate", term77208);
        setBooleanField(term77161, term77161.getClass(), "frozen", true);
        setIntField(term77212, term77212.getClass(), "id", -19246901);
        setField(term77212, term77212.getClass(), "firstName", "VSaNnhMpRc");
        setField(term77212, term77212.getClass(), "middleName", "QNjNTLlUaV");
        setField(term77212, term77212.getClass(), "lastName", "hIYsRyOZxk");
        setField(term77212, term77212.getClass(), "email", "RjNoEywJbC");
        setField(term77212, term77212.getClass(), "passwordHash", "RTTvrwwhou");
        setIntField(term77212, term77212.getClass(), "positionId", -370828664);
        setBooleanField(term77212, term77212.getClass(), "isArchived", true);
        setIntField(term77276, term77276.getClass(), "nanos", 618000000);
        setLongField(term77276, term77276.getClass(), "fastTime", 1355436874000L);
        setField(term77276, term77276.getClass(), "cdate", null);
        setField(term77212, term77212.getClass(), "createdDate", term77276);
        setIntField(term77279, term77279.getClass(), "nanos", 62000000);
        setLongField(term77279, term77279.getClass(), "fastTime", 1489361605000L);
        setField(term77279, term77279.getClass(), "cdate", null);
        setField(term77212, term77212.getClass(), "lastModifiedDate", term77279);
        setField(term77212, term77212.getClass(), "employeeRoles", term77282);
        setIntField(term77288, term77288.getClass(), "employeeId", 1168633950);
        setIntField(term77288, term77288.getClass(), "projectId", 1607082164);
        setField(term77288, term77288.getClass(), "projectRoleId", enum174);
        setField(term77288, term77288.getClass(), "externalRate", term77294);
        setField(term77212, term77212.getClass(), "employeeProjectRole", term77288);
        setField(term77161, term77161.getClass(), "employee", term77212);
        setIntField(term77296, term77296.getClass(), "id", 1890399366);
        setField(term77296, term77296.getClass(), "name", "lRORwXipuk");
        setBooleanField(term77296, term77296.getClass(), "isArchived", false);
        setIntField(term77311, term77311.getClass(), "nanos", 8000000);
        setLongField(term77311, term77311.getClass(), "fastTime", 1267325001000L);
        setField(term77311, term77311.getClass(), "cdate", null);
        setField(term77296, term77296.getClass(), "createdDate", term77311);
        setIntField(term77314, term77314.getClass(), "nanos", 875000000);
        setLongField(term77314, term77314.getClass(), "fastTime", 1849672317000L);
        setField(term77314, term77314.getClass(), "cdate", null);
        setField(term77296, term77296.getClass(), "lastModifiedDate", term77314);
        setField(term77161, term77161.getClass(), "project", term77296);
        setLongField(term77317, term77317.getClass(), "id", 682356318767179819L);
        setField(term77317, term77317.getClass(), "name", "fVdTcjgHdw");
        setIntField(term77317, term77317.getClass(), "projectId", -1867239125);
        setBooleanField(term77317, term77317.getClass(), "billable", true);
        setBooleanField(term77317, term77317.getClass(), "isArchived", true);
        setIntField(term77334, term77334.getClass(), "nanos", 790000000);
        setLongField(term77334, term77334.getClass(), "fastTime", 1646930124000L);
        setField(term77334, term77334.getClass(), "cdate", null);
        setField(term77317, term77317.getClass(), "createdDate", term77334);
        setIntField(term77337, term77337.getClass(), "nanos", 770000000);
        setLongField(term77337, term77337.getClass(), "fastTime", 1820342582000L);
        setField(term77337, term77337.getClass(), "cdate", null);
        setField(term77317, term77317.getClass(), "lastModifiedDate", term77337);
        setField(term77161, term77161.getClass(), "task", term77317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployee", argTypes, term77161, args);
    }

};


