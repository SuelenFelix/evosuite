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

public class SubmittedWorkDaysTableProjectUnitDto_getTaskName_9924130405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44277;

    public SubmittedWorkDaysTableProjectUnitDto_getTaskName_9924130405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44306 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44308 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44306, term44306.getClass(), "trackUnitId", 7247160664318067468L);
        setLongField(term44308, term44308.getClass(), "fastTime", 1744090065937L);
        setField(term44308, term44308.getClass(), "cdate", null);
        setField(term44306, term44306.getClass(), "date", term44308);
        setFloatField(term44306, term44306.getClass(), "hours", 0.93280405F);
        ArrayList term44304 = new ArrayList();
        ((ArrayList) term44304).add(term44306);
        term44277 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44277, term44277.getClass(), "projectId", -461771056);
        setField(term44277, term44277.getClass(), "projectName", "MRFLbEGYKG");
        setLongField(term44277, term44277.getClass(), "taskId", 3133860696238261492L);
        setField(term44277, term44277.getClass(), "taskName", "BYrGukTyof");
        setField(term44277, term44277.getClass(), "trackUnits", term44304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term44277, args);
    }

};


