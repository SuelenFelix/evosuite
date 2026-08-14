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

public class TelegramProperties_setExternalUrl_113280757810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public TelegramProperties_setExternalUrl_113280757810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1111, term1111.getClass(), "externalUrl", "nGKItKLYNC");
        setField(term1111, term1111.getClass(), "internalUrl", "UiUYnPrcCi");
        setField(term1111, term1111.getClass(), "keyStore", "UoYtihxVaS");
        setField(term1111, term1111.getClass(), "keyStorePassword", "JDswTTCZHV");
        setField(term1111, term1111.getClass(), "pathToCertificate", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setExternalUrl", argTypes, term1111, args);
    }

};


