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

public class FreezeSchedulePlanner_tryUnfreeze_21422333979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72915;
     Object term72927;
     Object term73050;

    public FreezeSchedulePlanner_tryUnfreeze_21422333979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72915 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term72916 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term72917 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term72918 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term72920 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term72921 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term72915, term72915.getClass(), "crudFreezeService", null);
        setField(term72918, term72918.getClass(), "id", "");
        setField(term72920, term72920.getClass(), "standardTransitions", null);
        setField(term72920, term72920.getClass(), "standardOffsets", null);
        setField(term72920, term72920.getClass(), "savingsInstantTransitions", null);
        setField(term72920, term72920.getClass(), "savingsLocalTransitions", null);
        setField(term72920, term72920.getClass(), "wallOffsets", null);
        setField(term72920, term72920.getClass(), "lastRules", null);
        setField(term72920, term72920.getClass(), "lastRulesCache", null);
        setField(term72918, term72918.getClass(), "rules", term72920);
        setField(term72917, term72917.getClass(), "timeZone", term72918);
        setByteField(term72921, term72921.getClass(), "hour", (byte) 7);
        setByteField(term72921, term72921.getClass(), "minute", (byte) 52);
        setByteField(term72921, term72921.getClass(), "second", (byte) 19);
        setIntField(term72921, term72921.getClass(), "nano", 298740176);
        setField(term72917, term72917.getClass(), "fixedTimeFreeze", term72921);
        setIntField(term72917, term72917.getClass(), "dayToUnfreeze", -1973791064);
        setField(term72916, term72916.getClass(), "freezeProperties", term72917);
        setField(term72915, term72915.getClass(), "freezeDateUtils", term72916);
        setField(term72915, term72915.getClass(), "freezeScheduler", null);
        setField(term72915, term72915.getClass(), "trackUnitService", null);
        HashMap term73004 = new HashMap();
        Set<Object> term73109 =  ((Map) term73004).keySet();
        HashSet term73003 = new HashSet((Collection<? extends Object>) term73109);
        Class<? extends Object> term73111 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term73110 = ((Class) term73111).getDeclaredField((String) "EMPLOYEE");
        ((Field) term73110).setAccessible(true);
        Object enum144 = ((Field) term73110).get((Object) null);
        Float term73015 = new Float(0.35686338F);
        Class<? extends Object> term73452 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term73451 = ((Class) term73452).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term73451).setAccessible(true);
        Object enum145 = ((Field) term73451).get((Object) null);
        term72927 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term72929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72933 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term72997 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73000 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73009 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term73044 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term73047 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term72927, term72927.getClass(), "id", -2072158633);
        setIntField(term72929, term72929.getClass(), "year", 2010);
        setShortField(term72929, term72929.getClass(), "month", (short) 12);
        setShortField(term72929, term72929.getClass(), "day", (short) 2);
        setField(term72927, term72927.getClass(), "freezeDate", term72929);
        setIntField(term72933, term72933.getClass(), "id", -355469363);
        setField(term72933, term72933.getClass(), "firstName", "FBCXbjHVXO");
        setField(term72933, term72933.getClass(), "middleName", "dIWAnvmLiC");
        setField(term72933, term72933.getClass(), "lastName", "CuWebzZQjZ");
        setField(term72933, term72933.getClass(), "email", "wRVaaJxKYI");
        setField(term72933, term72933.getClass(), "passwordHash", "yOQuJXRvOo");
        setIntField(term72933, term72933.getClass(), "positionId", 1465188553);
        setBooleanField(term72933, term72933.getClass(), "isArchived", true);
        setIntField(term72997, term72997.getClass(), "nanos", 593000000);
        setLongField(term72997, term72997.getClass(), "fastTime", 1826240941000L);
        setField(term72997, term72997.getClass(), "cdate", null);
        setField(term72933, term72933.getClass(), "createdDate", term72997);
        setIntField(term73000, term73000.getClass(), "nanos", 265000000);
        setLongField(term73000, term73000.getClass(), "fastTime", 1422768318000L);
        setField(term73000, term73000.getClass(), "cdate", null);
        setField(term72933, term72933.getClass(), "lastModifiedDate", term73000);
        setField(term72933, term72933.getClass(), "employeeRoles", term73003);
        setIntField(term73009, term73009.getClass(), "employeeId", 1633913667);
        setIntField(term73009, term73009.getClass(), "projectId", 1292332296);
        setField(term73009, term73009.getClass(), "projectRoleId", enum144);
        setField(term73009, term73009.getClass(), "externalRate", term73015);
        setField(term72933, term72933.getClass(), "employeeProjectRole", term73009);
        setField(term72927, term72927.getClass(), "employee", term72933);
        setField(term72927, term72927.getClass(), "status", enum145);
        setField(term72927, term72927.getClass(), "info", "XmLHcnVsch");
        setIntField(term73044, term73044.getClass(), "nanos", 448000000);
        setLongField(term73044, term73044.getClass(), "fastTime", 1553541405000L);
        setField(term73044, term73044.getClass(), "cdate", null);
        setField(term72927, term72927.getClass(), "createdDate", term73044);
        setIntField(term73047, term73047.getClass(), "nanos", 676000000);
        setLongField(term73047, term73047.getClass(), "fastTime", 1331502861000L);
        setField(term73047, term73047.getClass(), "cdate", null);
        setField(term72927, term72927.getClass(), "lastModifiedDate", term73047);
        term73050 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term73051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73055 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term73051, term73051.getClass(), "year", 2017);
        setShortField(term73051, term73051.getClass(), "month", (short) 4);
        setShortField(term73051, term73051.getClass(), "day", (short) 2);
        setField(term73050, term73050.getClass(), "startDate", term73051);
        setIntField(term73055, term73055.getClass(), "year", 2016);
        setShortField(term73055, term73055.getClass(), "month", (short) 4);
        setShortField(term73055, term73055.getClass(), "day", (short) 30);
        setField(term73050, term73050.getClass(), "endDate", term73055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term72927;
        args[1] = term73050;
        callMethod(klass, "tryUnfreeze", argTypes, term72915, args);
    }

};


