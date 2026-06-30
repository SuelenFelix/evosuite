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

public class TrackUnit_setTaskId_16309672926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87893;
     Object term88072;

    public TrackUnit_setTaskId_16309672926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88075 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term88074 = ((Class) term88075).getDeclaredField((String) "CREATED");
        ((Field) term88074).setAccessible(true);
        Object enum195 = ((Field) term88074).get((Object) null);
        HashMap term88015 = new HashMap();
        Set<Object> term88502 =  ((Map) term88015).keySet();
        HashSet term88014 = new HashSet((Collection<? extends Object>) term88502);
        Class<? extends Object> term88504 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term88503 = ((Class) term88504).getDeclaredField((String) "EMPLOYEE");
        ((Field) term88503).setAccessible(true);
        Object enum196 = ((Field) term88503).get((Object) null);
        Float term88026 = new Float(0.5703112F);
        term87893 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term87895 = newInstance(Class.forName("java.sql.Date"));
        Object term87937 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87940 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term87944 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term88008 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88011 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88020 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term88028 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term88043 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88046 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88049 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term88066 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88069 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term87893, term87893.getClass(), "id", 2354625302846375590L);
        setLongField(term87895, term87895.getClass(), "fastTime", 1502158153899L);
        setField(term87895, term87895.getClass(), "cdate", null);
        setField(term87893, term87893.getClass(), "workDay", term87895);
        setField(term87893, term87893.getClass(), "status", enum195);
        setFloatField(term87893, term87893.getClass(), "hours", 0.5840714F);
        setField(term87893, term87893.getClass(), "comment", "PaCpFXGzdX");
        setField(term87893, term87893.getClass(), "rejectReason", "FftYCNbnks");
        setFloatField(term87893, term87893.getClass(), "rate", 0.478669F);
        setBooleanField(term87893, term87893.getClass(), "billable", true);
        setLongField(term87893, term87893.getClass(), "taskId", 7276637106827860087L);
        setIntField(term87893, term87893.getClass(), "employeeId", 114279242);
        setIntField(term87937, term87937.getClass(), "nanos", 553000000);
        setLongField(term87937, term87937.getClass(), "fastTime", 1833561071000L);
        setField(term87937, term87937.getClass(), "cdate", null);
        setField(term87893, term87893.getClass(), "createdDate", term87937);
        setIntField(term87940, term87940.getClass(), "nanos", 438000000);
        setLongField(term87940, term87940.getClass(), "fastTime", 1782892833000L);
        setField(term87940, term87940.getClass(), "cdate", null);
        setField(term87893, term87893.getClass(), "lastModifiedDate", term87940);
        setBooleanField(term87893, term87893.getClass(), "frozen", false);
        setIntField(term87944, term87944.getClass(), "id", 990883365);
        setField(term87944, term87944.getClass(), "firstName", "lJoltmsadS");
        setField(term87944, term87944.getClass(), "middleName", "mvfDtZNEHr");
        setField(term87944, term87944.getClass(), "lastName", "bvSgmFUDOU");
        setField(term87944, term87944.getClass(), "email", "XMHwbfiHRl");
        setField(term87944, term87944.getClass(), "passwordHash", "bucTnYicnp");
        setIntField(term87944, term87944.getClass(), "positionId", 633598642);
        setBooleanField(term87944, term87944.getClass(), "isArchived", false);
        setIntField(term88008, term88008.getClass(), "nanos", 110000000);
        setLongField(term88008, term88008.getClass(), "fastTime", 1536378965000L);
        setField(term88008, term88008.getClass(), "cdate", null);
        setField(term87944, term87944.getClass(), "createdDate", term88008);
        setIntField(term88011, term88011.getClass(), "nanos", 893000000);
        setLongField(term88011, term88011.getClass(), "fastTime", 1462323605000L);
        setField(term88011, term88011.getClass(), "cdate", null);
        setField(term87944, term87944.getClass(), "lastModifiedDate", term88011);
        setField(term87944, term87944.getClass(), "employeeRoles", term88014);
        setIntField(term88020, term88020.getClass(), "employeeId", 1862841859);
        setIntField(term88020, term88020.getClass(), "projectId", -1114668574);
        setField(term88020, term88020.getClass(), "projectRoleId", enum196);
        setField(term88020, term88020.getClass(), "externalRate", term88026);
        setField(term87944, term87944.getClass(), "employeeProjectRole", term88020);
        setField(term87893, term87893.getClass(), "employee", term87944);
        setIntField(term88028, term88028.getClass(), "id", 514511037);
        setField(term88028, term88028.getClass(), "name", "EkgprvqZlM");
        setBooleanField(term88028, term88028.getClass(), "isArchived", true);
        setIntField(term88043, term88043.getClass(), "nanos", 410000000);
        setLongField(term88043, term88043.getClass(), "fastTime", 1841175170000L);
        setField(term88043, term88043.getClass(), "cdate", null);
        setField(term88028, term88028.getClass(), "createdDate", term88043);
        setIntField(term88046, term88046.getClass(), "nanos", 236000000);
        setLongField(term88046, term88046.getClass(), "fastTime", 1841232946000L);
        setField(term88046, term88046.getClass(), "cdate", null);
        setField(term88028, term88028.getClass(), "lastModifiedDate", term88046);
        setField(term87893, term87893.getClass(), "project", term88028);
        setLongField(term88049, term88049.getClass(), "id", -3936701866695933852L);
        setField(term88049, term88049.getClass(), "name", "fbnKvthhOz");
        setIntField(term88049, term88049.getClass(), "projectId", 1713573821);
        setBooleanField(term88049, term88049.getClass(), "billable", true);
        setBooleanField(term88049, term88049.getClass(), "isArchived", false);
        setIntField(term88066, term88066.getClass(), "nanos", 46000000);
        setLongField(term88066, term88066.getClass(), "fastTime", 1879353130000L);
        setField(term88066, term88066.getClass(), "cdate", null);
        setField(term88049, term88049.getClass(), "createdDate", term88066);
        setIntField(term88069, term88069.getClass(), "nanos", 764000000);
        setLongField(term88069, term88069.getClass(), "fastTime", 1843859257000L);
        setField(term88069, term88069.getClass(), "cdate", null);
        setField(term88049, term88049.getClass(), "lastModifiedDate", term88069);
        setField(term87893, term87893.getClass(), "task", term88049);
        term88072 = new Long(1215116475929634177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term88072;
        callMethod(klass, "setTaskId", argTypes, term87893, args);
    }

};


