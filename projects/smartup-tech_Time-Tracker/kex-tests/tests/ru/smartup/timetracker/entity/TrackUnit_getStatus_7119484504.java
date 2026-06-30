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

public class TrackUnit_getStatus_7119484504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66457;

    public TrackUnit_getStatus_7119484504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66638 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term66637 = ((Class) term66638).getDeclaredField((String) "APPROVED");
        ((Field) term66637).setAccessible(true);
        Object enum151 = ((Field) term66637).get((Object) null);
        HashMap term66580 = new HashMap();
        Set<Object> term67068 =  ((Map) term66580).keySet();
        HashSet term66579 = new HashSet((Collection<? extends Object>) term67068);
        Class<? extends Object> term67070 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term67069 = ((Class) term67070).getDeclaredField((String) "MANAGER");
        ((Field) term67069).setAccessible(true);
        Object enum152 = ((Field) term67069).get((Object) null);
        Float term66591 = new Float(0.21723765F);
        term66457 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term66459 = newInstance(Class.forName("java.sql.Date"));
        Object term66502 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66505 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66509 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term66573 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66576 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66585 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term66593 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term66608 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66611 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66614 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term66631 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term66634 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term66457, term66457.getClass(), "id", 5907001541142728739L);
        setLongField(term66459, term66459.getClass(), "fastTime", 1610940182830L);
        setField(term66459, term66459.getClass(), "cdate", null);
        setField(term66457, term66457.getClass(), "workDay", term66459);
        setField(term66457, term66457.getClass(), "status", enum151);
        setFloatField(term66457, term66457.getClass(), "hours", 0.5446086F);
        setField(term66457, term66457.getClass(), "comment", "JOqQxuzRuZ");
        setField(term66457, term66457.getClass(), "rejectReason", "RSaoipUlsg");
        setFloatField(term66457, term66457.getClass(), "rate", 0.5254275F);
        setBooleanField(term66457, term66457.getClass(), "billable", false);
        setLongField(term66457, term66457.getClass(), "taskId", 4178434741742309755L);
        setIntField(term66457, term66457.getClass(), "employeeId", 1698510819);
        setIntField(term66502, term66502.getClass(), "nanos", 454000000);
        setLongField(term66502, term66502.getClass(), "fastTime", 1390689541000L);
        setField(term66502, term66502.getClass(), "cdate", null);
        setField(term66457, term66457.getClass(), "createdDate", term66502);
        setIntField(term66505, term66505.getClass(), "nanos", 62000000);
        setLongField(term66505, term66505.getClass(), "fastTime", 1325970576000L);
        setField(term66505, term66505.getClass(), "cdate", null);
        setField(term66457, term66457.getClass(), "lastModifiedDate", term66505);
        setBooleanField(term66457, term66457.getClass(), "frozen", true);
        setIntField(term66509, term66509.getClass(), "id", -1553893255);
        setField(term66509, term66509.getClass(), "firstName", "cSHGbqKqlN");
        setField(term66509, term66509.getClass(), "middleName", "pFAfANnxup");
        setField(term66509, term66509.getClass(), "lastName", "FbSIUZyBXZ");
        setField(term66509, term66509.getClass(), "email", "mhQDwIyrRi");
        setField(term66509, term66509.getClass(), "passwordHash", "HpZXWDPhlg");
        setIntField(term66509, term66509.getClass(), "positionId", 1303442927);
        setBooleanField(term66509, term66509.getClass(), "isArchived", false);
        setIntField(term66573, term66573.getClass(), "nanos", 856000000);
        setLongField(term66573, term66573.getClass(), "fastTime", 1638321131000L);
        setField(term66573, term66573.getClass(), "cdate", null);
        setField(term66509, term66509.getClass(), "createdDate", term66573);
        setIntField(term66576, term66576.getClass(), "nanos", 466000000);
        setLongField(term66576, term66576.getClass(), "fastTime", 1891146998000L);
        setField(term66576, term66576.getClass(), "cdate", null);
        setField(term66509, term66509.getClass(), "lastModifiedDate", term66576);
        setField(term66509, term66509.getClass(), "employeeRoles", term66579);
        setIntField(term66585, term66585.getClass(), "employeeId", 794568325);
        setIntField(term66585, term66585.getClass(), "projectId", -434468428);
        setField(term66585, term66585.getClass(), "projectRoleId", enum152);
        setField(term66585, term66585.getClass(), "externalRate", term66591);
        setField(term66509, term66509.getClass(), "employeeProjectRole", term66585);
        setField(term66457, term66457.getClass(), "employee", term66509);
        setIntField(term66593, term66593.getClass(), "id", 1559605714);
        setField(term66593, term66593.getClass(), "name", "lBOokzEPfe");
        setBooleanField(term66593, term66593.getClass(), "isArchived", true);
        setIntField(term66608, term66608.getClass(), "nanos", 142000000);
        setLongField(term66608, term66608.getClass(), "fastTime", 1460967810000L);
        setField(term66608, term66608.getClass(), "cdate", null);
        setField(term66593, term66593.getClass(), "createdDate", term66608);
        setIntField(term66611, term66611.getClass(), "nanos", 858000000);
        setLongField(term66611, term66611.getClass(), "fastTime", 1418894925000L);
        setField(term66611, term66611.getClass(), "cdate", null);
        setField(term66593, term66593.getClass(), "lastModifiedDate", term66611);
        setField(term66457, term66457.getClass(), "project", term66593);
        setLongField(term66614, term66614.getClass(), "id", -2068172595987555756L);
        setField(term66614, term66614.getClass(), "name", "dtGZCsKXbW");
        setIntField(term66614, term66614.getClass(), "projectId", 1146601902);
        setBooleanField(term66614, term66614.getClass(), "billable", false);
        setBooleanField(term66614, term66614.getClass(), "isArchived", false);
        setIntField(term66631, term66631.getClass(), "nanos", 971000000);
        setLongField(term66631, term66631.getClass(), "fastTime", 1837498636000L);
        setField(term66631, term66631.getClass(), "cdate", null);
        setField(term66614, term66614.getClass(), "createdDate", term66631);
        setIntField(term66634, term66634.getClass(), "nanos", 235000000);
        setLongField(term66634, term66634.getClass(), "fastTime", 1732167331000L);
        setField(term66634, term66634.getClass(), "cdate", null);
        setField(term66614, term66614.getClass(), "lastModifiedDate", term66634);
        setField(term66457, term66457.getClass(), "task", term66614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term66457, args);
    }

};


