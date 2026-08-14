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
     Object term403;
     Object term446;

    public FreezeDateUtils_getZoneFreezingTimestamp_4801862591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term404 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term405 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term418 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term419 = (long[]) newLongArray(1);
        Object[] term421 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term422 = (long[]) newLongArray(9);
        Object[] term432 = (Object[]) newArray("java.time.LocalDateTime", 18);
        Object[] term433 = (Object[]) newArray("java.time.ZoneOffset", 10);
        Object[] term434 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term435 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term440 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term405, term405.getClass(), "id", "Asia/Tokyo");
        setLongElement(term419, 0, -2587712400L);
        setField(term418, term418.getClass(), "standardTransitions", term419);
        setField(term418, term418.getClass(), "standardOffsets", term421);
        setLongElement(term422, 0, -2587712400L);
        setLongElement(term422, 1, -683802000L);
        setLongElement(term422, 2, -672310800L);
        setLongElement(term422, 3, -654771600L);
        setLongElement(term422, 4, -640861200L);
        setLongElement(term422, 5, -620298000L);
        setLongElement(term422, 6, -609411600L);
        setLongElement(term422, 7, -588848400L);
        setLongElement(term422, 8, -577962000L);
        setField(term418, term418.getClass(), "savingsInstantTransitions", term422);
        setField(term418, term418.getClass(), "savingsLocalTransitions", term432);
        setField(term418, term418.getClass(), "wallOffsets", term433);
        setField(term418, term418.getClass(), "lastRules", term434);
        setField(term435, term435.getClass(), "table", null);
        setField(term435, term435.getClass(), "nextTable", null);
        setLongField(term435, term435.getClass(), "baseCount", 0L);
        setIntField(term435, term435.getClass(), "sizeCtl", 0);
        setIntField(term435, term435.getClass(), "transferIndex", 0);
        setIntField(term435, term435.getClass(), "cellsBusy", 0);
        setField(term435, term435.getClass(), "counterCells", null);
        setField(term435, term435.getClass(), "keySet", null);
        setField(term435, term435.getClass(), "values", null);
        setField(term435, term435.getClass(), "entrySet", null);
        setField(term435, term435.getClass(), "keySet", null);
        setField(term435, term435.getClass(), "values", null);
        setField(term418, term418.getClass(), "lastRulesCache", term435);
        setField(term405, term405.getClass(), "rules", term418);
        setField(term404, term404.getClass(), "timeZone", term405);
        setByteField(term440, term440.getClass(), "hour", (byte) 8);
        setByteField(term440, term440.getClass(), "minute", (byte) 15);
        setByteField(term440, term440.getClass(), "second", (byte) 23);
        setIntField(term440, term440.getClass(), "nano", 285707349);
        setField(term404, term404.getClass(), "fixedTimeFreeze", term440);
        setIntField(term404, term404.getClass(), "dayToUnfreeze", 1162663216);
        setField(term403, term403.getClass(), "freezeProperties", term404);
        HashMap term523 = new HashMap();
        Set<Object> term637 =  ((Map) term523).keySet();
        HashSet term522 = new HashSet((Collection<? extends Object>) term637);
        Class<? extends Object> term662 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term661 = ((Class) term662).getDeclaredField((String) "MANAGER");
        ((Field) term661).setAccessible(true);
        Object enum0 = ((Field) term661).get((Object) null);
        Float term534 = new Float(0.13238746F);
        Class<? extends Object> term1091 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1090 = ((Class) term1091).getDeclaredField((String) "UN_FREEZE");
        ((Field) term1090).setAccessible(true);
        Object enum1 = ((Field) term1090).get((Object) null);
        term446 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term452 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term516 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term519 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term528 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term561 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term564 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term446, term446.getClass(), "id", 1484323161);
        setIntField(term448, term448.getClass(), "year", 2016);
        setShortField(term448, term448.getClass(), "month", (short) 11);
        setShortField(term448, term448.getClass(), "day", (short) 29);
        setField(term446, term446.getClass(), "freezeDate", term448);
        setIntField(term452, term452.getClass(), "id", 391863371);
        setField(term452, term452.getClass(), "firstName", "xxtlPwDYFs");
        setField(term452, term452.getClass(), "middleName", "jJCZpVmanW");
        setField(term452, term452.getClass(), "lastName", "EGtDIRbSSb");
        setField(term452, term452.getClass(), "email", "SzjVpOQTyS");
        setField(term452, term452.getClass(), "passwordHash", "MjGYSRKTNF");
        setIntField(term452, term452.getClass(), "positionId", -1922583790);
        setBooleanField(term452, term452.getClass(), "isArchived", false);
        setIntField(term516, term516.getClass(), "nanos", 244000000);
        setLongField(term516, term516.getClass(), "fastTime", 1345860612000L);
        setField(term516, term516.getClass(), "cdate", null);
        setField(term452, term452.getClass(), "createdDate", term516);
        setIntField(term519, term519.getClass(), "nanos", 369000000);
        setLongField(term519, term519.getClass(), "fastTime", 1480427551000L);
        setField(term519, term519.getClass(), "cdate", null);
        setField(term452, term452.getClass(), "lastModifiedDate", term519);
        setField(term452, term452.getClass(), "employeeRoles", term522);
        setIntField(term528, term528.getClass(), "employeeId", -616727354);
        setIntField(term528, term528.getClass(), "projectId", -1955890973);
        setField(term528, term528.getClass(), "projectRoleId", enum0);
        setField(term528, term528.getClass(), "externalRate", term534);
        setField(term452, term452.getClass(), "employeeProjectRole", term528);
        setField(term446, term446.getClass(), "employee", term452);
        setField(term446, term446.getClass(), "status", enum1);
        setField(term446, term446.getClass(), "info", "hRNSzYYIrc");
        setIntField(term561, term561.getClass(), "nanos", 830000000);
        setLongField(term561, term561.getClass(), "fastTime", 1610929382000L);
        setField(term561, term561.getClass(), "cdate", null);
        setField(term446, term446.getClass(), "createdDate", term561);
        setIntField(term564, term564.getClass(), "nanos", 837000000);
        setLongField(term564, term564.getClass(), "fastTime", 1606034835000L);
        setField(term564, term564.getClass(), "cdate", null);
        setField(term446, term446.getClass(), "lastModifiedDate", term564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term446;
        callMethod(klass, "getZoneFreezingTimestamp", argTypes, term403, args);
    }

};


