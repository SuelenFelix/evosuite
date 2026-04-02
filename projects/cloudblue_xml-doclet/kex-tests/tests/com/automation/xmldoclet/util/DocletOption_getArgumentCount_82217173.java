package com.automation.xmldoclet.util;

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
import static com.automation.xmldoclet.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DocletOption_getArgumentCount_82217173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public DocletOption_getArgumentCount_82217173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term283 = new ArrayList();
        term282 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term282, term282.getClass(), "names", term283);
        setField(term282, term282.getClass(), "parameters", "tbcdzjIfER");
        setField(term282, term282.getClass(), "description", "HyxfbSQYBe");
        setIntField(term282, term282.getClass(), "argumentCount", 1162663216);
        setField(term282, term282.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgumentCount", argTypes, term282, args);
    }

};


