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

public class Result_setStatus_19007989967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;
     Object term1358;

    public Result_setStatus_19007989967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1332 = new Integer(1876565163);
        term1306 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1319 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1306, term1306.getClass(), "state", "aNWLJdrZMq");
        setField(term1319, term1319.getClass(), "type", "HHmNoYxIGj");
        setField(term1319, term1319.getClass(), "pagesExported", term1332);
        setField(term1319, term1319.getClass(), "exportUrl", "PtirvZmsGt");
        setField(term1306, term1306.getClass(), "status", term1319);
        setField(term1306, term1306.getClass(), "error", "HWkpTmtlrc");
        Integer term1371 = new Integer(-817164822);
        term1358 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1358, term1358.getClass(), "type", "hMmaoREuCK");
        setField(term1358, term1358.getClass(), "pagesExported", term1371);
        setField(term1358, term1358.getClass(), "exportUrl", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.greydev.notionbackup.model.Status");
        Object[] args = new Object[1];
        args[0] = term1358;
        callMethod(klass, "setStatus", argTypes, term1306, args);
    }

};


