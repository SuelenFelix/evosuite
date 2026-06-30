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

public class NoticeData_getEmployee_55741437510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24366;

    public NoticeData_getEmployee_55741437510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24368 = new Integer(-1087774327);
        Integer term24383 = new Integer(-1530420153);
        ArrayList term24409 = new ArrayList();
        Class<? extends Object> term24506 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term24505 = ((Class) term24506).getDeclaredField((String) "EMPLOYEE");
        ((Field) term24505).setAccessible(true);
        Object enum59 = ((Field) term24505).get((Object) null);
        Long term24426 = new Long(2535595959091595249L);
        HashMap term24449 = new HashMap();
        term24366 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term24367 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term24382 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term24425 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term24440 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term24441 = newInstance(Class.forName("java.util.Date"));
        Object term24443 = newInstance(Class.forName("java.util.Date"));
        Object term24445 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term24459 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term24367, term24367.getClass(), "id", term24368);
        setField(term24367, term24367.getClass(), "name", "cAPeiZHKGJ");
        setField(term24366, term24366.getClass(), "project", term24367);
        setField(term24382, term24382.getClass(), "id", term24383);
        setField(term24382, term24382.getClass(), "firstName", "LvJFtLBaxj");
        setField(term24382, term24382.getClass(), "lastName", "PHvxnGHptP");
        setField(term24382, term24382.getClass(), "roles", term24409);
        setField(term24382, term24382.getClass(), "projectRole", enum59);
        setField(term24366, term24366.getClass(), "employee", term24382);
        setField(term24425, term24425.getClass(), "id", term24426);
        setField(term24425, term24425.getClass(), "name", "TimdotUuNC");
        setField(term24366, term24366.getClass(), "task", term24425);
        setLongField(term24441, term24441.getClass(), "fastTime", 1630952644759L);
        setField(term24441, term24441.getClass(), "cdate", null);
        setField(term24440, term24440.getClass(), "startOfPeriodHasRejection", term24441);
        setLongField(term24443, term24443.getClass(), "fastTime", 1739417792956L);
        setField(term24443, term24443.getClass(), "cdate", null);
        setField(term24440, term24440.getClass(), "endOfPeriodHasRejection", term24443);
        setField(term24366, term24366.getClass(), "unit", term24440);
        setIntField(term24445, term24445.getClass(), "projectId", 597278769);
        setLongField(term24445, term24445.getClass(), "numberEmployees", -872011222785455006L);
        setDoubleField(term24445, term24445.getClass(), "sumHours", 0.9527281779865117);
        setField(term24366, term24366.getClass(), "employeesHours", term24445);
        setField(term24366, term24366.getClass(), "changes", term24449);
        setIntField(term24459, term24459.getClass(), "year", 2015);
        setShortField(term24459, term24459.getClass(), "month", (short) 9);
        setShortField(term24459, term24459.getClass(), "day", (short) 19);
        setField(term24366, term24366.getClass(), "date", term24459);
        setField(term24366, term24366.getClass(), "error", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployee", argTypes, term24366, args);
    }

};


