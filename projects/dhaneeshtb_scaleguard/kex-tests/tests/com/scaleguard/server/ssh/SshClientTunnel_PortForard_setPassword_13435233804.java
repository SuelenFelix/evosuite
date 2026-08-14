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

public class SshClientTunnel_PortForard_setPassword_13435233804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;

    public SshClientTunnel_PortForard_setPassword_13435233804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233 = newInstance(Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard"));
        setField(term233, term233.getClass(), "username", "NRdvgJlhkX");
        setField(term233, term233.getClass(), "password", "uuaPigETmJ");
        setIntField(term233, term233.getClass(), "remotePort", -1955890973);
        setField(term233, term233.getClass(), "remoteHost", "MxlszYVzRf");
        setIntField(term233, term233.getClass(), "localPort", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setPassword", argTypes, term233, args);
    }

};


