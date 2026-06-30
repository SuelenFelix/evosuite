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

public class TaskBuilder_waits_9860317154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;

    public TaskBuilder_waits_9860317154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546 = newInstance(Class.forName("com.maciejwalkowiak.paseq.TaskBuilder"));
        Object[] term549 = (Object[]) newArray("java.lang.String", 1);
        Object term562 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term546, term546.getClass(), "async", true);
        setBooleanField(term546, term546.getClass(), "wait", true);
        setElement(term549, 0, "BYqFIqCKAV");
        setField(term546, term546.getClass(), "goals", term549);
        setField(term562, term562.getClass(), "command", "vrQLuWIDJX");
        setField(term562, term562.getClass(), "directory", "flxyYxBRtu");
        setField(term546, term546.getClass(), "exec", term562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.TaskBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "waits", argTypes, term546, args);
    }

};


