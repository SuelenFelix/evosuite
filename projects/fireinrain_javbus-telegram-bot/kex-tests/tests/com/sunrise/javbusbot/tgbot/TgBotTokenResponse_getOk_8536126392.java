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

public class TgBotTokenResponse_getOk_8536126392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;

    public TgBotTokenResponse_getOk_8536126392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2009 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse"));
        Object term2011 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setBooleanField(term2009, term2009.getClass(), "ok", true);
        setIntField(term2011, term2011.getClass(), "id", -522618178);
        setBooleanField(term2011, term2011.getClass(), "isBot", false);
        setField(term2011, term2011.getClass(), "firstName", "PkWMRdJcBb");
        setField(term2011, term2011.getClass(), "username", "jSpAteRute");
        setBooleanField(term2011, term2011.getClass(), "canJoinGroups", true);
        setBooleanField(term2011, term2011.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2011, term2011.getClass(), "supportsInlineQueries", false);
        setField(term2009, term2009.getClass(), "result", term2011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOk", argTypes, term2009, args);
    }

};


