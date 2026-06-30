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
     Object term1848;
     Object term1860;

    public FreezeSchedulePlanner_freeze_10404912823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1848 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term1849 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1850 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1851 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1853 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term1854 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1848, term1848.getClass(), "crudFreezeService", null);
        setField(term1851, term1851.getClass(), "id", "");
        setField(term1853, term1853.getClass(), "standardTransitions", null);
        setField(term1853, term1853.getClass(), "standardOffsets", null);
        setField(term1853, term1853.getClass(), "savingsInstantTransitions", null);
        setField(term1853, term1853.getClass(), "savingsLocalTransitions", null);
        setField(term1853, term1853.getClass(), "wallOffsets", null);
        setField(term1853, term1853.getClass(), "lastRules", null);
        setField(term1853, term1853.getClass(), "lastRulesCache", null);
        setField(term1851, term1851.getClass(), "rules", term1853);
        setField(term1850, term1850.getClass(), "timeZone", term1851);
        setByteField(term1854, term1854.getClass(), "hour", (byte) 20);
        setByteField(term1854, term1854.getClass(), "minute", (byte) 7);
        setByteField(term1854, term1854.getClass(), "second", (byte) 25);
        setIntField(term1854, term1854.getClass(), "nano", 322733539);
        setField(term1850, term1850.getClass(), "fixedTimeFreeze", term1854);
        setIntField(term1850, term1850.getClass(), "dayToUnfreeze", -2131181468);
        setField(term1849, term1849.getClass(), "freezeProperties", term1850);
        setField(term1848, term1848.getClass(), "freezeDateUtils", term1849);
        setField(term1848, term1848.getClass(), "freezeScheduler", null);
        setField(term1848, term1848.getClass(), "trackUnitService", null);
        HashMap term1937 = new HashMap();
        Set<Object> term2030 =  ((Map) term1937).keySet();
        HashSet term1936 = new HashSet((Collection<? extends Object>) term2030);
        Class<? extends Object> term2032 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2031 = ((Class) term2032).getDeclaredField((String) "EMPLOYEE");
        ((Field) term2031).setAccessible(true);
        Object enum3 = ((Field) term2031).get((Object) null);
        Float term1948 = new Float(0.45691717F);
        Class<? extends Object> term2373 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term2372 = ((Class) term2373).getDeclaredField((String) "OUTDATED");
        ((Field) term2372).setAccessible(true);
        Object enum4 = ((Field) term2372).get((Object) null);
        term1860 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term1862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1866 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term1930 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1933 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1942 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term1974 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1977 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1860, term1860.getClass(), "id", 282916351);
        setIntField(term1862, term1862.getClass(), "year", 2027);
        setShortField(term1862, term1862.getClass(), "month", (short) 8);
        setShortField(term1862, term1862.getClass(), "day", (short) 25);
        setField(term1860, term1860.getClass(), "freezeDate", term1862);
        setIntField(term1866, term1866.getClass(), "id", 880977281);
        setField(term1866, term1866.getClass(), "firstName", "iIRsCSYqXH");
        setField(term1866, term1866.getClass(), "middleName", "nghfqDXyCG");
        setField(term1866, term1866.getClass(), "lastName", "WBAOTqErtm");
        setField(term1866, term1866.getClass(), "email", "PqtVXXZMqK");
        setField(term1866, term1866.getClass(), "passwordHash", "rYbtIDVdnd");
        setIntField(term1866, term1866.getClass(), "positionId", 371943306);
        setBooleanField(term1866, term1866.getClass(), "isArchived", false);
        setIntField(term1930, term1930.getClass(), "nanos", 891000000);
        setLongField(term1930, term1930.getClass(), "fastTime", 1303208814000L);
        setField(term1930, term1930.getClass(), "cdate", null);
        setField(term1866, term1866.getClass(), "createdDate", term1930);
        setIntField(term1933, term1933.getClass(), "nanos", 741000000);
        setLongField(term1933, term1933.getClass(), "fastTime", 1798201949000L);
        setField(term1933, term1933.getClass(), "cdate", null);
        setField(term1866, term1866.getClass(), "lastModifiedDate", term1933);
        setField(term1866, term1866.getClass(), "employeeRoles", term1936);
        setIntField(term1942, term1942.getClass(), "employeeId", 982388293);
        setIntField(term1942, term1942.getClass(), "projectId", -159494544);
        setField(term1942, term1942.getClass(), "projectRoleId", enum3);
        setField(term1942, term1942.getClass(), "externalRate", term1948);
        setField(term1866, term1866.getClass(), "employeeProjectRole", term1942);
        setField(term1860, term1860.getClass(), "employee", term1866);
        setField(term1860, term1860.getClass(), "status", enum4);
        setField(term1860, term1860.getClass(), "info", "UKAReurpHG");
        setIntField(term1974, term1974.getClass(), "nanos", 367000000);
        setLongField(term1974, term1974.getClass(), "fastTime", 1408283942000L);
        setField(term1974, term1974.getClass(), "cdate", null);
        setField(term1860, term1860.getClass(), "createdDate", term1974);
        setIntField(term1977, term1977.getClass(), "nanos", 410000000);
        setLongField(term1977, term1977.getClass(), "fastTime", 1643970344000L);
        setField(term1977, term1977.getClass(), "cdate", null);
        setField(term1860, term1860.getClass(), "lastModifiedDate", term1977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term1860;
        callMethod(klass, "freeze", argTypes, term1848, args);
    }

};


