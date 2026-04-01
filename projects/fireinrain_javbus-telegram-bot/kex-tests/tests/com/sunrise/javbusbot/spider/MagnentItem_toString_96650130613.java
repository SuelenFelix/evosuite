package com.sunrise.javbusbot.spider;

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
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MagnentItem_toString_96650130613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22662;

    public MagnentItem_toString_96650130613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22662 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22662, term22662.getClass(), "title", "xLZEtHhKOn");
        setField(term22662, term22662.getClass(), "resolution", "wfqnUhLFCy");
        setField(term22662, term22662.getClass(), "subTitle", "UKRJIjNXmC");
        setField(term22662, term22662.getClass(), "fileSize", "CJBElYMXZF");
        setField(term22662, term22662.getClass(), "shareDate", "uZOAWgAORh");
        setField(term22662, term22662.getClass(), "magnentStr", "fmFvklptLM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22662, args);
    }

};


