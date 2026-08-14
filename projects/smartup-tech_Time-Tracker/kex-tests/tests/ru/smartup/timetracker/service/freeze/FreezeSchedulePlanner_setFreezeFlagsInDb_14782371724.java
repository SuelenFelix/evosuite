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

public class FreezeSchedulePlanner_setFreezeFlagsInDb_14782371724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;
     Object term2951;

    public FreezeSchedulePlanner_setFreezeFlagsInDb_14782371724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2939 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term2940 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2941 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2942 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2944 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term2945 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2939, term2939.getClass(), "crudFreezeService", null);
        setField(term2942, term2942.getClass(), "id", "");
        setField(term2944, term2944.getClass(), "standardTransitions", null);
        setField(term2944, term2944.getClass(), "standardOffsets", null);
        setField(term2944, term2944.getClass(), "savingsInstantTransitions", null);
        setField(term2944, term2944.getClass(), "savingsLocalTransitions", null);
        setField(term2944, term2944.getClass(), "wallOffsets", null);
        setField(term2944, term2944.getClass(), "lastRules", null);
        setField(term2944, term2944.getClass(), "lastRulesCache", null);
        setField(term2942, term2942.getClass(), "rules", term2944);
        setField(term2941, term2941.getClass(), "timeZone", term2942);
        setByteField(term2945, term2945.getClass(), "hour", (byte) 0);
        setByteField(term2945, term2945.getClass(), "minute", (byte) 1);
        setByteField(term2945, term2945.getClass(), "second", (byte) 31);
        setIntField(term2945, term2945.getClass(), "nano", 111790670);
        setField(term2941, term2941.getClass(), "fixedTimeFreeze", term2945);
        setIntField(term2941, term2941.getClass(), "dayToUnfreeze", -75206835);
        setField(term2940, term2940.getClass(), "freezeProperties", term2941);
        setField(term2939, term2939.getClass(), "freezeDateUtils", term2940);
        setField(term2939, term2939.getClass(), "freezeScheduler", null);
        setField(term2939, term2939.getClass(), "trackUnitService", null);
        HashMap term3028 = new HashMap();
        Set<Object> term3124 =  ((Map) term3028).keySet();
        HashSet term3027 = new HashSet((Collection<? extends Object>) term3124);
        Class<? extends Object> term3126 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term3125 = ((Class) term3126).getDeclaredField((String) "EMPLOYEE");
        ((Field) term3125).setAccessible(true);
        Object enum5 = ((Field) term3125).get((Object) null);
        Float term3039 = new Float(0.17877543F);
        Class<? extends Object> term3467 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term3466 = ((Class) term3467).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term3466).setAccessible(true);
        Object enum6 = ((Field) term3466).get((Object) null);
        term2951 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term2953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2957 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term3021 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3024 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3033 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term3068 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3071 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2951, term2951.getClass(), "id", -1618206977);
        setIntField(term2953, term2953.getClass(), "year", 2014);
        setShortField(term2953, term2953.getClass(), "month", (short) 5);
        setShortField(term2953, term2953.getClass(), "day", (short) 21);
        setField(term2951, term2951.getClass(), "freezeDate", term2953);
        setIntField(term2957, term2957.getClass(), "id", -1747406163);
        setField(term2957, term2957.getClass(), "firstName", "WVRMUmrljA");
        setField(term2957, term2957.getClass(), "middleName", "NTlKJDDWlk");
        setField(term2957, term2957.getClass(), "lastName", "vOuMEpOQAg");
        setField(term2957, term2957.getClass(), "email", "SIODFGaQhr");
        setField(term2957, term2957.getClass(), "passwordHash", "qYzsiuXOgS");
        setIntField(term2957, term2957.getClass(), "positionId", 388157121);
        setBooleanField(term2957, term2957.getClass(), "isArchived", false);
        setIntField(term3021, term3021.getClass(), "nanos", 168000000);
        setLongField(term3021, term3021.getClass(), "fastTime", 1615568384000L);
        setField(term3021, term3021.getClass(), "cdate", null);
        setField(term2957, term2957.getClass(), "createdDate", term3021);
        setIntField(term3024, term3024.getClass(), "nanos", 759000000);
        setLongField(term3024, term3024.getClass(), "fastTime", 1440872174000L);
        setField(term3024, term3024.getClass(), "cdate", null);
        setField(term2957, term2957.getClass(), "lastModifiedDate", term3024);
        setField(term2957, term2957.getClass(), "employeeRoles", term3027);
        setIntField(term3033, term3033.getClass(), "employeeId", 1684998508);
        setIntField(term3033, term3033.getClass(), "projectId", -1476644457);
        setField(term3033, term3033.getClass(), "projectRoleId", enum5);
        setField(term3033, term3033.getClass(), "externalRate", term3039);
        setField(term2957, term2957.getClass(), "employeeProjectRole", term3033);
        setField(term2951, term2951.getClass(), "employee", term2957);
        setField(term2951, term2951.getClass(), "status", enum6);
        setField(term2951, term2951.getClass(), "info", "bxrCBbrrct");
        setIntField(term3068, term3068.getClass(), "nanos", 871000000);
        setLongField(term3068, term3068.getClass(), "fastTime", 1603603429000L);
        setField(term3068, term3068.getClass(), "cdate", null);
        setField(term2951, term2951.getClass(), "createdDate", term3068);
        setIntField(term3071, term3071.getClass(), "nanos", 230000000);
        setLongField(term3071, term3071.getClass(), "fastTime", 1861010348000L);
        setField(term3071, term3071.getClass(), "cdate", null);
        setField(term2951, term2951.getClass(), "lastModifiedDate", term3071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term2951;
        callMethod(klass, "setFreezeFlagsInDb", argTypes, term2939, args);
    }

};


