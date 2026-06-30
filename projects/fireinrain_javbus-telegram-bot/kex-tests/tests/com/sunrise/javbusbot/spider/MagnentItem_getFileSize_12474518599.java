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

public class MagnentItem_getFileSize_12474518599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22086;

    public MagnentItem_getFileSize_12474518599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22086 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22086, term22086.getClass(), "title", "eTycxkowtY");
        setField(term22086, term22086.getClass(), "resolution", "ozlrFdNXle");
        setField(term22086, term22086.getClass(), "subTitle", "vjUObaeMjo");
        setField(term22086, term22086.getClass(), "fileSize", "JsIgccyWag");
        setField(term22086, term22086.getClass(), "shareDate", "qSfmbHSpyF");
        setField(term22086, term22086.getClass(), "magnentStr", "nfLAMGBNLz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileSize", argTypes, term22086, args);
    }

};


