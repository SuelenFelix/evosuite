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

public class TrackUnit_setHours_138676698421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82990;
     Object term83170;

    public TrackUnit_setHours_138676698421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83173 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term83172 = ((Class) term83173).getDeclaredField((String) "APPROVED");
        ((Field) term83172).setAccessible(true);
        Object enum185 = ((Field) term83172).get((Object) null);
        HashMap term83113 = new HashMap();
        Set<Object> term83603 =  ((Map) term83113).keySet();
        HashSet term83112 = new HashSet((Collection<? extends Object>) term83603);
        Class<? extends Object> term83605 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term83604 = ((Class) term83605).getDeclaredField((String) "MANAGER");
        ((Field) term83604).setAccessible(true);
        Object enum186 = ((Field) term83604).get((Object) null);
        Float term83124 = new Float(0.63972145F);
        term82990 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term82992 = newInstance(Class.forName("java.sql.Date"));
        Object term83035 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83038 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83042 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term83106 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83109 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83118 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term83126 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term83141 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83144 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83147 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term83164 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83167 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term82990, term82990.getClass(), "id", 5836128569274066678L);
        setLongField(term82992, term82992.getClass(), "fastTime", 1550698994689L);
        setField(term82992, term82992.getClass(), "cdate", null);
        setField(term82990, term82990.getClass(), "workDay", term82992);
        setField(term82990, term82990.getClass(), "status", enum185);
        setFloatField(term82990, term82990.getClass(), "hours", 0.45691717F);
        setField(term82990, term82990.getClass(), "comment", "vqnBkkxoIa");
        setField(term82990, term82990.getClass(), "rejectReason", "bycpZjxXFn");
        setFloatField(term82990, term82990.getClass(), "rate", 0.17877543F);
        setBooleanField(term82990, term82990.getClass(), "billable", true);
        setLongField(term82990, term82990.getClass(), "taskId", -2177368829816872572L);
        setIntField(term82990, term82990.getClass(), "employeeId", 873659088);
        setIntField(term83035, term83035.getClass(), "nanos", 550000000);
        setLongField(term83035, term83035.getClass(), "fastTime", 1763227484000L);
        setField(term83035, term83035.getClass(), "cdate", null);
        setField(term82990, term82990.getClass(), "createdDate", term83035);
        setIntField(term83038, term83038.getClass(), "nanos", 126000000);
        setLongField(term83038, term83038.getClass(), "fastTime", 1704103595000L);
        setField(term83038, term83038.getClass(), "cdate", null);
        setField(term82990, term82990.getClass(), "lastModifiedDate", term83038);
        setBooleanField(term82990, term82990.getClass(), "frozen", true);
        setIntField(term83042, term83042.getClass(), "id", -975748721);
        setField(term83042, term83042.getClass(), "firstName", "jQWttOAiwL");
        setField(term83042, term83042.getClass(), "middleName", "DzKFxEuEEC");
        setField(term83042, term83042.getClass(), "lastName", "CAMnvfDLJL");
        setField(term83042, term83042.getClass(), "email", "mfHtgSbdjD");
        setField(term83042, term83042.getClass(), "passwordHash", "cmuaUiHMVL");
        setIntField(term83042, term83042.getClass(), "positionId", 433248783);
        setBooleanField(term83042, term83042.getClass(), "isArchived", true);
        setIntField(term83106, term83106.getClass(), "nanos", 322000000);
        setLongField(term83106, term83106.getClass(), "fastTime", 1538533165000L);
        setField(term83106, term83106.getClass(), "cdate", null);
        setField(term83042, term83042.getClass(), "createdDate", term83106);
        setIntField(term83109, term83109.getClass(), "nanos", 216000000);
        setLongField(term83109, term83109.getClass(), "fastTime", 1609337065000L);
        setField(term83109, term83109.getClass(), "cdate", null);
        setField(term83042, term83042.getClass(), "lastModifiedDate", term83109);
        setField(term83042, term83042.getClass(), "employeeRoles", term83112);
        setIntField(term83118, term83118.getClass(), "employeeId", -507944154);
        setIntField(term83118, term83118.getClass(), "projectId", -1736183862);
        setField(term83118, term83118.getClass(), "projectRoleId", enum186);
        setField(term83118, term83118.getClass(), "externalRate", term83124);
        setField(term83042, term83042.getClass(), "employeeProjectRole", term83118);
        setField(term82990, term82990.getClass(), "employee", term83042);
        setIntField(term83126, term83126.getClass(), "id", 897010381);
        setField(term83126, term83126.getClass(), "name", "xjoSGPWUgu");
        setBooleanField(term83126, term83126.getClass(), "isArchived", true);
        setIntField(term83141, term83141.getClass(), "nanos", 349000000);
        setLongField(term83141, term83141.getClass(), "fastTime", 1496811435000L);
        setField(term83141, term83141.getClass(), "cdate", null);
        setField(term83126, term83126.getClass(), "createdDate", term83141);
        setIntField(term83144, term83144.getClass(), "nanos", 315000000);
        setLongField(term83144, term83144.getClass(), "fastTime", 1311647488000L);
        setField(term83144, term83144.getClass(), "cdate", null);
        setField(term83126, term83126.getClass(), "lastModifiedDate", term83144);
        setField(term82990, term82990.getClass(), "project", term83126);
        setLongField(term83147, term83147.getClass(), "id", -8463029266761149071L);
        setField(term83147, term83147.getClass(), "name", "uzmqjnOUXu");
        setIntField(term83147, term83147.getClass(), "projectId", -15712667);
        setBooleanField(term83147, term83147.getClass(), "billable", true);
        setBooleanField(term83147, term83147.getClass(), "isArchived", false);
        setIntField(term83164, term83164.getClass(), "nanos", 308000000);
        setLongField(term83164, term83164.getClass(), "fastTime", 1498228261000L);
        setField(term83164, term83164.getClass(), "cdate", null);
        setField(term83147, term83147.getClass(), "createdDate", term83164);
        setIntField(term83167, term83167.getClass(), "nanos", 867000000);
        setLongField(term83167, term83167.getClass(), "fastTime", 1572358905000L);
        setField(term83167, term83167.getClass(), "cdate", null);
        setField(term83147, term83147.getClass(), "lastModifiedDate", term83167);
        setField(term82990, term82990.getClass(), "task", term83147);
        term83170 = new Float(0.8598297F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term83170;
        callMethod(klass, "setHours", argTypes, term82990, args);
    }

};


