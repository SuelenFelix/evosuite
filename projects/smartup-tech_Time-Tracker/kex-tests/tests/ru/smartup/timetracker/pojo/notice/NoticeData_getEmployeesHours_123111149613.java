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

public class NoticeData_getEmployeesHours_123111149613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28059;

    public NoticeData_getEmployeesHours_123111149613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28061 = new Integer(767834723);
        Integer term28076 = new Integer(-602026508);
        Class<? extends Object> term28203 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term28202 = ((Class) term28203).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term28202).setAccessible(true);
        Object enum68 =  ((Field) term28202).get((Object) null);
        Class<? extends Object> term28585 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term28584 = ((Class) term28585).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term28584).setAccessible(true);
        Object enum69 =  ((Field) term28584).get((Object) null);
        ArrayList term28102 = new ArrayList();
        ((ArrayList) term28102).add(enum68);
        ((ArrayList) term28102).add(enum69);
        ((ArrayList) term28102).add(enum68);
        ((ArrayList) term28102).add(enum68);
        Class<? extends Object> term28937 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term28936 = ((Class) term28937).getDeclaredField((String) "EMPLOYEE");
        ((Field) term28936).setAccessible(true);
        Object enum70 = ((Field) term28936).get((Object) null);
        Long term28123 = new Long(-316468845751588286L);
        HashMap term28146 = new HashMap();
        term28059 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term28060 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term28075 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term28122 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term28137 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term28138 = newInstance(Class.forName("java.util.Date"));
        Object term28140 = newInstance(Class.forName("java.util.Date"));
        Object term28142 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term28156 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term28060, term28060.getClass(), "id", term28061);
        setField(term28060, term28060.getClass(), "name", "AWRooQKkdW");
        setField(term28059, term28059.getClass(), "project", term28060);
        setField(term28075, term28075.getClass(), "id", term28076);
        setField(term28075, term28075.getClass(), "firstName", "vjxIhXHxGR");
        setField(term28075, term28075.getClass(), "lastName", "QXzGXbEXMu");
        setField(term28075, term28075.getClass(), "roles", term28102);
        setField(term28075, term28075.getClass(), "projectRole", enum70);
        setField(term28059, term28059.getClass(), "employee", term28075);
        setField(term28122, term28122.getClass(), "id", term28123);
        setField(term28122, term28122.getClass(), "name", "qxSDVejjiY");
        setField(term28059, term28059.getClass(), "task", term28122);
        setLongField(term28138, term28138.getClass(), "fastTime", 1442370534632L);
        setField(term28138, term28138.getClass(), "cdate", null);
        setField(term28137, term28137.getClass(), "startOfPeriodHasRejection", term28138);
        setLongField(term28140, term28140.getClass(), "fastTime", 1659994192918L);
        setField(term28140, term28140.getClass(), "cdate", null);
        setField(term28137, term28137.getClass(), "endOfPeriodHasRejection", term28140);
        setField(term28059, term28059.getClass(), "unit", term28137);
        setIntField(term28142, term28142.getClass(), "projectId", 1622346318);
        setLongField(term28142, term28142.getClass(), "numberEmployees", -6573104506744284592L);
        setDoubleField(term28142, term28142.getClass(), "sumHours", 0.6436713023569729);
        setField(term28059, term28059.getClass(), "employeesHours", term28142);
        setField(term28059, term28059.getClass(), "changes", term28146);
        setIntField(term28156, term28156.getClass(), "year", 2017);
        setShortField(term28156, term28156.getClass(), "month", (short) 5);
        setShortField(term28156, term28156.getClass(), "day", (short) 21);
        setField(term28059, term28059.getClass(), "date", term28156);
        setField(term28059, term28059.getClass(), "error", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeesHours", argTypes, term28059, args);
    }

};


