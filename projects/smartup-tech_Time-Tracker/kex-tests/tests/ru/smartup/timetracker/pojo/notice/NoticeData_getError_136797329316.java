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

public class NoticeData_getError_136797329316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31424;

    public NoticeData_getError_136797329316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31426 = new Integer(-1968847291);
        Integer term31441 = new Integer(579005622);
        Class<? extends Object> term31569 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term31568 = ((Class) term31569).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term31568).setAccessible(true);
        Object enum76 =  ((Field) term31568).get((Object) null);
        Class<? extends Object> term31930 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term31929 = ((Class) term31930).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term31929).setAccessible(true);
        Object enum77 =  ((Field) term31929).get((Object) null);
        Class<? extends Object> term32312 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term32311 = ((Class) term32312).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term32311).setAccessible(true);
        Object enum78 =  ((Field) term32311).get((Object) null);
        ArrayList term31467 = new ArrayList();
        ((ArrayList) term31467).add(enum76);
        ((ArrayList) term31467).add(enum76);
        ((ArrayList) term31467).add(enum77);
        ((ArrayList) term31467).add(enum77);
        ((ArrayList) term31467).add(enum78);
        ((ArrayList) term31467).add(enum76);
        ((ArrayList) term31467).add(enum78);
        Class<? extends Object> term32673 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term32672 = ((Class) term32673).getDeclaredField((String) "MANAGER");
        ((Field) term32672).setAccessible(true);
        Object enum79 = ((Field) term32672).get((Object) null);
        Long term31489 = new Long(-4920224193275732920L);
        HashMap term31512 = new HashMap();
        term31424 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term31425 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term31440 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term31488 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term31503 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term31504 = newInstance(Class.forName("java.util.Date"));
        Object term31506 = newInstance(Class.forName("java.util.Date"));
        Object term31508 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term31522 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31425, term31425.getClass(), "id", term31426);
        setField(term31425, term31425.getClass(), "name", "dpNsDgfPso");
        setField(term31424, term31424.getClass(), "project", term31425);
        setField(term31440, term31440.getClass(), "id", term31441);
        setField(term31440, term31440.getClass(), "firstName", "hCWPJQKpdc");
        setField(term31440, term31440.getClass(), "lastName", "WzMEhMXkKx");
        setField(term31440, term31440.getClass(), "roles", term31467);
        setField(term31440, term31440.getClass(), "projectRole", enum79);
        setField(term31424, term31424.getClass(), "employee", term31440);
        setField(term31488, term31488.getClass(), "id", term31489);
        setField(term31488, term31488.getClass(), "name", "XOiDvlDhdc");
        setField(term31424, term31424.getClass(), "task", term31488);
        setLongField(term31504, term31504.getClass(), "fastTime", 1595517583842L);
        setField(term31504, term31504.getClass(), "cdate", null);
        setField(term31503, term31503.getClass(), "startOfPeriodHasRejection", term31504);
        setLongField(term31506, term31506.getClass(), "fastTime", 1464421789888L);
        setField(term31506, term31506.getClass(), "cdate", null);
        setField(term31503, term31503.getClass(), "endOfPeriodHasRejection", term31506);
        setField(term31424, term31424.getClass(), "unit", term31503);
        setIntField(term31508, term31508.getClass(), "projectId", -6029667);
        setLongField(term31508, term31508.getClass(), "numberEmployees", -2585684163342970173L);
        setDoubleField(term31508, term31508.getClass(), "sumHours", 0.8598297828918529);
        setField(term31424, term31424.getClass(), "employeesHours", term31508);
        setField(term31424, term31424.getClass(), "changes", term31512);
        setIntField(term31522, term31522.getClass(), "year", 2026);
        setShortField(term31522, term31522.getClass(), "month", (short) 12);
        setShortField(term31522, term31522.getClass(), "day", (short) 13);
        setField(term31424, term31424.getClass(), "date", term31522);
        setField(term31424, term31424.getClass(), "error", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term31424, args);
    }

};


