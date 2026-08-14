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

public class StopWatch_getLastTaskTimeNanos_5139013839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;

    public StopWatch_getLastTaskTimeNanos_5139013839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term580 = new ArrayList();
        term576 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term597 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term576, term576.getClass(), "id", "");
        setBooleanField(term576, term576.getClass(), "keepTaskList", true);
        setField(term576, term576.getClass(), "taskList", term580);
        setLongField(term576, term576.getClass(), "startTimeNanos", -7672528020740371001L);
        setField(term576, term576.getClass(), "currentTaskName", "RkybSrpybU");
        setField(term597, term597.getClass(), "taskName", "xOEqzGAmDU");
        setLongField(term597, term597.getClass(), "timeNanos", -4502405999831680926L);
        setField(term576, term576.getClass(), "lastTaskInfo", term597);
        setIntField(term576, term576.getClass(), "taskCount", -2038273078);
        setLongField(term576, term576.getClass(), "totalTimeNanos", 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTaskTimeNanos", argTypes, term576, args);
    }

};


