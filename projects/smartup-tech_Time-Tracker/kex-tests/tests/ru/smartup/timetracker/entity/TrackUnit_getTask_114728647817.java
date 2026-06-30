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

public class TrackUnit_getTask_114728647817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79100;

    public TrackUnit_getTask_114728647817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79281 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term79280 = ((Class) term79281).getDeclaredField((String) "APPROVED");
        ((Field) term79280).setAccessible(true);
        Object enum177 = ((Field) term79280).get((Object) null);
        HashMap term79223 = new HashMap();
        Set<Object> term79711 =  ((Map) term79223).keySet();
        HashSet term79222 = new HashSet((Collection<? extends Object>) term79711);
        Class<? extends Object> term79713 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term79712 = ((Class) term79713).getDeclaredField((String) "EMPLOYEE");
        ((Field) term79712).setAccessible(true);
        Object enum178 = ((Field) term79712).get((Object) null);
        Float term79234 = new Float(0.8878841F);
        term79100 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term79102 = newInstance(Class.forName("java.sql.Date"));
        Object term79145 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79148 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79152 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term79216 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79219 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79228 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term79236 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term79251 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79254 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79257 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term79274 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term79277 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term79100, term79100.getClass(), "id", 7862575738391801707L);
        setLongField(term79102, term79102.getClass(), "fastTime", 1863631094992L);
        setField(term79102, term79102.getClass(), "cdate", null);
        setField(term79100, term79100.getClass(), "workDay", term79102);
        setField(term79100, term79100.getClass(), "status", enum177);
        setFloatField(term79100, term79100.getClass(), "hours", 0.9828442F);
        setField(term79100, term79100.getClass(), "comment", "goAoCMhKBu");
        setField(term79100, term79100.getClass(), "rejectReason", "BWxJSgKHRT");
        setFloatField(term79100, term79100.getClass(), "rate", 0.9472605F);
        setBooleanField(term79100, term79100.getClass(), "billable", true);
        setLongField(term79100, term79100.getClass(), "taskId", 50358265865610362L);
        setIntField(term79100, term79100.getClass(), "employeeId", 1887772522);
        setIntField(term79145, term79145.getClass(), "nanos", 627000000);
        setLongField(term79145, term79145.getClass(), "fastTime", 1671393105000L);
        setField(term79145, term79145.getClass(), "cdate", null);
        setField(term79100, term79100.getClass(), "createdDate", term79145);
        setIntField(term79148, term79148.getClass(), "nanos", 527000000);
        setLongField(term79148, term79148.getClass(), "fastTime", 1653914801000L);
        setField(term79148, term79148.getClass(), "cdate", null);
        setField(term79100, term79100.getClass(), "lastModifiedDate", term79148);
        setBooleanField(term79100, term79100.getClass(), "frozen", false);
        setIntField(term79152, term79152.getClass(), "id", 354196060);
        setField(term79152, term79152.getClass(), "firstName", "AGXoIndFnm");
        setField(term79152, term79152.getClass(), "middleName", "mwmFMNEzkK");
        setField(term79152, term79152.getClass(), "lastName", "kVAmKknVln");
        setField(term79152, term79152.getClass(), "email", "MRFLbEGYKG");
        setField(term79152, term79152.getClass(), "passwordHash", "BYrGukTyof");
        setIntField(term79152, term79152.getClass(), "positionId", -1840305774);
        setBooleanField(term79152, term79152.getClass(), "isArchived", false);
        setIntField(term79216, term79216.getClass(), "nanos", 80000000);
        setLongField(term79216, term79216.getClass(), "fastTime", 1367592722000L);
        setField(term79216, term79216.getClass(), "cdate", null);
        setField(term79152, term79152.getClass(), "createdDate", term79216);
        setIntField(term79219, term79219.getClass(), "nanos", 554000000);
        setLongField(term79219, term79219.getClass(), "fastTime", 1414844022000L);
        setField(term79219, term79219.getClass(), "cdate", null);
        setField(term79152, term79152.getClass(), "lastModifiedDate", term79219);
        setField(term79152, term79152.getClass(), "employeeRoles", term79222);
        setIntField(term79228, term79228.getClass(), "employeeId", 1365087144);
        setIntField(term79228, term79228.getClass(), "projectId", -1537255112);
        setField(term79228, term79228.getClass(), "projectRoleId", enum178);
        setField(term79228, term79228.getClass(), "externalRate", term79234);
        setField(term79152, term79152.getClass(), "employeeProjectRole", term79228);
        setField(term79100, term79100.getClass(), "employee", term79152);
        setIntField(term79236, term79236.getClass(), "id", 934477462);
        setField(term79236, term79236.getClass(), "name", "jiCGTTzKGB");
        setBooleanField(term79236, term79236.getClass(), "isArchived", true);
        setIntField(term79251, term79251.getClass(), "nanos", 848000000);
        setLongField(term79251, term79251.getClass(), "fastTime", 1878660685000L);
        setField(term79251, term79251.getClass(), "cdate", null);
        setField(term79236, term79236.getClass(), "createdDate", term79251);
        setIntField(term79254, term79254.getClass(), "nanos", 615000000);
        setLongField(term79254, term79254.getClass(), "fastTime", 1472731528000L);
        setField(term79254, term79254.getClass(), "cdate", null);
        setField(term79236, term79236.getClass(), "lastModifiedDate", term79254);
        setField(term79100, term79100.getClass(), "project", term79236);
        setLongField(term79257, term79257.getClass(), "id", 5510783420697225605L);
        setField(term79257, term79257.getClass(), "name", "MqICFYzDJj");
        setIntField(term79257, term79257.getClass(), "projectId", 4900410);
        setBooleanField(term79257, term79257.getClass(), "billable", false);
        setBooleanField(term79257, term79257.getClass(), "isArchived", false);
        setIntField(term79274, term79274.getClass(), "nanos", 407000000);
        setLongField(term79274, term79274.getClass(), "fastTime", 1761717893000L);
        setField(term79274, term79274.getClass(), "cdate", null);
        setField(term79257, term79257.getClass(), "createdDate", term79274);
        setIntField(term79277, term79277.getClass(), "nanos", 242000000);
        setLongField(term79277, term79277.getClass(), "fastTime", 1715292049000L);
        setField(term79277, term79277.getClass(), "cdate", null);
        setField(term79257, term79257.getClass(), "lastModifiedDate", term79277);
        setField(term79100, term79100.getClass(), "task", term79257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTask", argTypes, term79100, args);
    }

};


