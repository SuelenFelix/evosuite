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

public class TrackUnit_setCreatedDate_100301849928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89836;
     Object term90016;

    public TrackUnit_setCreatedDate_100301849928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90020 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term90019 = ((Class) term90020).getDeclaredField((String) "REJECTED");
        ((Field) term90019).setAccessible(true);
        Object enum199 = ((Field) term90019).get((Object) null);
        HashMap term89959 = new HashMap();
        Set<Object> term90450 =  ((Map) term89959).keySet();
        HashSet term89958 = new HashSet((Collection<? extends Object>) term90450);
        Class<? extends Object> term90452 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term90451 = ((Class) term90452).getDeclaredField((String) "MANAGER");
        ((Field) term90451).setAccessible(true);
        Object enum200 = ((Field) term90451).get((Object) null);
        Float term89970 = new Float(0.91971004F);
        term89836 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term89838 = newInstance(Class.forName("java.sql.Date"));
        Object term89881 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89884 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89888 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term89952 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89955 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89964 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term89972 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term89987 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89990 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89993 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term90010 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90013 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term89836, term89836.getClass(), "id", 1667122142089513324L);
        setLongField(term89838, term89838.getClass(), "fastTime", 1739417792956L);
        setField(term89838, term89838.getClass(), "cdate", null);
        setField(term89836, term89836.getClass(), "workDay", term89838);
        setField(term89836, term89836.getClass(), "status", enum199);
        setFloatField(term89836, term89836.getClass(), "hours", 0.10667074F);
        setField(term89836, term89836.getClass(), "comment", "EWFbEDAVrE");
        setField(term89836, term89836.getClass(), "rejectReason", "EMiMtYgfvr");
        setFloatField(term89836, term89836.getClass(), "rate", 0.9571234F);
        setBooleanField(term89836, term89836.getClass(), "billable", false);
        setLongField(term89836, term89836.getClass(), "taskId", -6342139649364011743L);
        setIntField(term89836, term89836.getClass(), "employeeId", 1237549886);
        setIntField(term89881, term89881.getClass(), "nanos", 954000000);
        setLongField(term89881, term89881.getClass(), "fastTime", 1526136348000L);
        setField(term89881, term89881.getClass(), "cdate", null);
        setField(term89836, term89836.getClass(), "createdDate", term89881);
        setIntField(term89884, term89884.getClass(), "nanos", 151000000);
        setLongField(term89884, term89884.getClass(), "fastTime", 1268652355000L);
        setField(term89884, term89884.getClass(), "cdate", null);
        setField(term89836, term89836.getClass(), "lastModifiedDate", term89884);
        setBooleanField(term89836, term89836.getClass(), "frozen", false);
        setIntField(term89888, term89888.getClass(), "id", -1945635750);
        setField(term89888, term89888.getClass(), "firstName", "OyYyYYnJuF");
        setField(term89888, term89888.getClass(), "middleName", "aYLvcxZohT");
        setField(term89888, term89888.getClass(), "lastName", "mnHyQbMyld");
        setField(term89888, term89888.getClass(), "email", "KHtaDOIcJZ");
        setField(term89888, term89888.getClass(), "passwordHash", "vgdwrCZczl");
        setIntField(term89888, term89888.getClass(), "positionId", -1622760744);
        setBooleanField(term89888, term89888.getClass(), "isArchived", false);
        setIntField(term89952, term89952.getClass(), "nanos", 849000000);
        setLongField(term89952, term89952.getClass(), "fastTime", 1402457772000L);
        setField(term89952, term89952.getClass(), "cdate", null);
        setField(term89888, term89888.getClass(), "createdDate", term89952);
        setIntField(term89955, term89955.getClass(), "nanos", 546000000);
        setLongField(term89955, term89955.getClass(), "fastTime", 1499771491000L);
        setField(term89955, term89955.getClass(), "cdate", null);
        setField(term89888, term89888.getClass(), "lastModifiedDate", term89955);
        setField(term89888, term89888.getClass(), "employeeRoles", term89958);
        setIntField(term89964, term89964.getClass(), "employeeId", 2068435279);
        setIntField(term89964, term89964.getClass(), "projectId", -1556527718);
        setField(term89964, term89964.getClass(), "projectRoleId", enum200);
        setField(term89964, term89964.getClass(), "externalRate", term89970);
        setField(term89888, term89888.getClass(), "employeeProjectRole", term89964);
        setField(term89836, term89836.getClass(), "employee", term89888);
        setIntField(term89972, term89972.getClass(), "id", 895255351);
        setField(term89972, term89972.getClass(), "name", "gKMNrpKBpu");
        setBooleanField(term89972, term89972.getClass(), "isArchived", true);
        setIntField(term89987, term89987.getClass(), "nanos", 664000000);
        setLongField(term89987, term89987.getClass(), "fastTime", 1641280324000L);
        setField(term89987, term89987.getClass(), "cdate", null);
        setField(term89972, term89972.getClass(), "createdDate", term89987);
        setIntField(term89990, term89990.getClass(), "nanos", 597000000);
        setLongField(term89990, term89990.getClass(), "fastTime", 1856358113000L);
        setField(term89990, term89990.getClass(), "cdate", null);
        setField(term89972, term89972.getClass(), "lastModifiedDate", term89990);
        setField(term89836, term89836.getClass(), "project", term89972);
        setLongField(term89993, term89993.getClass(), "id", -4924950707540628022L);
        setField(term89993, term89993.getClass(), "name", "ZbHJVEqcoa");
        setIntField(term89993, term89993.getClass(), "projectId", -1317044799);
        setBooleanField(term89993, term89993.getClass(), "billable", true);
        setBooleanField(term89993, term89993.getClass(), "isArchived", false);
        setIntField(term90010, term90010.getClass(), "nanos", 775000000);
        setLongField(term90010, term90010.getClass(), "fastTime", 1303135317000L);
        setField(term90010, term90010.getClass(), "cdate", null);
        setField(term89993, term89993.getClass(), "createdDate", term90010);
        setIntField(term90013, term90013.getClass(), "nanos", 622000000);
        setLongField(term90013, term90013.getClass(), "fastTime", 1846740048000L);
        setField(term90013, term90013.getClass(), "cdate", null);
        setField(term89993, term89993.getClass(), "lastModifiedDate", term90013);
        setField(term89836, term89836.getClass(), "task", term89993);
        term90016 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term90016, term90016.getClass(), "nanos", 774000000);
        setLongField(term90016, term90016.getClass(), "fastTime", 1684471658000L);
        setField(term90016, term90016.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term90016;
        callMethod(klass, "setCreatedDate", argTypes, term89836, args);
    }

};


