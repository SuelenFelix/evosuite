package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HuyaDanMuData_formatColor_15481848493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5849;

    public HuyaDanMuData_formatColor_15481848493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5849 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuyaDanMuData"));
        setField(term5849, term5849.getClass(), "userIfo", null);
        setField(term5849, term5849.getClass(), "content", null);
        setField(term5849, term5849.getClass(), "danMuFormatData", null);
        setField(term5849, term5849.getClass(), "timestamp", null);
        setField(term5849, term5849.getClass(), "msgType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuyaDanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "formatColor", argTypes, term5849, args);
    }

};


