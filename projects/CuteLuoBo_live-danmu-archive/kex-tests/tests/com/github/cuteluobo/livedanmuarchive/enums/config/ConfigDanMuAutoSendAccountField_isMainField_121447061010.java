package com.github.cuteluobo.livedanmuarchive.enums.config;

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
import static com.github.cuteluobo.livedanmuarchive.enums.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ConfigDanMuAutoSendAccountField_isMainField_121447061010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public ConfigDanMuAutoSendAccountField_isMainField_121447061010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2964 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.config.ConfigDanMuAutoSendAccountField");
        Field term2963 = ((Class) term2964).getDeclaredField((String) "SEND_FAST_FAIL_DELAY");
        ((Field) term2963).setAccessible(true);
        enum3 = ((Field) term2963).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.config.ConfigDanMuAutoSendAccountField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMainField", argTypes, enum3, args);
    }

};


