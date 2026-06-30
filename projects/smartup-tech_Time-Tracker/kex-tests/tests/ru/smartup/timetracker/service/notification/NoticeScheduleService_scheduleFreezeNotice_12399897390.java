package ru.smartup.timetracker.service.notification;

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
import static ru.smartup.timetracker.service.notification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class NoticeScheduleService_scheduleFreezeNotice_12399897390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NoticeScheduleService_scheduleFreezeNotice_12399897390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term78 = new HashMap();
        Set<Object> term172 =  ((Map) term78).keySet();
        HashSet term77 = new HashSet((Collection<? extends Object>) term172);
        Class<? extends Object> term197 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term196 = ((Class) term197).getDeclaredField((String) "MANAGER");
        ((Field) term196).setAccessible(true);
        Object enum0 = ((Field) term196).get((Object) null);
        Float term89 = new Float(0.13238746F);
        Class<? extends Object> term626 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term625 = ((Class) term626).getDeclaredField((String) "UN_FREEZE");
        ((Field) term625).setAccessible(true);
        Object enum1 = ((Field) term625).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term3 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term71 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term74 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term116 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term119 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setIntField(term3, term3.getClass(), "year", 2012);
        setShortField(term3, term3.getClass(), "month", (short) 8);
        setShortField(term3, term3.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "freezeDate", term3);
        setIntField(term7, term7.getClass(), "id", 1162663216);
        setField(term7, term7.getClass(), "firstName", "PAEBtnZtTD");
        setField(term7, term7.getClass(), "middleName", "sjlJAEtRrb");
        setField(term7, term7.getClass(), "lastName", "MuLcgQHgqz");
        setField(term7, term7.getClass(), "email", "xxtlPwDYFs");
        setField(term7, term7.getClass(), "passwordHash", "jJCZpVmanW");
        setIntField(term7, term7.getClass(), "positionId", 1484323161);
        setBooleanField(term7, term7.getClass(), "isArchived", false);
        setIntField(term71, term71.getClass(), "nanos", 244000000);
        setLongField(term71, term71.getClass(), "fastTime", 1345860612000L);
        setField(term71, term71.getClass(), "cdate", null);
        setField(term7, term7.getClass(), "createdDate", term71);
        setIntField(term74, term74.getClass(), "nanos", 369000000);
        setLongField(term74, term74.getClass(), "fastTime", 1480427551000L);
        setField(term74, term74.getClass(), "cdate", null);
        setField(term7, term7.getClass(), "lastModifiedDate", term74);
        setField(term7, term7.getClass(), "employeeRoles", term77);
        setIntField(term83, term83.getClass(), "employeeId", 391863371);
        setIntField(term83, term83.getClass(), "projectId", -1922583790);
        setField(term83, term83.getClass(), "projectRoleId", enum0);
        setField(term83, term83.getClass(), "externalRate", term89);
        setField(term7, term7.getClass(), "employeeProjectRole", term83);
        setField(term1, term1.getClass(), "employee", term7);
        setField(term1, term1.getClass(), "status", enum1);
        setField(term1, term1.getClass(), "info", "EGtDIRbSSb");
        setIntField(term116, term116.getClass(), "nanos", 830000000);
        setLongField(term116, term116.getClass(), "fastTime", 1610929382000L);
        setField(term116, term116.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createdDate", term116);
        setIntField(term119, term119.getClass(), "nanos", 837000000);
        setLongField(term119, term119.getClass(), "fastTime", 1606034835000L);
        setField(term119, term119.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "lastModifiedDate", term119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.NoticeScheduleService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "scheduleFreezeNotice", argTypes, null, args);
    }

};


