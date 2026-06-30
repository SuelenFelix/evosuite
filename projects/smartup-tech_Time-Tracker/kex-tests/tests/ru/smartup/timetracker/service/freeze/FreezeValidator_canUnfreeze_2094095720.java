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

public class FreezeValidator_canUnfreeze_2094095720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10540;
     Object term10661;

    public FreezeValidator_canUnfreeze_2094095720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10617 = new HashMap();
        Set<Object> term10715 =  ((Map) term10617).keySet();
        HashSet term10616 = new HashSet((Collection<? extends Object>) term10715);
        Class<? extends Object> term10717 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term10716 = ((Class) term10717).getDeclaredField((String) "EMPLOYEE");
        ((Field) term10716).setAccessible(true);
        Object enum22 = ((Field) term10716).get((Object) null);
        Float term10628 = new Float(0.478669F);
        Class<? extends Object> term11058 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term11057 = ((Class) term11058).getDeclaredField((String) "UN_FREEZE");
        ((Field) term11057).setAccessible(true);
        Object enum23 = ((Field) term11057).get((Object) null);
        term10540 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term10542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10546 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term10610 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10613 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10622 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term10655 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10658 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term10540, term10540.getClass(), "id", -123338791);
        setIntField(term10542, term10542.getClass(), "year", 2028);
        setShortField(term10542, term10542.getClass(), "month", (short) 4);
        setShortField(term10542, term10542.getClass(), "day", (short) 3);
        setField(term10540, term10540.getClass(), "freezeDate", term10542);
        setIntField(term10546, term10546.getClass(), "id", -1467089634);
        setField(term10546, term10546.getClass(), "firstName", "rIPMBcrNqB");
        setField(term10546, term10546.getClass(), "middleName", "UDaboHZHhz");
        setField(term10546, term10546.getClass(), "lastName", "nRvKihUSPj");
        setField(term10546, term10546.getClass(), "email", "BbNeQJpYPr");
        setField(term10546, term10546.getClass(), "passwordHash", "riMtzCoxNj");
        setIntField(term10546, term10546.getClass(), "positionId", 413548937);
        setBooleanField(term10546, term10546.getClass(), "isArchived", false);
        setIntField(term10610, term10610.getClass(), "nanos", 491000000);
        setLongField(term10610, term10610.getClass(), "fastTime", 1630044767000L);
        setField(term10610, term10610.getClass(), "cdate", null);
        setField(term10546, term10546.getClass(), "createdDate", term10610);
        setIntField(term10613, term10613.getClass(), "nanos", 731000000);
        setLongField(term10613, term10613.getClass(), "fastTime", 1335709182000L);
        setField(term10613, term10613.getClass(), "cdate", null);
        setField(term10546, term10546.getClass(), "lastModifiedDate", term10613);
        setField(term10546, term10546.getClass(), "employeeRoles", term10616);
        setIntField(term10622, term10622.getClass(), "employeeId", 1901317214);
        setIntField(term10622, term10622.getClass(), "projectId", 1166710220);
        setField(term10622, term10622.getClass(), "projectRoleId", enum22);
        setField(term10622, term10622.getClass(), "externalRate", term10628);
        setField(term10546, term10546.getClass(), "employeeProjectRole", term10622);
        setField(term10540, term10540.getClass(), "employee", term10546);
        setField(term10540, term10540.getClass(), "status", enum23);
        setField(term10540, term10540.getClass(), "info", "YAXkVjQZcV");
        setIntField(term10655, term10655.getClass(), "nanos", 231000000);
        setLongField(term10655, term10655.getClass(), "fastTime", 1337273131000L);
        setField(term10655, term10655.getClass(), "cdate", null);
        setField(term10540, term10540.getClass(), "createdDate", term10655);
        setIntField(term10658, term10658.getClass(), "nanos", 425000000);
        setLongField(term10658, term10658.getClass(), "fastTime", 1291731469000L);
        setField(term10658, term10658.getClass(), "cdate", null);
        setField(term10540, term10540.getClass(), "lastModifiedDate", term10658);
        term10661 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term10661, term10661.getClass(), "year", 2012);
        setShortField(term10661, term10661.getClass(), "month", (short) 3);
        setShortField(term10661, term10661.getClass(), "day", (short) 27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term10540;
        args[1] = term10661;
        callMethod(klass, "canUnfreeze", argTypes, null, args);
    }

};


