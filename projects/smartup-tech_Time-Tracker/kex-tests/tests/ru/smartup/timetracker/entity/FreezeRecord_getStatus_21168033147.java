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

public class FreezeRecord_getStatus_21168033147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48502;

    public FreezeRecord_getStatus_21168033147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48579 = new HashMap();
        Set<Object> term48675 =  ((Map) term48579).keySet();
        HashSet term48578 = new HashSet((Collection<? extends Object>) term48675);
        Class<? extends Object> term48677 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term48676 = ((Class) term48677).getDeclaredField((String) "EMPLOYEE");
        ((Field) term48676).setAccessible(true);
        Object enum113 = ((Field) term48676).get((Object) null);
        Float term48590 = new Float(0.10577053F);
        Class<? extends Object> term49018 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term49017 = ((Class) term49018).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term49017).setAccessible(true);
        Object enum114 = ((Field) term49017).get((Object) null);
        term48502 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term48504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48508 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term48572 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term48575 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term48584 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term48619 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term48622 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term48502, term48502.getClass(), "id", 267763294);
        setIntField(term48504, term48504.getClass(), "year", 2017);
        setShortField(term48504, term48504.getClass(), "month", (short) 5);
        setShortField(term48504, term48504.getClass(), "day", (short) 21);
        setField(term48502, term48502.getClass(), "freezeDate", term48504);
        setIntField(term48508, term48508.getClass(), "id", -1497710478);
        setField(term48508, term48508.getClass(), "firstName", "EwQBhZjCIT");
        setField(term48508, term48508.getClass(), "middleName", "aSkmSwTnEw");
        setField(term48508, term48508.getClass(), "lastName", "xvkbvaEGYd");
        setField(term48508, term48508.getClass(), "email", "HBGNxdNURv");
        setField(term48508, term48508.getClass(), "passwordHash", "mfCpTPPQQm");
        setIntField(term48508, term48508.getClass(), "positionId", 49950830);
        setBooleanField(term48508, term48508.getClass(), "isArchived", true);
        setIntField(term48572, term48572.getClass(), "nanos", 674000000);
        setLongField(term48572, term48572.getClass(), "fastTime", 1755777777000L);
        setField(term48572, term48572.getClass(), "cdate", null);
        setField(term48508, term48508.getClass(), "createdDate", term48572);
        setIntField(term48575, term48575.getClass(), "nanos", 937000000);
        setLongField(term48575, term48575.getClass(), "fastTime", 1291589597000L);
        setField(term48575, term48575.getClass(), "cdate", null);
        setField(term48508, term48508.getClass(), "lastModifiedDate", term48575);
        setField(term48508, term48508.getClass(), "employeeRoles", term48578);
        setIntField(term48584, term48584.getClass(), "employeeId", -525257914);
        setIntField(term48584, term48584.getClass(), "projectId", 147209682);
        setField(term48584, term48584.getClass(), "projectRoleId", enum113);
        setField(term48584, term48584.getClass(), "externalRate", term48590);
        setField(term48508, term48508.getClass(), "employeeProjectRole", term48584);
        setField(term48502, term48502.getClass(), "employee", term48508);
        setField(term48502, term48502.getClass(), "status", enum114);
        setField(term48502, term48502.getClass(), "info", "OcJCIDNIXA");
        setIntField(term48619, term48619.getClass(), "nanos", 204000000);
        setLongField(term48619, term48619.getClass(), "fastTime", 1838140126000L);
        setField(term48619, term48619.getClass(), "cdate", null);
        setField(term48502, term48502.getClass(), "createdDate", term48619);
        setIntField(term48622, term48622.getClass(), "nanos", 701000000);
        setLongField(term48622, term48622.getClass(), "fastTime", 1518774990000L);
        setField(term48622, term48622.getClass(), "cdate", null);
        setField(term48502, term48502.getClass(), "lastModifiedDate", term48622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term48502, args);
    }

};


