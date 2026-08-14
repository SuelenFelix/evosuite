package com.microsoft.credentialstorage.implementation.macosx;

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
import static com.microsoft.credentialstorage.implementation.macosx.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KeychainSecurityCliStore_printQuotedObjects_85655258325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3318;

    public KeychainSecurityCliStore_printQuotedObjects_85655258325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3318 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "printQuotedObjects", argTypes, term3318, args);
    }

};


