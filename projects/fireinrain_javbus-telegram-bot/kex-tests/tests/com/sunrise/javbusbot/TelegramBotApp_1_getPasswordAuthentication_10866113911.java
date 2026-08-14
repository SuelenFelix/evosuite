package com.sunrise.javbusbot;

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
import static com.sunrise.javbusbot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TelegramBotApp_1_getPasswordAuthentication_10866113911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;

    public TelegramBotApp_1_getPasswordAuthentication_10866113911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1539 = newInstance(Class.forName("com.sunrise.javbusbot.TelegramBotApp$1"));
        Object term1552 = newInstance(Class.forName("java.net.InetAddress"));
        Object term1553 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        Object term1605 = newInstance(Class.forName("java.net.URL"));
        Object term1649 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term1651 = newInstance(Class.forName("java.net.Authenticator$RequestorType"));
        setField(term1539, term1539.getClass(), "requestingHost", "zMsSLTfGhl");
        setField(term1553, term1553.getClass(), "originalHostName", null);
        setField(term1553, term1553.getClass(), "hostName", null);
        setIntField(term1553, term1553.getClass(), "address", 0);
        setIntField(term1553, term1553.getClass(), "family", 0);
        setField(term1552, term1552.getClass(), "holder", term1553);
        setField(term1552, term1552.getClass(), "canonicalHostName", "bEmHScVZaQ");
        setField(term1539, term1539.getClass(), "requestingSite", term1552);
        setIntField(term1539, term1539.getClass(), "requestingPort", 679763016);
        setField(term1539, term1539.getClass(), "requestingProtocol", "zHvfKaOstO");
        setField(term1539, term1539.getClass(), "requestingPrompt", "tOszriqETr");
        setField(term1539, term1539.getClass(), "requestingScheme", "ncSPTkhKjO");
        setField(term1605, term1605.getClass(), "protocol", "http");
        setField(term1605, term1605.getClass(), "host", "www.oracle.com");
        setIntField(term1605, term1605.getClass(), "port", -1);
        setField(term1605, term1605.getClass(), "file", "");
        setField(term1605, term1605.getClass(), "query", null);
        setField(term1605, term1605.getClass(), "authority", "www.oracle.com");
        setField(term1605, term1605.getClass(), "path", "");
        setField(term1605, term1605.getClass(), "userInfo", null);
        setField(term1605, term1605.getClass(), "ref", null);
        setField(term1605, term1605.getClass(), "hostAddress", null);
        setField(term1649, term1649.getClass(), "proxy", null);
        setIntField(term1649, term1649.getClass(), "proxyPort", -1);
        setField(term1605, term1605.getClass(), "handler", term1649);
        setField(term1605, term1605.getClass(), "tempState", null);
        setField(term1539, term1539.getClass(), "requestingURL", term1605);
        setField(term1651, term1651.getClass(), "name", "PROXY");
        setIntField(term1651, term1651.getClass(), "ordinal", 0);
        setField(term1539, term1539.getClass(), "requestingAuthType", term1651);
        setField(term1539, term1539.getClass(), "key", "565341243-1@com.sunrise.javbusbot.TelegramBotApp$1");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.TelegramBotApp$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term1539, args);
    }

};


