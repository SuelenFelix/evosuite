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

public class HistoryResponse_toString_506940585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7626;

    public HistoryResponse_toString_506940585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7626 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term7627 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 2);
        Object term7628 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7666 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term7628, term7628.getClass(), "alertDate", "RCOqfVsRHt");
        setField(term7628, term7628.getClass(), "title", "TSyCeEZPaT");
        setField(term7628, term7628.getClass(), "data", "JeZFtaqkzW");
        setIntField(term7628, term7628.getClass(), "category", -157887805);
        setElement(term7627, 0, term7628);
        setField(term7666, term7666.getClass(), "alertDate", "vOVuNSCCLe");
        setField(term7666, term7666.getClass(), "title", "fzeqPnzpnt");
        setField(term7666, term7666.getClass(), "data", "RxbhrFBjkO");
        setIntField(term7666, term7666.getClass(), "category", 1876565163);
        setElement(term7627, 1, term7666);
        setField(term7626, term7626.getClass(), "history", term7627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7626, args);
    }

};


