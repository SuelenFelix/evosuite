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

public class Server_ServerThread_init_6248300470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term863;

    public Server_ServerThread_init_6248300470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term863 = newInstance(Class.forName("java.net.Socket"));
        Object term868 = newInstance(Class.forName("java.lang.Object"));
        Object term871 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term880 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term863, term863.getClass(), "created", false);
        setBooleanField(term863, term863.getClass(), "bound", false);
        setBooleanField(term863, term863.getClass(), "connected", false);
        setBooleanField(term863, term863.getClass(), "closed", false);
        setField(term863, term863.getClass(), "closeLock", term868);
        setBooleanField(term863, term863.getClass(), "shutIn", true);
        setBooleanField(term863, term863.getClass(), "shutOut", true);
        setField(term871, term871.getClass(), "server", null);
        setIntField(term871, term871.getClass(), "serverPort", 1080);
        setField(term871, term871.getClass(), "external_address", null);
        setBooleanField(term871, term871.getClass(), "useV4", false);
        setField(term871, term871.getClass(), "cmdsock", null);
        setField(term871, term871.getClass(), "cmdIn", null);
        setField(term871, term871.getClass(), "cmdOut", null);
        setBooleanField(term871, term871.getClass(), "applicationSetProxy", false);
        setIntField(term871, term871.getClass(), "timeout", 0);
        setIntField(term871, term871.getClass(), "trafficClass", 0);
        setBooleanField(term871, term871.getClass(), "shut_rd", false);
        setBooleanField(term871, term871.getClass(), "shut_wr", false);
        setField(term871, term871.getClass(), "socketInputStream", null);
        setField(term871, term871.getClass(), "socketOutputStream", null);
        setIntField(term871, term871.getClass(), "fdUseCount", 0);
        setField(term871, term871.getClass(), "fdLock", term880);
        setBooleanField(term871, term871.getClass(), "closePending", false);
        setBooleanField(term871, term871.getClass(), "connectionReset", false);
        setBooleanField(term871, term871.getClass(), "stream", false);
        setField(term871, term871.getClass(), "socket", term863);
        setField(term871, term871.getClass(), "serverSocket", null);
        setField(term871, term871.getClass(), "fd", null);
        setField(term871, term871.getClass(), "address", null);
        setIntField(term871, term871.getClass(), "port", 0);
        setIntField(term871, term871.getClass(), "localport", 0);
        setField(term863, term863.getClass(), "impl", term871);
        setBooleanField(term863, term863.getClass(), "oldImpl", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.networkProgramming.Server$ServerThread");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.Socket");
        Object[] args = new Object[1];
        args[0] = term863;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


