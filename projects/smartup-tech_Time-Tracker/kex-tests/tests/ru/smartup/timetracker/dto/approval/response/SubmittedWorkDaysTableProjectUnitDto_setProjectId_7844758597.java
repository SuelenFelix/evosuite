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
import java.lang.Integer;

public class SubmittedWorkDaysTableProjectUnitDto_setProjectId_7844758597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44429;
     Object term44460;

    public SubmittedWorkDaysTableProjectUnitDto_setProjectId_7844758597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44456 = new ArrayList();
        term44429 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44429, term44429.getClass(), "projectId", 1384592638);
        setField(term44429, term44429.getClass(), "projectName", "YgQvdcBQKw");
        setLongField(term44429, term44429.getClass(), "taskId", 2354625302846375590L);
        setField(term44429, term44429.getClass(), "taskName", "FiYYLuailz");
        setField(term44429, term44429.getClass(), "trackUnits", term44456);
        term44460 = new Integer(-1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44460;
        callMethod(klass, "setProjectId", argTypes, term44429, args);
    }

};


