package com.github.xabgesagtx.bots;

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
import static com.github.xabgesagtx.bots.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TelegramBotOptionsAutoConfiguration_1_getPasswordAuthentication_2047029661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2241;

    public TelegramBotOptionsAutoConfiguration_1_getPasswordAuthentication_2047029661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2241 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramBotOptionsAutoConfiguration$1"));
        Object term2254 = newInstance(Class.forName("java.net.InetAddress"));
        Object term2255 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        Object term2307 = newInstance(Class.forName("java.net.URL"));
        Object term2351 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term2353 = newInstance(Class.forName("java.net.Authenticator$RequestorType"));
        setField(term2241, term2241.getClass(), "this$0", null);
        setField(term2241, term2241.getClass(), "requestingHost", "SPpkrGcPRr");
        setField(term2255, term2255.getClass(), "originalHostName", null);
        setField(term2255, term2255.getClass(), "hostName", null);
        setIntField(term2255, term2255.getClass(), "address", 0);
        setIntField(term2255, term2255.getClass(), "family", 0);
        setField(term2254, term2254.getClass(), "holder", term2255);
        setField(term2254, term2254.getClass(), "canonicalHostName", "sEccwbJKYE");
        setField(term2241, term2241.getClass(), "requestingSite", term2254);
        setIntField(term2241, term2241.getClass(), "requestingPort", -1922583790);
        setField(term2241, term2241.getClass(), "requestingProtocol", "qxSDVejjiY");
        setField(term2241, term2241.getClass(), "requestingPrompt", "xBsXSDjXYK");
        setField(term2241, term2241.getClass(), "requestingScheme", "sEnIVFtZuQ");
        setField(term2307, term2307.getClass(), "protocol", "http");
        setField(term2307, term2307.getClass(), "host", "www.oracle.com");
        setIntField(term2307, term2307.getClass(), "port", -1);
        setField(term2307, term2307.getClass(), "file", "");
        setField(term2307, term2307.getClass(), "query", null);
        setField(term2307, term2307.getClass(), "authority", "www.oracle.com");
        setField(term2307, term2307.getClass(), "path", "");
        setField(term2307, term2307.getClass(), "userInfo", null);
        setField(term2307, term2307.getClass(), "ref", null);
        setField(term2307, term2307.getClass(), "hostAddress", null);
        setField(term2351, term2351.getClass(), "proxy", null);
        setIntField(term2351, term2351.getClass(), "proxyPort", -1);
        setField(term2307, term2307.getClass(), "handler", term2351);
        setField(term2307, term2307.getClass(), "tempState", null);
        setField(term2241, term2241.getClass(), "requestingURL", term2307);
        setField(term2353, term2353.getClass(), "name", "PROXY");
        setIntField(term2353, term2353.getClass(), "ordinal", 0);
        setField(term2241, term2241.getClass(), "requestingAuthType", term2353);
        setField(term2241, term2241.getClass(), "key", "ZVecLZMLHF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramBotOptionsAutoConfiguration$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term2241, args);
    }

};


