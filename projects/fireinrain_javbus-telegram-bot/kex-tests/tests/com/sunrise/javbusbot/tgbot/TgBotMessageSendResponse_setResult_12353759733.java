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

public class TgBotMessageSendResponse_setResult_12353759733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term528;

    public TgBotMessageSendResponse_setResult_12353759733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse"));
        Object term415 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term417 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term466 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setBooleanField(term413, term413.getClass(), "ok", false);
        setIntField(term415, term415.getClass(), "messageId", -1922583790);
        setField(term417, term417.getClass(), "id", "HyxfbSQYBe");
        setField(term417, term417.getClass(), "title", "pCTimMblYc");
        setField(term417, term417.getClass(), "username", "hNxWaHcfhY");
        setField(term417, term417.getClass(), "type", "RkybSrpybU");
        setField(term415, term415.getClass(), "senderChat", term417);
        setField(term466, term466.getClass(), "id", "xOEqzGAmDU");
        setField(term466, term466.getClass(), "title", "eZFUvlxvGV");
        setField(term466, term466.getClass(), "username", "BYqFIqCKAV");
        setField(term466, term466.getClass(), "type", "vrQLuWIDJX");
        setField(term415, term415.getClass(), "chat", term466);
        setIntField(term415, term415.getClass(), "date", -616727354);
        setField(term415, term415.getClass(), "text", "flxyYxBRtu");
        setField(term413, term413.getClass(), "result", term415);
        term528 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term530 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term579 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term528, term528.getClass(), "messageId", -1955890973);
        setField(term530, term530.getClass(), "id", "OclPbYPkcH");
        setField(term530, term530.getClass(), "title", "IoAlmYsBwc");
        setField(term530, term530.getClass(), "username", "TEParAifyi");
        setField(term530, term530.getClass(), "type", "OWDIEULEFu");
        setField(term528, term528.getClass(), "senderChat", term530);
        setField(term579, term579.getClass(), "id", "dWRymuLBtr");
        setField(term579, term579.getClass(), "title", "AijpHYOFuy");
        setField(term579, term579.getClass(), "username", "SbAoxhfrkn");
        setField(term579, term579.getClass(), "type", "kuTXqwMtDB");
        setField(term528, term528.getClass(), "chat", term579);
        setIntField(term528, term528.getClass(), "date", -2038273078);
        setField(term528, term528.getClass(), "text", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Object[] args = new Object[1];
        args[0] = term528;
        callMethod(klass, "setResult", argTypes, term413, args);
    }

};


