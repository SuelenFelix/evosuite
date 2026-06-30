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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeDateUtils_getZoneFreezingTimestamp_4801862591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term464;

    public FreezeDateUtils_getZoneFreezingTimestamp_4801862591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term414 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term415 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term434 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term435 = (long[]) newLongArray(2);
        Object[] term438 = (Object[]) newArray("java.time.ZoneOffset", 3);
        long[] term439 = (long[]) newLongArray(10);
        Object[] term450 = (Object[]) newArray("java.time.LocalDateTime", 20);
        Object[] term451 = (Object[]) newArray("java.time.ZoneOffset", 11);
        Object[] term452 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term453 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term458 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term415, term415.getClass(), "id", "Australia/Darwin");
        setLongElement(term435, 0, -2364108200L);
        setLongElement(term435, 1, -2230189200L);
        setField(term434, term434.getClass(), "standardTransitions", term435);
        setField(term434, term434.getClass(), "standardOffsets", term438);
        setLongElement(term439, 0, -2364108200L);
        setLongElement(term439, 1, -2230189200L);
        setLongElement(term439, 2, -1672558200L);
        setLongElement(term439, 3, -1665387000L);
        setLongElement(term439, 4, -883639800L);
        setLongElement(term439, 5, -876123000L);
        setLongElement(term439, 6, -860398200L);
        setLongElement(term439, 7, -844673400L);
        setLongElement(term439, 8, -828343800L);
        setLongElement(term439, 9, -813223800L);
        setField(term434, term434.getClass(), "savingsInstantTransitions", term439);
        setField(term434, term434.getClass(), "savingsLocalTransitions", term450);
        setField(term434, term434.getClass(), "wallOffsets", term451);
        setField(term434, term434.getClass(), "lastRules", term452);
        setField(term453, term453.getClass(), "table", null);
        setField(term453, term453.getClass(), "nextTable", null);
        setLongField(term453, term453.getClass(), "baseCount", 0L);
        setIntField(term453, term453.getClass(), "sizeCtl", 0);
        setIntField(term453, term453.getClass(), "transferIndex", 0);
        setIntField(term453, term453.getClass(), "cellsBusy", 0);
        setField(term453, term453.getClass(), "counterCells", null);
        setField(term453, term453.getClass(), "keySet", null);
        setField(term453, term453.getClass(), "values", null);
        setField(term453, term453.getClass(), "entrySet", null);
        setField(term453, term453.getClass(), "keySet", null);
        setField(term453, term453.getClass(), "values", null);
        setField(term434, term434.getClass(), "lastRulesCache", term453);
        setField(term415, term415.getClass(), "rules", term434);
        setField(term414, term414.getClass(), "timeZone", term415);
        setByteField(term458, term458.getClass(), "hour", (byte) 8);
        setByteField(term458, term458.getClass(), "minute", (byte) 15);
        setByteField(term458, term458.getClass(), "second", (byte) 23);
        setIntField(term458, term458.getClass(), "nano", 285707349);
        setField(term414, term414.getClass(), "fixedTimeFreeze", term458);
        setIntField(term414, term414.getClass(), "dayToUnfreeze", 1162663216);
        setField(term413, term413.getClass(), "freezeProperties", term414);
        HashMap term541 = new HashMap();
        Set<Object> term663 =  ((Map) term541).keySet();
        HashSet term540 = new HashSet((Collection<? extends Object>) term663);
        Class<? extends Object> term688 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term687 = ((Class) term688).getDeclaredField((String) "MANAGER");
        ((Field) term687).setAccessible(true);
        Object enum0 = ((Field) term687).get((Object) null);
        Float term552 = new Float(0.13238746F);
        Class<? extends Object> term1117 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1116 = ((Class) term1117).getDeclaredField((String) "UN_FREEZE");
        ((Field) term1116).setAccessible(true);
        Object enum1 = ((Field) term1116).get((Object) null);
        term464 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term470 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term534 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term537 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term546 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term579 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term582 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term464, term464.getClass(), "id", 1484323161);
        setIntField(term466, term466.getClass(), "year", 2016);
        setShortField(term466, term466.getClass(), "month", (short) 11);
        setShortField(term466, term466.getClass(), "day", (short) 29);
        setField(term464, term464.getClass(), "freezeDate", term466);
        setIntField(term470, term470.getClass(), "id", 391863371);
        setField(term470, term470.getClass(), "firstName", "xxtlPwDYFs");
        setField(term470, term470.getClass(), "middleName", "jJCZpVmanW");
        setField(term470, term470.getClass(), "lastName", "EGtDIRbSSb");
        setField(term470, term470.getClass(), "email", "SzjVpOQTyS");
        setField(term470, term470.getClass(), "passwordHash", "MjGYSRKTNF");
        setIntField(term470, term470.getClass(), "positionId", -1922583790);
        setBooleanField(term470, term470.getClass(), "isArchived", false);
        setIntField(term534, term534.getClass(), "nanos", 244000000);
        setLongField(term534, term534.getClass(), "fastTime", 1345860612000L);
        setField(term534, term534.getClass(), "cdate", null);
        setField(term470, term470.getClass(), "createdDate", term534);
        setIntField(term537, term537.getClass(), "nanos", 369000000);
        setLongField(term537, term537.getClass(), "fastTime", 1480427551000L);
        setField(term537, term537.getClass(), "cdate", null);
        setField(term470, term470.getClass(), "lastModifiedDate", term537);
        setField(term470, term470.getClass(), "employeeRoles", term540);
        setIntField(term546, term546.getClass(), "employeeId", -616727354);
        setIntField(term546, term546.getClass(), "projectId", -1955890973);
        setField(term546, term546.getClass(), "projectRoleId", enum0);
        setField(term546, term546.getClass(), "externalRate", term552);
        setField(term470, term470.getClass(), "employeeProjectRole", term546);
        setField(term464, term464.getClass(), "employee", term470);
        setField(term464, term464.getClass(), "status", enum1);
        setField(term464, term464.getClass(), "info", "hRNSzYYIrc");
        setIntField(term579, term579.getClass(), "nanos", 830000000);
        setLongField(term579, term579.getClass(), "fastTime", 1610929382000L);
        setField(term579, term579.getClass(), "cdate", null);
        setField(term464, term464.getClass(), "createdDate", term579);
        setIntField(term582, term582.getClass(), "nanos", 837000000);
        setLongField(term582, term582.getClass(), "fastTime", 1606034835000L);
        setField(term582, term582.getClass(), "cdate", null);
        setField(term464, term464.getClass(), "lastModifiedDate", term582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term464;
        callMethod(klass, "getZoneFreezingTimestamp", argTypes, term413, args);
    }

};


