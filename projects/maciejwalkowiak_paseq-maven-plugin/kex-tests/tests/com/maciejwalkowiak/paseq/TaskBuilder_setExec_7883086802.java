package com.maciejwalkowiak.paseq;

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
import static com.maciejwalkowiak.paseq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskBuilder_setExec_7883086802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249;
     Object term314;

    public TaskBuilder_setExec_7883086802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249 = newInstance(Class.forName("com.maciejwalkowiak.paseq.TaskBuilder"));
        Object[] term252 = (Object[]) newArray("java.lang.String", 3);
        Object term289 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term249, term249.getClass(), "async", false);
        setBooleanField(term249, term249.getClass(), "wait", false);
        setElement(term252, 0, "uuaPigETmJ");
        setElement(term252, 1, "MxlszYVzRf");
        setElement(term252, 2, "LQFpaHEwXR");
        setField(term249, term249.getClass(), "goals", term252);
        setField(term289, term289.getClass(), "command", "oVcInYnLWB");
        setField(term289, term289.getClass(), "directory", "aJlieCFVtF");
        setField(term249, term249.getClass(), "exec", term289);
        term314 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setField(term314, term314.getClass(), "command", "ZiaGIbnzTs");
        setField(term314, term314.getClass(), "directory", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.TaskBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.maciejwalkowiak.paseq.Exec");
        Object[] args = new Object[1];
        args[0] = term314;
        callMethod(klass, "setExec", argTypes, term249, args);
    }

};


