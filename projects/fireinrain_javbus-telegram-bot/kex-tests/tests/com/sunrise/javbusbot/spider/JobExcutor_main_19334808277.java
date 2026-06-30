package com.sunrise.javbusbot.spider;

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
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JobExcutor_main_19334808277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public JobExcutor_main_19334808277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1163 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1163, 0, "fbnKvthhOz");
        setElement(term1163, 1, "PGfCDJTBek");
        setElement(term1163, 2, "ZwjARhAtHC");
        setElement(term1163, 3, "XXvscsYBWv");
        setElement(term1163, 4, "uePedtiAfL");
        setElement(term1163, 5, "AdSHvysxQB");
        setElement(term1163, 6, "jlraKkBWFA");
        setElement(term1163, 7, "mRBtFTxVdE");
        setElement(term1163, 8, "IVacFDAZcj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JobExcutor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1163;
        callMethod(klass, "main", argTypes, null, args);
    }

};


