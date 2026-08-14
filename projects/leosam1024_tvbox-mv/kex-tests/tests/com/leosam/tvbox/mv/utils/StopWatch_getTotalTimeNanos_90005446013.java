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

public class StopWatch_getTotalTimeNanos_90005446013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804;

    public StopWatch_getTotalTimeNanos_90005446013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term808 = new ArrayList();
        term804 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term825 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term804, term804.getClass(), "id", "");
        setBooleanField(term804, term804.getClass(), "keepTaskList", true);
        setField(term804, term804.getClass(), "taskList", term808);
        setLongField(term804, term804.getClass(), "startTimeNanos", -8708192233349544946L);
        setField(term804, term804.getClass(), "currentTaskName", "TEParAifyi");
        setField(term825, term825.getClass(), "taskName", "OWDIEULEFu");
        setLongField(term825, term825.getClass(), "timeNanos", 5907001541142728739L);
        setField(term804, term804.getClass(), "lastTaskInfo", term825);
        setIntField(term804, term804.getClass(), "taskCount", -522618178);
        setLongField(term804, term804.getClass(), "totalTimeNanos", 4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTimeNanos", argTypes, term804, args);
    }

};


