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

public class FreezeRecord_getCreatedDate_18439698109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50319;

    public FreezeRecord_getCreatedDate_18439698109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term50396 = new HashMap();
        Set<Object> term50490 =  ((Map) term50396).keySet();
        HashSet term50395 = new HashSet((Collection<? extends Object>) term50490);
        Class<? extends Object> term50492 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term50491 = ((Class) term50492).getDeclaredField((String) "MANAGER");
        ((Field) term50491).setAccessible(true);
        Object enum117 = ((Field) term50491).get((Object) null);
        Float term50407 = new Float(0.478669F);
        Class<? extends Object> term50830 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term50829 = ((Class) term50830).getDeclaredField((String) "UN_FREEZE");
        ((Field) term50829).setAccessible(true);
        Object enum118 = ((Field) term50829).get((Object) null);
        term50319 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term50321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50325 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term50389 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term50392 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term50401 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term50434 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term50437 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term50319, term50319.getClass(), "id", 515182546);
        setIntField(term50321, term50321.getClass(), "year", 2017);
        setShortField(term50321, term50321.getClass(), "month", (short) 7);
        setShortField(term50321, term50321.getClass(), "day", (short) 22);
        setField(term50319, term50319.getClass(), "freezeDate", term50321);
        setIntField(term50325, term50325.getClass(), "id", -936895502);
        setField(term50325, term50325.getClass(), "firstName", "nghfqDXyCG");
        setField(term50325, term50325.getClass(), "middleName", "WBAOTqErtm");
        setField(term50325, term50325.getClass(), "lastName", "PqtVXXZMqK");
        setField(term50325, term50325.getClass(), "email", "rYbtIDVdnd");
        setField(term50325, term50325.getClass(), "passwordHash", "UKAReurpHG");
        setIntField(term50325, term50325.getClass(), "positionId", -129547140);
        setBooleanField(term50325, term50325.getClass(), "isArchived", false);
        setIntField(term50389, term50389.getClass(), "nanos", 395000000);
        setLongField(term50389, term50389.getClass(), "fastTime", 1793393689000L);
        setField(term50389, term50389.getClass(), "cdate", null);
        setField(term50325, term50325.getClass(), "createdDate", term50389);
        setIntField(term50392, term50392.getClass(), "nanos", 66000000);
        setLongField(term50392, term50392.getClass(), "fastTime", 1758346340000L);
        setField(term50392, term50392.getClass(), "cdate", null);
        setField(term50325, term50325.getClass(), "lastModifiedDate", term50392);
        setField(term50325, term50325.getClass(), "employeeRoles", term50395);
        setIntField(term50401, term50401.getClass(), "employeeId", 199287428);
        setIntField(term50401, term50401.getClass(), "projectId", -1195339592);
        setField(term50401, term50401.getClass(), "projectRoleId", enum117);
        setField(term50401, term50401.getClass(), "externalRate", term50407);
        setField(term50325, term50325.getClass(), "employeeProjectRole", term50401);
        setField(term50319, term50319.getClass(), "employee", term50325);
        setField(term50319, term50319.getClass(), "status", enum118);
        setField(term50319, term50319.getClass(), "info", "WVRMUmrljA");
        setIntField(term50434, term50434.getClass(), "nanos", 11000000);
        setLongField(term50434, term50434.getClass(), "fastTime", 1668055372000L);
        setField(term50434, term50434.getClass(), "cdate", null);
        setField(term50319, term50319.getClass(), "createdDate", term50434);
        setIntField(term50437, term50437.getClass(), "nanos", 410000000);
        setLongField(term50437, term50437.getClass(), "fastTime", 1677864935000L);
        setField(term50437, term50437.getClass(), "cdate", null);
        setField(term50319, term50319.getClass(), "lastModifiedDate", term50437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term50319, args);
    }

};


