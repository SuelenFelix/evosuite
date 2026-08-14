package ru.smartup.timetracker.utils;

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
import static ru.smartup.timetracker.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.HashSet;
import java.lang.Float;
import java.lang.String;

public class FreezeDateUtils_getFreezeRecordWithMinDate_9190651085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2125;
     Object term2180;

    public FreezeDateUtils_getFreezeRecordWithMinDate_9190651085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2125 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2126 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2127 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2146 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2147 = (long[]) newLongArray(8);
        Object[] term2156 = (Object[]) newArray("java.time.ZoneOffset", 9);
        long[] term2157 = (long[]) newLongArray(8);
        Object[] term2166 = (Object[]) newArray("java.time.LocalDateTime", 16);
        Object[] term2167 = (Object[]) newArray("java.time.ZoneOffset", 9);
        Object[] term2168 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2169 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term2174 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2127, term2127.getClass(), "id", "Asia/Ho_Chi_Minh");
        setLongElement(term2147, 0, -1851577590L);
        setLongElement(term2147, 1, -852105600L);
        setLongElement(term2147, 2, -782643600L);
        setLongElement(term2147, 3, -767869200L);
        setLongElement(term2147, 4, -718095600L);
        setLongElement(term2147, 5, -457772400L);
        setLongElement(term2147, 6, -315648000L);
        setLongElement(term2147, 7, 171820800L);
        setField(term2146, term2146.getClass(), "standardTransitions", term2147);
        setField(term2146, term2146.getClass(), "standardOffsets", term2156);
        setLongElement(term2157, 0, -1851577590L);
        setLongElement(term2157, 1, -852105600L);
        setLongElement(term2157, 2, -782643600L);
        setLongElement(term2157, 3, -767869200L);
        setLongElement(term2157, 4, -718095600L);
        setLongElement(term2157, 5, -457772400L);
        setLongElement(term2157, 6, -315648000L);
        setLongElement(term2157, 7, 171820800L);
        setField(term2146, term2146.getClass(), "savingsInstantTransitions", term2157);
        setField(term2146, term2146.getClass(), "savingsLocalTransitions", term2166);
        setField(term2146, term2146.getClass(), "wallOffsets", term2167);
        setField(term2146, term2146.getClass(), "lastRules", term2168);
        setField(term2169, term2169.getClass(), "table", null);
        setField(term2169, term2169.getClass(), "nextTable", null);
        setLongField(term2169, term2169.getClass(), "baseCount", 0L);
        setIntField(term2169, term2169.getClass(), "sizeCtl", 0);
        setIntField(term2169, term2169.getClass(), "transferIndex", 0);
        setIntField(term2169, term2169.getClass(), "cellsBusy", 0);
        setField(term2169, term2169.getClass(), "counterCells", null);
        setField(term2169, term2169.getClass(), "keySet", null);
        setField(term2169, term2169.getClass(), "values", null);
        setField(term2169, term2169.getClass(), "entrySet", null);
        setField(term2169, term2169.getClass(), "keySet", null);
        setField(term2169, term2169.getClass(), "values", null);
        setField(term2146, term2146.getClass(), "lastRulesCache", term2169);
        setField(term2127, term2127.getClass(), "rules", term2146);
        setField(term2126, term2126.getClass(), "timeZone", term2127);
        setByteField(term2174, term2174.getClass(), "hour", (byte) 17);
        setByteField(term2174, term2174.getClass(), "minute", (byte) 25);
        setByteField(term2174, term2174.getClass(), "second", (byte) 50);
        setIntField(term2174, term2174.getClass(), "nano", 456917183);
        setField(term2126, term2126.getClass(), "fixedTimeFreeze", term2174);
        setIntField(term2126, term2126.getClass(), "dayToUnfreeze", 1725571209);
        setField(term2125, term2125.getClass(), "freezeProperties", term2126);
        HashSet term2204 = new HashSet();
        Float term2208 = new Float(0.2707036F);
        Class<? extends Object> term2265 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term2264 = ((Class) term2265).getDeclaredField((String) "INTERRUPTED");
        ((Field) term2264).setAccessible(true);
        Object enum2 = ((Field) term2264).get((Object) null);
        Object term2183 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term2185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2189 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term2198 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2201 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2205 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term2225 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2228 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2183, term2183.getClass(), "id", -522618178);
        setIntField(term2185, term2185.getClass(), "year", 2021);
        setShortField(term2185, term2185.getClass(), "month", (short) 1);
        setShortField(term2185, term2185.getClass(), "day", (short) 18);
        setField(term2183, term2183.getClass(), "freezeDate", term2185);
        setIntField(term2189, term2189.getClass(), "id", 1134449235);
        setField(term2189, term2189.getClass(), "firstName", "");
        setField(term2189, term2189.getClass(), "middleName", "");
        setField(term2189, term2189.getClass(), "lastName", "");
        setField(term2189, term2189.getClass(), "email", "");
        setField(term2189, term2189.getClass(), "passwordHash", "");
        setIntField(term2189, term2189.getClass(), "positionId", -883034806);
        setBooleanField(term2189, term2189.getClass(), "isArchived", false);
        setIntField(term2198, term2198.getClass(), "nanos", 302000000);
        setLongField(term2198, term2198.getClass(), "fastTime", 1442628765000L);
        setField(term2198, term2198.getClass(), "cdate", null);
        setField(term2189, term2189.getClass(), "createdDate", term2198);
        setIntField(term2201, term2201.getClass(), "nanos", 18000000);
        setLongField(term2201, term2201.getClass(), "fastTime", 1515879330000L);
        setField(term2201, term2201.getClass(), "cdate", null);
        setField(term2189, term2189.getClass(), "lastModifiedDate", term2201);
        setField(term2189, term2189.getClass(), "employeeRoles", term2204);
        setIntField(term2205, term2205.getClass(), "employeeId", 1585847225);
        setIntField(term2205, term2205.getClass(), "projectId", 597278769);
        setField(term2205, term2205.getClass(), "projectRoleId", null);
        setField(term2205, term2205.getClass(), "externalRate", term2208);
        setField(term2189, term2189.getClass(), "employeeProjectRole", term2205);
        setField(term2183, term2183.getClass(), "employee", term2189);
        setField(term2183, term2183.getClass(), "status", enum2);
        setField(term2183, term2183.getClass(), "info", "oVcInYnLWB");
        setIntField(term2225, term2225.getClass(), "nanos", 389000000);
        setLongField(term2225, term2225.getClass(), "fastTime", 1429013051000L);
        setField(term2225, term2225.getClass(), "cdate", null);
        setField(term2183, term2183.getClass(), "createdDate", term2225);
        setIntField(term2228, term2228.getClass(), "nanos", 288000000);
        setLongField(term2228, term2228.getClass(), "fastTime", 1495346663000L);
        setField(term2228, term2228.getClass(), "cdate", null);
        setField(term2183, term2183.getClass(), "lastModifiedDate", term2228);
        term2180 = new LinkedList();
        ((LinkedList) term2180).add(term2183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2180;
        callMethod(klass, "getFreezeRecordWithMinDate", argTypes, term2125, args);
    }

};


