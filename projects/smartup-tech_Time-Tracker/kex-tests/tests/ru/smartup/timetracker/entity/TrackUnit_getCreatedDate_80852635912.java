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

public class TrackUnit_getCreatedDate_80852635912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74240;

    public TrackUnit_getCreatedDate_80852635912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74422 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term74421 = ((Class) term74422).getDeclaredField((String) "SUBMITTED");
        ((Field) term74421).setAccessible(true);
        Object enum167 = ((Field) term74421).get((Object) null);
        HashMap term74364 = new HashMap();
        Set<Object> term74855 =  ((Map) term74364).keySet();
        HashSet term74363 = new HashSet((Collection<? extends Object>) term74855);
        Class<? extends Object> term74857 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term74856 = ((Class) term74857).getDeclaredField((String) "EMPLOYEE");
        ((Field) term74856).setAccessible(true);
        Object enum168 = ((Field) term74856).get((Object) null);
        Float term74375 = new Float(0.24759698F);
        term74240 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term74242 = newInstance(Class.forName("java.sql.Date"));
        Object term74286 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74289 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74293 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term74357 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74360 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74369 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term74377 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term74392 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74395 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74398 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term74415 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74418 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term74240, term74240.getClass(), "id", -1610676979013636850L);
        setLongField(term74242, term74242.getClass(), "fastTime", 1797203628025L);
        setField(term74242, term74242.getClass(), "cdate", null);
        setField(term74240, term74240.getClass(), "workDay", term74242);
        setField(term74240, term74240.getClass(), "status", enum167);
        setFloatField(term74240, term74240.getClass(), "hours", 0.51832694F);
        setField(term74240, term74240.getClass(), "comment", "nxSTJflLQy");
        setField(term74240, term74240.getClass(), "rejectReason", "FlHzxEfFzI");
        setFloatField(term74240, term74240.getClass(), "rate", 0.97262454F);
        setBooleanField(term74240, term74240.getClass(), "billable", false);
        setLongField(term74240, term74240.getClass(), "taskId", 2062173786000223358L);
        setIntField(term74240, term74240.getClass(), "employeeId", 1824538861);
        setIntField(term74286, term74286.getClass(), "nanos", 635000000);
        setLongField(term74286, term74286.getClass(), "fastTime", 1690373347000L);
        setField(term74286, term74286.getClass(), "cdate", null);
        setField(term74240, term74240.getClass(), "createdDate", term74286);
        setIntField(term74289, term74289.getClass(), "nanos", 507000000);
        setLongField(term74289, term74289.getClass(), "fastTime", 1670321963000L);
        setField(term74289, term74289.getClass(), "cdate", null);
        setField(term74240, term74240.getClass(), "lastModifiedDate", term74289);
        setBooleanField(term74240, term74240.getClass(), "frozen", true);
        setIntField(term74293, term74293.getClass(), "id", 499519708);
        setField(term74293, term74293.getClass(), "firstName", "aSATgQUpoe");
        setField(term74293, term74293.getClass(), "middleName", "VkPSXewZfB");
        setField(term74293, term74293.getClass(), "lastName", "ubodzJoMGW");
        setField(term74293, term74293.getClass(), "email", "weddIktxOA");
        setField(term74293, term74293.getClass(), "passwordHash", "uSlMeISsDD");
        setIntField(term74293, term74293.getClass(), "positionId", 1501165033);
        setBooleanField(term74293, term74293.getClass(), "isArchived", false);
        setIntField(term74357, term74357.getClass(), "nanos", 114000000);
        setLongField(term74357, term74357.getClass(), "fastTime", 1667307004000L);
        setField(term74357, term74357.getClass(), "cdate", null);
        setField(term74293, term74293.getClass(), "createdDate", term74357);
        setIntField(term74360, term74360.getClass(), "nanos", 710000000);
        setLongField(term74360, term74360.getClass(), "fastTime", 1643813374000L);
        setField(term74360, term74360.getClass(), "cdate", null);
        setField(term74293, term74293.getClass(), "lastModifiedDate", term74360);
        setField(term74293, term74293.getClass(), "employeeRoles", term74363);
        setIntField(term74369, term74369.getClass(), "employeeId", 510162332);
        setIntField(term74369, term74369.getClass(), "projectId", 888506903);
        setField(term74369, term74369.getClass(), "projectRoleId", enum168);
        setField(term74369, term74369.getClass(), "externalRate", term74375);
        setField(term74293, term74293.getClass(), "employeeProjectRole", term74369);
        setField(term74240, term74240.getClass(), "employee", term74293);
        setIntField(term74377, term74377.getClass(), "id", 200252898);
        setField(term74377, term74377.getClass(), "name", "WdCiTDUKqn");
        setBooleanField(term74377, term74377.getClass(), "isArchived", false);
        setIntField(term74392, term74392.getClass(), "nanos", 419000000);
        setLongField(term74392, term74392.getClass(), "fastTime", 1589276510000L);
        setField(term74392, term74392.getClass(), "cdate", null);
        setField(term74377, term74377.getClass(), "createdDate", term74392);
        setIntField(term74395, term74395.getClass(), "nanos", 84000000);
        setLongField(term74395, term74395.getClass(), "fastTime", 1689818192000L);
        setField(term74395, term74395.getClass(), "cdate", null);
        setField(term74377, term74377.getClass(), "lastModifiedDate", term74395);
        setField(term74240, term74240.getClass(), "project", term74377);
        setLongField(term74398, term74398.getClass(), "id", -8658027316505137504L);
        setField(term74398, term74398.getClass(), "name", "PSizQDoxxe");
        setIntField(term74398, term74398.getClass(), "projectId", -1831826725);
        setBooleanField(term74398, term74398.getClass(), "billable", true);
        setBooleanField(term74398, term74398.getClass(), "isArchived", true);
        setIntField(term74415, term74415.getClass(), "nanos", 763000000);
        setLongField(term74415, term74415.getClass(), "fastTime", 1288585930000L);
        setField(term74415, term74415.getClass(), "cdate", null);
        setField(term74398, term74398.getClass(), "createdDate", term74415);
        setIntField(term74418, term74418.getClass(), "nanos", 959000000);
        setLongField(term74418, term74418.getClass(), "fastTime", 1842226800000L);
        setField(term74418, term74418.getClass(), "cdate", null);
        setField(term74398, term74398.getClass(), "lastModifiedDate", term74418);
        setField(term74240, term74240.getClass(), "task", term74398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term74240, args);
    }

};


