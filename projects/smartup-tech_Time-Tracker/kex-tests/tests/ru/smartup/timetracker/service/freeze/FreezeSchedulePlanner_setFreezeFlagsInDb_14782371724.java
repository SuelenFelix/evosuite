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
     Object term2758;
     Object term2770;

    public FreezeSchedulePlanner_setFreezeFlagsInDb_14782371724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2758 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term2759 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2760 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2761 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2763 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term2764 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2758, term2758.getClass(), "crudFreezeService", null);
        setField(term2761, term2761.getClass(), "id", "");
        setField(term2763, term2763.getClass(), "standardTransitions", null);
        setField(term2763, term2763.getClass(), "standardOffsets", null);
        setField(term2763, term2763.getClass(), "savingsInstantTransitions", null);
        setField(term2763, term2763.getClass(), "savingsLocalTransitions", null);
        setField(term2763, term2763.getClass(), "wallOffsets", null);
        setField(term2763, term2763.getClass(), "lastRules", null);
        setField(term2763, term2763.getClass(), "lastRulesCache", null);
        setField(term2761, term2761.getClass(), "rules", term2763);
        setField(term2760, term2760.getClass(), "timeZone", term2761);
        setByteField(term2764, term2764.getClass(), "hour", (byte) 0);
        setByteField(term2764, term2764.getClass(), "minute", (byte) 1);
        setByteField(term2764, term2764.getClass(), "second", (byte) 31);
        setIntField(term2764, term2764.getClass(), "nano", 111790670);
        setField(term2760, term2760.getClass(), "fixedTimeFreeze", term2764);
        setIntField(term2760, term2760.getClass(), "dayToUnfreeze", -75206835);
        setField(term2759, term2759.getClass(), "freezeProperties", term2760);
        setField(term2758, term2758.getClass(), "freezeDateUtils", term2759);
        setField(term2758, term2758.getClass(), "freezeScheduler", null);
        setField(term2758, term2758.getClass(), "trackUnitService", null);
        HashMap term2847 = new HashMap();
        Set<Object> term2943 =  ((Map) term2847).keySet();
        HashSet term2846 = new HashSet((Collection<? extends Object>) term2943);
        Class<? extends Object> term2945 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2944 = ((Class) term2945).getDeclaredField((String) "EMPLOYEE");
        ((Field) term2944).setAccessible(true);
        Object enum5 = ((Field) term2944).get((Object) null);
        Float term2858 = new Float(0.17877543F);
        Class<? extends Object> term3286 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term3285 = ((Class) term3286).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term3285).setAccessible(true);
        Object enum6 = ((Field) term3285).get((Object) null);
        term2770 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term2772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2776 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term2840 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2843 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2852 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term2887 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2890 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2770, term2770.getClass(), "id", -1618206977);
        setIntField(term2772, term2772.getClass(), "year", 2014);
        setShortField(term2772, term2772.getClass(), "month", (short) 5);
        setShortField(term2772, term2772.getClass(), "day", (short) 21);
        setField(term2770, term2770.getClass(), "freezeDate", term2772);
        setIntField(term2776, term2776.getClass(), "id", -1747406163);
        setField(term2776, term2776.getClass(), "firstName", "WVRMUmrljA");
        setField(term2776, term2776.getClass(), "middleName", "NTlKJDDWlk");
        setField(term2776, term2776.getClass(), "lastName", "vOuMEpOQAg");
        setField(term2776, term2776.getClass(), "email", "SIODFGaQhr");
        setField(term2776, term2776.getClass(), "passwordHash", "qYzsiuXOgS");
        setIntField(term2776, term2776.getClass(), "positionId", 388157121);
        setBooleanField(term2776, term2776.getClass(), "isArchived", false);
        setIntField(term2840, term2840.getClass(), "nanos", 168000000);
        setLongField(term2840, term2840.getClass(), "fastTime", 1615568384000L);
        setField(term2840, term2840.getClass(), "cdate", null);
        setField(term2776, term2776.getClass(), "createdDate", term2840);
        setIntField(term2843, term2843.getClass(), "nanos", 759000000);
        setLongField(term2843, term2843.getClass(), "fastTime", 1440872174000L);
        setField(term2843, term2843.getClass(), "cdate", null);
        setField(term2776, term2776.getClass(), "lastModifiedDate", term2843);
        setField(term2776, term2776.getClass(), "employeeRoles", term2846);
        setIntField(term2852, term2852.getClass(), "employeeId", 1684998508);
        setIntField(term2852, term2852.getClass(), "projectId", -1476644457);
        setField(term2852, term2852.getClass(), "projectRoleId", enum5);
        setField(term2852, term2852.getClass(), "externalRate", term2858);
        setField(term2776, term2776.getClass(), "employeeProjectRole", term2852);
        setField(term2770, term2770.getClass(), "employee", term2776);
        setField(term2770, term2770.getClass(), "status", enum6);
        setField(term2770, term2770.getClass(), "info", "bxrCBbrrct");
        setIntField(term2887, term2887.getClass(), "nanos", 871000000);
        setLongField(term2887, term2887.getClass(), "fastTime", 1603603429000L);
        setField(term2887, term2887.getClass(), "cdate", null);
        setField(term2770, term2770.getClass(), "createdDate", term2887);
        setIntField(term2890, term2890.getClass(), "nanos", 230000000);
        setLongField(term2890, term2890.getClass(), "fastTime", 1861010348000L);
        setField(term2890, term2890.getClass(), "cdate", null);
        setField(term2770, term2770.getClass(), "lastModifiedDate", term2890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term2770;
        callMethod(klass, "setFreezeFlagsInDb", argTypes, term2758, args);
    }

};


