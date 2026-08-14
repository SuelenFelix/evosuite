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

public class ObjectFactory_createEnumConstant_214331684427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45505;

    public ObjectFactory_createEnumConstant_214331684427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45505 = newInstance(Class.forName("com.automation.xmldoclet.xjc.ObjectFactory"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.ObjectFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createEnumConstant", argTypes, term45505, args);
    }

};


