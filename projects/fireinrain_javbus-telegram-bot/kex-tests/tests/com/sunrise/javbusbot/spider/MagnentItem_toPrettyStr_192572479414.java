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

public class MagnentItem_toPrettyStr_192572479414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22795;

    public MagnentItem_toPrettyStr_192572479414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22795 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22795, term22795.getClass(), "title", "CYfPHswxIT");
        setField(term22795, term22795.getClass(), "resolution", "IDibKvfdDt");
        setField(term22795, term22795.getClass(), "subTitle", "sKLtBTAssF");
        setField(term22795, term22795.getClass(), "fileSize", "ROGqSdboUf");
        setField(term22795, term22795.getClass(), "shareDate", "NfGNgrTcyY");
        setField(term22795, term22795.getClass(), "magnentStr", "uPuFIjvpsv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettyStr", argTypes, term22795, args);
    }

};


