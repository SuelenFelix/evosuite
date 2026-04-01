package com.sunrise.javbusbot.spider;

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
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JavbusStarInfoItem_setMessageChatId_12222339791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15417;

    public JavbusStarInfoItem_setMessageChatId_12222339791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15417 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15417, term15417.getClass(), "messageChatId", "xVwossmLda");
        setField(term15417, term15417.getClass(), "allFilmNum", "EvSQeALexj");
        setField(term15417, term15417.getClass(), "hasMagNum", "VuprBjhWdI");
        setField(term15417, term15417.getClass(), "headPhoto", "");
        setField(term15417, term15417.getClass(), "starName", "");
        setField(term15417, term15417.getClass(), "birthday", "");
        setField(term15417, term15417.getClass(), "age", "");
        setField(term15417, term15417.getClass(), "height", "");
        setField(term15417, term15417.getClass(), "cup", "");
        setField(term15417, term15417.getClass(), "chestCircumference", "");
        setField(term15417, term15417.getClass(), "waistline", "");
        setField(term15417, term15417.getClass(), "hips", "");
        setField(term15417, term15417.getClass(), "birthPlace", "");
        setField(term15417, term15417.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFGOXMbAUn";
        callMethod(klass, "setMessageChatId", argTypes, term15417, args);
    }

};


