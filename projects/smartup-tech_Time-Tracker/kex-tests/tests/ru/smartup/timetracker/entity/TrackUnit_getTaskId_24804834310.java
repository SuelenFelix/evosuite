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

public class TrackUnit_getTaskId_24804834310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72293;

    public TrackUnit_getTaskId_24804834310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72475 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term72474 = ((Class) term72475).getDeclaredField((String) "SUBMITTED");
        ((Field) term72474).setAccessible(true);
        Object enum163 = ((Field) term72474).get((Object) null);
        HashMap term72417 = new HashMap();
        Set<Object> term72908 =  ((Map) term72417).keySet();
        HashSet term72416 = new HashSet((Collection<? extends Object>) term72908);
        Class<? extends Object> term72910 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term72909 = ((Class) term72910).getDeclaredField((String) "EMPLOYEE");
        ((Field) term72909).setAccessible(true);
        Object enum164 = ((Field) term72909).get((Object) null);
        Float term72428 = new Float(0.36114347F);
        term72293 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term72295 = newInstance(Class.forName("java.sql.Date"));
        Object term72339 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72342 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72346 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term72410 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72413 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72422 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term72430 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term72445 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72448 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72451 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term72468 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72471 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term72293, term72293.getClass(), "id", 3825396310311739952L);
        setLongField(term72295, term72295.getClass(), "fastTime", 1645834034896L);
        setField(term72295, term72295.getClass(), "cdate", null);
        setField(term72293, term72293.getClass(), "workDay", term72295);
        setField(term72293, term72293.getClass(), "status", enum163);
        setFloatField(term72293, term72293.getClass(), "hours", 0.37773192F);
        setField(term72293, term72293.getClass(), "comment", "SScVQYSvWH");
        setField(term72293, term72293.getClass(), "rejectReason", "MnovcqFhCl");
        setFloatField(term72293, term72293.getClass(), "rate", 0.24413109F);
        setBooleanField(term72293, term72293.getClass(), "billable", true);
        setLongField(term72293, term72293.getClass(), "taskId", -3838084482494604218L);
        setIntField(term72293, term72293.getClass(), "employeeId", 1723148410);
        setIntField(term72339, term72339.getClass(), "nanos", 232000000);
        setLongField(term72339, term72339.getClass(), "fastTime", 1526971378000L);
        setField(term72339, term72339.getClass(), "cdate", null);
        setField(term72293, term72293.getClass(), "createdDate", term72339);
        setIntField(term72342, term72342.getClass(), "nanos", 197000000);
        setLongField(term72342, term72342.getClass(), "fastTime", 1308367394000L);
        setField(term72342, term72342.getClass(), "cdate", null);
        setField(term72293, term72293.getClass(), "lastModifiedDate", term72342);
        setBooleanField(term72293, term72293.getClass(), "frozen", false);
        setIntField(term72346, term72346.getClass(), "id", -920797484);
        setField(term72346, term72346.getClass(), "firstName", "qYtAeLzOhW");
        setField(term72346, term72346.getClass(), "middleName", "tJzmOfcUnY");
        setField(term72346, term72346.getClass(), "lastName", "TKlccZUpjz");
        setField(term72346, term72346.getClass(), "email", "GGzwMoHZXC");
        setField(term72346, term72346.getClass(), "passwordHash", "IpmgwHTgnG");
        setIntField(term72346, term72346.getClass(), "positionId", -1631697577);
        setBooleanField(term72346, term72346.getClass(), "isArchived", false);
        setIntField(term72410, term72410.getClass(), "nanos", 363000000);
        setLongField(term72410, term72410.getClass(), "fastTime", 1647395823000L);
        setField(term72410, term72410.getClass(), "cdate", null);
        setField(term72346, term72346.getClass(), "createdDate", term72410);
        setIntField(term72413, term72413.getClass(), "nanos", 303000000);
        setLongField(term72413, term72413.getClass(), "fastTime", 1312373268000L);
        setField(term72413, term72413.getClass(), "cdate", null);
        setField(term72346, term72346.getClass(), "lastModifiedDate", term72413);
        setField(term72346, term72346.getClass(), "employeeRoles", term72416);
        setIntField(term72422, term72422.getClass(), "employeeId", 765731371);
        setIntField(term72422, term72422.getClass(), "projectId", -1703035419);
        setField(term72422, term72422.getClass(), "projectRoleId", enum164);
        setField(term72422, term72422.getClass(), "externalRate", term72428);
        setField(term72346, term72346.getClass(), "employeeProjectRole", term72422);
        setField(term72293, term72293.getClass(), "employee", term72346);
        setIntField(term72430, term72430.getClass(), "id", 765766290);
        setField(term72430, term72430.getClass(), "name", "tIpkeYIezR");
        setBooleanField(term72430, term72430.getClass(), "isArchived", true);
        setIntField(term72445, term72445.getClass(), "nanos", 284000000);
        setLongField(term72445, term72445.getClass(), "fastTime", 1535955865000L);
        setField(term72445, term72445.getClass(), "cdate", null);
        setField(term72430, term72430.getClass(), "createdDate", term72445);
        setIntField(term72448, term72448.getClass(), "nanos", 58000000);
        setLongField(term72448, term72448.getClass(), "fastTime", 1842771287000L);
        setField(term72448, term72448.getClass(), "cdate", null);
        setField(term72430, term72430.getClass(), "lastModifiedDate", term72448);
        setField(term72293, term72293.getClass(), "project", term72430);
        setLongField(term72451, term72451.getClass(), "id", 3892018155439224435L);
        setField(term72451, term72451.getClass(), "name", "YkZtEtthvz");
        setIntField(term72451, term72451.getClass(), "projectId", -1284825282);
        setBooleanField(term72451, term72451.getClass(), "billable", false);
        setBooleanField(term72451, term72451.getClass(), "isArchived", true);
        setIntField(term72468, term72468.getClass(), "nanos", 295000000);
        setLongField(term72468, term72468.getClass(), "fastTime", 1629683099000L);
        setField(term72468, term72468.getClass(), "cdate", null);
        setField(term72451, term72451.getClass(), "createdDate", term72468);
        setIntField(term72471, term72471.getClass(), "nanos", 593000000);
        setLongField(term72471, term72471.getClass(), "fastTime", 1826240941000L);
        setField(term72471, term72471.getClass(), "cdate", null);
        setField(term72451, term72451.getClass(), "lastModifiedDate", term72471);
        setField(term72293, term72293.getClass(), "task", term72451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term72293, args);
    }

};


