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

public class TrackUnit_setEmployee_122939901631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92760;
     Object term92940;

    public TrackUnit_setEmployee_122939901631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93022 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term93021 = ((Class) term93022).getDeclaredField((String) "REJECTED");
        ((Field) term93021).setAccessible(true);
        Object enum205 = ((Field) term93021).get((Object) null);
        HashMap term92883 = new HashMap();
        Set<Object> term93452 =  ((Map) term92883).keySet();
        HashSet term92882 = new HashSet((Collection<? extends Object>) term93452);
        Class<? extends Object> term93454 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term93453 = ((Class) term93454).getDeclaredField((String) "EMPLOYEE");
        ((Field) term93453).setAccessible(true);
        Object enum206 = ((Field) term93453).get((Object) null);
        Float term92894 = new Float(0.75913525F);
        term92760 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term92762 = newInstance(Class.forName("java.sql.Date"));
        Object term92805 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92808 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92812 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term92876 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92879 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92888 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term92896 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term92911 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92914 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92917 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term92934 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term92937 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term92760, term92760.getClass(), "id", -900457279156388404L);
        setLongField(term92762, term92762.getClass(), "fastTime", 1496859828764L);
        setField(term92762, term92762.getClass(), "cdate", null);
        setField(term92760, term92760.getClass(), "workDay", term92762);
        setField(term92760, term92760.getClass(), "status", enum205);
        setFloatField(term92760, term92760.getClass(), "hours", 0.6805867F);
        setField(term92760, term92760.getClass(), "comment", "YfkhviKZwl");
        setField(term92760, term92760.getClass(), "rejectReason", "DcOhhAfJTI");
        setFloatField(term92760, term92760.getClass(), "rate", 0.51208574F);
        setBooleanField(term92760, term92760.getClass(), "billable", false);
        setLongField(term92760, term92760.getClass(), "taskId", 1084801489398441516L);
        setIntField(term92760, term92760.getClass(), "employeeId", 1973060703);
        setIntField(term92805, term92805.getClass(), "nanos", 264000000);
        setLongField(term92805, term92805.getClass(), "fastTime", 1295496490000L);
        setField(term92805, term92805.getClass(), "cdate", null);
        setField(term92760, term92760.getClass(), "createdDate", term92805);
        setIntField(term92808, term92808.getClass(), "nanos", 177000000);
        setLongField(term92808, term92808.getClass(), "fastTime", 1264959730000L);
        setField(term92808, term92808.getClass(), "cdate", null);
        setField(term92760, term92760.getClass(), "lastModifiedDate", term92808);
        setBooleanField(term92760, term92760.getClass(), "frozen", false);
        setIntField(term92812, term92812.getClass(), "id", -138239905);
        setField(term92812, term92812.getClass(), "firstName", "gYTIkBFOoS");
        setField(term92812, term92812.getClass(), "middleName", "xmzSoVgiED");
        setField(term92812, term92812.getClass(), "lastName", "pdSvedKgPq");
        setField(term92812, term92812.getClass(), "email", "epPTwvcoyb");
        setField(term92812, term92812.getClass(), "passwordHash", "UBPHmOICBs");
        setIntField(term92812, term92812.getClass(), "positionId", 1709474063);
        setBooleanField(term92812, term92812.getClass(), "isArchived", false);
        setIntField(term92876, term92876.getClass(), "nanos", 276000000);
        setLongField(term92876, term92876.getClass(), "fastTime", 1837098832000L);
        setField(term92876, term92876.getClass(), "cdate", null);
        setField(term92812, term92812.getClass(), "createdDate", term92876);
        setIntField(term92879, term92879.getClass(), "nanos", 541000000);
        setLongField(term92879, term92879.getClass(), "fastTime", 1403103066000L);
        setField(term92879, term92879.getClass(), "cdate", null);
        setField(term92812, term92812.getClass(), "lastModifiedDate", term92879);
        setField(term92812, term92812.getClass(), "employeeRoles", term92882);
        setIntField(term92888, term92888.getClass(), "employeeId", 1406617209);
        setIntField(term92888, term92888.getClass(), "projectId", 1706047059);
        setField(term92888, term92888.getClass(), "projectRoleId", enum206);
        setField(term92888, term92888.getClass(), "externalRate", term92894);
        setField(term92812, term92812.getClass(), "employeeProjectRole", term92888);
        setField(term92760, term92760.getClass(), "employee", term92812);
        setIntField(term92896, term92896.getClass(), "id", 590451710);
        setField(term92896, term92896.getClass(), "name", "IDJUVPgUJf");
        setBooleanField(term92896, term92896.getClass(), "isArchived", false);
        setIntField(term92911, term92911.getClass(), "nanos", 928000000);
        setLongField(term92911, term92911.getClass(), "fastTime", 1554066324000L);
        setField(term92911, term92911.getClass(), "cdate", null);
        setField(term92896, term92896.getClass(), "createdDate", term92911);
        setIntField(term92914, term92914.getClass(), "nanos", 86000000);
        setLongField(term92914, term92914.getClass(), "fastTime", 1671422170000L);
        setField(term92914, term92914.getClass(), "cdate", null);
        setField(term92896, term92896.getClass(), "lastModifiedDate", term92914);
        setField(term92760, term92760.getClass(), "project", term92896);
        setLongField(term92917, term92917.getClass(), "id", 6273754186658578034L);
        setField(term92917, term92917.getClass(), "name", "JmnWRJUxGr");
        setIntField(term92917, term92917.getClass(), "projectId", -1999787419);
        setBooleanField(term92917, term92917.getClass(), "billable", true);
        setBooleanField(term92917, term92917.getClass(), "isArchived", true);
        setIntField(term92934, term92934.getClass(), "nanos", 94000000);
        setLongField(term92934, term92934.getClass(), "fastTime", 1461391209000L);
        setField(term92934, term92934.getClass(), "cdate", null);
        setField(term92917, term92917.getClass(), "createdDate", term92934);
        setIntField(term92937, term92937.getClass(), "nanos", 423000000);
        setLongField(term92937, term92937.getClass(), "fastTime", 1274992465000L);
        setField(term92937, term92937.getClass(), "cdate", null);
        setField(term92917, term92917.getClass(), "lastModifiedDate", term92937);
        setField(term92760, term92760.getClass(), "task", term92917);
        HashMap term93011 = new HashMap();
        Set<Object> term93864 =  ((Map) term93011).keySet();
        HashSet term93010 = new HashSet((Collection<? extends Object>) term93864);
        Float term93019 = new Float(0.7059082F);
        term92940 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term93004 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93007 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93016 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term92940, term92940.getClass(), "id", -1224443634);
        setField(term92940, term92940.getClass(), "firstName", "wgRGBNrTGP");
        setField(term92940, term92940.getClass(), "middleName", "FIdNVptZpW");
        setField(term92940, term92940.getClass(), "lastName", "rQjxAhisjm");
        setField(term92940, term92940.getClass(), "email", "ZDhASPHjDG");
        setField(term92940, term92940.getClass(), "passwordHash", "HNVOAXYNEZ");
        setIntField(term92940, term92940.getClass(), "positionId", 1048451946);
        setBooleanField(term92940, term92940.getClass(), "isArchived", true);
        setIntField(term93004, term93004.getClass(), "nanos", 370000000);
        setLongField(term93004, term93004.getClass(), "fastTime", 1674499548000L);
        setField(term93004, term93004.getClass(), "cdate", null);
        setField(term92940, term92940.getClass(), "createdDate", term93004);
        setIntField(term93007, term93007.getClass(), "nanos", 737000000);
        setLongField(term93007, term93007.getClass(), "fastTime", 1727341758000L);
        setField(term93007, term93007.getClass(), "cdate", null);
        setField(term92940, term92940.getClass(), "lastModifiedDate", term93007);
        setField(term92940, term92940.getClass(), "employeeRoles", term93010);
        setIntField(term93016, term93016.getClass(), "employeeId", 5603560);
        setIntField(term93016, term93016.getClass(), "projectId", -1079020032);
        setField(term93016, term93016.getClass(), "projectRoleId", enum206);
        setField(term93016, term93016.getClass(), "externalRate", term93019);
        setField(term92940, term92940.getClass(), "employeeProjectRole", term93016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[1];
        args[0] = term92940;
        callMethod(klass, "setEmployee", argTypes, term92760, args);
    }

};


