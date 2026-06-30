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

public class SendResult_setText_17883428629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4879;

    public SendResult_setText_17883428629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4879 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term4881 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term4930 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term4879, term4879.getClass(), "messageId", 579005622);
        setField(term4881, term4881.getClass(), "id", "tlzpzIjMib");
        setField(term4881, term4881.getClass(), "title", "AZdLeSugwv");
        setField(term4881, term4881.getClass(), "username", "RMsXuyzKJV");
        setField(term4881, term4881.getClass(), "type", "FwPbDZcHmB");
        setField(term4879, term4879.getClass(), "senderChat", term4881);
        setField(term4930, term4930.getClass(), "id", "hOncybyCAH");
        setField(term4930, term4930.getClass(), "title", "QduALnDSVo");
        setField(term4930, term4930.getClass(), "username", "izPpKDErnQ");
        setField(term4930, term4930.getClass(), "type", "NnpwZBUTvx");
        setField(term4879, term4879.getClass(), "chat", term4930);
        setIntField(term4879, term4879.getClass(), "date", -14890619);
        setField(term4879, term4879.getClass(), "text", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PCipZnmBOF";
        callMethod(klass, "setText", argTypes, term4879, args);
    }

};


