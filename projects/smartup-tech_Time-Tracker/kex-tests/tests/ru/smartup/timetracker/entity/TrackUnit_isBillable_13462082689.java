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

public class TrackUnit_isBillable_13462082689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71320;

    public TrackUnit_isBillable_13462082689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71501 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term71500 = ((Class) term71501).getDeclaredField((String) "APPROVED");
        ((Field) term71500).setAccessible(true);
        Object enum161 = ((Field) term71500).get((Object) null);
        HashMap term71443 = new HashMap();
        Set<Object> term71931 =  ((Map) term71443).keySet();
        HashSet term71442 = new HashSet((Collection<? extends Object>) term71931);
        Class<? extends Object> term71933 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term71932 = ((Class) term71933).getDeclaredField((String) "EMPLOYEE");
        ((Field) term71932).setAccessible(true);
        Object enum162 = ((Field) term71932).get((Object) null);
        Float term71454 = new Float(0.07802445F);
        term71320 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term71322 = newInstance(Class.forName("java.sql.Date"));
        Object term71365 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71368 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71372 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term71436 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71439 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71448 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term71456 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term71471 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71474 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71477 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term71494 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71497 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term71320, term71320.getClass(), "id", -2644215923136513282L);
        setLongField(term71322, term71322.getClass(), "fastTime", 1495357463288L);
        setField(term71322, term71322.getClass(), "cdate", null);
        setField(term71320, term71320.getClass(), "workDay", term71322);
        setField(term71320, term71320.getClass(), "status", enum161);
        setFloatField(term71320, term71320.getClass(), "hours", 0.6076495F);
        setField(term71320, term71320.getClass(), "comment", "uXYcXVYJZM");
        setField(term71320, term71320.getClass(), "rejectReason", "BJhjdJUhkz");
        setFloatField(term71320, term71320.getClass(), "rate", 0.6608425F);
        setBooleanField(term71320, term71320.getClass(), "billable", false);
        setLongField(term71320, term71320.getClass(), "taskId", -1468719814009985452L);
        setIntField(term71320, term71320.getClass(), "employeeId", 1334483645);
        setIntField(term71365, term71365.getClass(), "nanos", 859000000);
        setLongField(term71365, term71365.getClass(), "fastTime", 1263127452000L);
        setField(term71365, term71365.getClass(), "cdate", null);
        setField(term71320, term71320.getClass(), "createdDate", term71365);
        setIntField(term71368, term71368.getClass(), "nanos", 333000000);
        setLongField(term71368, term71368.getClass(), "fastTime", 1603404389000L);
        setField(term71368, term71368.getClass(), "cdate", null);
        setField(term71320, term71320.getClass(), "lastModifiedDate", term71368);
        setBooleanField(term71320, term71320.getClass(), "frozen", false);
        setIntField(term71372, term71372.getClass(), "id", 917513193);
        setField(term71372, term71372.getClass(), "firstName", "cdHYQDgUZR");
        setField(term71372, term71372.getClass(), "middleName", "KAORSSPSeV");
        setField(term71372, term71372.getClass(), "lastName", "UimMMORkzd");
        setField(term71372, term71372.getClass(), "email", "huVIXUWLtI");
        setField(term71372, term71372.getClass(), "passwordHash", "vhKzFyKPOT");
        setIntField(term71372, term71372.getClass(), "positionId", 787278105);
        setBooleanField(term71372, term71372.getClass(), "isArchived", true);
        setIntField(term71436, term71436.getClass(), "nanos", 815000000);
        setLongField(term71436, term71436.getClass(), "fastTime", 1841219235000L);
        setField(term71436, term71436.getClass(), "cdate", null);
        setField(term71372, term71372.getClass(), "createdDate", term71436);
        setIntField(term71439, term71439.getClass(), "nanos", 766000000);
        setLongField(term71439, term71439.getClass(), "fastTime", 1502410109000L);
        setField(term71439, term71439.getClass(), "cdate", null);
        setField(term71372, term71372.getClass(), "lastModifiedDate", term71439);
        setField(term71372, term71372.getClass(), "employeeRoles", term71442);
        setIntField(term71448, term71448.getClass(), "employeeId", -2063843486);
        setIntField(term71448, term71448.getClass(), "projectId", 833762980);
        setField(term71448, term71448.getClass(), "projectRoleId", enum162);
        setField(term71448, term71448.getClass(), "externalRate", term71454);
        setField(term71372, term71372.getClass(), "employeeProjectRole", term71448);
        setField(term71320, term71320.getClass(), "employee", term71372);
        setIntField(term71456, term71456.getClass(), "id", 320711637);
        setField(term71456, term71456.getClass(), "name", "nQhIgWXdRc");
        setBooleanField(term71456, term71456.getClass(), "isArchived", true);
        setIntField(term71471, term71471.getClass(), "nanos", 220000000);
        setLongField(term71471, term71471.getClass(), "fastTime", 1685481840000L);
        setField(term71471, term71471.getClass(), "cdate", null);
        setField(term71456, term71456.getClass(), "createdDate", term71471);
        setIntField(term71474, term71474.getClass(), "nanos", 681000000);
        setLongField(term71474, term71474.getClass(), "fastTime", 1654446438000L);
        setField(term71474, term71474.getClass(), "cdate", null);
        setField(term71456, term71456.getClass(), "lastModifiedDate", term71474);
        setField(term71320, term71320.getClass(), "project", term71456);
        setLongField(term71477, term71477.getClass(), "id", -7738503207562305297L);
        setField(term71477, term71477.getClass(), "name", "EusenEbIoF");
        setIntField(term71477, term71477.getClass(), "projectId", 1241164745);
        setBooleanField(term71477, term71477.getClass(), "billable", false);
        setBooleanField(term71477, term71477.getClass(), "isArchived", true);
        setIntField(term71494, term71494.getClass(), "nanos", 779000000);
        setLongField(term71494, term71494.getClass(), "fastTime", 1603662687000L);
        setField(term71494, term71494.getClass(), "cdate", null);
        setField(term71477, term71477.getClass(), "createdDate", term71494);
        setIntField(term71497, term71497.getClass(), "nanos", 235000000);
        setLongField(term71497, term71497.getClass(), "fastTime", 1262691167000L);
        setField(term71497, term71497.getClass(), "cdate", null);
        setField(term71477, term71477.getClass(), "lastModifiedDate", term71497);
        setField(term71320, term71320.getClass(), "task", term71477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term71320, args);
    }

};


