package com.github.xabgesagtx.bots;

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
import static com.github.xabgesagtx.bots.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelegramProperties_hasExternalUrl_8929524833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public TelegramProperties_hasExternalUrl_8929524833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term445, term445.getClass(), "externalUrl", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "internalUrl", "RkybSrpybU");
        setField(term445, term445.getClass(), "keyStore", "xOEqzGAmDU");
        setField(term445, term445.getClass(), "keyStorePassword", "eZFUvlxvGV");
        setField(term445, term445.getClass(), "pathToCertificate", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasExternalUrl", argTypes, term445, args);
    }

};


