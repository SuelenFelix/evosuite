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
import java.lang.Long;

public class SubmittedWorkDaysTableProjectUnitDto_setTaskId_1484007079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44575;
     Object term44606;

    public SubmittedWorkDaysTableProjectUnitDto_setTaskId_1484007079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44602 = new ArrayList();
        term44575 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44575, term44575.getClass(), "projectId", 1296895584);
        setField(term44575, term44575.getClass(), "projectName", "BXTjEyEZxD");
        setLongField(term44575, term44575.getClass(), "taskId", -6950146046121430355L);
        setField(term44575, term44575.getClass(), "taskName", "oKhVzOKUFW");
        setField(term44575, term44575.getClass(), "trackUnits", term44602);
        term44606 = new Long(1667122142089513324L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44606;
        callMethod(klass, "setTaskId", argTypes, term44575, args);
    }

};


