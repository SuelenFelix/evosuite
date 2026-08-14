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

public class NextcloudClient_upload_14514833304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878;

    public NextcloudClient_upload_14514833304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term878 = newInstance(Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient"));
        setField(term878, term878.getClass(), "email", null);
        setField(term878, term878.getClass(), "password", null);
        setField(term878, term878.getClass(), "webdavUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "upload", argTypes, term878, args);
    }

};


