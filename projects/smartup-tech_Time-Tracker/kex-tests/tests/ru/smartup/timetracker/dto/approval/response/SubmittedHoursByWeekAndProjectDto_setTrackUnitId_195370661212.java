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
import java.lang.Long;

public class SubmittedHoursByWeekAndProjectDto_setTrackUnitId_195370661212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5713;
     Object term5784;

    public SubmittedHoursByWeekAndProjectDto_setTrackUnitId_195370661212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5817 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term5816 = ((Class) term5817).getDeclaredField((String) "SUBMITTED");
        ((Field) term5816).setAccessible(true);
        Object enum12 = ((Field) term5816).get((Object) null);
        term5713 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term5768 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5713, term5713.getClass(), "trackUnitId", 2486810210675247493L);
        setIntField(term5713, term5713.getClass(), "employeeId", 1134449235);
        setField(term5713, term5713.getClass(), "firstName", "xLbjWUgOIL");
        setField(term5713, term5713.getClass(), "lastName", "jDtqGUpnZN");
        setLongField(term5713, term5713.getClass(), "taskId", 7009926388951271268L);
        setField(term5713, term5713.getClass(), "taskName", "nGKItKLYNC");
        setFloatField(term5713, term5713.getClass(), "hours", 0.26413453F);
        setField(term5713, term5713.getClass(), "status", enum12);
        setBooleanField(term5713, term5713.getClass(), "billable", false);
        setIntField(term5768, term5768.getClass(), "year", 2025);
        setShortField(term5768, term5768.getClass(), "month", (short) 4);
        setShortField(term5768, term5768.getClass(), "day", (short) 23);
        setField(term5713, term5713.getClass(), "workDay", term5768);
        setField(term5713, term5713.getClass(), "comment", "UiUYnPrcCi");
        term5784 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5784;
        callMethod(klass, "setTrackUnitId", argTypes, term5713, args);
    }

};


