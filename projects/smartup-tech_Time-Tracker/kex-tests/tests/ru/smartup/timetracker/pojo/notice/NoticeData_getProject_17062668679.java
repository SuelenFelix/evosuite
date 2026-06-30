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

public class NoticeData_getProject_17062668679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23162;

    public NoticeData_getProject_17062668679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23164 = new Integer(-226514366);
        Integer term23179 = new Integer(1193880199);
        Class<? extends Object> term23305 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term23304 = ((Class) term23305).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term23304).setAccessible(true);
        Object enum56 =  ((Field) term23304).get((Object) null);
        Class<? extends Object> term23657 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term23656 = ((Class) term23657).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term23656).setAccessible(true);
        Object enum57 =  ((Field) term23656).get((Object) null);
        ArrayList term23205 = new ArrayList();
        ((ArrayList) term23205).add(enum56);
        ((ArrayList) term23205).add(enum57);
        Class<? extends Object> term24009 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term24008 = ((Class) term24009).getDeclaredField((String) "MANAGER");
        ((Field) term24008).setAccessible(true);
        Object enum58 = ((Field) term24008).get((Object) null);
        Long term23225 = new Long(-4325723315152823407L);
        HashMap term23248 = new HashMap();
        term23162 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term23163 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term23178 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term23224 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term23239 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term23240 = newInstance(Class.forName("java.util.Date"));
        Object term23242 = newInstance(Class.forName("java.util.Date"));
        Object term23244 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term23258 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term23163, term23163.getClass(), "id", term23164);
        setField(term23163, term23163.getClass(), "name", "OWKQODBLzb");
        setField(term23162, term23162.getClass(), "project", term23163);
        setField(term23178, term23178.getClass(), "id", term23179);
        setField(term23178, term23178.getClass(), "firstName", "wGmYcqUkgE");
        setField(term23178, term23178.getClass(), "lastName", "idgaQsnJpQ");
        setField(term23178, term23178.getClass(), "roles", term23205);
        setField(term23178, term23178.getClass(), "projectRole", enum58);
        setField(term23162, term23162.getClass(), "employee", term23178);
        setField(term23224, term23224.getClass(), "id", term23225);
        setField(term23224, term23224.getClass(), "name", "VgZnGoIFwQ");
        setField(term23162, term23162.getClass(), "task", term23224);
        setLongField(term23240, term23240.getClass(), "fastTime", 1347400561385L);
        setField(term23240, term23240.getClass(), "cdate", null);
        setField(term23239, term23239.getClass(), "startOfPeriodHasRejection", term23240);
        setLongField(term23242, term23242.getClass(), "fastTime", 1502158153899L);
        setField(term23242, term23242.getClass(), "cdate", null);
        setField(term23239, term23239.getClass(), "endOfPeriodHasRejection", term23242);
        setField(term23162, term23162.getClass(), "unit", term23239);
        setIntField(term23244, term23244.getClass(), "projectId", 1585847225);
        setLongField(term23244, term23244.getClass(), "numberEmployees", -5476826692763582090L);
        setDoubleField(term23244, term23244.getClass(), "sumHours", 0.7031006357544823);
        setField(term23162, term23162.getClass(), "employeesHours", term23244);
        setField(term23162, term23162.getClass(), "changes", term23248);
        setIntField(term23258, term23258.getClass(), "year", 2020);
        setShortField(term23258, term23258.getClass(), "month", (short) 11);
        setShortField(term23258, term23258.getClass(), "day", (short) 22);
        setField(term23162, term23162.getClass(), "date", term23258);
        setField(term23162, term23162.getClass(), "error", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProject", argTypes, term23162, args);
    }

};


