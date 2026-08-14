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

public class SshClientTunnel_PortForard_setUsername_28831711312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;

    public SshClientTunnel_PortForard_setUsername_28831711312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834 = newInstance(Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard"));
        setField(term834, term834.getClass(), "username", null);
        setField(term834, term834.getClass(), "password", null);
        setIntField(term834, term834.getClass(), "remotePort", 0);
        setField(term834, term834.getClass(), "remoteHost", null);
        setIntField(term834, term834.getClass(), "localPort", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term834, args);
    }

};


