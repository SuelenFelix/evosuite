package com.greydev.notionbackup.model;

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
import static com.greydev.notionbackup.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Result_getError_14866473265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;

    public Result_getError_14866473265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1126 = new Integer(-602026508);
        term1100 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1113 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1100, term1100.getClass(), "state", "UfQtPRyWRC");
        setField(term1113, term1113.getClass(), "type", "FPvxVzzSvD");
        setField(term1113, term1113.getClass(), "pagesExported", term1126);
        setField(term1113, term1113.getClass(), "exportUrl", "WHcwFgsGFC");
        setField(term1100, term1100.getClass(), "status", term1113);
        setField(term1100, term1100.getClass(), "error", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term1100, args);
    }

};


