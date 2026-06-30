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

public class SubmittedHoursByWeekAndProjectDto_setFirstName_21483855214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6663;

    public SubmittedHoursByWeekAndProjectDto_setFirstName_21483855214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6777 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term6776 = ((Class) term6777).getDeclaredField((String) "SUBMITTED");
        ((Field) term6776).setAccessible(true);
        Object enum14 = ((Field) term6776).get((Object) null);
        term6663 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term6718 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6663, term6663.getClass(), "trackUnitId", 2120084523938730454L);
        setIntField(term6663, term6663.getClass(), "employeeId", 597278769);
        setField(term6663, term6663.getClass(), "firstName", "ffYhPOzlUs");
        setField(term6663, term6663.getClass(), "lastName", "MLqYREekMl");
        setLongField(term6663, term6663.getClass(), "taskId", 6855071767938501807L);
        setField(term6663, term6663.getClass(), "taskName", "ytSBIKXogI");
        setFloatField(term6663, term6663.getClass(), "hours", 0.3692338F);
        setField(term6663, term6663.getClass(), "status", enum14);
        setBooleanField(term6663, term6663.getClass(), "billable", false);
        setIntField(term6718, term6718.getClass(), "year", 2024);
        setShortField(term6718, term6718.getClass(), "month", (short) 1);
        setShortField(term6718, term6718.getClass(), "day", (short) 24);
        setField(term6663, term6663.getClass(), "workDay", term6718);
        setField(term6663, term6663.getClass(), "comment", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setFirstName", argTypes, term6663, args);
    }

};


