package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph_toString_10216987261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5391;

    public Graph_toString_10216987261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5392 = new Long(-1468719814009985452L);
        ArrayList term5394 = new ArrayList();
        ((ArrayList) term5394).add("XkIoWJRNwN");
        ((ArrayList) term5394).add("aNWLJdrZMq");
        ((ArrayList) term5394).add("HHmNoYxIGj");
        ((ArrayList) term5394).add("PtirvZmsGt");
        ((ArrayList) term5394).add("HWkpTmtlrc");
        ((ArrayList) term5394).add("hMmaoREuCK");
        ((ArrayList) term5394).add("VeDtgDzGAN");
        ((ArrayList) term5394).add("aWYOWZFyaX");
        HashMap term5494 = new HashMap();
        term5391 = newInstance(Class.forName("org.s1ck.gdl.model.Graph"));
        setField(term5391, term5391.getClass(), "id", term5392);
        setField(term5391, term5391.getClass(), "labels", term5394);
        setField(term5391, term5391.getClass(), "properties", term5494);
        setField(term5391, term5391.getClass(), "variable", "BRIVNtfUWU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Graph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5391, args);
    }

};


