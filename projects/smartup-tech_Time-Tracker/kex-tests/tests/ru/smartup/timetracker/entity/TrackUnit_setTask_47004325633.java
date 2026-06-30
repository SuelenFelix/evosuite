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

public class TrackUnit_setTask_47004325633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94866;
     Object term95047;

    public TrackUnit_setTask_47004325633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95071 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term95070 = ((Class) term95071).getDeclaredField((String) "SUBMITTED");
        ((Field) term95070).setAccessible(true);
        Object enum209 = ((Field) term95070).get((Object) null);
        HashMap term94990 = new HashMap();
        Set<Object> term95504 =  ((Map) term94990).keySet();
        HashSet term94989 = new HashSet((Collection<? extends Object>) term95504);
        Class<? extends Object> term95506 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term95505 = ((Class) term95506).getDeclaredField((String) "MANAGER");
        ((Field) term95505).setAccessible(true);
        Object enum210 = ((Field) term95505).get((Object) null);
        Float term95001 = new Float(0.07096106F);
        term94866 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term94868 = newInstance(Class.forName("java.sql.Date"));
        Object term94912 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94915 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94919 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term94983 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94986 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94995 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term95003 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term95018 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95021 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95024 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term95041 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95044 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term94866, term94866.getClass(), "id", -1804015692891701666L);
        setLongField(term94868, term94868.getClass(), "fastTime", 1442370534632L);
        setField(term94868, term94868.getClass(), "cdate", null);
        setField(term94866, term94866.getClass(), "workDay", term94868);
        setField(term94866, term94866.getClass(), "status", enum209);
        setFloatField(term94866, term94866.getClass(), "hours", 0.63008493F);
        setField(term94866, term94866.getClass(), "comment", "lLiSiPCciB");
        setField(term94866, term94866.getClass(), "rejectReason", "PsMKIIEwdR");
        setFloatField(term94866, term94866.getClass(), "rate", 0.97831506F);
        setBooleanField(term94866, term94866.getClass(), "billable", true);
        setLongField(term94866, term94866.getClass(), "taskId", -6432617521836576658L);
        setIntField(term94866, term94866.getClass(), "employeeId", -1626451656);
        setIntField(term94912, term94912.getClass(), "nanos", 33000000);
        setLongField(term94912, term94912.getClass(), "fastTime", 1269364590000L);
        setField(term94912, term94912.getClass(), "cdate", null);
        setField(term94866, term94866.getClass(), "createdDate", term94912);
        setIntField(term94915, term94915.getClass(), "nanos", 807000000);
        setLongField(term94915, term94915.getClass(), "fastTime", 1559313108000L);
        setField(term94915, term94915.getClass(), "cdate", null);
        setField(term94866, term94866.getClass(), "lastModifiedDate", term94915);
        setBooleanField(term94866, term94866.getClass(), "frozen", true);
        setIntField(term94919, term94919.getClass(), "id", 173952451);
        setField(term94919, term94919.getClass(), "firstName", "RbQmXqfXAT");
        setField(term94919, term94919.getClass(), "middleName", "fcCAsvfBbe");
        setField(term94919, term94919.getClass(), "lastName", "mUNcKUxghj");
        setField(term94919, term94919.getClass(), "email", "lnvLKbtveE");
        setField(term94919, term94919.getClass(), "passwordHash", "FfrrEhTHzQ");
        setIntField(term94919, term94919.getClass(), "positionId", -1972033388);
        setBooleanField(term94919, term94919.getClass(), "isArchived", true);
        setIntField(term94983, term94983.getClass(), "nanos", 523000000);
        setLongField(term94983, term94983.getClass(), "fastTime", 1725613201000L);
        setField(term94983, term94983.getClass(), "cdate", null);
        setField(term94919, term94919.getClass(), "createdDate", term94983);
        setIntField(term94986, term94986.getClass(), "nanos", 258000000);
        setLongField(term94986, term94986.getClass(), "fastTime", 1411283611000L);
        setField(term94986, term94986.getClass(), "cdate", null);
        setField(term94919, term94919.getClass(), "lastModifiedDate", term94986);
        setField(term94919, term94919.getClass(), "employeeRoles", term94989);
        setIntField(term94995, term94995.getClass(), "employeeId", -1005024758);
        setIntField(term94995, term94995.getClass(), "projectId", 2634669);
        setField(term94995, term94995.getClass(), "projectRoleId", enum210);
        setField(term94995, term94995.getClass(), "externalRate", term95001);
        setField(term94919, term94919.getClass(), "employeeProjectRole", term94995);
        setField(term94866, term94866.getClass(), "employee", term94919);
        setIntField(term95003, term95003.getClass(), "id", -1912429941);
        setField(term95003, term95003.getClass(), "name", "LXnDNrMsqT");
        setBooleanField(term95003, term95003.getClass(), "isArchived", false);
        setIntField(term95018, term95018.getClass(), "nanos", 252000000);
        setLongField(term95018, term95018.getClass(), "fastTime", 1751585839000L);
        setField(term95018, term95018.getClass(), "cdate", null);
        setField(term95003, term95003.getClass(), "createdDate", term95018);
        setIntField(term95021, term95021.getClass(), "nanos", 105000000);
        setLongField(term95021, term95021.getClass(), "fastTime", 1692400857000L);
        setField(term95021, term95021.getClass(), "cdate", null);
        setField(term95003, term95003.getClass(), "lastModifiedDate", term95021);
        setField(term94866, term94866.getClass(), "project", term95003);
        setLongField(term95024, term95024.getClass(), "id", -2255965562447970862L);
        setField(term95024, term95024.getClass(), "name", "ZLQamJFBmu");
        setIntField(term95024, term95024.getClass(), "projectId", 1801052257);
        setBooleanField(term95024, term95024.getClass(), "billable", true);
        setBooleanField(term95024, term95024.getClass(), "isArchived", false);
        setIntField(term95041, term95041.getClass(), "nanos", 414000000);
        setLongField(term95041, term95041.getClass(), "fastTime", 1737348680000L);
        setField(term95041, term95041.getClass(), "cdate", null);
        setField(term95024, term95024.getClass(), "createdDate", term95041);
        setIntField(term95044, term95044.getClass(), "nanos", 315000000);
        setLongField(term95044, term95044.getClass(), "fastTime", 1679467429000L);
        setField(term95044, term95044.getClass(), "cdate", null);
        setField(term95024, term95024.getClass(), "lastModifiedDate", term95044);
        setField(term94866, term94866.getClass(), "task", term95024);
        term95047 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term95064 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95067 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term95047, term95047.getClass(), "id", 148047808219672941L);
        setField(term95047, term95047.getClass(), "name", "ZWcOCwKNvd");
        setIntField(term95047, term95047.getClass(), "projectId", -2110556060);
        setBooleanField(term95047, term95047.getClass(), "billable", true);
        setBooleanField(term95047, term95047.getClass(), "isArchived", false);
        setIntField(term95064, term95064.getClass(), "nanos", 985000000);
        setLongField(term95064, term95064.getClass(), "fastTime", 1393415011000L);
        setField(term95064, term95064.getClass(), "cdate", null);
        setField(term95047, term95047.getClass(), "createdDate", term95064);
        setIntField(term95067, term95067.getClass(), "nanos", 518000000);
        setLongField(term95067, term95067.getClass(), "fastTime", 1697932729000L);
        setField(term95067, term95067.getClass(), "cdate", null);
        setField(term95047, term95047.getClass(), "lastModifiedDate", term95067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = term95047;
        callMethod(klass, "setTask", argTypes, term94866, args);
    }

};


