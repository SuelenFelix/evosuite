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

public class NoticeData_canEqual_105368036126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45804;
     Object term45919;

    public NoticeData_canEqual_105368036126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45806 = new Integer(933028652);
        Integer term45821 = new Integer(287287233);
        Class<? extends Object> term45951 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term45950 = ((Class) term45951).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term45950).setAccessible(true);
        Object enum111 =  ((Field) term45950).get((Object) null);
        Class<? extends Object> term46303 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term46302 = ((Class) term46303).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term46302).setAccessible(true);
        Object enum112 =  ((Field) term46302).get((Object) null);
        Class<? extends Object> term46664 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term46663 = ((Class) term46664).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term46663).setAccessible(true);
        Object enum113 =  ((Field) term46663).get((Object) null);
        ArrayList term45847 = new ArrayList();
        ((ArrayList) term45847).add(enum111);
        ((ArrayList) term45847).add(enum112);
        ((ArrayList) term45847).add(enum111);
        ((ArrayList) term45847).add(enum113);
        ((ArrayList) term45847).add(enum112);
        Class<? extends Object> term47046 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term47045 = ((Class) term47046).getDeclaredField((String) "EMPLOYEE");
        ((Field) term47045).setAccessible(true);
        Object enum114 = ((Field) term47045).get((Object) null);
        Long term45870 = new Long(6855071767938501807L);
        HashMap term45893 = new HashMap();
        term45804 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term45805 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term45820 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term45869 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term45884 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term45885 = newInstance(Class.forName("java.util.Date"));
        Object term45887 = newInstance(Class.forName("java.util.Date"));
        Object term45889 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term45903 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term45805, term45805.getClass(), "id", term45806);
        setField(term45805, term45805.getClass(), "name", "vKQukfbJUd");
        setField(term45804, term45804.getClass(), "project", term45805);
        setField(term45820, term45820.getClass(), "id", term45821);
        setField(term45820, term45820.getClass(), "firstName", "lFRJFUMVbx");
        setField(term45820, term45820.getClass(), "lastName", "sZdUNdggUW");
        setField(term45820, term45820.getClass(), "roles", term45847);
        setField(term45820, term45820.getClass(), "projectRole", enum114);
        setField(term45804, term45804.getClass(), "employee", term45820);
        setField(term45869, term45869.getClass(), "id", term45870);
        setField(term45869, term45869.getClass(), "name", "OqbwYQfvAe");
        setField(term45804, term45804.getClass(), "task", term45869);
        setLongField(term45885, term45885.getClass(), "fastTime", 1466008719289L);
        setField(term45885, term45885.getClass(), "cdate", null);
        setField(term45884, term45884.getClass(), "startOfPeriodHasRejection", term45885);
        setLongField(term45887, term45887.getClass(), "fastTime", 1535838449065L);
        setField(term45887, term45887.getClass(), "cdate", null);
        setField(term45884, term45884.getClass(), "endOfPeriodHasRejection", term45887);
        setField(term45804, term45804.getClass(), "unit", term45884);
        setIntField(term45889, term45889.getClass(), "projectId", -73683645);
        setLongField(term45889, term45889.getClass(), "numberEmployees", 5262507301787091109L);
        setDoubleField(term45889, term45889.getClass(), "sumHours", 0.2852810965221698);
        setField(term45804, term45804.getClass(), "employeesHours", term45889);
        setField(term45804, term45804.getClass(), "changes", term45893);
        setIntField(term45903, term45903.getClass(), "year", 2027);
        setShortField(term45903, term45903.getClass(), "month", (short) 3);
        setShortField(term45903, term45903.getClass(), "day", (short) 14);
        setField(term45804, term45804.getClass(), "date", term45903);
        setField(term45804, term45804.getClass(), "error", "DhjNLmRMCu");
        term45919 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45919;
        callMethod(klass, "canEqual", argTypes, term45804, args);
    }

};


