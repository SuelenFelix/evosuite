package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HistoryResponse_equals_9087523072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6666;
     Object term6744;

    public HistoryResponse_equals_9087523072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6666 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term6667 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 2);
        Object term6668 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6706 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term6668, term6668.getClass(), "alertDate", "DIbeDHICho");
        setField(term6668, term6668.getClass(), "title", "dJGPlmSRnz");
        setField(term6668, term6668.getClass(), "data", "DPskuFUobI");
        setIntField(term6668, term6668.getClass(), "category", -244121226);
        setElement(term6667, 0, term6668);
        setField(term6706, term6706.getClass(), "alertDate", "wBGfLpNNiZ");
        setField(term6706, term6706.getClass(), "title", "yUGCjlqgJE");
        setField(term6706, term6706.getClass(), "data", "PXdVZyoJyC");
        setIntField(term6706, term6706.getClass(), "category", -203030934);
        setElement(term6667, 1, term6706);
        setField(term6666, term6666.getClass(), "history", term6667);
        term6744 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6744;
        callMethod(klass, "equals", argTypes, term6666, args);
    }

};


