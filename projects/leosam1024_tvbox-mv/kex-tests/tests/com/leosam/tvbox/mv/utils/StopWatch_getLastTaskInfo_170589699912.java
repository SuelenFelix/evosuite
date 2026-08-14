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

public class StopWatch_getLastTaskInfo_170589699912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;

    public StopWatch_getLastTaskInfo_170589699912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term751 = new ArrayList();
        term747 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term768 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term747, term747.getClass(), "id", "");
        setBooleanField(term747, term747.getClass(), "keepTaskList", true);
        setField(term747, term747.getClass(), "taskList", term751);
        setLongField(term747, term747.getClass(), "startTimeNanos", 1233889271256172047L);
        setField(term747, term747.getClass(), "currentTaskName", "OclPbYPkcH");
        setField(term768, term768.getClass(), "taskName", "IoAlmYsBwc");
        setLongField(term768, term768.getClass(), "timeNanos", 6617340557564669657L);
        setField(term747, term747.getClass(), "lastTaskInfo", term768);
        setIntField(term747, term747.getClass(), "taskCount", 1725571209);
        setLongField(term747, term747.getClass(), "totalTimeNanos", 1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTaskInfo", argTypes, term747, args);
    }

};


