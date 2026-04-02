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

public class NextcloudClient_uploadFileToNextcloud_10301693722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;
     Object term670;

    public NextcloudClient_uploadFileToNextcloud_10301693722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient"));
        setField(term633, term633.getClass(), "email", "pCTimMblYc");
        setField(term633, term633.getClass(), "password", "hNxWaHcfhY");
        setField(term633, term633.getClass(), "webdavUrl", "RkybSrpybU");
        Class<? extends Object> term736 = Class.forName((String) "java.io.File$PathStatus");
        Field term735 = ((Class) term736).getDeclaredField((String) "INVALID");
        ((Field) term735).setAccessible(true);
        Object enum1 = ((Field) term735).get((Object) null);
        term670 = newInstance(Class.forName("java.io.File"));
        setField(term670, term670.getClass(), "path", "xOEqzGAmDU");
        setField(term670, term670.getClass(), "status", enum1);
        setIntField(term670, term670.getClass(), "prefixLength", -1955890973);
        setField(term670, term670.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term670;
        callMethod(klass, "uploadFileToNextcloud", argTypes, term633, args);
    }

};


