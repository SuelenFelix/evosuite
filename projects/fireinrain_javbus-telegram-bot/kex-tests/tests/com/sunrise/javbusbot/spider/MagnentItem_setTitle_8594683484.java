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

public class MagnentItem_setTitle_8594683484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21355;

    public MagnentItem_setTitle_8594683484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21355 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term21355, term21355.getClass(), "title", "FcuzXnxIut");
        setField(term21355, term21355.getClass(), "resolution", "fyepabvKPu");
        setField(term21355, term21355.getClass(), "subTitle", "igjhLhfUDg");
        setField(term21355, term21355.getClass(), "fileSize", "aphCSNJgJZ");
        setField(term21355, term21355.getClass(), "shareDate", "JtamsBczow");
        setField(term21355, term21355.getClass(), "magnentStr", "ckScPlFqWx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KIGJgoclUB";
        callMethod(klass, "setTitle", argTypes, term21355, args);
    }

};


