package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class DanMuUserInfoModel_toString_9196222184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2874;

    public DanMuUserInfoModel_toString_9196222184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2875 = new Integer(-1087774327);
        Long term2877 = new Long(-2255965562447970862L);
        term2874 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term2874, term2874.getClass(), "id", term2875);
        setField(term2874, term2874.getClass(), "addTime", term2877);
        setField(term2874, term2874.getClass(), "uid", "BKLfkLiZTH");
        setField(term2874, term2874.getClass(), "nickName", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2874, args);
    }

};


