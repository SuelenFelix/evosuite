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

public class MagnentItem_setSubTitle_11755357768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21931;

    public MagnentItem_setSubTitle_11755357768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21931 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term21931, term21931.getClass(), "title", "VGeGoUWPCQ");
        setField(term21931, term21931.getClass(), "resolution", "ZjkLeKLILi");
        setField(term21931, term21931.getClass(), "subTitle", "CZAqWlBJTT");
        setField(term21931, term21931.getClass(), "fileSize", "WPMnhxMKAm");
        setField(term21931, term21931.getClass(), "shareDate", "tTGimFVzYt");
        setField(term21931, term21931.getClass(), "magnentStr", "bkFWSyioMj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XBzdZXeLDL";
        callMethod(klass, "setSubTitle", argTypes, term21931, args);
    }

};


