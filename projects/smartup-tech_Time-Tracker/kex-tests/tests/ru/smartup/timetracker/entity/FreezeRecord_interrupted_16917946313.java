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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeRecord_interrupted_16917946313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44848;

    public FreezeRecord_interrupted_16917946313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44925 = new HashMap();
        Set<Object> term45033 =  ((Map) term44925).keySet();
        HashSet term44924 = new HashSet((Collection<? extends Object>) term45033);
        Class<? extends Object> term45035 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term45034 = ((Class) term45035).getDeclaredField((String) "EMPLOYEE");
        ((Field) term45034).setAccessible(true);
        Object enum105 = ((Field) term45034).get((Object) null);
        Float term44936 = new Float(0.541592F);
        Class<? extends Object> term45376 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term45375 = ((Class) term45376).getDeclaredField((String) "INTERRUPTED");
        ((Field) term45375).setAccessible(true);
        Object enum106 = ((Field) term45375).get((Object) null);
        term44848 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term44850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44854 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term44918 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44921 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44930 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term44965 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44968 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term44848, term44848.getClass(), "id", -1111249833);
        setIntField(term44850, term44850.getClass(), "year", 2020);
        setShortField(term44850, term44850.getClass(), "month", (short) 11);
        setShortField(term44850, term44850.getClass(), "day", (short) 22);
        setField(term44848, term44848.getClass(), "freezeDate", term44850);
        setIntField(term44854, term44854.getClass(), "id", -1692331299);
        setField(term44854, term44854.getClass(), "firstName", "BjugTaMcxJ");
        setField(term44854, term44854.getClass(), "middleName", "vGiuZVPJNH");
        setField(term44854, term44854.getClass(), "lastName", "tlzpzIjMib");
        setField(term44854, term44854.getClass(), "email", "AZdLeSugwv");
        setField(term44854, term44854.getClass(), "passwordHash", "RMsXuyzKJV");
        setIntField(term44854, term44854.getClass(), "positionId", 479531250);
        setBooleanField(term44854, term44854.getClass(), "isArchived", true);
        setIntField(term44918, term44918.getClass(), "nanos", 88000000);
        setLongField(term44918, term44918.getClass(), "fastTime", 1709168090000L);
        setField(term44918, term44918.getClass(), "cdate", null);
        setField(term44854, term44854.getClass(), "createdDate", term44918);
        setIntField(term44921, term44921.getClass(), "nanos", 220000000);
        setLongField(term44921, term44921.getClass(), "fastTime", 1644765329000L);
        setField(term44921, term44921.getClass(), "cdate", null);
        setField(term44854, term44854.getClass(), "lastModifiedDate", term44921);
        setField(term44854, term44854.getClass(), "employeeRoles", term44924);
        setIntField(term44930, term44930.getClass(), "employeeId", 1320570890);
        setIntField(term44930, term44930.getClass(), "projectId", -130649791);
        setField(term44930, term44930.getClass(), "projectRoleId", enum105);
        setField(term44930, term44930.getClass(), "externalRate", term44936);
        setField(term44854, term44854.getClass(), "employeeProjectRole", term44930);
        setField(term44848, term44848.getClass(), "employee", term44854);
        setField(term44848, term44848.getClass(), "status", enum106);
        setField(term44848, term44848.getClass(), "info", "FwPbDZcHmB");
        setIntField(term44965, term44965.getClass(), "nanos", 658000000);
        setLongField(term44965, term44965.getClass(), "fastTime", 1456363915000L);
        setField(term44965, term44965.getClass(), "cdate", null);
        setField(term44848, term44848.getClass(), "createdDate", term44965);
        setIntField(term44968, term44968.getClass(), "nanos", 660000000);
        setLongField(term44968, term44968.getClass(), "fastTime", 1340898768000L);
        setField(term44968, term44968.getClass(), "cdate", null);
        setField(term44848, term44848.getClass(), "lastModifiedDate", term44968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hOncybyCAH";
        callMethod(klass, "interrupted", argTypes, term44848, args);
    }

};


