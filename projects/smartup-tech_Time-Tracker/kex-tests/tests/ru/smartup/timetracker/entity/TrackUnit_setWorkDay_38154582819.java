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

public class TrackUnit_setWorkDay_38154582819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81049;
     Object term81228;

    public TrackUnit_setWorkDay_38154582819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81231 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term81230 = ((Class) term81231).getDeclaredField((String) "CREATED");
        ((Field) term81230).setAccessible(true);
        Object enum181 = ((Field) term81230).get((Object) null);
        HashMap term81171 = new HashMap();
        Set<Object> term81658 =  ((Map) term81171).keySet();
        HashSet term81170 = new HashSet((Collection<? extends Object>) term81658);
        Class<? extends Object> term81660 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term81659 = ((Class) term81660).getDeclaredField((String) "MANAGER");
        ((Field) term81659).setAccessible(true);
        Object enum182 = ((Field) term81659).get((Object) null);
        Float term81182 = new Float(0.65889484F);
        term81049 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term81051 = newInstance(Class.forName("java.sql.Date"));
        Object term81093 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81096 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81100 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term81164 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81167 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81176 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term81184 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term81199 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81202 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81205 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term81222 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81225 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term81049, term81049.getClass(), "id", 2701184207686293431L);
        setLongField(term81051, term81051.getClass(), "fastTime", 1437757323580L);
        setField(term81051, term81051.getClass(), "cdate", null);
        setField(term81049, term81049.getClass(), "workDay", term81051);
        setField(term81049, term81049.getClass(), "status", enum181);
        setFloatField(term81049, term81049.getClass(), "hours", 0.6436713F);
        setField(term81049, term81049.getClass(), "comment", "DAujxZPHJC");
        setField(term81049, term81049.getClass(), "rejectReason", "IlBhdrCvHq");
        setFloatField(term81049, term81049.getClass(), "rate", 0.89057696F);
        setBooleanField(term81049, term81049.getClass(), "billable", true);
        setLongField(term81049, term81049.getClass(), "taskId", 4474998035090263139L);
        setIntField(term81049, term81049.getClass(), "employeeId", 243280944);
        setIntField(term81093, term81093.getClass(), "nanos", 654000000);
        setLongField(term81093, term81093.getClass(), "fastTime", 1653770915000L);
        setField(term81093, term81093.getClass(), "cdate", null);
        setField(term81049, term81049.getClass(), "createdDate", term81093);
        setIntField(term81096, term81096.getClass(), "nanos", 832000000);
        setLongField(term81096, term81096.getClass(), "fastTime", 1883919771000L);
        setField(term81096, term81096.getClass(), "cdate", null);
        setField(term81049, term81049.getClass(), "lastModifiedDate", term81096);
        setBooleanField(term81049, term81049.getClass(), "frozen", true);
        setIntField(term81100, term81100.getClass(), "id", -726681073);
        setField(term81100, term81100.getClass(), "firstName", "OirVUQhauU");
        setField(term81100, term81100.getClass(), "middleName", "GLbyDfbNZI");
        setField(term81100, term81100.getClass(), "lastName", "oNLcCYDAsO");
        setField(term81100, term81100.getClass(), "email", "CNqMxLvtcJ");
        setField(term81100, term81100.getClass(), "passwordHash", "ktbqerIaKW");
        setIntField(term81100, term81100.getClass(), "positionId", -1724487863);
        setBooleanField(term81100, term81100.getClass(), "isArchived", true);
        setIntField(term81164, term81164.getClass(), "nanos", 931000000);
        setLongField(term81164, term81164.getClass(), "fastTime", 1871918059000L);
        setField(term81164, term81164.getClass(), "cdate", null);
        setField(term81100, term81100.getClass(), "createdDate", term81164);
        setIntField(term81167, term81167.getClass(), "nanos", 134000000);
        setLongField(term81167, term81167.getClass(), "fastTime", 1703491103000L);
        setField(term81167, term81167.getClass(), "cdate", null);
        setField(term81100, term81100.getClass(), "lastModifiedDate", term81167);
        setField(term81100, term81100.getClass(), "employeeRoles", term81170);
        setIntField(term81176, term81176.getClass(), "employeeId", -128490829);
        setIntField(term81176, term81176.getClass(), "projectId", 202214133);
        setField(term81176, term81176.getClass(), "projectRoleId", enum182);
        setField(term81176, term81176.getClass(), "externalRate", term81182);
        setField(term81100, term81100.getClass(), "employeeProjectRole", term81176);
        setField(term81049, term81049.getClass(), "employee", term81100);
        setIntField(term81184, term81184.getClass(), "id", 1543091617);
        setField(term81184, term81184.getClass(), "name", "VoghngXfsK");
        setBooleanField(term81184, term81184.getClass(), "isArchived", true);
        setIntField(term81199, term81199.getClass(), "nanos", 553000000);
        setLongField(term81199, term81199.getClass(), "fastTime", 1702279729000L);
        setField(term81199, term81199.getClass(), "cdate", null);
        setField(term81184, term81184.getClass(), "createdDate", term81199);
        setIntField(term81202, term81202.getClass(), "nanos", 454000000);
        setLongField(term81202, term81202.getClass(), "fastTime", 1534330030000L);
        setField(term81202, term81202.getClass(), "cdate", null);
        setField(term81184, term81184.getClass(), "lastModifiedDate", term81202);
        setField(term81049, term81049.getClass(), "project", term81184);
        setLongField(term81205, term81205.getClass(), "id", 2848819812340321742L);
        setField(term81205, term81205.getClass(), "name", "GbahCBMvct");
        setIntField(term81205, term81205.getClass(), "projectId", -763166094);
        setBooleanField(term81205, term81205.getClass(), "billable", false);
        setBooleanField(term81205, term81205.getClass(), "isArchived", false);
        setIntField(term81222, term81222.getClass(), "nanos", 860000000);
        setLongField(term81222, term81222.getClass(), "fastTime", 1529160854000L);
        setField(term81222, term81222.getClass(), "cdate", null);
        setField(term81205, term81205.getClass(), "createdDate", term81222);
        setIntField(term81225, term81225.getClass(), "nanos", 646000000);
        setLongField(term81225, term81225.getClass(), "fastTime", 1839703337000L);
        setField(term81225, term81225.getClass(), "cdate", null);
        setField(term81205, term81205.getClass(), "lastModifiedDate", term81225);
        setField(term81049, term81049.getClass(), "task", term81205);
        term81228 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term81228, term81228.getClass(), "fastTime", 1668569229825L);
        setField(term81228, term81228.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term81228;
        callMethod(klass, "setWorkDay", argTypes, term81049, args);
    }

};


