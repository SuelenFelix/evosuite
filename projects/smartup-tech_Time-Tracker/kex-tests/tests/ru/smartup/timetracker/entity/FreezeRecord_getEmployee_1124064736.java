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

public class FreezeRecord_getEmployee_1124064736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47592;

    public FreezeRecord_getEmployee_1124064736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47669 = new HashMap();
        Set<Object> term47765 =  ((Map) term47669).keySet();
        HashSet term47668 = new HashSet((Collection<? extends Object>) term47765);
        Class<? extends Object> term47767 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term47766 = ((Class) term47767).getDeclaredField((String) "EMPLOYEE");
        ((Field) term47766).setAccessible(true);
        Object enum111 = ((Field) term47766).get((Object) null);
        Float term47680 = new Float(0.38000882F);
        Class<? extends Object> term48108 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term48107 = ((Class) term48108).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term48107).setAccessible(true);
        Object enum112 = ((Field) term48107).get((Object) null);
        term47592 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term47594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47598 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term47662 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term47665 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term47674 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term47709 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term47712 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term47592, term47592.getClass(), "id", 1935707624);
        setIntField(term47594, term47594.getClass(), "year", 2015);
        setShortField(term47594, term47594.getClass(), "month", (short) 4);
        setShortField(term47594, term47594.getClass(), "day", (short) 14);
        setField(term47592, term47592.getClass(), "freezeDate", term47594);
        setIntField(term47598, term47598.getClass(), "id", 1507074215);
        setField(term47598, term47598.getClass(), "firstName", "wKWbJssZuG");
        setField(term47598, term47598.getClass(), "middleName", "NzBMMhkhpT");
        setField(term47598, term47598.getClass(), "lastName", "qCpEbQDHdF");
        setField(term47598, term47598.getClass(), "email", "AHbZyFOmlo");
        setField(term47598, term47598.getClass(), "passwordHash", "TwfWVQGiIj");
        setIntField(term47598, term47598.getClass(), "positionId", -282881827);
        setBooleanField(term47598, term47598.getClass(), "isArchived", false);
        setIntField(term47662, term47662.getClass(), "nanos", 222000000);
        setLongField(term47662, term47662.getClass(), "fastTime", 1816268547000L);
        setField(term47662, term47662.getClass(), "cdate", null);
        setField(term47598, term47598.getClass(), "createdDate", term47662);
        setIntField(term47665, term47665.getClass(), "nanos", 974000000);
        setLongField(term47665, term47665.getClass(), "fastTime", 1267369425000L);
        setField(term47665, term47665.getClass(), "cdate", null);
        setField(term47598, term47598.getClass(), "lastModifiedDate", term47665);
        setField(term47598, term47598.getClass(), "employeeRoles", term47668);
        setIntField(term47674, term47674.getClass(), "employeeId", -1183353915);
        setIntField(term47674, term47674.getClass(), "projectId", -420030135);
        setField(term47674, term47674.getClass(), "projectRoleId", enum111);
        setField(term47674, term47674.getClass(), "externalRate", term47680);
        setField(term47598, term47598.getClass(), "employeeProjectRole", term47674);
        setField(term47592, term47592.getClass(), "employee", term47598);
        setField(term47592, term47592.getClass(), "status", enum112);
        setField(term47592, term47592.getClass(), "info", "gUvcueTURF");
        setIntField(term47709, term47709.getClass(), "nanos", 568000000);
        setLongField(term47709, term47709.getClass(), "fastTime", 1518540971000L);
        setField(term47709, term47709.getClass(), "cdate", null);
        setField(term47592, term47592.getClass(), "createdDate", term47709);
        setIntField(term47712, term47712.getClass(), "nanos", 25000000);
        setLongField(term47712, term47712.getClass(), "fastTime", 1496465639000L);
        setField(term47712, term47712.getClass(), "cdate", null);
        setField(term47592, term47592.getClass(), "lastModifiedDate", term47712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployee", argTypes, term47592, args);
    }

};


