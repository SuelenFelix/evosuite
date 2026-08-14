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
     Object term10725;
     Object term10846;

    public FreezeValidator_canUnfreeze_2094095720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10802 = new HashMap();
        Set<Object> term10900 =  ((Map) term10802).keySet();
        HashSet term10801 = new HashSet((Collection<? extends Object>) term10900);
        Class<? extends Object> term10902 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term10901 = ((Class) term10902).getDeclaredField((String) "EMPLOYEE");
        ((Field) term10901).setAccessible(true);
        Object enum22 = ((Field) term10901).get((Object) null);
        Float term10813 = new Float(0.478669F);
        Class<? extends Object> term11243 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term11242 = ((Class) term11243).getDeclaredField((String) "UN_FREEZE");
        ((Field) term11242).setAccessible(true);
        Object enum23 = ((Field) term11242).get((Object) null);
        term10725 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term10727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10731 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term10795 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10798 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10807 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term10840 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10843 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term10725, term10725.getClass(), "id", -123338791);
        setIntField(term10727, term10727.getClass(), "year", 2028);
        setShortField(term10727, term10727.getClass(), "month", (short) 4);
        setShortField(term10727, term10727.getClass(), "day", (short) 3);
        setField(term10725, term10725.getClass(), "freezeDate", term10727);
        setIntField(term10731, term10731.getClass(), "id", -1467089634);
        setField(term10731, term10731.getClass(), "firstName", "rIPMBcrNqB");
        setField(term10731, term10731.getClass(), "middleName", "UDaboHZHhz");
        setField(term10731, term10731.getClass(), "lastName", "nRvKihUSPj");
        setField(term10731, term10731.getClass(), "email", "BbNeQJpYPr");
        setField(term10731, term10731.getClass(), "passwordHash", "riMtzCoxNj");
        setIntField(term10731, term10731.getClass(), "positionId", 413548937);
        setBooleanField(term10731, term10731.getClass(), "isArchived", false);
        setIntField(term10795, term10795.getClass(), "nanos", 491000000);
        setLongField(term10795, term10795.getClass(), "fastTime", 1630044767000L);
        setField(term10795, term10795.getClass(), "cdate", null);
        setField(term10731, term10731.getClass(), "createdDate", term10795);
        setIntField(term10798, term10798.getClass(), "nanos", 731000000);
        setLongField(term10798, term10798.getClass(), "fastTime", 1335709182000L);
        setField(term10798, term10798.getClass(), "cdate", null);
        setField(term10731, term10731.getClass(), "lastModifiedDate", term10798);
        setField(term10731, term10731.getClass(), "employeeRoles", term10801);
        setIntField(term10807, term10807.getClass(), "employeeId", 1901317214);
        setIntField(term10807, term10807.getClass(), "projectId", 1166710220);
        setField(term10807, term10807.getClass(), "projectRoleId", enum22);
        setField(term10807, term10807.getClass(), "externalRate", term10813);
        setField(term10731, term10731.getClass(), "employeeProjectRole", term10807);
        setField(term10725, term10725.getClass(), "employee", term10731);
        setField(term10725, term10725.getClass(), "status", enum23);
        setField(term10725, term10725.getClass(), "info", "YAXkVjQZcV");
        setIntField(term10840, term10840.getClass(), "nanos", 231000000);
        setLongField(term10840, term10840.getClass(), "fastTime", 1337273131000L);
        setField(term10840, term10840.getClass(), "cdate", null);
        setField(term10725, term10725.getClass(), "createdDate", term10840);
        setIntField(term10843, term10843.getClass(), "nanos", 425000000);
        setLongField(term10843, term10843.getClass(), "fastTime", 1291731469000L);
        setField(term10843, term10843.getClass(), "cdate", null);
        setField(term10725, term10725.getClass(), "lastModifiedDate", term10843);
        term10846 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term10846, term10846.getClass(), "year", 2012);
        setShortField(term10846, term10846.getClass(), "month", (short) 3);
        setShortField(term10846, term10846.getClass(), "day", (short) 27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term10725;
        args[1] = term10846;
        callMethod(klass, "canUnfreeze", argTypes, null, args);
    }

};


