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
import java.lang.Long;

public class TrackUnit_setId_56890840418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80073;
     Object term80254;

    public TrackUnit_setId_56890840418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80257 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term80256 = ((Class) term80257).getDeclaredField((String) "SUBMITTED");
        ((Field) term80256).setAccessible(true);
        Object enum179 = ((Field) term80256).get((Object) null);
        HashMap term80197 = new HashMap();
        Set<Object> term80690 =  ((Map) term80197).keySet();
        HashSet term80196 = new HashSet((Collection<? extends Object>) term80690);
        Class<? extends Object> term80692 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term80691 = ((Class) term80692).getDeclaredField((String) "MANAGER");
        ((Field) term80691).setAccessible(true);
        Object enum180 = ((Field) term80691).get((Object) null);
        Float term80208 = new Float(0.2889229F);
        term80073 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term80075 = newInstance(Class.forName("java.sql.Date"));
        Object term80119 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80122 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80126 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term80190 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80193 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80202 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term80210 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term80225 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80228 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80231 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term80248 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term80251 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term80073, term80073.getClass(), "id", 6005241913654469005L);
        setLongField(term80075, term80075.getClass(), "fastTime", 1882638884364L);
        setField(term80075, term80075.getClass(), "cdate", null);
        setField(term80073, term80073.getClass(), "workDay", term80075);
        setField(term80073, term80073.getClass(), "status", enum179);
        setFloatField(term80073, term80073.getClass(), "hours", 0.27797186F);
        setField(term80073, term80073.getClass(), "comment", "YgQvdcBQKw");
        setField(term80073, term80073.getClass(), "rejectReason", "FiYYLuailz");
        setFloatField(term80073, term80073.getClass(), "rate", 0.7467328F);
        setBooleanField(term80073, term80073.getClass(), "billable", true);
        setLongField(term80073, term80073.getClass(), "taskId", -1983291584002806658L);
        setIntField(term80073, term80073.getClass(), "employeeId", -1252345779);
        setIntField(term80119, term80119.getClass(), "nanos", 749000000);
        setLongField(term80119, term80119.getClass(), "fastTime", 1562227002000L);
        setField(term80119, term80119.getClass(), "cdate", null);
        setField(term80073, term80073.getClass(), "createdDate", term80119);
        setIntField(term80122, term80122.getClass(), "nanos", 580000000);
        setLongField(term80122, term80122.getClass(), "fastTime", 1418062437000L);
        setField(term80122, term80122.getClass(), "cdate", null);
        setField(term80073, term80073.getClass(), "lastModifiedDate", term80122);
        setBooleanField(term80073, term80073.getClass(), "frozen", true);
        setIntField(term80126, term80126.getClass(), "id", -2063365430);
        setField(term80126, term80126.getClass(), "firstName", "XebAeSnCKZ");
        setField(term80126, term80126.getClass(), "middleName", "GeddnXjHGy");
        setField(term80126, term80126.getClass(), "lastName", "vLTbaoAxBm");
        setField(term80126, term80126.getClass(), "email", "BXTjEyEZxD");
        setField(term80126, term80126.getClass(), "passwordHash", "oKhVzOKUFW");
        setIntField(term80126, term80126.getClass(), "positionId", 812570053);
        setBooleanField(term80126, term80126.getClass(), "isArchived", false);
        setIntField(term80190, term80190.getClass(), "nanos", 192000000);
        setLongField(term80190, term80190.getClass(), "fastTime", 1688127698000L);
        setField(term80190, term80190.getClass(), "cdate", null);
        setField(term80126, term80126.getClass(), "createdDate", term80190);
        setIntField(term80193, term80193.getClass(), "nanos", 655000000);
        setLongField(term80193, term80193.getClass(), "fastTime", 1321862854000L);
        setField(term80193, term80193.getClass(), "cdate", null);
        setField(term80126, term80126.getClass(), "lastModifiedDate", term80193);
        setField(term80126, term80126.getClass(), "employeeRoles", term80196);
        setIntField(term80202, term80202.getClass(), "employeeId", -1488938905);
        setIntField(term80202, term80202.getClass(), "projectId", 1916544127);
        setField(term80202, term80202.getClass(), "projectRoleId", enum180);
        setField(term80202, term80202.getClass(), "externalRate", term80208);
        setField(term80126, term80126.getClass(), "employeeProjectRole", term80202);
        setField(term80073, term80073.getClass(), "employee", term80126);
        setIntField(term80210, term80210.getClass(), "id", -1133405894);
        setField(term80210, term80210.getClass(), "name", "mNHyqmOAFy");
        setBooleanField(term80210, term80210.getClass(), "isArchived", false);
        setIntField(term80225, term80225.getClass(), "nanos", 666000000);
        setLongField(term80225, term80225.getClass(), "fastTime", 1381131095000L);
        setField(term80225, term80225.getClass(), "cdate", null);
        setField(term80210, term80210.getClass(), "createdDate", term80225);
        setIntField(term80228, term80228.getClass(), "nanos", 929000000);
        setLongField(term80228, term80228.getClass(), "fastTime", 1389991374000L);
        setField(term80228, term80228.getClass(), "cdate", null);
        setField(term80210, term80210.getClass(), "lastModifiedDate", term80228);
        setField(term80073, term80073.getClass(), "project", term80210);
        setLongField(term80231, term80231.getClass(), "id", 5946780097489996391L);
        setField(term80231, term80231.getClass(), "name", "UxgSdhxPCH");
        setIntField(term80231, term80231.getClass(), "projectId", 1289741214);
        setBooleanField(term80231, term80231.getClass(), "billable", false);
        setBooleanField(term80231, term80231.getClass(), "isArchived", false);
        setIntField(term80248, term80248.getClass(), "nanos", 473000000);
        setLongField(term80248, term80248.getClass(), "fastTime", 1577592641000L);
        setField(term80248, term80248.getClass(), "cdate", null);
        setField(term80231, term80231.getClass(), "createdDate", term80248);
        setIntField(term80251, term80251.getClass(), "nanos", 975000000);
        setLongField(term80251, term80251.getClass(), "fastTime", 1387625278000L);
        setField(term80251, term80251.getClass(), "cdate", null);
        setField(term80231, term80231.getClass(), "lastModifiedDate", term80251);
        setField(term80073, term80073.getClass(), "task", term80231);
        term80254 = new Long(-8652538484981166496L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80254;
        callMethod(klass, "setId", argTypes, term80073, args);
    }

};


