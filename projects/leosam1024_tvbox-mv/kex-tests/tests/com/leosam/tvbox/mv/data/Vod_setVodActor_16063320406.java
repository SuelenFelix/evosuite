package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vod_setVodActor_16063320406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1722;

    public Vod_setVodActor_16063320406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1722 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1722, term1722.getClass(), "vodId", "oVgzLbrsFr");
        setField(term1722, term1722.getClass(), "vodName", "vQVyKLdtaz");
        setField(term1722, term1722.getClass(), "vodActor", "OWKQODBLzb");
        setField(term1722, term1722.getClass(), "vodPlayFrom", "wGmYcqUkgE");
        setField(term1722, term1722.getClass(), "vodPic", "idgaQsnJpQ");
        setField(term1722, term1722.getClass(), "vodPlayUrl", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "setVodActor", argTypes, term1722, args);
    }

};


