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

public class TaskBuilder_setGoals_9134053701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term90;

    public TaskBuilder_setGoals_9134053701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.maciejwalkowiak.paseq.TaskBuilder"));
        Object[] term4 = (Object[]) newArray("java.lang.String", 5);
        Object term65 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1, term1.getClass(), "async", false);
        setBooleanField(term1, term1.getClass(), "wait", false);
        setElement(term4, 0, "PAEBtnZtTD");
        setElement(term4, 1, "sjlJAEtRrb");
        setElement(term4, 2, "MuLcgQHgqz");
        setElement(term4, 3, "xxtlPwDYFs");
        setElement(term4, 4, "jJCZpVmanW");
        setField(term1, term1.getClass(), "goals", term4);
        setField(term65, term65.getClass(), "command", "EGtDIRbSSb");
        setField(term65, term65.getClass(), "directory", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "exec", term65);
        term90 = (Object[]) newArray("java.lang.String", 4);
        setElement(term90, 0, "MjGYSRKTNF");
        setElement(term90, 1, "hRNSzYYIrc");
        setElement(term90, 2, "RMFIsYGgne");
        setElement(term90, 3, "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.TaskBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "setGoals", argTypes, term1, args);
    }

};


