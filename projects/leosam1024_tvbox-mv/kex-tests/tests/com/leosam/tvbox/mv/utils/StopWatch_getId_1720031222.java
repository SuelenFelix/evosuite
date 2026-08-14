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

public class StopWatch_getId_1720031222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public StopWatch_getId_1720031222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term157 = new ArrayList();
        term153 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term174 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term153, term153.getClass(), "id", "");
        setBooleanField(term153, term153.getClass(), "keepTaskList", true);
        setField(term153, term153.getClass(), "taskList", term157);
        setLongField(term153, term153.getClass(), "startTimeNanos", 7411271909051562686L);
        setField(term153, term153.getClass(), "currentTaskName", "SzjVpOQTyS");
        setField(term174, term174.getClass(), "taskName", "MjGYSRKTNF");
        setLongField(term174, term174.getClass(), "timeNanos", 4872422362414183754L);
        setField(term153, term153.getClass(), "lastTaskInfo", term174);
        setIntField(term153, term153.getClass(), "taskCount", 568599855);
        setLongField(term153, term153.getClass(), "totalTimeNanos", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term153, args);
    }

};


