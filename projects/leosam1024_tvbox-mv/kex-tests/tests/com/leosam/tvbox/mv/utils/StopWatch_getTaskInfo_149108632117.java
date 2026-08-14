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

public class StopWatch_getTaskInfo_149108632117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1032;

    public StopWatch_getTaskInfo_149108632117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1036 = new ArrayList();
        term1032 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term1053 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term1032, term1032.getClass(), "id", "");
        setBooleanField(term1032, term1032.getClass(), "keepTaskList", true);
        setField(term1032, term1032.getClass(), "taskList", term1036);
        setLongField(term1032, term1032.getClass(), "startTimeNanos", -5788180182343976541L);
        setField(term1032, term1032.getClass(), "currentTaskName", "IDCWpPLRkE");
        setField(term1053, term1053.getClass(), "taskName", "nyiiPDVjAc");
        setLongField(term1053, term1053.getClass(), "timeNanos", 2936323121573284007L);
        setField(term1032, term1032.getClass(), "lastTaskInfo", term1053);
        setIntField(term1032, term1032.getClass(), "taskCount", 597278769);
        setLongField(term1032, term1032.getClass(), "totalTimeNanos", -1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskInfo", argTypes, term1032, args);
    }

};


