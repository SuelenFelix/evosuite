package com.github.cuteluobo.livedanmuarchive.controller;

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
import static com.github.cuteluobo.livedanmuarchive.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DanMuRecordController_restartTask_14920148784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public DanMuRecordController_restartTask_14920148784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1020 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1019 = ((Class) term1020).getDeclaredField((String) "Bil");
        ((Field) term1019).setAccessible(true);
        enum2 = ((Field) term1019).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.controller.DanMuRecordController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum2;
        args[1] = "MuLcgQHgqz";
        args[2] = "xxtlPwDYFs";
        callMethod(klass, "restartTask", argTypes, null, args);
    }

};


