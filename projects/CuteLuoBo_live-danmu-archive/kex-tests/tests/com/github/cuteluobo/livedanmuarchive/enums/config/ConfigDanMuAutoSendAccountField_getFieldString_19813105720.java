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

public class ConfigDanMuAutoSendAccountField_getFieldString_19813105720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum8;

    public ConfigDanMuAutoSendAccountField_getFieldString_19813105720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5377 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.config.ConfigDanMuAutoSendAccountField");
        Field term5376 = ((Class) term5377).getDeclaredField((String) "SEND_RANDOM_MIN_DELAY");
        ((Field) term5376).setAccessible(true);
        enum8 = ((Field) term5376).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.config.ConfigDanMuAutoSendAccountField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldString", argTypes, enum8, args);
    }

};


