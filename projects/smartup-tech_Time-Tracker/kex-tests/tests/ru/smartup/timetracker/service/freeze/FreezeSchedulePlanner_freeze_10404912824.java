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

public class FreezeSchedulePlanner_freeze_10404912824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69257;
     Object term69269;

    public FreezeSchedulePlanner_freeze_10404912824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69257 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term69258 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term69259 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term69260 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term69262 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term69263 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term69257, term69257.getClass(), "crudFreezeService", null);
        setField(term69260, term69260.getClass(), "id", "");
        setField(term69262, term69262.getClass(), "standardTransitions", null);
        setField(term69262, term69262.getClass(), "standardOffsets", null);
        setField(term69262, term69262.getClass(), "savingsInstantTransitions", null);
        setField(term69262, term69262.getClass(), "savingsLocalTransitions", null);
        setField(term69262, term69262.getClass(), "wallOffsets", null);
        setField(term69262, term69262.getClass(), "lastRules", null);
        setField(term69262, term69262.getClass(), "lastRulesCache", null);
        setField(term69260, term69260.getClass(), "rules", term69262);
        setField(term69259, term69259.getClass(), "timeZone", term69260);
        setByteField(term69263, term69263.getClass(), "hour", (byte) 20);
        setByteField(term69263, term69263.getClass(), "minute", (byte) 7);
        setByteField(term69263, term69263.getClass(), "second", (byte) 25);
        setIntField(term69263, term69263.getClass(), "nano", 322733539);
        setField(term69259, term69259.getClass(), "fixedTimeFreeze", term69263);
        setIntField(term69259, term69259.getClass(), "dayToUnfreeze", -1428063820);
        setField(term69258, term69258.getClass(), "freezeProperties", term69259);
        setField(term69257, term69257.getClass(), "freezeDateUtils", term69258);
        setField(term69257, term69257.getClass(), "freezeScheduler", null);
        setField(term69257, term69257.getClass(), "trackUnitService", null);
        HashMap term69346 = new HashMap();
        Set<Object> term69439 =  ((Map) term69346).keySet();
        HashSet term69345 = new HashSet((Collection<? extends Object>) term69439);
        Class<? extends Object> term69441 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term69440 = ((Class) term69441).getDeclaredField((String) "MANAGER");
        ((Field) term69440).setAccessible(true);
        Object enum136 = ((Field) term69440).get((Object) null);
        Float term69357 = new Float(0.079128504F);
        Class<? extends Object> term69779 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term69778 = ((Class) term69779).getDeclaredField((String) "DELETING");
        ((Field) term69778).setAccessible(true);
        Object enum137 = ((Field) term69778).get((Object) null);
        term69269 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term69271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69275 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term69339 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69342 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69351 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term69383 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term69386 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term69269, term69269.getClass(), "id", -1271375703);
        setIntField(term69271, term69271.getClass(), "year", 2016);
        setShortField(term69271, term69271.getClass(), "month", (short) 6);
        setShortField(term69271, term69271.getClass(), "day", (short) 12);
        setField(term69269, term69269.getClass(), "freezeDate", term69271);
        setIntField(term69275, term69275.getClass(), "id", 1136208236);
        setField(term69275, term69275.getClass(), "firstName", "vfennwtmqe");
        setField(term69275, term69275.getClass(), "middleName", "zZxoNkohbw");
        setField(term69275, term69275.getClass(), "lastName", "DQrjPcLysX");
        setField(term69275, term69275.getClass(), "email", "VWPFyrpmmb");
        setField(term69275, term69275.getClass(), "passwordHash", "gYYKrIeThw");
        setIntField(term69275, term69275.getClass(), "positionId", -1220630391);
        setBooleanField(term69275, term69275.getClass(), "isArchived", false);
        setIntField(term69339, term69339.getClass(), "nanos", 227000000);
        setLongField(term69339, term69339.getClass(), "fastTime", 1713522139000L);
        setField(term69339, term69339.getClass(), "cdate", null);
        setField(term69275, term69275.getClass(), "createdDate", term69339);
        setIntField(term69342, term69342.getClass(), "nanos", 859000000);
        setLongField(term69342, term69342.getClass(), "fastTime", 1263127452000L);
        setField(term69342, term69342.getClass(), "cdate", null);
        setField(term69275, term69275.getClass(), "lastModifiedDate", term69342);
        setField(term69275, term69275.getClass(), "employeeRoles", term69345);
        setIntField(term69351, term69351.getClass(), "employeeId", -995822131);
        setIntField(term69351, term69351.getClass(), "projectId", -687282231);
        setField(term69351, term69351.getClass(), "projectRoleId", enum136);
        setField(term69351, term69351.getClass(), "externalRate", term69357);
        setField(term69275, term69275.getClass(), "employeeProjectRole", term69351);
        setField(term69269, term69269.getClass(), "employee", term69275);
        setField(term69269, term69269.getClass(), "status", enum137);
        setField(term69269, term69269.getClass(), "info", "UsxeLMVkAK");
        setIntField(term69383, term69383.getClass(), "nanos", 333000000);
        setLongField(term69383, term69383.getClass(), "fastTime", 1603404389000L);
        setField(term69383, term69383.getClass(), "cdate", null);
        setField(term69269, term69269.getClass(), "createdDate", term69383);
        setIntField(term69386, term69386.getClass(), "nanos", 815000000);
        setLongField(term69386, term69386.getClass(), "fastTime", 1841219235000L);
        setField(term69386, term69386.getClass(), "cdate", null);
        setField(term69269, term69269.getClass(), "lastModifiedDate", term69386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term69269;
        callMethod(klass, "freeze", argTypes, term69257, args);
    }

};


