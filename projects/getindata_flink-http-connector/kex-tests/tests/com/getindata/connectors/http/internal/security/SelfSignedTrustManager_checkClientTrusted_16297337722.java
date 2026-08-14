package com.getindata.connectors.http.internal.security;

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
import static com.getindata.connectors.http.internal.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SelfSignedTrustManager_checkClientTrusted_16297337722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term369;
     Object term382;

    public SelfSignedTrustManager_checkClientTrusted_16297337722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager"));
        setField(term368, term368.getClass(), "delegate", null);
        term369 = (Object[]) newArray("java.security.cert.X509Certificate", 6);
        term382 = newInstance(Class.forName("java.net.Socket"));
        Object term387 = newInstance(Class.forName("java.lang.Object"));
        Object term390 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term399 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term382, term382.getClass(), "created", false);
        setBooleanField(term382, term382.getClass(), "bound", true);
        setBooleanField(term382, term382.getClass(), "connected", false);
        setBooleanField(term382, term382.getClass(), "closed", false);
        setField(term382, term382.getClass(), "closeLock", term387);
        setBooleanField(term382, term382.getClass(), "shutIn", true);
        setBooleanField(term382, term382.getClass(), "shutOut", true);
        setField(term390, term390.getClass(), "server", null);
        setIntField(term390, term390.getClass(), "serverPort", 1080);
        setField(term390, term390.getClass(), "external_address", null);
        setBooleanField(term390, term390.getClass(), "useV4", false);
        setField(term390, term390.getClass(), "cmdsock", null);
        setField(term390, term390.getClass(), "cmdIn", null);
        setField(term390, term390.getClass(), "cmdOut", null);
        setBooleanField(term390, term390.getClass(), "applicationSetProxy", false);
        setIntField(term390, term390.getClass(), "timeout", 0);
        setIntField(term390, term390.getClass(), "trafficClass", 0);
        setBooleanField(term390, term390.getClass(), "shut_rd", false);
        setBooleanField(term390, term390.getClass(), "shut_wr", false);
        setField(term390, term390.getClass(), "socketInputStream", null);
        setField(term390, term390.getClass(), "socketOutputStream", null);
        setIntField(term390, term390.getClass(), "fdUseCount", 0);
        setField(term390, term390.getClass(), "fdLock", term399);
        setBooleanField(term390, term390.getClass(), "closePending", false);
        setBooleanField(term390, term390.getClass(), "connectionReset", false);
        setBooleanField(term390, term390.getClass(), "stream", false);
        setField(term390, term390.getClass(), "socket", term382);
        setField(term390, term390.getClass(), "serverSocket", null);
        setField(term390, term390.getClass(), "fd", null);
        setField(term390, term390.getClass(), "address", null);
        setIntField(term390, term390.getClass(), "port", 0);
        setIntField(term390, term390.getClass(), "localport", 0);
        setField(term382, term382.getClass(), "impl", term390);
        setBooleanField(term382, term382.getClass(), "oldImpl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.net.Socket");
        Object[] args = new Object[3];
        args[0] = term369;
        args[1] = "MxlszYVzRf";
        args[2] = term382;
        callMethod(klass, "checkClientTrusted", argTypes, term368, args);
    }

};


