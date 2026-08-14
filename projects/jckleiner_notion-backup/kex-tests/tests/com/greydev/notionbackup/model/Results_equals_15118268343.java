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

public class Results_equals_15118268343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term97;

    public Results_equals_15118268343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term74 = new Integer(-1339778481);
        Object term71 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term73 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term71, term71.getClass(), "state", "");
        setField(term73, term73.getClass(), "type", null);
        setField(term73, term73.getClass(), "pagesExported", term74);
        setField(term73, term73.getClass(), "exportUrl", null);
        setField(term71, term71.getClass(), "status", term73);
        setField(term71, term71.getClass(), "error", "");
        Integer term80 = new Integer(1725571209);
        Object term77 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term79 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term77, term77.getClass(), "state", "");
        setField(term79, term79.getClass(), "type", null);
        setField(term79, term79.getClass(), "pagesExported", term80);
        setField(term79, term79.getClass(), "exportUrl", null);
        setField(term77, term77.getClass(), "status", term79);
        setField(term77, term77.getClass(), "error", "");
        Integer term86 = new Integer(-522618178);
        Object term83 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term85 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term83, term83.getClass(), "state", "");
        setField(term85, term85.getClass(), "type", null);
        setField(term85, term85.getClass(), "pagesExported", term86);
        setField(term85, term85.getClass(), "exportUrl", null);
        setField(term83, term83.getClass(), "status", term85);
        setField(term83, term83.getClass(), "error", "");
        Integer term92 = new Integer(1134449235);
        Object term89 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term91 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term89, term89.getClass(), "state", "");
        setField(term91, term91.getClass(), "type", null);
        setField(term91, term91.getClass(), "pagesExported", term92);
        setField(term91, term91.getClass(), "exportUrl", null);
        setField(term89, term89.getClass(), "status", term91);
        setField(term89, term89.getClass(), "error", "");
        ArrayList term69 = new ArrayList();
        ((ArrayList) term69).add(term71);
        ((ArrayList) term69).add(term77);
        ((ArrayList) term69).add(term83);
        ((ArrayList) term69).add(term89);
        term68 = newInstance(Class.forName("com.greydev.notionbackup.model.Results"));
        setField(term68, term68.getClass(), "results", term69);
        term97 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Results");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term97;
        callMethod(klass, "equals", argTypes, term68, args);
    }

};


