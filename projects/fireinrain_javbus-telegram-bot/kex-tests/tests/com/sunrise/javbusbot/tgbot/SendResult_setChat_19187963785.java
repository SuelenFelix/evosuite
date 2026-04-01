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

public class SendResult_setChat_19187963785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3976;
     Object term4089;

    public SendResult_setChat_19187963785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3976 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term3978 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term4027 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term3976, term3976.getClass(), "messageId", 679763016);
        setField(term3978, term3978.getClass(), "id", "smnHEqRFRx");
        setField(term3978, term3978.getClass(), "title", "XYtryyobou");
        setField(term3978, term3978.getClass(), "username", "OYbzXylRWW");
        setField(term3978, term3978.getClass(), "type", "DSNsTGYXDF");
        setField(term3976, term3976.getClass(), "senderChat", term3978);
        setField(term4027, term4027.getClass(), "id", "sQvGcVjdEx");
        setField(term4027, term4027.getClass(), "title", "rLHAoqXgPh");
        setField(term4027, term4027.getClass(), "username", "zUlRdimJtU");
        setField(term4027, term4027.getClass(), "type", "vwbEQQNQrx");
        setField(term3976, term3976.getClass(), "chat", term4027);
        setIntField(term3976, term3976.getClass(), "date", 1962444399);
        setField(term3976, term3976.getClass(), "text", "xtftXXMbem");
        term4089 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setField(term4089, term4089.getClass(), "id", "cudZvLMQon");
        setField(term4089, term4089.getClass(), "title", "lihXWlGDxk");
        setField(term4089, term4089.getClass(), "username", "JmcmxoGhIK");
        setField(term4089, term4089.getClass(), "type", "jXzmYyrnnT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sunrise.javbusbot.tgbot.Chat");
        Object[] args = new Object[1];
        args[0] = term4089;
        callMethod(klass, "setChat", argTypes, term3976, args);
    }

};


