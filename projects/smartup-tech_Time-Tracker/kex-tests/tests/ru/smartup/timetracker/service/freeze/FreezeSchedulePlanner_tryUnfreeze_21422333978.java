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

public class FreezeSchedulePlanner_tryUnfreeze_21422333978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5726;
     Object term5738;
     Object term5859;

    public FreezeSchedulePlanner_tryUnfreeze_21422333978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5726 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term5727 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term5728 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term5729 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5731 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term5732 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5726, term5726.getClass(), "crudFreezeService", null);
        setField(term5729, term5729.getClass(), "id", "");
        setField(term5731, term5731.getClass(), "standardTransitions", null);
        setField(term5731, term5731.getClass(), "standardOffsets", null);
        setField(term5731, term5731.getClass(), "savingsInstantTransitions", null);
        setField(term5731, term5731.getClass(), "savingsLocalTransitions", null);
        setField(term5731, term5731.getClass(), "wallOffsets", null);
        setField(term5731, term5731.getClass(), "lastRules", null);
        setField(term5731, term5731.getClass(), "lastRulesCache", null);
        setField(term5729, term5729.getClass(), "rules", term5731);
        setField(term5728, term5728.getClass(), "timeZone", term5729);
        setByteField(term5732, term5732.getClass(), "hour", (byte) 7);
        setByteField(term5732, term5732.getClass(), "minute", (byte) 52);
        setByteField(term5732, term5732.getClass(), "second", (byte) 19);
        setIntField(term5732, term5732.getClass(), "nano", 298740176);
        setField(term5728, term5728.getClass(), "fixedTimeFreeze", term5732);
        setIntField(term5728, term5728.getClass(), "dayToUnfreeze", 534834644);
        setField(term5727, term5727.getClass(), "freezeProperties", term5728);
        setField(term5726, term5726.getClass(), "freezeDateUtils", term5727);
        setField(term5726, term5726.getClass(), "freezeScheduler", null);
        setField(term5726, term5726.getClass(), "trackUnitService", null);
        HashMap term5815 = new HashMap();
        Set<Object> term5918 =  ((Map) term5815).keySet();
        HashSet term5814 = new HashSet((Collection<? extends Object>) term5918);
        Class<? extends Object> term5920 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5919 = ((Class) term5920).getDeclaredField((String) "MANAGER");
        ((Field) term5919).setAccessible(true);
        Object enum11 = ((Field) term5919).get((Object) null);
        Float term5826 = new Float(0.43692183F);
        Class<? extends Object> term6258 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term6257 = ((Class) term6258).getDeclaredField((String) "UN_FREEZE");
        ((Field) term6257).setAccessible(true);
        Object enum12 = ((Field) term6257).get((Object) null);
        term5738 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term5740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5744 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term5808 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5811 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5820 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term5853 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5856 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term5738, term5738.getClass(), "id", 1959097203);
        setIntField(term5740, term5740.getClass(), "year", 2028);
        setShortField(term5740, term5740.getClass(), "month", (short) 9);
        setShortField(term5740, term5740.getClass(), "day", (short) 30);
        setField(term5738, term5738.getClass(), "freezeDate", term5740);
        setIntField(term5744, term5744.getClass(), "id", -209654048);
        setField(term5744, term5744.getClass(), "firstName", "uSUvKAyuvd");
        setField(term5744, term5744.getClass(), "middleName", "onQLVONGuf");
        setField(term5744, term5744.getClass(), "lastName", "SOrEHbcbmn");
        setField(term5744, term5744.getClass(), "email", "bnsyeQXFdu");
        setField(term5744, term5744.getClass(), "passwordHash", "BwtdjiefJn");
        setIntField(term5744, term5744.getClass(), "positionId", 477625804);
        setBooleanField(term5744, term5744.getClass(), "isArchived", false);
        setIntField(term5808, term5808.getClass(), "nanos", 817000000);
        setLongField(term5808, term5808.getClass(), "fastTime", 1684745176000L);
        setField(term5808, term5808.getClass(), "cdate", null);
        setField(term5744, term5744.getClass(), "createdDate", term5808);
        setIntField(term5811, term5811.getClass(), "nanos", 527000000);
        setLongField(term5811, term5811.getClass(), "fastTime", 1449306022000L);
        setField(term5811, term5811.getClass(), "cdate", null);
        setField(term5744, term5744.getClass(), "lastModifiedDate", term5811);
        setField(term5744, term5744.getClass(), "employeeRoles", term5814);
        setIntField(term5820, term5820.getClass(), "employeeId", 252575029);
        setIntField(term5820, term5820.getClass(), "projectId", 57189932);
        setField(term5820, term5820.getClass(), "projectRoleId", enum11);
        setField(term5820, term5820.getClass(), "externalRate", term5826);
        setField(term5744, term5744.getClass(), "employeeProjectRole", term5820);
        setField(term5738, term5738.getClass(), "employee", term5744);
        setField(term5738, term5738.getClass(), "status", enum12);
        setField(term5738, term5738.getClass(), "info", "jDmhBrIoDa");
        setIntField(term5853, term5853.getClass(), "nanos", 176000000);
        setLongField(term5853, term5853.getClass(), "fastTime", 1423084800000L);
        setField(term5853, term5853.getClass(), "cdate", null);
        setField(term5738, term5738.getClass(), "createdDate", term5853);
        setIntField(term5856, term5856.getClass(), "nanos", 165000000);
        setLongField(term5856, term5856.getClass(), "fastTime", 1890779014000L);
        setField(term5856, term5856.getClass(), "cdate", null);
        setField(term5738, term5738.getClass(), "lastModifiedDate", term5856);
        term5859 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term5860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5864 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5860, term5860.getClass(), "year", 2026);
        setShortField(term5860, term5860.getClass(), "month", (short) 11);
        setShortField(term5860, term5860.getClass(), "day", (short) 29);
        setField(term5859, term5859.getClass(), "startDate", term5860);
        setIntField(term5864, term5864.getClass(), "year", 2027);
        setShortField(term5864, term5864.getClass(), "month", (short) 2);
        setShortField(term5864, term5864.getClass(), "day", (short) 18);
        setField(term5859, term5859.getClass(), "endDate", term5864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term5738;
        args[1] = term5859;
        callMethod(klass, "tryUnfreeze", argTypes, term5726, args);
    }

};


