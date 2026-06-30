package com.sunrise.javbusbot.tgbot;

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
import static com.sunrise.javbusbot.tgbot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Chat_setType_9367738647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1747;

    public Chat_setType_9367738647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1747 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setField(term1747, term1747.getClass(), "id", "vQVyKLdtaz");
        setField(term1747, term1747.getClass(), "title", "OWKQODBLzb");
        setField(term1747, term1747.getClass(), "username", "wGmYcqUkgE");
        setField(term1747, term1747.getClass(), "type", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Chat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        callMethod(klass, "setType", argTypes, term1747, args);
    }

};


