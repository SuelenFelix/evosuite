package com.leosam.tvbox.mv.utils;

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
import static com.leosam.tvbox.mv.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class StopWatch_shortSummary_209597722318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1089;

    public StopWatch_shortSummary_209597722318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1093 = new ArrayList();
        term1089 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term1110 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term1089, term1089.getClass(), "id", "");
        setBooleanField(term1089, term1089.getClass(), "keepTaskList", true);
        setField(term1089, term1089.getClass(), "taskList", term1093);
        setLongField(term1089, term1089.getClass(), "startTimeNanos", -2850532706972744550L);
        setField(term1089, term1089.getClass(), "currentTaskName", "aKnKipADSo");
        setField(term1110, term1110.getClass(), "taskName", "wSQxaModmm");
        setLongField(term1110, term1110.getClass(), "timeNanos", -2644215923136513282L);
        setField(term1089, term1089.getClass(), "lastTaskInfo", term1110);
        setIntField(term1089, term1089.getClass(), "taskCount", -1685132342);
        setLongField(term1089, term1089.getClass(), "totalTimeNanos", -1468719814009985452L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shortSummary", argTypes, term1089, args);
    }

};


