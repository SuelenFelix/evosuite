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

public class Result_isFailure_16962698351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;

    public Result_isFailure_16962698351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term850 = new Integer(679763016);
        term824 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term837 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term824, term824.getClass(), "state", "gCWtLVKVVe");
        setField(term837, term837.getClass(), "type", "fWKJoSoCwE");
        setField(term837, term837.getClass(), "pagesExported", term850);
        setField(term837, term837.getClass(), "exportUrl", "wfaXBpWAUH");
        setField(term824, term824.getClass(), "status", term837);
        setField(term824, term824.getClass(), "error", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFailure", argTypes, term824, args);
    }

};


