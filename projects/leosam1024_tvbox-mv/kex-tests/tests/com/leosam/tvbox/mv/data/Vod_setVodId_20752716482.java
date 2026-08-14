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

public class Vod_setVodId_20752716482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146;

    public Vod_setVodId_20752716482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1146 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1146, term1146.getClass(), "vodId", "nGKItKLYNC");
        setField(term1146, term1146.getClass(), "vodName", "UiUYnPrcCi");
        setField(term1146, term1146.getClass(), "vodActor", "UoYtihxVaS");
        setField(term1146, term1146.getClass(), "vodPlayFrom", "JDswTTCZHV");
        setField(term1146, term1146.getClass(), "vodPic", "onpbIeEKoi");
        setField(term1146, term1146.getClass(), "vodPlayUrl", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setVodId", argTypes, term1146, args);
    }

};


