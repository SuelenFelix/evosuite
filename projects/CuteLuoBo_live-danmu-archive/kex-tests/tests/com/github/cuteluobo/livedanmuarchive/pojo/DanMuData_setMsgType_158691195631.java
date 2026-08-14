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

public class DanMuData_setMsgType_158691195631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202;

    public DanMuData_setMsgType_158691195631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        setField(term4202, term4202.getClass(), "userIfo", null);
        setField(term4202, term4202.getClass(), "content", null);
        setField(term4202, term4202.getClass(), "danMuFormatData", null);
        setField(term4202, term4202.getClass(), "timestamp", null);
        setField(term4202, term4202.getClass(), "msgType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMsgType", argTypes, term4202, args);
    }

};


