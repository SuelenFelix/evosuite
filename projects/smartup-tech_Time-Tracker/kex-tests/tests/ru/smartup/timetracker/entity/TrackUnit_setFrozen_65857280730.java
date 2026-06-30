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
import java.lang.Boolean;

public class TrackUnit_setFrozen_65857280730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91785;
     Object term91965;

    public TrackUnit_setFrozen_65857280730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91968 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term91967 = ((Class) term91968).getDeclaredField((String) "APPROVED");
        ((Field) term91967).setAccessible(true);
        Object enum203 = ((Field) term91967).get((Object) null);
        HashMap term91908 = new HashMap();
        Set<Object> term92398 =  ((Map) term91908).keySet();
        HashSet term91907 = new HashSet((Collection<? extends Object>) term92398);
        Class<? extends Object> term92400 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term92399 = ((Class) term92400).getDeclaredField((String) "EMPLOYEE");
        ((Field) term92399).setAccessible(true);
        Object enum204 = ((Field) term92399).get((Object) null);
        Float term91919 = new Float(0.10338366F);
        term91785 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term91787 = newInstance(Class.forName("java.sql.Date"));
        Object term91830 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91833 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91837 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term91901 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91904 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91913 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term91921 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term91936 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91939 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91942 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term91959 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term91962 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term91785, term91785.getClass(), "id", -7268507582722666254L);
        setLongField(term91787, term91787.getClass(), "fastTime", 1334853104718L);
        setField(term91787, term91787.getClass(), "cdate", null);
        setField(term91785, term91785.getClass(), "workDay", term91787);
        setField(term91785, term91785.getClass(), "status", enum203);
        setFloatField(term91785, term91785.getClass(), "hours", 0.37161416F);
        setField(term91785, term91785.getClass(), "comment", "btBLMvHzJg");
        setField(term91785, term91785.getClass(), "rejectReason", "JdOMfNWgLP");
        setFloatField(term91785, term91785.getClass(), "rate", 0.022591352F);
        setBooleanField(term91785, term91785.getClass(), "billable", true);
        setLongField(term91785, term91785.getClass(), "taskId", 5671808784468963649L);
        setIntField(term91785, term91785.getClass(), "employeeId", 40571662);
        setIntField(term91830, term91830.getClass(), "nanos", 191000000);
        setLongField(term91830, term91830.getClass(), "fastTime", 1636627074000L);
        setField(term91830, term91830.getClass(), "cdate", null);
        setField(term91785, term91785.getClass(), "createdDate", term91830);
        setIntField(term91833, term91833.getClass(), "nanos", 801000000);
        setLongField(term91833, term91833.getClass(), "fastTime", 1732855034000L);
        setField(term91833, term91833.getClass(), "cdate", null);
        setField(term91785, term91785.getClass(), "lastModifiedDate", term91833);
        setBooleanField(term91785, term91785.getClass(), "frozen", true);
        setIntField(term91837, term91837.getClass(), "id", 1863910269);
        setField(term91837, term91837.getClass(), "firstName", "uWqXrwAsDU");
        setField(term91837, term91837.getClass(), "middleName", "hgFbWAUtsu");
        setField(term91837, term91837.getClass(), "lastName", "HqoTWlkbwF");
        setField(term91837, term91837.getClass(), "email", "CwNELDTAPP");
        setField(term91837, term91837.getClass(), "passwordHash", "GSzQdbHLHw");
        setIntField(term91837, term91837.getClass(), "positionId", 864645689);
        setBooleanField(term91837, term91837.getClass(), "isArchived", false);
        setIntField(term91901, term91901.getClass(), "nanos", 808000000);
        setLongField(term91901, term91901.getClass(), "fastTime", 1859311480000L);
        setField(term91901, term91901.getClass(), "cdate", null);
        setField(term91837, term91837.getClass(), "createdDate", term91901);
        setIntField(term91904, term91904.getClass(), "nanos", 611000000);
        setLongField(term91904, term91904.getClass(), "fastTime", 1872927747000L);
        setField(term91904, term91904.getClass(), "cdate", null);
        setField(term91837, term91837.getClass(), "lastModifiedDate", term91904);
        setField(term91837, term91837.getClass(), "employeeRoles", term91907);
        setIntField(term91913, term91913.getClass(), "employeeId", 279384872);
        setIntField(term91913, term91913.getClass(), "projectId", 1427305953);
        setField(term91913, term91913.getClass(), "projectRoleId", enum204);
        setField(term91913, term91913.getClass(), "externalRate", term91919);
        setField(term91837, term91837.getClass(), "employeeProjectRole", term91913);
        setField(term91785, term91785.getClass(), "employee", term91837);
        setIntField(term91921, term91921.getClass(), "id", -781832877);
        setField(term91921, term91921.getClass(), "name", "IkfarsYNJO");
        setBooleanField(term91921, term91921.getClass(), "isArchived", false);
        setIntField(term91936, term91936.getClass(), "nanos", 382000000);
        setLongField(term91936, term91936.getClass(), "fastTime", 1541897559000L);
        setField(term91936, term91936.getClass(), "cdate", null);
        setField(term91921, term91921.getClass(), "createdDate", term91936);
        setIntField(term91939, term91939.getClass(), "nanos", 791000000);
        setLongField(term91939, term91939.getClass(), "fastTime", 1326215362000L);
        setField(term91939, term91939.getClass(), "cdate", null);
        setField(term91921, term91921.getClass(), "lastModifiedDate", term91939);
        setField(term91785, term91785.getClass(), "project", term91921);
        setLongField(term91942, term91942.getClass(), "id", 2297097306706899827L);
        setField(term91942, term91942.getClass(), "name", "aZKOWhHMEh");
        setIntField(term91942, term91942.getClass(), "projectId", 797203987);
        setBooleanField(term91942, term91942.getClass(), "billable", false);
        setBooleanField(term91942, term91942.getClass(), "isArchived", true);
        setIntField(term91959, term91959.getClass(), "nanos", 789000000);
        setLongField(term91959, term91959.getClass(), "fastTime", 1579756837000L);
        setField(term91959, term91959.getClass(), "cdate", null);
        setField(term91942, term91942.getClass(), "createdDate", term91959);
        setIntField(term91962, term91962.getClass(), "nanos", 204000000);
        setLongField(term91962, term91962.getClass(), "fastTime", 1427518990000L);
        setField(term91962, term91962.getClass(), "cdate", null);
        setField(term91942, term91942.getClass(), "lastModifiedDate", term91962);
        setField(term91785, term91785.getClass(), "task", term91942);
        term91965 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term91965;
        callMethod(klass, "setFrozen", argTypes, term91785, args);
    }

};


