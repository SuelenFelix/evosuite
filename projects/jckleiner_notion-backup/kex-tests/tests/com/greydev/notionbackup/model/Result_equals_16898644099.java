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

public class Result_equals_16898644099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1559;
     Object term1611;

    public Result_equals_16898644099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1585 = new Integer(-1968847291);
        term1559 = newInstance(Class.forName("com.greydev.notionbackup.model.Result"));
        Object term1572 = newInstance(Class.forName("com.greydev.notionbackup.model.Status"));
        setField(term1559, term1559.getClass(), "state", "smnHEqRFRx");
        setField(term1572, term1572.getClass(), "type", "XYtryyobou");
        setField(term1572, term1572.getClass(), "pagesExported", term1585);
        setField(term1572, term1572.getClass(), "exportUrl", "OYbzXylRWW");
        setField(term1559, term1559.getClass(), "status", term1572);
        setField(term1559, term1559.getClass(), "error", "DSNsTGYXDF");
        term1611 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.model.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1611;
        callMethod(klass, "equals", argTypes, term1559, args);
    }

};


