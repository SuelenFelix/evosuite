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

public class SetWebhookBuilderFactory_init_12892424970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SetWebhookBuilderFactory_init_12892424970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1, term1.getClass(), "externalUrl", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "internalUrl", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "keyStore", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "keyStorePassword", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "pathToCertificate", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.SetWebhookBuilderFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


