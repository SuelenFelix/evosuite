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

public class SubmittedHoursByWeekAndProjectDto_getTaskName_18972461836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2879;

    public SubmittedHoursByWeekAndProjectDto_getTaskName_18972461836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2980 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term2979 = ((Class) term2980).getDeclaredField((String) "APPROVED");
        ((Field) term2979).setAccessible(true);
        Object enum6 = ((Field) term2979).get((Object) null);
        term2879 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term2933 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2879, term2879.getClass(), "trackUnitId", -4325723315152823407L);
        setIntField(term2879, term2879.getClass(), "employeeId", -1955890973);
        setField(term2879, term2879.getClass(), "firstName", "BYqFIqCKAV");
        setField(term2879, term2879.getClass(), "lastName", "vrQLuWIDJX");
        setLongField(term2879, term2879.getClass(), "taskId", 2535595959091595249L);
        setField(term2879, term2879.getClass(), "taskName", "flxyYxBRtu");
        setFloatField(term2879, term2879.getClass(), "hours", 0.5446086F);
        setField(term2879, term2879.getClass(), "status", enum6);
        setBooleanField(term2879, term2879.getClass(), "billable", true);
        setIntField(term2933, term2933.getClass(), "year", 2015);
        setShortField(term2933, term2933.getClass(), "month", (short) 4);
        setShortField(term2933, term2933.getClass(), "day", (short) 14);
        setField(term2879, term2879.getClass(), "workDay", term2933);
        setField(term2879, term2879.getClass(), "comment", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term2879, args);
    }

};


