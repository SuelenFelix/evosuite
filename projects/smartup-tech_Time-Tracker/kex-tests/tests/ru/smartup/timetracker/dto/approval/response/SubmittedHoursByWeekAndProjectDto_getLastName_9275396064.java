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

public class SubmittedHoursByWeekAndProjectDto_getLastName_9275396064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1937;

    public SubmittedHoursByWeekAndProjectDto_getLastName_9275396064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2038 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term2037 = ((Class) term2038).getDeclaredField((String) "APPROVED");
        ((Field) term2037).setAccessible(true);
        Object enum4 = ((Field) term2037).get((Object) null);
        term1937 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term1991 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1937, term1937.getClass(), "trackUnitId", -7237588299778557629L);
        setIntField(term1937, term1937.getClass(), "employeeId", -1922583790);
        setField(term1937, term1937.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term1937, term1937.getClass(), "lastName", "tbcdzjIfER");
        setLongField(term1937, term1937.getClass(), "taskId", 6967924379644551255L);
        setField(term1937, term1937.getClass(), "taskName", "HyxfbSQYBe");
        setFloatField(term1937, term1937.getClass(), "hours", 0.5523636F);
        setField(term1937, term1937.getClass(), "status", enum4);
        setBooleanField(term1937, term1937.getClass(), "billable", true);
        setIntField(term1991, term1991.getClass(), "year", 2015);
        setShortField(term1991, term1991.getClass(), "month", (short) 9);
        setShortField(term1991, term1991.getClass(), "day", (short) 19);
        setField(term1937, term1937.getClass(), "workDay", term1991);
        setField(term1937, term1937.getClass(), "comment", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1937, args);
    }

};


