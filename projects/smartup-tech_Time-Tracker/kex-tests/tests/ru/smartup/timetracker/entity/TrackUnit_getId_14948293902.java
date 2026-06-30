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

public class TrackUnit_getId_14948293902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64517;

    public TrackUnit_getId_14948293902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64699 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term64698 = ((Class) term64699).getDeclaredField((String) "SUBMITTED");
        ((Field) term64698).setAccessible(true);
        Object enum147 = ((Field) term64698).get((Object) null);
        HashMap term64641 = new HashMap();
        Set<Object> term65132 =  ((Map) term64641).keySet();
        HashSet term64640 = new HashSet((Collection<? extends Object>) term65132);
        Class<? extends Object> term65134 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term65133 = ((Class) term65134).getDeclaredField((String) "MANAGER");
        ((Field) term65133).setAccessible(true);
        Object enum148 = ((Field) term65133).get((Object) null);
        Float term64652 = new Float(0.97831506F);
        term64517 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term64519 = newInstance(Class.forName("java.sql.Date"));
        Object term64563 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64566 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64570 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term64634 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64637 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64646 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term64654 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term64669 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64672 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64675 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term64692 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term64695 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term64517, term64517.getClass(), "id", -6823727938421990489L);
        setLongField(term64519, term64519.getClass(), "fastTime", 1345871412244L);
        setField(term64519, term64519.getClass(), "cdate", null);
        setField(term64517, term64517.getClass(), "workDay", term64519);
        setField(term64517, term64517.getClass(), "status", enum147);
        setFloatField(term64517, term64517.getClass(), "hours", 0.3455959F);
        setField(term64517, term64517.getClass(), "comment", "dAldIGYAXV");
        setField(term64517, term64517.getClass(), "rejectReason", "mLwibAPEsa");
        setFloatField(term64517, term64517.getClass(), "rate", 0.09123778F);
        setBooleanField(term64517, term64517.getClass(), "billable", false);
        setLongField(term64517, term64517.getClass(), "taskId", -484994522244390100L);
        setIntField(term64517, term64517.getClass(), "employeeId", 1209799204);
        setIntField(term64563, term64563.getClass(), "nanos", 506000000);
        setLongField(term64563, term64563.getClass(), "fastTime", 1792321976000L);
        setField(term64563, term64563.getClass(), "cdate", null);
        setField(term64517, term64517.getClass(), "createdDate", term64563);
        setIntField(term64566, term64566.getClass(), "nanos", 14000000);
        setLongField(term64566, term64566.getClass(), "fastTime", 1273567966000L);
        setField(term64566, term64566.getClass(), "cdate", null);
        setField(term64517, term64517.getClass(), "lastModifiedDate", term64566);
        setBooleanField(term64517, term64517.getClass(), "frozen", false);
        setIntField(term64570, term64570.getClass(), "id", 1094107751);
        setField(term64570, term64570.getClass(), "firstName", "zsWKWiTFuo");
        setField(term64570, term64570.getClass(), "middleName", "UPUbwyHQKN");
        setField(term64570, term64570.getClass(), "lastName", "lgQkrXANyI");
        setField(term64570, term64570.getClass(), "email", "MeTmRZXErV");
        setField(term64570, term64570.getClass(), "passwordHash", "jNxbVmoZgq");
        setIntField(term64570, term64570.getClass(), "positionId", 844222656);
        setBooleanField(term64570, term64570.getClass(), "isArchived", false);
        setIntField(term64634, term64634.getClass(), "nanos", 213000000);
        setLongField(term64634, term64634.getClass(), "fastTime", 1539715048000L);
        setField(term64634, term64634.getClass(), "cdate", null);
        setField(term64570, term64570.getClass(), "createdDate", term64634);
        setIntField(term64637, term64637.getClass(), "nanos", 805000000);
        setLongField(term64637, term64637.getClass(), "fastTime", 1623020257000L);
        setField(term64637, term64637.getClass(), "cdate", null);
        setField(term64570, term64570.getClass(), "lastModifiedDate", term64637);
        setField(term64570, term64570.getClass(), "employeeRoles", term64640);
        setIntField(term64646, term64646.getClass(), "employeeId", -18216811);
        setIntField(term64646, term64646.getClass(), "projectId", -1813280137);
        setField(term64646, term64646.getClass(), "projectRoleId", enum148);
        setField(term64646, term64646.getClass(), "externalRate", term64652);
        setField(term64570, term64570.getClass(), "employeeProjectRole", term64646);
        setField(term64517, term64517.getClass(), "employee", term64570);
        setIntField(term64654, term64654.getClass(), "id", 719656595);
        setField(term64654, term64654.getClass(), "name", "PvmBHIXaMY");
        setBooleanField(term64654, term64654.getClass(), "isArchived", false);
        setIntField(term64669, term64669.getClass(), "nanos", 637000000);
        setLongField(term64669, term64669.getClass(), "fastTime", 1667554008000L);
        setField(term64669, term64669.getClass(), "cdate", null);
        setField(term64654, term64654.getClass(), "createdDate", term64669);
        setIntField(term64672, term64672.getClass(), "nanos", 868000000);
        setLongField(term64672, term64672.getClass(), "fastTime", 1263024120000L);
        setField(term64672, term64672.getClass(), "cdate", null);
        setField(term64654, term64654.getClass(), "lastModifiedDate", term64672);
        setField(term64517, term64517.getClass(), "project", term64654);
        setLongField(term64675, term64675.getClass(), "id", 1233889271256172047L);
        setField(term64675, term64675.getClass(), "name", "hulYxtowxw");
        setIntField(term64675, term64675.getClass(), "projectId", -1516995753);
        setBooleanField(term64675, term64675.getClass(), "billable", false);
        setBooleanField(term64675, term64675.getClass(), "isArchived", false);
        setIntField(term64692, term64692.getClass(), "nanos", 843000000);
        setLongField(term64692, term64692.getClass(), "fastTime", 1590241300000L);
        setField(term64692, term64692.getClass(), "cdate", null);
        setField(term64675, term64675.getClass(), "createdDate", term64692);
        setIntField(term64695, term64695.getClass(), "nanos", 654000000);
        setLongField(term64695, term64695.getClass(), "fastTime", 1674654153000L);
        setField(term64695, term64695.getClass(), "cdate", null);
        setField(term64675, term64675.getClass(), "lastModifiedDate", term64695);
        setField(term64517, term64517.getClass(), "task", term64675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term64517, args);
    }

};


