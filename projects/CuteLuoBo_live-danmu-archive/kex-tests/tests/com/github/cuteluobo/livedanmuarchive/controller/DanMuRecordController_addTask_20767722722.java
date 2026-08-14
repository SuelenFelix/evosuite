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
import java.lang.Long;

public class DanMuRecordController_addTask_20767722722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object enum1;
     Object term96;

    public DanMuRecordController_addTask_20767722722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term151 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term150 = ((Class) term151).getDeclaredField((String) "SQLITE");
        ((Field) term150).setAccessible(true);
        enum0 = ((Field) term150).get((Object) null);
        Class<? extends Object> term575 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term574 = ((Class) term575).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term574).setAccessible(true);
        enum1 = ((Field) term574).get((Object) null);
        term96 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.controller.DanMuRecordController");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        argTypes[3] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        argTypes[4] = Class.forName("java.lang.Long");
        Object[] args = new Object[5];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = enum0;
        args[3] = enum1;
        args[4] = term96;
        callMethod(klass, "addTask", argTypes, null, args);
    }

};


