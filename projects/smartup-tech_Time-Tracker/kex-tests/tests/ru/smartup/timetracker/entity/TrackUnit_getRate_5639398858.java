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

public class TrackUnit_getRate_5639398858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70343;

    public TrackUnit_getRate_5639398858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70525 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term70524 = ((Class) term70525).getDeclaredField((String) "SUBMITTED");
        ((Field) term70524).setAccessible(true);
        Object enum159 = ((Field) term70524).get((Object) null);
        HashMap term70467 = new HashMap();
        Set<Object> term70958 =  ((Map) term70467).keySet();
        HashSet term70466 = new HashSet((Collection<? extends Object>) term70958);
        Class<? extends Object> term70960 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term70959 = ((Class) term70960).getDeclaredField((String) "EMPLOYEE");
        ((Field) term70959).setAccessible(true);
        Object enum160 = ((Field) term70959).get((Object) null);
        Float term70478 = new Float(0.2946385F);
        term70343 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term70345 = newInstance(Class.forName("java.sql.Date"));
        Object term70389 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70392 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70396 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term70460 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70463 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70472 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term70480 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term70495 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70498 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70501 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term70518 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70521 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term70343, term70343.getClass(), "id", 2936323121573284007L);
        setLongField(term70345, term70345.getClass(), "fastTime", 1429023851389L);
        setField(term70345, term70345.getClass(), "cdate", null);
        setField(term70343, term70343.getClass(), "workDay", term70345);
        setField(term70343, term70343.getClass(), "status", enum159);
        setFloatField(term70343, term70343.getClass(), "hours", 0.3692338F);
        setField(term70343, term70343.getClass(), "comment", "HhEaSXWvrY");
        setField(term70343, term70343.getClass(), "rejectReason", "CVRGEomOth");
        setFloatField(term70343, term70343.getClass(), "rate", 0.13906479F);
        setBooleanField(term70343, term70343.getClass(), "billable", false);
        setLongField(term70343, term70343.getClass(), "taskId", -1154553077993834885L);
        setIntField(term70343, term70343.getClass(), "employeeId", 301401782);
        setIntField(term70389, term70389.getClass(), "nanos", 683000000);
        setLongField(term70389, term70389.getClass(), "fastTime", 1268266069000L);
        setField(term70389, term70389.getClass(), "cdate", null);
        setField(term70343, term70343.getClass(), "createdDate", term70389);
        setIntField(term70392, term70392.getClass(), "nanos", 32000000);
        setLongField(term70392, term70392.getClass(), "fastTime", 1389364996000L);
        setField(term70392, term70392.getClass(), "cdate", null);
        setField(term70343, term70343.getClass(), "lastModifiedDate", term70392);
        setBooleanField(term70343, term70343.getClass(), "frozen", true);
        setIntField(term70396, term70396.getClass(), "id", 1988605357);
        setField(term70396, term70396.getClass(), "firstName", "vSeruUyNWX");
        setField(term70396, term70396.getClass(), "middleName", "UkKvaeJfEC");
        setField(term70396, term70396.getClass(), "lastName", "WPxXsahPRq");
        setField(term70396, term70396.getClass(), "email", "IENRuqmwUU");
        setField(term70396, term70396.getClass(), "passwordHash", "GsWxOwXvSu");
        setIntField(term70396, term70396.getClass(), "positionId", 808203320);
        setBooleanField(term70396, term70396.getClass(), "isArchived", false);
        setIntField(term70460, term70460.getClass(), "nanos", 281000000);
        setLongField(term70460, term70460.getClass(), "fastTime", 1472048791000L);
        setField(term70460, term70460.getClass(), "cdate", null);
        setField(term70396, term70396.getClass(), "createdDate", term70460);
        setIntField(term70463, term70463.getClass(), "nanos", 272000000);
        setLongField(term70463, term70463.getClass(), "fastTime", 1379454344000L);
        setField(term70463, term70463.getClass(), "cdate", null);
        setField(term70396, term70396.getClass(), "lastModifiedDate", term70463);
        setField(term70396, term70396.getClass(), "employeeRoles", term70466);
        setIntField(term70472, term70472.getClass(), "employeeId", -544382127);
        setIntField(term70472, term70472.getClass(), "projectId", -1830198043);
        setField(term70472, term70472.getClass(), "projectRoleId", enum160);
        setField(term70472, term70472.getClass(), "externalRate", term70478);
        setField(term70396, term70396.getClass(), "employeeProjectRole", term70472);
        setField(term70343, term70343.getClass(), "employee", term70396);
        setIntField(term70480, term70480.getClass(), "id", -439048495);
        setField(term70480, term70480.getClass(), "name", "bKBSncrMEZ");
        setBooleanField(term70480, term70480.getClass(), "isArchived", false);
        setIntField(term70495, term70495.getClass(), "nanos", 138000000);
        setLongField(term70495, term70495.getClass(), "fastTime", 1873141434000L);
        setField(term70495, term70495.getClass(), "cdate", null);
        setField(term70480, term70480.getClass(), "createdDate", term70495);
        setIntField(term70498, term70498.getClass(), "nanos", 287000000);
        setLongField(term70498, term70498.getClass(), "fastTime", 1469008541000L);
        setField(term70498, term70498.getClass(), "cdate", null);
        setField(term70480, term70480.getClass(), "lastModifiedDate", term70498);
        setField(term70343, term70343.getClass(), "project", term70480);
        setLongField(term70501, term70501.getClass(), "id", -2850532706972744550L);
        setField(term70501, term70501.getClass(), "name", "yeSXGqQExb");
        setIntField(term70501, term70501.getClass(), "projectId", -1849105286);
        setBooleanField(term70501, term70501.getClass(), "billable", false);
        setBooleanField(term70501, term70501.getClass(), "isArchived", true);
        setIntField(term70518, term70518.getClass(), "nanos", 966000000);
        setLongField(term70518, term70518.getClass(), "fastTime", 1349071775000L);
        setField(term70518, term70518.getClass(), "cdate", null);
        setField(term70501, term70501.getClass(), "createdDate", term70518);
        setIntField(term70521, term70521.getClass(), "nanos", 227000000);
        setLongField(term70521, term70521.getClass(), "fastTime", 1713522139000L);
        setField(term70521, term70521.getClass(), "cdate", null);
        setField(term70501, term70501.getClass(), "lastModifiedDate", term70521);
        setField(term70343, term70343.getClass(), "task", term70501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term70343, args);
    }

};


