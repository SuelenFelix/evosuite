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

public class FreezeSchedulePlanner_setFreezeFlagsInDb_14782371725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70164;
     Object term70176;

    public FreezeSchedulePlanner_setFreezeFlagsInDb_14782371725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70164 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term70165 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term70166 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term70167 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term70169 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term70170 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term70164, term70164.getClass(), "crudFreezeService", null);
        setField(term70167, term70167.getClass(), "id", "");
        setField(term70169, term70169.getClass(), "standardTransitions", null);
        setField(term70169, term70169.getClass(), "standardOffsets", null);
        setField(term70169, term70169.getClass(), "savingsInstantTransitions", null);
        setField(term70169, term70169.getClass(), "savingsLocalTransitions", null);
        setField(term70169, term70169.getClass(), "wallOffsets", null);
        setField(term70169, term70169.getClass(), "lastRules", null);
        setField(term70169, term70169.getClass(), "lastRulesCache", null);
        setField(term70167, term70167.getClass(), "rules", term70169);
        setField(term70166, term70166.getClass(), "timeZone", term70167);
        setByteField(term70170, term70170.getClass(), "hour", (byte) 0);
        setByteField(term70170, term70170.getClass(), "minute", (byte) 1);
        setByteField(term70170, term70170.getClass(), "second", (byte) 31);
        setIntField(term70170, term70170.getClass(), "nano", 111790670);
        setField(term70166, term70166.getClass(), "fixedTimeFreeze", term70170);
        setIntField(term70166, term70166.getClass(), "dayToUnfreeze", 1200440315);
        setField(term70165, term70165.getClass(), "freezeProperties", term70166);
        setField(term70164, term70164.getClass(), "freezeDateUtils", term70165);
        setField(term70164, term70164.getClass(), "freezeScheduler", null);
        setField(term70164, term70164.getClass(), "trackUnitService", null);
        HashMap term70253 = new HashMap();
        Set<Object> term70345 =  ((Map) term70253).keySet();
        HashSet term70252 = new HashSet((Collection<? extends Object>) term70345);
        Class<? extends Object> term70347 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term70346 = ((Class) term70347).getDeclaredField((String) "EMPLOYEE");
        ((Field) term70346).setAccessible(true);
        Object enum138 = ((Field) term70346).get((Object) null);
        Float term70264 = new Float(0.85665673F);
        Class<? extends Object> term70688 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term70687 = ((Class) term70688).getDeclaredField((String) "WAITING");
        ((Field) term70687).setAccessible(true);
        Object enum139 = ((Field) term70687).get((Object) null);
        term70176 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term70178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70182 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term70246 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70249 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70258 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term70289 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term70292 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term70176, term70176.getClass(), "id", 40571662);
        setIntField(term70178, term70178.getClass(), "year", 2020);
        setShortField(term70178, term70178.getClass(), "month", (short) 8);
        setShortField(term70178, term70178.getClass(), "day", (short) 14);
        setField(term70176, term70176.getClass(), "freezeDate", term70178);
        setIntField(term70182, term70182.getClass(), "id", 1863910269);
        setField(term70182, term70182.getClass(), "firstName", "ITrhiKKzcb");
        setField(term70182, term70182.getClass(), "middleName", "qMKmSzOQXg");
        setField(term70182, term70182.getClass(), "lastName", "CURQCMkqbZ");
        setField(term70182, term70182.getClass(), "email", "VZwkkQktrm");
        setField(term70182, term70182.getClass(), "passwordHash", "wIuJvIvEMb");
        setIntField(term70182, term70182.getClass(), "positionId", 864645689);
        setBooleanField(term70182, term70182.getClass(), "isArchived", true);
        setIntField(term70246, term70246.getClass(), "nanos", 766000000);
        setLongField(term70246, term70246.getClass(), "fastTime", 1502410109000L);
        setField(term70246, term70246.getClass(), "cdate", null);
        setField(term70182, term70182.getClass(), "createdDate", term70246);
        setIntField(term70249, term70249.getClass(), "nanos", 220000000);
        setLongField(term70249, term70249.getClass(), "fastTime", 1685481840000L);
        setField(term70249, term70249.getClass(), "cdate", null);
        setField(term70182, term70182.getClass(), "lastModifiedDate", term70249);
        setField(term70182, term70182.getClass(), "employeeRoles", term70252);
        setIntField(term70258, term70258.getClass(), "employeeId", 279384872);
        setIntField(term70258, term70258.getClass(), "projectId", 1427305953);
        setField(term70258, term70258.getClass(), "projectRoleId", enum138);
        setField(term70258, term70258.getClass(), "externalRate", term70264);
        setField(term70182, term70182.getClass(), "employeeProjectRole", term70258);
        setField(term70176, term70176.getClass(), "employee", term70182);
        setField(term70176, term70176.getClass(), "status", enum139);
        setField(term70176, term70176.getClass(), "info", "EyojsbSjWT");
        setIntField(term70289, term70289.getClass(), "nanos", 681000000);
        setLongField(term70289, term70289.getClass(), "fastTime", 1654446438000L);
        setField(term70289, term70289.getClass(), "cdate", null);
        setField(term70176, term70176.getClass(), "createdDate", term70289);
        setIntField(term70292, term70292.getClass(), "nanos", 779000000);
        setLongField(term70292, term70292.getClass(), "fastTime", 1603662687000L);
        setField(term70292, term70292.getClass(), "cdate", null);
        setField(term70176, term70176.getClass(), "lastModifiedDate", term70292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term70176;
        callMethod(klass, "setFreezeFlagsInDb", argTypes, term70164, args);
    }

};


