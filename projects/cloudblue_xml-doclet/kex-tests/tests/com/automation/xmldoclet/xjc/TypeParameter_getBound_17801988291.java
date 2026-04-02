package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class TypeParameter_getBound_17801988291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36491;

    public TypeParameter_getBound_17801988291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36492 = new ArrayList();
        ((ArrayList) term36492).add("GGZLBajwVD");
        ((ArrayList) term36492).add("daMQWBQbTQ");
        ((ArrayList) term36492).add("gvBtppHKAT");
        ((ArrayList) term36492).add("XASeUFhFfD");
        term36491 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeParameter"));
        setField(term36491, term36491.getClass(), "bound", term36492);
        setField(term36491, term36491.getClass(), "name", "BSCfmfVQJL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBound", argTypes, term36491, args);
    }

};


