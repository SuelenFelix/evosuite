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
import java.lang.Object;
import java.lang.Integer;

public class SendResult_setDate_14787038287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4471;
     Object term4584;

    public SendResult_setDate_14787038287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4471 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term4473 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term4522 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term4471, term4471.getClass(), "messageId", -157887805);
        setField(term4473, term4473.getClass(), "id", "kNqaJKIATy");
        setField(term4473, term4473.getClass(), "title", "vKQukfbJUd");
        setField(term4473, term4473.getClass(), "username", "lFRJFUMVbx");
        setField(term4473, term4473.getClass(), "type", "sZdUNdggUW");
        setField(term4471, term4471.getClass(), "senderChat", term4473);
        setField(term4522, term4522.getClass(), "id", "OqbwYQfvAe");
        setField(term4522, term4522.getClass(), "title", "tRxZafjqIx");
        setField(term4522, term4522.getClass(), "username", "DhjNLmRMCu");
        setField(term4522, term4522.getClass(), "type", "PgPzMSEjjX");
        setField(term4471, term4471.getClass(), "chat", term4522);
        setIntField(term4471, term4471.getClass(), "date", 1876565163);
        setField(term4471, term4471.getClass(), "text", "wzsPSPcRdj");
        term4584 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4584;
        callMethod(klass, "setDate", argTypes, term4471, args);
    }

};


