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

public class NoticeData_setEmployeesHours_19537712621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38838;
     Object term38953;

    public NoticeData_setEmployeesHours_19537712621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38840 = new Integer(1328271830);
        Integer term38855 = new Integer(1596070772);
        Class<? extends Object> term38988 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term38987 = ((Class) term38988).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term38987).setAccessible(true);
        Object enum94 =  ((Field) term38987).get((Object) null);
        Class<? extends Object> term39349 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term39348 = ((Class) term39349).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term39348).setAccessible(true);
        Object enum95 =  ((Field) term39348).get((Object) null);
        Class<? extends Object> term39710 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term39709 = ((Class) term39710).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term39709).setAccessible(true);
        Object enum96 =  ((Field) term39709).get((Object) null);
        ArrayList term38881 = new ArrayList();
        ((ArrayList) term38881).add(enum94);
        ((ArrayList) term38881).add(enum95);
        ((ArrayList) term38881).add(enum96);
        ((ArrayList) term38881).add(enum94);
        Class<? extends Object> term40062 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term40061 = ((Class) term40062).getDeclaredField((String) "EMPLOYEE");
        ((Field) term40061).setAccessible(true);
        Object enum97 = ((Field) term40061).get((Object) null);
        Long term38904 = new Long(7009926388951271268L);
        HashMap term38927 = new HashMap();
        term38838 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term38839 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term38854 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term38903 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term38918 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term38919 = newInstance(Class.forName("java.util.Date"));
        Object term38921 = newInstance(Class.forName("java.util.Date"));
        Object term38923 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term38937 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term38839, term38839.getClass(), "id", term38840);
        setField(term38839, term38839.getClass(), "name", "XkIoWJRNwN");
        setField(term38838, term38838.getClass(), "project", term38839);
        setField(term38854, term38854.getClass(), "id", term38855);
        setField(term38854, term38854.getClass(), "firstName", "aNWLJdrZMq");
        setField(term38854, term38854.getClass(), "lastName", "HHmNoYxIGj");
        setField(term38854, term38854.getClass(), "roles", term38881);
        setField(term38854, term38854.getClass(), "projectRole", enum97);
        setField(term38838, term38838.getClass(), "employee", term38854);
        setField(term38903, term38903.getClass(), "id", term38904);
        setField(term38903, term38903.getClass(), "name", "PtirvZmsGt");
        setField(term38838, term38838.getClass(), "task", term38903);
        setLongField(term38919, term38919.getClass(), "fastTime", 1695425269458L);
        setField(term38919, term38919.getClass(), "cdate", null);
        setField(term38918, term38918.getClass(), "startOfPeriodHasRejection", term38919);
        setLongField(term38921, term38921.getClass(), "fastTime", 1362780563394L);
        setField(term38921, term38921.getClass(), "cdate", null);
        setField(term38918, term38918.getClass(), "endOfPeriodHasRejection", term38921);
        setField(term38838, term38838.getClass(), "unit", term38918);
        setIntField(term38923, term38923.getClass(), "projectId", 590364439);
        setLongField(term38923, term38923.getClass(), "numberEmployees", -7672528020740371001L);
        setDoubleField(term38923, term38923.getClass(), "sumHours", 0.5840714198152577);
        setField(term38838, term38838.getClass(), "employeesHours", term38923);
        setField(term38838, term38838.getClass(), "changes", term38927);
        setIntField(term38937, term38937.getClass(), "year", 2029);
        setShortField(term38937, term38937.getClass(), "month", (short) 1);
        setShortField(term38937, term38937.getClass(), "day", (short) 20);
        setField(term38838, term38838.getClass(), "date", term38937);
        setField(term38838, term38838.getClass(), "error", "hMmaoREuCK");
        term38953 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        setIntField(term38953, term38953.getClass(), "projectId", 865208305);
        setLongField(term38953, term38953.getClass(), "numberEmployees", -4502405999831680926L);
        setDoubleField(term38953, term38953.getClass(), "sumHours", 0.7559240768573477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours");
        Object[] args = new Object[1];
        args[0] = term38953;
        callMethod(klass, "setEmployeesHours", argTypes, term38838, args);
    }

};


