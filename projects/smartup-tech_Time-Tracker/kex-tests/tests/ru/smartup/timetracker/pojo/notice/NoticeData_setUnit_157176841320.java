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

public class NoticeData_setUnit_157176841320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37223;
     Object term37338;

    public NoticeData_setUnit_157176841320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term37225 = new Integer(-184153539);
        Integer term37240 = new Integer(493620644);
        Class<? extends Object> term37374 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term37373 = ((Class) term37374).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term37373).setAccessible(true);
        Object enum90 =  ((Field) term37373).get((Object) null);
        Class<? extends Object> term37756 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term37755 = ((Class) term37756).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term37755).setAccessible(true);
        Object enum91 =  ((Field) term37755).get((Object) null);
        Class<? extends Object> term38117 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term38116 = ((Class) term38117).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term38116).setAccessible(true);
        Object enum92 =  ((Field) term38116).get((Object) null);
        ArrayList term37266 = new ArrayList();
        ((ArrayList) term37266).add(enum90);
        ((ArrayList) term37266).add(enum91);
        ((ArrayList) term37266).add(enum92);
        ((ArrayList) term37266).add(enum90);
        ((ArrayList) term37266).add(enum91);
        ((ArrayList) term37266).add(enum92);
        ((ArrayList) term37266).add(enum92);
        Class<? extends Object> term38478 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term38477 = ((Class) term38478).getDeclaredField((String) "EMPLOYEE");
        ((Field) term38477).setAccessible(true);
        Object enum93 = ((Field) term38477).get((Object) null);
        Long term37289 = new Long(2486810210675247493L);
        HashMap term37312 = new HashMap();
        term37223 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term37224 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term37239 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term37288 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term37303 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term37304 = newInstance(Class.forName("java.util.Date"));
        Object term37306 = newInstance(Class.forName("java.util.Date"));
        Object term37308 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term37322 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term37224, term37224.getClass(), "id", term37225);
        setField(term37224, term37224.getClass(), "name", "WHcwFgsGFC");
        setField(term37223, term37223.getClass(), "project", term37224);
        setField(term37239, term37239.getClass(), "id", term37240);
        setField(term37239, term37239.getClass(), "firstName", "HzqpegHiRq");
        setField(term37239, term37239.getClass(), "lastName", "jwsfVjMoJT");
        setField(term37239, term37239.getClass(), "roles", term37266);
        setField(term37239, term37239.getClass(), "projectRole", enum93);
        setField(term37223, term37223.getClass(), "employee", term37239);
        setField(term37288, term37288.getClass(), "id", term37289);
        setField(term37288, term37288.getClass(), "name", "ZfdXfCCFDf");
        setField(term37223, term37223.getClass(), "task", term37288);
        setLongField(term37304, term37304.getClass(), "fastTime", 1819191638549L);
        setField(term37304, term37304.getClass(), "cdate", null);
        setField(term37303, term37303.getClass(), "startOfPeriodHasRejection", term37304);
        setLongField(term37306, term37306.getClass(), "fastTime", 1400691778698L);
        setField(term37306, term37306.getClass(), "cdate", null);
        setField(term37303, term37303.getClass(), "endOfPeriodHasRejection", term37306);
        setField(term37223, term37223.getClass(), "unit", term37303);
        setIntField(term37308, term37308.getClass(), "projectId", 1135664017);
        setLongField(term37308, term37308.getClass(), "numberEmployees", 7009926388951271268L);
        setDoubleField(term37308, term37308.getClass(), "sumHours", 0.3800088629986428);
        setField(term37223, term37223.getClass(), "employeesHours", term37308);
        setField(term37223, term37223.getClass(), "changes", term37312);
        setIntField(term37322, term37322.getClass(), "year", 2024);
        setShortField(term37322, term37322.getClass(), "month", (short) 1);
        setShortField(term37322, term37322.getClass(), "day", (short) 24);
        setField(term37223, term37223.getClass(), "date", term37322);
        setField(term37223, term37223.getClass(), "error", "VYkqXKVlAJ");
        term37338 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term37339 = newInstance(Class.forName("java.util.Date"));
        Object term37341 = newInstance(Class.forName("java.util.Date"));
        setLongField(term37339, term37339.getClass(), "fastTime", 1741444563811L);
        setField(term37339, term37339.getClass(), "cdate", null);
        setField(term37338, term37338.getClass(), "startOfPeriodHasRejection", term37339);
        setLongField(term37341, term37341.getClass(), "fastTime", 1761994701322L);
        setField(term37341, term37341.getClass(), "cdate", null);
        setField(term37338, term37338.getClass(), "endOfPeriodHasRejection", term37341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Object[] args = new Object[1];
        args[0] = term37338;
        callMethod(klass, "setUnit", argTypes, term37223, args);
    }

};


