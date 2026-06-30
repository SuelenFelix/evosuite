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

public class TrackUnit_getEmployeeId_152153590411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73270;

    public TrackUnit_getEmployeeId_152153590411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73451 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term73450 = ((Class) term73451).getDeclaredField((String) "REJECTED");
        ((Field) term73450).setAccessible(true);
        Object enum165 = ((Field) term73450).get((Object) null);
        HashMap term73393 = new HashMap();
        Set<Object> term73881 =  ((Map) term73393).keySet();
        HashSet term73392 = new HashSet((Collection<? extends Object>) term73881);
        Class<? extends Object> term73883 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term73882 = ((Class) term73883).getDeclaredField((String) "MANAGER");
        ((Field) term73882).setAccessible(true);
        Object enum166 = ((Field) term73882).get((Object) null);
        Float term73404 = new Float(0.52792794F);
        term73270 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term73272 = newInstance(Class.forName("java.sql.Date"));
        Object term73315 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73318 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73322 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term73386 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73389 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73398 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term73406 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term73421 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73424 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73427 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term73444 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73447 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term73270, term73270.getClass(), "id", 5953383087795962419L);
        setLongField(term73272, term73272.getClass(), "fastTime", 1500721068023L);
        setField(term73272, term73272.getClass(), "cdate", null);
        setField(term73270, term73270.getClass(), "workDay", term73272);
        setField(term73270, term73270.getClass(), "status", enum165);
        setFloatField(term73270, term73270.getClass(), "hours", 0.8474802F);
        setField(term73270, term73270.getClass(), "comment", "dwlZSxlXOo");
        setField(term73270, term73270.getClass(), "rejectReason", "lKrEAkypza");
        setFloatField(term73270, term73270.getClass(), "rate", 0.9985961F);
        setBooleanField(term73270, term73270.getClass(), "billable", false);
        setLongField(term73270, term73270.getClass(), "taskId", 7994303628307559416L);
        setIntField(term73270, term73270.getClass(), "employeeId", -1941343035);
        setIntField(term73315, term73315.getClass(), "nanos", 265000000);
        setLongField(term73315, term73315.getClass(), "fastTime", 1422768318000L);
        setField(term73315, term73315.getClass(), "cdate", null);
        setField(term73270, term73270.getClass(), "createdDate", term73315);
        setIntField(term73318, term73318.getClass(), "nanos", 448000000);
        setLongField(term73318, term73318.getClass(), "fastTime", 1553541405000L);
        setField(term73318, term73318.getClass(), "cdate", null);
        setField(term73270, term73270.getClass(), "lastModifiedDate", term73318);
        setBooleanField(term73270, term73270.getClass(), "frozen", true);
        setIntField(term73322, term73322.getClass(), "id", 947897214);
        setField(term73322, term73322.getClass(), "firstName", "KtuuNAqGCQ");
        setField(term73322, term73322.getClass(), "middleName", "OGQsfjmReM");
        setField(term73322, term73322.getClass(), "lastName", "YsUtbngnRO");
        setField(term73322, term73322.getClass(), "email", "JisaWUxcNb");
        setField(term73322, term73322.getClass(), "passwordHash", "NxgmYPzWCI");
        setIntField(term73322, term73322.getClass(), "positionId", 1496340209);
        setBooleanField(term73322, term73322.getClass(), "isArchived", true);
        setIntField(term73386, term73386.getClass(), "nanos", 676000000);
        setLongField(term73386, term73386.getClass(), "fastTime", 1331502861000L);
        setField(term73386, term73386.getClass(), "cdate", null);
        setField(term73322, term73322.getClass(), "createdDate", term73386);
        setIntField(term73389, term73389.getClass(), "nanos", 375000000);
        setLongField(term73389, term73389.getClass(), "fastTime", 1478374056000L);
        setField(term73389, term73389.getClass(), "cdate", null);
        setField(term73322, term73322.getClass(), "lastModifiedDate", term73389);
        setField(term73322, term73322.getClass(), "employeeRoles", term73392);
        setIntField(term73398, term73398.getClass(), "employeeId", -1748391876);
        setIntField(term73398, term73398.getClass(), "projectId", 43258317);
        setField(term73398, term73398.getClass(), "projectRoleId", enum166);
        setField(term73398, term73398.getClass(), "externalRate", term73404);
        setField(term73322, term73322.getClass(), "employeeProjectRole", term73398);
        setField(term73270, term73270.getClass(), "employee", term73322);
        setIntField(term73406, term73406.getClass(), "id", 1707220033);
        setField(term73406, term73406.getClass(), "name", "SqjyKmayBx");
        setBooleanField(term73406, term73406.getClass(), "isArchived", true);
        setIntField(term73421, term73421.getClass(), "nanos", 192000000);
        setLongField(term73421, term73421.getClass(), "fastTime", 1789670910000L);
        setField(term73421, term73421.getClass(), "cdate", null);
        setField(term73406, term73406.getClass(), "createdDate", term73421);
        setIntField(term73424, term73424.getClass(), "nanos", 622000000);
        setLongField(term73424, term73424.getClass(), "fastTime", 1786363498000L);
        setField(term73424, term73424.getClass(), "cdate", null);
        setField(term73406, term73406.getClass(), "lastModifiedDate", term73424);
        setField(term73270, term73270.getClass(), "project", term73406);
        setLongField(term73427, term73427.getClass(), "id", 2443640364875054177L);
        setField(term73427, term73427.getClass(), "name", "XjDhvToxJy");
        setIntField(term73427, term73427.getClass(), "projectId", -1792504217);
        setBooleanField(term73427, term73427.getClass(), "billable", false);
        setBooleanField(term73427, term73427.getClass(), "isArchived", true);
        setIntField(term73444, term73444.getClass(), "nanos", 656000000);
        setLongField(term73444, term73444.getClass(), "fastTime", 1710591540000L);
        setField(term73444, term73444.getClass(), "cdate", null);
        setField(term73427, term73427.getClass(), "createdDate", term73444);
        setIntField(term73447, term73447.getClass(), "nanos", 969000000);
        setLongField(term73447, term73447.getClass(), "fastTime", 1766236744000L);
        setField(term73447, term73447.getClass(), "cdate", null);
        setField(term73427, term73427.getClass(), "lastModifiedDate", term73447);
        setField(term73270, term73270.getClass(), "task", term73427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term73270, args);
    }

};


