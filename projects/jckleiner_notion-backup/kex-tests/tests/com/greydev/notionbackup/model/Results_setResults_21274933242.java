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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import java.util.LinkedList;

public class Results_setResults_21274933242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term65;

    public Results_setResults_21274933242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42 = new Integer(-616727354);
        Object term39 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term41 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term39, term39.getClass(), "state", "");
        setField(term41, term41.getClass(), "type", null);
        setField(term41, term41.getClass(), "pagesExported", term42);
        setField(term41, term41.getClass(), "exportUrl", null);
        setField(term39, term39.getClass(), "status", term41);
        setField(term39, term39.getClass(), "error", "");
        Integer term48 = new Integer(-1955890973);
        Object term45 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term47 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term45, term45.getClass(), "state", "");
        setField(term47, term47.getClass(), "type", null);
        setField(term47, term47.getClass(), "pagesExported", term48);
        setField(term47, term47.getClass(), "exportUrl", null);
        setField(term45, term45.getClass(), "status", term47);
        setField(term45, term45.getClass(), "error", "");
        Integer term54 = new Integer(-2038273078);
        Object term51 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term53 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term51, term51.getClass(), "state", "");
        setField(term53, term53.getClass(), "type", null);
        setField(term53, term53.getClass(), "pagesExported", term54);
        setField(term53, term53.getClass(), "exportUrl", null);
        setField(term51, term51.getClass(), "status", term53);
        setField(term51, term51.getClass(), "error", "");
        Integer term60 = new Integer(1227103734);
        Object term57 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term59 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term57, term57.getClass(), "state", "");
        setField(term59, term59.getClass(), "type", null);
        setField(term59, term59.getClass(), "pagesExported", term60);
        setField(term59, term59.getClass(), "exportUrl", null);
        setField(term57, term57.getClass(), "status", term59);
        setField(term57, term57.getClass(), "error", "");
        ArrayList term37 = new ArrayList();
        ((ArrayList) term37).add(term39);
        ((ArrayList) term37).add(term45);
        ((ArrayList) term37).add(term51);
        ((ArrayList) term37).add(term57);
        term36 = newInstance(Class.forName("com.greydev.notionbackup.model.Results"));
        setField(term36, term36.getClass(), "results", term37);
        term65 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Results");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term65;
        callMethod(klass, "setResults", argTypes, term36, args);
    }

};


