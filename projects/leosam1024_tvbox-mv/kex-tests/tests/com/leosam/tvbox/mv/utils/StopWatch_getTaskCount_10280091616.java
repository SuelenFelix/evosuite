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

public class StopWatch_getTaskCount_10280091616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;

    public StopWatch_getTaskCount_10280091616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term979 = new ArrayList();
        term975 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term996 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term975, term975.getClass(), "id", "");
        setBooleanField(term975, term975.getClass(), "keepTaskList", true);
        setField(term975, term975.getClass(), "taskList", term979);
        setLongField(term975, term975.getClass(), "startTimeNanos", 4044358158040652353L);
        setField(term975, term975.getClass(), "currentTaskName", "Ghbwtircqb");
        setField(term996, term996.getClass(), "taskName", "xrwlQZdwCp");
        setLongField(term996, term996.getClass(), "timeNanos", -4443169559037975007L);
        setField(term975, term975.getClass(), "lastTaskInfo", term996);
        setIntField(term975, term975.getClass(), "taskCount", 1585847225);
        setLongField(term975, term975.getClass(), "totalTimeNanos", -3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskCount", argTypes, term975, args);
    }

};


