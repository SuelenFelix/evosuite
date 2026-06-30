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

public class FreezeScheduler_scheduleFreeze_1753269770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11448;

    public FreezeScheduler_scheduleFreeze_1753269770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11525 = new HashMap();
        Set<Object> term11621 =  ((Map) term11525).keySet();
        HashSet term11524 = new HashSet((Collection<? extends Object>) term11621);
        Class<? extends Object> term11623 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term11622 = ((Class) term11623).getDeclaredField((String) "EMPLOYEE");
        ((Field) term11622).setAccessible(true);
        Object enum24 = ((Field) term11622).get((Object) null);
        Float term11536 = new Float(0.75592405F);
        Class<? extends Object> term11964 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term11963 = ((Class) term11964).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term11963).setAccessible(true);
        Object enum25 = ((Field) term11963).get((Object) null);
        term11448 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term11450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11454 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term11518 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11521 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11530 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term11565 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11568 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11448, term11448.getClass(), "id", -1070592289);
        setIntField(term11450, term11450.getClass(), "year", 2020);
        setShortField(term11450, term11450.getClass(), "month", (short) 8);
        setShortField(term11450, term11450.getClass(), "day", (short) 12);
        setField(term11448, term11448.getClass(), "freezeDate", term11450);
        setIntField(term11454, term11454.getClass(), "id", -1464172784);
        setField(term11454, term11454.getClass(), "firstName", "pumvwBWvpy");
        setField(term11454, term11454.getClass(), "middleName", "HwLHeGLyhe");
        setField(term11454, term11454.getClass(), "lastName", "RDnkgWkcbz");
        setField(term11454, term11454.getClass(), "email", "IBpaxltauX");
        setField(term11454, term11454.getClass(), "passwordHash", "hePqROaplw");
        setIntField(term11454, term11454.getClass(), "positionId", 32185364);
        setBooleanField(term11454, term11454.getClass(), "isArchived", true);
        setIntField(term11518, term11518.getClass(), "nanos", 512000000);
        setLongField(term11518, term11518.getClass(), "fastTime", 1372834031000L);
        setField(term11518, term11518.getClass(), "cdate", null);
        setField(term11454, term11454.getClass(), "createdDate", term11518);
        setIntField(term11521, term11521.getClass(), "nanos", 602000000);
        setLongField(term11521, term11521.getClass(), "fastTime", 1854275018000L);
        setField(term11521, term11521.getClass(), "cdate", null);
        setField(term11454, term11454.getClass(), "lastModifiedDate", term11521);
        setField(term11454, term11454.getClass(), "employeeRoles", term11524);
        setIntField(term11530, term11530.getClass(), "employeeId", 1768204942);
        setIntField(term11530, term11530.getClass(), "projectId", 1252951645);
        setField(term11530, term11530.getClass(), "projectRoleId", enum24);
        setField(term11530, term11530.getClass(), "externalRate", term11536);
        setField(term11454, term11454.getClass(), "employeeProjectRole", term11530);
        setField(term11448, term11448.getClass(), "employee", term11454);
        setField(term11448, term11448.getClass(), "status", enum25);
        setField(term11448, term11448.getClass(), "info", "PJcSNDruWd");
        setIntField(term11565, term11565.getClass(), "nanos", 188000000);
        setLongField(term11565, term11565.getClass(), "fastTime", 1330516243000L);
        setField(term11565, term11565.getClass(), "cdate", null);
        setField(term11448, term11448.getClass(), "createdDate", term11565);
        setIntField(term11568, term11568.getClass(), "nanos", 362000000);
        setLongField(term11568, term11568.getClass(), "fastTime", 1755122284000L);
        setField(term11568, term11568.getClass(), "cdate", null);
        setField(term11448, term11448.getClass(), "lastModifiedDate", term11568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeTrackUnitAlgorithm");
        Object[] args = new Object[2];
        args[0] = term11448;
        args[1] = null;
        callMethod(klass, "scheduleFreeze", argTypes, null, args);
    }

};


