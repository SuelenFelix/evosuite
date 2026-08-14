package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScaleGuardKeyManager_chooseServerAlias_831383425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4552;
     Object term4577;
     Object term4578;

    public ScaleGuardKeyManager_chooseServerAlias_831383425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4552 = newInstance(Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager"));
        setField(term4552, term4552.getClass(), "keyManager", null);
        setField(term4552, term4552.getClass(), "defaultAlias", "SJiQaLvSKv");
        term4577 = (Object[]) newArray("java.security.Principal", 5);
        term4578 = newInstance(Class.forName("java.net.Socket"));
        Object term4583 = newInstance(Class.forName("java.lang.Object"));
        Object term4586 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term4595 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term4578, term4578.getClass(), "created", true);
        setBooleanField(term4578, term4578.getClass(), "bound", true);
        setBooleanField(term4578, term4578.getClass(), "connected", true);
        setBooleanField(term4578, term4578.getClass(), "closed", true);
        setField(term4578, term4578.getClass(), "closeLock", term4583);
        setBooleanField(term4578, term4578.getClass(), "shutIn", true);
        setBooleanField(term4578, term4578.getClass(), "shutOut", false);
        setField(term4586, term4586.getClass(), "server", null);
        setIntField(term4586, term4586.getClass(), "serverPort", 1080);
        setField(term4586, term4586.getClass(), "external_address", null);
        setBooleanField(term4586, term4586.getClass(), "useV4", false);
        setField(term4586, term4586.getClass(), "cmdsock", null);
        setField(term4586, term4586.getClass(), "cmdIn", null);
        setField(term4586, term4586.getClass(), "cmdOut", null);
        setBooleanField(term4586, term4586.getClass(), "applicationSetProxy", false);
        setIntField(term4586, term4586.getClass(), "timeout", 0);
        setIntField(term4586, term4586.getClass(), "trafficClass", 0);
        setBooleanField(term4586, term4586.getClass(), "shut_rd", false);
        setBooleanField(term4586, term4586.getClass(), "shut_wr", false);
        setField(term4586, term4586.getClass(), "socketInputStream", null);
        setField(term4586, term4586.getClass(), "socketOutputStream", null);
        setIntField(term4586, term4586.getClass(), "fdUseCount", 0);
        setField(term4586, term4586.getClass(), "fdLock", term4595);
        setBooleanField(term4586, term4586.getClass(), "closePending", false);
        setBooleanField(term4586, term4586.getClass(), "connectionReset", false);
        setBooleanField(term4586, term4586.getClass(), "stream", false);
        setField(term4586, term4586.getClass(), "socket", term4578);
        setField(term4586, term4586.getClass(), "serverSocket", null);
        setField(term4586, term4586.getClass(), "fd", null);
        setField(term4586, term4586.getClass(), "address", null);
        setIntField(term4586, term4586.getClass(), "port", 0);
        setIntField(term4586, term4586.getClass(), "localport", 0);
        setField(term4578, term4578.getClass(), "impl", term4586);
        setBooleanField(term4578, term4578.getClass(), "oldImpl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.security.Principal"), 0).getClass();
        argTypes[2] = Class.forName("java.net.Socket");
        Object[] args = new Object[3];
        args[0] = "OEXDRUKcFl";
        args[1] = term4577;
        args[2] = term4578;
        callMethod(klass, "chooseServerAlias", argTypes, term4552, args);
    }

};


