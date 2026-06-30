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

public class NoticeData_setEmployee_35825537718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34268;
     Object term34379;

    public NoticeData_setEmployee_35825537718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34270 = new Integer(-1786399638);
        Integer term34285 = new Integer(2055867847);
        Class<? extends Object> term34444 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term34443 = ((Class) term34444).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term34443).setAccessible(true);
        Object enum83 =  ((Field) term34443).get((Object) null);
        ArrayList term34311 = new ArrayList();
        ((ArrayList) term34311).add(enum83);
        Class<? extends Object> term34826 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term34825 = ((Class) term34826).getDeclaredField((String) "EMPLOYEE");
        ((Field) term34825).setAccessible(true);
        Object enum84 = ((Field) term34825).get((Object) null);
        Long term34330 = new Long(-2585684163342970173L);
        HashMap term34353 = new HashMap();
        term34268 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term34269 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term34284 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term34329 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term34344 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term34345 = newInstance(Class.forName("java.util.Date"));
        Object term34347 = newInstance(Class.forName("java.util.Date"));
        Object term34349 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term34363 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34269, term34269.getClass(), "id", term34270);
        setField(term34269, term34269.getClass(), "name", "EYtfuJaxiM");
        setField(term34268, term34268.getClass(), "project", term34269);
        setField(term34284, term34284.getClass(), "id", term34285);
        setField(term34284, term34284.getClass(), "firstName", "gCWtLVKVVe");
        setField(term34284, term34284.getClass(), "lastName", "fWKJoSoCwE");
        setField(term34284, term34284.getClass(), "roles", term34311);
        setField(term34284, term34284.getClass(), "projectRole", enum84);
        setField(term34268, term34268.getClass(), "employee", term34284);
        setField(term34329, term34329.getClass(), "id", term34330);
        setField(term34329, term34329.getClass(), "name", "wfaXBpWAUH");
        setField(term34268, term34268.getClass(), "task", term34329);
        setLongField(term34345, term34345.getClass(), "fastTime", 1678177615298L);
        setField(term34345, term34345.getClass(), "cdate", null);
        setField(term34344, term34344.getClass(), "startOfPeriodHasRejection", term34345);
        setLongField(term34347, term34347.getClass(), "fastTime", 1666076287186L);
        setField(term34347, term34347.getClass(), "cdate", null);
        setField(term34344, term34344.getClass(), "endOfPeriodHasRejection", term34347);
        setField(term34268, term34268.getClass(), "unit", term34344);
        setIntField(term34349, term34349.getClass(), "projectId", -117576464);
        setLongField(term34349, term34349.getClass(), "numberEmployees", -4365849114644724155L);
        setDoubleField(term34349, term34349.getClass(), "sumHours", 0.7633268466829064);
        setField(term34268, term34268.getClass(), "employeesHours", term34349);
        setField(term34268, term34268.getClass(), "changes", term34353);
        setIntField(term34363, term34363.getClass(), "year", 2025);
        setShortField(term34363, term34363.getClass(), "month", (short) 4);
        setShortField(term34363, term34363.getClass(), "day", (short) 23);
        setField(term34268, term34268.getClass(), "date", term34363);
        setField(term34268, term34268.getClass(), "error", "PznxWXsZME");
        Integer term34380 = new Integer(-1048298087);
        Class<? extends Object> term35207 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term35206 = ((Class) term35207).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term35206).setAccessible(true);
        Object enum85 =  ((Field) term35206).get((Object) null);
        ArrayList term34406 = new ArrayList();
        ((ArrayList) term34406).add(enum83);
        ((ArrayList) term34406).add(enum83);
        ((ArrayList) term34406).add(enum85);
        ((ArrayList) term34406).add(enum85);
        ((ArrayList) term34406).add(enum85);
        term34379 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term34379, term34379.getClass(), "id", term34380);
        setField(term34379, term34379.getClass(), "firstName", "ZzIujlwVsw");
        setField(term34379, term34379.getClass(), "lastName", "LWyEaeIyAo");
        setField(term34379, term34379.getClass(), "roles", term34406);
        setField(term34379, term34379.getClass(), "projectRole", enum84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Object[] args = new Object[1];
        args[0] = term34379;
        callMethod(klass, "setEmployee", argTypes, term34268, args);
    }

};


