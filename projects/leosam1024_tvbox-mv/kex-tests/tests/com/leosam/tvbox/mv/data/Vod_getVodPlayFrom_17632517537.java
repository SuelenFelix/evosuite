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

public class Vod_getVodPlayFrom_17632517537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;

    public Vod_getVodPlayFrom_17632517537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1877 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1877, term1877.getClass(), "vodId", "bWWfajKbEX");
        setField(term1877, term1877.getClass(), "vodName", "cAPeiZHKGJ");
        setField(term1877, term1877.getClass(), "vodActor", "LvJFtLBaxj");
        setField(term1877, term1877.getClass(), "vodPlayFrom", "PHvxnGHptP");
        setField(term1877, term1877.getClass(), "vodPic", "TimdotUuNC");
        setField(term1877, term1877.getClass(), "vodPlayUrl", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodPlayFrom", argTypes, term1877, args);
    }

};


