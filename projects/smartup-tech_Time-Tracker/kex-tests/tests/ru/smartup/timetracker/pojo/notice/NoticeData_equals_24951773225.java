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

public class NoticeData_equals_24951773225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44202;
     Object term44317;

    public NoticeData_equals_24951773225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44204 = new Integer(-93135961);
        Integer term44219 = new Integer(-112921587);
        Class<? extends Object> term44349 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term44348 = ((Class) term44349).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term44348).setAccessible(true);
        Object enum107 =  ((Field) term44348).get((Object) null);
        Class<? extends Object> term44701 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term44700 = ((Class) term44701).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term44700).setAccessible(true);
        Object enum108 =  ((Field) term44700).get((Object) null);
        Class<? extends Object> term45062 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term45061 = ((Class) term45062).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term45061).setAccessible(true);
        Object enum109 =  ((Field) term45061).get((Object) null);
        ArrayList term44245 = new ArrayList();
        ((ArrayList) term44245).add(enum107);
        ((ArrayList) term44245).add(enum108);
        ((ArrayList) term44245).add(enum109);
        ((ArrayList) term44245).add(enum109);
        ((ArrayList) term44245).add(enum108);
        ((ArrayList) term44245).add(enum107);
        Class<? extends Object> term45444 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term45443 = ((Class) term45444).getDeclaredField((String) "EMPLOYEE");
        ((Field) term45443).setAccessible(true);
        Object enum110 = ((Field) term45443).get((Object) null);
        Long term44268 = new Long(2120084523938730454L);
        HashMap term44291 = new HashMap();
        term44202 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term44203 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term44218 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term44267 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term44282 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term44283 = newInstance(Class.forName("java.util.Date"));
        Object term44285 = newInstance(Class.forName("java.util.Date"));
        Object term44287 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term44301 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term44203, term44203.getClass(), "id", term44204);
        setField(term44203, term44203.getClass(), "name", "ekxGuOYIwi");
        setField(term44202, term44202.getClass(), "project", term44203);
        setField(term44218, term44218.getClass(), "id", term44219);
        setField(term44218, term44218.getClass(), "firstName", "RbVQXSpxXy");
        setField(term44218, term44218.getClass(), "lastName", "YpJbIgJWWv");
        setField(term44218, term44218.getClass(), "roles", term44245);
        setField(term44218, term44218.getClass(), "projectRole", enum110);
        setField(term44202, term44202.getClass(), "employee", term44218);
        setField(term44267, term44267.getClass(), "id", term44268);
        setField(term44267, term44267.getClass(), "name", "JppkknKVOw");
        setField(term44202, term44202.getClass(), "task", term44267);
        setLongField(term44283, term44283.getClass(), "fastTime", 1762147441299L);
        setField(term44283, term44283.getClass(), "cdate", null);
        setField(term44282, term44282.getClass(), "startOfPeriodHasRejection", term44283);
        setLongField(term44285, term44285.getClass(), "fastTime", 1395479491666L);
        setField(term44285, term44285.getClass(), "cdate", null);
        setField(term44282, term44282.getClass(), "endOfPeriodHasRejection", term44285);
        setField(term44202, term44202.getClass(), "unit", term44282);
        setIntField(term44287, term44287.getClass(), "projectId", -1179120542);
        setLongField(term44287, term44287.getClass(), "numberEmployees", -5892135042702373494L);
        setDoubleField(term44287, term44287.getClass(), "sumHours", 0.6805867182029153);
        setField(term44202, term44202.getClass(), "employeesHours", term44287);
        setField(term44202, term44202.getClass(), "changes", term44291);
        setIntField(term44301, term44301.getClass(), "year", 2019);
        setShortField(term44301, term44301.getClass(), "month", (short) 2);
        setShortField(term44301, term44301.getClass(), "day", (short) 20);
        setField(term44202, term44202.getClass(), "date", term44301);
        setField(term44202, term44202.getClass(), "error", "kNqaJKIATy");
        term44317 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44317;
        callMethod(klass, "equals", argTypes, term44202, args);
    }

};


