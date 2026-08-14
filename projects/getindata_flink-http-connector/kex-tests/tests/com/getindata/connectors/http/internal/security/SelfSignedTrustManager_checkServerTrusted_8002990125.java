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

public class SelfSignedTrustManager_checkServerTrusted_8002990125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;
     Object term465;
     Object term478;

    public SelfSignedTrustManager_checkServerTrusted_8002990125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager"));
        setField(term464, term464.getClass(), "delegate", null);
        term465 = (Object[]) newArray("java.security.cert.X509Certificate", 3);
        term478 = newInstance(Class.forName("java.net.Socket"));
        Object term483 = newInstance(Class.forName("java.lang.Object"));
        Object term486 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term495 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term478, term478.getClass(), "created", true);
        setBooleanField(term478, term478.getClass(), "bound", true);
        setBooleanField(term478, term478.getClass(), "connected", true);
        setBooleanField(term478, term478.getClass(), "closed", true);
        setField(term478, term478.getClass(), "closeLock", term483);
        setBooleanField(term478, term478.getClass(), "shutIn", true);
        setBooleanField(term478, term478.getClass(), "shutOut", false);
        setField(term486, term486.getClass(), "server", null);
        setIntField(term486, term486.getClass(), "serverPort", 1080);
        setField(term486, term486.getClass(), "external_address", null);
        setBooleanField(term486, term486.getClass(), "useV4", false);
        setField(term486, term486.getClass(), "cmdsock", null);
        setField(term486, term486.getClass(), "cmdIn", null);
        setField(term486, term486.getClass(), "cmdOut", null);
        setBooleanField(term486, term486.getClass(), "applicationSetProxy", false);
        setIntField(term486, term486.getClass(), "timeout", 0);
        setIntField(term486, term486.getClass(), "trafficClass", 0);
        setBooleanField(term486, term486.getClass(), "shut_rd", false);
        setBooleanField(term486, term486.getClass(), "shut_wr", false);
        setField(term486, term486.getClass(), "socketInputStream", null);
        setField(term486, term486.getClass(), "socketOutputStream", null);
        setIntField(term486, term486.getClass(), "fdUseCount", 0);
        setField(term486, term486.getClass(), "fdLock", term495);
        setBooleanField(term486, term486.getClass(), "closePending", false);
        setBooleanField(term486, term486.getClass(), "connectionReset", false);
        setBooleanField(term486, term486.getClass(), "stream", false);
        setField(term486, term486.getClass(), "socket", term478);
        setField(term486, term486.getClass(), "serverSocket", null);
        setField(term486, term486.getClass(), "fd", null);
        setField(term486, term486.getClass(), "address", null);
        setIntField(term486, term486.getClass(), "port", 0);
        setIntField(term486, term486.getClass(), "localport", 0);
        setField(term478, term478.getClass(), "impl", term486);
        setBooleanField(term478, term478.getClass(), "oldImpl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.net.Socket");
        Object[] args = new Object[3];
        args[0] = term465;
        args[1] = "aJlieCFVtF";
        args[2] = term478;
        callMethod(klass, "checkServerTrusted", argTypes, term464, args);
    }

};


