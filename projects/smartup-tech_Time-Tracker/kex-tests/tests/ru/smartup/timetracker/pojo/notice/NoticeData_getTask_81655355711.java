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

public class NoticeData_getTask_81655355711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24866;

    public NoticeData_getTask_81655355711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24868 = new Integer(-469968304);
        Integer term24883 = new Integer(-1145578966);
        Class<? extends Object> term25012 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term25011 = ((Class) term25012).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term25011).setAccessible(true);
        Object enum60 =  ((Field) term25011).get((Object) null);
        Class<? extends Object> term25364 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term25363 = ((Class) term25364).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term25363).setAccessible(true);
        Object enum61 =  ((Field) term25363).get((Object) null);
        Class<? extends Object> term25746 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term25745 = ((Class) term25746).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term25745).setAccessible(true);
        Object enum62 =  ((Field) term25745).get((Object) null);
        ArrayList term24909 = new ArrayList();
        ((ArrayList) term24909).add(enum60);
        ((ArrayList) term24909).add(enum61);
        ((ArrayList) term24909).add(enum62);
        ((ArrayList) term24909).add(enum62);
        ((ArrayList) term24909).add(enum60);
        ((ArrayList) term24909).add(enum60);
        ((ArrayList) term24909).add(enum61);
        ((ArrayList) term24909).add(enum61);
        Class<? extends Object> term26107 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term26106 = ((Class) term26107).getDeclaredField((String) "EMPLOYEE");
        ((Field) term26106).setAccessible(true);
        Object enum63 = ((Field) term26106).get((Object) null);
        Long term24932 = new Long(-5476826692763582090L);
        HashMap term24955 = new HashMap();
        term24866 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term24867 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term24882 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term24931 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term24946 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term24947 = newInstance(Class.forName("java.util.Date"));
        Object term24949 = newInstance(Class.forName("java.util.Date"));
        Object term24951 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term24965 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term24867, term24867.getClass(), "id", term24868);
        setField(term24867, term24867.getClass(), "name", "swZVeJAxjt");
        setField(term24866, term24866.getClass(), "project", term24867);
        setField(term24882, term24882.getClass(), "id", term24883);
        setField(term24882, term24882.getClass(), "firstName", "xOcJIiQQDu");
        setField(term24882, term24882.getClass(), "lastName", "GVizqqzXpy");
        setField(term24882, term24882.getClass(), "roles", term24909);
        setField(term24882, term24882.getClass(), "projectRole", enum63);
        setField(term24866, term24866.getClass(), "employee", term24882);
        setField(term24931, term24931.getClass(), "id", term24932);
        setField(term24931, term24931.getClass(), "name", "JqXGgAhZPl");
        setField(term24866, term24866.getClass(), "task", term24931);
        setLongField(term24947, term24947.getClass(), "fastTime", 1329640267573L);
        setField(term24947, term24947.getClass(), "cdate", null);
        setField(term24946, term24946.getClass(), "startOfPeriodHasRejection", term24947);
        setLongField(term24949, term24949.getClass(), "fastTime", 1334853104718L);
        setField(term24949, term24949.getClass(), "cdate", null);
        setField(term24946, term24946.getClass(), "endOfPeriodHasRejection", term24949);
        setField(term24866, term24866.getClass(), "unit", term24946);
        setIntField(term24951, term24951.getClass(), "projectId", -1685132342);
        setLongField(term24951, term24951.getClass(), "numberEmployees", -316468845751588286L);
        setDoubleField(term24951, term24951.getClass(), "sumHours", 0.9828442029246764);
        setField(term24866, term24866.getClass(), "employeesHours", term24951);
        setField(term24866, term24866.getClass(), "changes", term24955);
        setIntField(term24965, term24965.getClass(), "year", 2018);
        setShortField(term24965, term24965.getClass(), "month", (short) 1);
        setShortField(term24965, term24965.getClass(), "day", (short) 13);
        setField(term24866, term24866.getClass(), "date", term24965);
        setField(term24866, term24866.getClass(), "error", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTask", argTypes, term24866, args);
    }

};


