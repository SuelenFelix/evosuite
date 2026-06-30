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
import java.util.LinkedHashMap;

public class NoticeData_setChanges_182816964722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40422;
     Object term40535;

    public NoticeData_setChanges_182816964722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40424 = new Integer(97029295);
        Integer term40439 = new Integer(-1371869594);
        Class<? extends Object> term40613 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term40612 = ((Class) term40613).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term40612).setAccessible(true);
        Object enum98 =  ((Field) term40612).get((Object) null);
        Class<? extends Object> term40974 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term40973 = ((Class) term40974).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term40973).setAccessible(true);
        Object enum99 =  ((Field) term40973).get((Object) null);
        ArrayList term40465 = new ArrayList();
        ((ArrayList) term40465).add(enum98);
        ((ArrayList) term40465).add(enum99);
        ((ArrayList) term40465).add(enum99);
        ((ArrayList) term40465).add(enum98);
        ((ArrayList) term40465).add(enum99);
        ((ArrayList) term40465).add(enum99);
        Class<? extends Object> term41356 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term41355 = ((Class) term41356).getDeclaredField((String) "EMPLOYEE");
        ((Field) term41355).setAccessible(true);
        Object enum100 = ((Field) term41355).get((Object) null);
        Long term40486 = new Long(-7672528020740371001L);
        HashMap term40509 = new HashMap();
        term40422 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term40423 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term40438 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term40485 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term40500 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term40501 = newInstance(Class.forName("java.util.Date"));
        Object term40503 = newInstance(Class.forName("java.util.Date"));
        Object term40505 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term40519 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term40423, term40423.getClass(), "id", term40424);
        setField(term40423, term40423.getClass(), "name", "VeDtgDzGAN");
        setField(term40422, term40422.getClass(), "project", term40423);
        setField(term40438, term40438.getClass(), "id", term40439);
        setField(term40438, term40438.getClass(), "firstName", "aWYOWZFyaX");
        setField(term40438, term40438.getClass(), "lastName", "BRIVNtfUWU");
        setField(term40438, term40438.getClass(), "roles", term40465);
        setField(term40438, term40438.getClass(), "projectRole", enum100);
        setField(term40422, term40422.getClass(), "employee", term40438);
        setField(term40485, term40485.getClass(), "id", term40486);
        setField(term40485, term40485.getClass(), "name", "DbiCVtPPCT");
        setField(term40422, term40422.getClass(), "task", term40485);
        setLongField(term40501, term40501.getClass(), "fastTime", 1853963979281L);
        setField(term40501, term40501.getClass(), "cdate", null);
        setField(term40500, term40500.getClass(), "startOfPeriodHasRejection", term40501);
        setLongField(term40503, term40503.getClass(), "fastTime", 1795936337628L);
        setField(term40503, term40503.getClass(), "cdate", null);
        setField(term40500, term40500.getClass(), "endOfPeriodHasRejection", term40503);
        setField(term40422, term40422.getClass(), "unit", term40500);
        setIntField(term40505, term40505.getClass(), "projectId", -1275173084);
        setLongField(term40505, term40505.getClass(), "numberEmployees", 1967728129628047933L);
        setDoubleField(term40505, term40505.getClass(), "sumHours", 0.10667076642995188);
        setField(term40422, term40422.getClass(), "employeesHours", term40505);
        setField(term40422, term40422.getClass(), "changes", term40509);
        setIntField(term40519, term40519.getClass(), "year", 2029);
        setShortField(term40519, term40519.getClass(), "month", (short) 8);
        setShortField(term40519, term40519.getClass(), "day", (short) 28);
        setField(term40422, term40422.getClass(), "date", term40519);
        setField(term40422, term40422.getClass(), "error", "PapWxkhEWe");
        term40535 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term40535;
        callMethod(klass, "setChanges", argTypes, term40422, args);
    }

};


