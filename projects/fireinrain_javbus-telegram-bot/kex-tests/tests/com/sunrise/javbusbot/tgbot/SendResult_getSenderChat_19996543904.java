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

public class SendResult_getSenderChat_19996543904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3773;

    public SendResult_getSenderChat_19996543904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3773 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term3775 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term3824 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term3773, term3773.getClass(), "messageId", -469968304);
        setField(term3775, term3775.getClass(), "id", "PtirvZmsGt");
        setField(term3775, term3775.getClass(), "title", "HWkpTmtlrc");
        setField(term3775, term3775.getClass(), "username", "hMmaoREuCK");
        setField(term3775, term3775.getClass(), "type", "VeDtgDzGAN");
        setField(term3773, term3773.getClass(), "senderChat", term3775);
        setField(term3824, term3824.getClass(), "id", "aWYOWZFyaX");
        setField(term3824, term3824.getClass(), "title", "BRIVNtfUWU");
        setField(term3824, term3824.getClass(), "username", "DbiCVtPPCT");
        setField(term3824, term3824.getClass(), "type", "WzFopsaDuG");
        setField(term3773, term3773.getClass(), "chat", term3824);
        setIntField(term3773, term3773.getClass(), "date", -1145578966);
        setField(term3773, term3773.getClass(), "text", "PapWxkhEWe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSenderChat", argTypes, term3773, args);
    }

};


