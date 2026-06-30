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
import java.util.ArrayList;
import java.lang.Object;

public class SubmittedWorkDaysTableProjectUnitDto_getTrackUnits_16095237415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13779;

    public SubmittedWorkDaysTableProjectUnitDto_getTrackUnits_16095237415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13808 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13810 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13808, term13808.getClass(), "trackUnitId", 7862575738391801707L);
        setLongField(term13810, term13810.getClass(), "fastTime", 1630952644759L);
        setField(term13810, term13810.getClass(), "cdate", null);
        setField(term13808, term13808.getClass(), "date", term13810);
        setFloatField(term13808, term13808.getClass(), "hours", 0.75592405F);
        ArrayList term13806 = new ArrayList();
        ((ArrayList) term13806).add(term13808);
        term13779 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13779, term13779.getClass(), "projectId", -73683645);
        setField(term13779, term13779.getClass(), "projectName", "dpNsDgfPso");
        setLongField(term13779, term13779.getClass(), "taskId", 9013624480170062917L);
        setField(term13779, term13779.getClass(), "taskName", "hCWPJQKpdc");
        setField(term13779, term13779.getClass(), "trackUnits", term13806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnits", argTypes, term13779, args);
    }

};


