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

public class TrackUnit_getLastModifiedDate_46733591613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75217;

    public TrackUnit_getLastModifiedDate_46733591613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75398 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term75397 = ((Class) term75398).getDeclaredField((String) "REJECTED");
        ((Field) term75397).setAccessible(true);
        Object enum169 = ((Field) term75397).get((Object) null);
        HashMap term75340 = new HashMap();
        Set<Object> term75828 =  ((Map) term75340).keySet();
        HashSet term75339 = new HashSet((Collection<? extends Object>) term75828);
        Class<? extends Object> term75830 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term75829 = ((Class) term75830).getDeclaredField((String) "MANAGER");
        ((Field) term75829).setAccessible(true);
        Object enum170 = ((Field) term75829).get((Object) null);
        Float term75351 = new Float(0.32021916F);
        term75217 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term75219 = newInstance(Class.forName("java.sql.Date"));
        Object term75262 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75265 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75269 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term75333 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75336 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75345 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term75353 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term75368 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75371 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75374 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term75391 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term75394 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term75217, term75217.getClass(), "id", 414749984815662075L);
        setLongField(term75219, term75219.getClass(), "fastTime", 1589457921030L);
        setField(term75219, term75219.getClass(), "cdate", null);
        setField(term75217, term75217.getClass(), "workDay", term75219);
        setField(term75217, term75217.getClass(), "status", enum169);
        setFloatField(term75217, term75217.getClass(), "hours", 0.76550204F);
        setField(term75217, term75217.getClass(), "comment", "mKaHyMybrK");
        setField(term75217, term75217.getClass(), "rejectReason", "AyrEXuGrEj");
        setFloatField(term75217, term75217.getClass(), "rate", 0.26441735F);
        setBooleanField(term75217, term75217.getClass(), "billable", true);
        setLongField(term75217, term75217.getClass(), "taskId", 463622836963501975L);
        setIntField(term75217, term75217.getClass(), "employeeId", 752152965);
        setIntField(term75262, term75262.getClass(), "nanos", 908000000);
        setLongField(term75262, term75262.getClass(), "fastTime", 1770185970000L);
        setField(term75262, term75262.getClass(), "cdate", null);
        setField(term75217, term75217.getClass(), "createdDate", term75262);
        setIntField(term75265, term75265.getClass(), "nanos", 317000000);
        setLongField(term75265, term75265.getClass(), "fastTime", 1367924277000L);
        setField(term75265, term75265.getClass(), "cdate", null);
        setField(term75217, term75217.getClass(), "lastModifiedDate", term75265);
        setBooleanField(term75217, term75217.getClass(), "frozen", true);
        setIntField(term75269, term75269.getClass(), "id", -1577069773);
        setField(term75269, term75269.getClass(), "firstName", "yevIIoVYHq");
        setField(term75269, term75269.getClass(), "middleName", "UuYWMTqWTV");
        setField(term75269, term75269.getClass(), "lastName", "DSFGlcaXUb");
        setField(term75269, term75269.getClass(), "email", "sHMXNUzNeM");
        setField(term75269, term75269.getClass(), "passwordHash", "gPzGDOEPPw");
        setIntField(term75269, term75269.getClass(), "positionId", -266625190);
        setBooleanField(term75269, term75269.getClass(), "isArchived", false);
        setIntField(term75333, term75333.getClass(), "nanos", 50000000);
        setLongField(term75333, term75333.getClass(), "fastTime", 1875220996000L);
        setField(term75333, term75333.getClass(), "cdate", null);
        setField(term75269, term75269.getClass(), "createdDate", term75333);
        setIntField(term75336, term75336.getClass(), "nanos", 852000000);
        setLongField(term75336, term75336.getClass(), "fastTime", 1470097220000L);
        setField(term75336, term75336.getClass(), "cdate", null);
        setField(term75269, term75269.getClass(), "lastModifiedDate", term75336);
        setField(term75269, term75269.getClass(), "employeeRoles", term75339);
        setIntField(term75345, term75345.getClass(), "employeeId", 489201218);
        setIntField(term75345, term75345.getClass(), "projectId", 464181937);
        setField(term75345, term75345.getClass(), "projectRoleId", enum170);
        setField(term75345, term75345.getClass(), "externalRate", term75351);
        setField(term75269, term75269.getClass(), "employeeProjectRole", term75345);
        setField(term75217, term75217.getClass(), "employee", term75269);
        setIntField(term75353, term75353.getClass(), "id", -1455526612);
        setField(term75353, term75353.getClass(), "name", "rwKoAngzCu");
        setBooleanField(term75353, term75353.getClass(), "isArchived", false);
        setIntField(term75368, term75368.getClass(), "nanos", 373000000);
        setLongField(term75368, term75368.getClass(), "fastTime", 1809163359000L);
        setField(term75368, term75368.getClass(), "cdate", null);
        setField(term75353, term75353.getClass(), "createdDate", term75368);
        setIntField(term75371, term75371.getClass(), "nanos", 865000000);
        setLongField(term75371, term75371.getClass(), "fastTime", 1529208158000L);
        setField(term75371, term75371.getClass(), "cdate", null);
        setField(term75353, term75353.getClass(), "lastModifiedDate", term75371);
        setField(term75217, term75217.getClass(), "project", term75353);
        setLongField(term75374, term75374.getClass(), "id", 305759998609888272L);
        setField(term75374, term75374.getClass(), "name", "VUkRVwROTl");
        setIntField(term75374, term75374.getClass(), "projectId", -941356098);
        setBooleanField(term75374, term75374.getClass(), "billable", false);
        setBooleanField(term75374, term75374.getClass(), "isArchived", false);
        setIntField(term75391, term75391.getClass(), "nanos", 557000000);
        setLongField(term75391, term75391.getClass(), "fastTime", 1887031375000L);
        setField(term75391, term75391.getClass(), "cdate", null);
        setField(term75374, term75374.getClass(), "createdDate", term75391);
        setIntField(term75394, term75394.getClass(), "nanos", 475000000);
        setLongField(term75394, term75394.getClass(), "fastTime", 1278333208000L);
        setField(term75394, term75394.getClass(), "cdate", null);
        setField(term75374, term75374.getClass(), "lastModifiedDate", term75394);
        setField(term75217, term75217.getClass(), "task", term75374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term75217, args);
    }

};


