package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Long;
import java.util.HashMap;

public class NoticeData_setError_94430487724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43317;

    public NoticeData_setError_94430487724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43319 = new Integer(1324040357);
        Integer term43334 = new Integer(-1588772968);
        Class<? extends Object> term43471 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term43470 = ((Class) term43471).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term43470).setAccessible(true);
        Object enum105 =  ((Field) term43470).get((Object) null);
        ArrayList term43360 = new ArrayList();
        ((ArrayList) term43360).add(enum105);
        ((ArrayList) term43360).add(enum105);
        Class<? extends Object> term43832 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term43831 = ((Class) term43832).getDeclaredField((String) "EMPLOYEE");
        ((Field) term43831).setAccessible(true);
        Object enum106 = ((Field) term43831).get((Object) null);
        Long term43379 = new Long(1967728129628047933L);
        HashMap term43402 = new HashMap();
        term43317 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term43318 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term43333 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term43378 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term43393 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term43394 = newInstance(Class.forName("java.util.Date"));
        Object term43396 = newInstance(Class.forName("java.util.Date"));
        Object term43398 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term43412 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term43318, term43318.getClass(), "id", term43319);
        setField(term43318, term43318.getClass(), "name", "lihXWlGDxk");
        setField(term43317, term43317.getClass(), "project", term43318);
        setField(term43333, term43333.getClass(), "id", term43334);
        setField(term43333, term43333.getClass(), "firstName", "JmcmxoGhIK");
        setField(term43333, term43333.getClass(), "lastName", "jXzmYyrnnT");
        setField(term43333, term43333.getClass(), "roles", term43360);
        setField(term43333, term43333.getClass(), "projectRole", enum106);
        setField(term43317, term43317.getClass(), "employee", term43333);
        setField(term43378, term43378.getClass(), "id", term43379);
        setField(term43378, term43378.getClass(), "name", "igCAtimmYB");
        setField(term43317, term43317.getClass(), "task", term43378);
        setLongField(term43394, term43394.getClass(), "fastTime", 1628695316832L);
        setField(term43394, term43394.getClass(), "cdate", null);
        setField(term43393, term43393.getClass(), "startOfPeriodHasRejection", term43394);
        setLongField(term43396, term43396.getClass(), "fastTime", 1393200035243L);
        setField(term43396, term43396.getClass(), "cdate", null);
        setField(term43393, term43393.getClass(), "endOfPeriodHasRejection", term43396);
        setField(term43317, term43317.getClass(), "unit", term43393);
        setIntField(term43398, term43398.getClass(), "projectId", -203030934);
        setLongField(term43398, term43398.getClass(), "numberEmployees", 6855071767938501807L);
        setDoubleField(term43398, term43398.getClass(), "sumHours", 0.37161417339133307);
        setField(term43317, term43317.getClass(), "employeesHours", term43398);
        setField(term43317, term43317.getClass(), "changes", term43402);
        setIntField(term43412, term43412.getClass(), "year", 2024);
        setShortField(term43412, term43412.getClass(), "month", (short) 8);
        setShortField(term43412, term43412.getClass(), "day", (short) 31);
        setField(term43317, term43317.getClass(), "date", term43412);
        setField(term43317, term43317.getClass(), "error", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        callMethod(klass, "setError", argTypes, term43317, args);
    }

};


