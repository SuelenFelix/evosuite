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

public class FreezeSchedulePlanner_freezeTrackUnits_21240203105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3680;
     Object term3692;

    public FreezeSchedulePlanner_freezeTrackUnits_21240203105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3680 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term3681 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term3682 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term3683 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3685 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term3686 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3680, term3680.getClass(), "crudFreezeService", null);
        setField(term3683, term3683.getClass(), "id", "");
        setField(term3685, term3685.getClass(), "standardTransitions", null);
        setField(term3685, term3685.getClass(), "standardOffsets", null);
        setField(term3685, term3685.getClass(), "savingsInstantTransitions", null);
        setField(term3685, term3685.getClass(), "savingsLocalTransitions", null);
        setField(term3685, term3685.getClass(), "wallOffsets", null);
        setField(term3685, term3685.getClass(), "lastRules", null);
        setField(term3685, term3685.getClass(), "lastRulesCache", null);
        setField(term3683, term3683.getClass(), "rules", term3685);
        setField(term3682, term3682.getClass(), "timeZone", term3683);
        setByteField(term3686, term3686.getClass(), "hour", (byte) 14);
        setByteField(term3686, term3686.getClass(), "minute", (byte) 42);
        setByteField(term3686, term3686.getClass(), "second", (byte) 31);
        setIntField(term3686, term3686.getClass(), "nano", 16575281);
        setField(term3682, term3682.getClass(), "fixedTimeFreeze", term3686);
        setIntField(term3682, term3682.getClass(), "dayToUnfreeze", 1270666529);
        setField(term3681, term3681.getClass(), "freezeProperties", term3682);
        setField(term3680, term3680.getClass(), "freezeDateUtils", term3681);
        setField(term3680, term3680.getClass(), "freezeScheduler", null);
        setField(term3680, term3680.getClass(), "trackUnitService", null);
        HashMap term3769 = new HashMap();
        Set<Object> term3865 =  ((Map) term3769).keySet();
        HashSet term3768 = new HashSet((Collection<? extends Object>) term3865);
        Class<? extends Object> term3867 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term3866 = ((Class) term3867).getDeclaredField((String) "EMPLOYEE");
        ((Field) term3866).setAccessible(true);
        Object enum7 = ((Field) term3866).get((Object) null);
        Float term3780 = new Float(0.8598297F);
        Class<? extends Object> term4208 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term4207 = ((Class) term4208).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term4207).setAccessible(true);
        Object enum8 = ((Field) term4207).get((Object) null);
        term3692 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term3694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3698 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term3762 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3765 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3774 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term3809 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3812 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3692, term3692.getClass(), "id", -1146679443);
        setIntField(term3694, term3694.getClass(), "year", 2025);
        setShortField(term3694, term3694.getClass(), "month", (short) 3);
        setShortField(term3694, term3694.getClass(), "day", (short) 8);
        setField(term3692, term3692.getClass(), "freezeDate", term3694);
        setIntField(term3698, term3698.getClass(), "id", -860131894);
        setField(term3698, term3698.getClass(), "firstName", "CKWpJaaaxX");
        setField(term3698, term3698.getClass(), "middleName", "UBRmXJmfrt");
        setField(term3698, term3698.getClass(), "lastName", "WZzvmIHhzZ");
        setField(term3698, term3698.getClass(), "email", "doQLHkjpNm");
        setField(term3698, term3698.getClass(), "passwordHash", "lCyLIcSuom");
        setIntField(term3698, term3698.getClass(), "positionId", -1022990421);
        setBooleanField(term3698, term3698.getClass(), "isArchived", true);
        setIntField(term3762, term3762.getClass(), "nanos", 171000000);
        setLongField(term3762, term3762.getClass(), "fastTime", 1589197776000L);
        setField(term3762, term3762.getClass(), "cdate", null);
        setField(term3698, term3698.getClass(), "createdDate", term3762);
        setIntField(term3765, term3765.getClass(), "nanos", 195000000);
        setLongField(term3765, term3765.getClass(), "fastTime", 1420254676000L);
        setField(term3765, term3765.getClass(), "cdate", null);
        setField(term3698, term3698.getClass(), "lastModifiedDate", term3765);
        setField(term3698, term3698.getClass(), "employeeRoles", term3768);
        setIntField(term3774, term3774.getClass(), "employeeId", 1045547089);
        setIntField(term3774, term3774.getClass(), "projectId", -1122880881);
        setField(term3774, term3774.getClass(), "projectRoleId", enum7);
        setField(term3774, term3774.getClass(), "externalRate", term3780);
        setField(term3698, term3698.getClass(), "employeeProjectRole", term3774);
        setField(term3692, term3692.getClass(), "employee", term3698);
        setField(term3692, term3692.getClass(), "status", enum8);
        setField(term3692, term3692.getClass(), "info", "CGOpQSZZwI");
        setIntField(term3809, term3809.getClass(), "nanos", 567000000);
        setLongField(term3809, term3809.getClass(), "fastTime", 1379577714000L);
        setField(term3809, term3809.getClass(), "cdate", null);
        setField(term3692, term3692.getClass(), "createdDate", term3809);
        setIntField(term3812, term3812.getClass(), "nanos", 111000000);
        setLongField(term3812, term3812.getClass(), "fastTime", 1416349120000L);
        setField(term3812, term3812.getClass(), "cdate", null);
        setField(term3692, term3692.getClass(), "lastModifiedDate", term3812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term3692;
        callMethod(klass, "freezeTrackUnits", argTypes, term3680, args);
    }

};


