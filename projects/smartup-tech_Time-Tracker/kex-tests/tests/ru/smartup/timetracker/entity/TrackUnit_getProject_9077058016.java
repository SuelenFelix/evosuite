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

public class TrackUnit_getProject_9077058016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78130;

    public TrackUnit_getProject_9077058016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78311 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term78310 = ((Class) term78311).getDeclaredField((String) "APPROVED");
        ((Field) term78310).setAccessible(true);
        Object enum175 = ((Field) term78310).get((Object) null);
        HashMap term78253 = new HashMap();
        Set<Object> term78741 =  ((Map) term78253).keySet();
        HashSet term78252 = new HashSet((Collection<? extends Object>) term78741);
        Class<? extends Object> term78743 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term78742 = ((Class) term78743).getDeclaredField((String) "MANAGER");
        ((Field) term78742).setAccessible(true);
        Object enum176 = ((Field) term78742).get((Object) null);
        Float term78264 = new Float(0.38555247F);
        term78130 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term78132 = newInstance(Class.forName("java.sql.Date"));
        Object term78175 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78178 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78182 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term78246 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78249 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78258 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term78266 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term78281 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78284 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78287 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term78304 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term78307 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term78130, term78130.getClass(), "id", -7291743527973326814L);
        setLongField(term78132, term78132.getClass(), "fastTime", 1706078172457L);
        setField(term78132, term78132.getClass(), "cdate", null);
        setField(term78130, term78130.getClass(), "workDay", term78132);
        setField(term78130, term78130.getClass(), "status", enum175);
        setFloatField(term78130, term78130.getClass(), "hours", 0.95272815F);
        setField(term78130, term78130.getClass(), "comment", "wwAwLLcLPp");
        setField(term78130, term78130.getClass(), "rejectReason", "nHpMKOmlpQ");
        setFloatField(term78130, term78130.getClass(), "rate", 0.7254646F);
        setBooleanField(term78130, term78130.getClass(), "billable", true);
        setLongField(term78130, term78130.getClass(), "taskId", -5963439350418910964L);
        setIntField(term78130, term78130.getClass(), "employeeId", 952869601);
        setIntField(term78175, term78175.getClass(), "nanos", 758000000);
        setLongField(term78175, term78175.getClass(), "fastTime", 1580474406000L);
        setField(term78175, term78175.getClass(), "cdate", null);
        setField(term78130, term78130.getClass(), "createdDate", term78175);
        setIntField(term78178, term78178.getClass(), "nanos", 592000000);
        setLongField(term78178, term78178.getClass(), "fastTime", 1606106892000L);
        setField(term78178, term78178.getClass(), "cdate", null);
        setField(term78130, term78130.getClass(), "lastModifiedDate", term78178);
        setBooleanField(term78130, term78130.getClass(), "frozen", true);
        setIntField(term78182, term78182.getClass(), "id", 91958879);
        setField(term78182, term78182.getClass(), "firstName", "fKhrQsJToZ");
        setField(term78182, term78182.getClass(), "middleName", "wsysQLGFnl");
        setField(term78182, term78182.getClass(), "lastName", "ckQLZGFjMX");
        setField(term78182, term78182.getClass(), "email", "qphdrqUtNx");
        setField(term78182, term78182.getClass(), "passwordHash", "bwlLFAfNWx");
        setIntField(term78182, term78182.getClass(), "positionId", -645429025);
        setBooleanField(term78182, term78182.getClass(), "isArchived", true);
        setIntField(term78246, term78246.getClass(), "nanos", 308000000);
        setLongField(term78246, term78246.getClass(), "fastTime", 1818352360000L);
        setField(term78246, term78246.getClass(), "cdate", null);
        setField(term78182, term78182.getClass(), "createdDate", term78246);
        setIntField(term78249, term78249.getClass(), "nanos", 539000000);
        setLongField(term78249, term78249.getClass(), "fastTime", 1417157664000L);
        setField(term78249, term78249.getClass(), "cdate", null);
        setField(term78182, term78182.getClass(), "lastModifiedDate", term78249);
        setField(term78182, term78182.getClass(), "employeeRoles", term78252);
        setIntField(term78258, term78258.getClass(), "employeeId", -688213483);
        setIntField(term78258, term78258.getClass(), "projectId", 644154104);
        setField(term78258, term78258.getClass(), "projectRoleId", enum176);
        setField(term78258, term78258.getClass(), "externalRate", term78264);
        setField(term78182, term78182.getClass(), "employeeProjectRole", term78258);
        setField(term78130, term78130.getClass(), "employee", term78182);
        setIntField(term78266, term78266.getClass(), "id", 76650923);
        setField(term78266, term78266.getClass(), "name", "JWodNQzjjV");
        setBooleanField(term78266, term78266.getClass(), "isArchived", true);
        setIntField(term78281, term78281.getClass(), "nanos", 974000000);
        setLongField(term78281, term78281.getClass(), "fastTime", 1783083778000L);
        setField(term78281, term78281.getClass(), "cdate", null);
        setField(term78266, term78266.getClass(), "createdDate", term78281);
        setIntField(term78284, term78284.getClass(), "nanos", 308000000);
        setLongField(term78284, term78284.getClass(), "fastTime", 1853618246000L);
        setField(term78284, term78284.getClass(), "cdate", null);
        setField(term78266, term78266.getClass(), "lastModifiedDate", term78284);
        setField(term78130, term78130.getClass(), "project", term78266);
        setLongField(term78287, term78287.getClass(), "id", 9013624480170062917L);
        setField(term78287, term78287.getClass(), "name", "CAgxWjhxNf");
        setIntField(term78287, term78287.getClass(), "projectId", 1003743923);
        setBooleanField(term78287, term78287.getClass(), "billable", false);
        setBooleanField(term78287, term78287.getClass(), "isArchived", true);
        setIntField(term78304, term78304.getClass(), "nanos", 445000000);
        setLongField(term78304, term78304.getClass(), "fastTime", 1653494539000L);
        setField(term78304, term78304.getClass(), "cdate", null);
        setField(term78287, term78287.getClass(), "createdDate", term78304);
        setIntField(term78307, term78307.getClass(), "nanos", 495000000);
        setLongField(term78307, term78307.getClass(), "fastTime", 1781247316000L);
        setField(term78307, term78307.getClass(), "cdate", null);
        setField(term78287, term78287.getClass(), "lastModifiedDate", term78307);
        setField(term78130, term78130.getClass(), "task", term78287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProject", argTypes, term78130, args);
    }

};


