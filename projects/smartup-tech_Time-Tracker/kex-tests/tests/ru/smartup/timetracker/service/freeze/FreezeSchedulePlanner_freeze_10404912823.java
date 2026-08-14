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

public class FreezeSchedulePlanner_freeze_10404912823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;
     Object term2041;

    public FreezeSchedulePlanner_freeze_10404912823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term2030 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2031 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2032 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2034 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term2035 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2029, term2029.getClass(), "crudFreezeService", null);
        setField(term2032, term2032.getClass(), "id", "");
        setField(term2034, term2034.getClass(), "standardTransitions", null);
        setField(term2034, term2034.getClass(), "standardOffsets", null);
        setField(term2034, term2034.getClass(), "savingsInstantTransitions", null);
        setField(term2034, term2034.getClass(), "savingsLocalTransitions", null);
        setField(term2034, term2034.getClass(), "wallOffsets", null);
        setField(term2034, term2034.getClass(), "lastRules", null);
        setField(term2034, term2034.getClass(), "lastRulesCache", null);
        setField(term2032, term2032.getClass(), "rules", term2034);
        setField(term2031, term2031.getClass(), "timeZone", term2032);
        setByteField(term2035, term2035.getClass(), "hour", (byte) 20);
        setByteField(term2035, term2035.getClass(), "minute", (byte) 7);
        setByteField(term2035, term2035.getClass(), "second", (byte) 25);
        setIntField(term2035, term2035.getClass(), "nano", 322733539);
        setField(term2031, term2031.getClass(), "fixedTimeFreeze", term2035);
        setIntField(term2031, term2031.getClass(), "dayToUnfreeze", -2131181468);
        setField(term2030, term2030.getClass(), "freezeProperties", term2031);
        setField(term2029, term2029.getClass(), "freezeDateUtils", term2030);
        setField(term2029, term2029.getClass(), "freezeScheduler", null);
        setField(term2029, term2029.getClass(), "trackUnitService", null);
        HashMap term2118 = new HashMap();
        Set<Object> term2211 =  ((Map) term2118).keySet();
        HashSet term2117 = new HashSet((Collection<? extends Object>) term2211);
        Class<? extends Object> term2213 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2212 = ((Class) term2213).getDeclaredField((String) "EMPLOYEE");
        ((Field) term2212).setAccessible(true);
        Object enum3 = ((Field) term2212).get((Object) null);
        Float term2129 = new Float(0.45691717F);
        Class<? extends Object> term2554 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term2553 = ((Class) term2554).getDeclaredField((String) "OUTDATED");
        ((Field) term2553).setAccessible(true);
        Object enum4 = ((Field) term2553).get((Object) null);
        term2041 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term2043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2047 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term2111 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2114 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2123 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term2155 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2158 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2041, term2041.getClass(), "id", 282916351);
        setIntField(term2043, term2043.getClass(), "year", 2027);
        setShortField(term2043, term2043.getClass(), "month", (short) 8);
        setShortField(term2043, term2043.getClass(), "day", (short) 25);
        setField(term2041, term2041.getClass(), "freezeDate", term2043);
        setIntField(term2047, term2047.getClass(), "id", 880977281);
        setField(term2047, term2047.getClass(), "firstName", "iIRsCSYqXH");
        setField(term2047, term2047.getClass(), "middleName", "nghfqDXyCG");
        setField(term2047, term2047.getClass(), "lastName", "WBAOTqErtm");
        setField(term2047, term2047.getClass(), "email", "PqtVXXZMqK");
        setField(term2047, term2047.getClass(), "passwordHash", "rYbtIDVdnd");
        setIntField(term2047, term2047.getClass(), "positionId", 371943306);
        setBooleanField(term2047, term2047.getClass(), "isArchived", false);
        setIntField(term2111, term2111.getClass(), "nanos", 891000000);
        setLongField(term2111, term2111.getClass(), "fastTime", 1303208814000L);
        setField(term2111, term2111.getClass(), "cdate", null);
        setField(term2047, term2047.getClass(), "createdDate", term2111);
        setIntField(term2114, term2114.getClass(), "nanos", 741000000);
        setLongField(term2114, term2114.getClass(), "fastTime", 1798201949000L);
        setField(term2114, term2114.getClass(), "cdate", null);
        setField(term2047, term2047.getClass(), "lastModifiedDate", term2114);
        setField(term2047, term2047.getClass(), "employeeRoles", term2117);
        setIntField(term2123, term2123.getClass(), "employeeId", 982388293);
        setIntField(term2123, term2123.getClass(), "projectId", -159494544);
        setField(term2123, term2123.getClass(), "projectRoleId", enum3);
        setField(term2123, term2123.getClass(), "externalRate", term2129);
        setField(term2047, term2047.getClass(), "employeeProjectRole", term2123);
        setField(term2041, term2041.getClass(), "employee", term2047);
        setField(term2041, term2041.getClass(), "status", enum4);
        setField(term2041, term2041.getClass(), "info", "UKAReurpHG");
        setIntField(term2155, term2155.getClass(), "nanos", 367000000);
        setLongField(term2155, term2155.getClass(), "fastTime", 1408283942000L);
        setField(term2155, term2155.getClass(), "cdate", null);
        setField(term2041, term2041.getClass(), "createdDate", term2155);
        setIntField(term2158, term2158.getClass(), "nanos", 410000000);
        setLongField(term2158, term2158.getClass(), "fastTime", 1643970344000L);
        setField(term2158, term2158.getClass(), "cdate", null);
        setField(term2041, term2041.getClass(), "lastModifiedDate", term2158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term2041;
        callMethod(klass, "freeze", argTypes, term2029, args);
    }

};


