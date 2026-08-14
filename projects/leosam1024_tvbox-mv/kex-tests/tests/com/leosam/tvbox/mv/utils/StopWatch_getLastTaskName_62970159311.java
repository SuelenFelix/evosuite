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

public class StopWatch_getLastTaskName_62970159311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;

    public StopWatch_getLastTaskName_62970159311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term694 = new ArrayList();
        term690 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term711 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term690, term690.getClass(), "id", "");
        setBooleanField(term690, term690.getClass(), "keepTaskList", true);
        setField(term690, term690.getClass(), "taskList", term694);
        setLongField(term690, term690.getClass(), "startTimeNanos", 5262507301787091109L);
        setField(term690, term690.getClass(), "currentTaskName", "vrQLuWIDJX");
        setField(term711, term711.getClass(), "taskName", "flxyYxBRtu");
        setLongField(term711, term711.getClass(), "timeNanos", -6823727938421990489L);
        setField(term690, term690.getClass(), "lastTaskInfo", term711);
        setIntField(term690, term690.getClass(), "taskCount", -1339778481);
        setLongField(term690, term690.getClass(), "totalTimeNanos", -484994522244390100L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTaskName", argTypes, term690, args);
    }

};


