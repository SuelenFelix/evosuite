package com.greydev.notionbackup.cloudstorage.nextcloud;

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
import static com.greydev.notionbackup.cloudstorage.nextcloud.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NextcloudClient_upload_14514833301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;
     Object term403;

    public NextcloudClient_upload_14514833301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient"));
        setField(term366, term366.getClass(), "email", "aJlieCFVtF");
        setField(term366, term366.getClass(), "password", "ZiaGIbnzTs");
        setField(term366, term366.getClass(), "webdavUrl", "tbcdzjIfER");
        Class<? extends Object> term491 = Class.forName((String) "java.io.File$PathStatus");
        Field term490 = ((Class) term491).getDeclaredField((String) "INVALID");
        ((Field) term490).setAccessible(true);
        Object enum0 = ((Field) term490).get((Object) null);
        term403 = newInstance(Class.forName("java.io.File"));
        setField(term403, term403.getClass(), "path", "HyxfbSQYBe");
        setField(term403, term403.getClass(), "status", enum0);
        setIntField(term403, term403.getClass(), "prefixLength", -616727354);
        setField(term403, term403.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term403;
        callMethod(klass, "upload", argTypes, term366, args);
    }

};


