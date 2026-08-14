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

public class StopWatch_start_930131024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public StopWatch_start_930131024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term273 = new ArrayList();
        term269 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term290 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term269, term269.getClass(), "id", "");
        setBooleanField(term269, term269.getClass(), "keepTaskList", true);
        setField(term269, term269.getClass(), "taskList", term273);
        setLongField(term269, term269.getClass(), "startTimeNanos", -8885298608300233488L);
        setField(term269, term269.getClass(), "currentTaskName", "NRdvgJlhkX");
        setField(term290, term290.getClass(), "taskName", "uuaPigETmJ");
        setLongField(term290, term290.getClass(), "timeNanos", -4325723315152823407L);
        setField(term269, term269.getClass(), "lastTaskInfo", term290);
        setIntField(term269, term269.getClass(), "taskCount", 1484323161);
        setLongField(term269, term269.getClass(), "totalTimeNanos", 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term269, args);
    }

};


