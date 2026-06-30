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

public class TrackUnit_isFrozen_85017741914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76187;

    public TrackUnit_isFrozen_85017741914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76369 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term76368 = ((Class) term76369).getDeclaredField((String) "SUBMITTED");
        ((Field) term76368).setAccessible(true);
        Object enum171 = ((Field) term76368).get((Object) null);
        HashMap term76311 = new HashMap();
        Set<Object> term76802 =  ((Map) term76311).keySet();
        HashSet term76310 = new HashSet((Collection<? extends Object>) term76802);
        Class<? extends Object> term76804 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term76803 = ((Class) term76804).getDeclaredField((String) "MANAGER");
        ((Field) term76803).setAccessible(true);
        Object enum172 = ((Field) term76803).get((Object) null);
        Float term76322 = new Float(0.8886614F);
        term76187 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term76189 = newInstance(Class.forName("java.sql.Date"));
        Object term76233 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76236 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76240 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term76304 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76307 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76316 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term76324 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term76339 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76342 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76345 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term76362 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term76365 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term76187, term76187.getClass(), "id", -8654565919063661957L);
        setLongField(term76189, term76189.getClass(), "fastTime", 1745462962080L);
        setField(term76189, term76189.getClass(), "cdate", null);
        setField(term76187, term76187.getClass(), "workDay", term76189);
        setField(term76187, term76187.getClass(), "status", enum171);
        setFloatField(term76187, term76187.getClass(), "hours", 0.13745493F);
        setField(term76187, term76187.getClass(), "comment", "UDlkdccCRn");
        setField(term76187, term76187.getClass(), "rejectReason", "McpzErOcYb");
        setFloatField(term76187, term76187.getClass(), "rate", 0.20144695F);
        setBooleanField(term76187, term76187.getClass(), "billable", false);
        setLongField(term76187, term76187.getClass(), "taskId", -5248475803419977214L);
        setIntField(term76187, term76187.getClass(), "employeeId", -201517446);
        setIntField(term76233, term76233.getClass(), "nanos", 861000000);
        setLongField(term76233, term76233.getClass(), "fastTime", 1403920313000L);
        setField(term76233, term76233.getClass(), "cdate", null);
        setField(term76187, term76187.getClass(), "createdDate", term76233);
        setIntField(term76236, term76236.getClass(), "nanos", 175000000);
        setLongField(term76236, term76236.getClass(), "fastTime", 1460661432000L);
        setField(term76236, term76236.getClass(), "cdate", null);
        setField(term76187, term76187.getClass(), "lastModifiedDate", term76236);
        setBooleanField(term76187, term76187.getClass(), "frozen", true);
        setIntField(term76240, term76240.getClass(), "id", -97742366);
        setField(term76240, term76240.getClass(), "firstName", "jqrVEUvYEz");
        setField(term76240, term76240.getClass(), "middleName", "QITgiBrmfj");
        setField(term76240, term76240.getClass(), "lastName", "pXxkiXgQnq");
        setField(term76240, term76240.getClass(), "email", "tKmrUDURku");
        setField(term76240, term76240.getClass(), "passwordHash", "JeZbrwZmsP");
        setIntField(term76240, term76240.getClass(), "positionId", 1638851942);
        setBooleanField(term76240, term76240.getClass(), "isArchived", true);
        setIntField(term76304, term76304.getClass(), "nanos", 68000000);
        setLongField(term76304, term76304.getClass(), "fastTime", 1444317943000L);
        setField(term76304, term76304.getClass(), "cdate", null);
        setField(term76240, term76240.getClass(), "createdDate", term76304);
        setIntField(term76307, term76307.getClass(), "nanos", 964000000);
        setLongField(term76307, term76307.getClass(), "fastTime", 1483536600000L);
        setField(term76307, term76307.getClass(), "cdate", null);
        setField(term76240, term76240.getClass(), "lastModifiedDate", term76307);
        setField(term76240, term76240.getClass(), "employeeRoles", term76310);
        setIntField(term76316, term76316.getClass(), "employeeId", 1374790203);
        setIntField(term76316, term76316.getClass(), "projectId", 1160010161);
        setField(term76316, term76316.getClass(), "projectRoleId", enum172);
        setField(term76316, term76316.getClass(), "externalRate", term76322);
        setField(term76240, term76240.getClass(), "employeeProjectRole", term76316);
        setField(term76187, term76187.getClass(), "employee", term76240);
        setIntField(term76324, term76324.getClass(), "id", -423900705);
        setField(term76324, term76324.getClass(), "name", "bxyfeicqrK");
        setBooleanField(term76324, term76324.getClass(), "isArchived", true);
        setIntField(term76339, term76339.getClass(), "nanos", 212000000);
        setLongField(term76339, term76339.getClass(), "fastTime", 1888790032000L);
        setField(term76339, term76339.getClass(), "cdate", null);
        setField(term76324, term76324.getClass(), "createdDate", term76339);
        setIntField(term76342, term76342.getClass(), "nanos", 411000000);
        setLongField(term76342, term76342.getClass(), "fastTime", 1632302505000L);
        setField(term76342, term76342.getClass(), "cdate", null);
        setField(term76324, term76324.getClass(), "lastModifiedDate", term76342);
        setField(term76187, term76187.getClass(), "project", term76324);
        setLongField(term76345, term76345.getClass(), "id", -6723783499250797216L);
        setField(term76345, term76345.getClass(), "name", "vBnWPlsZMk");
        setIntField(term76345, term76345.getClass(), "projectId", -525570815);
        setBooleanField(term76345, term76345.getClass(), "billable", false);
        setBooleanField(term76345, term76345.getClass(), "isArchived", true);
        setIntField(term76362, term76362.getClass(), "nanos", 839000000);
        setLongField(term76362, term76362.getClass(), "fastTime", 1390489181000L);
        setField(term76362, term76362.getClass(), "cdate", null);
        setField(term76345, term76345.getClass(), "createdDate", term76362);
        setIntField(term76365, term76365.getClass(), "nanos", 353000000);
        setLongField(term76365, term76365.getClass(), "fastTime", 1410831091000L);
        setField(term76365, term76365.getClass(), "cdate", null);
        setField(term76345, term76345.getClass(), "lastModifiedDate", term76365);
        setField(term76187, term76187.getClass(), "task", term76345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFrozen", argTypes, term76187, args);
    }

};


