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

public class TrackUnit_getWorkDay_10827177743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65491;

    public TrackUnit_getWorkDay_10827177743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65671 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term65670 = ((Class) term65671).getDeclaredField((String) "CREATED");
        ((Field) term65670).setAccessible(true);
        Object enum149 = ((Field) term65670).get((Object) null);
        HashMap term65613 = new HashMap();
        Set<Object> term66098 =  ((Map) term65613).keySet();
        HashSet term65612 = new HashSet((Collection<? extends Object>) term66098);
        Class<? extends Object> term66100 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term66099 = ((Class) term66100).getDeclaredField((String) "MANAGER");
        ((Field) term66099).setAccessible(true);
        Object enum150 = ((Field) term66099).get((Object) null);
        Float term65624 = new Float(0.9737084F);
        term65491 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term65493 = newInstance(Class.forName("java.sql.Date"));
        Object term65535 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65538 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65542 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term65606 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65609 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65618 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term65626 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term65641 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65644 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65647 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term65664 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term65667 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term65491, term65491.getClass(), "id", 6617340557564669657L);
        setLongField(term65493, term65493.getClass(), "fastTime", 1480438351369L);
        setField(term65493, term65493.getClass(), "cdate", null);
        setField(term65491, term65491.getClass(), "workDay", term65493);
        setField(term65491, term65491.getClass(), "status", enum149);
        setFloatField(term65491, term65491.getClass(), "hours", 0.5523636F);
        setField(term65491, term65491.getClass(), "comment", "GNEmuHPNcU");
        setField(term65491, term65491.getClass(), "rejectReason", "IoSfuKDFRe");
        setFloatField(term65491, term65491.getClass(), "rate", 0.8564069F);
        setBooleanField(term65491, term65491.getClass(), "billable", true);
        setLongField(term65491, term65491.getClass(), "taskId", 1439298019805881866L);
        setIntField(term65491, term65491.getClass(), "employeeId", -390501023);
        setIntField(term65535, term65535.getClass(), "nanos", 143000000);
        setLongField(term65535, term65535.getClass(), "fastTime", 1726900268000L);
        setField(term65535, term65535.getClass(), "cdate", null);
        setField(term65491, term65491.getClass(), "createdDate", term65535);
        setIntField(term65538, term65538.getClass(), "nanos", 825000000);
        setLongField(term65538, term65538.getClass(), "fastTime", 1298054506000L);
        setField(term65538, term65538.getClass(), "cdate", null);
        setField(term65491, term65491.getClass(), "lastModifiedDate", term65538);
        setBooleanField(term65491, term65491.getClass(), "frozen", false);
        setIntField(term65542, term65542.getClass(), "id", -1667482829);
        setField(term65542, term65542.getClass(), "firstName", "AWYyZiNfsm");
        setField(term65542, term65542.getClass(), "middleName", "ITRRYiuDwH");
        setField(term65542, term65542.getClass(), "lastName", "llRfwANcVF");
        setField(term65542, term65542.getClass(), "email", "sUEeHQTWkA");
        setField(term65542, term65542.getClass(), "passwordHash", "BDIRCxAWLA");
        setIntField(term65542, term65542.getClass(), "positionId", 1116576792);
        setBooleanField(term65542, term65542.getClass(), "isArchived", false);
        setIntField(term65606, term65606.getClass(), "nanos", 68000000);
        setLongField(term65606, term65606.getClass(), "fastTime", 1640039884000L);
        setField(term65606, term65606.getClass(), "cdate", null);
        setField(term65542, term65542.getClass(), "createdDate", term65606);
        setIntField(term65609, term65609.getClass(), "nanos", 95000000);
        setLongField(term65609, term65609.getClass(), "fastTime", 1292019671000L);
        setField(term65609, term65609.getClass(), "cdate", null);
        setField(term65542, term65542.getClass(), "lastModifiedDate", term65609);
        setField(term65542, term65542.getClass(), "employeeRoles", term65612);
        setIntField(term65618, term65618.getClass(), "employeeId", -942194446);
        setIntField(term65618, term65618.getClass(), "projectId", -938508470);
        setField(term65618, term65618.getClass(), "projectRoleId", enum150);
        setField(term65618, term65618.getClass(), "externalRate", term65624);
        setField(term65542, term65542.getClass(), "employeeProjectRole", term65618);
        setField(term65491, term65491.getClass(), "employee", term65542);
        setIntField(term65626, term65626.getClass(), "id", 1242676024);
        setField(term65626, term65626.getClass(), "name", "eOJfbiZLnb");
        setBooleanField(term65626, term65626.getClass(), "isArchived", true);
        setIntField(term65641, term65641.getClass(), "nanos", 156000000);
        setLongField(term65641, term65641.getClass(), "fastTime", 1781307579000L);
        setField(term65641, term65641.getClass(), "cdate", null);
        setField(term65626, term65626.getClass(), "createdDate", term65641);
        setIntField(term65644, term65644.getClass(), "nanos", 767000000);
        setLongField(term65644, term65644.getClass(), "fastTime", 1305193969000L);
        setField(term65644, term65644.getClass(), "cdate", null);
        setField(term65626, term65626.getClass(), "lastModifiedDate", term65644);
        setField(term65491, term65491.getClass(), "project", term65626);
        setLongField(term65647, term65647.getClass(), "id", -8708192233349544946L);
        setField(term65647, term65647.getClass(), "name", "nKZKnxWYCK");
        setIntField(term65647, term65647.getClass(), "projectId", -1865023308);
        setBooleanField(term65647, term65647.getClass(), "billable", true);
        setBooleanField(term65647, term65647.getClass(), "isArchived", false);
        setIntField(term65664, term65664.getClass(), "nanos", 454000000);
        setLongField(term65664, term65664.getClass(), "fastTime", 1387743261000L);
        setField(term65664, term65664.getClass(), "cdate", null);
        setField(term65647, term65647.getClass(), "createdDate", term65664);
        setIntField(term65667, term65667.getClass(), "nanos", 141000000);
        setLongField(term65667, term65667.getClass(), "fastTime", 1368669324000L);
        setField(term65667, term65667.getClass(), "cdate", null);
        setField(term65647, term65647.getClass(), "lastModifiedDate", term65667);
        setField(term65491, term65491.getClass(), "task", term65647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkDay", argTypes, term65491, args);
    }

};


