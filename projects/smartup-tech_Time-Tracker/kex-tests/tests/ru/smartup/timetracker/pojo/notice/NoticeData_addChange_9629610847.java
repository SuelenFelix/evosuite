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

public class NoticeData_addChange_9629610847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21519;
     Object term21645;

    public NoticeData_addChange_9629610847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21521 = new Integer(-1179120542);
        Integer term21536 = new Integer(-73683645);
        Class<? extends Object> term21679 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term21678 = ((Class) term21679).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term21678).setAccessible(true);
        Object enum52 =  ((Field) term21678).get((Object) null);
        Class<? extends Object> term22031 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term22030 = ((Class) term22031).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term22030).setAccessible(true);
        Object enum53 =  ((Field) term22030).get((Object) null);
        Class<? extends Object> term22413 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term22412 = ((Class) term22413).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term22412).setAccessible(true);
        Object enum54 =  ((Field) term22412).get((Object) null);
        ArrayList term21562 = new ArrayList();
        ((ArrayList) term21562).add(enum52);
        ((ArrayList) term21562).add(enum53);
        ((ArrayList) term21562).add(enum54);
        ((ArrayList) term21562).add(enum52);
        ((ArrayList) term21562).add(enum52);
        Class<? extends Object> term22795 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term22794 = ((Class) term22795).getDeclaredField((String) "MANAGER");
        ((Field) term22794).setAccessible(true);
        Object enum55 = ((Field) term22794).get((Object) null);
        Long term21584 = new Long(-8885298608300233488L);
        HashMap term21607 = new HashMap();
        term21519 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term21520 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term21535 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term21583 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term21598 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term21599 = newInstance(Class.forName("java.util.Date"));
        Object term21601 = newInstance(Class.forName("java.util.Date"));
        Object term21603 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term21617 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term21520, term21520.getClass(), "id", term21521);
        setField(term21520, term21520.getClass(), "name", "IgRJUzaCwW");
        setField(term21519, term21519.getClass(), "project", term21520);
        setField(term21535, term21535.getClass(), "id", term21536);
        setField(term21535, term21535.getClass(), "firstName", "JUmudUmaaV");
        setField(term21535, term21535.getClass(), "lastName", "KoyGrUJeJW");
        setField(term21535, term21535.getClass(), "roles", term21562);
        setField(term21535, term21535.getClass(), "projectRole", enum55);
        setField(term21519, term21519.getClass(), "employee", term21535);
        setField(term21583, term21583.getClass(), "id", term21584);
        setField(term21583, term21583.getClass(), "name", "HqBOwkVqjD");
        setField(term21519, term21519.getClass(), "task", term21583);
        setLongField(term21599, term21599.getClass(), "fastTime", 1538078916394L);
        setField(term21599, term21599.getClass(), "cdate", null);
        setField(term21598, term21598.getClass(), "startOfPeriodHasRejection", term21599);
        setLongField(term21601, term21601.getClass(), "fastTime", 1744090065937L);
        setField(term21601, term21601.getClass(), "cdate", null);
        setField(term21598, term21598.getClass(), "endOfPeriodHasRejection", term21601);
        setField(term21519, term21519.getClass(), "unit", term21598);
        setIntField(term21603, term21603.getClass(), "projectId", -883034806);
        setLongField(term21603, term21603.getClass(), "numberEmployees", 2535595959091595249L);
        setDoubleField(term21603, term21603.getClass(), "sumHours", 0.1374549299694151);
        setField(term21519, term21519.getClass(), "employeesHours", term21603);
        setField(term21519, term21519.getClass(), "changes", term21607);
        setIntField(term21617, term21617.getClass(), "year", 2021);
        setShortField(term21617, term21617.getClass(), "month", (short) 1);
        setShortField(term21617, term21617.getClass(), "day", (short) 18);
        setField(term21519, term21519.getClass(), "date", term21617);
        setField(term21519, term21519.getClass(), "error", "oVgzLbrsFr");
        term21645 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges"));
        Object term21646 = newInstance(Class.forName("java.lang.Object"));
        Object term21647 = newInstance(Class.forName("java.lang.Object"));
        setField(term21645, term21645.getClass(), "oldValue", term21646);
        setField(term21645, term21645.getClass(), "newValue", term21647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges");
        Object[] args = new Object[2];
        args[0] = "vQVyKLdtaz";
        args[1] = term21645;
        callMethod(klass, "addChange", argTypes, term21519, args);
    }

};


