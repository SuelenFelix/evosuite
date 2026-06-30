package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class SubmittedHoursByWeekAndProjectDto_setEmployeeId_48665451113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6190;
     Object term6260;

    public SubmittedHoursByWeekAndProjectDto_setEmployeeId_48665451113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6293 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term6292 = ((Class) term6293).getDeclaredField((String) "REJECTED");
        ((Field) term6292).setAccessible(true);
        Object enum13 = ((Field) term6292).get((Object) null);
        term6190 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term6244 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6190, term6190.getClass(), "trackUnitId", -4502405999831680926L);
        setIntField(term6190, term6190.getClass(), "employeeId", -883034806);
        setField(term6190, term6190.getClass(), "firstName", "UoYtihxVaS");
        setField(term6190, term6190.getClass(), "lastName", "JDswTTCZHV");
        setLongField(term6190, term6190.getClass(), "taskId", 1967728129628047933L);
        setField(term6190, term6190.getClass(), "taskName", "onpbIeEKoi");
        setFloatField(term6190, term6190.getClass(), "hours", 0.7944024F);
        setField(term6190, term6190.getClass(), "status", enum13);
        setBooleanField(term6190, term6190.getClass(), "billable", true);
        setIntField(term6244, term6244.getClass(), "year", 2012);
        setShortField(term6244, term6244.getClass(), "month", (short) 10);
        setShortField(term6244, term6244.getClass(), "day", (short) 1);
        setField(term6190, term6190.getClass(), "workDay", term6244);
        setField(term6190, term6190.getClass(), "comment", "YRHGsAkhxb");
        term6260 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6260;
        callMethod(klass, "setEmployeeId", argTypes, term6190, args);
    }

};


