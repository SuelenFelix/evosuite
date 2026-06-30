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
import java.lang.Boolean;

public class TgBotTokenResponse_setOk_13776187831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1955;
     Object term1987;

    public TgBotTokenResponse_setOk_13776187831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1955 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse"));
        Object term1957 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setBooleanField(term1955, term1955.getClass(), "ok", true);
        setIntField(term1957, term1957.getClass(), "id", 1725571209);
        setBooleanField(term1957, term1957.getClass(), "isBot", true);
        setField(term1957, term1957.getClass(), "firstName", "PHvxnGHptP");
        setField(term1957, term1957.getClass(), "username", "TimdotUuNC");
        setBooleanField(term1957, term1957.getClass(), "canJoinGroups", true);
        setBooleanField(term1957, term1957.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term1957, term1957.getClass(), "supportsInlineQueries", true);
        setField(term1955, term1955.getClass(), "result", term1957);
        term1987 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1987;
        callMethod(klass, "setOk", argTypes, term1955, args);
    }

};


