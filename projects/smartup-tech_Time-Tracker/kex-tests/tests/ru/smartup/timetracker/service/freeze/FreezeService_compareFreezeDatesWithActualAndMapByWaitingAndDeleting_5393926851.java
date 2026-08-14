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
import java.util.LinkedList;
import java.util.HashSet;
import java.lang.Float;
import java.lang.String;
import java.lang.Integer;

public class FreezeService_compareFreezeDatesWithActualAndMapByWaitingAndDeleting_5393926851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term72;
     Object term124;
     Object term132;

    public FreezeService_compareFreezeDatesWithActualAndMapByWaitingAndDeleting_5393926851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term51 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term52 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term53 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term54 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term55 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term62 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term63 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term66 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term51, term51.getClass(), "crudFreezeService", null);
        setField(term54, term54.getClass(), "id", null);
        setField(term54, term54.getClass(), "rules", null);
        setField(term53, term53.getClass(), "timeZone", term54);
        setByteField(term55, term55.getClass(), "hour", (byte) 11);
        setByteField(term55, term55.getClass(), "minute", (byte) 50);
        setByteField(term55, term55.getClass(), "second", (byte) 22);
        setIntField(term55, term55.getClass(), "nano", 607649559);
        setField(term53, term53.getClass(), "fixedTimeFreeze", term55);
        setIntField(term53, term53.getClass(), "dayToUnfreeze", 391863371);
        setField(term52, term52.getClass(), "freezeProperties", term53);
        setField(term51, term51.getClass(), "freezeDateUtils", term52);
        setField(term51, term51.getClass(), "freezeScheduler", null);
        setField(term51, term51.getClass(), "trackUnitService", null);
        setField(term50, term50.getClass(), "freezeSchedulePlanner", term51);
        setField(term50, term50.getClass(), "crudFreezeService", null);
        setField(term50, term50.getClass(), "freezeValidator", null);
        setIntField(term63, term63.getClass(), "totalSeconds", -25200);
        setField(term63, term63.getClass(), "id", "");
        setField(term62, term62.getClass(), "timeZone", term63);
        setByteField(term66, term66.getClass(), "hour", (byte) 21);
        setByteField(term66, term66.getClass(), "minute", (byte) 41);
        setByteField(term66, term66.getClass(), "second", (byte) 8);
        setIntField(term66, term66.getClass(), "nano", 765502068);
        setField(term62, term62.getClass(), "fixedTimeFreeze", term66);
        setIntField(term62, term62.getClass(), "dayToUnfreeze", -1922583790);
        setField(term61, term61.getClass(), "freezeProperties", term62);
        setField(term50, term50.getClass(), "freezeDateUtils", term61);
        setField(term50, term50.getClass(), "lockManager", null);
        HashSet term96 = new HashSet();
        Float term100 = new Float(0.13238746F);
        Class<? extends Object> term226 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term225 = ((Class) term226).getDeclaredField((String) "INTERRUPTED");
        ((Field) term225).setAccessible(true);
        Object enum0 = ((Field) term225).get((Object) null);
        Object term75 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term77 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term90 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term97 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term117 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term120 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term75, term75.getClass(), "id", -616727354);
        setIntField(term77, term77.getClass(), "year", 2018);
        setShortField(term77, term77.getClass(), "month", (short) 1);
        setShortField(term77, term77.getClass(), "day", (short) 13);
        setField(term75, term75.getClass(), "freezeDate", term77);
        setIntField(term81, term81.getClass(), "id", -1955890973);
        setField(term81, term81.getClass(), "firstName", "");
        setField(term81, term81.getClass(), "middleName", "");
        setField(term81, term81.getClass(), "lastName", "");
        setField(term81, term81.getClass(), "email", "");
        setField(term81, term81.getClass(), "passwordHash", "");
        setIntField(term81, term81.getClass(), "positionId", -2038273078);
        setBooleanField(term81, term81.getClass(), "isArchived", false);
        setIntField(term90, term90.getClass(), "nanos", 244000000);
        setLongField(term90, term90.getClass(), "fastTime", 1345860612000L);
        setField(term90, term90.getClass(), "cdate", null);
        setField(term81, term81.getClass(), "createdDate", term90);
        setIntField(term93, term93.getClass(), "nanos", 369000000);
        setLongField(term93, term93.getClass(), "fastTime", 1480427551000L);
        setField(term93, term93.getClass(), "cdate", null);
        setField(term81, term81.getClass(), "lastModifiedDate", term93);
        setField(term81, term81.getClass(), "employeeRoles", term96);
        setIntField(term97, term97.getClass(), "employeeId", 1227103734);
        setIntField(term97, term97.getClass(), "projectId", -1339778481);
        setField(term97, term97.getClass(), "projectRoleId", null);
        setField(term97, term97.getClass(), "externalRate", term100);
        setField(term81, term81.getClass(), "employeeProjectRole", term97);
        setField(term75, term75.getClass(), "employee", term81);
        setField(term75, term75.getClass(), "status", enum0);
        setField(term75, term75.getClass(), "info", "EGtDIRbSSb");
        setIntField(term117, term117.getClass(), "nanos", 830000000);
        setLongField(term117, term117.getClass(), "fastTime", 1610929382000L);
        setField(term117, term117.getClass(), "cdate", null);
        setField(term75, term75.getClass(), "createdDate", term117);
        setIntField(term120, term120.getClass(), "nanos", 837000000);
        setLongField(term120, term120.getClass(), "fastTime", 1606034835000L);
        setField(term120, term120.getClass(), "cdate", null);
        setField(term75, term75.getClass(), "lastModifiedDate", term120);
        term72 = new LinkedList();
        ((LinkedList) term72).add(term75);
        Object term127 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term127, term127.getClass(), "year", 2015);
        setShortField(term127, term127.getClass(), "month", (short) 4);
        setShortField(term127, term127.getClass(), "day", (short) 14);
        term124 = new LinkedList();
        ((LinkedList) term124).add(term127);
        term132 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term72;
        args[1] = term124;
        args[2] = term132;
        callMethod(klass, "compareFreezeDatesWithActualAndMapByWaitingAndDeleting", argTypes, term50, args);
    }

};


