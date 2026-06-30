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

public class TrackUnit_setLastModifiedDate_194340003429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90809;
     Object term90989;

    public TrackUnit_setLastModifiedDate_194340003429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90993 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term90992 = ((Class) term90993).getDeclaredField((String) "REJECTED");
        ((Field) term90992).setAccessible(true);
        Object enum201 = ((Field) term90992).get((Object) null);
        HashMap term90932 = new HashMap();
        Set<Object> term91423 =  ((Map) term90932).keySet();
        HashSet term90931 = new HashSet((Collection<? extends Object>) term91423);
        Class<? extends Object> term91425 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term91424 = ((Class) term91425).getDeclaredField((String) "EMPLOYEE");
        ((Field) term91424).setAccessible(true);
        Object enum202 = ((Field) term91424).get((Object) null);
        Float term90943 = new Float(0.21924508F);
        term90809 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term90811 = newInstance(Class.forName("java.sql.Date"));
        Object term90854 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90857 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90861 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term90925 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90928 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90937 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term90945 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term90960 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90963 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90966 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term90983 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term90986 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term90809, term90809.getClass(), "id", -4393710401270724527L);
        setLongField(term90811, term90811.getClass(), "fastTime", 1329640267573L);
        setField(term90811, term90811.getClass(), "cdate", null);
        setField(term90809, term90809.getClass(), "workDay", term90811);
        setField(term90809, term90809.getClass(), "status", enum201);
        setFloatField(term90809, term90809.getClass(), "hours", 0.114929974F);
        setField(term90809, term90809.getClass(), "comment", "awDQVEVIKi");
        setField(term90809, term90809.getClass(), "rejectReason", "HJwNgUzZZR");
        setFloatField(term90809, term90809.getClass(), "rate", 0.30926234F);
        setBooleanField(term90809, term90809.getClass(), "billable", true);
        setLongField(term90809, term90809.getClass(), "taskId", -4822736661741380518L);
        setIntField(term90809, term90809.getClass(), "employeeId", -1428063820);
        setIntField(term90854, term90854.getClass(), "nanos", 431000000);
        setLongField(term90854, term90854.getClass(), "fastTime", 1771461193000L);
        setField(term90854, term90854.getClass(), "cdate", null);
        setField(term90809, term90809.getClass(), "createdDate", term90854);
        setIntField(term90857, term90857.getClass(), "nanos", 395000000);
        setLongField(term90857, term90857.getClass(), "fastTime", 1659495441000L);
        setField(term90857, term90857.getClass(), "cdate", null);
        setField(term90809, term90809.getClass(), "lastModifiedDate", term90857);
        setBooleanField(term90809, term90809.getClass(), "frozen", true);
        setIntField(term90861, term90861.getClass(), "id", -1271375703);
        setField(term90861, term90861.getClass(), "firstName", "FvUCZgTXhq");
        setField(term90861, term90861.getClass(), "middleName", "wWWidPCHzx");
        setField(term90861, term90861.getClass(), "lastName", "OwPIiBRuKK");
        setField(term90861, term90861.getClass(), "email", "sgfGySMODT");
        setField(term90861, term90861.getClass(), "passwordHash", "ndAITnOsny");
        setIntField(term90861, term90861.getClass(), "positionId", 1136208236);
        setBooleanField(term90861, term90861.getClass(), "isArchived", true);
        setIntField(term90925, term90925.getClass(), "nanos", 997000000);
        setLongField(term90925, term90925.getClass(), "fastTime", 1748659582000L);
        setField(term90925, term90925.getClass(), "cdate", null);
        setField(term90861, term90861.getClass(), "createdDate", term90925);
        setIntField(term90928, term90928.getClass(), "nanos", 669000000);
        setLongField(term90928, term90928.getClass(), "fastTime", 1318216722000L);
        setField(term90928, term90928.getClass(), "cdate", null);
        setField(term90861, term90861.getClass(), "lastModifiedDate", term90928);
        setField(term90861, term90861.getClass(), "employeeRoles", term90931);
        setIntField(term90937, term90937.getClass(), "employeeId", -1220630391);
        setIntField(term90937, term90937.getClass(), "projectId", -995822131);
        setField(term90937, term90937.getClass(), "projectRoleId", enum202);
        setField(term90937, term90937.getClass(), "externalRate", term90943);
        setField(term90861, term90861.getClass(), "employeeProjectRole", term90937);
        setField(term90809, term90809.getClass(), "employee", term90861);
        setIntField(term90945, term90945.getClass(), "id", -687282231);
        setField(term90945, term90945.getClass(), "name", "CVZnTiJucs");
        setBooleanField(term90945, term90945.getClass(), "isArchived", true);
        setIntField(term90960, term90960.getClass(), "nanos", 31000000);
        setLongField(term90960, term90960.getClass(), "fastTime", 1803987461000L);
        setField(term90960, term90960.getClass(), "cdate", null);
        setField(term90945, term90945.getClass(), "createdDate", term90960);
        setIntField(term90963, term90963.getClass(), "nanos", 556000000);
        setLongField(term90963, term90963.getClass(), "fastTime", 1301078543000L);
        setField(term90963, term90963.getClass(), "cdate", null);
        setField(term90945, term90945.getClass(), "lastModifiedDate", term90963);
        setField(term90809, term90809.getClass(), "project", term90945);
        setLongField(term90966, term90966.getClass(), "id", -5386201758403679145L);
        setField(term90966, term90966.getClass(), "name", "ecHEQufXoq");
        setIntField(term90966, term90966.getClass(), "projectId", 1200440315);
        setBooleanField(term90966, term90966.getClass(), "billable", true);
        setBooleanField(term90966, term90966.getClass(), "isArchived", true);
        setIntField(term90983, term90983.getClass(), "nanos", 503000000);
        setLongField(term90983, term90983.getClass(), "fastTime", 1364615364000L);
        setField(term90983, term90983.getClass(), "cdate", null);
        setField(term90966, term90966.getClass(), "createdDate", term90983);
        setIntField(term90986, term90986.getClass(), "nanos", 731000000);
        setLongField(term90986, term90986.getClass(), "fastTime", 1818327280000L);
        setField(term90986, term90986.getClass(), "cdate", null);
        setField(term90966, term90966.getClass(), "lastModifiedDate", term90986);
        setField(term90809, term90809.getClass(), "task", term90966);
        term90989 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term90989, term90989.getClass(), "nanos", 682000000);
        setLongField(term90989, term90989.getClass(), "fastTime", 1472454465000L);
        setField(term90989, term90989.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term90989;
        callMethod(klass, "setLastModifiedDate", argTypes, term90809, args);
    }

};


