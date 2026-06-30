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

public class NoticeData_hashCode_19916894327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47406;

    public NoticeData_hashCode_19916894327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term47408 = new Integer(962840079);
        Integer term47423 = new Integer(1540719661);
        Class<? extends Object> term47548 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term47547 = ((Class) term47548).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term47547).setAccessible(true);
        Object enum115 =  ((Field) term47547).get((Object) null);
        ArrayList term47449 = new ArrayList();
        ((ArrayList) term47449).add(enum115);
        Class<? extends Object> term47909 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term47908 = ((Class) term47909).getDeclaredField((String) "EMPLOYEE");
        ((Field) term47908).setAccessible(true);
        Object enum116 = ((Field) term47908).get((Object) null);
        Long term47468 = new Long(-5892135042702373494L);
        HashMap term47491 = new HashMap();
        term47406 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term47407 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term47422 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term47467 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term47482 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term47483 = newInstance(Class.forName("java.util.Date"));
        Object term47485 = newInstance(Class.forName("java.util.Date"));
        Object term47487 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term47501 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term47407, term47407.getClass(), "id", term47408);
        setField(term47407, term47407.getClass(), "name", "PgPzMSEjjX");
        setField(term47406, term47406.getClass(), "project", term47407);
        setField(term47422, term47422.getClass(), "id", term47423);
        setField(term47422, term47422.getClass(), "firstName", "wzsPSPcRdj");
        setField(term47422, term47422.getClass(), "lastName", "kGMQdqJYyB");
        setField(term47422, term47422.getClass(), "roles", term47449);
        setField(term47422, term47422.getClass(), "projectRole", enum116);
        setField(term47406, term47406.getClass(), "employee", term47422);
        setField(term47467, term47467.getClass(), "id", term47468);
        setField(term47467, term47467.getClass(), "name", "XJJNClzHRf");
        setField(term47406, term47406.getClass(), "task", term47467);
        setLongField(term47483, term47483.getClass(), "fastTime", 1345923503543L);
        setField(term47483, term47483.getClass(), "cdate", null);
        setField(term47482, term47482.getClass(), "startOfPeriodHasRejection", term47483);
        setLongField(term47485, term47485.getClass(), "fastTime", 1838357779277L);
        setField(term47485, term47485.getClass(), "cdate", null);
        setField(term47482, term47482.getClass(), "endOfPeriodHasRejection", term47485);
        setField(term47406, term47406.getClass(), "unit", term47482);
        setIntField(term47487, term47487.getClass(), "projectId", -226514366);
        setLongField(term47487, term47487.getClass(), "numberEmployees", -6823727938421990489L);
        setDoubleField(term47487, term47487.getClass(), "sumHours", 0.6300849762307866);
        setField(term47406, term47406.getClass(), "employeesHours", term47487);
        setField(term47406, term47406.getClass(), "changes", term47491);
        setIntField(term47501, term47501.getClass(), "year", 2018);
        setShortField(term47501, term47501.getClass(), "month", (short) 9);
        setShortField(term47501, term47501.getClass(), "day", (short) 27);
        setField(term47406, term47406.getClass(), "date", term47501);
        setField(term47406, term47406.getClass(), "error", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term47406, args);
    }

};


