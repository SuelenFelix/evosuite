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

public class NoticeData_getDate_1987235015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29797;

    public NoticeData_getDate_1987235015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29799 = new Integer(-817164822);
        Integer term29814 = new Integer(-1016503459);
        Class<? extends Object> term29942 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term29941 = ((Class) term29942).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term29941).setAccessible(true);
        Object enum72 =  ((Field) term29941).get((Object) null);
        Class<? extends Object> term30324 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term30323 = ((Class) term30324).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term30323).setAccessible(true);
        Object enum73 =  ((Field) term30323).get((Object) null);
        Class<? extends Object> term30706 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term30705 = ((Class) term30706).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term30705).setAccessible(true);
        Object enum74 =  ((Field) term30705).get((Object) null);
        ArrayList term29840 = new ArrayList();
        ((ArrayList) term29840).add(enum72);
        ((ArrayList) term29840).add(enum72);
        ((ArrayList) term29840).add(enum72);
        ((ArrayList) term29840).add(enum73);
        ((ArrayList) term29840).add(enum73);
        ((ArrayList) term29840).add(enum74);
        ((ArrayList) term29840).add(enum74);
        Class<? extends Object> term31067 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term31066 = ((Class) term31067).getDeclaredField((String) "MANAGER");
        ((Field) term31066).setAccessible(true);
        Object enum75 = ((Field) term31066).get((Object) null);
        Long term29862 = new Long(-6573104506744284592L);
        HashMap term29885 = new HashMap();
        term29797 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term29798 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term29813 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term29861 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term29876 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term29877 = newInstance(Class.forName("java.util.Date"));
        Object term29879 = newInstance(Class.forName("java.util.Date"));
        Object term29881 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term29895 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term29798, term29798.getClass(), "id", term29799);
        setField(term29798, term29798.getClass(), "name", "yGtHPyvYiQ");
        setField(term29797, term29797.getClass(), "project", term29798);
        setField(term29813, term29813.getClass(), "id", term29814);
        setField(term29813, term29813.getClass(), "firstName", "MvRIxilFMJ");
        setField(term29813, term29813.getClass(), "lastName", "iNwOJRBEjp");
        setField(term29813, term29813.getClass(), "roles", term29840);
        setField(term29813, term29813.getClass(), "projectRole", enum75);
        setField(term29797, term29797.getClass(), "employee", term29813);
        setField(term29861, term29861.getClass(), "id", term29862);
        setField(term29861, term29861.getClass(), "name", "XylxrMBraH");
        setField(term29797, term29797.getClass(), "task", term29861);
        setLongField(term29877, term29877.getClass(), "fastTime", 1488725902101L);
        setField(term29877, term29877.getClass(), "cdate", null);
        setField(term29876, term29876.getClass(), "startOfPeriodHasRejection", term29877);
        setLongField(term29879, term29879.getClass(), "fastTime", 1311560117361L);
        setField(term29879, term29879.getClass(), "cdate", null);
        setField(term29876, term29876.getClass(), "endOfPeriodHasRejection", term29879);
        setField(term29797, term29797.getClass(), "unit", term29876);
        setIntField(term29881, term29881.getClass(), "projectId", -655067527);
        setLongField(term29881, term29881.getClass(), "numberEmployees", 8428634514691209827L);
        setDoubleField(term29881, term29881.getClass(), "sumHours", 0.4569171842750229);
        setField(term29797, term29797.getClass(), "employeesHours", term29881);
        setField(term29797, term29797.getClass(), "changes", term29885);
        setIntField(term29895, term29895.getClass(), "year", 2017);
        setShortField(term29895, term29895.getClass(), "month", (short) 7);
        setShortField(term29895, term29895.getClass(), "day", (short) 22);
        setField(term29797, term29797.getClass(), "date", term29895);
        setField(term29797, term29797.getClass(), "error", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term29797, args);
    }

};


