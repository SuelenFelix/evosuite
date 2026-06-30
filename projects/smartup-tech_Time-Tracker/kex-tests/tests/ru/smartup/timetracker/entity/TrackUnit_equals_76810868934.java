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

public class TrackUnit_equals_76810868934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95873;
     Object term96053;

    public TrackUnit_equals_76810868934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96055 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term96054 = ((Class) term96055).getDeclaredField((String) "APPROVED");
        ((Field) term96054).setAccessible(true);
        Object enum211 = ((Field) term96054).get((Object) null);
        HashMap term95996 = new HashMap();
        Set<Object> term96485 =  ((Map) term95996).keySet();
        HashSet term95995 = new HashSet((Collection<? extends Object>) term96485);
        Class<? extends Object> term96487 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term96486 = ((Class) term96487).getDeclaredField((String) "MANAGER");
        ((Field) term96486).setAccessible(true);
        Object enum212 = ((Field) term96486).get((Object) null);
        Float term96007 = new Float(0.6862221F);
        term95873 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term95875 = newInstance(Class.forName("java.sql.Date"));
        Object term95918 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95921 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95925 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term95989 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term95992 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96001 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term96009 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term96024 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96027 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96030 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term96047 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term96050 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term95873, term95873.getClass(), "id", 7489064039921396098L);
        setLongField(term95875, term95875.getClass(), "fastTime", 1659994192918L);
        setField(term95875, term95875.getClass(), "cdate", null);
        setField(term95873, term95873.getClass(), "workDay", term95875);
        setField(term95873, term95873.getClass(), "status", enum211);
        setFloatField(term95873, term95873.getClass(), "hours", 0.9737084F);
        setField(term95873, term95873.getClass(), "comment", "GTmoNrziyc");
        setField(term95873, term95873.getClass(), "rejectReason", "LvztehSlhM");
        setFloatField(term95873, term95873.getClass(), "rate", 0.21723765F);
        setBooleanField(term95873, term95873.getClass(), "billable", false);
        setLongField(term95873, term95873.getClass(), "taskId", 6843866297465638866L);
        setIntField(term95873, term95873.getClass(), "employeeId", 313459791);
        setIntField(term95918, term95918.getClass(), "nanos", 28000000);
        setLongField(term95918, term95918.getClass(), "fastTime", 1567436181000L);
        setField(term95918, term95918.getClass(), "cdate", null);
        setField(term95873, term95873.getClass(), "createdDate", term95918);
        setIntField(term95921, term95921.getClass(), "nanos", 689000000);
        setLongField(term95921, term95921.getClass(), "fastTime", 1476798563000L);
        setField(term95921, term95921.getClass(), "cdate", null);
        setField(term95873, term95873.getClass(), "lastModifiedDate", term95921);
        setBooleanField(term95873, term95873.getClass(), "frozen", true);
        setIntField(term95925, term95925.getClass(), "id", 752615112);
        setField(term95925, term95925.getClass(), "firstName", "njvnWFTMxN");
        setField(term95925, term95925.getClass(), "middleName", "fLRqcTSfzF");
        setField(term95925, term95925.getClass(), "lastName", "EBYHwsuWAU");
        setField(term95925, term95925.getClass(), "email", "PtIjKpiSix");
        setField(term95925, term95925.getClass(), "passwordHash", "NZdTuwSCIM");
        setIntField(term95925, term95925.getClass(), "positionId", -1674430871);
        setBooleanField(term95925, term95925.getClass(), "isArchived", false);
        setIntField(term95989, term95989.getClass(), "nanos", 262000000);
        setLongField(term95989, term95989.getClass(), "fastTime", 1888542417000L);
        setField(term95989, term95989.getClass(), "cdate", null);
        setField(term95925, term95925.getClass(), "createdDate", term95989);
        setIntField(term95992, term95992.getClass(), "nanos", 256000000);
        setLongField(term95992, term95992.getClass(), "fastTime", 1331352395000L);
        setField(term95992, term95992.getClass(), "cdate", null);
        setField(term95925, term95925.getClass(), "lastModifiedDate", term95992);
        setField(term95925, term95925.getClass(), "employeeRoles", term95995);
        setIntField(term96001, term96001.getClass(), "employeeId", 794352120);
        setIntField(term96001, term96001.getClass(), "projectId", 340719678);
        setField(term96001, term96001.getClass(), "projectRoleId", enum212);
        setField(term96001, term96001.getClass(), "externalRate", term96007);
        setField(term95925, term95925.getClass(), "employeeProjectRole", term96001);
        setField(term95873, term95873.getClass(), "employee", term95925);
        setIntField(term96009, term96009.getClass(), "id", 299791142);
        setField(term96009, term96009.getClass(), "name", "dDHcmzPAmP");
        setBooleanField(term96009, term96009.getClass(), "isArchived", true);
        setIntField(term96024, term96024.getClass(), "nanos", 752000000);
        setLongField(term96024, term96024.getClass(), "fastTime", 1595583396000L);
        setField(term96024, term96024.getClass(), "cdate", null);
        setField(term96009, term96009.getClass(), "createdDate", term96024);
        setIntField(term96027, term96027.getClass(), "nanos", 951000000);
        setLongField(term96027, term96027.getClass(), "fastTime", 1633781027000L);
        setField(term96027, term96027.getClass(), "cdate", null);
        setField(term96009, term96009.getClass(), "lastModifiedDate", term96027);
        setField(term95873, term95873.getClass(), "project", term96009);
        setLongField(term96030, term96030.getClass(), "id", -4023935540989049732L);
        setField(term96030, term96030.getClass(), "name", "HEaTkWYBgv");
        setIntField(term96030, term96030.getClass(), "projectId", 1862191391);
        setBooleanField(term96030, term96030.getClass(), "billable", true);
        setBooleanField(term96030, term96030.getClass(), "isArchived", false);
        setIntField(term96047, term96047.getClass(), "nanos", 228000000);
        setLongField(term96047, term96047.getClass(), "fastTime", 1565028127000L);
        setField(term96047, term96047.getClass(), "cdate", null);
        setField(term96030, term96030.getClass(), "createdDate", term96047);
        setIntField(term96050, term96050.getClass(), "nanos", 856000000);
        setLongField(term96050, term96050.getClass(), "fastTime", 1308517149000L);
        setField(term96050, term96050.getClass(), "cdate", null);
        setField(term96030, term96030.getClass(), "lastModifiedDate", term96050);
        setField(term95873, term95873.getClass(), "task", term96030);
        term96053 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96053;
        callMethod(klass, "equals", argTypes, term95873, args);
    }

};


