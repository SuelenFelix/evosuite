package com.scaleguard.server.ssh;

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
import static com.scaleguard.server.ssh.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshClientTunnel_PortForard_getPassword_2428190603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public SshClientTunnel_PortForard_getPassword_2428190603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard"));
        setField(term164, term164.getClass(), "username", "MjGYSRKTNF");
        setField(term164, term164.getClass(), "password", "hRNSzYYIrc");
        setIntField(term164, term164.getClass(), "remotePort", -1922583790);
        setField(term164, term164.getClass(), "remoteHost", "RMFIsYGgne");
        setIntField(term164, term164.getClass(), "localPort", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term164, args);
    }

};


