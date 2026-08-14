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

public class StopWatch_toString_167839268120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;

    public StopWatch_toString_167839268120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1207 = new ArrayList();
        term1203 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term1224 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term1203, term1203.getClass(), "id", "");
        setBooleanField(term1203, term1203.getClass(), "keepTaskList", true);
        setField(term1203, term1203.getClass(), "taskList", term1207);
        setLongField(term1203, term1203.getClass(), "startTimeNanos", 3892018155439224435L);
        setField(term1203, term1203.getClass(), "currentTaskName", "hxCBltsObl");
        setField(term1224, term1224.getClass(), "taskName", "BndsHwAFMv");
        setLongField(term1224, term1224.getClass(), "timeNanos", 5953383087795962419L);
        setField(term1203, term1203.getClass(), "lastTaskInfo", term1224);
        setIntField(term1203, term1203.getClass(), "taskCount", 1622346318);
        setLongField(term1203, term1203.getClass(), "totalTimeNanos", 7994303628307559416L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1203, args);
    }

};


