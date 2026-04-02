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

public class Result_isSuccess_11317836120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;

    public Result_isSuccess_11317836120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term758 = new Integer(-1145578966);
        term732 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term745 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term732, term732.getClass(), "state", "OJJtVNPyKZ");
        setField(term745, term745.getClass(), "type", "AKNapTAfmD");
        setField(term745, term745.getClass(), "pagesExported", term758);
        setField(term745, term745.getClass(), "exportUrl", "xJgPlLxpgC");
        setField(term732, term732.getClass(), "status", term745);
        setField(term732, term732.getClass(), "error", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term732, args);
    }

};


