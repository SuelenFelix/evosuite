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
import java.lang.Boolean;

public class StopWatch_setKeepTaskList_21442461683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term247;

    public StopWatch_setKeepTaskList_21442461683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214 = new ArrayList();
        term210 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term231 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term210, term210.getClass(), "id", "");
        setBooleanField(term210, term210.getClass(), "keepTaskList", true);
        setField(term210, term210.getClass(), "taskList", term214);
        setLongField(term210, term210.getClass(), "startTimeNanos", -7237588299778557629L);
        setField(term210, term210.getClass(), "currentTaskName", "hRNSzYYIrc");
        setField(term231, term231.getClass(), "taskName", "RMFIsYGgne");
        setLongField(term231, term231.getClass(), "timeNanos", 6967924379644551255L);
        setField(term210, term210.getClass(), "lastTaskInfo", term231);
        setIntField(term210, term210.getClass(), "taskCount", 1162663216);
        setLongField(term210, term210.getClass(), "totalTimeNanos", -2813493605142626659L);
        term247 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term247;
        callMethod(klass, "setKeepTaskList", argTypes, term210, args);
    }

};


