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

public class NoticeData_getChanges_214684848114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29297;

    public NoticeData_getChanges_214684848114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29299 = new Integer(-157887805);
        Integer term29314 = new Integer(1876565163);
        ArrayList term29340 = new ArrayList();
        Class<? extends Object> term29437 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term29436 = ((Class) term29437).getDeclaredField((String) "EMPLOYEE");
        ((Field) term29436).setAccessible(true);
        Object enum71 = ((Field) term29436).get((Object) null);
        Long term29357 = new Long(5127676408959197577L);
        HashMap term29380 = new HashMap();
        term29297 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term29298 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term29313 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term29356 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term29371 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term29372 = newInstance(Class.forName("java.util.Date"));
        Object term29374 = newInstance(Class.forName("java.util.Date"));
        Object term29376 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term29390 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term29298, term29298.getClass(), "id", term29299);
        setField(term29298, term29298.getClass(), "name", "ZVecLZMLHF");
        setField(term29297, term29297.getClass(), "project", term29298);
        setField(term29313, term29313.getClass(), "id", term29314);
        setField(term29313, term29313.getClass(), "firstName", "fztQhjqwdP");
        setField(term29313, term29313.getClass(), "lastName", "eVpkWxjuki");
        setField(term29313, term29313.getClass(), "roles", term29340);
        setField(term29313, term29313.getClass(), "projectRole", enum71);
        setField(term29297, term29297.getClass(), "employee", term29313);
        setField(term29356, term29356.getClass(), "id", term29357);
        setField(term29356, term29356.getClass(), "name", "SJiQaLvSKv");
        setField(term29297, term29297.getClass(), "task", term29356);
        setLongField(term29372, term29372.getClass(), "fastTime", 1876872800559L);
        setField(term29372, term29372.getClass(), "cdate", null);
        setField(term29371, term29371.getClass(), "startOfPeriodHasRejection", term29372);
        setLongField(term29374, term29374.getClass(), "fastTime", 1304532099366L);
        setField(term29374, term29374.getClass(), "cdate", null);
        setField(term29371, term29371.getClass(), "endOfPeriodHasRejection", term29374);
        setField(term29297, term29297.getClass(), "unit", term29371);
        setIntField(term29376, term29376.getClass(), "projectId", 1048535127);
        setLongField(term29376, term29376.getClass(), "numberEmployees", -4920224193275732920L);
        setDoubleField(term29376, term29376.getClass(), "sumHours", 0.7332741045694002);
        setField(term29297, term29297.getClass(), "employeesHours", term29376);
        setField(term29297, term29297.getClass(), "changes", term29380);
        setIntField(term29390, term29390.getClass(), "year", 2022);
        setShortField(term29390, term29390.getClass(), "month", (short) 2);
        setShortField(term29390, term29390.getClass(), "day", (short) 25);
        setField(term29297, term29297.getClass(), "date", term29390);
        setField(term29297, term29297.getClass(), "error", "RYdKCNNMBR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChanges", argTypes, term29297, args);
    }

};


