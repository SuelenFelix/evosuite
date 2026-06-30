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

public class NoticeData_getUnit_191922793512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26467;

    public NoticeData_getUnit_191922793512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26469 = new Integer(679763016);
        Integer term26484 = new Integer(1962444399);
        Class<? extends Object> term26613 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term26612 = ((Class) term26613).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term26612).setAccessible(true);
        Object enum64 =  ((Field) term26612).get((Object) null);
        Class<? extends Object> term26995 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term26994 = ((Class) term26995).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term26994).setAccessible(true);
        Object enum65 =  ((Field) term26994).get((Object) null);
        Class<? extends Object> term27347 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term27346 = ((Class) term27347).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term27346).setAccessible(true);
        Object enum66 =  ((Field) term27346).get((Object) null);
        ArrayList term26510 = new ArrayList();
        ((ArrayList) term26510).add(enum64);
        ((ArrayList) term26510).add(enum65);
        ((ArrayList) term26510).add(enum65);
        ((ArrayList) term26510).add(enum66);
        ((ArrayList) term26510).add(enum64);
        ((ArrayList) term26510).add(enum66);
        ((ArrayList) term26510).add(enum66);
        ((ArrayList) term26510).add(enum65);
        Class<? extends Object> term27699 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term27698 = ((Class) term27699).getDeclaredField((String) "EMPLOYEE");
        ((Field) term27698).setAccessible(true);
        Object enum67 = ((Field) term27698).get((Object) null);
        Long term26533 = new Long(-872011222785455006L);
        HashMap term26556 = new HashMap();
        term26467 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term26468 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term26483 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term26532 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term26547 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term26548 = newInstance(Class.forName("java.util.Date"));
        Object term26550 = newInstance(Class.forName("java.util.Date"));
        Object term26552 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term26566 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term26468, term26468.getClass(), "id", term26469);
        setField(term26468, term26468.getClass(), "name", "XqgfKFvPSD");
        setField(term26467, term26467.getClass(), "project", term26468);
        setField(term26483, term26483.getClass(), "id", term26484);
        setField(term26483, term26483.getClass(), "firstName", "JiVRgTZvKc");
        setField(term26483, term26483.getClass(), "lastName", "XPKmummaqg");
        setField(term26483, term26483.getClass(), "roles", term26510);
        setField(term26483, term26483.getClass(), "projectRole", enum67);
        setField(term26467, term26467.getClass(), "employee", term26483);
        setField(term26532, term26532.getClass(), "id", term26533);
        setField(term26532, term26532.getClass(), "name", "BKLfkLiZTH");
        setField(term26467, term26467.getClass(), "task", term26532);
        setLongField(term26548, term26548.getClass(), "fastTime", 1496859828764L);
        setField(term26548, term26548.getClass(), "cdate", null);
        setField(term26547, term26547.getClass(), "startOfPeriodHasRejection", term26548);
        setLongField(term26550, term26550.getClass(), "fastTime", 1691868468367L);
        setField(term26550, term26550.getClass(), "cdate", null);
        setField(term26547, term26547.getClass(), "endOfPeriodHasRejection", term26550);
        setField(term26467, term26467.getClass(), "unit", term26547);
        setIntField(term26552, term26552.getClass(), "projectId", -1456670397);
        setLongField(term26552, term26552.getClass(), "numberEmployees", 5127676408959197577L);
        setDoubleField(term26552, term26552.getClass(), "sumHours", 0.2779719046761513);
        setField(term26467, term26467.getClass(), "employeesHours", term26552);
        setField(term26467, term26467.getClass(), "changes", term26556);
        setIntField(term26566, term26566.getClass(), "year", 2015);
        setShortField(term26566, term26566.getClass(), "month", (short) 4);
        setShortField(term26566, term26566.getClass(), "day", (short) 14);
        setField(term26467, term26467.getClass(), "date", term26566);
        setField(term26467, term26467.getClass(), "error", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnit", argTypes, term26467, args);
    }

};


