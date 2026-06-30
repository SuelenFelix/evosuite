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

public class NoticeData_setDate_174449032823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41716;
     Object term41830;

    public NoticeData_setDate_174449032823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41718 = new Integer(-2095575670);
        Integer term41733 = new Integer(1225272962);
        Class<? extends Object> term41865 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term41864 = ((Class) term41865).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term41864).setAccessible(true);
        Object enum101 =  ((Field) term41864).get((Object) null);
        Class<? extends Object> term42247 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term42246 = ((Class) term42247).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term42246).setAccessible(true);
        Object enum102 =  ((Field) term42246).get((Object) null);
        Class<? extends Object> term42599 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term42598 = ((Class) term42599).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term42598).setAccessible(true);
        Object enum103 =  ((Field) term42598).get((Object) null);
        ArrayList term41759 = new ArrayList();
        ((ArrayList) term41759).add(enum101);
        ((ArrayList) term41759).add(enum102);
        ((ArrayList) term41759).add(enum101);
        ((ArrayList) term41759).add(enum102);
        ((ArrayList) term41759).add(enum103);
        ((ArrayList) term41759).add(enum101);
        Class<? extends Object> term42960 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term42959 = ((Class) term42960).getDeclaredField((String) "MANAGER");
        ((Field) term42959).setAccessible(true);
        Object enum104 = ((Field) term42959).get((Object) null);
        Long term41781 = new Long(-4502405999831680926L);
        HashMap term41804 = new HashMap();
        term41716 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term41717 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term41732 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term41780 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term41795 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term41796 = newInstance(Class.forName("java.util.Date"));
        Object term41798 = newInstance(Class.forName("java.util.Date"));
        Object term41800 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term41814 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41717, term41717.getClass(), "id", term41718);
        setField(term41717, term41717.getClass(), "name", "sQvGcVjdEx");
        setField(term41716, term41716.getClass(), "project", term41717);
        setField(term41732, term41732.getClass(), "id", term41733);
        setField(term41732, term41732.getClass(), "firstName", "rLHAoqXgPh");
        setField(term41732, term41732.getClass(), "lastName", "zUlRdimJtU");
        setField(term41732, term41732.getClass(), "roles", term41759);
        setField(term41732, term41732.getClass(), "projectRole", enum104);
        setField(term41716, term41716.getClass(), "employee", term41732);
        setField(term41780, term41780.getClass(), "id", term41781);
        setField(term41780, term41780.getClass(), "name", "vwbEQQNQrx");
        setField(term41716, term41716.getClass(), "task", term41780);
        setLongField(term41796, term41796.getClass(), "fastTime", 1802995433545L);
        setField(term41796, term41796.getClass(), "cdate", null);
        setField(term41795, term41795.getClass(), "startOfPeriodHasRejection", term41796);
        setLongField(term41798, term41798.getClass(), "fastTime", 1843214817357L);
        setField(term41798, term41798.getClass(), "cdate", null);
        setField(term41795, term41795.getClass(), "endOfPeriodHasRejection", term41798);
        setField(term41716, term41716.getClass(), "unit", term41795);
        setIntField(term41800, term41800.getClass(), "projectId", -244121226);
        setLongField(term41800, term41800.getClass(), "numberEmployees", 2120084523938730454L);
        setDoubleField(term41800, term41800.getClass(), "sumHours", 0.11493000848982304);
        setField(term41716, term41716.getClass(), "employeesHours", term41800);
        setField(term41716, term41716.getClass(), "changes", term41804);
        setIntField(term41814, term41814.getClass(), "year", 2015);
        setShortField(term41814, term41814.getClass(), "month", (short) 7);
        setShortField(term41814, term41814.getClass(), "day", (short) 24);
        setField(term41716, term41716.getClass(), "date", term41814);
        setField(term41716, term41716.getClass(), "error", "cudZvLMQon");
        term41830 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term41830, term41830.getClass(), "year", 2022);
        setShortField(term41830, term41830.getClass(), "month", (short) 11);
        setShortField(term41830, term41830.getClass(), "day", (short) 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term41830;
        callMethod(klass, "setDate", argTypes, term41716, args);
    }

};


