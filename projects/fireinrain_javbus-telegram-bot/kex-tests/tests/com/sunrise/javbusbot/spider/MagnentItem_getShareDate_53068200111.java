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

public class MagnentItem_getShareDate_53068200111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22374;

    public MagnentItem_getShareDate_53068200111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22374 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22374, term22374.getClass(), "title", "ZOcslmWgQG");
        setField(term22374, term22374.getClass(), "resolution", "YzxEEHlDUj");
        setField(term22374, term22374.getClass(), "subTitle", "UcCUEwaHWp");
        setField(term22374, term22374.getClass(), "fileSize", "IZewAlURAW");
        setField(term22374, term22374.getClass(), "shareDate", "RYptfEmCie");
        setField(term22374, term22374.getClass(), "magnentStr", "roQkSUEGom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShareDate", argTypes, term22374, args);
    }

};


