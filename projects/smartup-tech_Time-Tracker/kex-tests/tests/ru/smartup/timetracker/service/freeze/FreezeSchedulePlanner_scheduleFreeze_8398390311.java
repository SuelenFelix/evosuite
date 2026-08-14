package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeSchedulePlanner_scheduleFreeze_8398390311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;
     Object term1092;

    public FreezeSchedulePlanner_scheduleFreeze_8398390311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1080 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term1081 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1082 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1083 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1085 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term1086 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1080, term1080.getClass(), "crudFreezeService", null);
        setField(term1083, term1083.getClass(), "id", "");
        setField(term1085, term1085.getClass(), "standardTransitions", null);
        setField(term1085, term1085.getClass(), "standardOffsets", null);
        setField(term1085, term1085.getClass(), "savingsInstantTransitions", null);
        setField(term1085, term1085.getClass(), "savingsLocalTransitions", null);
        setField(term1085, term1085.getClass(), "wallOffsets", null);
        setField(term1085, term1085.getClass(), "lastRules", null);
        setField(term1085, term1085.getClass(), "lastRulesCache", null);
        setField(term1083, term1083.getClass(), "rules", term1085);
        setField(term1082, term1082.getClass(), "timeZone", term1083);
        setByteField(term1086, term1086.getClass(), "hour", (byte) 21);
        setByteField(term1086, term1086.getClass(), "minute", (byte) 50);
        setByteField(term1086, term1086.getClass(), "second", (byte) 49);
        setIntField(term1086, term1086.getClass(), "nano", 937411556);
        setField(term1082, term1082.getClass(), "fixedTimeFreeze", term1086);
        setIntField(term1082, term1082.getClass(), "dayToUnfreeze", -1347358701);
        setField(term1081, term1081.getClass(), "freezeProperties", term1082);
        setField(term1080, term1080.getClass(), "freezeDateUtils", term1081);
        setField(term1080, term1080.getClass(), "freezeScheduler", null);
        setField(term1080, term1080.getClass(), "trackUnitService", null);
        HashMap term1169 = new HashMap();
        Set<Object> term1263 =  ((Map) term1169).keySet();
        HashSet term1168 = new HashSet((Collection<? extends Object>) term1263);
        Class<? extends Object> term1288 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1287 = ((Class) term1288).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1287).setAccessible(true);
        Object enum1 = ((Field) term1287).get((Object) null);
        Float term1180 = new Float(0.15826964F);
        Class<? extends Object> term1629 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1628 = ((Class) term1629).getDeclaredField((String) "COMPLETED");
        ((Field) term1628).setAccessible(true);
        Object enum2 = ((Field) term1628).get((Object) null);
        term1092 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term1094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1098 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term1162 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1165 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1174 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term1207 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1210 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1092, term1092.getClass(), "id", 806595993);
        setIntField(term1094, term1094.getClass(), "year", 2021);
        setShortField(term1094, term1094.getClass(), "month", (short) 9);
        setShortField(term1094, term1094.getClass(), "day", (short) 30);
        setField(term1092, term1092.getClass(), "freezeDate", term1094);
        setIntField(term1098, term1098.getClass(), "id", 548228925);
        setField(term1098, term1098.getClass(), "firstName", "OcJCIDNIXA");
        setField(term1098, term1098.getClass(), "middleName", "XfRABIFVEp");
        setField(term1098, term1098.getClass(), "lastName", "MHGKyEnwKc");
        setField(term1098, term1098.getClass(), "email", "ShIELyuULw");
        setField(term1098, term1098.getClass(), "passwordHash", "IpQuOGMgmj");
        setIntField(term1098, term1098.getClass(), "positionId", -749861210);
        setBooleanField(term1098, term1098.getClass(), "isArchived", false);
        setIntField(term1162, term1162.getClass(), "nanos", 85000000);
        setLongField(term1162, term1162.getClass(), "fastTime", 1597506753000L);
        setField(term1162, term1162.getClass(), "cdate", null);
        setField(term1098, term1098.getClass(), "createdDate", term1162);
        setIntField(term1165, term1165.getClass(), "nanos", 303000000);
        setLongField(term1165, term1165.getClass(), "fastTime", 1644410315000L);
        setField(term1165, term1165.getClass(), "cdate", null);
        setField(term1098, term1098.getClass(), "lastModifiedDate", term1165);
        setField(term1098, term1098.getClass(), "employeeRoles", term1168);
        setIntField(term1174, term1174.getClass(), "employeeId", 1694224101);
        setIntField(term1174, term1174.getClass(), "projectId", 937859191);
        setField(term1174, term1174.getClass(), "projectRoleId", enum1);
        setField(term1174, term1174.getClass(), "externalRate", term1180);
        setField(term1098, term1098.getClass(), "employeeProjectRole", term1174);
        setField(term1092, term1092.getClass(), "employee", term1098);
        setField(term1092, term1092.getClass(), "status", enum2);
        setField(term1092, term1092.getClass(), "info", "pJbnHTYrxn");
        setIntField(term1207, term1207.getClass(), "nanos", 490000000);
        setLongField(term1207, term1207.getClass(), "fastTime", 1840769983000L);
        setField(term1207, term1207.getClass(), "cdate", null);
        setField(term1092, term1092.getClass(), "createdDate", term1207);
        setIntField(term1210, term1210.getClass(), "nanos", 583000000);
        setLongField(term1210, term1210.getClass(), "fastTime", 1402592830000L);
        setField(term1210, term1210.getClass(), "cdate", null);
        setField(term1092, term1092.getClass(), "lastModifiedDate", term1210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term1092;
        callMethod(klass, "scheduleFreeze", argTypes, term1080, args);
    }

};


