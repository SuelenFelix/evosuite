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

public class NoticeData_setProject_85685506317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33030;
     Object term33142;

    public NoticeData_setProject_85685506317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33032 = new Integer(-14890619);
        Integer term33047 = new Integer(1632125673);
        Class<? extends Object> term33188 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term33187 = ((Class) term33188).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term33187).setAccessible(true);
        Object enum80 =  ((Field) term33187).get((Object) null);
        Class<? extends Object> term33549 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term33548 = ((Class) term33549).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term33548).setAccessible(true);
        Object enum81 =  ((Field) term33548).get((Object) null);
        ArrayList term33073 = new ArrayList();
        ((ArrayList) term33073).add(enum80);
        ((ArrayList) term33073).add(enum81);
        ((ArrayList) term33073).add(enum81);
        ((ArrayList) term33073).add(enum80);
        ((ArrayList) term33073).add(enum80);
        ((ArrayList) term33073).add(enum81);
        ((ArrayList) term33073).add(enum81);
        Class<? extends Object> term33901 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term33900 = ((Class) term33901).getDeclaredField((String) "MANAGER");
        ((Field) term33900).setAccessible(true);
        Object enum82 = ((Field) term33900).get((Object) null);
        Long term33093 = new Long(8428634514691209827L);
        HashMap term33116 = new HashMap();
        term33030 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData"));
        Object term33031 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        Object term33046 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        Object term33092 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        Object term33107 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term33108 = newInstance(Class.forName("java.util.Date"));
        Object term33110 = newInstance(Class.forName("java.util.Date"));
        Object term33112 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        Object term33126 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33031, term33031.getClass(), "id", term33032);
        setField(term33031, term33031.getClass(), "name", "JDaAnsVTGV");
        setField(term33030, term33030.getClass(), "project", term33031);
        setField(term33046, term33046.getClass(), "id", term33047);
        setField(term33046, term33046.getClass(), "firstName", "mLUZFTfjle");
        setField(term33046, term33046.getClass(), "lastName", "xIeFjkHkOe");
        setField(term33046, term33046.getClass(), "roles", term33073);
        setField(term33046, term33046.getClass(), "projectRole", enum82);
        setField(term33030, term33030.getClass(), "employee", term33046);
        setField(term33092, term33092.getClass(), "id", term33093);
        setField(term33092, term33092.getClass(), "name", "SdCKLMIYnX");
        setField(term33030, term33030.getClass(), "task", term33092);
        setLongField(term33108, term33108.getClass(), "fastTime", 1405279189488L);
        setField(term33108, term33108.getClass(), "cdate", null);
        setField(term33107, term33107.getClass(), "startOfPeriodHasRejection", term33108);
        setLongField(term33110, term33110.getClass(), "fastTime", 1822704644050L);
        setField(term33110, term33110.getClass(), "cdate", null);
        setField(term33107, term33107.getClass(), "endOfPeriodHasRejection", term33110);
        setField(term33030, term33030.getClass(), "unit", term33107);
        setIntField(term33112, term33112.getClass(), "projectId", -2068769794);
        setLongField(term33112, term33112.getClass(), "numberEmployees", 8059786003080744426L);
        setDoubleField(term33112, term33112.getClass(), "sumHours", 0.43692187681405226);
        setField(term33030, term33030.getClass(), "employeesHours", term33112);
        setField(term33030, term33030.getClass(), "changes", term33116);
        setIntField(term33126, term33126.getClass(), "year", 2020);
        setShortField(term33126, term33126.getClass(), "month", (short) 5);
        setShortField(term33126, term33126.getClass(), "day", (short) 14);
        setField(term33030, term33030.getClass(), "date", term33126);
        setField(term33030, term33030.getClass(), "error", "AKNapTAfmD");
        Integer term33143 = new Integer(454281060);
        term33142 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        setField(term33142, term33142.getClass(), "id", term33143);
        setField(term33142, term33142.getClass(), "name", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject");
        Object[] args = new Object[1];
        args[0] = term33142;
        callMethod(klass, "setProject", argTypes, term33030, args);
    }

};


