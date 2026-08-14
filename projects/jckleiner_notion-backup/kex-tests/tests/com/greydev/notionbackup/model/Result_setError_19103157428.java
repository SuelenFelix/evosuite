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

public class Result_setError_19103157428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1445;

    public Result_setError_19103157428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1471 = new Integer(-1016503459);
        term1445 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1458 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1445, term1445.getClass(), "state", "aWYOWZFyaX");
        setField(term1458, term1458.getClass(), "type", "BRIVNtfUWU");
        setField(term1458, term1458.getClass(), "pagesExported", term1471);
        setField(term1458, term1458.getClass(), "exportUrl", "DbiCVtPPCT");
        setField(term1445, term1445.getClass(), "status", term1458);
        setField(term1445, term1445.getClass(), "error", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        callMethod(klass, "setError", argTypes, term1445, args);
    }

};


