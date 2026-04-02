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

public class Results_getResults_1729682861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Results_getResults_1729682861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7 = new Integer(568599855);
        Object term4 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term6 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term4, term4.getClass(), "state", "");
        setField(term6, term6.getClass(), "type", null);
        setField(term6, term6.getClass(), "pagesExported", term7);
        setField(term6, term6.getClass(), "exportUrl", null);
        setField(term4, term4.getClass(), "status", term6);
        setField(term4, term4.getClass(), "error", "");
        Integer term13 = new Integer(1162663216);
        Object term10 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term12 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term10, term10.getClass(), "state", "");
        setField(term12, term12.getClass(), "type", null);
        setField(term12, term12.getClass(), "pagesExported", term13);
        setField(term12, term12.getClass(), "exportUrl", null);
        setField(term10, term10.getClass(), "status", term12);
        setField(term10, term10.getClass(), "error", "");
        Integer term19 = new Integer(1484323161);
        Object term16 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term18 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term16, term16.getClass(), "state", "");
        setField(term18, term18.getClass(), "type", null);
        setField(term18, term18.getClass(), "pagesExported", term19);
        setField(term18, term18.getClass(), "exportUrl", null);
        setField(term16, term16.getClass(), "status", term18);
        setField(term16, term16.getClass(), "error", "");
        Integer term25 = new Integer(391863371);
        Object term22 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term24 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term22, term22.getClass(), "state", "");
        setField(term24, term24.getClass(), "type", null);
        setField(term24, term24.getClass(), "pagesExported", term25);
        setField(term24, term24.getClass(), "exportUrl", null);
        setField(term22, term22.getClass(), "status", term24);
        setField(term22, term22.getClass(), "error", "");
        Integer term31 = new Integer(-1922583790);
        Object term28 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term30 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term28, term28.getClass(), "state", "");
        setField(term30, term30.getClass(), "type", null);
        setField(term30, term30.getClass(), "pagesExported", term31);
        setField(term30, term30.getClass(), "exportUrl", null);
        setField(term28, term28.getClass(), "status", term30);
        setField(term28, term28.getClass(), "error", "");
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term10);
        ((ArrayList) term2).add(term16);
        ((ArrayList) term2).add(term22);
        ((ArrayList) term2).add(term28);
        term1 = newInstance(Class.forName("com.greydev.notionbackup.model.Results"));
        setField(term1, term1.getClass(), "results", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Results");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResults", argTypes, term1, args);
    }

};


