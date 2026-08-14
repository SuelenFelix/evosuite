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

public class TunnelBook_TunnelRecord_setLfqdn_17469355236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;

    public TunnelBook_TunnelRecord_setLfqdn_17469355236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term815, term815.getClass(), "name", "xrwlQZdwCp");
        setIntField(term815, term815.getClass(), "port", -1685132342);
        setField(term815, term815.getClass(), "localIp", "IDCWpPLRkE");
        setField(term815, term815.getClass(), "username", "nyiiPDVjAc");
        setField(term815, term815.getClass(), "password", "aKnKipADSo");
        setIntField(term815, term815.getClass(), "systemPort", -1456670397);
        setIntField(term815, term815.getClass(), "ttl", 1622346318);
        setField(term815, term815.getClass(), "fqdn", "wSQxaModmm");
        setField(term815, term815.getClass(), "edgefqdn", "UlajhuVLaP");
        setField(term815, term815.getClass(), "lfqdn", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setLfqdn", argTypes, term815, args);
    }

};


