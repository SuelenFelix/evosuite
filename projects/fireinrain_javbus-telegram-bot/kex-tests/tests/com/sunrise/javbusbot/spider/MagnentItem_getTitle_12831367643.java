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

public class MagnentItem_getTitle_12831367643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21222;

    public MagnentItem_getTitle_12831367643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21222 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term21222, term21222.getClass(), "title", "coDGKPmcIo");
        setField(term21222, term21222.getClass(), "resolution", "sNKnkClMjH");
        setField(term21222, term21222.getClass(), "subTitle", "DzuhSmFHcg");
        setField(term21222, term21222.getClass(), "fileSize", "lHFGeijIrp");
        setField(term21222, term21222.getClass(), "shareDate", "OjqiiqbEQC");
        setField(term21222, term21222.getClass(), "magnentStr", "lOnziohwRj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term21222, args);
    }

};


