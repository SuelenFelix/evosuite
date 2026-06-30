package com.sunrise.javbusbot;

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
import static com.sunrise.javbusbot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelegramBotApp_1_getPasswordAuthentication_10866113913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public TelegramBotApp_1_getPasswordAuthentication_10866113913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1849 = newInstance(Class.forName("com.sunrise.javbusbot.TelegramBotApp$1"));
        setField(term1849, term1849.getClass(), "requestingHost", null);
        setField(term1849, term1849.getClass(), "requestingSite", null);
        setIntField(term1849, term1849.getClass(), "requestingPort", 0);
        setField(term1849, term1849.getClass(), "requestingProtocol", null);
        setField(term1849, term1849.getClass(), "requestingPrompt", null);
        setField(term1849, term1849.getClass(), "requestingScheme", null);
        setField(term1849, term1849.getClass(), "requestingURL", null);
        setField(term1849, term1849.getClass(), "requestingAuthType", null);
        setField(term1849, term1849.getClass(), "key", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.TelegramBotApp$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term1849, args);
    }

};


