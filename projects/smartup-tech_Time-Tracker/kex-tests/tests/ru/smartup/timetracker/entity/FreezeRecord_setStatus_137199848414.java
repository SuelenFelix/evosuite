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

public class FreezeRecord_setStatus_137199848414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55314;
     Object enum130;

    public FreezeRecord_setStatus_137199848414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55391 = new HashMap();
        Set<Object> term55502 =  ((Map) term55391).keySet();
        HashSet term55390 = new HashSet((Collection<? extends Object>) term55502);
        Class<? extends Object> term55504 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term55503 = ((Class) term55504).getDeclaredField((String) "EMPLOYEE");
        ((Field) term55503).setAccessible(true);
        Object enum128 = ((Field) term55503).get((Object) null);
        Float term55402 = new Float(0.30926234F);
        Class<? extends Object> term55845 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term55844 = ((Class) term55845).getDeclaredField((String) "INTERRUPTED");
        ((Field) term55844).setAccessible(true);
        Object enum129 = ((Field) term55844).get((Object) null);
        term55314 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term55316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55320 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term55384 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term55387 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term55396 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term55431 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term55434 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term55314, term55314.getClass(), "id", 1768204942);
        setIntField(term55316, term55316.getClass(), "year", 2029);
        setShortField(term55316, term55316.getClass(), "month", (short) 1);
        setShortField(term55316, term55316.getClass(), "day", (short) 20);
        setField(term55314, term55314.getClass(), "freezeDate", term55316);
        setIntField(term55320, term55320.getClass(), "id", 1252951645);
        setField(term55320, term55320.getClass(), "firstName", "pXdglvyrQe");
        setField(term55320, term55320.getClass(), "middleName", "OcfNzHYdki");
        setField(term55320, term55320.getClass(), "lastName", "uPuCVuZYOI");
        setField(term55320, term55320.getClass(), "email", "TweMFhxNdj");
        setField(term55320, term55320.getClass(), "passwordHash", "NBrvVzvQHe");
        setIntField(term55320, term55320.getClass(), "positionId", 574481092);
        setBooleanField(term55320, term55320.getClass(), "isArchived", false);
        setIntField(term55384, term55384.getClass(), "nanos", 168000000);
        setLongField(term55384, term55384.getClass(), "fastTime", 1615568384000L);
        setField(term55384, term55384.getClass(), "cdate", null);
        setField(term55320, term55320.getClass(), "createdDate", term55384);
        setIntField(term55387, term55387.getClass(), "nanos", 759000000);
        setLongField(term55387, term55387.getClass(), "fastTime", 1440872174000L);
        setField(term55387, term55387.getClass(), "cdate", null);
        setField(term55320, term55320.getClass(), "lastModifiedDate", term55387);
        setField(term55320, term55320.getClass(), "employeeRoles", term55390);
        setIntField(term55396, term55396.getClass(), "employeeId", -310528004);
        setIntField(term55396, term55396.getClass(), "projectId", -634976996);
        setField(term55396, term55396.getClass(), "projectRoleId", enum128);
        setField(term55396, term55396.getClass(), "externalRate", term55402);
        setField(term55320, term55320.getClass(), "employeeProjectRole", term55396);
        setField(term55314, term55314.getClass(), "employee", term55320);
        setField(term55314, term55314.getClass(), "status", enum129);
        setField(term55314, term55314.getClass(), "info", "FjOiNAfBOc");
        setIntField(term55431, term55431.getClass(), "nanos", 871000000);
        setLongField(term55431, term55431.getClass(), "fastTime", 1603603429000L);
        setField(term55431, term55431.getClass(), "cdate", null);
        setField(term55314, term55314.getClass(), "createdDate", term55431);
        setIntField(term55434, term55434.getClass(), "nanos", 230000000);
        setLongField(term55434, term55434.getClass(), "fastTime", 1861010348000L);
        setField(term55434, term55434.getClass(), "cdate", null);
        setField(term55314, term55314.getClass(), "lastModifiedDate", term55434);
        Class<? extends Object> term56240 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term56239 = ((Class) term56240).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term56239).setAccessible(true);
        enum130 = ((Field) term56239).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Object[] args = new Object[1];
        args[0] = enum130;
        callMethod(klass, "setStatus", argTypes, term55314, args);
    }

};


