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

public class TrackUnit_getRejectReason_8472395837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69373;

    public TrackUnit_getRejectReason_8472395837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69554 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term69553 = ((Class) term69554).getDeclaredField((String) "APPROVED");
        ((Field) term69553).setAccessible(true);
        Object enum157 = ((Field) term69553).get((Object) null);
        HashMap term69496 = new HashMap();
        Set<Object> term69984 =  ((Map) term69496).keySet();
        HashSet term69495 = new HashSet((Collection<? extends Object>) term69984);
        Class<? extends Object> term69986 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term69985 = ((Class) term69986).getDeclaredField((String) "MANAGER");
        ((Field) term69985).setAccessible(true);
        Object enum158 = ((Field) term69985).get((Object) null);
        Float term69507 = new Float(0.35872674F);
        term69373 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term69375 = newInstance(Class.forName("java.sql.Date"));
        Object term69418 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69421 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69425 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term69489 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69492 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69501 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term69509 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term69524 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69527 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69530 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term69547 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69550 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term69373, term69373.getClass(), "id", -4443169559037975007L);
        setLongField(term69375, term69375.getClass(), "fastTime", 1515890130018L);
        setField(term69375, term69375.getClass(), "cdate", null);
        setField(term69373, term69373.getClass(), "workDay", term69375);
        setField(term69373, term69373.getClass(), "status", enum157);
        setFloatField(term69373, term69373.getClass(), "hours", 0.26413453F);
        setField(term69373, term69373.getClass(), "comment", "boSSpezHeU");
        setField(term69373, term69373.getClass(), "rejectReason", "OUeBWNTQDh");
        setFloatField(term69373, term69373.getClass(), "rate", 0.7944024F);
        setBooleanField(term69373, term69373.getClass(), "billable", true);
        setLongField(term69373, term69373.getClass(), "taskId", -3842548265506930260L);
        setIntField(term69373, term69373.getClass(), "employeeId", -1702055571);
        setIntField(term69418, term69418.getClass(), "nanos", 2000000);
        setLongField(term69418, term69418.getClass(), "fastTime", 1602126119000L);
        setField(term69418, term69418.getClass(), "cdate", null);
        setField(term69373, term69373.getClass(), "createdDate", term69418);
        setIntField(term69421, term69421.getClass(), "nanos", 781000000);
        setLongField(term69421, term69421.getClass(), "fastTime", 1444163840000L);
        setField(term69421, term69421.getClass(), "cdate", null);
        setField(term69373, term69373.getClass(), "lastModifiedDate", term69421);
        setBooleanField(term69373, term69373.getClass(), "frozen", false);
        setIntField(term69425, term69425.getClass(), "id", -944542900);
        setField(term69425, term69425.getClass(), "firstName", "gltJarNuUk");
        setField(term69425, term69425.getClass(), "middleName", "ZwZIDwYcSW");
        setField(term69425, term69425.getClass(), "lastName", "sOdkipUKRu");
        setField(term69425, term69425.getClass(), "email", "oKwCDqywym");
        setField(term69425, term69425.getClass(), "passwordHash", "zjZYTddemL");
        setIntField(term69425, term69425.getClass(), "positionId", 2063762142);
        setBooleanField(term69425, term69425.getClass(), "isArchived", true);
        setIntField(term69489, term69489.getClass(), "nanos", 684000000);
        setLongField(term69489, term69489.getClass(), "fastTime", 1654988832000L);
        setField(term69489, term69489.getClass(), "cdate", null);
        setField(term69425, term69425.getClass(), "createdDate", term69489);
        setIntField(term69492, term69492.getClass(), "nanos", 90000000);
        setLongField(term69492, term69492.getClass(), "fastTime", 1664721874000L);
        setField(term69492, term69492.getClass(), "cdate", null);
        setField(term69425, term69425.getClass(), "lastModifiedDate", term69492);
        setField(term69425, term69425.getClass(), "employeeRoles", term69495);
        setIntField(term69501, term69501.getClass(), "employeeId", 1658391716);
        setIntField(term69501, term69501.getClass(), "projectId", 2143282300);
        setField(term69501, term69501.getClass(), "projectRoleId", enum158);
        setField(term69501, term69501.getClass(), "externalRate", term69507);
        setField(term69425, term69425.getClass(), "employeeProjectRole", term69501);
        setField(term69373, term69373.getClass(), "employee", term69425);
        setIntField(term69509, term69509.getClass(), "id", 1137624258);
        setField(term69509, term69509.getClass(), "name", "QtrylgCLiF");
        setBooleanField(term69509, term69509.getClass(), "isArchived", true);
        setIntField(term69524, term69524.getClass(), "nanos", 576000000);
        setLongField(term69524, term69524.getClass(), "fastTime", 1699914262000L);
        setField(term69524, term69524.getClass(), "cdate", null);
        setField(term69509, term69509.getClass(), "createdDate", term69524);
        setIntField(term69527, term69527.getClass(), "nanos", 274000000);
        setLongField(term69527, term69527.getClass(), "fastTime", 1706625396000L);
        setField(term69527, term69527.getClass(), "cdate", null);
        setField(term69509, term69509.getClass(), "lastModifiedDate", term69527);
        setField(term69373, term69373.getClass(), "project", term69509);
        setLongField(term69530, term69530.getClass(), "id", -5788180182343976541L);
        setField(term69530, term69530.getClass(), "name", "orEuhCStGM");
        setIntField(term69530, term69530.getClass(), "projectId", 977862393);
        setBooleanField(term69530, term69530.getClass(), "billable", false);
        setBooleanField(term69530, term69530.getClass(), "isArchived", false);
        setIntField(term69547, term69547.getClass(), "nanos", 769000000);
        setLongField(term69547, term69547.getClass(), "fastTime", 1714082506000L);
        setField(term69547, term69547.getClass(), "cdate", null);
        setField(term69530, term69530.getClass(), "createdDate", term69547);
        setIntField(term69550, term69550.getClass(), "nanos", 390000000);
        setLongField(term69550, term69550.getClass(), "fastTime", 1792458828000L);
        setField(term69550, term69550.getClass(), "cdate", null);
        setField(term69530, term69530.getClass(), "lastModifiedDate", term69550);
        setField(term69373, term69373.getClass(), "task", term69530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRejectReason", argTypes, term69373, args);
    }

};


