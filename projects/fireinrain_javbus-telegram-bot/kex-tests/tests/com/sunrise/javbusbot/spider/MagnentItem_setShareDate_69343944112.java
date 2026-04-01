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

public class MagnentItem_setShareDate_69343944112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22507;

    public MagnentItem_setShareDate_69343944112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22507 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22507, term22507.getClass(), "title", "sKmuUYuuTa");
        setField(term22507, term22507.getClass(), "resolution", "KxdfNdyjGO");
        setField(term22507, term22507.getClass(), "subTitle", "vPinPzceBb");
        setField(term22507, term22507.getClass(), "fileSize", "jPhUwTVUvX");
        setField(term22507, term22507.getClass(), "shareDate", "GIBMEPcBjc");
        setField(term22507, term22507.getClass(), "magnentStr", "noofsnMNpz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zorMRlODHM";
        callMethod(klass, "setShareDate", argTypes, term22507, args);
    }

};


