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

public class TunnelBook_TunnelRecord_getLfqdn_13232671075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657;

    public TunnelBook_TunnelRecord_getLfqdn_13232671075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term657, term657.getClass(), "name", "TEParAifyi");
        setIntField(term657, term657.getClass(), "port", -883034806);
        setField(term657, term657.getClass(), "localIp", "OWDIEULEFu");
        setField(term657, term657.getClass(), "username", "dWRymuLBtr");
        setField(term657, term657.getClass(), "password", "AijpHYOFuy");
        setIntField(term657, term657.getClass(), "systemPort", 1585847225);
        setIntField(term657, term657.getClass(), "ttl", 597278769);
        setField(term657, term657.getClass(), "fqdn", "SbAoxhfrkn");
        setField(term657, term657.getClass(), "edgefqdn", "kuTXqwMtDB");
        setField(term657, term657.getClass(), "lfqdn", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLfqdn", argTypes, term657, args);
    }

};


