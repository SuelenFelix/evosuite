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

public class SendResult_getText_6846629410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5104;

    public SendResult_getText_6846629410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5104 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term5106 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term5155 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term5104, term5104.getClass(), "messageId", 1632125673);
        setField(term5106, term5106.getClass(), "id", "zcorEihhLK");
        setField(term5106, term5106.getClass(), "title", "GrqozDKFOk");
        setField(term5106, term5106.getClass(), "username", "CFyoseFGLF");
        setField(term5106, term5106.getClass(), "type", "SFqCrhEWLm");
        setField(term5104, term5104.getClass(), "senderChat", term5106);
        setField(term5155, term5155.getClass(), "id", "GZdcJyZntS");
        setField(term5155, term5155.getClass(), "title", "OIHoJeysUi");
        setField(term5155, term5155.getClass(), "username", "WXMWFDGcLB");
        setField(term5155, term5155.getClass(), "type", "wKWbJssZuG");
        setField(term5104, term5104.getClass(), "chat", term5155);
        setIntField(term5104, term5104.getClass(), "date", 454281060);
        setField(term5104, term5104.getClass(), "text", "NzBMMhkhpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term5104, args);
    }

};


