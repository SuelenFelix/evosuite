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

public class FreezeSchedulePlanner_unfreeze_6865010408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71992;
     Object term72004;
     Object term72125;

    public FreezeSchedulePlanner_unfreeze_6865010408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71992 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term71993 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term71994 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term71995 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term71997 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term71998 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term71992, term71992.getClass(), "crudFreezeService", null);
        setField(term71995, term71995.getClass(), "id", "");
        setField(term71997, term71997.getClass(), "standardTransitions", null);
        setField(term71997, term71997.getClass(), "standardOffsets", null);
        setField(term71997, term71997.getClass(), "savingsInstantTransitions", null);
        setField(term71997, term71997.getClass(), "savingsLocalTransitions", null);
        setField(term71997, term71997.getClass(), "wallOffsets", null);
        setField(term71997, term71997.getClass(), "lastRules", null);
        setField(term71997, term71997.getClass(), "lastRulesCache", null);
        setField(term71995, term71995.getClass(), "rules", term71997);
        setField(term71994, term71994.getClass(), "timeZone", term71995);
        setByteField(term71998, term71998.getClass(), "hour", (byte) 0);
        setByteField(term71998, term71998.getClass(), "minute", (byte) 25);
        setByteField(term71998, term71998.getClass(), "second", (byte) 28);
        setIntField(term71998, term71998.getClass(), "nano", 676721313);
        setField(term71994, term71994.getClass(), "fixedTimeFreeze", term71998);
        setIntField(term71994, term71994.getClass(), "dayToUnfreeze", 590451710);
        setField(term71993, term71993.getClass(), "freezeProperties", term71994);
        setField(term71992, term71992.getClass(), "freezeDateUtils", term71993);
        setField(term71992, term71992.getClass(), "freezeScheduler", null);
        setField(term71992, term71992.getClass(), "trackUnitService", null);
        HashMap term72081 = new HashMap();
        Set<Object> term72184 =  ((Map) term72081).keySet();
        HashSet term72080 = new HashSet((Collection<? extends Object>) term72184);
        Class<? extends Object> term72186 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term72185 = ((Class) term72186).getDeclaredField((String) "EMPLOYEE");
        ((Field) term72185).setAccessible(true);
        Object enum142 = ((Field) term72185).get((Object) null);
        Float term72092 = new Float(0.92038053F);
        Class<? extends Object> term72527 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term72526 = ((Class) term72527).getDeclaredField((String) "UN_FREEZE");
        ((Field) term72526).setAccessible(true);
        Object enum143 = ((Field) term72526).get((Object) null);
        term72004 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term72006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72010 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term72074 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72077 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72086 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term72119 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72122 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term72004, term72004.getClass(), "id", -1999787419);
        setIntField(term72006, term72006.getClass(), "year", 2014);
        setShortField(term72006, term72006.getClass(), "month", (short) 11);
        setShortField(term72006, term72006.getClass(), "day", (short) 8);
        setField(term72004, term72004.getClass(), "freezeDate", term72006);
        setIntField(term72010, term72010.getClass(), "id", -1224443634);
        setField(term72010, term72010.getClass(), "firstName", "GrTaccOQzl");
        setField(term72010, term72010.getClass(), "middleName", "uuSYOUCVHU");
        setField(term72010, term72010.getClass(), "lastName", "DfWwbodtVw");
        setField(term72010, term72010.getClass(), "email", "kTbFMpVWqx");
        setField(term72010, term72010.getClass(), "passwordHash", "HegRNsidFg");
        setIntField(term72010, term72010.getClass(), "positionId", 1048451946);
        setBooleanField(term72010, term72010.getClass(), "isArchived", true);
        setIntField(term72074, term72074.getClass(), "nanos", 303000000);
        setLongField(term72074, term72074.getClass(), "fastTime", 1312373268000L);
        setField(term72074, term72074.getClass(), "cdate", null);
        setField(term72010, term72010.getClass(), "createdDate", term72074);
        setIntField(term72077, term72077.getClass(), "nanos", 284000000);
        setLongField(term72077, term72077.getClass(), "fastTime", 1535955865000L);
        setField(term72077, term72077.getClass(), "cdate", null);
        setField(term72010, term72010.getClass(), "lastModifiedDate", term72077);
        setField(term72010, term72010.getClass(), "employeeRoles", term72080);
        setIntField(term72086, term72086.getClass(), "employeeId", 5603560);
        setIntField(term72086, term72086.getClass(), "projectId", -1079020032);
        setField(term72086, term72086.getClass(), "projectRoleId", enum142);
        setField(term72086, term72086.getClass(), "externalRate", term72092);
        setField(term72010, term72010.getClass(), "employeeProjectRole", term72086);
        setField(term72004, term72004.getClass(), "employee", term72010);
        setField(term72004, term72004.getClass(), "status", enum143);
        setField(term72004, term72004.getClass(), "info", "udRdJkgXmH");
        setIntField(term72119, term72119.getClass(), "nanos", 58000000);
        setLongField(term72119, term72119.getClass(), "fastTime", 1842771287000L);
        setField(term72119, term72119.getClass(), "cdate", null);
        setField(term72004, term72004.getClass(), "createdDate", term72119);
        setIntField(term72122, term72122.getClass(), "nanos", 295000000);
        setLongField(term72122, term72122.getClass(), "fastTime", 1629683099000L);
        setField(term72122, term72122.getClass(), "cdate", null);
        setField(term72004, term72004.getClass(), "lastModifiedDate", term72122);
        term72125 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term72126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72130 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term72126, term72126.getClass(), "year", 2013);
        setShortField(term72126, term72126.getClass(), "month", (short) 2);
        setShortField(term72126, term72126.getClass(), "day", (short) 2);
        setField(term72125, term72125.getClass(), "startDate", term72126);
        setIntField(term72130, term72130.getClass(), "year", 2020);
        setShortField(term72130, term72130.getClass(), "month", (short) 5);
        setShortField(term72130, term72130.getClass(), "day", (short) 17);
        setField(term72125, term72125.getClass(), "endDate", term72130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term72004;
        args[1] = term72125;
        callMethod(klass, "unfreeze", argTypes, term71992, args);
    }

};


