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

public class TrackUnit_setStatus_132360853020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82017;
     Object enum183;

    public TrackUnit_setStatus_132360853020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82198 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term82197 = ((Class) term82198).getDeclaredField((String) "REJECTED");
        ((Field) term82197).setAccessible(true);
        enum183 = ((Field) term82197).get((Object) null);
        HashMap term82140 = new HashMap();
        Set<Object> term82628 =  ((Map) term82140).keySet();
        HashSet term82139 = new HashSet((Collection<? extends Object>) term82628);
        Class<? extends Object> term82630 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term82629 = ((Class) term82630).getDeclaredField((String) "EMPLOYEE");
        ((Field) term82629).setAccessible(true);
        Object enum184 = ((Field) term82629).get((Object) null);
        Float term82151 = new Float(0.25392914F);
        term82017 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term82019 = newInstance(Class.forName("java.sql.Date"));
        Object term82062 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82065 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82069 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term82133 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82136 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82145 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term82153 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term82168 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82171 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82174 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term82191 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term82194 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term82017, term82017.getClass(), "id", -8876856890348836498L);
        setLongField(term82019, term82019.getClass(), "fastTime", 1725122217647L);
        setField(term82019, term82019.getClass(), "cdate", null);
        setField(term82017, term82017.getClass(), "workDay", term82019);
        setField(term82017, term82017.getClass(), "status", enum183);
        setFloatField(term82017, term82017.getClass(), "hours", 0.7332741F);
        setField(term82017, term82017.getClass(), "comment", "iiHBhsNFgk");
        setField(term82017, term82017.getClass(), "rejectReason", "HknsTajwxJ");
        setFloatField(term82017, term82017.getClass(), "rate", 0.15826964F);
        setBooleanField(term82017, term82017.getClass(), "billable", true);
        setLongField(term82017, term82017.getClass(), "taskId", 846579494941632714L);
        setIntField(term82017, term82017.getClass(), "employeeId", -222941705);
        setIntField(term82062, term82062.getClass(), "nanos", 542000000);
        setLongField(term82062, term82062.getClass(), "fastTime", 1620286438000L);
        setField(term82062, term82062.getClass(), "cdate", null);
        setField(term82017, term82017.getClass(), "createdDate", term82062);
        setIntField(term82065, term82065.getClass(), "nanos", 808000000);
        setLongField(term82065, term82065.getClass(), "fastTime", 1340133255000L);
        setField(term82065, term82065.getClass(), "cdate", null);
        setField(term82017, term82017.getClass(), "lastModifiedDate", term82065);
        setBooleanField(term82017, term82017.getClass(), "frozen", false);
        setIntField(term82069, term82069.getClass(), "id", 291864719);
        setField(term82069, term82069.getClass(), "firstName", "XtiurrVYKw");
        setField(term82069, term82069.getClass(), "middleName", "rsumfoDNHa");
        setField(term82069, term82069.getClass(), "lastName", "ceCWHUTQUM");
        setField(term82069, term82069.getClass(), "email", "LrqwfrKKtS");
        setField(term82069, term82069.getClass(), "passwordHash", "ZUdnQXfzCI");
        setIntField(term82069, term82069.getClass(), "positionId", -1549607466);
        setBooleanField(term82069, term82069.getClass(), "isArchived", true);
        setIntField(term82133, term82133.getClass(), "nanos", 700000000);
        setLongField(term82133, term82133.getClass(), "fastTime", 1308620041000L);
        setField(term82133, term82133.getClass(), "cdate", null);
        setField(term82069, term82069.getClass(), "createdDate", term82133);
        setIntField(term82136, term82136.getClass(), "nanos", 460000000);
        setLongField(term82136, term82136.getClass(), "fastTime", 1843303241000L);
        setField(term82136, term82136.getClass(), "cdate", null);
        setField(term82069, term82069.getClass(), "lastModifiedDate", term82136);
        setField(term82069, term82069.getClass(), "employeeRoles", term82139);
        setIntField(term82145, term82145.getClass(), "employeeId", 853609788);
        setIntField(term82145, term82145.getClass(), "projectId", -197820800);
        setField(term82145, term82145.getClass(), "projectRoleId", enum184);
        setField(term82145, term82145.getClass(), "externalRate", term82151);
        setField(term82069, term82069.getClass(), "employeeProjectRole", term82145);
        setField(term82017, term82017.getClass(), "employee", term82069);
        setIntField(term82153, term82153.getClass(), "id", 723812297);
        setField(term82153, term82153.getClass(), "name", "EULDrUNQvw");
        setBooleanField(term82153, term82153.getClass(), "isArchived", true);
        setIntField(term82168, term82168.getClass(), "nanos", 825000000);
        setLongField(term82168, term82168.getClass(), "fastTime", 1609246774000L);
        setField(term82168, term82168.getClass(), "cdate", null);
        setField(term82153, term82153.getClass(), "createdDate", term82168);
        setIntField(term82171, term82171.getClass(), "nanos", 466000000);
        setLongField(term82171, term82171.getClass(), "fastTime", 1596056705000L);
        setField(term82171, term82171.getClass(), "cdate", null);
        setField(term82153, term82153.getClass(), "lastModifiedDate", term82171);
        setField(term82017, term82017.getClass(), "project", term82153);
        setLongField(term82174, term82174.getClass(), "id", 6689117472719450333L);
        setField(term82174, term82174.getClass(), "name", "BtvAvsJSei");
        setIntField(term82174, term82174.getClass(), "projectId", 1639448749);
        setBooleanField(term82174, term82174.getClass(), "billable", true);
        setBooleanField(term82174, term82174.getClass(), "isArchived", false);
        setIntField(term82191, term82191.getClass(), "nanos", 499000000);
        setLongField(term82191, term82191.getClass(), "fastTime", 1822168571000L);
        setField(term82191, term82191.getClass(), "cdate", null);
        setField(term82174, term82174.getClass(), "createdDate", term82191);
        setIntField(term82194, term82194.getClass(), "nanos", 918000000);
        setLongField(term82194, term82194.getClass(), "fastTime", 1801349827000L);
        setField(term82194, term82194.getClass(), "cdate", null);
        setField(term82174, term82174.getClass(), "lastModifiedDate", term82194);
        setField(term82017, term82017.getClass(), "task", term82174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Object[] args = new Object[1];
        args[0] = enum183;
        callMethod(klass, "setStatus", argTypes, term82017, args);
    }

};


