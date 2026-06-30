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

public class NoticeData_toString_70992863328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48269;

    public NoticeData_toString_70992863328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48271 = new Integer(1265463001);
        Integer term48286 = new Integer(335112684);
        Class<? extends Object> term48414 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term48413 = ((Class) term48414).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term48413).setAccessible(true);
        Object enum117 =  ((Field) term48413).get((Object) null);
        Class<? extends Object> term48775 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term48774 = ((Class) term48775).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term48774).setAccessible(true);
        Object enum118 =  ((Field) term48774).get((Object) null);
        Class<? extends Object> term49136 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term49135 = ((Class) term49136).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term49135).setAccessible(true);
        Object enum119 =  ((Field) term49135).get((Object) null);
        ArrayList term48312 = new ArrayList();
        ((ArrayList) term48312).add(enum117);
        ((ArrayList) term48312).add(enum117);
        ((ArrayList) term48312).add(enum118);
        ((ArrayList) term48312).add(enum117);
        ((ArrayList) term48312).add(enum119);
        ((ArrayList) term48312).add(enum118);
        ((ArrayList) term48312).add(enum118);
        ((ArrayList) term48312).add(enum117);
        Class<? extends Object> term49488 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term49487 = ((Class) term49488).getDeclaredField((String) "MANAGER");
        ((Field) term49487).setAccessible(true);
        Object enum120 = ((Field) term49487).get((Object) null);
        Long term48334 = new Long(5262507301787091109L);
        HashMap term48357 = new HashMap();
        term48269 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term48270 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term48285 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term48333 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term48348 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term48349 = newInstance(Class.forName("java.util.Date"));
        Object term48351 = newInstance(Class.forName("java.util.Date"));
        Object term48353 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term48367 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term48270, term48270.getClass(), "id", term48271);
        setField(term48270, term48270.getClass(), "name", "nhoHrZfnIN");
        setField(term48269, term48269.getClass(), "project", term48270);
        setField(term48285, term48285.getClass(), "id", term48286);
        setField(term48285, term48285.getClass(), "firstName", "ZkMALXpEAZ");
        setField(term48285, term48285.getClass(), "lastName", "tXfQjSqDzN");
        setField(term48285, term48285.getClass(), "roles", term48312);
        setField(term48285, term48285.getClass(), "projectRole", enum120);
        setField(term48269, term48269.getClass(), "employee", term48285);
        setField(term48333, term48333.getClass(), "id", term48334);
        setField(term48333, term48333.getClass(), "name", "BjugTaMcxJ");
        setField(term48269, term48269.getClass(), "task", term48333);
        setLongField(term48349, term48349.getClass(), "fastTime", 1332871705432L);
        setField(term48349, term48349.getClass(), "cdate", null);
        setField(term48348, term48348.getClass(), "startOfPeriodHasRejection", term48349);
        setLongField(term48351, term48351.getClass(), "fastTime", 1597233967116L);
        setField(term48351, term48351.getClass(), "cdate", null);
        setField(term48348, term48348.getClass(), "endOfPeriodHasRejection", term48351);
        setField(term48269, term48269.getClass(), "unit", term48348);
        setIntField(term48353, term48353.getClass(), "projectId", 1193880199);
        setLongField(term48353, term48353.getClass(), "numberEmployees", -484994522244390100L);
        setDoubleField(term48353, term48353.getClass(), "sumHours", 0.9737083944266686);
        setField(term48269, term48269.getClass(), "employeesHours", term48353);
        setField(term48269, term48269.getClass(), "changes", term48357);
        setIntField(term48367, term48367.getClass(), "year", 2025);
        setShortField(term48367, term48367.getClass(), "month", (short) 4);
        setShortField(term48367, term48367.getClass(), "day", (short) 8);
        setField(term48269, term48269.getClass(), "date", term48367);
        setField(term48269, term48269.getClass(), "error", "tlzpzIjMib");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term48269, args);
    }

};


