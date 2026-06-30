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

public class MagnentItem_getMagnentStr_2804138071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20934;

    public MagnentItem_getMagnentStr_2804138071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20934 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term20934, term20934.getClass(), "title", "yDWoqUswuW");
        setField(term20934, term20934.getClass(), "resolution", "mgjEDzRwET");
        setField(term20934, term20934.getClass(), "subTitle", "CepeBzACyE");
        setField(term20934, term20934.getClass(), "fileSize", "WtgzEUhZIl");
        setField(term20934, term20934.getClass(), "shareDate", "tzigWGaijF");
        setField(term20934, term20934.getClass(), "magnentStr", "VWFNUuzpse");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMagnentStr", argTypes, term20934, args);
    }

};


