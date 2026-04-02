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

public class Result_canEqual_180094025810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;
     Object term1704;

    public Result_canEqual_180094025810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1678 = new Integer(579005622);
        term1652 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1665 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1652, term1652.getClass(), "state", "sQvGcVjdEx");
        setField(term1665, term1665.getClass(), "type", "rLHAoqXgPh");
        setField(term1665, term1665.getClass(), "pagesExported", term1678);
        setField(term1665, term1665.getClass(), "exportUrl", "zUlRdimJtU");
        setField(term1652, term1652.getClass(), "status", term1665);
        setField(term1652, term1652.getClass(), "error", "vwbEQQNQrx");
        term1704 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1704;
        callMethod(klass, "canEqual", argTypes, term1652, args);
    }

};


