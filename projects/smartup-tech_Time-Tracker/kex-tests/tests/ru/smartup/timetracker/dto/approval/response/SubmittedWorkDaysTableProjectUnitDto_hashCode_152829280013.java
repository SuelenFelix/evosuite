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

public class SubmittedWorkDaysTableProjectUnitDto_hashCode_152829280013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14390;

    public SubmittedWorkDaysTableProjectUnitDto_hashCode_152829280013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14419 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14421 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14419, term14419.getClass(), "trackUnitId", -4822736661741380518L);
        setLongField(term14421, term14421.getClass(), "fastTime", 1628695316832L);
        setField(term14421, term14421.getClass(), "cdate", null);
        setField(term14419, term14419.getClass(), "date", term14421);
        setFloatField(term14419, term14419.getClass(), "hours", 0.65889484F);
        ArrayList term14417 = new ArrayList();
        ((ArrayList) term14417).add(term14419);
        term14390 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14390, term14390.getClass(), "projectId", 767834723);
        setField(term14390, term14390.getClass(), "projectName", "PznxWXsZME");
        setLongField(term14390, term14390.getClass(), "taskId", -4393710401270724527L);
        setField(term14390, term14390.getClass(), "taskName", "ZzIujlwVsw");
        setField(term14390, term14390.getClass(), "trackUnits", term14417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14390, args);
    }

};


