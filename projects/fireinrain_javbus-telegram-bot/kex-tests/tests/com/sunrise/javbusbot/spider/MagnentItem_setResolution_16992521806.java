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

public class MagnentItem_setResolution_16992521806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21643;

    public MagnentItem_setResolution_16992521806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21643 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term21643, term21643.getClass(), "title", "vwQAcJEANy");
        setField(term21643, term21643.getClass(), "resolution", "bakvKrXWXm");
        setField(term21643, term21643.getClass(), "subTitle", "ixpDCFiQaP");
        setField(term21643, term21643.getClass(), "fileSize", "vrRPhHcJDp");
        setField(term21643, term21643.getClass(), "shareDate", "GAfAmizshG");
        setField(term21643, term21643.getClass(), "magnentStr", "mouoQUznmq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WaacgRHGZQ";
        callMethod(klass, "setResolution", argTypes, term21643, args);
    }

};


