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

public class TrackUnit_hashCode_121679536436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97815;

    public TrackUnit_hashCode_121679536436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97996 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term97995 = ((Class) term97996).getDeclaredField((String) "REJECTED");
        ((Field) term97995).setAccessible(true);
        Object enum215 = ((Field) term97995).get((Object) null);
        HashMap term97938 = new HashMap();
        Set<Object> term98426 =  ((Map) term97938).keySet();
        HashSet term97937 = new HashSet((Collection<? extends Object>) term98426);
        Class<? extends Object> term98428 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term98427 = ((Class) term98428).getDeclaredField((String) "MANAGER");
        ((Field) term98427).setAccessible(true);
        Object enum216 = ((Field) term98427).get((Object) null);
        Float term97949 = new Float(0.15917838F);
        term97815 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term97817 = newInstance(Class.forName("java.sql.Date"));
        Object term97860 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97863 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97867 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term97931 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97934 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97943 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term97951 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term97966 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97969 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97972 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term97989 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97992 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term97815, term97815.getClass(), "id", 8802866251294305945L);
        setLongField(term97817, term97817.getClass(), "fastTime", 1304532099366L);
        setField(term97817, term97817.getClass(), "cdate", null);
        setField(term97815, term97815.getClass(), "workDay", term97817);
        setField(term97815, term97815.getClass(), "status", enum215);
        setFloatField(term97815, term97815.getClass(), "hours", 0.35872674F);
        setField(term97815, term97815.getClass(), "comment", "fRujHWvXjJ");
        setField(term97815, term97815.getClass(), "rejectReason", "EAIAAStlTz");
        setFloatField(term97815, term97815.getClass(), "rate", 0.2946385F);
        setBooleanField(term97815, term97815.getClass(), "billable", false);
        setLongField(term97815, term97815.getClass(), "taskId", 4513004407927379358L);
        setIntField(term97815, term97815.getClass(), "employeeId", 1091954101);
        setIntField(term97860, term97860.getClass(), "nanos", 249000000);
        setLongField(term97860, term97860.getClass(), "fastTime", 1601556468000L);
        setField(term97860, term97860.getClass(), "cdate", null);
        setField(term97815, term97815.getClass(), "createdDate", term97860);
        setIntField(term97863, term97863.getClass(), "nanos", 934000000);
        setLongField(term97863, term97863.getClass(), "fastTime", 1789139669000L);
        setField(term97863, term97863.getClass(), "cdate", null);
        setField(term97815, term97815.getClass(), "lastModifiedDate", term97863);
        setBooleanField(term97815, term97815.getClass(), "frozen", true);
        setIntField(term97867, term97867.getClass(), "id", 1895143076);
        setField(term97867, term97867.getClass(), "firstName", "yIWXcOQTgy");
        setField(term97867, term97867.getClass(), "middleName", "xAWekqanqc");
        setField(term97867, term97867.getClass(), "lastName", "GSOWFHMlbF");
        setField(term97867, term97867.getClass(), "email", "vpZIqpFbKM");
        setField(term97867, term97867.getClass(), "passwordHash", "dAbwpJCDif");
        setIntField(term97867, term97867.getClass(), "positionId", 1981860404);
        setBooleanField(term97867, term97867.getClass(), "isArchived", true);
        setIntField(term97931, term97931.getClass(), "nanos", 159000000);
        setLongField(term97931, term97931.getClass(), "fastTime", 1648645322000L);
        setField(term97931, term97931.getClass(), "cdate", null);
        setField(term97867, term97867.getClass(), "createdDate", term97931);
        setIntField(term97934, term97934.getClass(), "nanos", 794000000);
        setLongField(term97934, term97934.getClass(), "fastTime", 1750052440000L);
        setField(term97934, term97934.getClass(), "cdate", null);
        setField(term97867, term97867.getClass(), "lastModifiedDate", term97934);
        setField(term97867, term97867.getClass(), "employeeRoles", term97937);
        setIntField(term97943, term97943.getClass(), "employeeId", 732174235);
        setIntField(term97943, term97943.getClass(), "projectId", 470895808);
        setField(term97943, term97943.getClass(), "projectRoleId", enum216);
        setField(term97943, term97943.getClass(), "externalRate", term97949);
        setField(term97867, term97867.getClass(), "employeeProjectRole", term97943);
        setField(term97815, term97815.getClass(), "employee", term97867);
        setIntField(term97951, term97951.getClass(), "id", 1787325291);
        setField(term97951, term97951.getClass(), "name", "ATSXJPySio");
        setBooleanField(term97951, term97951.getClass(), "isArchived", false);
        setIntField(term97966, term97966.getClass(), "nanos", 176000000);
        setLongField(term97966, term97966.getClass(), "fastTime", 1274269834000L);
        setField(term97966, term97966.getClass(), "cdate", null);
        setField(term97951, term97951.getClass(), "createdDate", term97966);
        setIntField(term97969, term97969.getClass(), "nanos", 844000000);
        setLongField(term97969, term97969.getClass(), "fastTime", 1434993547000L);
        setField(term97969, term97969.getClass(), "cdate", null);
        setField(term97951, term97951.getClass(), "lastModifiedDate", term97969);
        setField(term97815, term97815.getClass(), "project", term97951);
        setLongField(term97972, term97972.getClass(), "id", -7115418542247301000L);
        setField(term97972, term97972.getClass(), "name", "XZkOUcbfFg");
        setIntField(term97972, term97972.getClass(), "projectId", 1470349147);
        setBooleanField(term97972, term97972.getClass(), "billable", true);
        setBooleanField(term97972, term97972.getClass(), "isArchived", false);
        setIntField(term97989, term97989.getClass(), "nanos", 542000000);
        setLongField(term97989, term97989.getClass(), "fastTime", 1491373618000L);
        setField(term97989, term97989.getClass(), "cdate", null);
        setField(term97972, term97972.getClass(), "createdDate", term97989);
        setIntField(term97992, term97992.getClass(), "nanos", 414000000);
        setLongField(term97992, term97992.getClass(), "fastTime", 1580957781000L);
        setField(term97992, term97992.getClass(), "cdate", null);
        setField(term97972, term97972.getClass(), "lastModifiedDate", term97992);
        setField(term97815, term97815.getClass(), "task", term97972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term97815, args);
    }

};


