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
     Object term11633;

    public FreezeScheduler_scheduleFreeze_1753269770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11710 = new HashMap();
        Set<Object> term11806 =  ((Map) term11710).keySet();
        HashSet term11709 = new HashSet((Collection<? extends Object>) term11806);
        Class<? extends Object> term11808 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term11807 = ((Class) term11808).getDeclaredField((String) "EMPLOYEE");
        ((Field) term11807).setAccessible(true);
        Object enum24 = ((Field) term11807).get((Object) null);
        Float term11721 = new Float(0.75592405F);
        Class<? extends Object> term12149 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term12148 = ((Class) term12149).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term12148).setAccessible(true);
        Object enum25 = ((Field) term12148).get((Object) null);
        term11633 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term11635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11639 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term11703 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11706 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11715 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term11750 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11753 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11633, term11633.getClass(), "id", -1070592289);
        setIntField(term11635, term11635.getClass(), "year", 2020);
        setShortField(term11635, term11635.getClass(), "month", (short) 8);
        setShortField(term11635, term11635.getClass(), "day", (short) 12);
        setField(term11633, term11633.getClass(), "freezeDate", term11635);
        setIntField(term11639, term11639.getClass(), "id", -1464172784);
        setField(term11639, term11639.getClass(), "firstName", "pumvwBWvpy");
        setField(term11639, term11639.getClass(), "middleName", "HwLHeGLyhe");
        setField(term11639, term11639.getClass(), "lastName", "RDnkgWkcbz");
        setField(term11639, term11639.getClass(), "email", "IBpaxltauX");
        setField(term11639, term11639.getClass(), "passwordHash", "hePqROaplw");
        setIntField(term11639, term11639.getClass(), "positionId", 32185364);
        setBooleanField(term11639, term11639.getClass(), "isArchived", true);
        setIntField(term11703, term11703.getClass(), "nanos", 512000000);
        setLongField(term11703, term11703.getClass(), "fastTime", 1372834031000L);
        setField(term11703, term11703.getClass(), "cdate", null);
        setField(term11639, term11639.getClass(), "createdDate", term11703);
        setIntField(term11706, term11706.getClass(), "nanos", 602000000);
        setLongField(term11706, term11706.getClass(), "fastTime", 1854275018000L);
        setField(term11706, term11706.getClass(), "cdate", null);
        setField(term11639, term11639.getClass(), "lastModifiedDate", term11706);
        setField(term11639, term11639.getClass(), "employeeRoles", term11709);
        setIntField(term11715, term11715.getClass(), "employeeId", 1768204942);
        setIntField(term11715, term11715.getClass(), "projectId", 1252951645);
        setField(term11715, term11715.getClass(), "projectRoleId", enum24);
        setField(term11715, term11715.getClass(), "externalRate", term11721);
        setField(term11639, term11639.getClass(), "employeeProjectRole", term11715);
        setField(term11633, term11633.getClass(), "employee", term11639);
        setField(term11633, term11633.getClass(), "status", enum25);
        setField(term11633, term11633.getClass(), "info", "PJcSNDruWd");
        setIntField(term11750, term11750.getClass(), "nanos", 188000000);
        setLongField(term11750, term11750.getClass(), "fastTime", 1330516243000L);
        setField(term11750, term11750.getClass(), "cdate", null);
        setField(term11633, term11633.getClass(), "createdDate", term11750);
        setIntField(term11753, term11753.getClass(), "nanos", 362000000);
        setLongField(term11753, term11753.getClass(), "fastTime", 1755122284000L);
        setField(term11753, term11753.getClass(), "cdate", null);
        setField(term11633, term11633.getClass(), "lastModifiedDate", term11753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeTrackUnitAlgorithm");
        Object[] args = new Object[2];
        args[0] = term11633;
        args[1] = null;
        callMethod(klass, "scheduleFreeze", argTypes, null, args);
    }

};


