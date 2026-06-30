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
import java.lang.Boolean;

public class Result_setCanJoinGroups_16414478649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;
     Object term2703;

    public Result_setCanJoinGroups_16414478649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2673 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2673, term2673.getClass(), "id", -1007160944);
        setBooleanField(term2673, term2673.getClass(), "isBot", true);
        setField(term2673, term2673.getClass(), "firstName", "yGtHPyvYiQ");
        setField(term2673, term2673.getClass(), "username", "MvRIxilFMJ");
        setBooleanField(term2673, term2673.getClass(), "canJoinGroups", false);
        setBooleanField(term2673, term2673.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2673, term2673.getClass(), "supportsInlineQueries", true);
        term2703 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2703;
        callMethod(klass, "setCanJoinGroups", argTypes, term2673, args);
    }

};


