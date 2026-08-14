package com.scaleguard.server.ssh.tunnel;

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
import static com.scaleguard.server.ssh.tunnel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TunnelBook_TunnelRecord_setUsername_199057191416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2485;

    public TunnelBook_TunnelRecord_setUsername_199057191416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2485 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term2485, term2485.getClass(), "name", "eVpkWxjuki");
        setIntField(term2485, term2485.getClass(), "port", -1968847291);
        setField(term2485, term2485.getClass(), "localIp", "SJiQaLvSKv");
        setField(term2485, term2485.getClass(), "username", "OEXDRUKcFl");
        setField(term2485, term2485.getClass(), "password", "RYdKCNNMBR");
        setIntField(term2485, term2485.getClass(), "systemPort", 579005622);
        setIntField(term2485, term2485.getClass(), "ttl", -14890619);
        setField(term2485, term2485.getClass(), "fqdn", "yGtHPyvYiQ");
        setField(term2485, term2485.getClass(), "edgefqdn", "MvRIxilFMJ");
        setField(term2485, term2485.getClass(), "lfqdn", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XylxrMBraH";
        callMethod(klass, "setUsername", argTypes, term2485, args);
    }

};


