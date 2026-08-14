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

public class FreezeSchedulePlanner_freezeTrackUnits_21240203106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71070;
     Object term71082;

    public FreezeSchedulePlanner_freezeTrackUnits_21240203106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71070 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term71071 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term71072 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term71073 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term71075 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term71076 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term71070, term71070.getClass(), "crudFreezeService", null);
        setField(term71073, term71073.getClass(), "id", "");
        setField(term71075, term71075.getClass(), "standardTransitions", null);
        setField(term71075, term71075.getClass(), "standardOffsets", null);
        setField(term71075, term71075.getClass(), "savingsInstantTransitions", null);
        setField(term71075, term71075.getClass(), "savingsLocalTransitions", null);
        setField(term71075, term71075.getClass(), "wallOffsets", null);
        setField(term71075, term71075.getClass(), "lastRules", null);
        setField(term71075, term71075.getClass(), "lastRulesCache", null);
        setField(term71073, term71073.getClass(), "rules", term71075);
        setField(term71072, term71072.getClass(), "timeZone", term71073);
        setByteField(term71076, term71076.getClass(), "hour", (byte) 14);
        setByteField(term71076, term71076.getClass(), "minute", (byte) 42);
        setByteField(term71076, term71076.getClass(), "second", (byte) 31);
        setIntField(term71076, term71076.getClass(), "nano", 16575281);
        setField(term71072, term71072.getClass(), "fixedTimeFreeze", term71076);
        setIntField(term71072, term71072.getClass(), "dayToUnfreeze", -781832877);
        setField(term71071, term71071.getClass(), "freezeProperties", term71072);
        setField(term71070, term71070.getClass(), "freezeDateUtils", term71071);
        setField(term71070, term71070.getClass(), "freezeScheduler", null);
        setField(term71070, term71070.getClass(), "trackUnitService", null);
        HashMap term71159 = new HashMap();
        Set<Object> term71252 =  ((Map) term71159).keySet();
        HashSet term71158 = new HashSet((Collection<? extends Object>) term71252);
        Class<? extends Object> term71254 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term71253 = ((Class) term71254).getDeclaredField((String) "EMPLOYEE");
        ((Field) term71253).setAccessible(true);
        Object enum140 = ((Field) term71253).get((Object) null);
        Float term71170 = new Float(0.6563145F);
        Class<? extends Object> term71595 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term71594 = ((Class) term71595).getDeclaredField((String) "DELETING");
        ((Field) term71594).setAccessible(true);
        Object enum141 = ((Field) term71594).get((Object) null);
        term71082 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term71084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71088 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term71152 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71155 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71164 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term71196 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term71199 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term71082, term71082.getClass(), "id", 797203987);
        setIntField(term71084, term71084.getClass(), "year", 2012);
        setShortField(term71084, term71084.getClass(), "month", (short) 12);
        setShortField(term71084, term71084.getClass(), "day", (short) 5);
        setField(term71082, term71082.getClass(), "freezeDate", term71084);
        setIntField(term71088, term71088.getClass(), "id", 1973060703);
        setField(term71088, term71088.getClass(), "firstName", "szGicGyWDL");
        setField(term71088, term71088.getClass(), "middleName", "lkdvUiYwRq");
        setField(term71088, term71088.getClass(), "lastName", "XuxkPrpfND");
        setField(term71088, term71088.getClass(), "email", "OxNXeKMDje");
        setField(term71088, term71088.getClass(), "passwordHash", "hGTqHomrbc");
        setIntField(term71088, term71088.getClass(), "positionId", -138239905);
        setBooleanField(term71088, term71088.getClass(), "isArchived", true);
        setIntField(term71152, term71152.getClass(), "nanos", 235000000);
        setLongField(term71152, term71152.getClass(), "fastTime", 1262691167000L);
        setField(term71152, term71152.getClass(), "cdate", null);
        setField(term71088, term71088.getClass(), "createdDate", term71152);
        setIntField(term71155, term71155.getClass(), "nanos", 232000000);
        setLongField(term71155, term71155.getClass(), "fastTime", 1526971378000L);
        setField(term71155, term71155.getClass(), "cdate", null);
        setField(term71088, term71088.getClass(), "lastModifiedDate", term71155);
        setField(term71088, term71088.getClass(), "employeeRoles", term71158);
        setIntField(term71164, term71164.getClass(), "employeeId", 1709474063);
        setIntField(term71164, term71164.getClass(), "projectId", 1406617209);
        setField(term71164, term71164.getClass(), "projectRoleId", enum140);
        setField(term71164, term71164.getClass(), "externalRate", term71170);
        setField(term71088, term71088.getClass(), "employeeProjectRole", term71164);
        setField(term71082, term71082.getClass(), "employee", term71088);
        setField(term71082, term71082.getClass(), "status", enum141);
        setField(term71082, term71082.getClass(), "info", "NNMBrIWEBw");
        setIntField(term71196, term71196.getClass(), "nanos", 197000000);
        setLongField(term71196, term71196.getClass(), "fastTime", 1308367394000L);
        setField(term71196, term71196.getClass(), "cdate", null);
        setField(term71082, term71082.getClass(), "createdDate", term71196);
        setIntField(term71199, term71199.getClass(), "nanos", 363000000);
        setLongField(term71199, term71199.getClass(), "fastTime", 1647395823000L);
        setField(term71199, term71199.getClass(), "cdate", null);
        setField(term71082, term71082.getClass(), "lastModifiedDate", term71199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term71082;
        callMethod(klass, "freezeTrackUnits", argTypes, term71070, args);
    }

};


