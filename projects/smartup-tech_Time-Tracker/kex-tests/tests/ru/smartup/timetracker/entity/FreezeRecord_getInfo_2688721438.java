package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeRecord_getInfo_2688721438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49412;

    public FreezeRecord_getInfo_2688721438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term49489 = new HashMap();
        Set<Object> term49585 =  ((Map) term49489).keySet();
        HashSet term49488 = new HashSet((Collection<? extends Object>) term49585);
        Class<? extends Object> term49587 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term49586 = ((Class) term49587).getDeclaredField((String) "MANAGER");
        ((Field) term49586).setAccessible(true);
        Object enum115 = ((Field) term49586).get((Object) null);
        Float term49500 = new Float(0.5840714F);
        Class<? extends Object> term49925 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term49924 = ((Class) term49925).getDeclaredField((String) "INTERRUPTED");
        ((Field) term49924).setAccessible(true);
        Object enum116 = ((Field) term49924).get((Object) null);
        term49412 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term49414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49418 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term49482 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term49485 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term49494 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term49529 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term49532 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term49412, term49412.getClass(), "id", 34470066);
        setIntField(term49414, term49414.getClass(), "year", 2022);
        setShortField(term49414, term49414.getClass(), "month", (short) 2);
        setShortField(term49414, term49414.getClass(), "day", (short) 25);
        setField(term49412, term49412.getClass(), "freezeDate", term49414);
        setIntField(term49418, term49418.getClass(), "id", 2058711405);
        setField(term49418, term49418.getClass(), "firstName", "XfRABIFVEp");
        setField(term49418, term49418.getClass(), "middleName", "MHGKyEnwKc");
        setField(term49418, term49418.getClass(), "lastName", "ShIELyuULw");
        setField(term49418, term49418.getClass(), "email", "IpQuOGMgmj");
        setField(term49418, term49418.getClass(), "passwordHash", "pJbnHTYrxn");
        setIntField(term49418, term49418.getClass(), "positionId", 1743683601);
        setBooleanField(term49418, term49418.getClass(), "isArchived", false);
        setIntField(term49482, term49482.getClass(), "nanos", 459000000);
        setLongField(term49482, term49482.getClass(), "fastTime", 1563492465000L);
        setField(term49482, term49482.getClass(), "cdate", null);
        setField(term49418, term49418.getClass(), "createdDate", term49482);
        setIntField(term49485, term49485.getClass(), "nanos", 958000000);
        setLongField(term49485, term49485.getClass(), "fastTime", 1416715623000L);
        setField(term49485, term49485.getClass(), "cdate", null);
        setField(term49418, term49418.getClass(), "lastModifiedDate", term49485);
        setField(term49418, term49418.getClass(), "employeeRoles", term49488);
        setIntField(term49494, term49494.getClass(), "employeeId", -945116798);
        setIntField(term49494, term49494.getClass(), "projectId", 1593461795);
        setField(term49494, term49494.getClass(), "projectRoleId", enum115);
        setField(term49494, term49494.getClass(), "externalRate", term49500);
        setField(term49418, term49418.getClass(), "employeeProjectRole", term49494);
        setField(term49412, term49412.getClass(), "employee", term49418);
        setField(term49412, term49412.getClass(), "status", enum116);
        setField(term49412, term49412.getClass(), "info", "iIRsCSYqXH");
        setIntField(term49529, term49529.getClass(), "nanos", 723000000);
        setLongField(term49529, term49529.getClass(), "fastTime", 1650003253000L);
        setField(term49529, term49529.getClass(), "cdate", null);
        setField(term49412, term49412.getClass(), "createdDate", term49529);
        setIntField(term49532, term49532.getClass(), "nanos", 922000000);
        setLongField(term49532, term49532.getClass(), "fastTime", 1537210286000L);
        setField(term49532, term49532.getClass(), "cdate", null);
        setField(term49412, term49412.getClass(), "lastModifiedDate", term49532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInfo", argTypes, term49412, args);
    }

};


