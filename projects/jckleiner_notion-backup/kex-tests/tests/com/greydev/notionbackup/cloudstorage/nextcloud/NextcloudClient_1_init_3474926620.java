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

public class NextcloudClient_1_init_3474926620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NextcloudClient_1_init_3474926620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient"));
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "webdavUrl", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


