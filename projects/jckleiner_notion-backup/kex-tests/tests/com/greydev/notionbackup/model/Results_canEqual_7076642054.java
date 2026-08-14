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

public class Results_canEqual_7076642054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term133;

    public Results_canEqual_7076642054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term104 = new Integer(-883034806);
        Object term101 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term103 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term101, term101.getClass(), "state", "");
        setField(term103, term103.getClass(), "type", null);
        setField(term103, term103.getClass(), "pagesExported", term104);
        setField(term103, term103.getClass(), "exportUrl", null);
        setField(term101, term101.getClass(), "status", term103);
        setField(term101, term101.getClass(), "error", "");
        Integer term110 = new Integer(1585847225);
        Object term107 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term109 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term107, term107.getClass(), "state", "");
        setField(term109, term109.getClass(), "type", null);
        setField(term109, term109.getClass(), "pagesExported", term110);
        setField(term109, term109.getClass(), "exportUrl", null);
        setField(term107, term107.getClass(), "status", term109);
        setField(term107, term107.getClass(), "error", "");
        Integer term116 = new Integer(597278769);
        Object term113 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term115 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term113, term113.getClass(), "state", "");
        setField(term115, term115.getClass(), "type", null);
        setField(term115, term115.getClass(), "pagesExported", term116);
        setField(term115, term115.getClass(), "exportUrl", null);
        setField(term113, term113.getClass(), "status", term115);
        setField(term113, term113.getClass(), "error", "");
        Integer term122 = new Integer(-1685132342);
        Object term119 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term121 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term119, term119.getClass(), "state", "");
        setField(term121, term121.getClass(), "type", null);
        setField(term121, term121.getClass(), "pagesExported", term122);
        setField(term121, term121.getClass(), "exportUrl", null);
        setField(term119, term119.getClass(), "status", term121);
        setField(term119, term119.getClass(), "error", "");
        Integer term128 = new Integer(-1456670397);
        Object term125 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term127 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term125, term125.getClass(), "state", "");
        setField(term127, term127.getClass(), "type", null);
        setField(term127, term127.getClass(), "pagesExported", term128);
        setField(term127, term127.getClass(), "exportUrl", null);
        setField(term125, term125.getClass(), "status", term127);
        setField(term125, term125.getClass(), "error", "");
        ArrayList term99 = new ArrayList();
        ((ArrayList) term99).add(term101);
        ((ArrayList) term99).add(term107);
        ((ArrayList) term99).add(term113);
        ((ArrayList) term99).add(term119);
        ((ArrayList) term99).add(term125);
        term98 = newInstance(Class.forName("com.greydev.notionbackup.model.Results"));
        setField(term98, term98.getClass(), "results", term99);
        term133 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Results");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term133;
        callMethod(klass, "canEqual", argTypes, term98, args);
    }

};


