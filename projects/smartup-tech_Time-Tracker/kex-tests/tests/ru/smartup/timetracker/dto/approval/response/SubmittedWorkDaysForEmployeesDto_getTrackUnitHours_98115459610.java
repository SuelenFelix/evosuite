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
import java.lang.Object;

public class SubmittedWorkDaysForEmployeesDto_getTrackUnitHours_98115459610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15464;

    public SubmittedWorkDaysForEmployeesDto_getTrackUnitHours_98115459610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15464 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15490 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15464, term15464.getClass(), "employeeId", -1371869594);
        setField(term15464, term15464.getClass(), "firstName", "DyiXbeYIaN");
        setField(term15464, term15464.getClass(), "lastName", "VGizxZnyHX");
        setLongField(term15490, term15490.getClass(), "fastTime", 1276505397937L);
        setField(term15490, term15490.getClass(), "cdate", null);
        setField(term15464, term15464.getClass(), "trackUnitWorkDay", term15490);
        setIntField(term15464, term15464.getClass(), "projectId", -2095575670);
        setField(term15464, term15464.getClass(), "projectName", "kVEZMHmRtR");
        setLongField(term15464, term15464.getClass(), "trackUnitId", 8802866251294305945L);
        setLongField(term15464, term15464.getClass(), "taskId", 4513004407927379358L);
        setField(term15464, term15464.getClass(), "taskName", "ekxGuOYIwi");
        setFloatField(term15464, term15464.getClass(), "trackUnitHours", 0.21924508F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitHours", argTypes, term15464, args);
    }

};


