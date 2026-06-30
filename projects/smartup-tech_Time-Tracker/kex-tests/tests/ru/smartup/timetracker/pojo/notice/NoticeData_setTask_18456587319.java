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

public class NoticeData_setTask_18456587319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35588;
     Object term35703;

    public NoticeData_setTask_18456587319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35590 = new Integer(292681826);
        Integer term35605 = new Integer(458147407);
        Class<? extends Object> term35749 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term35748 = ((Class) term35749).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term35748).setAccessible(true);
        Object enum86 =  ((Field) term35748).get((Object) null);
        Class<? extends Object> term36110 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term36109 = ((Class) term36110).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term36109).setAccessible(true);
        Object enum87 =  ((Field) term36109).get((Object) null);
        Class<? extends Object> term36471 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term36470 = ((Class) term36471).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term36470).setAccessible(true);
        Object enum88 =  ((Field) term36470).get((Object) null);
        ArrayList term35631 = new ArrayList();
        ((ArrayList) term35631).add(enum86);
        ((ArrayList) term35631).add(enum87);
        ((ArrayList) term35631).add(enum88);
        ((ArrayList) term35631).add(enum86);
        ((ArrayList) term35631).add(enum87);
        ((ArrayList) term35631).add(enum88);
        ((ArrayList) term35631).add(enum87);
        ((ArrayList) term35631).add(enum87);
        ((ArrayList) term35631).add(enum88);
        Class<? extends Object> term36853 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term36852 = ((Class) term36853).getDeclaredField((String) "EMPLOYEE");
        ((Field) term36852).setAccessible(true);
        Object enum89 = ((Field) term36852).get((Object) null);
        Long term35654 = new Long(8059786003080744426L);
        HashMap term35677 = new HashMap();
        term35588 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term35589 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term35604 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term35653 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term35668 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term35669 = newInstance(Class.forName("java.util.Date"));
        Object term35671 = newInstance(Class.forName("java.util.Date"));
        Object term35673 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term35687 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term35589, term35589.getClass(), "id", term35590);
        setField(term35589, term35589.getClass(), "name", "yVMkkQhvmN");
        setField(term35588, term35588.getClass(), "project", term35589);
        setField(term35604, term35604.getClass(), "id", term35605);
        setField(term35604, term35604.getClass(), "firstName", "mvrkADEgpp");
        setField(term35604, term35604.getClass(), "lastName", "pXOkjyeIRb");
        setField(term35604, term35604.getClass(), "roles", term35631);
        setField(term35604, term35604.getClass(), "projectRole", enum89);
        setField(term35588, term35588.getClass(), "employee", term35604);
        setField(term35653, term35653.getClass(), "id", term35654);
        setField(term35653, term35653.getClass(), "name", "GgZWSjxjyE");
        setField(term35588, term35588.getClass(), "task", term35653);
        setLongField(term35669, term35669.getClass(), "fastTime", 1426018874434L);
        setField(term35669, term35669.getClass(), "cdate", null);
        setField(term35668, term35668.getClass(), "startOfPeriodHasRejection", term35669);
        setLongField(term35671, term35671.getClass(), "fastTime", 1633004775487L);
        setField(term35671, term35671.getClass(), "cdate", null);
        setField(term35668, term35668.getClass(), "endOfPeriodHasRejection", term35671);
        setField(term35588, term35588.getClass(), "unit", term35668);
        setIntField(term35673, term35673.getClass(), "projectId", -1007160944);
        setLongField(term35673, term35673.getClass(), "numberEmployees", 2486810210675247493L);
        setDoubleField(term35673, term35673.getClass(), "sumHours", 0.13481025392611334);
        setField(term35588, term35588.getClass(), "employeesHours", term35673);
        setField(term35588, term35588.getClass(), "changes", term35677);
        setIntField(term35687, term35687.getClass(), "year", 2012);
        setShortField(term35687, term35687.getClass(), "month", (short) 10);
        setShortField(term35687, term35687.getClass(), "day", (short) 1);
        setField(term35588, term35588.getClass(), "date", term35687);
        setField(term35588, term35588.getClass(), "error", "UfQtPRyWRC");
        Long term35704 = new Long(-4365849114644724155L);
        term35703 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        setField(term35703, term35703.getClass(), "id", term35704);
        setField(term35703, term35703.getClass(), "name", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask");
        Object[] args = new Object[1];
        args[0] = term35703;
        callMethod(klass, "setTask", argTypes, term35588, args);
    }

};


