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

public class TrackUnit_getHours_8155118305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67427;

    public TrackUnit_getHours_8155118305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67608 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term67607 = ((Class) term67608).getDeclaredField((String) "REJECTED");
        ((Field) term67607).setAccessible(true);
        Object enum153 = ((Field) term67607).get((Object) null);
        HashMap term67550 = new HashMap();
        Set<Object> term68038 =  ((Map) term67550).keySet();
        HashSet term67549 = new HashSet((Collection<? extends Object>) term68038);
        Class<? extends Object> term68040 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term68039 = ((Class) term68040).getDeclaredField((String) "EMPLOYEE");
        ((Field) term68039).setAccessible(true);
        Object enum154 = ((Field) term68039).get((Object) null);
        Float term67561 = new Float(0.06688923F);
        term67427 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term67429 = newInstance(Class.forName("java.sql.Date"));
        Object term67472 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67475 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67479 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term67543 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67546 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67555 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term67563 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term67578 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67581 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67584 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term67601 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term67604 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term67427, term67427.getClass(), "id", -6292278961887936280L);
        setLongField(term67429, term67429.getClass(), "fastTime", 1606045635837L);
        setField(term67429, term67429.getClass(), "cdate", null);
        setField(term67427, term67427.getClass(), "workDay", term67429);
        setField(term67427, term67427.getClass(), "status", enum153);
        setFloatField(term67427, term67427.getClass(), "hours", 0.2857073F);
        setField(term67427, term67427.getClass(), "comment", "bdyhHbDAmJ");
        setField(term67427, term67427.getClass(), "rejectReason", "BBXiTNHqGE");
        setFloatField(term67427, term67427.getClass(), "rate", 0.6880585F);
        setBooleanField(term67427, term67427.getClass(), "billable", true);
        setLongField(term67427, term67427.getClass(), "taskId", -6645965768855543712L);
        setIntField(term67427, term67427.getClass(), "employeeId", -1938881385);
        setIntField(term67472, term67472.getClass(), "nanos", 814000000);
        setLongField(term67472, term67472.getClass(), "fastTime", 1498604526000L);
        setField(term67472, term67472.getClass(), "cdate", null);
        setField(term67427, term67427.getClass(), "createdDate", term67472);
        setIntField(term67475, term67475.getClass(), "nanos", 879000000);
        setLongField(term67475, term67475.getClass(), "fastTime", 1578532431000L);
        setField(term67475, term67475.getClass(), "cdate", null);
        setField(term67427, term67427.getClass(), "lastModifiedDate", term67475);
        setBooleanField(term67427, term67427.getClass(), "frozen", true);
        setIntField(term67479, term67479.getClass(), "id", -1629418973);
        setField(term67479, term67479.getClass(), "firstName", "IEYhJmgCVd");
        setField(term67479, term67479.getClass(), "middleName", "KSJeYkkvpk");
        setField(term67479, term67479.getClass(), "lastName", "qUtkFGMNUV");
        setField(term67479, term67479.getClass(), "email", "mGRiYhnMcR");
        setField(term67479, term67479.getClass(), "passwordHash", "NFlvfJCVPO");
        setIntField(term67479, term67479.getClass(), "positionId", -100825168);
        setBooleanField(term67479, term67479.getClass(), "isArchived", true);
        setIntField(term67543, term67543.getClass(), "nanos", 939000000);
        setLongField(term67543, term67543.getClass(), "fastTime", 1476086371000L);
        setField(term67543, term67543.getClass(), "cdate", null);
        setField(term67479, term67479.getClass(), "createdDate", term67543);
        setIntField(term67546, term67546.getClass(), "nanos", 111000000);
        setLongField(term67546, term67546.getClass(), "fastTime", 1890426666000L);
        setField(term67546, term67546.getClass(), "cdate", null);
        setField(term67479, term67479.getClass(), "lastModifiedDate", term67546);
        setField(term67479, term67479.getClass(), "employeeRoles", term67549);
        setIntField(term67555, term67555.getClass(), "employeeId", 768407648);
        setIntField(term67555, term67555.getClass(), "projectId", -350454594);
        setField(term67555, term67555.getClass(), "projectRoleId", enum154);
        setField(term67555, term67555.getClass(), "externalRate", term67561);
        setField(term67479, term67479.getClass(), "employeeProjectRole", term67555);
        setField(term67427, term67427.getClass(), "employee", term67479);
        setIntField(term67563, term67563.getClass(), "id", -1148142995);
        setField(term67563, term67563.getClass(), "name", "KarbTXFmUU");
        setBooleanField(term67563, term67563.getClass(), "isArchived", false);
        setIntField(term67578, term67578.getClass(), "nanos", 23000000);
        setLongField(term67578, term67578.getClass(), "fastTime", 1401533135000L);
        setField(term67578, term67578.getClass(), "cdate", null);
        setField(term67563, term67563.getClass(), "createdDate", term67578);
        setIntField(term67581, term67581.getClass(), "nanos", 917000000);
        setLongField(term67581, term67581.getClass(), "fastTime", 1439695359000L);
        setField(term67581, term67581.getClass(), "cdate", null);
        setField(term67563, term67563.getClass(), "lastModifiedDate", term67581);
        setField(term67427, term67427.getClass(), "project", term67563);
        setLongField(term67584, term67584.getClass(), "id", 4784595517102746672L);
        setField(term67584, term67584.getClass(), "name", "jiUSjqwSIQ");
        setIntField(term67584, term67584.getClass(), "projectId", -233024044);
        setBooleanField(term67584, term67584.getClass(), "billable", true);
        setBooleanField(term67584, term67584.getClass(), "isArchived", false);
        setIntField(term67601, term67601.getClass(), "nanos", 443000000);
        setLongField(term67601, term67601.getClass(), "fastTime", 1293726798000L);
        setField(term67601, term67601.getClass(), "cdate", null);
        setField(term67584, term67584.getClass(), "createdDate", term67601);
        setIntField(term67604, term67604.getClass(), "nanos", 349000000);
        setLongField(term67604, term67604.getClass(), "fastTime", 1818606356000L);
        setField(term67604, term67604.getClass(), "cdate", null);
        setField(term67584, term67584.getClass(), "lastModifiedDate", term67604);
        setField(term67427, term67427.getClass(), "task", term67584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term67427, args);
    }

};


