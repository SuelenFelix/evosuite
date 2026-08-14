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
import java.lang.Integer;

public class TunnelBook_TunnelRecord_setSystemPort_13916309012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term247;

    public TunnelBook_TunnelRecord_setSystemPort_13916309012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term159, term159.getClass(), "name", "MjGYSRKTNF");
        setIntField(term159, term159.getClass(), "port", 391863371);
        setField(term159, term159.getClass(), "localIp", "hRNSzYYIrc");
        setField(term159, term159.getClass(), "username", "RMFIsYGgne");
        setField(term159, term159.getClass(), "password", "NRdvgJlhkX");
        setIntField(term159, term159.getClass(), "systemPort", -1922583790);
        setIntField(term159, term159.getClass(), "ttl", -616727354);
        setField(term159, term159.getClass(), "fqdn", "uuaPigETmJ");
        setField(term159, term159.getClass(), "edgefqdn", "MxlszYVzRf");
        setField(term159, term159.getClass(), "lfqdn", "LQFpaHEwXR");
        term247 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term247;
        callMethod(klass, "setSystemPort", argTypes, term159, args);
    }

};


