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

public class Result_hashCode_124117773411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1745;

    public Result_hashCode_124117773411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1771 = new Integer(-14890619);
        term1745 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1758 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1745, term1745.getClass(), "state", "xtftXXMbem");
        setField(term1758, term1758.getClass(), "type", "cudZvLMQon");
        setField(term1758, term1758.getClass(), "pagesExported", term1771);
        setField(term1758, term1758.getClass(), "exportUrl", "lihXWlGDxk");
        setField(term1745, term1745.getClass(), "status", term1758);
        setField(term1745, term1745.getClass(), "error", "JmcmxoGhIK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1745, args);
    }

};


