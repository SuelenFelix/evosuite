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

public class SubmittedWorkDaysTableProjectUnitDto_getTaskId_634490933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13642;

    public SubmittedWorkDaysTableProjectUnitDto_getTaskId_634490933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13671 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13673 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13671, term13671.getClass(), "trackUnitId", -8654565919063661957L);
        setLongField(term13673, term13673.getClass(), "fastTime", 1725122217647L);
        setField(term13673, term13673.getClass(), "cdate", null);
        setField(term13671, term13671.getClass(), "date", term13673);
        setFloatField(term13671, term13671.getClass(), "hours", 0.541592F);
        Object term13676 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13678 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13676, term13676.getClass(), "trackUnitId", -5248475803419977214L);
        setLongField(term13678, term13678.getClass(), "fastTime", 1550698994689L);
        setField(term13678, term13678.getClass(), "cdate", null);
        setField(term13676, term13676.getClass(), "date", term13678);
        setFloatField(term13676, term13676.getClass(), "hours", 0.13481021F);
        Object term13681 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13683 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13681, term13681.getClass(), "trackUnitId", -6723783499250797216L);
        setLongField(term13683, term13683.getClass(), "fastTime", 1804998087131L);
        setField(term13683, term13683.getClass(), "cdate", null);
        setField(term13681, term13681.getClass(), "date", term13683);
        setFloatField(term13681, term13681.getClass(), "hours", 0.996533F);
        ArrayList term13669 = new ArrayList();
        ((ArrayList) term13669).add(term13671);
        ((ArrayList) term13669).add(term13676);
        ((ArrayList) term13669).add(term13681);
        term13642 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13642, term13642.getClass(), "projectId", -203030934);
        setField(term13642, term13642.getClass(), "projectName", "iNwOJRBEjp");
        setLongField(term13642, term13642.getClass(), "taskId", 305759998609888272L);
        setField(term13642, term13642.getClass(), "taskName", "XylxrMBraH");
        setField(term13642, term13642.getClass(), "trackUnits", term13669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term13642, args);
    }

};


