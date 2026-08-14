package com.zxl.dailypractice.networkProgramming;

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
import static com.zxl.dailypractice.networkProgramming.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Server_ServerThread_run_9062747941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public Server_ServerThread_run_9062747941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("com.zxl.dailypractice.networkProgramming.Server$ServerThread"));
        Object term888 = newInstance(Class.forName("java.net.Socket"));
        Object term893 = newInstance(Class.forName("java.lang.Object"));
        Object term896 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term905 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term888, term888.getClass(), "created", false);
        setBooleanField(term888, term888.getClass(), "bound", true);
        setBooleanField(term888, term888.getClass(), "connected", false);
        setBooleanField(term888, term888.getClass(), "closed", true);
        setField(term888, term888.getClass(), "closeLock", term893);
        setBooleanField(term888, term888.getClass(), "shutIn", false);
        setBooleanField(term888, term888.getClass(), "shutOut", true);
        setField(term896, term896.getClass(), "server", null);
        setIntField(term896, term896.getClass(), "serverPort", 1080);
        setField(term896, term896.getClass(), "external_address", null);
        setBooleanField(term896, term896.getClass(), "useV4", false);
        setField(term896, term896.getClass(), "cmdsock", null);
        setField(term896, term896.getClass(), "cmdIn", null);
        setField(term896, term896.getClass(), "cmdOut", null);
        setBooleanField(term896, term896.getClass(), "applicationSetProxy", false);
        setIntField(term896, term896.getClass(), "timeout", 0);
        setIntField(term896, term896.getClass(), "trafficClass", 0);
        setBooleanField(term896, term896.getClass(), "shut_rd", false);
        setBooleanField(term896, term896.getClass(), "shut_wr", false);
        setField(term896, term896.getClass(), "socketInputStream", null);
        setField(term896, term896.getClass(), "socketOutputStream", null);
        setIntField(term896, term896.getClass(), "fdUseCount", 0);
        setField(term896, term896.getClass(), "fdLock", term905);
        setBooleanField(term896, term896.getClass(), "closePending", false);
        setBooleanField(term896, term896.getClass(), "connectionReset", false);
        setBooleanField(term896, term896.getClass(), "stream", false);
        setField(term896, term896.getClass(), "socket", term888);
        setField(term896, term896.getClass(), "serverSocket", null);
        setField(term896, term896.getClass(), "fd", null);
        setField(term896, term896.getClass(), "address", null);
        setIntField(term896, term896.getClass(), "port", 0);
        setIntField(term896, term896.getClass(), "localport", 0);
        setField(term888, term888.getClass(), "impl", term896);
        setBooleanField(term888, term888.getClass(), "oldImpl", false);
        setField(term887, term887.getClass(), "client", term888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.networkProgramming.Server$ServerThread");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term887, args);
    }

};


