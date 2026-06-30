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

public class SubmittedWorkDaysTableProjectUnitDto_canEqual_27544349612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14338;
     Object term14369;

    public SubmittedWorkDaysTableProjectUnitDto_canEqual_27544349612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14365 = new ArrayList();
        term14338 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14338, term14338.getClass(), "projectId", 1962444399);
        setField(term14338, term14338.getClass(), "projectName", "wfaXBpWAUH");
        setLongField(term14338, term14338.getClass(), "taskId", -4924950707540628022L);
        setField(term14338, term14338.getClass(), "taskName", "VMeAzAHwZj");
        setField(term14338, term14338.getClass(), "trackUnits", term14365);
        term14369 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14369;
        callMethod(klass, "canEqual", argTypes, term14338, args);
    }

};


