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
     Object term5545;
     Object term5557;
     Object term5678;

    public FreezeSchedulePlanner_tryUnfreeze_21422333978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5545 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term5546 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term5547 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term5548 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5551 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5545, term5545.getClass(), "crudFreezeService", null);
        setIntField(term5548, term5548.getClass(), "totalSeconds", -18000);
        setField(term5548, term5548.getClass(), "id", "");
        setField(term5547, term5547.getClass(), "timeZone", term5548);
        setByteField(term5551, term5551.getClass(), "hour", (byte) 7);
        setByteField(term5551, term5551.getClass(), "minute", (byte) 52);
        setByteField(term5551, term5551.getClass(), "second", (byte) 19);
        setIntField(term5551, term5551.getClass(), "nano", 298740176);
        setField(term5547, term5547.getClass(), "fixedTimeFreeze", term5551);
        setIntField(term5547, term5547.getClass(), "dayToUnfreeze", 534834644);
        setField(term5546, term5546.getClass(), "freezeProperties", term5547);
        setField(term5545, term5545.getClass(), "freezeDateUtils", term5546);
        setField(term5545, term5545.getClass(), "freezeScheduler", null);
        setField(term5545, term5545.getClass(), "trackUnitService", null);
        HashMap term5634 = new HashMap();
        Set<Object> term5737 =  ((Map) term5634).keySet();
        HashSet term5633 = new HashSet((Collection<? extends Object>) term5737);
        Class<? extends Object> term5739 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5738 = ((Class) term5739).getDeclaredField((String) "MANAGER");
        ((Field) term5738).setAccessible(true);
        Object enum11 = ((Field) term5738).get((Object) null);
        Float term5645 = new Float(0.43692183F);
        Class<? extends Object> term6077 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term6076 = ((Class) term6077).getDeclaredField((String) "UN_FREEZE");
        ((Field) term6076).setAccessible(true);
        Object enum12 = ((Field) term6076).get((Object) null);
        term5557 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term5559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5563 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term5627 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5630 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5639 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term5672 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5675 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term5557, term5557.getClass(), "id", 1959097203);
        setIntField(term5559, term5559.getClass(), "year", 2028);
        setShortField(term5559, term5559.getClass(), "month", (short) 9);
        setShortField(term5559, term5559.getClass(), "day", (short) 30);
        setField(term5557, term5557.getClass(), "freezeDate", term5559);
        setIntField(term5563, term5563.getClass(), "id", -209654048);
        setField(term5563, term5563.getClass(), "firstName", "uSUvKAyuvd");
        setField(term5563, term5563.getClass(), "middleName", "onQLVONGuf");
        setField(term5563, term5563.getClass(), "lastName", "SOrEHbcbmn");
        setField(term5563, term5563.getClass(), "email", "bnsyeQXFdu");
        setField(term5563, term5563.getClass(), "passwordHash", "BwtdjiefJn");
        setIntField(term5563, term5563.getClass(), "positionId", 477625804);
        setBooleanField(term5563, term5563.getClass(), "isArchived", false);
        setIntField(term5627, term5627.getClass(), "nanos", 817000000);
        setLongField(term5627, term5627.getClass(), "fastTime", 1684745176000L);
        setField(term5627, term5627.getClass(), "cdate", null);
        setField(term5563, term5563.getClass(), "createdDate", term5627);
        setIntField(term5630, term5630.getClass(), "nanos", 527000000);
        setLongField(term5630, term5630.getClass(), "fastTime", 1449306022000L);
        setField(term5630, term5630.getClass(), "cdate", null);
        setField(term5563, term5563.getClass(), "lastModifiedDate", term5630);
        setField(term5563, term5563.getClass(), "employeeRoles", term5633);
        setIntField(term5639, term5639.getClass(), "employeeId", 252575029);
        setIntField(term5639, term5639.getClass(), "projectId", 57189932);
        setField(term5639, term5639.getClass(), "projectRoleId", enum11);
        setField(term5639, term5639.getClass(), "externalRate", term5645);
        setField(term5563, term5563.getClass(), "employeeProjectRole", term5639);
        setField(term5557, term5557.getClass(), "employee", term5563);
        setField(term5557, term5557.getClass(), "status", enum12);
        setField(term5557, term5557.getClass(), "info", "jDmhBrIoDa");
        setIntField(term5672, term5672.getClass(), "nanos", 176000000);
        setLongField(term5672, term5672.getClass(), "fastTime", 1423084800000L);
        setField(term5672, term5672.getClass(), "cdate", null);
        setField(term5557, term5557.getClass(), "createdDate", term5672);
        setIntField(term5675, term5675.getClass(), "nanos", 165000000);
        setLongField(term5675, term5675.getClass(), "fastTime", 1890779014000L);
        setField(term5675, term5675.getClass(), "cdate", null);
        setField(term5557, term5557.getClass(), "lastModifiedDate", term5675);
        term5678 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term5679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5683 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5679, term5679.getClass(), "year", 2026);
        setShortField(term5679, term5679.getClass(), "month", (short) 11);
        setShortField(term5679, term5679.getClass(), "day", (short) 29);
        setField(term5678, term5678.getClass(), "startDate", term5679);
        setIntField(term5683, term5683.getClass(), "year", 2027);
        setShortField(term5683, term5683.getClass(), "month", (short) 2);
        setShortField(term5683, term5683.getClass(), "day", (short) 18);
        setField(term5678, term5678.getClass(), "endDate", term5683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[2];
        args[0] = term5557;
        args[1] = term5678;
        callMethod(klass, "tryUnfreeze", argTypes, term5545, args);
    }

};


